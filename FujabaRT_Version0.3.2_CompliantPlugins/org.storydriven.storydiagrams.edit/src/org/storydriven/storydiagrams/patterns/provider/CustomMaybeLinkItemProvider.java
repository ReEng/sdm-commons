package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomMaybeLinkItemProvider extends MaybeLinkItemProvider {
	public CustomMaybeLinkItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/MaybeLink.png"); //$NON-NLS-1$
	}
}
