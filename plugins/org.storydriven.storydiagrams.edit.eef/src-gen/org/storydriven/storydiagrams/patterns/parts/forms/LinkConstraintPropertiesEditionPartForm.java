/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
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
import org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class LinkConstraintPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LinkConstraintPropertiesEditionPart {

	protected Text index;
	protected EMFComboViewer constraintType;
	protected Button negative;
	protected EObjectFlatComboViewer firstLink;
	protected EObjectFlatComboViewer referencingObject;
	protected EObjectFlatComboViewer secondLink;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LinkConstraintPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence linkConstraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = linkConstraintStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.index);
		propertiesStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.constraintType);
		propertiesStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.negative);
		propertiesStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.firstLink);
		propertiesStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.referencingObject);
		propertiesStep.addStep(PatternsViewsRepository.LinkConstraint.Properties.secondLink);
		
		
		composer = new PartComposer(linkConstraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.LinkConstraint.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.index) {
					return 		createIndexText(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.constraintType) {
					return createConstraintTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.negative) {
					return createNegativeCheckbox(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.firstLink) {
					return createFirstLinkFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.referencingObject) {
					return createReferencingObjectFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.secondLink) {
					return createSecondLinkFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(PatternsMessages.LinkConstraintPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIndexText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkConstraintPropertiesEditionPart_IndexLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.index, PatternsViewsRepository.FORM_KIND));
		index = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		index.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData indexData = new GridData(GridData.FILL_HORIZONTAL);
		index.setLayoutData(indexData);
		index.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.index, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, index.getText()));
				}
			}
		});
		index.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.index, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, index.getText()));
					}
				}
			}
		});
		EditingUtils.setID(index, PatternsViewsRepository.LinkConstraint.Properties.index);
		EditingUtils.setEEFtype(index, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.index, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createConstraintTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkConstraintPropertiesEditionPart_ConstraintTypeLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.constraintType, PatternsViewsRepository.FORM_KIND));
		constraintType = new EMFComboViewer(parent);
		constraintType.setContentProvider(new ArrayContentProvider());
		constraintType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData constraintTypeData = new GridData(GridData.FILL_HORIZONTAL);
		constraintType.getCombo().setLayoutData(constraintTypeData);
		constraintType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.constraintType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConstraintType()));
				}
			}

		});
		constraintType.setID(PatternsViewsRepository.LinkConstraint.Properties.constraintType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.constraintType, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createNegativeCheckbox(FormToolkit widgetFactory, Composite parent) {
		negative = widgetFactory.createButton(parent, PatternsMessages.LinkConstraintPropertiesEditionPart_NegativeLabel, SWT.CHECK);
		negative.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.negative, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(negative.getSelection())));
				}
			}

		});
		GridData negativeData = new GridData(GridData.FILL_HORIZONTAL);
		negativeData.horizontalSpan = 2;
		negative.setLayoutData(negativeData);
		EditingUtils.setID(negative, PatternsViewsRepository.LinkConstraint.Properties.negative);
		EditingUtils.setEEFtype(negative, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.negative, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFirstLinkFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkConstraintPropertiesEditionPart_FirstLinkLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.firstLink, PatternsViewsRepository.FORM_KIND));
		firstLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.firstLink, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(firstLink);
		firstLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData firstLinkData = new GridData(GridData.FILL_HORIZONTAL);
		firstLink.setLayoutData(firstLinkData);
		firstLink.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.firstLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFirstLink()));
				}
			}

		});
		firstLink.setID(PatternsViewsRepository.LinkConstraint.Properties.firstLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.firstLink, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReferencingObjectFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkConstraintPropertiesEditionPart_ReferencingObjectLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PatternsViewsRepository.FORM_KIND));
		referencingObject = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencingObject);
		referencingObject.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencingObjectData = new GridData(GridData.FILL_HORIZONTAL);
		referencingObject.setLayoutData(referencingObjectData);
		referencingObject.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencingObject()));
				}
			}

		});
		referencingObject.setID(PatternsViewsRepository.LinkConstraint.Properties.referencingObject);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSecondLinkFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkConstraintPropertiesEditionPart_SecondLinkLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.secondLink, PatternsViewsRepository.FORM_KIND));
		secondLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.secondLink, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(secondLink);
		secondLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData secondLinkData = new GridData(GridData.FILL_HORIZONTAL);
		secondLink.setLayoutData(secondLinkData);
		secondLink.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartForm.this, PatternsViewsRepository.LinkConstraint.Properties.secondLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSecondLink()));
				}
			}

		});
		secondLink.setID(PatternsViewsRepository.LinkConstraint.Properties.secondLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.secondLink, PatternsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#getIndex()
	 * 
	 */
	@Override
	public String getIndex() {
		return index.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setIndex(String newValue)
	 * 
	 */
	@Override
	public void setIndex(String newValue) {
		if (newValue != null) {
			index.setText(newValue);
		} else {
			index.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#getConstraintType()
	 * 
	 */
	@Override
	public Enumerator getConstraintType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) constraintType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#initConstraintType(Object input, Enumerator current)
	 */
	@Override
	public void initConstraintType(Object input, Enumerator current) {
		constraintType.setInput(input);
		constraintType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setConstraintType(Enumerator newValue)
	 * 
	 */
	@Override
	public void setConstraintType(Enumerator newValue) {
		constraintType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#getNegative()
	 * 
	 */
	@Override
	public Boolean getNegative() {
		return Boolean.valueOf(negative.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setNegative(Boolean newValue)
	 * 
	 */
	@Override
	public void setNegative(Boolean newValue) {
		if (newValue != null) {
			negative.setSelection(newValue.booleanValue());
		} else {
			negative.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#getFirstLink()
	 * 
	 */
	@Override
	public EObject getFirstLink() {
		if (firstLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) firstLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#initFirstLink(EObjectFlatComboSettings)
	 */
	@Override
	public void initFirstLink(EObjectFlatComboSettings settings) {
		firstLink.setInput(settings);
		if (current != null) {
			firstLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setFirstLink(EObject newValue)
	 * 
	 */
	@Override
	public void setFirstLink(EObject newValue) {
		if (newValue != null) {
			firstLink.setSelection(new StructuredSelection(newValue));
		} else {
			firstLink.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setFirstLinkButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setFirstLinkButtonMode(ButtonsModeEnum newValue) {
		firstLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#addFilterFirstLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToFirstLink(ViewerFilter filter) {
		firstLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#addBusinessFilterFirstLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToFirstLink(ViewerFilter filter) {
		firstLink.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#getReferencingObject()
	 * 
	 */
	@Override
	public EObject getReferencingObject() {
		if (referencingObject.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencingObject.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#initReferencingObject(EObjectFlatComboSettings)
	 */
	@Override
	public void initReferencingObject(EObjectFlatComboSettings settings) {
		referencingObject.setInput(settings);
		if (current != null) {
			referencingObject.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setReferencingObject(EObject newValue)
	 * 
	 */
	@Override
	public void setReferencingObject(EObject newValue) {
		if (newValue != null) {
			referencingObject.setSelection(new StructuredSelection(newValue));
		} else {
			referencingObject.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setReferencingObjectButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setReferencingObjectButtonMode(ButtonsModeEnum newValue) {
		referencingObject.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#addFilterReferencingObject(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToReferencingObject(ViewerFilter filter) {
		referencingObject.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#addBusinessFilterReferencingObject(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToReferencingObject(ViewerFilter filter) {
		referencingObject.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#getSecondLink()
	 * 
	 */
	@Override
	public EObject getSecondLink() {
		if (secondLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) secondLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#initSecondLink(EObjectFlatComboSettings)
	 */
	@Override
	public void initSecondLink(EObjectFlatComboSettings settings) {
		secondLink.setInput(settings);
		if (current != null) {
			secondLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setSecondLink(EObject newValue)
	 * 
	 */
	@Override
	public void setSecondLink(EObject newValue) {
		if (newValue != null) {
			secondLink.setSelection(new StructuredSelection(newValue));
		} else {
			secondLink.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#setSecondLinkButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setSecondLinkButtonMode(ButtonsModeEnum newValue) {
		secondLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#addFilterSecondLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToSecondLink(ViewerFilter filter) {
		secondLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.LinkConstraintPropertiesEditionPart#addBusinessFilterSecondLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToSecondLink(ViewerFilter filter) {
		secondLink.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.LinkConstraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
