/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.templates.parts.forms;

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
import org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart;
import org.storydriven.modeling.templates.parts.TemplatesViewsRepository;
import org.storydriven.modeling.templates.providers.TemplatesMessages;


// End of user code

/**
 * 
 * 
 */
public class PropertyBindingPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PropertyBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer boundProperty;
	protected EObjectFlatComboViewer templateBinding;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PropertyBindingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
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
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence propertyBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = propertyBindingStep.addStep(TemplatesViewsRepository.PropertyBinding.Properties.class);
		propertiesStep.addStep(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty);
		propertiesStep.addStep(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding);
		
		
		composer = new PartComposer(propertyBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == TemplatesViewsRepository.PropertyBinding.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == TemplatesViewsRepository.PropertyBinding.Properties.boundProperty) {
					return createBoundPropertyFlatComboViewer(parent, widgetFactory);
				}
				if (key == TemplatesViewsRepository.PropertyBinding.Properties.templateBinding) {
					return createTemplateBindingFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(TemplatesMessages.PropertyBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createBoundPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, TemplatesMessages.PropertyBindingPropertiesEditionPart_BoundPropertyLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, TemplatesViewsRepository.FORM_KIND));
		boundProperty = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, TemplatesViewsRepository.FORM_KIND));
		widgetFactory.adapt(boundProperty);
		boundProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData boundPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		boundProperty.setLayoutData(boundPropertyData);
		boundProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyBindingPropertiesEditionPartForm.this, TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBoundProperty()));
			}

		});
		boundProperty.setID(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, TemplatesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTemplateBindingFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, TemplatesMessages.PropertyBindingPropertiesEditionPart_TemplateBindingLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, TemplatesViewsRepository.FORM_KIND));
		templateBinding = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, TemplatesViewsRepository.FORM_KIND));
		widgetFactory.adapt(templateBinding);
		templateBinding.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData templateBindingData = new GridData(GridData.FILL_HORIZONTAL);
		templateBinding.setLayoutData(templateBindingData);
		templateBinding.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyBindingPropertiesEditionPartForm.this, TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTemplateBinding()));
			}

		});
		templateBinding.setID(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, TemplatesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#getBoundProperty()
	 * 
	 */
	public EObject getBoundProperty() {
		if (boundProperty.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) boundProperty.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#initBoundProperty(EObjectFlatComboSettings)
	 */
	public void initBoundProperty(EObjectFlatComboSettings settings) {
		boundProperty.setInput(settings);
		if (current != null) {
			boundProperty.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#setBoundProperty(EObject newValue)
	 * 
	 */
	public void setBoundProperty(EObject newValue) {
		if (newValue != null) {
			boundProperty.setSelection(new StructuredSelection(newValue));
		} else {
			boundProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#setBoundPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBoundPropertyButtonMode(ButtonsModeEnum newValue) {
		boundProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#addFilterBoundProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBoundProperty(ViewerFilter filter) {
		boundProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#addBusinessFilterBoundProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBoundProperty(ViewerFilter filter) {
		boundProperty.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#getTemplateBinding()
	 * 
	 */
	public EObject getTemplateBinding() {
		if (templateBinding.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) templateBinding.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#initTemplateBinding(EObjectFlatComboSettings)
	 */
	public void initTemplateBinding(EObjectFlatComboSettings settings) {
		templateBinding.setInput(settings);
		if (current != null) {
			templateBinding.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#setTemplateBinding(EObject newValue)
	 * 
	 */
	public void setTemplateBinding(EObject newValue) {
		if (newValue != null) {
			templateBinding.setSelection(new StructuredSelection(newValue));
		} else {
			templateBinding.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#setTemplateBindingButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateBindingButtonMode(ButtonsModeEnum newValue) {
		templateBinding.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#addFilterTemplateBinding(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTemplateBinding(ViewerFilter filter) {
		templateBinding.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart#addBusinessFilterTemplateBinding(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTemplateBinding(ViewerFilter filter) {
		templateBinding.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return TemplatesMessages.PropertyBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
