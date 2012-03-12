package de.fujaba.newwizard.diagrams;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.fujaba.modelinstance.ModelinstancePackage;
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
		INewWizard {

	private IDiagramElementValidator diagramElementValidator = new IDiagramElementValidator() {
		@Override
		public boolean isValidDiagramElement(EObject diagramElement) {
			IAdaptable adapter = new EObjectAdapter(diagramElement);
			IOperation operation = new CreateDiagramViewOperation(
					adapter,
					getDiagramInformation().getModelId(),
					new PreferencesHint(getDiagramInformation().getPreferencesHint()));
			return ViewService.getInstance().provides(operation);
		}


		@Override
		public boolean isValidTopLevelNodeElement(EObject diagramElement,
				EObject topLevelNodeElement) {
			PreferencesHint preferencesHint = new PreferencesHint(getDiagramInformation().getPreferencesHint());
			Diagram diagram = ViewService
					.createDiagram(
							diagramElement,
							getDiagramInformation().getModelId(),
							preferencesHint);
			IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
			IOperation operation = new CreateNodeViewOperation(adapter, diagram,
					null, 0, false, preferencesHint);
			return ViewService.getInstance().provides(operation);
		}
	};

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

	private Resource diagramResource;

	/**
	 * Constructs this AbstractFujabaDiagramNewWizard.
	 */
	public AbstractFujabaDiagramNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	}

	/**
	 * Returns the AdapterFactory to be used by the ContentProvider and
	 * LabelProvider.
	 * 
	 * @return the AdapterFactory to be used.
	 */
	public abstract AdapterFactory getItemProvidersAdapterFactory();

	/**
	 * Should return the ID of the generated Editor class.
	 * 
	 * @return the Editor-ID.
	 */
	public abstract String getEditorId();

	/**
	 * Returns the workbench.
	 * 
	 * @return the workbench
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	@Override
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

		// Find out, if the editor uses the ModelElementCategory as diagram
		// element.
		boolean usesModelElementCategory = ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY
				.isSuperTypeOf(getDiagramInformation().getDiagramElementClass());

		// Create Diagram Model File
		diagramModelFilePage = createDiagramModelFilePage();
		addPage(diagramModelFilePage);

		// Select Domain Model
		domainModelSelectionPage = createDomainModelSelectionPage();
		addPage(domainModelSelectionPage);

		// Select Diagram Element
		diagramElementSelectionPage = createDiagramElementSelectionPage();
		if (diagramInformation != null && !usesModelElementCategory) {
			addPage(diagramElementSelectionPage);
			domainModelSelectionPage
					.addResourceChangedListener(diagramElementSelectionPage);
		}

		// Select existing Diagram contents
		diagramContentsSelectionPage = createDiagramContentsSelectionPage();
		if (diagramInformation == null || usesModelElementCategory) {
			addPage(diagramContentsSelectionPage);
			domainModelSelectionPage
					.addResourceChangedListener(diagramContentsSelectionPage);
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

	protected DiagramModelSelectionPage createDomainModelSelectionPage() {
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

	protected DiagramElementSelectionPage createDiagramElementSelectionPage() {
		DiagramElementSelectionPage diagramElementSelectionPage = new DiagramElementSelectionPage(
				"diagramResource element", diagramElementValidator,
				getDiagramInformation().getModelElementCategoryKey(),
				getItemProvidersAdapterFactory());

		diagramElementSelectionPage.setTitle("Select Diagram Element");

		diagramElementSelectionPage
				.setDescription("Select existing Diagram Element.");

		return diagramElementSelectionPage;
	}



	protected DiagramContentsSelectionPage createDiagramContentsSelectionPage() {
		DiagramContentsSelectionPage diagramContentsSelectionPage = new DiagramContentsSelectionPage(
				"diagramResource contents", diagramElementValidator,
				getDiagramInformation().getModelElementCategoryKey(),
				getItemProvidersAdapterFactory());

		diagramContentsSelectionPage.setTitle("Select Diagram contents");
		diagramContentsSelectionPage
				.setDescription("Select initial contents for the Diagram.");

		return diagramContentsSelectionPage;
	}


	@Override
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			@Override
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
				FujabaNewwizardPlugin.getDefault().logError(
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
				DiagramEditorUtil.openDiagram(diagramResource, getEditorId());
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
				getSelectedElement(), getSelectedContents(), diagramName,
				getDiagramInformation());
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
			selectedElement = diagramContentsSelectionPage
					.getResourceRoot(getModelResource());
		}
		return selectedElement;
	}

}
