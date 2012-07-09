package org.storydriven.storydiagrams.templates.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomTemplatesItemProviderAdapterFactory extends TemplatesItemProviderAdapterFactory {
	@Override
	public Adapter createPropertyBindingAdapter() {
		if (propertyBindingItemProvider == null) {
			propertyBindingItemProvider = new CustomPropertyBindingItemProvider(this);
		}
		return propertyBindingItemProvider;
	}

	@Override
	public Adapter createTemplateBindingAdapter() {
		if (templateBindingItemProvider == null) {
			templateBindingItemProvider = new CustomTemplateBindingItemProvider(this);
		}
		return templateBindingItemProvider;
	}

	@Override
	public Adapter createTemplateSignatureAdapter() {
		if (templateSignatureItemProvider == null) {
			templateSignatureItemProvider = new CustomTemplateSignatureItemProvider(this);
		}
		return templateSignatureItemProvider;
	}
}
