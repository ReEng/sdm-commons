package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomObjectVariableItemProvider extends ObjectVariableItemProvider {
	public CustomObjectVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/ObjectVariable.png"); //$NON-NLS-1$
	}
}
