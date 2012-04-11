/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.activities.expressions.parts.forms;

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
import org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart;
import org.storydriven.storydiagrams.activities.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.activities.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class ExceptionVariableExpressionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ExceptionVariableExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer exceptionVariable;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExceptionVariableExpressionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence exceptionVariableExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = exceptionVariableExpressionStep.addStep(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable);
		
		
		composer = new PartComposer(exceptionVariableExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.ExceptionVariableExpression.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable) {
					return createExceptionVariableFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ExpressionsMessages.ExceptionVariableExpressionPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.ExceptionVariableExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariableExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariableExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createExceptionVariableFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.ExceptionVariableExpressionPropertiesEditionPart_ExceptionVariableLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable, ExpressionsViewsRepository.FORM_KIND));
		exceptionVariable = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable, ExpressionsViewsRepository.FORM_KIND));
		widgetFactory.adapt(exceptionVariable);
		exceptionVariable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData exceptionVariableData = new GridData(GridData.FILL_HORIZONTAL);
		exceptionVariable.setLayoutData(exceptionVariableData);
		exceptionVariable.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExceptionVariableExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getExceptionVariable()));
				}
			}

		});
		exceptionVariable.setID(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable, ExpressionsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#getExceptionVariable()
	 * 
	 */
	@Override
	public EObject getExceptionVariable() {
		if (exceptionVariable.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) exceptionVariable.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#initExceptionVariable(EObjectFlatComboSettings)
	 */
	@Override
	public void initExceptionVariable(EObjectFlatComboSettings settings) {
		exceptionVariable.setInput(settings);
		if (current != null) {
			exceptionVariable.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#setExceptionVariable(EObject newValue)
	 * 
	 */
	@Override
	public void setExceptionVariable(EObject newValue) {
		if (newValue != null) {
			exceptionVariable.setSelection(new StructuredSelection(newValue));
		} else {
			exceptionVariable.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#setExceptionVariableButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setExceptionVariableButtonMode(ButtonsModeEnum newValue) {
		exceptionVariable.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#addFilterExceptionVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToExceptionVariable(ViewerFilter filter) {
		exceptionVariable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart#addBusinessFilterExceptionVariable(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToExceptionVariable(ViewerFilter filter) {
		exceptionVariable.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return ExpressionsMessages.ExceptionVariableExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
