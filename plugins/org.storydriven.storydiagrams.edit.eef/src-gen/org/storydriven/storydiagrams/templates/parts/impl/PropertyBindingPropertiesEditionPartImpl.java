/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.templates.parts.impl;

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
import org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart;
import org.storydriven.storydiagrams.templates.parts.TemplatesViewsRepository;
import org.storydriven.storydiagrams.templates.providers.TemplatesMessages;


// End of user code

/**
 * 
 * 
 */
public class PropertyBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PropertyBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer boundProperty;
	protected EObjectFlatComboViewer templateBinding;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PropertyBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence propertyBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = propertyBindingStep.addStep(TemplatesViewsRepository.PropertyBinding.Properties.class);
		propertiesStep.addStep(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty);
		propertiesStep.addStep(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding);
		
		
		composer = new PartComposer(propertyBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == TemplatesViewsRepository.PropertyBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == TemplatesViewsRepository.PropertyBinding.Properties.boundProperty) {
					return createBoundPropertyFlatComboViewer(parent);
				}
				if (key == TemplatesViewsRepository.PropertyBinding.Properties.templateBinding) {
					return createTemplateBindingFlatComboViewer(parent);
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
		propertiesGroup.setText(TemplatesMessages.PropertyBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createBoundPropertyFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, TemplatesMessages.PropertyBindingPropertiesEditionPart_BoundPropertyLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, TemplatesViewsRepository.SWT_KIND));
		boundProperty = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, TemplatesViewsRepository.SWT_KIND));
		boundProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		boundProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyBindingPropertiesEditionPartImpl.this, TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBoundProperty()));
			}

		});
		GridData boundPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		boundProperty.setLayoutData(boundPropertyData);
		boundProperty.setID(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty, TemplatesViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTemplateBindingFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, TemplatesMessages.PropertyBindingPropertiesEditionPart_TemplateBindingLabel, propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, TemplatesViewsRepository.SWT_KIND));
		templateBinding = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, TemplatesViewsRepository.SWT_KIND));
		templateBinding.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		templateBinding.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyBindingPropertiesEditionPartImpl.this, TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTemplateBinding()));
			}

		});
		GridData templateBindingData = new GridData(GridData.FILL_HORIZONTAL);
		templateBinding.setLayoutData(templateBindingData);
		templateBinding.setID(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding, TemplatesViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#getBoundProperty()
	 * 
	 */
	@Override
	public EObject getBoundProperty() {
		if (boundProperty.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) boundProperty.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#initBoundProperty(EObjectFlatComboSettings)
	 */
	@Override
	public void initBoundProperty(EObjectFlatComboSettings settings) {
		boundProperty.setInput(settings);
		if (current != null) {
			boundProperty.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#setBoundProperty(EObject newValue)
	 * 
	 */
	@Override
	public void setBoundProperty(EObject newValue) {
		if (newValue != null) {
			boundProperty.setSelection(new StructuredSelection(newValue));
		} else {
			boundProperty.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#setBoundPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setBoundPropertyButtonMode(ButtonsModeEnum newValue) {
		boundProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#addFilterBoundProperty(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToBoundProperty(ViewerFilter filter) {
		boundProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#addBusinessFilterBoundProperty(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToBoundProperty(ViewerFilter filter) {
		boundProperty.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#getTemplateBinding()
	 * 
	 */
	@Override
	public EObject getTemplateBinding() {
		if (templateBinding.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) templateBinding.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#initTemplateBinding(EObjectFlatComboSettings)
	 */
	@Override
	public void initTemplateBinding(EObjectFlatComboSettings settings) {
		templateBinding.setInput(settings);
		if (current != null) {
			templateBinding.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#setTemplateBinding(EObject newValue)
	 * 
	 */
	@Override
	public void setTemplateBinding(EObject newValue) {
		if (newValue != null) {
			templateBinding.setSelection(new StructuredSelection(newValue));
		} else {
			templateBinding.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#setTemplateBindingButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setTemplateBindingButtonMode(ButtonsModeEnum newValue) {
		templateBinding.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#addFilterTemplateBinding(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToTemplateBinding(ViewerFilter filter) {
		templateBinding.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.templates.parts.PropertyBindingPropertiesEditionPart#addBusinessFilterTemplateBinding(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToTemplateBinding(ViewerFilter filter) {
		templateBinding.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return TemplatesMessages.PropertyBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
