package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomPathItemProvider extends PathItemProvider {
	public CustomPathItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/Path.png"); //$NON-NLS-1$
	}
}
