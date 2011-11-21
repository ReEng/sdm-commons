package de.fujaba.newwizard.diagrams;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
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
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelInstancePlugin;
import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.pages.DiagramContentsSelectionPage;
import de.fujaba.newwizard.diagrams.pages.DiagramElementSelectionPage;
import de.fujaba.newwizard.diagrams.pages.DiagramModelSelectionPage;
import de.fujaba.newwizard.diagrams.pages.NewExtendedFileCreationPage;
import de.fujaba.newwizard.ui.ResourceLocationProvider;

public abstract class FujabaDiagramNewWizard extends Wizard implements
		INewWizard, DiagramElementValidator {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected NewExtendedFileCreationPage diagramModelFilePage;

	/**
	 * Added to allow selection of an existing domain model file.
	 */
	protected DiagramModelSelectionPage domainModelSelectionPage;

	protected DiagramElementSelectionPage diagramElementSelectionPage;

	protected DiagramContentsSelectionPage diagramContentsSelectionPage;

	/**
	 * @generated
	 */
	protected Resource diagramResource;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	private TransactionalEditingDomain editingDomain;

	public FujabaDiagramNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();

	}

	/**
	 * Should return the ID of the generated Editor class.
	 * 
	 * @return the Editor-ID.
	 */
	protected abstract String getEditorId();

	/**
	 * Should return the MODEL_ID of the generated DiagramEditPart.
	 * 
	 * @return The Model-ID.
	 */
	protected abstract String getModelId();

	/**
	 * Should return the DIAGRAM_PREFERENCES_HINT of the generated Editor-Plugin
	 * class.
	 * 
	 * @return the PreferencesHint.
	 */
	protected abstract PreferencesHint getDiagramPreferencesHint();

	/**
	 * Should return the file extension to use in the NewWizard.
	 * 
	 * @return the file extension.
	 */
	protected abstract String getDiagramFileExtension();

	/**
	 * Return the Diagram Element, or null if the ModelElementCategory should be
	 * used as the Diagram Element.
	 */
	protected abstract ExtendableElement createDiagramElement();

	protected abstract String getModelElementCategoryKey();

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagramResource;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

		setNeedsProgressMonitor(true);
		setWindowTitle(getWindowTitle());
	}

	@Override
	public void addPages() {
		/*
		 * Create Pages
		 */

		// 1) Create Diagram Model File
		diagramModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", getSelection(), getDiagramFileExtension()); //$NON-NLS-1$

		diagramModelFilePage
				.setTitle(Messages.CreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.CreationWizard_DiagramModelFilePageDescription);

		// 2) Select Domain Model
		ResourceLocationProvider rloc = new ResourceLocationProvider(
				getSelection());

		domainModelSelectionPage = new DiagramModelSelectionPage(
				"domain", rloc, editingDomain.getResourceSet(), "fujaba", getModelElementCategoryKey()); //$NON-NLS-1$ //$NON-NLS-2$

		domainModelSelectionPage.setTitle("Select Domain Model");
		domainModelSelectionPage.setDescription("Load domain model.");
		domainModelSelectionPage.setModelRequired(true);

		// 3) Select Diagram Element
		diagramElementSelectionPage = new DiagramElementSelectionPage(
				"diagramResource element", this, getModelElementCategoryKey(),
				domainModelSelectionPage);

		diagramElementSelectionPage.setTitle("Select Diagram Element");

		diagramElementSelectionPage
				.setDescription("Select existing Diagram Element.");

		// 4) Select existing Diagram contents
		diagramContentsSelectionPage = new DiagramContentsSelectionPage(
				"diagramResource contents", this, diagramElementSelectionPage);

		diagramContentsSelectionPage.setTitle("Select Diagram contents");
		diagramContentsSelectionPage
				.setDescription("Select initial contents for the Diagram.");

		/*
		 * Add pages
		 */
		addPage(diagramModelFilePage);
		addPage(domainModelSelectionPage);
		if (!isModelElementCategoryDiagramElement()) {
			addPage(diagramElementSelectionPage);
		} else {
			addPage(diagramContentsSelectionPage);
		}
	}

	protected abstract boolean isModelElementCategoryDiagramElement();

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

				diagramResource = createDiagram(diagramModelFilePage.getURI(),
						domainModelSelectionPage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor()
						&& diagramResource != null) {
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
								"Error creating diagramResource", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagramResource != null;
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @generated
	 */
	public Resource createDiagram(URI diagramURI, final URI modelURI,
			IProgressMonitor progressMonitor) {

		final TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.DiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final String diagramName = diagramURI.lastSegment();
		final Resource modelResource = editingDomain.getResourceSet()
				.getResource(modelURI, true);

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.DiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				ModelElementCategory elementCategory = null;

				EObject element = diagramElementSelectionPage
						.getSelectedElement();
				Collection<EObject> contents = diagramContentsSelectionPage
						.getSelectedElements();

				if (!(element instanceof ExtendableElement)) {
					List<?> rootElements = modelResource.getContents();
					if (!rootElements.isEmpty()) {
						Object rootElement = rootElements.get(0);
						if (rootElement instanceof RootNode) {
							RootNode rootNode = (RootNode) rootElement;
							String categoryKey = getModelElementCategoryKey();
							elementCategory = getModelElementCategory(rootNode,
									categoryKey);

							EObject newDiagramElement = createDiagramElement();

							if (newDiagramElement != null) {
								elementCategory.getModelElements().add(
										(ExtendableElement) newDiagramElement);
								element = newDiagramElement;
							}
						}
					}
				}

				if (element == null) {
					element = elementCategory;
				}

				// Create diagramResource
				Diagram diagram = ViewService.createDiagram(element,
						getModelId(), getDiagramPreferencesHint());

				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
				}

				CreateViewRequest request = getCreatePersistedViewsRequest(
						diagram, contents);
				Command cmd = getCreateViewCommand(request, diagram);
				if (cmd != null && cmd.canExecute()) {
					SetViewMutabilityCommand.makeMutable(
							new EObjectAdapter(diagram)).execute();
					executeCreateViewsCommand(cmd, diagram);
				}

				try {
					Map<?, ?> saveOptions = DiagramEditorUtil.getSaveOptions();
					modelResource.save(saveOptions);
					diagramResource.save(saveOptions);
				} catch (IOException e) {
					FujabaNewwizardPlugin
							.getDefault()
							.logError(
									"Unable to store model and diagramResource resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
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

	protected ModelElementCategory getModelElementCategory(RootNode rootNode,
			String categoryKey) {
		ModelElementCategory result = null;
		for (ModelElementCategory category : rootNode.getCategories()) {
			if (category.getKey().equals(categoryKey)
			/*
			 * && category .isValidElement(diagramElement)
			 */) {
				result = category;
				break;
			}
		}

		if (result == null) {
			result = ModelinstanceFactory.eINSTANCE
					.createModelElementCategory();
			String categoryName = null;
			ModelElementCategoryRegistry registry = ModelInstancePlugin.getInstance().getModelElementCategoryRegistry();
			if (registry != null) {
				categoryName = registry.getCategoryName(categoryKey);
			}
			result.setName(categoryName);
			result.setKey(categoryKey);
			rootNode.getCategories().add(result);
		}
		return result;
	}

	// Copied from CanonicalEditPolicy.executeCommand()
	protected void executeCreateViewsCommand(final Command cmd, Diagram diagram) {
		Map<String, Boolean> options = null;

		// If still activating... set unprotected mode
		options = Collections.singletonMap(Transaction.OPTION_UNPROTECTED,
				Boolean.TRUE);

		AbstractEMFOperation operation = new AbstractEMFOperation(
				getEditingDomain(diagram), StringStatics.BLANK, options) {

			protected IStatus doExecute(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				cmd.execute();

				return Status.OK_STATUS;
			}
		};
		try {
			operation.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create initial views.", e); //$NON-NLS-1$
		}
	}

	// Copied from CreationEditPolicy.getCreateCommand()
	protected Command getCreateViewCommand(CreateViewRequest request,
			Diagram diagram) {

		TransactionalEditingDomain editingDomain = getEditingDomain(diagram);
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
				editingDomain, DiagramUIMessages.AddCommand_Label);

		Iterator<?> descriptors = request.getViewDescriptors().iterator();

		while (descriptors.hasNext()) {
			CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor) descriptors
					.next();

			CreateCommand createCommand = new CreateCommand(editingDomain,
					descriptor, diagram);

			cc.compose(createCommand);
		}
		return new ICommandProxy(cc.reduce());

	}

	protected TransactionalEditingDomain getEditingDomain(Diagram diagram) {
		return TransactionUtil.getEditingDomain(diagram);
	}

	protected abstract CreateViewRequest getCreatePersistedViewsRequest(
			Diagram diagram, Collection<EObject> elements);

	@Override
	public boolean isValidDiagramElement(EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(adapter,
				getModelId(), getDiagramPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}

	@Override
	public boolean isValidTopLevelNodeElement(EObject diagramElement,
			EObject topLevelNodeElement) {
		Diagram diagram = ViewService.createDiagram(diagramElement,
				getModelId(), getDiagramPreferencesHint());

		IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
		IOperation operation = new CreateNodeViewOperation(adapter, diagram,
				null, 0, false, getDiagramPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}
}
