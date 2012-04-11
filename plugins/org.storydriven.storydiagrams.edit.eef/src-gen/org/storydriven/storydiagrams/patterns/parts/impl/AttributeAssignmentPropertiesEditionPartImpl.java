/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts.impl;

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
import org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class AttributeAssignmentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AttributeAssignmentPropertiesEditionPart {

	protected EObjectFlatComboViewer attribute;
	protected EObjectFlatComboViewer objectVariable;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeAssignmentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence attributeAssignmentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeAssignmentStep.addStep(PatternsViewsRepository.AttributeAssignment.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.AttributeAssignment.Properties.attribute);
		propertiesStep.addStep(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable);
		
		
		composer = new PartComposer(attributeAssignmentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.AttributeAssignment.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.AttributeAssignment.Properties.attribute) {
					return createAttributeFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.AttributeAssignment.Properties.objectVariable) {
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
		propertiesGroup.setText(PatternsMessages.AttributeAssignmentPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createAttributeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.AttributeAssignmentPropertiesEditionPart_AttributeLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.attribute, PatternsViewsRepository.SWT_KIND));
		attribute = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.attribute, PatternsViewsRepository.SWT_KIND));
		attribute.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		attribute.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeAssignmentPropertiesEditionPartImpl.this, PatternsViewsRepository.AttributeAssignment.Properties.attribute, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAttribute()));
			}

		});
		GridData attributeData = new GridData(GridData.FILL_HORIZONTAL);
		attribute.setLayoutData(attributeData);
		attribute.setID(PatternsViewsRepository.AttributeAssignment.Properties.attribute);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.AttributeAssignment.Properties.attribute, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createObjectVariableFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.AttributeAssignmentPropertiesEditionPart_ObjectVariableLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PatternsViewsRepository.SWT_KIND));
		objectVariable = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PatternsViewsRepository.SWT_KIND));
		objectVariable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		objectVariable.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeAssignmentPropertiesEditionPartImpl.this, PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getObjectVariable()));
			}

		});
		GridData objectVariableData = new GridData(GridData.FILL_HORIZONTAL);
		objectVariable.setLayoutData(objectVariableData);
		objectVariable.setID(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable, PatternsViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#getAttribute()
	 * 
	 */
	@Override
	public EObject getAttribute() {
		if (attribute.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) attribute.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#initAttribute(EObjectFlatComboSettings)
	 */
	@Override
	public void initAttribute(EObjectFlatComboSettings settings) {
		attribute.setInput(settings);
		if (current != null) {
			attribute.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setAttribute(EObject newValue)
	 * 
	 */
	@Override
	public void setAttribute(EObject newValue) {
		if (newValue != null) {
			attribute.setSelection(new StructuredSelection(newValue));
		} else {
			attribute.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setAttributeButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setAttributeButtonMode(ButtonsModeEnum newValue) {
		attribute.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addFilterAttribute(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToAttribute(ViewerFilter filter) {
		attribute.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addBusinessFilterAttribute(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToAttribute(ViewerFilter filter) {
		attribute.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#getObjectVariable()
	 * 
	 */
	@Override
	public EObject getObjectVariable() {
		if (objectVariable.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) objectVariable.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#initObjectVariable(EObjectFlatComboSettings)
	 */
	@Override
	public void initObjectVariable(EObjectFlatComboSettings settings) {
		objectVariable.setInput(settings);
		if (current != null) {
			objectVariable.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setObjectVariable(EObject newValue)
	 * 
	 */
	@Override
	public void setObjectVariable(EObject newValue) {
		if (newValue != null) {
			objectVariable.setSelection(new StructuredSelection(newValue));
		} else {
			objectVariable.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#setObjectVariableButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setObjectVariableButtonMode(ButtonsModeEnum newValue) {
		objectVariable.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addFilterObjectVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToObjectVariable(ViewerFilter filter) {
		objectVariable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart#addBusinessFilterObjectVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToObjectVariable(ViewerFilter filter) {
		objectVariable.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.AttributeAssignment_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
