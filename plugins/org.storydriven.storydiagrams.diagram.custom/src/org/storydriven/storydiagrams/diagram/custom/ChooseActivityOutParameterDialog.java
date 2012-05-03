package org.storydriven.storydiagrams.diagram.custom;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
/**
 * 
 * This dialog provides buttons to choose which Out Parameter should be edited. It depends on information about
 * the diagramResource and the stopNode which expressions should be edited. It uses the EditExpressionDialog to edit the expression.
 * The mapping of expresssions and Out Parameters depends on the order and number of expressions.
 *
 * @author Patrick Rein (pre)
 */
public class ChooseActivityOutParameterDialog extends Dialog {
	
	protected static final String DIALOG_TITLE = "Out Parameter";
	protected static final int DIALOG_WIDTH = 500;
	protected static final int DIALOG_HEIGHT = 400;
	protected static final int DIALOG_PADDING = 10;
	protected static final int BUTTON_HEIGHT = 35;
	
	protected EList<EParameter> parameterList;
	protected Map<Button, Integer> buttonDictionary;
	private StopNode stopNode;
	private Activity activity;
	private TransactionalEditingDomain changeCommandReceiver;
	private StopNodeEditPart editPart;
	
	public ChooseActivityOutParameterDialog(Shell parent) {
		super(parent);
	}

	@Override
	public int open() {
		Integer difference = activity.getOutParameters().size() - this.stopNode.getReturnValues().size();
		TextualExpression e = null;
		if(difference > 0) {
			int baseIndex = this.stopNode.getReturnValues().size();
			for(int i = 0; i < difference; i++) {
				e = ExpressionsFactory.eINSTANCE.createTextualExpression();
				this.changeCommandReceiver.
							getCommandStack().execute(new AddCommand(this.editPart.getEditingDomain(), 
																	this.stopNode, 
																	this.stopNode.eClass().getEStructuralFeature("returnValues"),
																	e,
																	baseIndex + i));
			}
		} else if (difference < 0) {
//			int baseIndex = activity.getOutParameters().size();
			for(int i = 0; i < (-difference); i++) {
				e = ExpressionsFactory.eINSTANCE.createTextualExpression();
				this.changeCommandReceiver.
							getCommandStack().execute(new RemoveCommand(this.editPart.getEditingDomain(), 
																	this.stopNode, 
																	this.stopNode.eClass().getEStructuralFeature("returnValues"),
																	this.stopNode.getReturnValues().get(i)));
			}
		}
		return super.open();
	}
	
	@Override
	public void create() {
		super.create();
	}
	
	@Override
	public boolean close() {
		return super.close();
	}
	
	@Override
	protected void okPressed() {
		setReturnCode(OK);
		this.close();
	}

	/**
	   * @see org.eclipse.jface.dialogs.Dialog#
	   *      createDialogArea(org.eclipse.swt.widgets.Composite) 
	   */
	protected Control createDialogArea(Composite parent) {
		
		this.getShell().setText(DIALOG_TITLE);
		
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new RowLayout(SWT.VERTICAL | SWT.CENTER));
		composite.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		
		String s;
		Button b;
		EParameter aParameter;
		buttonDictionary = new HashMap<Button, Integer>();
		for(int i = 0; i < this.parameterList.size() ;i++) {
			aParameter = this.parameterList.get(i);
			if(aParameter != null && aParameter.getEType() != null) {
				s = aParameter.getEType().getName();
				s = s + " " + this.parameterList.get(i).getName();
				
				b = new Button(composite, SWT.PUSH);
				b.setLayoutData(new RowData(DIALOG_WIDTH, BUTTON_HEIGHT));
				b.setText(s);
				b.addSelectionListener(new SelectionListener() {
	
					@Override
					public void widgetSelected(SelectionEvent e) {
						editOutExpression(e);
					}
	
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}
					
				});
				buttonDictionary.put(b, i);
			}
		}
		
		return composite;
	}

	protected void editOutExpression(SelectionEvent e) {
			EditExpressionDialog expressionDialog;
			int parameterIndex = buttonDictionary.get(e.getSource());
			EParameter aParameter = parameterList.get(parameterIndex);
			
			expressionDialog = new EditExpressionDialog(null);
			expressionDialog.setExpectedReturnType(aParameter.getEType());
			expressionDialog.setExpression(this.getExpression(parameterIndex));
			expressionDialog.setContextInformation(null);
			expressionDialog.setChangeAttributeCommand(null, changeCommandReceiver);
			if(expressionDialog.open() == Window.OK) {
				AddCommand ac = new AddCommand(this.editPart.getEditingDomain(), 
						this.stopNode, 
						this.stopNode.eClass().getEStructuralFeature("returnValues"),
						expressionDialog.getExpression(),
						parameterIndex);
				
				if(ac.canExecute()) {
					this.changeCommandReceiver.getCommandStack().execute(ac);
				}				
			}			
	}


	public void setParameterList(EList<EParameter> outParameters) {
		this.parameterList = outParameters;
	}

	public void setChangeCommandReceiver(TransactionalEditingDomain changeCommandReceiver) {
		this.changeCommandReceiver = changeCommandReceiver;
	}

	public void setEditPart(StopNodeEditPart stopNodeEP) {
		this.editPart = stopNodeEP;
	}
	
	protected TextualExpression getExpression(int index) {
		EList<Expression> el = this.stopNode.getReturnValues();
		return (TextualExpression) el.get(index);
	}

	public void setNode(StopNode model) {
		this.stopNode = model;
	}
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

}
