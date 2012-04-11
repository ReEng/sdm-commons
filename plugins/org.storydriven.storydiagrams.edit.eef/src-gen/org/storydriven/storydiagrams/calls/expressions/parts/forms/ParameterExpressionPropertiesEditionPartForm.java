/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.expressions.parts.forms;

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
import org.storydriven.storydiagrams.calls.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart;
import org.storydriven.storydiagrams.calls.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class ParameterExpressionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ParameterExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer parameter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterExpressionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = parameterExpressionStep.addStep(ExpressionsViewsRepository.ParameterExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.ParameterExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.ParameterExpression.Properties.parameter);
		
		
		composer = new PartComposer(parameterExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.ParameterExpression.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.ParameterExpression.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.ParameterExpression.Properties.parameter) {
					return createParameterFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ExpressionsMessages.ParameterExpressionPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.ParameterExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ParameterExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.ParameterExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.ParameterExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.ParameterExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.ParameterExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.ParameterExpressionPropertiesEditionPart_ParameterLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ParameterExpression.Properties.parameter, ExpressionsViewsRepository.FORM_KIND));
		parameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ParameterExpression.Properties.parameter, ExpressionsViewsRepository.FORM_KIND));
		widgetFactory.adapt(parameter);
		parameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parameterData = new GridData(GridData.FILL_HORIZONTAL);
		parameter.setLayoutData(parameterData);
		parameter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.ParameterExpression.Properties.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParameter()));
				}
			}

		});
		parameter.setID(ExpressionsViewsRepository.ParameterExpression.Properties.parameter);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.ParameterExpression.Properties.parameter, ExpressionsViewsRepository.FORM_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#getParameter()
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
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#initParameter(EObjectFlatComboSettings)
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
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#setParameter(EObject newValue)
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
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#setParameterButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setParameterButtonMode(ButtonsModeEnum newValue) {
		parameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#addFilterParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToParameter(ViewerFilter filter) {
		parameter.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.calls.expressions.parts.ParameterExpressionPropertiesEditionPart#addBusinessFilterParameter(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToParameter(ViewerFilter filter) {
		parameter.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return ExpressionsMessages.ParameterExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
