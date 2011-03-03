package org.storydriven.modeling.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.diagram.custom.edit.parts.CustomSDMEditPartFactory;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.SDMEditPartFactory;
import org.storydriven.modeling.patterns.MatchingPattern;

public class ModifyingStoryNodeToggleCommand extends AbstractActionDelegate implements
		IObjectActionDelegate {

	ModifyingStoryNode aModifyingNode;
	View theModel;
	EditPart wrappingEditPart;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		ModifyingStoryNodeEditPart storyNodeEditPart = ((ModifyingStoryNodeEditPart) getStructuredSelection().getFirstElement());
		aModifyingNode = (ModifyingStoryNode) ((View) storyNodeEditPart.getModel()).getElement();
		theModel = ((View) storyNodeEditPart.getModel());
		wrappingEditPart = storyNodeEditPart.getTopGraphicEditPart().getParent();
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(storyNodeEditPart.getEditingDomain(),
					"Toggle StoryNode to Matching", null) {
			
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				MatchingStoryNode aMatchingNode = ActivitiesFactory.eINSTANCE.createMatchingStoryNode();
				
				
//				CreateViewRequest createRequest = CreateViewRequestFactory.getCreateShapeRequest(aMatchingNode.eClass(), getDiagramPreferencesHint());
//
//				Command command = container.getCommand(createRequest);
//
//				if (command == null || !(command.canExecute())) {
//					// Action enablement criteria expected to prevent this
//					throw new IllegalArgumentException("Command for '" //$NON-NLS-1$
//							+ actionId + "' is not executable."); 
//					//$NON-NLS-1$
//				}
//
//				// Create the new element
//				DiagramCommandStack commandStack = container.getDiagramEditDomain()
//				.getDiagramCommandStack();
//				commandStack.execute(command);

				
				
				
//				((View) storyNodeEditPart.getModel()).setElement((EObject) ((MatchingStoryNode) ((StoryNode) aStoryNode)));
				
				aMatchingNode.setName(aModifyingNode.getName());
				aMatchingNode.setForEach(aModifyingNode.isForEach());
				aMatchingNode.setOwnedPattern((MatchingPattern) aModifyingNode.getOwnedRule());
				aMatchingNode.setOwningActivity(aModifyingNode.getOwningActivity());
				aMatchingNode.setOwningActivityNode(aModifyingNode.getOwningActivityNode());
				
				SDMEditPartFactory anEditPartFactory = new CustomSDMEditPartFactory();
				MatchingStoryNodeEditPart aMatchingEditPart = (MatchingStoryNodeEditPart) anEditPartFactory.createEditPart(wrappingEditPart, theModel);
				
				EList<ActivityNode> activityNodes = aModifyingNode.getOwningActivity().getOwnedActivityNodes();
				activityNodes.remove(aModifyingNode);
				activityNodes.add(aMatchingNode);
				aMatchingNode.getOwningActivity().eSet(ActivitiesPackage.eINSTANCE.getActivity_OwnedActivityNode(), activityNodes);
				
				theModel.setElement(aMatchingNode);
				//				for( EStructuralFeature aFeature : ( aModifyingNode.eClass().getEAllStructuralFeatures()) ) {	
				//					aMatchingNode.eSet(aFeature, (aModifyingNode.eGet(aFeature)));
				//				}
				//				MatchingStoryNode aMatchingNode = ActivitiesFactory.eINSTANCE.createMatchingStoryNode();
				
				
				
				return CommandResult.newOKCommandResult();
			}
		};
		
		try
		{
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
		}
		catch (ExecutionException ee) {
			ee.printStackTrace();
		}
	}

}
