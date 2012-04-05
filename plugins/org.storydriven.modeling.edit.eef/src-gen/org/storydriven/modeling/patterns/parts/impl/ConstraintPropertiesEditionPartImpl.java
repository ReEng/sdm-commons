/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;
import org.storydriven.modeling.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class ConstraintPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConstraintPropertiesEditionPart {

	protected EObjectFlatComboViewer pattern;
	protected EObjectFlatComboViewer objectVariable;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConstraintPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence constraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = constraintStep.addStep(PatternsViewsRepository.Constraint.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.Constraint.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.Constraint.Properties.objectVariable);
		
		
		composer = new PartComposer(constraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.Constraint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.Constraint.Properties.pattern) {
					return createPatternFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.Constraint.Properties.objectVariable) {
					return createObjectVariableFlatComboViewer(parent);
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
		propertiesGroup.setText(PatternsMessages.ConstraintPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ConstraintPropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.Constraint.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.Constraint.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.Constraint.Properties.pattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.setID(PatternsViewsRepository.Constraint.Properties.pattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.Constraint.Properties.pattern, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createObjectVariableFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ConstraintPropertiesEditionPart_ObjectVariableLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.Constraint.Properties.objectVariable, PatternsViewsRepository.SWT_KIND));
		objectVariable = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.Constraint.Properties.objectVariable, PatternsViewsRepository.SWT_KIND));
		objectVariable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		objectVariable.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, PatternsViewsRepository.Constraint.Properties.objectVariable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getObjectVariable()));
			}

		});
		GridData objectVariableData = new GridData(GridData.FILL_HORIZONTAL);
		objectVariable.setLayoutData(objectVariableData);
		objectVariable.setID(PatternsViewsRepository.Constraint.Properties.objectVariable);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.Constraint.Properties.objectVariable, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#getPattern()
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
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#initPattern(EObjectFlatComboSettings)
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
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#setPattern(EObject newValue)
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
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#getObjectVariable()
	 * 
	 */
	public EObject getObjectVariable() {
		if (objectVariable.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) objectVariable.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#initObjectVariable(EObjectFlatComboSettings)
	 */
	public void initObjectVariable(EObjectFlatComboSettings settings) {
		objectVariable.setInput(settings);
		if (current != null) {
			objectVariable.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#setObjectVariable(EObject newValue)
	 * 
	 */
	public void setObjectVariable(EObject newValue) {
		if (newValue != null) {
			objectVariable.setSelection(new StructuredSelection(newValue));
		} else {
			objectVariable.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#setObjectVariableButtonMode(ButtonsModeEnum newValue)
	 */
	public void setObjectVariableButtonMode(ButtonsModeEnum newValue) {
		objectVariable.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#addFilterObjectVariable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToObjectVariable(ViewerFilter filter) {
		objectVariable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.ConstraintPropertiesEditionPart#addBusinessFilterObjectVariable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToObjectVariable(ViewerFilter filter) {
		objectVariable.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternsMessages.Constraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
