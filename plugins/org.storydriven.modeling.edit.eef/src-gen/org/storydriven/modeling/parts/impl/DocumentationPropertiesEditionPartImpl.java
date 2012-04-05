/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.storydriven.modeling.parts.DocumentationPropertiesEditionPart;
import org.storydriven.modeling.parts.ModelingViewsRepository;
import org.storydriven.modeling.providers.ModelingMessages;


// End of user code

/**
 * 
 * 
 */
public class DocumentationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DocumentationPropertiesEditionPart {

	protected Text documentation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DocumentationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence documentationStep = new BindingCompositionSequence(propertiesEditionComponent);
		documentationStep
			.addStep(ModelingViewsRepository.Documentation.Documentation_.class)
			.addStep(ModelingViewsRepository.Documentation.Documentation_.documentation__);
		
		
		composer = new PartComposer(documentationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ModelingViewsRepository.Documentation.Documentation_.class) {
					return createDocumentationGroup(parent);
				}
				if (key == ModelingViewsRepository.Documentation.Documentation_.documentation__) {
					return createDocumentationTextarea(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createDocumentationGroup(Composite parent) {
		Group documentationGroup = new Group(parent, SWT.NONE);
		documentationGroup.setText(ModelingMessages.DocumentationPropertiesEditionPart_DocumentationGroupLabel);
		GridData documentationGroupData = new GridData(GridData.FILL_HORIZONTAL);
		documentationGroupData.horizontalSpan = 3;
		documentationGroup.setLayoutData(documentationGroupData);
		GridLayout documentationGroupLayout = new GridLayout();
		documentationGroupLayout.numColumns = 3;
		documentationGroup.setLayout(documentationGroupLayout);
		return documentationGroup;
	}

	
	protected Composite createDocumentationTextarea(Composite parent) {
		Label documentationLabel = SWTUtils.createPartLabel(parent, ModelingMessages.DocumentationPropertiesEditionPart_DocumentationLabel, propertiesEditionComponent.isRequired(ModelingViewsRepository.Documentation.Documentation_.documentation__, ModelingViewsRepository.SWT_KIND));
		GridData documentationLabelData = new GridData(GridData.FILL_HORIZONTAL);
		documentationLabelData.horizontalSpan = 3;
		documentationLabel.setLayoutData(documentationLabelData);
		documentation = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 2;
		documentationData.heightHint = 80;
		documentationData.widthHint = 200;
		documentation.setLayoutData(documentationData);
		documentation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentationPropertiesEditionPartImpl.this, ModelingViewsRepository.Documentation.Documentation_.documentation__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, documentation.getText()));
			}

		});
		EditingUtils.setID(documentation, ModelingViewsRepository.Documentation.Documentation_.documentation__);
		EditingUtils.setEEFtype(documentation, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ModelingViewsRepository.Documentation.Documentation_.documentation__, ModelingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.parts.DocumentationPropertiesEditionPart#getDocumentation()
	 * 
	 */
	public String getDocumentation() {
		return documentation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.parts.DocumentationPropertiesEditionPart#setDocumentation(String newValue)
	 * 
	 */
	public void setDocumentation(String newValue) {
		if (newValue != null) {
			documentation.setText(newValue);
		} else {
			documentation.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ModelingMessages.Documentation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
