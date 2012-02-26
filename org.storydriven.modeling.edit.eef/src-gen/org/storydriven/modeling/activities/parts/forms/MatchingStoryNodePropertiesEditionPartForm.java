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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart;
import org.storydriven.modeling.activities.providers.ActivitiesMessages;


// End of user code

/**
 * 
 * 
 */
public class MatchingStoryNodePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MatchingStoryNodePropertiesEditionPart {

	protected Text name;
	protected Text comment;
		protected ReferencesTable outgoing;
		protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer owningActivity;
	protected EObjectFlatComboViewer owningActivityNode;
		protected ReferencesTable incoming;
		protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();
	protected Button forEach;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MatchingStoryNodePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence matchingStoryNodeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = matchingStoryNodeStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.class);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.name);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.comment);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming);
		propertiesStep.addStep(ActivitiesViewsRepository.MatchingStoryNode.Properties.forEach);
		
		
		composer = new PartComposer(matchingStoryNodeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing) {
					return createOutgoingReferencesTable(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity) {
					return createOwningActivityFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode) {
					return createOwningActivityNodeFlatComboViewer(parent, widgetFactory);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming) {
					return createIncomingReferencesTable(widgetFactory, parent);
				}
				if (key == ActivitiesViewsRepository.MatchingStoryNode.Properties.forEach) {
					return createForEachCheckbox(widgetFactory, parent);
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
		propertiesSection.setText(ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.MatchingStoryNode.Properties.name, ActivitiesViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ActivitiesViewsRepository.MatchingStoryNode.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.name, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.MatchingStoryNode.Properties.comment, ActivitiesViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ActivitiesViewsRepository.MatchingStoryNode.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.comment, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOutgoingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoing = new ReferencesTable(ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_OutgoingLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoing(); }
			public void handleEdit(EObject element) { editOutgoing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoing(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing, ActivitiesViewsRepository.FORM_KIND));
		this.outgoing.createControls(parent, widgetFactory);
		this.outgoing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
		outgoing.setID(ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing);
		outgoing.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoing() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoing.getInput(), outgoingFilters, outgoingBusinessFilters,
		"outgoing", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoing.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoing(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoing(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoing.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOwningActivityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_OwningActivityLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity, ActivitiesViewsRepository.FORM_KIND));
		owningActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity, ActivitiesViewsRepository.FORM_KIND));
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
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningActivity()));
			}

		});
		owningActivity.setID(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivity, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOwningActivityNodeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_OwningActivityNodeLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode, ActivitiesViewsRepository.FORM_KIND));
		owningActivityNode = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode, ActivitiesViewsRepository.FORM_KIND));
		widgetFactory.adapt(owningActivityNode);
		owningActivityNode.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData owningActivityNodeData = new GridData(GridData.FILL_HORIZONTAL);
		owningActivityNode.setLayoutData(owningActivityNodeData);
		owningActivityNode.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningActivityNode()));
			}

		});
		owningActivityNode.setID(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.owningActivityNode, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incoming = new ReferencesTable(ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_IncomingLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncoming(); }
			public void handleEdit(EObject element) { editIncoming(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncoming(element); }
			public void navigateTo(EObject element) { }
		});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming, ActivitiesViewsRepository.FORM_KIND));
		this.incoming.createControls(parent, widgetFactory);
		this.incoming.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
		incoming.setID(ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming);
		incoming.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncoming() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incoming.getInput(), incomingFilters, incomingBusinessFilters,
		"incoming", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incoming.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncoming(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncoming(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void editIncoming(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incoming.refresh();
			}
		}
	}

	
	protected Composite createForEachCheckbox(FormToolkit widgetFactory, Composite parent) {
		forEach = widgetFactory.createButton(parent, ActivitiesMessages.MatchingStoryNodePropertiesEditionPart_ForEachLabel, SWT.CHECK);
		forEach.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingStoryNodePropertiesEditionPartForm.this, ActivitiesViewsRepository.MatchingStoryNode.Properties.forEach, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(forEach.getSelection())));
			}

		});
		GridData forEachData = new GridData(GridData.FILL_HORIZONTAL);
		forEachData.horizontalSpan = 2;
		forEach.setLayoutData(forEachData);
		EditingUtils.setID(forEach, ActivitiesViewsRepository.MatchingStoryNode.Properties.forEach);
		EditingUtils.setEEFtype(forEach, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.MatchingStoryNode.Properties.forEach, ActivitiesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#updateOutgoing()
	 * 
	 */
	public void updateOutgoing() {
	outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
		return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#getOwningActivity()
	 * 
	 */
	public EObject getOwningActivity() {
		if (owningActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owningActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#initOwningActivity(EObjectFlatComboSettings)
	 */
	public void initOwningActivity(EObjectFlatComboSettings settings) {
		owningActivity.setInput(settings);
		if (current != null) {
			owningActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setOwningActivity(EObject newValue)
	 * 
	 */
	public void setOwningActivity(EObject newValue) {
		if (newValue != null) {
			owningActivity.setSelection(new StructuredSelection(newValue));
		} else {
			owningActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setOwningActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningActivityButtonMode(ButtonsModeEnum newValue) {
		owningActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addFilterOwningActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwningActivity(ViewerFilter filter) {
		owningActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addBusinessFilterOwningActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwningActivity(ViewerFilter filter) {
		owningActivity.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#getOwningActivityNode()
	 * 
	 */
	public EObject getOwningActivityNode() {
		if (owningActivityNode.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owningActivityNode.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#initOwningActivityNode(EObjectFlatComboSettings)
	 */
	public void initOwningActivityNode(EObjectFlatComboSettings settings) {
		owningActivityNode.setInput(settings);
		if (current != null) {
			owningActivityNode.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setOwningActivityNode(EObject newValue)
	 * 
	 */
	public void setOwningActivityNode(EObject newValue) {
		if (newValue != null) {
			owningActivityNode.setSelection(new StructuredSelection(newValue));
		} else {
			owningActivityNode.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setOwningActivityNodeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningActivityNodeButtonMode(ButtonsModeEnum newValue) {
		owningActivityNode.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addFilterOwningActivityNode(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwningActivityNode(ViewerFilter filter) {
		owningActivityNode.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addBusinessFilterOwningActivityNode(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwningActivityNode(ViewerFilter filter) {
		owningActivityNode.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#updateIncoming()
	 * 
	 */
	public void updateIncoming() {
	incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element) {
		return ((ReferencesTableSettings)incoming.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#getForEach()
	 * 
	 */
	public Boolean getForEach() {
		return Boolean.valueOf(forEach.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.activities.parts.MatchingStoryNodePropertiesEditionPart#setForEach(Boolean newValue)
	 * 
	 */
	public void setForEach(Boolean newValue) {
		if (newValue != null) {
			forEach.setSelection(newValue.booleanValue());
		} else {
			forEach.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ActivitiesMessages.MatchingStoryNode_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
