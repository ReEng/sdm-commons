package org.storydriven.storydiagrams.templates.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomPropertyBindingItemProvider extends PropertyBindingItemProvider {
	public CustomPropertyBindingItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("templates/PropertyBinding.png"); //$NON-NLS-1$
	}
}
