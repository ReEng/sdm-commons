package org.storydriven.modeling.diagram.custom.expressions;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.ui.IObjectActionDelegate;

public abstract class CommonEditExpressionWithDialogAction extends AbstractActionDelegate implements 
	IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		expressionDialog = new EditExpressionDialog(null);
		expressionDialog.setExpectedReturnType(this.getExpectedReturnType());
		expressionDialog.setDialogText(this.getExpressionText());
		expressionDialog.setChangeAttributeCommand(this.getChangeAttributeCommand(), this.getChangeCommandReceiver());
		expressionDialog.setContextInformation(this.getContextInformation());
		expressionDialog.open();		
	}

	protected abstract TransactionalEditingDomain getChangeCommandReceiver();

	protected abstract Command getChangeAttributeCommand();
	
	protected abstract Map<String, EClassifier> getContextInformation();
	
	protected abstract String getExpressionText();

	protected EClassifier getExpectedReturnType() {
		return null;
	}
}
