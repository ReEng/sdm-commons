/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.templates.parts.forms;

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
import org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart;
import org.storydriven.storydiagrams.templates.parts.TemplatesViewsRepository;
import org.storydriven.storydiagrams.templates.providers.TemplatesMessages;


// End of user code

/**
 * 
 * 
 */
public class TemplateBindingPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TemplateBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer boundParameter;
	protected EObjectFlatComboViewer template;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TemplateBindingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence templateBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = templateBindingStep.addStep(TemplatesViewsRepository.TemplateBinding.Properties.class);
		propertiesStep.addStep(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter);
		propertiesStep.addStep(TemplatesViewsRepository.TemplateBinding.Properties.template);
		
		
		composer = new PartComposer(templateBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == TemplatesViewsRepository.TemplateBinding.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == TemplatesViewsRepository.TemplateBinding.Properties.boundParameter) {
					return createBoundParameterFlatComboViewer(parent, widgetFactory);
				}
				if (key == TemplatesViewsRepository.TemplateBinding.Properties.template) {
					return createTemplateFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(TemplatesMessages.TemplateBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createBoundParameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, TemplatesMessages.TemplateBindingPropertiesEditionPart_BoundParameterLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, TemplatesViewsRepository.FORM_KIND));
		boundParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, TemplatesViewsRepository.FORM_KIND));
		widgetFactory.adapt(boundParameter);
		boundParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData boundParameterData = new GridData(GridData.FILL_HORIZONTAL);
		boundParameter.setLayoutData(boundParameterData);
		boundParameter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplateBindingPropertiesEditionPartForm.this, TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBoundParameter()));
				}
			}

		});
		boundParameter.setID(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, TemplatesViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTemplateFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, TemplatesMessages.TemplateBindingPropertiesEditionPart_TemplateLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.template, TemplatesViewsRepository.FORM_KIND));
		template = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.template, TemplatesViewsRepository.FORM_KIND));
		widgetFactory.adapt(template);
		template.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData templateData = new GridData(GridData.FILL_HORIZONTAL);
		template.setLayoutData(templateData);
		template.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplateBindingPropertiesEditionPartForm.this, TemplatesViewsRepository.TemplateBinding.Properties.template, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTemplate()));
				}
			}

		});
		template.setID(TemplatesViewsRepository.TemplateBinding.Properties.template);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.TemplateBinding.Properties.template, TemplatesViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#getBoundParameter()
	 * 
	 */
	@Override
	public EObject getBoundParameter() {
		if (boundParameter.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) boundParameter.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#initBoundParameter(EObjectFlatComboSettings)
	 */
	@Override
	public void initBoundParameter(EObjectFlatComboSettings settings) {
		boundParameter.setInput(settings);
		if (current != null) {
			boundParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#setBoundParameter(EObject newValue)
	 * 
	 */
	@Override
	public void setBoundParameter(EObject newValue) {
		if (newValue != null) {
			boundParameter.setSelection(new StructuredSelection(newValue));
		} else {
			boundParameter.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#setBoundParameterButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setBoundParameterButtonMode(ButtonsModeEnum newValue) {
		boundParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#addFilterBoundParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToBoundParameter(ViewerFilter filter) {
		boundParameter.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#addBusinessFilterBoundParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToBoundParameter(ViewerFilter filter) {
		boundParameter.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#getTemplate()
	 * 
	 */
	@Override
	public EObject getTemplate() {
		if (template.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) template.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#initTemplate(EObjectFlatComboSettings)
	 */
	@Override
	public void initTemplate(EObjectFlatComboSettings settings) {
		template.setInput(settings);
		if (current != null) {
			template.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#setTemplate(EObject newValue)
	 * 
	 */
	@Override
	public void setTemplate(EObject newValue) {
		if (newValue != null) {
			template.setSelection(new StructuredSelection(newValue));
		} else {
			template.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#setTemplateButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setTemplateButtonMode(ButtonsModeEnum newValue) {
		template.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#addFilterTemplate(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToTemplate(ViewerFilter filter) {
		template.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.TemplateBindingPropertiesEditionPart#addBusinessFilterTemplate(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToTemplate(ViewerFilter filter) {
		template.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return TemplatesMessages.TemplateBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
