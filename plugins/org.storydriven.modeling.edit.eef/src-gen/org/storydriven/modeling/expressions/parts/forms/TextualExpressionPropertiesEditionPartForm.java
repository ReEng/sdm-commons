/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.parts.forms;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.storydriven.modeling.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart;
import org.storydriven.modeling.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class TextualExpressionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TextualExpressionPropertiesEditionPart {

	protected Text comment;
	protected Text expressionText;
	protected Text language;
	protected Text languageVersion;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextualExpressionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
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
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence textualExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = textualExpressionStep.addStep(ExpressionsViewsRepository.TextualExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.TextualExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.TextualExpression.Properties.expressionText);
		propertiesStep.addStep(ExpressionsViewsRepository.TextualExpression.Properties.language);
		propertiesStep.addStep(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion);
		
		
		composer = new PartComposer(textualExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.expressionText) {
					return 		createExpressionTextText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.language) {
					return 		createLanguageText(widgetFactory, parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.languageVersion) {
					return 		createLanguageVersionText(widgetFactory, parent);
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
		propertiesSection.setText(ExpressionsMessages.TextualExpressionPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND));
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.TextualExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.comment, ExpressionsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExpressionTextText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_ExpressionTextLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.expressionText, ExpressionsViewsRepository.FORM_KIND));
		expressionText = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		expressionText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData expressionTextData = new GridData(GridData.FILL_HORIZONTAL);
		expressionText.setLayoutData(expressionTextData);
		expressionText.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.expressionText, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expressionText.getText()));
			}
		});
		expressionText.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.expressionText, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expressionText.getText()));
				}
			}
		});
		EditingUtils.setID(expressionText, ExpressionsViewsRepository.TextualExpression.Properties.expressionText);
		EditingUtils.setEEFtype(expressionText, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.expressionText, ExpressionsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLanguageText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_LanguageLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.language, ExpressionsViewsRepository.FORM_KIND));
		language = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		language.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData languageData = new GridData(GridData.FILL_HORIZONTAL);
		language.setLayoutData(languageData);
		language.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.language, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, language.getText()));
			}
		});
		language.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.language, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, language.getText()));
				}
			}
		});
		EditingUtils.setID(language, ExpressionsViewsRepository.TextualExpression.Properties.language);
		EditingUtils.setEEFtype(language, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.language, ExpressionsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLanguageVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_LanguageVersionLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, ExpressionsViewsRepository.FORM_KIND));
		languageVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		languageVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData languageVersionData = new GridData(GridData.FILL_HORIZONTAL);
		languageVersion.setLayoutData(languageVersionData);
		languageVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, languageVersion.getText()));
			}
		});
		languageVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartForm.this, ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, languageVersion.getText()));
				}
			}
		});
		EditingUtils.setID(languageVersion, ExpressionsViewsRepository.TextualExpression.Properties.languageVersion);
		EditingUtils.setEEFtype(languageVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, ExpressionsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
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
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#getExpressionText()
	 * 
	 */
	public String getExpressionText() {
		return expressionText.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#setExpressionText(String newValue)
	 * 
	 */
	public void setExpressionText(String newValue) {
		if (newValue != null) {
			expressionText.setText(newValue);
		} else {
			expressionText.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#getLanguage()
	 * 
	 */
	public String getLanguage() {
		return language.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#setLanguage(String newValue)
	 * 
	 */
	public void setLanguage(String newValue) {
		if (newValue != null) {
			language.setText(newValue);
		} else {
			language.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#getLanguageVersion()
	 * 
	 */
	public String getLanguageVersion() {
		return languageVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart#setLanguageVersion(String newValue)
	 * 
	 */
	public void setLanguageVersion(String newValue) {
		if (newValue != null) {
			languageVersion.setText(newValue);
		} else {
			languageVersion.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ExpressionsMessages.TextualExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
