/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;
import org.storydriven.modeling.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class LinkConstraintPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LinkConstraintPropertiesEditionPart {

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
	public LinkConstraintPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.index) {
					return createIndexText(parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.constraintType) {
					return createConstraintTypeEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.negative) {
					return createNegativeCheckbox(parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.firstLink) {
					return createFirstLinkFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.referencingObject) {
					return createReferencingObjectFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.LinkConstraint.Properties.secondLink) {
					return createSecondLinkFlatComboViewer(parent);
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
		propertiesGroup.setText(PatternsMessages.LinkConstraintPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIndexText(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.LinkConstraintPropertiesEditionPart_IndexLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.index, PatternsViewsRepository.SWT_KIND));
		index = new Text(parent, SWT.BORDER);
		GridData indexData = new GridData(GridData.FILL_HORIZONTAL);
		index.setLayoutData(indexData);
		index.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.index, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, index.getText()));
			}

		});
		index.addKeyListener(new KeyAdapter() {

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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.index, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, index.getText()));
				}
			}

		});
		EditingUtils.setID(index, PatternsViewsRepository.LinkConstraint.Properties.index);
		EditingUtils.setEEFtype(index, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.index, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.LinkConstraintPropertiesEditionPart_ConstraintTypeLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.constraintType, PatternsViewsRepository.SWT_KIND));
		constraintType = new EMFComboViewer(parent);
		constraintType.setContentProvider(new ArrayContentProvider());
		constraintType.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData constraintTypeData = new GridData(GridData.FILL_HORIZONTAL);
		constraintType.getCombo().setLayoutData(constraintTypeData);
		constraintType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.constraintType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConstraintType()));
			}

		});
		constraintType.setID(PatternsViewsRepository.LinkConstraint.Properties.constraintType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.constraintType, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNegativeCheckbox(Composite parent) {
		negative = new Button(parent, SWT.CHECK);
		negative.setText(PatternsMessages.LinkConstraintPropertiesEditionPart_NegativeLabel);
		negative.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.negative, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(negative.getSelection())));
			}

		});
		GridData negativeData = new GridData(GridData.FILL_HORIZONTAL);
		negativeData.horizontalSpan = 2;
		negative.setLayoutData(negativeData);
		EditingUtils.setID(negative, PatternsViewsRepository.LinkConstraint.Properties.negative);
		EditingUtils.setEEFtype(negative, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.negative, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFirstLinkFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.LinkConstraintPropertiesEditionPart_FirstLinkLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.firstLink, PatternsViewsRepository.SWT_KIND));
		firstLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.firstLink, PatternsViewsRepository.SWT_KIND));
		firstLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		firstLink.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.firstLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFirstLink()));
			}

		});
		GridData firstLinkData = new GridData(GridData.FILL_HORIZONTAL);
		firstLink.setLayoutData(firstLinkData);
		firstLink.setID(PatternsViewsRepository.LinkConstraint.Properties.firstLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.firstLink, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReferencingObjectFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.LinkConstraintPropertiesEditionPart_ReferencingObjectLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PatternsViewsRepository.SWT_KIND));
		referencingObject = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PatternsViewsRepository.SWT_KIND));
		referencingObject.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referencingObject.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReferencingObject()));
			}

		});
		GridData referencingObjectData = new GridData(GridData.FILL_HORIZONTAL);
		referencingObject.setLayoutData(referencingObjectData);
		referencingObject.setID(PatternsViewsRepository.LinkConstraint.Properties.referencingObject);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.referencingObject, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSecondLinkFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.LinkConstraintPropertiesEditionPart_SecondLinkLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.secondLink, PatternsViewsRepository.SWT_KIND));
		secondLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkConstraint.Properties.secondLink, PatternsViewsRepository.SWT_KIND));
		secondLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		secondLink.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.LinkConstraint.Properties.secondLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSecondLink()));
			}

		});
		GridData secondLinkData = new GridData(GridData.FILL_HORIZONTAL);
		secondLink.setLayoutData(secondLinkData);
		secondLink.setID(PatternsViewsRepository.LinkConstraint.Properties.secondLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkConstraint.Properties.secondLink, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#getIndex()
	 * 
	 */
	public String getIndex() {
		return index.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setIndex(String newValue)
	 * 
	 */
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
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#getConstraintType()
	 * 
	 */
	public Enumerator getConstraintType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) constraintType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#initConstraintType(EEnum eenum, Enumerator current)
	 */
	public void initConstraintType(EEnum eenum, Enumerator current) {
		constraintType.setInput(eenum.getELiterals());
		constraintType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setConstraintType(Enumerator newValue)
	 * 
	 */
	public void setConstraintType(Enumerator newValue) {
		constraintType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#getNegative()
	 * 
	 */
	public Boolean getNegative() {
		return Boolean.valueOf(negative.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setNegative(Boolean newValue)
	 * 
	 */
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
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#getFirstLink()
	 * 
	 */
	public EObject getFirstLink() {
		if (firstLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) firstLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#initFirstLink(EObjectFlatComboSettings)
	 */
	public void initFirstLink(EObjectFlatComboSettings settings) {
		firstLink.setInput(settings);
		if (current != null) {
			firstLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setFirstLink(EObject newValue)
	 * 
	 */
	public void setFirstLink(EObject newValue) {
		if (newValue != null) {
			firstLink.setSelection(new StructuredSelection(newValue));
		} else {
			firstLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setFirstLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFirstLinkButtonMode(ButtonsModeEnum newValue) {
		firstLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#addFilterFirstLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFirstLink(ViewerFilter filter) {
		firstLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#addBusinessFilterFirstLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFirstLink(ViewerFilter filter) {
		firstLink.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#getReferencingObject()
	 * 
	 */
	public EObject getReferencingObject() {
		if (referencingObject.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencingObject.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#initReferencingObject(EObjectFlatComboSettings)
	 */
	public void initReferencingObject(EObjectFlatComboSettings settings) {
		referencingObject.setInput(settings);
		if (current != null) {
			referencingObject.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setReferencingObject(EObject newValue)
	 * 
	 */
	public void setReferencingObject(EObject newValue) {
		if (newValue != null) {
			referencingObject.setSelection(new StructuredSelection(newValue));
		} else {
			referencingObject.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setReferencingObjectButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencingObjectButtonMode(ButtonsModeEnum newValue) {
		referencingObject.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#addFilterReferencingObject(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencingObject(ViewerFilter filter) {
		referencingObject.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#addBusinessFilterReferencingObject(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencingObject(ViewerFilter filter) {
		referencingObject.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#getSecondLink()
	 * 
	 */
	public EObject getSecondLink() {
		if (secondLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) secondLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#initSecondLink(EObjectFlatComboSettings)
	 */
	public void initSecondLink(EObjectFlatComboSettings settings) {
		secondLink.setInput(settings);
		if (current != null) {
			secondLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setSecondLink(EObject newValue)
	 * 
	 */
	public void setSecondLink(EObject newValue) {
		if (newValue != null) {
			secondLink.setSelection(new StructuredSelection(newValue));
		} else {
			secondLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#setSecondLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSecondLinkButtonMode(ButtonsModeEnum newValue) {
		secondLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#addFilterSecondLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSecondLink(ViewerFilter filter) {
		secondLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart#addBusinessFilterSecondLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSecondLink(ViewerFilter filter) {
		secondLink.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternsMessages.LinkConstraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
