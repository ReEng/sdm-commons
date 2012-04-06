/**
 * Generated with Acceleo
 */
package org.storydriven.core.expressions.parts.impl;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.storydriven.core.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart;
import org.storydriven.core.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class TextualExpressionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TextualExpressionPropertiesEditionPart {

	protected Text comment;
	protected Text expressionText;
	protected Text language;
	protected Text languageVersion;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextualExpressionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.expressionText) {
					return createExpressionTextText(parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.language) {
					return createLanguageText(parent);
				}
				if (key == ExpressionsViewsRepository.TextualExpression.Properties.languageVersion) {
					return createLanguageVersionText(parent);
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
		propertiesGroup.setText(ExpressionsMessages.TextualExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND));
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.TextualExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExpressionTextText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_ExpressionTextLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.expressionText, ExpressionsViewsRepository.SWT_KIND));
		expressionText = new Text(parent, SWT.BORDER);
		GridData expressionTextData = new GridData(GridData.FILL_HORIZONTAL);
		expressionText.setLayoutData(expressionTextData);
		expressionText.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.expressionText, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expressionText.getText()));
			}

		});
		expressionText.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.expressionText, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expressionText.getText()));
				}
			}

		});
		EditingUtils.setID(expressionText, ExpressionsViewsRepository.TextualExpression.Properties.expressionText);
		EditingUtils.setEEFtype(expressionText, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.expressionText, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLanguageText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_LanguageLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.language, ExpressionsViewsRepository.SWT_KIND));
		language = new Text(parent, SWT.BORDER);
		GridData languageData = new GridData(GridData.FILL_HORIZONTAL);
		language.setLayoutData(languageData);
		language.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.language, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, language.getText()));
			}

		});
		language.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.language, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, language.getText()));
				}
			}

		});
		EditingUtils.setID(language, ExpressionsViewsRepository.TextualExpression.Properties.language);
		EditingUtils.setEEFtype(language, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.language, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLanguageVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.TextualExpressionPropertiesEditionPart_LanguageVersionLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, ExpressionsViewsRepository.SWT_KIND));
		languageVersion = new Text(parent, SWT.BORDER);
		GridData languageVersionData = new GridData(GridData.FILL_HORIZONTAL);
		languageVersion.setLayoutData(languageVersionData);
		languageVersion.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, languageVersion.getText()));
			}

		});
		languageVersion.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, languageVersion.getText()));
				}
			}

		});
		EditingUtils.setID(languageVersion, ExpressionsViewsRepository.TextualExpression.Properties.languageVersion);
		EditingUtils.setEEFtype(languageVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#getExpressionText()
	 * 
	 */
	public String getExpressionText() {
		return expressionText.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#setExpressionText(String newValue)
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
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#getLanguage()
	 * 
	 */
	public String getLanguage() {
		return language.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#setLanguage(String newValue)
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
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#getLanguageVersion()
	 * 
	 */
	public String getLanguageVersion() {
		return languageVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.core.expressions.parts.TextualExpressionPropertiesEditionPart#setLanguageVersion(String newValue)
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
