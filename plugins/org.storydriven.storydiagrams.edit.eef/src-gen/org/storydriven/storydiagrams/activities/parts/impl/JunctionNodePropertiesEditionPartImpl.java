/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.activities.parts.impl;

// Start of user code for imports







import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.activities.parts.ActivitiesViewsRepository;
import org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart;
import org.storydriven.storydiagrams.activities.providers.ActivitiesMessages;


// End of user code

/**
 * 
 * 
 */
public class JunctionNodePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, JunctionNodePropertiesEditionPart {

	protected Text comment;
	protected Text name;
	protected ReferencesTable outgoing;
	protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer owningActivity;
	protected EObjectFlatComboViewer owningActivityNode;
	protected ReferencesTable incoming;
	protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public JunctionNodePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence junctionNodeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = junctionNodeStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.class);
		propertiesStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.comment);
		propertiesStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.name);
		propertiesStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.outgoing);
		propertiesStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity);
		propertiesStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode);
		propertiesStep.addStep(ActivitiesViewsRepository.JunctionNode.Properties.incoming);
		
		
		composer = new PartComposer(junctionNodeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.name) {
					return createNameText(parent);
				}
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.outgoing) {
					return createOutgoingAdvancedReferencesTable(parent);
				}
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.owningActivity) {
					return createOwningActivityFlatComboViewer(parent);
				}
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode) {
					return createOwningActivityNodeFlatComboViewer(parent);
				}
				if (key == ActivitiesViewsRepository.JunctionNode.Properties.incoming) {
					return createIncomingAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(ActivitiesMessages.JunctionNodePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ActivitiesMessages.JunctionNodePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.JunctionNode.Properties.comment, ActivitiesViewsRepository.SWT_KIND));
		comment = new Text(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		comment.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}

		});
		EditingUtils.setID(comment, ActivitiesViewsRepository.JunctionNode.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.JunctionNode.Properties.comment, ActivitiesViewsRepository.SWT_KIND), null); 
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ActivitiesMessages.JunctionNodePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.JunctionNode.Properties.name, ActivitiesViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					}
				}
			}

		});
		EditingUtils.setID(name, ActivitiesViewsRepository.JunctionNode.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.JunctionNode.Properties.name, ActivitiesViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOutgoingAdvancedReferencesTable(Composite parent) {
		this.outgoing = new ReferencesTable(ActivitiesMessages.JunctionNodePropertiesEditionPart_OutgoingLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addOutgoing(); }
			public void handleEdit(EObject element) { editOutgoing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoing(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.JunctionNode.Properties.outgoing, ActivitiesViewsRepository.SWT_KIND));
		this.outgoing.createControls(parent);
		this.outgoing.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
		outgoing.setID(ActivitiesViewsRepository.JunctionNode.Properties.outgoing);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.outgoing,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createOwningActivityFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ActivitiesMessages.JunctionNodePropertiesEditionPart_OwningActivityLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity, ActivitiesViewsRepository.SWT_KIND));
		owningActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity, ActivitiesViewsRepository.SWT_KIND));
		owningActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		owningActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.owningActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwningActivity()));
			}

		});
		GridData owningActivityData = new GridData(GridData.FILL_HORIZONTAL);
		owningActivity.setLayoutData(owningActivityData);
		owningActivity.setID(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity, ActivitiesViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOwningActivityNodeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ActivitiesMessages.JunctionNodePropertiesEditionPart_OwningActivityNodeLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode, ActivitiesViewsRepository.SWT_KIND));
		owningActivityNode = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode, ActivitiesViewsRepository.SWT_KIND));
		owningActivityNode.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		owningActivityNode.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwningActivityNode()));
			}

		});
		GridData owningActivityNodeData = new GridData(GridData.FILL_HORIZONTAL);
		owningActivityNode.setLayoutData(owningActivityNodeData);
		owningActivityNode.setID(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode, ActivitiesViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingAdvancedReferencesTable(Composite parent) {
		this.incoming = new ReferencesTable(ActivitiesMessages.JunctionNodePropertiesEditionPart_IncomingLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addIncoming(); }
			public void handleEdit(EObject element) { editIncoming(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncoming(element); }
			public void navigateTo(EObject element) { }
		});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.JunctionNode.Properties.incoming, ActivitiesViewsRepository.SWT_KIND));
		this.incoming.createControls(parent);
		this.incoming.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
		incoming.setID(ActivitiesViewsRepository.JunctionNode.Properties.incoming);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.incoming,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncoming(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JunctionNodePropertiesEditionPartImpl.this, ActivitiesViewsRepository.JunctionNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	@Override
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
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#getName()
	 * 
	 */
	@Override
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#updateOutgoing()
	 * 
	 */
	@Override
	public void updateOutgoing() {
	outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInOutgoingTable(EObject element) {
		return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#getOwningActivity()
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
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#initOwningActivity(EObjectFlatComboSettings)
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
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#setOwningActivity(EObject newValue)
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
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#setOwningActivityButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setOwningActivityButtonMode(ButtonsModeEnum newValue) {
		owningActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addFilterOwningActivity(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOwningActivity(ViewerFilter filter) {
		owningActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addBusinessFilterOwningActivity(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOwningActivity(ViewerFilter filter) {
		owningActivity.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#getOwningActivityNode()
	 * 
	 */
	@Override
	public EObject getOwningActivityNode() {
		if (owningActivityNode.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owningActivityNode.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#initOwningActivityNode(EObjectFlatComboSettings)
	 */
	@Override
	public void initOwningActivityNode(EObjectFlatComboSettings settings) {
		owningActivityNode.setInput(settings);
		if (current != null) {
			owningActivityNode.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#setOwningActivityNode(EObject newValue)
	 * 
	 */
	@Override
	public void setOwningActivityNode(EObject newValue) {
		if (newValue != null) {
			owningActivityNode.setSelection(new StructuredSelection(newValue));
		} else {
			owningActivityNode.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#setOwningActivityNodeButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setOwningActivityNodeButtonMode(ButtonsModeEnum newValue) {
		owningActivityNode.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addFilterOwningActivityNode(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOwningActivityNode(ViewerFilter filter) {
		owningActivityNode.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addBusinessFilterOwningActivityNode(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOwningActivityNode(ViewerFilter filter) {
		owningActivityNode.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#updateIncoming()
	 * 
	 */
	@Override
	public void updateIncoming() {
	incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInIncomingTable(EObject element) {
		return ((ReferencesTableSettings)incoming.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return ActivitiesMessages.JunctionNode_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
