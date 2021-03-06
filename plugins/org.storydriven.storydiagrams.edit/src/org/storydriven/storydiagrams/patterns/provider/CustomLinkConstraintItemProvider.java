package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomLinkConstraintItemProvider extends LinkConstraintItemProvider {
	public CustomLinkConstraintItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/LinkConstraint.png"); //$NON-NLS-1$
	}
}
