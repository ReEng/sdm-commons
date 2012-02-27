package de.fujaba.newwizard.diagrams.pages;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.diagrams.IDiagramElementValidator;
import de.fujaba.newwizard.diagrams.IDiagramInformation;

public class DiagramContentsSelectionPage extends WizardPage implements
		IResourceChangedListener {

	/**
	 * The top level control for this Page Extension.
	 */
	private Composite plate;

	private CheckboxTreeViewer modelViewer;

	/*
	 * Start of attributes that can be null, if no diagramInformation was
	 * provided in constructor.
	 */
	private String modelElementCategoryKey;
	private ViewerFilter viewerFilter;
	private IDiagramElementValidator diagramElementValidator;

	/**
	 * Constructs this DiagramModelSelectionPage.
	 * 
	 * @param pageId
	 *            The ID for this Page.
	 * @param diagramInformation
	 */
	public DiagramContentsSelectionPage(String pageId,
			IDiagramInformation diagramInformation) {
		super(pageId);
		if (diagramInformation != null) {
			modelElementCategoryKey = diagramInformation
					.getModelElementCategoryKey();
			diagramElementValidator = diagramInformation.getFujabaEditor();
			viewerFilter = new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object object) {
					return parentElement == getDiagramElement();
				}
			};
		}
	}

	/**
	 * Validates the current state of this Wizard Page and all its extensions.
	 * It calls setPageComplete() and setErrorMessage() to give feedback.
	 */
	public void validatePage() {
		String error = null;

		if (diagramElementValidator != null) {
			EObject diagramElement = (EObject) modelViewer.getInput();
			for (Object object : getSelectedElements()) {
				EObject topLevelNodeElement = (EObject) object;
				if (!diagramElementValidator.isValidTopLevelNodeElement(
						diagramElement, topLevelNodeElement)) {
					error = "Invalid top level element(s) selected.";
				}
			}
		}

		setPageComplete(error == null);
		setErrorMessage(error);
	}

	public Collection<EObject> getSelectedElements() {
		Collection<EObject> selectedElements = new ArrayList<EObject>();
		if (modelViewer != null && !modelViewer.getTree().isDisposed()) {
			for (Object object : modelViewer.getCheckedElements()) {
				selectedElements.add((EObject) object);
			}
		}
		return selectedElements;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			// We set this page to invalid before it was opened! So we must
			// revalidate once it is open.
			validatePage();
		}
	}

	public void setDiagramElement(EObject input) {
		// If the modelViewer tree control was created and its input element
		// differs from the new input element, set it.
		if (modelViewer != null && !modelViewer.getTree().isDisposed()
				&& modelViewer.getInput() != input) {
			modelViewer.setInput(input);
		}
	}

	public EObject getDiagramElement() {
		// If the modelViewer tree control was created return its input element,
		// else return null.
		if (modelViewer != null && !modelViewer.getTree().isDisposed()) {
			return (EObject) modelViewer.getInput();
		}
		return null;
	}

	/**
	 * Create the controls for this Page Extension.
	 */
	@Override
	public void createControl(Composite parent) {

		// create the top level control
		plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		plate.setLayout(layout);

		// create the label
		Label label = new Label(plate, SWT.NONE);
		label.setText(getSelectionTitle());
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		// create the tree viewer
		int style = SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;

		modelViewer = new CheckboxTreeViewer(plate, style);
		modelViewer.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				validatePage();
			}

		});

		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 180;
		layoutData.widthHint = 200;
		modelViewer.getTree().setLayoutData(layoutData);

		modelViewer.setContentProvider(new AdapterFactoryContentProvider(
				FujabaNewwizardPlugin.getDefault()
						.getItemProvidersAdapterFactory()));
		modelViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				FujabaNewwizardPlugin.getDefault()
						.getItemProvidersAdapterFactory()));

		if (viewerFilter != null) {
			modelViewer.addFilter(viewerFilter);
		}

		setControl(plate);

	}

	/**
	 * A Handler that will be called by the Tree Viewer, when its selection
	 * status changed.
	 * 
	 * @param selection
	 *            The selected Tree Element.
	 * 
	 */
	protected void onSelectionChanged(IStructuredSelection selection) {
		if (selection.size() == 1) {
			Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof IWrapperItemProvider) {
				selectedElement = ((IWrapperItemProvider) selectedElement)
						.getValue();
			}
			if (selectedElement instanceof FeatureMap.Entry) {
				selectedElement = ((FeatureMap.Entry) selectedElement)
						.getValue();
			}
		}
		validatePage();
	}

	/**
	 * Override to provide custom model element description.
	 * 
	 * @generated
	 */
	protected String getSelectionTitle() {
		return "Diagram contents:";
	}

	@Override
	public void resourceChanged(Resource newResource) {
		setDiagramElement(getResourceRoot(newResource));
	}

	public EObject getResourceRoot(Resource newResource) {

		EObject rootNode = newResource.getContents().get(0);

		if (modelElementCategoryKey == null) {
			return rootNode;
		}

		for (EObject content : rootNode.eContents()) {
			ModelElementCategory category = (ModelElementCategory) content;
			if (modelElementCategoryKey.equals(category.getKey())) {
				return category;
			}
		}

		return null;
	}

}
