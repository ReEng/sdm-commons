/**
 * Generated with Acceleo
 */
package de.fujaba.modelinstance.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.fujaba.modelinstance.parts.ModelinstanceViewsRepository;
import de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart;
import de.fujaba.modelinstance.providers.ModelinstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class RootNodePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RootNodePropertiesEditionPart {

protected ReferencesTable categories;
protected List<ViewerFilter> categoriesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> categoriesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ecoreDataTypes;
	protected List<ViewerFilter> ecoreDataTypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ecoreDataTypesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RootNodePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
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
	public void createControls(Composite view) { 
		CompositionSequence rootNodeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rootNodeStep.addStep(ModelinstanceViewsRepository.RootNode.Properties.class);
		propertiesStep.addStep(ModelinstanceViewsRepository.RootNode.Properties.categories);
		propertiesStep.addStep(ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes);
		
		
		composer = new PartComposer(rootNodeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ModelinstanceViewsRepository.RootNode.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ModelinstanceViewsRepository.RootNode.Properties.categories) {
					return createCategoriesAdvancedTableComposition(parent);
				}
				if (key == ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes) {
					return createEcoreDataTypesAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(ModelinstanceMessages.RootNodePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCategoriesAdvancedTableComposition(Composite parent) {
		this.categories = new ReferencesTable(ModelinstanceMessages.RootNodePropertiesEditionPart_CategoriesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				categories.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				categories.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				categories.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				categories.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.categoriesFilters) {
			this.categories.addFilter(filter);
		}
		this.categories.setHelpText(propertiesEditionComponent.getHelpContent(ModelinstanceViewsRepository.RootNode.Properties.categories, ModelinstanceViewsRepository.SWT_KIND));
		this.categories.createControls(parent);
		this.categories.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.categories, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoriesData = new GridData(GridData.FILL_HORIZONTAL);
		categoriesData.horizontalSpan = 3;
		this.categories.setLayoutData(categoriesData);
		this.categories.setLowerBound(0);
		this.categories.setUpperBound(-1);
		categories.setID(ModelinstanceViewsRepository.RootNode.Properties.categories);
		categories.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEcoreDataTypesAdvancedReferencesTable(Composite parent) {
		this.ecoreDataTypes = new ReferencesTable(ModelinstanceMessages.RootNodePropertiesEditionPart_EcoreDataTypesLabel, new ReferencesTableListener() {
			public void handleAdd() { addEcoreDataTypes(); }
			public void handleEdit(EObject element) { editEcoreDataTypes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEcoreDataTypes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEcoreDataTypes(element); }
			public void navigateTo(EObject element) { }
		});
		this.ecoreDataTypes.setHelpText(propertiesEditionComponent.getHelpContent(ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes, ModelinstanceViewsRepository.SWT_KIND));
		this.ecoreDataTypes.createControls(parent);
		this.ecoreDataTypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ecoreDataTypesData = new GridData(GridData.FILL_HORIZONTAL);
		ecoreDataTypesData.horizontalSpan = 3;
		this.ecoreDataTypes.setLayoutData(ecoreDataTypesData);
		this.ecoreDataTypes.disableMove();
		ecoreDataTypes.setID(ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes);
		ecoreDataTypes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEcoreDataTypes() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ecoreDataTypes.getInput(), ecoreDataTypesFilters, ecoreDataTypesBusinessFilters,
		"ecoreDataTypes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ecoreDataTypes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEcoreDataTypes(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ecoreDataTypes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEcoreDataTypes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootNodePropertiesEditionPartImpl.this, ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ecoreDataTypes.refresh();
	}

	/**
	 * 
	 */
	protected void editEcoreDataTypes(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ecoreDataTypes.refresh();
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
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#initCategories(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCategories(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		categories.setContentProvider(contentProvider);
		categories.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#updateCategories()
	 * 
	 */
	public void updateCategories() {
	categories.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#addFilterCategories(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategories(ViewerFilter filter) {
		categoriesFilters.add(filter);
		if (this.categories != null) {
			this.categories.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#addBusinessFilterCategories(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategories(ViewerFilter filter) {
		categoriesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#isContainedInCategoriesTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoriesTable(EObject element) {
		return ((ReferencesTableSettings)categories.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#initEcoreDataTypes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEcoreDataTypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ecoreDataTypes.setContentProvider(contentProvider);
		ecoreDataTypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#updateEcoreDataTypes()
	 * 
	 */
	public void updateEcoreDataTypes() {
	ecoreDataTypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#addFilterEcoreDataTypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEcoreDataTypes(ViewerFilter filter) {
		ecoreDataTypesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#addBusinessFilterEcoreDataTypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEcoreDataTypes(ViewerFilter filter) {
		ecoreDataTypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart#isContainedInEcoreDataTypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInEcoreDataTypesTable(EObject element) {
		return ((ReferencesTableSettings)ecoreDataTypes.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ModelinstanceMessages.RootNode_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
