/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.parts.impl;

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
import org.storydriven.storydiagrams.calls.parts.CallsViewsRepository;
import org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart;
import org.storydriven.storydiagrams.calls.providers.CallsMessages;


// End of user code

/**
 * 
 * 
 */
public class ParameterExtensionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParameterExtensionPropertiesEditionPart {

	protected EObjectFlatComboViewer extendableBase;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterExtensionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterExtensionStep = new BindingCompositionSequence(propertiesEditionComponent);
		parameterExtensionStep
			.addStep(CallsViewsRepository.ParameterExtension.Properties.class)
			.addStep(CallsViewsRepository.ParameterExtension.Properties.extendableBase);
		
		
		composer = new PartComposer(parameterExtensionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CallsViewsRepository.ParameterExtension.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CallsViewsRepository.ParameterExtension.Properties.extendableBase) {
					return createExtendableBaseFlatComboViewer(parent);
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
		propertiesGroup.setText(CallsMessages.ParameterExtensionPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createExtendableBaseFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, CallsMessages.ParameterExtensionPropertiesEditionPart_ExtendableBaseLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterExtension.Properties.extendableBase, CallsViewsRepository.SWT_KIND));
		extendableBase = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterExtension.Properties.extendableBase, CallsViewsRepository.SWT_KIND));
		extendableBase.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		extendableBase.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterExtensionPropertiesEditionPartImpl.this, CallsViewsRepository.ParameterExtension.Properties.extendableBase, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getExtendableBase()));
			}

		});
		GridData extendableBaseData = new GridData(GridData.FILL_HORIZONTAL);
		extendableBase.setLayoutData(extendableBaseData);
		extendableBase.setID(CallsViewsRepository.ParameterExtension.Properties.extendableBase);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.ParameterExtension.Properties.extendableBase, CallsViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart#getExtendableBase()
	 * 
	 */
	@Override
	public EObject getExtendableBase() {
		if (extendableBase.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) extendableBase.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart#initExtendableBase(EObjectFlatComboSettings)
	 */
	@Override
	public void initExtendableBase(EObjectFlatComboSettings settings) {
		extendableBase.setInput(settings);
		if (current != null) {
			extendableBase.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart#setExtendableBase(EObject newValue)
	 * 
	 */
	@Override
	public void setExtendableBase(EObject newValue) {
		if (newValue != null) {
			extendableBase.setSelection(new StructuredSelection(newValue));
		} else {
			extendableBase.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart#setExtendableBaseButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setExtendableBaseButtonMode(ButtonsModeEnum newValue) {
		extendableBase.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart#addFilterExtendableBase(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToExtendableBase(ViewerFilter filter) {
		extendableBase.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterExtensionPropertiesEditionPart#addBusinessFilterExtendableBase(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToExtendableBase(ViewerFilter filter) {
		extendableBase.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return CallsMessages.ParameterExtension_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
