/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.expressions.parts.forms;

// Start of user code for imports








import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.storydiagrams.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.patterns.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class AttributeValueExpressionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AttributeValueExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer object;
	protected EObjectFlatComboViewer attribute;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeValueExpressionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	@Override
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	@Override
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence attributeValueExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeValueExpressionStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.object);
		propertiesStep.addStep(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute);
		
		
		composer = new PartComposer(attributeValueExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.object) {
					return createObjectFlatComboViewer(parent, widgetFactory);
				}
				if (key == ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute) {
					return createAttributeFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND));
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.AttributeValueExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createObjectFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_ObjectLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.object, ExpressionsViewsRepository.FORM_KIND));
		object = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.object, ExpressionsViewsRepository.FORM_KIND));
		widgetFactory.adapt(object);
		object.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData objectData = new GridData(GridData.FILL_HORIZONTAL);
		object.setLayoutData(objectData);
		object.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.object, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getObject()));
				}
			}

		});
		object.setID(ExpressionsViewsRepository.AttributeValueExpression.Properties.object);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.AttributeValueExpression.Properties.object, ExpressionsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAttributeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.AttributeValueExpressionPropertiesEditionPart_AttributeLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, ExpressionsViewsRepository.FORM_KIND));
		attribute = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, ExpressionsViewsRepository.FORM_KIND));
		widgetFactory.adapt(attribute);
		attribute.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData attributeData = new GridData(GridData.FILL_HORIZONTAL);
		attribute.setLayoutData(attributeData);
		attribute.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeValueExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAttribute()));
				}
			}

		});
		attribute.setID(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute, ExpressionsViewsRepository.FORM_KIND), null); 
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
