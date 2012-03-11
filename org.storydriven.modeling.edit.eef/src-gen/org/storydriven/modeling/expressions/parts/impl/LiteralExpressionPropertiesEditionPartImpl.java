/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
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
import org.storydriven.modeling.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart;
import org.storydriven.modeling.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class LiteralExpressionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LiteralExpressionPropertiesEditionPart {

	protected Text comment;
	protected Text value;
	protected EObjectFlatComboViewer valueType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LiteralExpressionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence literalExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = literalExpressionStep.addStep(ExpressionsViewsRepository.LiteralExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.LiteralExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.LiteralExpression.Properties.value);
		propertiesStep.addStep(ExpressionsViewsRepository.LiteralExpression.Properties.valueType);
		
		
		composer = new PartComposer(literalExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.LiteralExpression.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ExpressionsViewsRepository.LiteralExpression.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ExpressionsViewsRepository.LiteralExpression.Properties.value) {
					return createValueText(parent);
				}
				if (key == ExpressionsViewsRepository.LiteralExpression.Properties.valueType) {
					return createValueTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(ExpressionsMessages.LiteralExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.LiteralExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.LiteralExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LiteralExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.LiteralExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LiteralExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.LiteralExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.LiteralExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.LiteralExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createValueText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.LiteralExpressionPropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.LiteralExpression.Properties.value, ExpressionsViewsRepository.SWT_KIND));
		value = new Text(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LiteralExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.LiteralExpression.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LiteralExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.LiteralExpression.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, ExpressionsViewsRepository.LiteralExpression.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.LiteralExpression.Properties.value, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createValueTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.LiteralExpressionPropertiesEditionPart_ValueTypeLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.LiteralExpression.Properties.valueType, ExpressionsViewsRepository.SWT_KIND));
		valueType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.LiteralExpression.Properties.valueType, ExpressionsViewsRepository.SWT_KIND));
		valueType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		valueType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LiteralExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.LiteralExpression.Properties.valueType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getValueType()));
			}

		});
		GridData valueTypeData = new GridData(GridData.FILL_HORIZONTAL);
		valueType.setLayoutData(valueTypeData);
		valueType.setID(ExpressionsViewsRepository.LiteralExpression.Properties.valueType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.LiteralExpression.Properties.valueType, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#getValueType()
	 * 
	 */
	public EObject getValueType() {
		if (valueType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) valueType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#initValueType(EObjectFlatComboSettings)
	 */
	public void initValueType(EObjectFlatComboSettings settings) {
		valueType.setInput(settings);
		if (current != null) {
			valueType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#setValueType(EObject newValue)
	 * 
	 */
	public void setValueType(EObject newValue) {
		if (newValue != null) {
			valueType.setSelection(new StructuredSelection(newValue));
		} else {
			valueType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#setValueTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setValueTypeButtonMode(ButtonsModeEnum newValue) {
		valueType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#addFilterValueType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValueType(ViewerFilter filter) {
		valueType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.LiteralExpressionPropertiesEditionPart#addBusinessFilterValueType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValueType(ViewerFilter filter) {
		valueType.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ExpressionsMessages.LiteralExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
