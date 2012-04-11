/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts.forms;

// Start of user code for imports







import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class ContainerVariablePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ContainerVariablePropertiesEditionPart {

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
	public ContainerVariablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence containerVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = containerVariableStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.name);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.bindingState);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.incomingLink);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.outgoingLink);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.bindingOperator);
		propertiesStep.addStep(PatternsViewsRepository.ContainerVariable.Properties.classifier);
		
		
		composer = new PartComposer(containerVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.ContainerVariable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.pattern) {
					return createPatternFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.bindingState) {
					return createBindingStateEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.incomingLink) {
					return createIncomingLinkReferencesTable(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.outgoingLink) {
					return createOutgoingLinkReferencesTable(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.bindingOperator) {
					return createBindingOperatorEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.ContainerVariable.Properties.classifier) {
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
		propertiesSection.setText(PatternsMessages.ContainerVariablePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ContainerVariablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.name, PatternsViewsRepository.FORM_KIND));
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
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
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					}
				}
			}
		});
		EditingUtils.setID(name, PatternsViewsRepository.ContainerVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.name, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ContainerVariablePropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND));
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
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.pattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPattern()));
				}
			}

		});
		pattern.setID(PatternsViewsRepository.ContainerVariable.Properties.pattern);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingStateEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ContainerVariablePropertiesEditionPart_BindingStateLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.bindingState, PatternsViewsRepository.FORM_KIND));
		bindingState = new EMFComboViewer(parent);
		bindingState.setContentProvider(new ArrayContentProvider());
		bindingState.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingStateData = new GridData(GridData.FILL_HORIZONTAL);
		bindingState.getCombo().setLayoutData(bindingStateData);
		bindingState.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.bindingState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingState()));
				}
			}

		});
		bindingState.setID(PatternsViewsRepository.ContainerVariable.Properties.bindingState);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.bindingState, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingLinkReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingLink = new ReferencesTable(PatternsMessages.ContainerVariablePropertiesEditionPart_IncomingLinkLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener	() {
			@Override
			public void handleAdd() { addIncomingLink(); }
			@Override
			public void handleEdit(EObject element) { editIncomingLink(element); }
			@Override
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingLink(element, oldIndex, newIndex); }
			@Override
			public void handleRemove(EObject element) { removeFromIncomingLink(element); }
			@Override
			public void navigateTo(EObject element) { }
		});
		this.incomingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.incomingLink, PatternsViewsRepository.FORM_KIND));
		this.incomingLink.createControls(parent, widgetFactory);
		this.incomingLink.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.incomingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		incomingLinkData.horizontalSpan = 3;
		this.incomingLink.setLayoutData(incomingLinkData);
		this.incomingLink.disableMove();
		incomingLink.setID(PatternsViewsRepository.ContainerVariable.Properties.incomingLink);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.incomingLink,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.outgoingLink = new ReferencesTable(PatternsMessages.ContainerVariablePropertiesEditionPart_OutgoingLinkLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener	() {
			@Override
			public void handleAdd() { addOutgoingLink(); }
			@Override
			public void handleEdit(EObject element) { editOutgoingLink(element); }
			@Override
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingLink(element, oldIndex, newIndex); }
			@Override
			public void handleRemove(EObject element) { removeFromOutgoingLink(element); }
			@Override
			public void navigateTo(EObject element) { }
		});
		this.outgoingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.outgoingLink, PatternsViewsRepository.FORM_KIND));
		this.outgoingLink.createControls(parent, widgetFactory);
		this.outgoingLink.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.outgoingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingLinkData.horizontalSpan = 3;
		this.outgoingLink.setLayoutData(outgoingLinkData);
		this.outgoingLink.disableMove();
		outgoingLink.setID(PatternsViewsRepository.ContainerVariable.Properties.outgoingLink);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.outgoingLink,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.outgoingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.outgoingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ContainerVariablePropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND));
		bindingSemantics = new EMFComboViewer(parent);
		bindingSemantics.setContentProvider(new ArrayContentProvider());
		bindingSemantics.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingSemanticsData = new GridData(GridData.FILL_HORIZONTAL);
		bindingSemantics.getCombo().setLayoutData(bindingSemanticsData);
		bindingSemantics.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
				}
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingOperatorEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ContainerVariablePropertiesEditionPart_BindingOperatorLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.bindingOperator, PatternsViewsRepository.FORM_KIND));
		bindingOperator = new EMFComboViewer(parent);
		bindingOperator.setContentProvider(new ArrayContentProvider());
		bindingOperator.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingOperatorData = new GridData(GridData.FILL_HORIZONTAL);
		bindingOperator.getCombo().setLayoutData(bindingOperatorData);
		bindingOperator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.bindingOperator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingOperator()));
				}
			}

		});
		bindingOperator.setID(PatternsViewsRepository.ContainerVariable.Properties.bindingOperator);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.bindingOperator, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createClassifierFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.ContainerVariablePropertiesEditionPart_ClassifierLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.classifier, PatternsViewsRepository.FORM_KIND));
		classifier = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainerVariable.Properties.classifier, PatternsViewsRepository.FORM_KIND));
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
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainerVariablePropertiesEditionPartForm.this, PatternsViewsRepository.ContainerVariable.Properties.classifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getClassifier()));
				}
			}

		});
		classifier.setID(PatternsViewsRepository.ContainerVariable.Properties.classifier);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainerVariable.Properties.classifier, PatternsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#getName()
	 * 
	 */
	@Override
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	@Override
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#getPattern()
	 * 
	 */
	@Override
	public EObject getPattern() {
		if (pattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initPattern(EObjectFlatComboSettings)
	 */
	@Override
	public void initPattern(EObjectFlatComboSettings settings) {
		pattern.setInput(settings);
		if (current != null) {
			pattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setPattern(EObject newValue)
	 * 
	 */
	@Override
	public void setPattern(EObject newValue) {
		if (newValue != null) {
			pattern.setSelection(new StructuredSelection(newValue));
		} else {
			pattern.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#getBindingState()
	 * 
	 */
	@Override
	public Enumerator getBindingState() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingState.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initBindingState(Object input, Enumerator current)
	 */
	@Override
	public void initBindingState(Object input, Enumerator current) {
		bindingState.setInput(input);
		bindingState.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setBindingState(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingState(Enumerator newValue) {
		bindingState.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initIncomingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initIncomingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingLink.setContentProvider(contentProvider);
		incomingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#updateIncomingLink()
	 * 
	 */
	@Override
	public void updateIncomingLink() {
	incomingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addBusinessFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#isContainedInIncomingLinkTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInIncomingLinkTable(EObject element) {
		return ((ReferencesTableSettings)incomingLink.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initOutgoingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initOutgoingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingLink.setContentProvider(contentProvider);
		outgoingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#updateOutgoingLink()
	 * 
	 */
	@Override
	public void updateOutgoingLink() {
	outgoingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addFilterOutgoingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOutgoingLink(ViewerFilter filter) {
		outgoingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addBusinessFilterOutgoingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOutgoingLink(ViewerFilter filter) {
		outgoingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#isContainedInOutgoingLinkTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInOutgoingLinkTable(EObject element) {
		return ((ReferencesTableSettings)outgoingLink.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#getBindingSemantics()
	 * 
	 */
	@Override
	public Enumerator getBindingSemantics() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingSemantics.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initBindingSemantics(Object input, Enumerator current)
	 */
	@Override
	public void initBindingSemantics(Object input, Enumerator current) {
		bindingSemantics.setInput(input);
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setBindingSemantics(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingSemantics(Enumerator newValue) {
		bindingSemantics.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#getBindingOperator()
	 * 
	 */
	@Override
	public Enumerator getBindingOperator() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingOperator.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initBindingOperator(Object input, Enumerator current)
	 */
	@Override
	public void initBindingOperator(Object input, Enumerator current) {
		bindingOperator.setInput(input);
		bindingOperator.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setBindingOperator(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingOperator(Enumerator newValue) {
		bindingOperator.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#getClassifier()
	 * 
	 */
	@Override
	public EObject getClassifier() {
		if (classifier.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) classifier.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#initClassifier(EObjectFlatComboSettings)
	 */
	@Override
	public void initClassifier(EObjectFlatComboSettings settings) {
		classifier.setInput(settings);
		if (current != null) {
			classifier.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setClassifier(EObject newValue)
	 * 
	 */
	@Override
	public void setClassifier(EObject newValue) {
		if (newValue != null) {
			classifier.setSelection(new StructuredSelection(newValue));
		} else {
			classifier.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#setClassifierButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setClassifierButtonMode(ButtonsModeEnum newValue) {
		classifier.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addFilterClassifier(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToClassifier(ViewerFilter filter) {
		classifier.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainerVariablePropertiesEditionPart#addBusinessFilterClassifier(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToClassifier(ViewerFilter filter) {
		classifier.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.ContainerVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
