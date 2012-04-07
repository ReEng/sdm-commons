package org.storydriven.storydiagrams.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.expressions.EditExpressionDialog;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;


public class SetActivityEdgeGuardTypeAction extends AbstractActionDelegate implements IObjectActionDelegate
{

	ActivityEdge			activityEdge;

	ActivityEdgeEditPart	activityEdgeEditPart;

	public void selectionChanged(IAction action, ISelection selection)
	{
		activityEdgeEditPart = null;
		activityEdge = null;
		if (selection instanceof IStructuredSelection)
		{
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof ActivityEdgeEditPart)
			{
				activityEdgeEditPart = (ActivityEdgeEditPart) structuredSelection.getFirstElement();
				activityEdge = (ActivityEdge) activityEdgeEditPart.getPrimaryView().getElement();
			}
		}

		if (activityEdge != null)
		{
			if (SdmUtility.Guard2String(activityEdge.getGuard()).equals(action.getText()))
			{
				action.setChecked(true);
			}
			else
			{
				action.setChecked(false);
			}
		}
	}

	@Override
	protected void doRun(IProgressMonitor progressMonitor)
	{

		final String actEdgeGuardValue = getAction().getText();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(activityEdgeEditPart.getEditingDomain(), 
																				"Set Guard",
																				null)
		{
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
			{
				EdgeGuard newGuard = SdmUtility.String2Guard(actEdgeGuardValue);

				if (newGuard != activityEdge.getGuard())
				{
					activityEdge.setGuard(newGuard);

					if (activityEdge.getGuard() == EdgeGuard.BOOL)
					{
						EditExpressionDialog editExpressionDialog = new EditExpressionDialog(null);

						editExpressionDialog.setActivity(activityEdge.getOwningActivity());
						editExpressionDialog.setExpectedReturnType(EcorePackage.eINSTANCE.getEBoolean());
						editExpressionDialog.setExpression(this.getExpression());
						editExpressionDialog.setChangeAttributeCommand(this.getChangeAttributeCommand(), activityEdgeEditPart.getEditingDomain());

						if (editExpressionDialog.open() == Window.OK)
						{
							activityEdge.setGuardExpression(editExpressionDialog.getExpression());
						}
						else
						{
							activityEdge.setGuard(EdgeGuard.NONE);
						}
					}
					else
					{
						activityEdge.setGuardExpression(null);
					}
				}

				return CommandResult.newOKCommandResult();
			}

			private Command getChangeAttributeCommand() {
				return new SetCommand(activityEdgeEditPart.getEditingDomain(), 
						activityEdge, 
						activityEdge.eClass().getEStructuralFeature("guardExpression"),
						null);
			}

			private TextualExpression getExpression() {
				TextualExpression e = (TextualExpression) activityEdge.getGuardExpression();
				if(e == null) {
					e = ExpressionsFactory.eINSTANCE.createTextualExpression();
					activityEdgeEditPart.getEditingDomain()
								.getCommandStack().execute(new SetCommand(activityEdgeEditPart.getEditingDomain(), 
																		activityEdge, 
																		activityEdge.eClass().getEStructuralFeature("guardExpression"),
																		e));
				}
				return e;
			}

		};

		try
		{
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
		}
		catch (ExecutionException ee)
		{
			ee.printStackTrace();
		}

	}
}
