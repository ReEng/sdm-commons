package de.fujaba.newwizard.commands;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelInstancePlugin;
import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.IFujabaEditor;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;
import de.fujaba.newwizard.diagrams.IDiagramInformation;


/**
 * Creates a new Diagram with initial contents.
 * 
 * @author bingo
 *
 */
public class CreateDiagramCommand extends AbstractTransactionalCommand {

	private Resource modelResource;
	private Resource diagramResource;
	private EObject element;
	private Collection<EObject> contents;
	private String diagramName;
	private String editorId;
	private IDiagramInformation diagramInformation;
	private IFujabaEditor fujabaEditor;
	private EObject diagramElement;
	private PreferencesHint preferencesHint;

	@SuppressWarnings("rawtypes")
	public CreateDiagramCommand(TransactionalEditingDomain domain,
			String label, List affectedFiles, Resource modelResource,
			Resource diagramResource, EObject element,
			Collection<EObject> contents, String diagramName,
			IDiagramInformation diagramInformation, String editorId) {
		super(domain, label, affectedFiles);
		this.modelResource = modelResource;
		this.diagramResource = diagramResource;
		this.element = element;
		this.contents = contents;
		this.diagramName = diagramName;
		this.diagramInformation = diagramInformation;
		this.editorId = editorId;
	}

	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		if (diagramInformation != null) {
			fujabaEditor = diagramInformation.getFujabaEditor();
		}
		if (fujabaEditor != null) {
			// Safely ask the interface provided by extension
			ISafeRunnable runnable = new ISafeRunnable() {
				@Override
				public void handleException(Throwable exception) {
					System.out.println("Exception in Fujaba Editor:"
							+ editorId + ":");
					exception.printStackTrace();
				}

				@Override
				public void run() throws Exception {
					diagramElement = fujabaEditor.createDiagramElement();
					preferencesHint = fujabaEditor.getPreferencesHint();
				}
			};
			SafeRunner.run(runnable);
		}
		
		// TODO: We do no null checks for information that comes from inside DiagramInformation...
		
		ModelElementCategory elementCategory = null;

		if (!(element instanceof ExtendableElement)) {
			List<?> rootElements = modelResource.getContents();
			if (!rootElements.isEmpty()) {
				Object rootElement = rootElements.get(0);
				if (rootElement instanceof RootNode) {
					RootNode rootNode = (RootNode) rootElement;
					elementCategory = getModelElementCategory(rootNode,
							diagramInformation.getModelElementCategoryKey());

					if (diagramElement != null) {
						elementCategory.getModelElements().add(
								(ExtendableElement) diagramElement);
						element = diagramElement;
					}
				}
			}
		}

		if (element == null) {
			element = elementCategory;
		}

		// Create diagramResource
		Diagram diagram = ViewService.createDiagram(element, diagramInformation.getModelId(),
				preferencesHint);

		if (diagram != null) {
			diagramResource.getContents().add(diagram);
			diagram.setName(diagramName);
		}

		CreateViewRequest request = fujabaEditor
				.getCreatePersistedViewsRequest(diagram, contents);
		Command cmd = getCreateViewCommand(request, diagram);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(diagram))
					.execute();
			executeCreateViewsCommand(cmd, diagram);
		}

		try {
			Map<?, ?> saveOptions = DiagramEditorUtil.getSaveOptions();
			modelResource.save(saveOptions);
			diagramResource.save(saveOptions);
		} catch (IOException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to store model and diagramResource resources", e); //$NON-NLS-1$
		}
		return CommandResult.newOKCommandResult();
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
			ModelElementCategoryRegistry registry = ModelInstancePlugin
					.getInstance().getModelElementCategoryRegistry();
			if (registry != null) {
				categoryName = registry.getCategoryName(categoryKey);
			}
			result.setName(categoryName);
			result.setKey(categoryKey);
			rootNode.getCategories().add(result);
		}
		return result;
	}

	// Copied from CreationEditPolicy.getCreateCommand()
	protected Command getCreateViewCommand(CreateViewRequest request,
			Diagram diagram) {

		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(diagram);
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

	protected void executeCreateViewsCommand(final Command cmd, Diagram diagram) {
		Map<String, Boolean> options = null;

		// If still activating... set unprotected mode
		options = Collections.singletonMap(Transaction.OPTION_UNPROTECTED,
				Boolean.TRUE);

		AbstractEMFOperation operation = new AbstractEMFOperation(
				TransactionUtil.getEditingDomain(diagram), StringStatics.BLANK,
				options) {

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

}
