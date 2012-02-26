/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.expressions.parts.impl;

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
import org.storydriven.modeling.patterns.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart;
import org.storydriven.modeling.patterns.expressions.providers.ExpressionsMessages;


// End of user code

/**
 * 
 * 
 */
public class ObjectSetSizeExpressionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ObjectSetSizeExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer set;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ObjectSetSizeExpressionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence objectSetSizeExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = objectSetSizeExpressionStep.addStep(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.class);
		propertiesStep.addStep(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment);
		propertiesStep.addStep(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set);
		
		
		composer = new PartComposer(objectSetSizeExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set) {
					return createSetFlatComboViewer(parent);
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
		propertiesGroup.setText(ExpressionsMessages.ObjectSetSizeExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.ObjectSetSizeExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectSetSizeExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectSetSizeExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ExpressionsMessages.ObjectSetSizeExpressionPropertiesEditionPart_SetLabel, propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set, ExpressionsViewsRepository.SWT_KIND));
		set = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set, ExpressionsViewsRepository.SWT_KIND));
		set.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		set.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectSetSizeExpressionPropertiesEditionPartImpl.this, ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSet()));
			}

		});
		GridData setData = new GridData(GridData.FILL_HORIZONTAL);
		set.setLayoutData(setData);
		set.setID(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set, ExpressionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#getSet()
	 * 
	 */
	public EObject getSet() {
		if (set.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) set.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#initSet(EObjectFlatComboSettings)
	 */
	public void initSet(EObjectFlatComboSettings settings) {
		set.setInput(settings);
		if (current != null) {
			set.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#setSet(EObject newValue)
	 * 
	 */
	public void setSet(EObject newValue) {
		if (newValue != null) {
			set.setSelection(new StructuredSelection(newValue));
		} else {
			set.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#setSetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSetButtonMode(ButtonsModeEnum newValue) {
		set.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#addFilterSet(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSet(ViewerFilter filter) {
		set.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart#addBusinessFilterSet(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSet(ViewerFilter filter) {
		set.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ExpressionsMessages.ObjectSetSizeExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
