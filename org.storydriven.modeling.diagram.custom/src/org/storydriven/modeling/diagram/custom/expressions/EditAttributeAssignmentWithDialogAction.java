package org.storydriven.modeling.diagram.custom.expressions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.ObjectVariable;


// TODO abstract all those Abstract Action Delegates
public class EditAttributeAssignmentWithDialogAction extends CommonEditExpressionWithDialogAction implements 
	IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		expressionDialog = new EditExpressionDialog(null);
		expressionDialog.setExpectedReturnType(this.getExpectedReturnType());
		expressionDialog.setDialogText(getExpressionText());
		expressionDialog.setChangeAttributeCommand(this.getChangeAttributeCommand(), this.getChangeCommandReceiver());
		expressionDialog.setExpression(this.getExpression());
		expressionDialog.setContextInformation(this.getContextInformation());
		expressionDialog.open();		
	}

	protected EClassifier getExpectedReturnType() {
		return this.getModel().getAttribute() != null ? this.getModel().getAttribute().getEAttributeType() : null;
	}

	protected AttributeAssignment getModel() {
		AttributeAssignmentEditPart aaEditPart = this.getEditPart();
		return (AttributeAssignment) ((View) aaEditPart.getModel()).getElement();
	}

	@Override
	protected TransactionalEditingDomain getChangeCommandReceiver() {
		return this.getEditPart().getEditingDomain();
	}

	@Override
	protected Command getChangeAttributeCommand() {
		return new SetCommand(this.getEditPart().getEditingDomain(), 
									this.getModel(), 
									this.getModel().eClass().getEStructuralFeature("ValueExpression"),
									null);
	
	}

	protected AttributeAssignmentEditPart getEditPart() {
		return (AttributeAssignmentEditPart) this.getStructuredSelection().getFirstElement();
	}
	
	@Override
	protected Map<String, EClassifier> getContextInformation() {
		Map<String, EClassifier> contextInfos = new HashMap<String, EClassifier>();

			/*
			 * Variables created in story patterns and
			 * VariableDeclarationActions
			 */
			TreeIterator<EObject> it = ((View) ((GraphicalEditPart) this.getEditPart().getRoot().getChildren().get(0)).getModel()).getElement().eAllContents();

			while (it.hasNext())
			{
				EObject eObject = it.next();

				if (eObject instanceof ObjectVariable)
				{
					ObjectVariable spo = (ObjectVariable) eObject;

					if (spo.getName() != null && !"".equals(spo.getName()) && spo.getClassifier() != null)
					{
						contextInfos.put(spo.getName(), spo.getClassifier());
					}
				}
//				else if (eObject instanceof VariableDeclarationAction)
//				{
//					VariableDeclarationAction vda = (VariableDeclarationAction) eObject;
//
//					if (vda.getVariableName() != null && !"".equals(vda.getVariableName()) && vda.getClassifier() != null)
//					{
//						contextInfos.put(vda.getVariableName(), vda.getClassifier());
//					}
//				}
			}


		return contextInfos;
	}

	@Override
	protected String getExpressionText() {
		TextualExpression e = this.getExpression();
		if(e != null) {
			return e.getExpressionText();
		} else {
			return "";
		}
	}
	
	protected TextualExpression getExpression() {
		TextualExpression e = (TextualExpression) this.getModel().getValueExpression();
		if(e == null) {
			e = ExpressionsFactoryImpl.eINSTANCE.createTextualExpression();
			this.getChangeCommandReceiver().
						getCommandStack().execute(new SetCommand(this.getEditPart().getEditingDomain(), 
																this.getModel(), 
																this.getModel().eClass().getEStructuralFeature("valueExpression"),
																e));
		}
		return e;
	}
	
}
