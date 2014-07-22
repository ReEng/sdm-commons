package de.fujaba.newwizard.diagrams;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.commands.CreateDiagramCommand;
import de.fujaba.newwizard.diagrams.pages.DiagramContentsSelectionPage;
import de.fujaba.newwizard.diagrams.pages.DiagramElementSelectionPage;
import de.fujaba.newwizard.diagrams.pages.DiagramModelSelectionPage;
import de.fujaba.newwizard.diagrams.pages.NewExtendedFileCreationPage;
import de.fujaba.newwizard.ui.ResourceLocationProvider;

/**
 * A fujaba diagram new-wizard suitable for usage by editors; it has to supply
 * diagram information that identify the Diagram to create.
 * 
 * @author bingo
 * 
 */
public abstract class AbstractFujabaDiagramNewWizard extends Wizard implements
		INewWizard, IEditorIdentifier {

	/**
	 * Lazily created DiagramInformation
	 */
	private IDiagramInformation diagramInformation;

	private IWorkbench workbench;

	protected IStructuredSelection selection;

	protected NewExtendedFileCreationPage diagramModelFilePage;

	protected DiagramModelSelectionPage domainModelSelectionPage;

	protected DiagramElementSelectionPage diagramElementSelectionPage;

	protected DiagramContentsSelectionPage diagramContentsSelectionPage;


	private TransactionalEditingDomain editingDomain;

	/**
	 * Constructs this AbstractFujabaDiagramNewWizard.
	 */
	public AbstractFujabaDiagramNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

		setNeedsProgressMonitor(true);
		setWindowTitle(getWindowTitle());
	}

	/**
	 * Gets and lazily creates the DiagramInformation by reading the extension
	 * point.
	 * 
	 * @return The Diagram Information for this wizard.
	 */
	public IDiagramInformation getDiagramInformation() {
		if (diagramInformation == null) {
			diagramInformation = FujabaNewwizardPlugin.getDefault()
					.getDiagramInformation(getEditorId());
		}
		return diagramInformation;
	}

	@Override
	public void addPages() {

		// Try to read the diagram information (it might be that it is not yet
		// known)
		IDiagramInformation diagramInformation = getDiagramInformation();

		// Create Diagram Model File
		diagramModelFilePage = createDiagramModelFilePage();
		addPage(diagramModelFilePage);

		// Select Domain Model
		domainModelSelectionPage = createDomainModelSelectionPage(diagramInformation);
		addPage(domainModelSelectionPage);

		// Select Diagram Element
		diagramElementSelectionPage = createDiagramElementSelectionPage(diagramInformation);
		if (diagramInformation != null
				&& !diagramInformation.shouldUseModelElementCategory()) {
			addPage(diagramElementSelectionPage);
			domainModelSelectionPage.addResourceChangedListener(diagramElementSelectionPage);
		}

		// Select existing Diagram contents
		diagramContentsSelectionPage = createDiagramContentsSelectionPage(diagramInformation);
		if (diagramInformation == null
				|| diagramInformation.shouldUseModelElementCategory()) {
			addPage(diagramContentsSelectionPage);
			domainModelSelectionPage.addResourceChangedListener(diagramContentsSelectionPage);
		}
		
		
	}

	protected NewExtendedFileCreationPage createDiagramModelFilePage() {
		NewExtendedFileCreationPage diagramModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", getSelection(), getExtension()); //$NON-NLS-1$

		diagramModelFilePage
				.setTitle(Messages.CreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.CreationWizard_DiagramModelFilePageDescription);

		return diagramModelFilePage;
	}

	protected DiagramModelSelectionPage createDomainModelSelectionPage(
			IDiagramInformation diagramInformation) {
		ResourceLocationProvider rloc = new ResourceLocationProvider(selection);

		DiagramModelSelectionPage domainModelSelectionPage = new DiagramModelSelectionPage(
				"domain", rloc, editingDomain.getResourceSet(), "fujaba", diagramInformation); //$NON-NLS-1$ //$NON-NLS-2$

		domainModelSelectionPage.setTitle("Select Domain Model");
		domainModelSelectionPage.setDescription("Load domain model.");
		domainModelSelectionPage.setModelRequired(true);


		return domainModelSelectionPage;
	}

	
	public Resource getModelResource() {
		if (domainModelSelectionPage != null) {
			return domainModelSelectionPage.getResource();
		}
		return null;
	}

	protected DiagramElementSelectionPage createDiagramElementSelectionPage(
			IDiagramInformation diagramInformation) {
		DiagramElementSelectionPage diagramElementSelectionPage = new DiagramElementSelectionPage(
				"diagramResource element", diagramInformation);

		diagramElementSelectionPage.setTitle("Select Diagram Element");

		diagramElementSelectionPage
				.setDescription("Select existing Diagram Element.");

		return diagramElementSelectionPage;
	}

	protected DiagramContentsSelectionPage createDiagramContentsSelectionPage(
			IDiagramInformation diagramInformation) {
		DiagramContentsSelectionPage diagramContentsSelectionPage = new DiagramContentsSelectionPage(
				"diagramResource contents", diagramInformation);

		diagramContentsSelectionPage.setTitle("Select Diagram contents");
		diagramContentsSelectionPage
				.setDescription("Select initial contents for the Diagram.");

		return diagramContentsSelectionPage;
	}

	private Resource diagramResource;
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				performModification(monitor);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.CreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				FujabaNewwizardPlugin
						.getDefault()
						.logError(
								"Error creating resources", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return true;
	}

	protected void performModification(IProgressMonitor monitor) {
		diagramResource = createDiagram(diagramModelFilePage.getURI(),
				domainModelSelectionPage.getURI(), monitor);
		if (diagramResource != null) {
			try {
				DiagramEditorUtil.openDiagram(diagramResource,
						getEditorId());
			} catch (PartInitException e) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.CreationWizardOpenEditorError, null,
						e.getStatus());
			}
		}
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 */
	public Resource createDiagram(URI diagramURI, final URI modelURI,
			IProgressMonitor progressMonitor) {

		progressMonitor.beginTask(
				Messages.DiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final String diagramName = diagramURI.lastSegment();
		final Resource modelResource = editingDomain.getResourceSet()
				.getResource(modelURI, true);

		AbstractTransactionalCommand command = new CreateDiagramCommand(
				editingDomain,
				Messages.DiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST, modelResource, diagramResource,
				getSelectedElement(), getSelectedContents(), diagramName, getDiagramInformation(),
				getEditorId());
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagramResource", e); //$NON-NLS-1$
		}
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(modelResource));
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(diagramResource));
		return diagramResource;
	}

	protected String getExtension() {
		IDiagramInformation diagramInformation = getDiagramInformation();
		if (diagramInformation != null) {
			return diagramInformation.getFileExtension();
		}
		return null;
	}

	public Collection<EObject> getSelectedContents() {
		Collection<EObject> contents = new ArrayList<EObject>();
		if (diagramContentsSelectionPage != null) {
			contents = diagramContentsSelectionPage.getSelectedElements();
		}
		return contents;
	}
	
	public EObject getSelectedElement() {
		EObject selectedElement = null;
		if (diagramElementSelectionPage != null) {
			selectedElement = diagramElementSelectionPage.getSelectedElement();
		}
		if (selectedElement == null) {
			selectedElement = diagramContentsSelectionPage.getResourceRoot(getModelResource());
		}
		return selectedElement;
	}


}
