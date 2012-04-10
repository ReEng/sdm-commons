package org.storydriven.storydiagrams.diagram.custom;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.Activity;
public abstract class CommonEditExpressionWithDialogAction extends AbstractActionDelegate implements 
	IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		expressionDialog = new EditExpressionDialog(null);
		expressionDialog.setExpectedReturnType(this.getExpectedReturnType());
		expressionDialog.setExpression(this.getExpression());
		expressionDialog.setChangeAttributeCommand(this.getChangeAttributeCommand(), this.getChangeCommandReceiver());
		expressionDialog.setActivity(this.getActivity());
		expressionDialog.open();		
	}

	protected abstract TextualExpression getExpression();

	protected abstract TransactionalEditingDomain getChangeCommandReceiver();

	protected abstract Command getChangeAttributeCommand();
	
	protected abstract Activity getActivity();
	
	protected EClassifier getExpectedReturnType() {
		return null;
	}
}
