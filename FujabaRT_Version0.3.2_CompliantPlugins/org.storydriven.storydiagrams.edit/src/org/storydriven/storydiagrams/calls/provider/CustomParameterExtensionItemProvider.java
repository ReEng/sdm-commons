package org.storydriven.storydiagrams.calls.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomParameterExtensionItemProvider extends ParameterExtensionItemProvider {
	public CustomParameterExtensionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/ParameterExtension.png"); //$NON-NLS-1$
	}
}
