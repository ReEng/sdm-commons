package org.storydriven.storydiagrams.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;

public class ActivityFinalNodeToggleFlowCommand extends AbstractActionDelegate implements
		IObjectActionDelegate {

	ActivityFinalNode aActivityFinalNode;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		ActivityFinalNodeEditPart ActivityFinalNodeEditPart = ((ActivityFinalNodeEditPart) getStructuredSelection().getFirstElement());
		aActivityFinalNode = (ActivityFinalNode) ((View) ActivityFinalNodeEditPart.getModel()).getElement();
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(ActivityFinalNodeEditPart.getEditingDomain(),
					"Toggle ActivityFinalNode FlowStopOnly Attribute", null) {
			
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				// FIXME: not applicable anymore (is own class instead of attribute)
				//aActivityFinalNode.setFlowStopOnly(!aActivityFinalNode.isFlowStopOnly());
				
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
