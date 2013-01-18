package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomCollectionVariableItemProvider extends CollectionVariableItemProvider {
	public CustomCollectionVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/CollectionVariable.png"); //$NON-NLS-1$
	}
}
