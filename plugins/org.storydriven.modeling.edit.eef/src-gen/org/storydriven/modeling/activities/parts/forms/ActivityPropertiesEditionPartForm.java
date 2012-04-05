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
import org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart;
import org.storydriven.modeling.activities.providers.ActivitiesMessages;


// End of user code

/**
 * 
 * 
 */
public class ActivityPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ActivityPropertiesEditionPart {

	protected Text comment;
		protected ReferencesTable inParameter;
		protected List<ViewerFilter> inParameterBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> inParameterFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable outParameter;
		protected List<ViewerFilter> outParameterBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outParameterFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected EObjectFlatComboViewer owningOperation;
	protected EObjectFlatComboViewer precondition;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ActivityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence activityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = activityStep.addStep(ActivitiesViewsRepository.Activity.Properties.class);
		propertiesStep.addStep(ActivitiesViewsRepository.Activity.Properties.comment);
		propertiesStep.addStep(ActivitiesViewsRepository.Activity.Properties.inParameter);
		propertiesStep.addStep(ActivitiesViewsRepository.Activity.Properties.outParameter);
		propertiesStep.addStep(ActivitiesViewsRepository.Activity.Properties.name);
		propertiesStep.addStep(ActivitiesViewsRepository.Activity.Properties.owningOperation);
		propertiesStep.addStep(ActivitiesViewsRepository.Activity.Properties.precondition);
		
		
		composer = new PartComposer(activityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ActivitiesViewsRepository.Activity.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.Activity.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.Activity.Properties.inParameter) {
					return createInParameterReferencesTable(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.Activity.Properties.outParameter) {
					return createOutParameterReferencesTable(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.Activity.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.Activity.Properties.owningOperation) {
					return createOwningOperationFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.Activity.Properties.precondition) {
					return createPreconditionFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ActivitiesMessages.ActivityPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.Activity.Properties.comment, ActivitiesViewsRepository.FORM_KIND));
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ActivitiesViewsRepository.Activity.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.Activity.Properties.comment, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInParameterReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.inParameter = new ReferencesTable(ActivitiesMessages.ActivityPropertiesEditionPart_InParameterLabel, new ReferencesTableListener	() {
			public void handleAdd() { addInParameter(); }
			public void handleEdit(EObject element) { editInParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.inParameter.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.Activity.Properties.inParameter, ActivitiesViewsRepository.FORM_KIND));
		this.inParameter.createControls(parent, widgetFactory);
		this.inParameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.inParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inParameterData = new GridData(GridData.FILL_HORIZONTAL);
		inParameterData.horizontalSpan = 3;
		this.inParameter.setLayoutData(inParameterData);
		this.inParameter.disableMove();
		inParameter.setID(ActivitiesViewsRepository.Activity.Properties.inParameter);
		inParameter.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInParameter() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inParameter.getInput(), inParameterFilters, inParameterBusinessFilters,
		"inParameter", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.inParameter,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inParameter.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInParameter(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inParameter.refresh();
	}

	/**
	 * 
	 */
	protected void editInParameter(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inParameter.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutParameterReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outParameter = new ReferencesTable(ActivitiesMessages.ActivityPropertiesEditionPart_OutParameterLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutParameter(); }
			public void handleEdit(EObject element) { editOutParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.outParameter.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.Activity.Properties.outParameter, ActivitiesViewsRepository.FORM_KIND));
		this.outParameter.createControls(parent, widgetFactory);
		this.outParameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.outParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outParameterData = new GridData(GridData.FILL_HORIZONTAL);
		outParameterData.horizontalSpan = 3;
		this.outParameter.setLayoutData(outParameterData);
		this.outParameter.disableMove();
		outParameter.setID(ActivitiesViewsRepository.Activity.Properties.outParameter);
		outParameter.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutParameter() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outParameter.getInput(), outParameterFilters, outParameterBusinessFilters,
		"outParameter", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.outParameter,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outParameter.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutParameter(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outParameter.refresh();
	}

	/**
	 * 
	 */
	protected void editOutParameter(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outParameter.refresh();
			}
		}
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.Activity.Properties.name, ActivitiesViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ActivitiesViewsRepository.Activity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.Activity.Properties.name, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOwningOperationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityPropertiesEditionPart_OwningOperationLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.Activity.Properties.owningOperation, ActivitiesViewsRepository.FORM_KIND));
		owningOperation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.Activity.Properties.owningOperation, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(owningOperation);
		owningOperation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData owningOperationData = new GridData(GridData.FILL_HORIZONTAL);
		owningOperation.setLayoutData(owningOperationData);
		owningOperation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.owningOperation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningOperation()));
			}

		});
		owningOperation.setID(ActivitiesViewsRepository.Activity.Properties.owningOperation);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.Activity.Properties.owningOperation, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPreconditionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.ActivityPropertiesEditionPart_PreconditionLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.Activity.Properties.precondition, ActivitiesViewsRepository.FORM_KIND));
		precondition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.Activity.Properties.precondition, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(precondition);
		precondition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData preconditionData = new GridData(GridData.FILL_HORIZONTAL);
		precondition.setLayoutData(preconditionData);
		precondition.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityPropertiesEditionPartForm.this, ActivitiesViewsRepository.Activity.Properties.precondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPrecondition()));
			}

		});
		precondition.setID(ActivitiesViewsRepository.Activity.Properties.precondition);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.Activity.Properties.precondition, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
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
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#initInParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inParameter.setContentProvider(contentProvider);
		inParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#updateInParameter()
	 * 
	 */
	public void updateInParameter() {
	inParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addFilterInParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInParameter(ViewerFilter filter) {
		inParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addBusinessFilterInParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInParameter(ViewerFilter filter) {
		inParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#isContainedInInParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInInParameterTable(EObject element) {
		return ((ReferencesTableSettings)inParameter.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#initOutParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outParameter.setContentProvider(contentProvider);
		outParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#updateOutParameter()
	 * 
	 */
	public void updateOutParameter() {
	outParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutParameter(ViewerFilter filter) {
		outParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addBusinessFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutParameter(ViewerFilter filter) {
		outParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#isContainedInOutParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutParameterTable(EObject element) {
		return ((ReferencesTableSettings)outParameter.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#getOwningOperation()
	 * 
	 */
	public EObject getOwningOperation() {
		if (owningOperation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owningOperation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#initOwningOperation(EObjectFlatComboSettings)
	 */
	public void initOwningOperation(EObjectFlatComboSettings settings) {
		owningOperation.setInput(settings);
		if (current != null) {
			owningOperation.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#setOwningOperation(EObject newValue)
	 * 
	 */
	public void setOwningOperation(EObject newValue) {
		if (newValue != null) {
			owningOperation.setSelection(new StructuredSelection(newValue));
		} else {
			owningOperation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#setOwningOperationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningOperationButtonMode(ButtonsModeEnum newValue) {
		owningOperation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addFilterOwningOperation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwningOperation(ViewerFilter filter) {
		owningOperation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addBusinessFilterOwningOperation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwningOperation(ViewerFilter filter) {
		owningOperation.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#getPrecondition()
	 * 
	 */
	public EObject getPrecondition() {
		if (precondition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) precondition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#initPrecondition(EObjectFlatComboSettings)
	 */
	public void initPrecondition(EObjectFlatComboSettings settings) {
		precondition.setInput(settings);
		if (current != null) {
			precondition.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#setPrecondition(EObject newValue)
	 * 
	 */
	public void setPrecondition(EObject newValue) {
		if (newValue != null) {
			precondition.setSelection(new StructuredSelection(newValue));
		} else {
			precondition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#setPreconditionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPreconditionButtonMode(ButtonsModeEnum newValue) {
		precondition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addFilterPrecondition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPrecondition(ViewerFilter filter) {
		precondition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart#addBusinessFilterPrecondition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPrecondition(ViewerFilter filter) {
		precondition.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ActivitiesMessages.Activity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
