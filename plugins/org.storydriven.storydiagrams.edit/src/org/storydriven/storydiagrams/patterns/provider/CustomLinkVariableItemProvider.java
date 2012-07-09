package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomLinkVariableItemProvider extends LinkVariableItemProvider {
	public CustomLinkVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/LinkVariable.png"); //$NON-NLS-1$
	}
}
