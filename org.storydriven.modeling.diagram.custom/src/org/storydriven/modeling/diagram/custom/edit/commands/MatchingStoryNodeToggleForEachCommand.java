package org.storydriven.modeling.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;

public class MatchingStoryNodeToggleForEachCommand extends AbstractActionDelegate implements
		IObjectActionDelegate {

	MatchingStoryNode aMatchingNode;
	View theModel;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		MatchingStoryNodeEditPart storyNodeEditPart = ((MatchingStoryNodeEditPart) getStructuredSelection().getFirstElement());
		aMatchingNode = (MatchingStoryNode) ((View) storyNodeEditPart.getModel()).getElement();
		theModel = ((View) storyNodeEditPart.getModel());
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(storyNodeEditPart.getEditingDomain(),
					"Toggle MatchingStoryNodes for each attribute", null) {
			
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				aMatchingNode.setForEach(!aMatchingNode.isForEach());
				
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
