/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart;
import org.storydriven.modeling.activities.providers.ActivitiesMessages;


// End of user code

/**
 * 
 * 
 */
public class ExceptionVariablePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ExceptionVariablePropertiesEditionPart {

	protected EObjectFlatComboViewer activityEdge;
	protected Text name;
		protected ReferencesTable exceptionType;
		protected List<ViewerFilter> exceptionTypeBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> exceptionTypeFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable genericExceptionType;
		protected List<ViewerFilter> genericExceptionTypeBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> genericExceptionTypeFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExceptionVariablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence exceptionVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = exceptionVariableStep.addStep(ActivitiesViewsRepository.ExceptionVariable.Properties.class);
		propertiesStep.addStep(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge);
		propertiesStep.addStep(ActivitiesViewsRepository.ExceptionVariable.Properties.name);
		propertiesStep.addStep(ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType);
		propertiesStep.addStep(ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType);
		
		
		composer = new PartComposer(exceptionVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ActivitiesViewsRepository.ExceptionVariable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge) {
					return createActivityEdgeFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.ExceptionVariable.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType) {
					return createExceptionTypeReferencesTable(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType) {
					return createGenericExceptionTypeReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(ActivitiesMessages.ExceptionVariablePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createActivityEdgeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ExceptionVariablePropertiesEditionPart_ActivityEdgeLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge, ActivitiesViewsRepository.FORM_KIND));
		activityEdge = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(activityEdge);
		activityEdge.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData activityEdgeData = new GridData(GridData.FILL_HORIZONTAL);
		activityEdge.setLayoutData(activityEdgeData);
		activityEdge.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getActivityEdge()));
			}

		});
		activityEdge.setID(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ExceptionVariablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.ExceptionVariable.Properties.name, ActivitiesViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ActivitiesViewsRepository.ExceptionVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ExceptionVariable.Properties.name, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExceptionTypeReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.exceptionType = new ReferencesTable(ActivitiesMessages.ExceptionVariablePropertiesEditionPart_ExceptionTypeLabel, new ReferencesTableListener	() {
			public void handleAdd() { addExceptionType(); }
			public void handleEdit(EObject element) { editExceptionType(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExceptionType(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExceptionType(element); }
			public void navigateTo(EObject element) { }
		});
		this.exceptionType.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType, ActivitiesViewsRepository.FORM_KIND));
		this.exceptionType.createControls(parent, widgetFactory);
		this.exceptionType.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData exceptionTypeData = new GridData(GridData.FILL_HORIZONTAL);
		exceptionTypeData.horizontalSpan = 3;
		this.exceptionType.setLayoutData(exceptionTypeData);
		this.exceptionType.disableMove();
		exceptionType.setID(ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType);
		exceptionType.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExceptionType() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(exceptionType.getInput(), exceptionTypeFilters, exceptionTypeBusinessFilters,
		"exceptionType", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				exceptionType.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExceptionType(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		exceptionType.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExceptionType(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		exceptionType.refresh();
	}

	/**
	 * 
	 */
	protected void editExceptionType(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				exceptionType.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createGenericExceptionTypeReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.genericExceptionType = new ReferencesTable(ActivitiesMessages.ExceptionVariablePropertiesEditionPart_GenericExceptionTypeLabel, new ReferencesTableListener	() {
			public void handleAdd() { addGenericExceptionType(); }
			public void handleEdit(EObject element) { editGenericExceptionType(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGenericExceptionType(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGenericExceptionType(element); }
			public void navigateTo(EObject element) { }
		});
		this.genericExceptionType.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType, ActivitiesViewsRepository.FORM_KIND));
		this.genericExceptionType.createControls(parent, widgetFactory);
		this.genericExceptionType.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData genericExceptionTypeData = new GridData(GridData.FILL_HORIZONTAL);
		genericExceptionTypeData.horizontalSpan = 3;
		this.genericExceptionType.setLayoutData(genericExceptionTypeData);
		this.genericExceptionType.disableMove();
		genericExceptionType.setID(ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType);
		genericExceptionType.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGenericExceptionType() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(genericExceptionType.getInput(), genericExceptionTypeFilters, genericExceptionTypeBusinessFilters,
		"genericExceptionType", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				genericExceptionType.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGenericExceptionType(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		genericExceptionType.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGenericExceptionType(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariablePropertiesEditionPartForm.this, ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		genericExceptionType.refresh();
	}

	/**
	 * 
	 */
	protected void editGenericExceptionType(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				genericExceptionType.refresh();
			}
		}
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
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#getActivityEdge()
	 * 
	 */
	public EObject getActivityEdge() {
		if (activityEdge.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) activityEdge.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#initActivityEdge(EObjectFlatComboSettings)
	 */
	public void initActivityEdge(EObjectFlatComboSettings settings) {
		activityEdge.setInput(settings);
		if (current != null) {
			activityEdge.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#setActivityEdge(EObject newValue)
	 * 
	 */
	public void setActivityEdge(EObject newValue) {
		if (newValue != null) {
			activityEdge.setSelection(new StructuredSelection(newValue));
		} else {
			activityEdge.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#setActivityEdgeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setActivityEdgeButtonMode(ButtonsModeEnum newValue) {
		activityEdge.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#addFilterActivityEdge(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActivityEdge(ViewerFilter filter) {
		activityEdge.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#addBusinessFilterActivityEdge(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActivityEdge(ViewerFilter filter) {
		activityEdge.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#initExceptionType(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExceptionType(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		exceptionType.setContentProvider(contentProvider);
		exceptionType.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#updateExceptionType()
	 * 
	 */
	public void updateExceptionType() {
	exceptionType.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#addFilterExceptionType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExceptionType(ViewerFilter filter) {
		exceptionTypeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#addBusinessFilterExceptionType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExceptionType(ViewerFilter filter) {
		exceptionTypeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#isContainedInExceptionTypeTable(EObject element)
	 * 
	 */
	public boolean isContainedInExceptionTypeTable(EObject element) {
		return ((ReferencesTableSettings)exceptionType.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#initGenericExceptionType(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGenericExceptionType(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		genericExceptionType.setContentProvider(contentProvider);
		genericExceptionType.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#updateGenericExceptionType()
	 * 
	 */
	public void updateGenericExceptionType() {
	genericExceptionType.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#addFilterGenericExceptionType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGenericExceptionType(ViewerFilter filter) {
		genericExceptionTypeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#addBusinessFilterGenericExceptionType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGenericExceptionType(ViewerFilter filter) {
		genericExceptionTypeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart#isContainedInGenericExceptionTypeTable(EObject element)
	 * 
	 */
	public boolean isContainedInGenericExceptionTypeTable(EObject element) {
		return ((ReferencesTableSettings)genericExceptionType.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ActivitiesMessages.ExceptionVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
