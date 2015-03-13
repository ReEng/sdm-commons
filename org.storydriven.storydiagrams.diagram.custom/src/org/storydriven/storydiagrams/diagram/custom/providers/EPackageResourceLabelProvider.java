package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public class EPackageResourceLabelProvider extends LabelProvider {
	private WorkbenchLabelProvider wlp;
	private AdapterFactoryLabelProvider aflp;

	public EPackageResourceLabelProvider() {
		AdapterFactory af = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		wlp = new WorkbenchLabelProvider();
		aflp = new AdapterFactoryLabelProvider(af);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IResource) {
			return wlp.getText(element);
		}
		if (element instanceof EObject) {
			return aflp.getText(element);
		}

		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof IResource) {
			return wlp.getImage(element);
		}
		if (element instanceof EPackage) {
			EPackage registeredEPackage = EPackage.Registry.INSTANCE.getEPackage(((EPackage) element).getNsURI());
			if (element.equals(registeredEPackage)) {
				return DiagramImages.getImage(DiagramImages.EPACKAGE);
			}
			return DiagramImages.getImage(DiagramImages.EPACKAGE_WORKSPACE);
		}
		if (element instanceof EObject) {
			return aflp.getImage(element);
		}

		return super.getImage(element);
	}

	@Override
	public void dispose() {
		wlp.dispose();
		aflp.dispose();
		super.dispose();
	}
}
