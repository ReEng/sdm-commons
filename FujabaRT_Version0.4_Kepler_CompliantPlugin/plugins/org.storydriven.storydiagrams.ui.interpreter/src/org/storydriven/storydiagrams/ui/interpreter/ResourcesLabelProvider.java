package org.storydriven.storydiagrams.ui.interpreter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

public class ResourcesLabelProvider extends AdapterFactoryLabelProvider {
	public ResourcesLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		if (object instanceof Resource) {
			Resource resource = (Resource) object;
			if (resource.getURI().isPlatformResource()) {
				return resource.getURI().toPlatformString(true);
			}
		} else if (object instanceof EPackage) {
			EPackage ePackage = (EPackage) object;
			if (!ePackage.eResource().getURI().isPlatformResource()) {
				return ePackage.getNsURI();
			}
		}

		return super.getText(object);
	}
}
