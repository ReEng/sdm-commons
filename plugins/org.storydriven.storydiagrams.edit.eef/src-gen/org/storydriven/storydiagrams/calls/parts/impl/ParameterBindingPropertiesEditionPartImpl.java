/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.calls.parts.CallsViewsRepository;
import org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart;
import org.storydriven.storydiagrams.calls.providers.CallsMessages;


// End of user code

/**
 * 
 * 
 */
public class ParameterBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParameterBindingPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer parameter;
	protected EObjectFlatComboViewer invocation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = parameterBindingStep.addStep(CallsViewsRepository.ParameterBinding.Properties.class);
		propertiesStep.addStep(CallsViewsRepository.ParameterBinding.Properties.comment);
		propertiesStep.addStep(CallsViewsRepository.ParameterBinding.Properties.parameter);
		propertiesStep.addStep(CallsViewsRepository.ParameterBinding.Properties.invocation);
		
		
		composer = new PartComposer(parameterBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CallsViewsRepository.ParameterBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CallsViewsRepository.ParameterBinding.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == CallsViewsRepository.ParameterBinding.Properties.parameter) {
					return createParameterFlatComboViewer(parent);
				}
				if (key == CallsViewsRepository.ParameterBinding.Properties.invocation) {
					return createInvocationFlatComboViewer(parent);
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
		propertiesGroup.setText(CallsMessages.ParameterBindingPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, CallsMessages.ParameterBindingPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterBinding.Properties.comment, CallsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterBindingPropertiesEditionPartImpl.this, CallsViewsRepository.ParameterBinding.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterBindingPropertiesEditionPartImpl.this, CallsViewsRepository.ParameterBinding.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}

		});
		EditingUtils.setID(comment, CallsViewsRepository.ParameterBinding.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.ParameterBinding.Properties.comment, CallsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParameterFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, CallsMessages.ParameterBindingPropertiesEditionPart_ParameterLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterBinding.Properties.parameter, CallsViewsRepository.SWT_KIND));
		parameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterBinding.Properties.parameter, CallsViewsRepository.SWT_KIND));
		parameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parameter.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterBindingPropertiesEditionPartImpl.this, CallsViewsRepository.ParameterBinding.Properties.parameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParameter()));
			}

		});
		GridData parameterData = new GridData(GridData.FILL_HORIZONTAL);
		parameter.setLayoutData(parameterData);
		parameter.setID(CallsViewsRepository.ParameterBinding.Properties.parameter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.ParameterBinding.Properties.parameter, CallsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createInvocationFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, CallsMessages.ParameterBindingPropertiesEditionPart_InvocationLabel, propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterBinding.Properties.invocation, CallsViewsRepository.SWT_KIND));
		invocation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CallsViewsRepository.ParameterBinding.Properties.invocation, CallsViewsRepository.SWT_KIND));
		invocation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		invocation.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterBindingPropertiesEditionPartImpl.this, CallsViewsRepository.ParameterBinding.Properties.invocation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInvocation()));
			}

		});
		GridData invocationData = new GridData(GridData.FILL_HORIZONTAL);
		invocation.setLayoutData(invocationData);
		invocation.setID(CallsViewsRepository.ParameterBinding.Properties.invocation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CallsViewsRepository.ParameterBinding.Properties.invocation, CallsViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#getParameter()
	 * 
	 */
	@Override
	public EObject getParameter() {
		if (parameter.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parameter.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#initParameter(EObjectFlatComboSettings)
	 */
	@Override
	public void initParameter(EObjectFlatComboSettings settings) {
		parameter.setInput(settings);
		if (current != null) {
			parameter.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#setParameter(EObject newValue)
	 * 
	 */
	@Override
	public void setParameter(EObject newValue) {
		if (newValue != null) {
			parameter.setSelection(new StructuredSelection(newValue));
		} else {
			parameter.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#setParameterButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setParameterButtonMode(ButtonsModeEnum newValue) {
		parameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#addFilterParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToParameter(ViewerFilter filter) {
		parameter.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#addBusinessFilterParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToParameter(ViewerFilter filter) {
		parameter.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#getInvocation()
	 * 
	 */
	@Override
	public EObject getInvocation() {
		if (invocation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) invocation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#initInvocation(EObjectFlatComboSettings)
	 */
	@Override
	public void initInvocation(EObjectFlatComboSettings settings) {
		invocation.setInput(settings);
		if (current != null) {
			invocation.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#setInvocation(EObject newValue)
	 * 
	 */
	@Override
	public void setInvocation(EObject newValue) {
		if (newValue != null) {
			invocation.setSelection(new StructuredSelection(newValue));
		} else {
			invocation.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#setInvocationButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setInvocationButtonMode(ButtonsModeEnum newValue) {
		invocation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#addFilterInvocation(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToInvocation(ViewerFilter filter) {
		invocation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.parts.ParameterBindingPropertiesEditionPart#addBusinessFilterInvocation(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToInvocation(ViewerFilter filter) {
		invocation.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return CallsMessages.ParameterBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
