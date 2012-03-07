/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.parts.forms;

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
import org.storydriven.modeling.calls.parts.CallsViewsRepository;
import org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart;
import org.storydriven.modeling.calls.providers.CallsMessages;


// End of user code

/**
 * 
 * 
 */
public class ParameterExtensionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ParameterExtensionPropertiesEditionPart {

	protected EObjectFlatComboViewer extendableBase;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterExtensionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterExtensionStep = new BindingCompositionSequence(propertiesEditionComponent);
		parameterExtensionStep
			.addStep(CallsViewsRepository.ParameterExtension.Properties.class)
			.addStep(CallsViewsRepository.ParameterExtension.Properties.extendableBase);
		
		
		composer = new PartComposer(parameterExtensionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CallsViewsRepository.ParameterExtension.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CallsViewsRepository.ParameterExtension.Properties.extendableBase) {
					return createExtendableBaseFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(CallsMessages.ParameterExtensionPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createExtendableBaseFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, CallsMessages.ParameterExtensionPropertiesEditionPart_ExtendableBaseLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterExtension.Properties.extendableBase, CallsViewsRepository.FORM_KIND));
		extendableBase = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterExtension.Properties.extendableBase, CallsViewsRepository.FORM_KIND));
		widgetFactory.adapt(extendableBase);
		extendableBase.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData extendableBaseData = new GridData(GridData.FILL_HORIZONTAL);
		extendableBase.setLayoutData(extendableBaseData);
		extendableBase.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterExtensionPropertiesEditionPartForm.this, CallsViewsRepository.ParameterExtension.Properties.extendableBase, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getExtendableBase()));
			}

		});
		extendableBase.setID(CallsViewsRepository.ParameterExtension.Properties.extendableBase);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.ParameterExtension.Properties.extendableBase, CallsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart#getExtendableBase()
	 * 
	 */
	public EObject getExtendableBase() {
		if (extendableBase.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) extendableBase.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart#initExtendableBase(EObjectFlatComboSettings)
	 */
	public void initExtendableBase(EObjectFlatComboSettings settings) {
		extendableBase.setInput(settings);
		if (current != null) {
			extendableBase.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart#setExtendableBase(EObject newValue)
	 * 
	 */
	public void setExtendableBase(EObject newValue) {
		if (newValue != null) {
			extendableBase.setSelection(new StructuredSelection(newValue));
		} else {
			extendableBase.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart#setExtendableBaseButtonMode(ButtonsModeEnum newValue)
	 */
	public void setExtendableBaseButtonMode(ButtonsModeEnum newValue) {
		extendableBase.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart#addFilterExtendableBase(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtendableBase(ViewerFilter filter) {
		extendableBase.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart#addBusinessFilterExtendableBase(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtendableBase(ViewerFilter filter) {
		extendableBase.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CallsMessages.ParameterExtension_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
