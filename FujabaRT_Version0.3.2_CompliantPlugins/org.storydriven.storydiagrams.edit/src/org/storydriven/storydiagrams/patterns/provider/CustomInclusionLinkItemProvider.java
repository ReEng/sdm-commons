package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomInclusionLinkItemProvider extends InclusionLinkItemProvider {
	public CustomInclusionLinkItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/InclusionLink.png"); //$NON-NLS-1$
	}
}
