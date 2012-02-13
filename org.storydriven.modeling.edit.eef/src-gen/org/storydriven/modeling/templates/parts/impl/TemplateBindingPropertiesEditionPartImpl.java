/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.templates.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart;
import org.storydriven.modeling.templates.parts.TemplatesViewsRepository;
import org.storydriven.modeling.templates.providers.TemplatesMessages;


// End of user code

/**
 * 
 * 
 */
public class TemplateBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TemplateBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer boundParameter;
	protected EObjectFlatComboViewer template;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TemplateBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence templateBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = templateBindingStep.addStep(TemplatesViewsRepository.TemplateBinding.Properties.class);
		propertiesStep.addStep(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter);
		propertiesStep.addStep(TemplatesViewsRepository.TemplateBinding.Properties.template);
		
		
		composer = new PartComposer(templateBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == TemplatesViewsRepository.TemplateBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == TemplatesViewsRepository.TemplateBinding.Properties.boundParameter) {
					return createBoundParameterFlatComboViewer(parent);
				}
				if (key == TemplatesViewsRepository.TemplateBinding.Properties.template) {
					return createTemplateFlatComboViewer(parent);
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
		propertiesGroup.setText(TemplatesMessages.TemplateBindingPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBoundParameterFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, TemplatesMessages.TemplateBindingPropertiesEditionPart_BoundParameterLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, TemplatesViewsRepository.SWT_KIND));
		boundParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, TemplatesViewsRepository.SWT_KIND));
		boundParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		boundParameter.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplateBindingPropertiesEditionPartImpl.this, TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBoundParameter()));
			}

		});
		GridData boundParameterData = new GridData(GridData.FILL_HORIZONTAL);
		boundParameter.setLayoutData(boundParameterData);
		boundParameter.setID(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter, TemplatesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTemplateFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, TemplatesMessages.TemplateBindingPropertiesEditionPart_TemplateLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.template, TemplatesViewsRepository.SWT_KIND));
		template = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.TemplateBinding.Properties.template, TemplatesViewsRepository.SWT_KIND));
		template.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		template.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplateBindingPropertiesEditionPartImpl.this, TemplatesViewsRepository.TemplateBinding.Properties.template, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTemplate()));
			}

		});
		GridData templateData = new GridData(GridData.FILL_HORIZONTAL);
		template.setLayoutData(templateData);
		template.setID(TemplatesViewsRepository.TemplateBinding.Properties.template);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.TemplateBinding.Properties.template, TemplatesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#getBoundParameter()
	 * 
	 */
	public EObject getBoundParameter() {
		if (boundParameter.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) boundParameter.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#initBoundParameter(EObjectFlatComboSettings)
	 */
	public void initBoundParameter(EObjectFlatComboSettings settings) {
		boundParameter.setInput(settings);
		if (current != null) {
			boundParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#setBoundParameter(EObject newValue)
	 * 
	 */
	public void setBoundParameter(EObject newValue) {
		if (newValue != null) {
			boundParameter.setSelection(new StructuredSelection(newValue));
		} else {
			boundParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#setBoundParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBoundParameterButtonMode(ButtonsModeEnum newValue) {
		boundParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#addFilterBoundParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBoundParameter(ViewerFilter filter) {
		boundParameter.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#addBusinessFilterBoundParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBoundParameter(ViewerFilter filter) {
		boundParameter.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#getTemplate()
	 * 
	 */
	public EObject getTemplate() {
		if (template.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) template.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#initTemplate(EObjectFlatComboSettings)
	 */
	public void initTemplate(EObjectFlatComboSettings settings) {
		template.setInput(settings);
		if (current != null) {
			template.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#setTemplate(EObject newValue)
	 * 
	 */
	public void setTemplate(EObject newValue) {
		if (newValue != null) {
			template.setSelection(new StructuredSelection(newValue));
		} else {
			template.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#setTemplateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateButtonMode(ButtonsModeEnum newValue) {
		template.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#addFilterTemplate(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTemplate(ViewerFilter filter) {
		template.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart#addBusinessFilterTemplate(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTemplate(ViewerFilter filter) {
		template.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return TemplatesMessages.TemplateBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
