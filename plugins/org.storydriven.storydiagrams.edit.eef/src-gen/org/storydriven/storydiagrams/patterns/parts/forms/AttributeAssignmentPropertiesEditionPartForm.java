/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class AttributeAssignmentPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AttributeAssignmentPropertiesEditionPart {

	protected EObjectFlatComboViewer attribute;
	protected EObjectFlatComboViewer objectVariable;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeAssignmentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence attributeAssignmentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeAssignmentStep.addStep(PatternsViewsRepository.AttributeAssignment.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.AttributeAssignment.Properties.attribute);
		propertiesStep.addStep(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable);
		
		
		composer = new PartComposer(attributeAssignmentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.AttributeAssignment.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.AttributeAssignment.Properties.attribute) {
					return createAttributeFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.AttributeAssignment.Properties.objectVariable) {
					return createObjectVariableFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(PatternsMessages.AttributeAssignmentPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAttributeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.AttributeAssignmentPropertiesEditionPart_AttributeLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.attribute, PatternsViewsRepository.FORM_KIND));
		attribute = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.attribute, PatternsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeAssignmentPropertiesEditionPartForm.this, PatternsViewsRepository.AttributeAssignment.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAttribute()));
				}
			}

		});
		attribute.setID(PatternsViewsRepository.AttributeAssignment.Properties.attribute);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.AttributeAssignment.Properties.attribute, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createObjectVariableFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.AttributeAssignmentPropertiesEditionPart_ObjectVariableLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PatternsViewsRepository.FORM_KIND));
		objectVariable = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(objectVariable);
		objectVariable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData objectVariableData = new GridData(GridData.FILL_HORIZONTAL);
		objectVariable.setLayoutData(objectVariableData);
		objectVariable.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeAssignmentPropertiesEditionPartForm.this, PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getObjectVariable()));
				}
			}

		});
		objectVariable.setID(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PatternsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#getAttribute()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#initAttribute(EObjectFlatComboSettings)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setAttribute(EObject newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setAttributeButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setAttributeButtonMode(ButtonsModeEnum newValue) {
		attribute.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addFilterAttribute(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToAttribute(ViewerFilter filter) {
		attribute.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addBusinessFilterAttribute(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToAttribute(ViewerFilter filter) {
		attribute.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#getObjectVariable()
	 * 
	 */
	@Override
	public EObject getObjectVariable() {
		if (objectVariable.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) objectVariable.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#initObjectVariable(EObjectFlatComboSettings)
	 */
	@Override
	public void initObjectVariable(EObjectFlatComboSettings settings) {
		objectVariable.setInput(settings);
		if (current != null) {
			objectVariable.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setObjectVariable(EObject newValue)
	 * 
	 */
	@Override
	public void setObjectVariable(EObject newValue) {
		if (newValue != null) {
			objectVariable.setSelection(new StructuredSelection(newValue));
		} else {
			objectVariable.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setObjectVariableButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setObjectVariableButtonMode(ButtonsModeEnum newValue) {
		objectVariable.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addFilterObjectVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToObjectVariable(ViewerFilter filter) {
		objectVariable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addBusinessFilterObjectVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToObjectVariable(ViewerFilter filter) {
		objectVariable.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.AttributeAssignment_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
