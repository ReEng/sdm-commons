package org.storydriven.storydiagrams.ui.interpreter.dialogs;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.storydiagrams.ui.interpreter.wizards.IEPackageController;

public class EPackageRegistryDialog extends AbstractTreeSelectionDialog<EPackage> {
	private static final String TITLE = "Add Registered Packages";
	private static final String DESCRIPTION = "Select the packages that should be added to the type model.";

	private IEPackageController controller;

	public EPackageRegistryDialog(IEPackageController controller) {
		super(TITLE, DESCRIPTION);

		this.controller = controller;

		// TODO: image?
		// setTitleImage(DiagramImages.getImage(DiagramImages.BANNER_ADD_EPACKAGE_URI));
	}

	@Override
	protected ViewerFilter getViewerFilter() {
		ViewerFilter filter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				return !controller.getAddedResources().contains(element);
			}
		};
		return filter;
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new AdapterFactoryLabelProvider(controller.getAdapterFactory()) {
			@Override
			public String getText(Object object) {
				if (object instanceof EPackage) {
					return ((EPackage) object).getNsURI();
				}
				return super.getText(object);
			}
		};
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new AdapterFactoryContentProvider(controller.getAdapterFactory()) {
			private Object[] cached;

			@Override
			public Object[] getElements(Object element) {
				if (cached == null) {
					Collection<?> input = (Collection<?>) element;
					cached = input.toArray(new Object[input.size()]);
				}

				return cached;
			}
		};
	}

	@Override
	protected Object getInput() {
		return controller.getAllEPackages();
	}
}
