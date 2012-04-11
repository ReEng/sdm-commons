/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.expressions.parts.impl;

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
import org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.patterns.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class AttributeValueExpressionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AttributeValueExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer object;
	protected EObjectFlatComboViewer attribute;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeValueExpressionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	@Override
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
	@Override
	public void createControls(Composite view) { 
		CompositionSequence attributeValueExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeValueExpressionStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.object);
		propertiesStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute);
		
		
		composer = new PartComposer(attributeValueExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.object) {
					return createObjectFlatComboViewer(parent);
				}
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute) {
					return createAttributeFlatComboViewer(parent);
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
		propertiesGroup.setText(ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND));
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
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
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}

		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.AttributeValueExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createObjectFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_ObjectLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.object, ExpressionsViewsRepository.SWT_KIND));
		object = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.object, ExpressionsViewsRepository.SWT_KIND));
		object.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		object.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.object, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getObject()));
			}

		});
		GridData objectData = new GridData(GridData.FILL_HORIZONTAL);
		object.setLayoutData(objectData);
		object.setID(ExpressionsViewsRepository.AttributeValueExpression.Properties.object);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.AttributeValueExpression.Properties.object, ExpressionsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAttributeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_AttributeLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, ExpressionsViewsRepository.SWT_KIND));
		attribute = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, ExpressionsViewsRepository.SWT_KIND));
		attribute.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		attribute.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAttribute()));
			}

		});
		GridData attributeData = new GridData(GridData.FILL_HORIZONTAL);
		attribute.setLayoutData(attributeData);
		attribute.setID(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, ExpressionsViewsRepository.SWT_KIND), null); 
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	@Override
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
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#getObject()
	 * 
	 */
	@Override
	public EObject getObject() {
		if (object.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) object.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#initObject(EObjectFlatComboSettings)
	 */
	@Override
	public void initObject(EObjectFlatComboSettings settings) {
		object.setInput(settings);
		if (current != null) {
			object.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#setObject(EObject newValue)
	 * 
	 */
	@Override
	public void setObject(EObject newValue) {
		if (newValue != null) {
			object.setSelection(new StructuredSelection(newValue));
		} else {
			object.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#setObjectButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setObjectButtonMode(ButtonsModeEnum newValue) {
		object.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#addFilterObject(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToObject(ViewerFilter filter) {
		object.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#addBusinessFilterObject(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToObject(ViewerFilter filter) {
		object.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#getAttribute()
	 * 
	 */
	@Override
	public EObject getAttribute() {
		if (attribute.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) attribute.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#initAttribute(EObjectFlatComboSettings)
	 */
	@Override
	public void initAttribute(EObjectFlatComboSettings settings) {
		attribute.setInput(settings);
		if (current != null) {
			attribute.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#setAttribute(EObject newValue)
	 * 
	 */
	@Override
	public void setAttribute(EObject newValue) {
		if (newValue != null) {
			attribute.setSelection(new StructuredSelection(newValue));
		} else {
			attribute.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#setAttributeButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setAttributeButtonMode(ButtonsModeEnum newValue) {
		attribute.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#addFilterAttribute(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToAttribute(ViewerFilter filter) {
		attribute.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart#addBusinessFilterAttribute(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToAttribute(ViewerFilter filter) {
		attribute.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return ExpressionsMessages.AttributeValueExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
