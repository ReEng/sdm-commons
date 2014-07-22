package org.storydriven.storydiagrams.templates.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomTemplateBindingItemProvider extends TemplateBindingItemProvider {
	public CustomTemplateBindingItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("templates/TemplateBinding.png"); //$NON-NLS-1$
	}
}
