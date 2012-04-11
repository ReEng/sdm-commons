/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.expressions.parts.forms;

// Start of user code for imports








import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.storydiagrams.patterns.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class PrimitiveVariableExpressionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PrimitiveVariableExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer primitiveVariable;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PrimitiveVariableExpressionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence primitiveVariableExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = primitiveVariableExpressionStep.addStep(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable);
		
		
		composer = new PartComposer(primitiveVariableExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable) {
					return createPrimitiveVariableFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ExpressionsMessages.PrimitiveVariableExpressionPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.PrimitiveVariableExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariableExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariableExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPrimitiveVariableFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.PrimitiveVariableExpressionPropertiesEditionPart_PrimitiveVariableLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable, ExpressionsViewsRepository.FORM_KIND));
		primitiveVariable = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable, ExpressionsViewsRepository.FORM_KIND));
		widgetFactory.adapt(primitiveVariable);
		primitiveVariable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData primitiveVariableData = new GridData(GridData.FILL_HORIZONTAL);
		primitiveVariable.setLayoutData(primitiveVariableData);
		primitiveVariable.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariableExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPrimitiveVariable()));
				}
			}

		});
		primitiveVariable.setID(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.PrimitiveVariableExpression.Properties.primitiveVariable, ExpressionsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#getPrimitiveVariable()
	 * 
	 */
	@Override
	public EObject getPrimitiveVariable() {
		if (primitiveVariable.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) primitiveVariable.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#initPrimitiveVariable(EObjectFlatComboSettings)
	 */
	@Override
	public void initPrimitiveVariable(EObjectFlatComboSettings settings) {
		primitiveVariable.setInput(settings);
		if (current != null) {
			primitiveVariable.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#setPrimitiveVariable(EObject newValue)
	 * 
	 */
	@Override
	public void setPrimitiveVariable(EObject newValue) {
		if (newValue != null) {
			primitiveVariable.setSelection(new StructuredSelection(newValue));
		} else {
			primitiveVariable.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#setPrimitiveVariableButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setPrimitiveVariableButtonMode(ButtonsModeEnum newValue) {
		primitiveVariable.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#addFilterPrimitiveVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToPrimitiveVariable(ViewerFilter filter) {
		primitiveVariable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.expressions.parts.PrimitiveVariableExpressionPropertiesEditionPart#addBusinessFilterPrimitiveVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToPrimitiveVariable(ViewerFilter filter) {
		primitiveVariable.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return ExpressionsMessages.PrimitiveVariableExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
