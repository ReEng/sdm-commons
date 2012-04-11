/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.parts.forms;

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
import org.storydriven.storydiagrams.calls.parts.CallsViewsRepository;
import org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart;
import org.storydriven.storydiagrams.calls.providers.CallsMessages;


// End of user code

/**
 * 
 * 
 */
public class OpaqueCallablePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, OpaqueCallablePropertiesEditionPart {

	protected Text comment;
		protected ReferencesTable inParameter;
		protected List<ViewerFilter> inParameterBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> inParameterFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable outParameter;
		protected List<ViewerFilter> outParameterBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outParameterFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected EObjectFlatComboViewer callExpression;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OpaqueCallablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence opaqueCallableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = opaqueCallableStep.addStep(CallsViewsRepository.OpaqueCallable.Properties.class);
		propertiesStep.addStep(CallsViewsRepository.OpaqueCallable.Properties.comment);
		propertiesStep.addStep(CallsViewsRepository.OpaqueCallable.Properties.inParameter);
		propertiesStep.addStep(CallsViewsRepository.OpaqueCallable.Properties.outParameter);
		propertiesStep.addStep(CallsViewsRepository.OpaqueCallable.Properties.name);
		propertiesStep.addStep(CallsViewsRepository.OpaqueCallable.Properties.callExpression);
		
		
		composer = new PartComposer(opaqueCallableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CallsViewsRepository.OpaqueCallable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CallsViewsRepository.OpaqueCallable.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == CallsViewsRepository.OpaqueCallable.Properties.inParameter) {
					return createInParameterReferencesTable(widgetFactory, parent);
				}
				if (key == CallsViewsRepository.OpaqueCallable.Properties.outParameter) {
					return createOutParameterReferencesTable(widgetFactory, parent);
				}
				if (key == CallsViewsRepository.OpaqueCallable.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == CallsViewsRepository.OpaqueCallable.Properties.callExpression) {
					return createCallExpressionFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(CallsMessages.OpaqueCallablePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, CallsMessages.OpaqueCallablePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.OpaqueCallable.Properties.comment, CallsViewsRepository.FORM_KIND));
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
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
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, CallsViewsRepository.OpaqueCallable.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.OpaqueCallable.Properties.comment, CallsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInParameterReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.inParameter = new ReferencesTable(CallsMessages.OpaqueCallablePropertiesEditionPart_InParameterLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener	() {
			@Override
			public void handleAdd() { addInParameter(); }
			@Override
			public void handleEdit(EObject element) { editInParameter(element); }
			@Override
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInParameter(element, oldIndex, newIndex); }
			@Override
			public void handleRemove(EObject element) { removeFromInParameter(element); }
			@Override
			public void navigateTo(EObject element) { }
		});
		this.inParameter.setHelpText(propertiesEditionComponent.getHelpContent(CallsViewsRepository.OpaqueCallable.Properties.inParameter, CallsViewsRepository.FORM_KIND));
		this.inParameter.createControls(parent, widgetFactory);
		this.inParameter.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.inParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inParameterData = new GridData(GridData.FILL_HORIZONTAL);
		inParameterData.horizontalSpan = 3;
		this.inParameter.setLayoutData(inParameterData);
		this.inParameter.disableMove();
		inParameter.setID(CallsViewsRepository.OpaqueCallable.Properties.inParameter);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.inParameter,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.outParameter = new ReferencesTable(CallsMessages.OpaqueCallablePropertiesEditionPart_OutParameterLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener	() {
			@Override
			public void handleAdd() { addOutParameter(); }
			@Override
			public void handleEdit(EObject element) { editOutParameter(element); }
			@Override
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutParameter(element, oldIndex, newIndex); }
			@Override
			public void handleRemove(EObject element) { removeFromOutParameter(element); }
			@Override
			public void navigateTo(EObject element) { }
		});
		this.outParameter.setHelpText(propertiesEditionComponent.getHelpContent(CallsViewsRepository.OpaqueCallable.Properties.outParameter, CallsViewsRepository.FORM_KIND));
		this.outParameter.createControls(parent, widgetFactory);
		this.outParameter.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.outParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outParameterData = new GridData(GridData.FILL_HORIZONTAL);
		outParameterData.horizontalSpan = 3;
		this.outParameter.setLayoutData(outParameterData);
		this.outParameter.disableMove();
		outParameter.setID(CallsViewsRepository.OpaqueCallable.Properties.outParameter);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.outParameter,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, CallsMessages.OpaqueCallablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.OpaqueCallable.Properties.name, CallsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					}
				}
			}
		});
		EditingUtils.setID(name, CallsViewsRepository.OpaqueCallable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.OpaqueCallable.Properties.name, CallsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCallExpressionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, CallsMessages.OpaqueCallablePropertiesEditionPart_CallExpressionLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.OpaqueCallable.Properties.callExpression, CallsViewsRepository.FORM_KIND));
		callExpression = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CallsViewsRepository.OpaqueCallable.Properties.callExpression, CallsViewsRepository.FORM_KIND));
		widgetFactory.adapt(callExpression);
		callExpression.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData callExpressionData = new GridData(GridData.FILL_HORIZONTAL);
		callExpression.setLayoutData(callExpressionData);
		callExpression.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueCallablePropertiesEditionPartForm.this, CallsViewsRepository.OpaqueCallable.Properties.callExpression, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCallExpression()));
				}
			}

		});
		callExpression.setID(CallsViewsRepository.OpaqueCallable.Properties.callExpression);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.OpaqueCallable.Properties.callExpression, CallsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#initInParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#updateInParameter()
	 * 
	 */
	@Override
	public void updateInParameter() {
	inParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#addFilterInParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToInParameter(ViewerFilter filter) {
		inParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#addBusinessFilterInParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToInParameter(ViewerFilter filter) {
		inParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#isContainedInInParameterTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInInParameterTable(EObject element) {
		return ((ReferencesTableSettings)inParameter.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#initOutParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#updateOutParameter()
	 * 
	 */
	@Override
	public void updateOutParameter() {
	outParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#addFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOutParameter(ViewerFilter filter) {
		outParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#addBusinessFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOutParameter(ViewerFilter filter) {
		outParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#isContainedInOutParameterTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInOutParameterTable(EObject element) {
		return ((ReferencesTableSettings)outParameter.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#getName()
	 * 
	 */
	@Override
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#getCallExpression()
	 * 
	 */
	@Override
	public EObject getCallExpression() {
		if (callExpression.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) callExpression.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#initCallExpression(EObjectFlatComboSettings)
	 */
	@Override
	public void initCallExpression(EObjectFlatComboSettings settings) {
		callExpression.setInput(settings);
		if (current != null) {
			callExpression.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#setCallExpression(EObject newValue)
	 * 
	 */
	@Override
	public void setCallExpression(EObject newValue) {
		if (newValue != null) {
			callExpression.setSelection(new StructuredSelection(newValue));
		} else {
			callExpression.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#setCallExpressionButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setCallExpressionButtonMode(ButtonsModeEnum newValue) {
		callExpression.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#addFilterCallExpression(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToCallExpression(ViewerFilter filter) {
		callExpression.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart#addBusinessFilterCallExpression(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToCallExpression(ViewerFilter filter) {
		callExpression.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return CallsMessages.OpaqueCallable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
