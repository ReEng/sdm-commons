package de.fujaba.newwizard.diagrams.pages;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.ui.ExtensibleModelSelectionPage;
import de.fujaba.newwizard.ui.ModelSelectionPageExtension;
import de.fujaba.newwizard.ui.PredefinedModelExtension;
import de.fujaba.newwizard.ui.ResourceLocationProvider;

/**
 * A Wizard Page that allows selecting the Diagram Element within an
 * EMF-Resource. This Wizard Page extends the ExtensibleModelSelectionPage (used
 * by GMF itself).
 * 
 * @author bingo
 * 
 */
public class DiagramModelSelectionPage extends ExtensibleModelSelectionPage {

	private String modelElementCategoryKey;

	/**
	 * Page Extension that shows some predefined models.
	 */
	private PredefinedModelExtension predefinedModelExtension;

	/**
	 * Page Extension that allows the user to select, if a new Diagram Element
	 * should be added.
	 */
	private AddElementPageExtension addElementExtension;

	/**
	 * Constructs this DiagramModelSelectionPage.
	 * 
	 * @param pageId
	 *            The ID for this Page.
	 * @param rloc
	 *            The location of the current selection.
	 * @param resourceSet
	 *            The ResourceSet that should be used to load Resources. If it
	 *            is null, a new one will be created internally.
	 * @param modelFileExtension
	 *            The File Extension for the Domain Model.
	 * @param diagramModelFilePage
	 */
	public DiagramModelSelectionPage(String pageId,
			ResourceLocationProvider rloc, ResourceSet resourceSet,
			String modelFileExtension, String modelElementCategoryKey) {
		super(pageId, rloc, resourceSet, modelFileExtension);
		this.modelElementCategoryKey = modelElementCategoryKey;
	}

	/**
	 * Overriden to add all Page Extensions.
	 */
	@Override
	public void addExtensions() {
		List<URI> uris = rloc.getSelectedURIs("fujaba"); //$NON-NLS-1$
		// uris.add(URI
		//				.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore")); //$NON-NLS-1$
		predefinedModelExtension = new PredefinedModelExtension(this, uris);

		ModelSelectionPageExtension fillerExtension = new FillerPageExtension();
		addElementExtension = new AddElementPageExtension();
		addElementExtension.addObserver(new Observer() {

			@Override
			public void update(Observable o, Object arg) {
				WizardPage nextPage = (WizardPage) DiagramModelSelectionPage.super
						.getNextPage();
				if (nextPage != null) {
					nextPage.setPageComplete((Boolean) arg);
					nextPage.setErrorMessage((Boolean) arg ? null : "");
				}
				validatePage();
			}

		});

		addExtension("prem", predefinedModelExtension); //$NON-NLS-1$
		addExtension("filler", fillerExtension);
		addExtension("add", addElementExtension); //$NON-NLS-1$
	}

	@Override
	protected void resourceChanged() {
		super.resourceChanged();

		Resource resource = getResource();
		boolean shouldAddElement = false;
		boolean containsValidCategory = false;
		if (resource != null && !resource.getContents().isEmpty()) {
			EObject firstElement = resource.getContents().get(0);
			if (firstElement instanceof RootNode) {
				shouldAddElement = true;
				RootNode rootNode = (RootNode) firstElement;
				for (ModelElementCategory category : rootNode.getCategories()) {
					if (modelElementCategoryKey.equals(category.getKey())) {
						containsValidCategory = true;
					}
				}
			}
		}
		addElementExtension.setEnabled(containsValidCategory);
		addElementExtension.setAddElement(shouldAddElement);
	}

	/**
	 * Validates the current state of this Wizard Page and all its extensions.
	 * It calls setPageComplete() and setErrorMessage() to give feedback.
	 */
	@Override
	public void validatePage() {
		// check if a file was selected
		super.validatePage();

		String error = null;

		Resource resource = getResource();
		
		if (resource == null) {
			error = "No resource selected.";
		} else if (addElementExtension.shouldAddElement()) {
			boolean rootNodeFound = false;
			List<?> rootElements = resource.getContents();
			if (!rootElements.isEmpty()) {
				Object rootElement = rootElements.get(0);
				if (rootElement instanceof RootNode) {
					rootNodeFound = true;
				}
			}
			if (!rootNodeFound) {
				error = "Selected file does not contain a valid Fujaba Root Node.";
			}

		}
		setPageComplete(error == null);
		setErrorMessage(error);
	}

	private class FillerPageExtension implements ModelSelectionPageExtension {

		@Override
		public void createControl(Composite parent) {
			new Composite(parent, 0).setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true));
		}

		@Override
		public void setResource(Resource resource) {
			// do nothing
		}

	}

	@Override
	public IWizardPage getNextPage() {
		boolean shouldAdd = addElementExtension.shouldAddElement();
		if (shouldAdd) {
			return null;
		}
		return super.getNextPage();
	};

}
