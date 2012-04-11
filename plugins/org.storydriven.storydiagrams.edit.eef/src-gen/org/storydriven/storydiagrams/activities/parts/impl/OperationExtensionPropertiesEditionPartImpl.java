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
import org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart;
import org.storydriven.storydiagrams.activities.providers.ActivitiesMessages;


// End of user code

/**
 * 
 * 
 */
public class OperationExtensionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OperationExtensionPropertiesEditionPart {

	protected Text comment;
	protected ReferencesTable inParameter;
	protected List<ViewerFilter> inParameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inParameterFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outParameter;
	protected List<ViewerFilter> outParameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outParameterFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer extendableBase;



	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OperationExtensionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence operationExtensionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = operationExtensionStep.addStep(ActivitiesViewsRepository.OperationExtension.Properties.class);
		propertiesStep.addStep(ActivitiesViewsRepository.OperationExtension.Properties.comment);
		propertiesStep.addStep(ActivitiesViewsRepository.OperationExtension.Properties.inParameter);
		propertiesStep.addStep(ActivitiesViewsRepository.OperationExtension.Properties.outParameter);
		propertiesStep.addStep(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase);
		
		
		composer = new PartComposer(operationExtensionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ActivitiesViewsRepository.OperationExtension.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ActivitiesViewsRepository.OperationExtension.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ActivitiesViewsRepository.OperationExtension.Properties.inParameter) {
					return createInParameterAdvancedReferencesTable(parent);
				}
				if (key == ActivitiesViewsRepository.OperationExtension.Properties.outParameter) {
					return createOutParameterAdvancedReferencesTable(parent);
				}
				if (key == ActivitiesViewsRepository.OperationExtension.Properties.extendableBase) {
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
		propertiesGroup.setText(ActivitiesMessages.OperationExtensionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ActivitiesMessages.OperationExtensionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.OperationExtension.Properties.comment, ActivitiesViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}

		});
		EditingUtils.setID(comment, ActivitiesViewsRepository.OperationExtension.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.OperationExtension.Properties.comment, ActivitiesViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInParameterAdvancedReferencesTable(Composite parent) {
		this.inParameter = new ReferencesTable(ActivitiesMessages.OperationExtensionPropertiesEditionPart_InParameterLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addInParameter(); }
			public void handleEdit(EObject element) { editInParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.inParameter.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.OperationExtension.Properties.inParameter, ActivitiesViewsRepository.SWT_KIND));
		this.inParameter.createControls(parent);
		this.inParameter.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.inParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inParameterData = new GridData(GridData.FILL_HORIZONTAL);
		inParameterData.horizontalSpan = 3;
		this.inParameter.setLayoutData(inParameterData);
		this.inParameter.disableMove();
		inParameter.setID(ActivitiesViewsRepository.OperationExtension.Properties.inParameter);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.inParameter,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOutParameterAdvancedReferencesTable(Composite parent) {
		this.outParameter = new ReferencesTable(ActivitiesMessages.OperationExtensionPropertiesEditionPart_OutParameterLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addOutParameter(); }
			public void handleEdit(EObject element) { editOutParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.outParameter.setHelpText(propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.OperationExtension.Properties.outParameter, ActivitiesViewsRepository.SWT_KIND));
		this.outParameter.createControls(parent);
		this.outParameter.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.outParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outParameterData = new GridData(GridData.FILL_HORIZONTAL);
		outParameterData.horizontalSpan = 3;
		this.outParameter.setLayoutData(outParameterData);
		this.outParameter.disableMove();
		outParameter.setID(ActivitiesViewsRepository.OperationExtension.Properties.outParameter);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.outParameter,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createExtendableBaseFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ActivitiesMessages.OperationExtensionPropertiesEditionPart_ExtendableBaseLabel, propertiesEditionComponent.isRequired(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase, ActivitiesViewsRepository.SWT_KIND));
		extendableBase = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase, ActivitiesViewsRepository.SWT_KIND));
		extendableBase.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		extendableBase.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationExtensionPropertiesEditionPartImpl.this, ActivitiesViewsRepository.OperationExtension.Properties.extendableBase, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getExtendableBase()));
			}

		});
		GridData extendableBaseData = new GridData(GridData.FILL_HORIZONTAL);
		extendableBase.setLayoutData(extendableBaseData);
		extendableBase.setID(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase, ActivitiesViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#initInParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initInParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inParameter.setContentProvider(contentProvider);
		inParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#updateInParameter()
	 * 
	 */
	@Override
	public void updateInParameter() {
	inParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#addFilterInParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToInParameter(ViewerFilter filter) {
		inParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#addBusinessFilterInParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToInParameter(ViewerFilter filter) {
		inParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#isContainedInInParameterTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInInParameterTable(EObject element) {
		return ((ReferencesTableSettings)inParameter.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#initOutParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initOutParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outParameter.setContentProvider(contentProvider);
		outParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#updateOutParameter()
	 * 
	 */
	@Override
	public void updateOutParameter() {
	outParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#addFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOutParameter(ViewerFilter filter) {
		outParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#addBusinessFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOutParameter(ViewerFilter filter) {
		outParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#isContainedInOutParameterTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInOutParameterTable(EObject element) {
		return ((ReferencesTableSettings)outParameter.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#getExtendableBase()
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
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#initExtendableBase(EObjectFlatComboSettings)
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
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#setExtendableBase(EObject newValue)
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
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#setExtendableBaseButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setExtendableBaseButtonMode(ButtonsModeEnum newValue) {
		extendableBase.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#addFilterExtendableBase(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToExtendableBase(ViewerFilter filter) {
		extendableBase.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.parts.OperationExtensionPropertiesEditionPart#addBusinessFilterExtendableBase(ViewerFilter filter)
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
		return ActivitiesMessages.OperationExtension_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
