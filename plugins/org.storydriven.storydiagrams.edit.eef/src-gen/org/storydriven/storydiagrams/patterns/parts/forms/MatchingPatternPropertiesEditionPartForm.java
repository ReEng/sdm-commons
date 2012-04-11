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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class MatchingPatternPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MatchingPatternPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer parentPattern;
	protected EMFComboViewer bindingSemantics;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MatchingPatternPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence matchingPatternStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = matchingPatternStep.addStep(PatternsViewsRepository.MatchingPattern.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.MatchingPattern.Properties.comment);
		propertiesStep.addStep(PatternsViewsRepository.MatchingPattern.Properties.parentPattern);
		propertiesStep.addStep(PatternsViewsRepository.MatchingPattern.Properties.bindingSemantics);
		
		
		composer = new PartComposer(matchingPatternStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.MatchingPattern.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.MatchingPattern.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.MatchingPattern.Properties.parentPattern) {
					return createParentPatternFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.MatchingPattern.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(PatternsMessages.MatchingPatternPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.MatchingPatternPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.MatchingPattern.Properties.comment, PatternsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingPatternPropertiesEditionPartForm.this, PatternsViewsRepository.MatchingPattern.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingPatternPropertiesEditionPartForm.this, PatternsViewsRepository.MatchingPattern.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, PatternsViewsRepository.MatchingPattern.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.MatchingPattern.Properties.comment, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParentPatternFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.MatchingPatternPropertiesEditionPart_ParentPatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.MatchingPattern.Properties.parentPattern, PatternsViewsRepository.FORM_KIND));
		parentPattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.MatchingPattern.Properties.parentPattern, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(parentPattern);
		parentPattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parentPatternData = new GridData(GridData.FILL_HORIZONTAL);
		parentPattern.setLayoutData(parentPatternData);
		parentPattern.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingPatternPropertiesEditionPartForm.this, PatternsViewsRepository.MatchingPattern.Properties.parentPattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParentPattern()));
				}
			}

		});
		parentPattern.setID(PatternsViewsRepository.MatchingPattern.Properties.parentPattern);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.MatchingPattern.Properties.parentPattern, PatternsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingSemanticsEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.MatchingPatternPropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.MatchingPattern.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MatchingPatternPropertiesEditionPartForm.this, PatternsViewsRepository.MatchingPattern.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
				}
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.MatchingPattern.Properties.bindingSemantics);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.MatchingPattern.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#getParentPattern()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#initParentPattern(EObjectFlatComboSettings)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#setParentPattern(EObject newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#setParentPatternButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setParentPatternButtonMode(ButtonsModeEnum newValue) {
		parentPattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#addFilterParentPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToParentPattern(ViewerFilter filter) {
		parentPattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#addBusinessFilterParentPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToParentPattern(ViewerFilter filter) {
		parentPattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#getBindingSemantics()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#initBindingSemantics(Object input, Enumerator current)
	 */
	@Override
	public void initBindingSemantics(Object input, Enumerator current) {
		bindingSemantics.setInput(input);
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.MatchingPatternPropertiesEditionPart#setBindingSemantics(Enumerator newValue)
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
		return PatternsMessages.MatchingPattern_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
