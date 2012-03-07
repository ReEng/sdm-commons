package de.fujaba.newwizard.diagrams.pages;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.IDiagramElementValidator;
import de.fujaba.newwizard.diagrams.IDiagramInformation;

public class DiagramElementSelectionPage extends WizardPage implements IResourceChangedListener {

	private String modelElementCategoryKey;
	private IDiagramElementValidator diagramValidator;

	private ViewerFilter viewerFilter = new ViewerFilter() {
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object object) {
			if (modelElementCategoryKey != null
					&& object instanceof ModelElementCategory) {
				return modelElementCategoryKey
						.equals(((ModelElementCategory) object).getKey());
			}
			return true;
		}
	};

	/**
	 * Constructs this DiagramModelSelectionPage.
	 * 
	 * @param pageId
	 *            The ID for this Page.
	 * @param diagramInformation 
	 */
	public DiagramElementSelectionPage(String pageId, IDiagramInformation diagramInformation) {
		super(pageId);

		diagramValidator = diagramInformation.getFujabaEditor();
		modelElementCategoryKey = diagramInformation
				.getModelElementCategoryKey();
	}

	/**
	 * Validates the current state of this Wizard Page and all its extensions.
	 * It calls setPageComplete() and setErrorMessage() to give feedback.
	 */
	public void validatePage() {
		String error = null;
		EObject selectedDiagramElement = getSelectedElement();

		if (selectedDiagramElement == null) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageNoSelectionMessage;

		} else if (diagramValidator != null
				&& !diagramValidator
						.isValidDiagramElement(selectedDiagramElement)) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage;
		}

		setPageComplete(error == null);
		setErrorMessage(error);
	}

	/**
	 * The top level control for this Page Extension.
	 */
	private Composite plate;

	private TreeViewer modelViewer;

	public EObject getSelectedElement() {
		if (modelViewer != null && !modelViewer.getTree().isDisposed()) {
			IStructuredSelection selection = (IStructuredSelection) modelViewer
					.getSelection();
			return (EObject) unwrapElement(selection.getFirstElement());
		}
		return null;
	}


	protected Object unwrapElement(Object element) {

		if (element instanceof IWrapperItemProvider) {
			return ((IWrapperItemProvider) element).getValue();
		}

		if (element instanceof FeatureMap.Entry) {
			return ((FeatureMap.Entry) element).getValue();
		}

		return element;
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

		modelViewer = new TreeViewer(plate, style);
		modelViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
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
		modelViewer.addFilter(viewerFilter);

		setControl(plate);
	}

	/**
	 * Enables or disables this Page Extension.
	 * 
	 * @param value
	 *            The enable status to set.
	 */
	public void setEnabled(boolean value) {
		if (modelViewer != null && !modelViewer.getTree().isDisposed()) {
			modelViewer.getTree().setEnabled(!value);
		}
	}

	@Override
	public void resourceChanged(Resource resource) {
		if (resource.getContents().isEmpty()) {
			return;
		}
		
		EObject modelElementCategory = null;
		EObject rootNode = resource.getContents().get(0);
		if (rootNode instanceof RootNode) {
			List<ModelElementCategory> categories = ((RootNode) rootNode).getCategories();
			for (ModelElementCategory category : categories) {
				if (modelElementCategoryKey.equals(category.getKey())) {
					modelElementCategory = category;
				}
			}
		}

		if (modelElementCategory != null && modelViewer != null && !modelViewer.getTree().isDisposed()
				&& modelViewer.getInput() != modelElementCategory) {
			modelViewer.setInput(modelElementCategory);
			modelViewer.expandToLevel(3);
		}
	}

	/**
	 * Override to provide custom model element description.
	 * 
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}
