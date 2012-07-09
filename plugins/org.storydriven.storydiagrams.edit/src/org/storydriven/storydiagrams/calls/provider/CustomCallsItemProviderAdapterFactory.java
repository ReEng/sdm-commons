package org.storydriven.storydiagrams.calls.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomCallsItemProviderAdapterFactory extends CallsItemProviderAdapterFactory {
	@Override
	public Adapter createOpaqueCallableAdapter() {
		if (opaqueCallableItemProvider == null) {
			opaqueCallableItemProvider = new CustomOpaqueCallableItemProvider(this);
		}
		return opaqueCallableItemProvider;
	}

	@Override
	public Adapter createParameterBindingAdapter() {
		if (parameterBindingItemProvider == null) {
			parameterBindingItemProvider = new CustomParameterBindingItemProvider(this);
		}
		return parameterBindingItemProvider;
	}

	@Override
	public Adapter createParameterExtensionAdapter() {
		if (parameterExtensionItemProvider == null) {
			parameterExtensionItemProvider = new CustomParameterExtensionItemProvider(this);
		}
		return parameterExtensionItemProvider;
	}
}
