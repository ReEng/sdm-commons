/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;
import org.storydriven.modeling.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class ObjectVariablePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ObjectVariablePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer pattern;
	protected EMFComboViewer bindingState;
		protected ReferencesTable incomingLink;
		protected List<ViewerFilter> incomingLinkBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> incomingLinkFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable outgoingLink;
		protected List<ViewerFilter> outgoingLinkBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outgoingLinkFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer bindingSemantics;
	protected EMFComboViewer bindingOperator;
	protected EObjectFlatComboViewer classifier;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ObjectVariablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence objectVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = objectVariableStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.name);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.bindingState);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.incomingLink);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.outgoingLink);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.classifier);
		
		
		composer = new PartComposer(objectVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.ObjectVariable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.pattern) {
					return createPatternFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.bindingState) {
					return createBindingStateEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.incomingLink) {
					return createIncomingLinkReferencesTable(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.outgoingLink) {
					return createOutgoingLinkReferencesTable(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.bindingOperator) {
					return createBindingOperatorEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.classifier) {
					return createClassifierFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(PatternsMessages.ObjectVariablePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ObjectVariablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.name, PatternsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, PatternsViewsRepository.ObjectVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.name, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ObjectVariablePropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(pattern);
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.pattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		pattern.setID(PatternsViewsRepository.ObjectVariable.Properties.pattern);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBindingStateEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ObjectVariablePropertiesEditionPart_BindingStateLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.bindingState, PatternsViewsRepository.FORM_KIND));
		bindingState = new EMFComboViewer(parent);
		bindingState.setContentProvider(new ArrayContentProvider());
		bindingState.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData bindingStateData = new GridData(GridData.FILL_HORIZONTAL);
		bindingState.getCombo().setLayoutData(bindingStateData);
		bindingState.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.bindingState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingState()));
			}

		});
		bindingState.setID(PatternsViewsRepository.ObjectVariable.Properties.bindingState);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.bindingState, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingLinkReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingLink = new ReferencesTable(PatternsMessages.ObjectVariablePropertiesEditionPart_IncomingLinkLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncomingLink(); }
			public void handleEdit(EObject element) { editIncomingLink(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingLink(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingLink(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PatternsViewsRepository.FORM_KIND));
		this.incomingLink.createControls(parent, widgetFactory);
		this.incomingLink.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		incomingLinkData.horizontalSpan = 3;
		this.incomingLink.setLayoutData(incomingLinkData);
		this.incomingLink.disableMove();
		incomingLink.setID(PatternsViewsRepository.ObjectVariable.Properties.incomingLink);
		incomingLink.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingLink() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingLink.getInput(), incomingLinkFilters, incomingLinkBusinessFilters,
		"incomingLink", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingLink.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingLink(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingLink.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingLink(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingLink.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingLinkReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoingLink = new ReferencesTable(PatternsMessages.ObjectVariablePropertiesEditionPart_OutgoingLinkLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoingLink(); }
			public void handleEdit(EObject element) { editOutgoingLink(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingLink(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingLink(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PatternsViewsRepository.FORM_KIND));
		this.outgoingLink.createControls(parent, widgetFactory);
		this.outgoingLink.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingLinkData.horizontalSpan = 3;
		this.outgoingLink.setLayoutData(outgoingLinkData);
		this.outgoingLink.disableMove();
		outgoingLink.setID(PatternsViewsRepository.ObjectVariable.Properties.outgoingLink);
		outgoingLink.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingLink() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingLink.getInput(), outgoingLinkFilters, outgoingLinkBusinessFilters,
		"outgoingLink", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingLink.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingLink(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingLink.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingLink(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingLink.refresh();
			}
		}
	}

	
	protected Composite createBindingSemanticsEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ObjectVariablePropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND));
		bindingSemantics = new EMFComboViewer(parent);
		bindingSemantics.setContentProvider(new ArrayContentProvider());
		bindingSemantics.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData bindingSemanticsData = new GridData(GridData.FILL_HORIZONTAL);
		bindingSemantics.getCombo().setLayoutData(bindingSemanticsData);
		bindingSemantics.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBindingOperatorEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ObjectVariablePropertiesEditionPart_BindingOperatorLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator, PatternsViewsRepository.FORM_KIND));
		bindingOperator = new EMFComboViewer(parent);
		bindingOperator.setContentProvider(new ArrayContentProvider());
		bindingOperator.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData bindingOperatorData = new GridData(GridData.FILL_HORIZONTAL);
		bindingOperator.getCombo().setLayoutData(bindingOperatorData);
		bindingOperator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.bindingOperator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingOperator()));
			}

		});
		bindingOperator.setID(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createClassifierFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ObjectVariablePropertiesEditionPart_ClassifierLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.classifier, PatternsViewsRepository.FORM_KIND));
		classifier = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.classifier, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(classifier);
		classifier.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData classifierData = new GridData(GridData.FILL_HORIZONTAL);
		classifier.setLayoutData(classifierData);
		classifier.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ObjectVariable.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getClassifier()));
			}

		});
		classifier.setID(PatternsViewsRepository.ObjectVariable.Properties.classifier);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.classifier, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#getPattern()
	 * 
	 */
	public EObject getPattern() {
		if (pattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initPattern(EObjectFlatComboSettings)
	 */
	public void initPattern(EObjectFlatComboSettings settings) {
		pattern.setInput(settings);
		if (current != null) {
			pattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setPattern(EObject newValue)
	 * 
	 */
	public void setPattern(EObject newValue) {
		if (newValue != null) {
			pattern.setSelection(new StructuredSelection(newValue));
		} else {
			pattern.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#getBindingState()
	 * 
	 */
	public Enumerator getBindingState() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingState.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initBindingState(EEnum eenum, Enumerator current)
	 */
	public void initBindingState(EEnum eenum, Enumerator current) {
		bindingState.setInput(eenum.getELiterals());
		bindingState.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setBindingState(Enumerator newValue)
	 * 
	 */
	public void setBindingState(Enumerator newValue) {
		bindingState.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initIncomingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingLink.setContentProvider(contentProvider);
		incomingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#updateIncomingLink()
	 * 
	 */
	public void updateIncomingLink() {
	incomingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#isContainedInIncomingLinkTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingLinkTable(EObject element) {
		return ((ReferencesTableSettings)incomingLink.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initOutgoingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingLink.setContentProvider(contentProvider);
		outgoingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#updateOutgoingLink()
	 * 
	 */
	public void updateOutgoingLink() {
	outgoingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterOutgoingLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingLink(ViewerFilter filter) {
		outgoingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterOutgoingLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingLink(ViewerFilter filter) {
		outgoingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#isContainedInOutgoingLinkTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingLinkTable(EObject element) {
		return ((ReferencesTableSettings)outgoingLink.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#getBindingSemantics()
	 * 
	 */
	public Enumerator getBindingSemantics() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingSemantics.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initBindingSemantics(EEnum eenum, Enumerator current)
	 */
	public void initBindingSemantics(EEnum eenum, Enumerator current) {
		bindingSemantics.setInput(eenum.getELiterals());
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setBindingSemantics(Enumerator newValue)
	 * 
	 */
	public void setBindingSemantics(Enumerator newValue) {
		bindingSemantics.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#getBindingOperator()
	 * 
	 */
	public Enumerator getBindingOperator() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingOperator.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initBindingOperator(EEnum eenum, Enumerator current)
	 */
	public void initBindingOperator(EEnum eenum, Enumerator current) {
		bindingOperator.setInput(eenum.getELiterals());
		bindingOperator.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setBindingOperator(Enumerator newValue)
	 * 
	 */
	public void setBindingOperator(Enumerator newValue) {
		bindingOperator.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#getClassifier()
	 * 
	 */
	public EObject getClassifier() {
		if (classifier.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) classifier.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#initClassifier(EObjectFlatComboSettings)
	 */
	public void initClassifier(EObjectFlatComboSettings settings) {
		classifier.setInput(settings);
		if (current != null) {
			classifier.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setClassifier(EObject newValue)
	 * 
	 */
	public void setClassifier(EObject newValue) {
		if (newValue != null) {
			classifier.setSelection(new StructuredSelection(newValue));
		} else {
			classifier.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#setClassifierButtonMode(ButtonsModeEnum newValue)
	 */
	public void setClassifierButtonMode(ButtonsModeEnum newValue) {
		classifier.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterClassifier(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClassifier(ViewerFilter filter) {
		classifier.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterClassifier(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClassifier(ViewerFilter filter) {
		classifier.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternsMessages.ObjectVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
