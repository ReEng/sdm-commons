package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ComposedAdapterFactoryLabelProvider extends LabelProvider {
	private AdapterFactoryLabelProvider aflp;

	public ComposedAdapterFactoryLabelProvider() {
		Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		AdapterFactory adapterFactory = new ComposedAdapterFactory(registry);
		aflp = new AdapterFactoryLabelProvider(adapterFactory);
	}

	@Override
	public void dispose() {
		aflp.dispose();
		super.dispose();
	}

	@Override
	public Image getImage(Object element) {
		return aflp.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Resource) {
			URI uri = ((Resource) element).getURI();
			if (uri.isPlatformResource()) {
				return uri.toPlatformString(true);
			}
		}
		return aflp.getText(element);
	}
}
