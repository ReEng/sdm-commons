package org.storydriven.storydiagrams.diagram.custom;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
// TODO abstract all those Abstract Action Delegates
public class EditActivityFinalNodeReturnExpressionAction extends AbstractActionDelegate implements IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	ChooseActivityOutParameterDialog parameterDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		
		parameterDialog = new ChooseActivityOutParameterDialog(null);
		parameterDialog.setParameterList(this.getActivity().getOutParameters());
		parameterDialog.setChangeCommandReceiver(this.getChangeCommandReceiver());
		parameterDialog.setNode(this.getModel());
		parameterDialog.setActivity(this.getActivity());
		parameterDialog.setEditPart(this.getEditPart());
		
		parameterDialog.open();
	}

	protected Activity getActivity() {
		ActivityFinalNodeEditPart ep = this.getEditPart();
		return (Activity) ((View) ((GraphicalEditPart) ep.getRoot().getChildren().get(0)).getModel()).getElement();
	}
	
	protected ActivityFinalNodeEditPart getEditPart() {
		return (ActivityFinalNodeEditPart) this.getStructuredSelection().getFirstElement();
	}
	
	protected ActivityFinalNode getModel() {
		ActivityFinalNodeEditPart aaEditPart = this.getEditPart();
		return (ActivityFinalNode) ((View) aaEditPart.getModel()).getElement();
	}

	protected TransactionalEditingDomain getChangeCommandReceiver() {
		return this.getEditPart().getEditingDomain();
	}
	
}
