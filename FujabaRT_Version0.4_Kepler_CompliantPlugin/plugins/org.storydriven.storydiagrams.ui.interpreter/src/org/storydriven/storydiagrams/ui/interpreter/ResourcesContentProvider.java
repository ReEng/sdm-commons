package org.storydriven.storydiagrams.ui.interpreter;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

public class ResourcesContentProvider extends AdapterFactoryContentProvider {
	public ResourcesContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object[] getElements(Object object) {
		if (object instanceof Collection<?>) {
			return ((Collection<?>) object).toArray(new Object[((Collection<?>) object).size()]);
		}

		return super.getElements(object);
	}
}
