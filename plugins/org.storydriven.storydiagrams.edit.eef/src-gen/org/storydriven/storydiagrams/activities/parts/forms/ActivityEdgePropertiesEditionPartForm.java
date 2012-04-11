/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.activities.parts.forms;

// Start of user code for imports




import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.storydriven.storydiagrams.activities.parts.ActivitiesViewsRepository;
import org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart;
import org.storydriven.storydiagrams.activities.providers.ActivitiesMessages;


// End of user code

/**
 * 
 * 
 */
public class ActivityEdgePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ActivityEdgePropertiesEditionPart {

	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer owningActivity;
	protected EMFComboViewer guard;



	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ActivityEdgePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence activityEdgeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = activityEdgeStep.addStep(ActivitiesViewsRepository.ActivityEdge.Properties.class);
		propertiesStep.addStep(ActivitiesViewsRepository.ActivityEdge.Properties.target);
		propertiesStep.addStep(ActivitiesViewsRepository.ActivityEdge.Properties.source);
		propertiesStep.addStep(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity);
		propertiesStep.addStep(ActivitiesViewsRepository.ActivityEdge.Properties.guard);
		
		
		composer = new PartComposer(activityEdgeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ActivitiesViewsRepository.ActivityEdge.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.ActivityEdge.Properties.target) {
					return createTargetFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.ActivityEdge.Properties.source) {
					return createSourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity) {
					return createOwningActivityFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.ActivityEdge.Properties.guard) {
					return createGuardEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(ActivitiesMessages.ActivityEdgePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createTargetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityEdgePropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.target, ActivitiesViewsRepository.FORM_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.target, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(target);
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityEdgePropertiesEditionPartForm.this, ActivitiesViewsRepository.ActivityEdge.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTarget()));
				}
			}

		});
		target.setID(ActivitiesViewsRepository.ActivityEdge.Properties.target);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ActivityEdge.Properties.target, ActivitiesViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityEdgePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.source, ActivitiesViewsRepository.FORM_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.source, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(source);
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityEdgePropertiesEditionPartForm.this, ActivitiesViewsRepository.ActivityEdge.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSource()));
				}
			}

		});
		source.setID(ActivitiesViewsRepository.ActivityEdge.Properties.source);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ActivityEdge.Properties.source, ActivitiesViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOwningActivityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityEdgePropertiesEditionPart_OwningActivityLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity, ActivitiesViewsRepository.FORM_KIND));
		owningActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(owningActivity);
		owningActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData owningActivityData = new GridData(GridData.FILL_HORIZONTAL);
		owningActivity.setLayoutData(owningActivityData);
		owningActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityEdgePropertiesEditionPartForm.this, ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningActivity()));
				}
			}

		});
		owningActivity.setID(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity, ActivitiesViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createGuardEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityEdgePropertiesEditionPart_GuardLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ActivityEdge.Properties.guard, ActivitiesViewsRepository.FORM_KIND));
		guard = new EMFComboViewer(parent);
		guard.setContentProvider(new ArrayContentProvider());
		guard.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData guardData = new GridData(GridData.FILL_HORIZONTAL);
		guard.getCombo().setLayoutData(guardData);
		guard.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityEdgePropertiesEditionPartForm.this, ActivitiesViewsRepository.ActivityEdge.Properties.guard, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGuard()));
				}
			}

		});
		guard.setID(ActivitiesViewsRepository.ActivityEdge.Properties.guard);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ActivityEdge.Properties.guard, ActivitiesViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#getTarget()
	 * 
	 */
	@Override
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	@Override
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	@Override
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#getSource()
	 * 
	 */
	@Override
	public EObject getSource() {
		if (source.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) source.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#initSource(EObjectFlatComboSettings)
	 */
	@Override
	public void initSource(EObjectFlatComboSettings settings) {
		source.setInput(settings);
		if (current != null) {
			source.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setSource(EObject newValue)
	 * 
	 */
	@Override
	public void setSource(EObject newValue) {
		if (newValue != null) {
			source.setSelection(new StructuredSelection(newValue));
		} else {
			source.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#getOwningActivity()
	 * 
	 */
	@Override
	public EObject getOwningActivity() {
		if (owningActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owningActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#initOwningActivity(EObjectFlatComboSettings)
	 */
	@Override
	public void initOwningActivity(EObjectFlatComboSettings settings) {
		owningActivity.setInput(settings);
		if (current != null) {
			owningActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setOwningActivity(EObject newValue)
	 * 
	 */
	@Override
	public void setOwningActivity(EObject newValue) {
		if (newValue != null) {
			owningActivity.setSelection(new StructuredSelection(newValue));
		} else {
			owningActivity.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setOwningActivityButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setOwningActivityButtonMode(ButtonsModeEnum newValue) {
		owningActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#addFilterOwningActivity(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOwningActivity(ViewerFilter filter) {
		owningActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#addBusinessFilterOwningActivity(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOwningActivity(ViewerFilter filter) {
		owningActivity.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#getGuard()
	 * 
	 */
	@Override
	public Enumerator getGuard() {
		Enumerator selection = (Enumerator) ((StructuredSelection) guard.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#initGuard(Object input, Enumerator current)
	 */
	@Override
	public void initGuard(Object input, Enumerator current) {
		guard.setInput(input);
		guard.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.ActivityEdgePropertiesEditionPart#setGuard(Enumerator newValue)
	 * 
	 */
	@Override
	public void setGuard(Enumerator newValue) {
		guard.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return ActivitiesMessages.ActivityEdge_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
