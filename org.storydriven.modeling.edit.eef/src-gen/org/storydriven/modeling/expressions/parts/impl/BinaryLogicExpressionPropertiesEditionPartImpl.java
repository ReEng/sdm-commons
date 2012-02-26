/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.storydriven.modeling.expressions.parts.BinaryLogicExpressionPropertiesEditionPart;
import org.storydriven.modeling.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class BinaryLogicExpressionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BinaryLogicExpressionPropertiesEditionPart {

	protected Text comment;
	protected EMFComboViewer operator;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BinaryLogicExpressionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence binaryLogicExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = binaryLogicExpressionStep.addStep(ExpressionsViewsRepository.BinaryLogicExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator);
		
		
		composer = new PartComposer(binaryLogicExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.BinaryLogicExpression.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator) {
					return createOperatorEMFComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ExpressionsMessages.BinaryLogicExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.BinaryLogicExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND));
		comment = new Text(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinaryLogicExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinaryLogicExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOperatorEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.BinaryLogicExpressionPropertiesEditionPart_OperatorLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator, ExpressionsViewsRepository.SWT_KIND));
		operator = new EMFComboViewer(parent);
		operator.setContentProvider(new ArrayContentProvider());
		operator.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData operatorData = new GridData(GridData.FILL_HORIZONTAL);
		operator.getCombo().setLayoutData(operatorData);
		operator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinaryLogicExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOperator()));
			}

		});
		operator.setID(ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.BinaryLogicExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.BinaryLogicExpressionPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.BinaryLogicExpressionPropertiesEditionPart#getOperator()
	 * 
	 */
	public Enumerator getOperator() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) operator.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.BinaryLogicExpressionPropertiesEditionPart#initOperator(EEnum eenum, Enumerator current)
	 */
	public void initOperator(EEnum eenum, Enumerator current) {
		operator.setInput(eenum.getELiterals());
		operator.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.BinaryLogicExpressionPropertiesEditionPart#setOperator(Enumerator newValue)
	 * 
	 */
	public void setOperator(Enumerator newValue) {
		operator.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ExpressionsMessages.BinaryLogicExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
