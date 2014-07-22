package de.fujaba.newwizard.commands;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelInstancePlugin;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.IFujabaEditor;
import de.fujaba.newwizard.diagrams.IDiagramInformation;

/**
 * Creates a new empty Diagram.
 * 
 * @author bingo
 * 
 */
// TODO: maybe we can reuse CreateDiagramCommand for this special case
public class CreateEmptyDiagramCommand extends AbstractTransactionalCommand {
	private Resource diagramResource;
	private EObject diagramRoot;
	private IDiagramInformation diagramInformation;
	private IFujabaEditor fujabaEditor;
	private String editorId;
	private EObject diagramElement;
	private PreferencesHint preferencesHint;

	
	@SuppressWarnings("rawtypes")
	public CreateEmptyDiagramCommand(TransactionalEditingDomain domain,
			String label, List affectedFiles, Resource diagramResource,
			EObject diagramRoot, IDiagramInformation diagramInformation,
			String editorId) {
		super(domain, label, affectedFiles);
		this.diagramResource = diagramResource;
		this.diagramRoot = diagramRoot;
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
					System.out.println("Exception in Fujaba Editor:" + editorId
							+ ":");
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

		ModelElementCategory category = null;
		if (diagramRoot instanceof RootNode) {
			RootNode rootNode = (RootNode) diagramRoot;
			category = ModelInstancePlugin
					.getInstance()
					.getModelElementCategoryRegistry()
					.getModelElementCategory(rootNode,
							diagramInformation.getModelElementCategoryKey());

		} else {
			return CommandResult
					.newErrorCommandResult("Model file loading fail");
		}

		if (diagramElement != null) {
			category.getModelElements().add((ExtendableElement) diagramElement);
		} else {
			diagramElement = category;
		}

		Diagram diagram = ViewService.createDiagram(diagramElement,
				diagramInformation.getModelId(), preferencesHint);
		if (diagram == null) {
			return CommandResult
					.newErrorCommandResult("Diagram could not be created.");
		}

		diagramResource.getContents().add(diagram);
		return CommandResult.newOKCommandResult();
	}
}
