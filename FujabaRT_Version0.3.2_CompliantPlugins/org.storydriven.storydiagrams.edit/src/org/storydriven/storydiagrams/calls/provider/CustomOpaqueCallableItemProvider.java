package org.storydriven.storydiagrams.calls.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomOpaqueCallableItemProvider extends OpaqueCallableItemProvider {
	public CustomOpaqueCallableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/OpaqueCallable.png"); //$NON-NLS-1$
	}
}
