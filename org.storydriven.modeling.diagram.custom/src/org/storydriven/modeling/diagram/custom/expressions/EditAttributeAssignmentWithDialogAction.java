package org.storydriven.modeling.diagram.custom.expressions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.modeling.patterns.AttributeAssignment;

// TODO abstract all those Abstract Action Delegates
public class EditAttributeAssignmentWithDialogAction extends CommonEditExpressionWithDialogAction implements 
	IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		expressionDialog = new EditExpressionDialog(null);
		expressionDialog.setExpectedReturnType(this.getExpectedReturnType());
		expressionDialog.open();		
	}

	protected EClassifier getExpectedReturnType() {
		return this.getModel().getAttribute() != null ? this.getModel().getAttribute().getEAttributeType() : null;
	}

	protected AttributeAssignment getModel() {
		AttributeAssignmentEditPart aaEditPart = (AttributeAssignmentEditPart) this.getStructuredSelection().getFirstElement();
		return (AttributeAssignment) ((View) aaEditPart.getModel()).getElement();
	}

	@Override
	protected TransactionalEditingDomain getChangeCommandReceiver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getChangeAttributeCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object getContextInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getExpressionText() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
