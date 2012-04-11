/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts.impl;

// Start of user code for imports








import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class StoryPatternPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StoryPatternPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer parentPattern;
	protected EMFComboViewer bindingSemantics;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StoryPatternPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence storyPatternStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = storyPatternStep.addStep(PatternsViewsRepository.StoryPattern.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.StoryPattern.Properties.comment);
		propertiesStep.addStep(PatternsViewsRepository.StoryPattern.Properties.parentPattern);
		propertiesStep.addStep(PatternsViewsRepository.StoryPattern.Properties.bindingSemantics);
		
		
		composer = new PartComposer(storyPatternStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.StoryPattern.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.StoryPattern.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == PatternsViewsRepository.StoryPattern.Properties.parentPattern) {
					return createParentPatternFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.StoryPattern.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(parent);
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
		propertiesGroup.setText(PatternsMessages.StoryPatternPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.StoryPatternPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.StoryPattern.Properties.comment, PatternsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StoryPatternPropertiesEditionPartImpl.this, PatternsViewsRepository.StoryPattern.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StoryPatternPropertiesEditionPartImpl.this, PatternsViewsRepository.StoryPattern.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}

		});
		EditingUtils.setID(comment, PatternsViewsRepository.StoryPattern.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.StoryPattern.Properties.comment, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.StoryPatternPropertiesEditionPart_ParentPatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.StoryPattern.Properties.parentPattern, PatternsViewsRepository.SWT_KIND));
		parentPattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.StoryPattern.Properties.parentPattern, PatternsViewsRepository.SWT_KIND));
		parentPattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentPattern.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StoryPatternPropertiesEditionPartImpl.this, PatternsViewsRepository.StoryPattern.Properties.parentPattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentPattern()));
			}

		});
		GridData parentPatternData = new GridData(GridData.FILL_HORIZONTAL);
		parentPattern.setLayoutData(parentPatternData);
		parentPattern.setID(PatternsViewsRepository.StoryPattern.Properties.parentPattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.StoryPattern.Properties.parentPattern, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingSemanticsEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.StoryPatternPropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.StoryPattern.Properties.bindingSemantics, PatternsViewsRepository.SWT_KIND));
		bindingSemantics = new EMFComboViewer(parent);
		bindingSemantics.setContentProvider(new ArrayContentProvider());
		bindingSemantics.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingSemanticsData = new GridData(GridData.FILL_HORIZONTAL);
		bindingSemantics.getCombo().setLayoutData(bindingSemanticsData);
		bindingSemantics.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StoryPatternPropertiesEditionPartImpl.this, PatternsViewsRepository.StoryPattern.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
				}
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.StoryPattern.Properties.bindingSemantics);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.StoryPattern.Properties.bindingSemantics, PatternsViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#getParentPattern()
	 * 
	 */
	@Override
	public EObject getParentPattern() {
		if (parentPattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentPattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#initParentPattern(EObjectFlatComboSettings)
	 */
	@Override
	public void initParentPattern(EObjectFlatComboSettings settings) {
		parentPattern.setInput(settings);
		if (current != null) {
			parentPattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#setParentPattern(EObject newValue)
	 * 
	 */
	@Override
	public void setParentPattern(EObject newValue) {
		if (newValue != null) {
			parentPattern.setSelection(new StructuredSelection(newValue));
		} else {
			parentPattern.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#setParentPatternButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setParentPatternButtonMode(ButtonsModeEnum newValue) {
		parentPattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#addFilterParentPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToParentPattern(ViewerFilter filter) {
		parentPattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#addBusinessFilterParentPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToParentPattern(ViewerFilter filter) {
		parentPattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#getBindingSemantics()
	 * 
	 */
	@Override
	public Enumerator getBindingSemantics() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingSemantics.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#initBindingSemantics(Object input, Enumerator current)
	 */
	@Override
	public void initBindingSemantics(Object input, Enumerator current) {
		bindingSemantics.setInput(input);
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart#setBindingSemantics(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingSemantics(Enumerator newValue) {
		bindingSemantics.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.StoryPattern_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
