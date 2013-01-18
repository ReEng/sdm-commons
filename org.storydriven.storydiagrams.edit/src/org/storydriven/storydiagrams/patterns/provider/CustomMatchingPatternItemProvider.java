package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomMatchingPatternItemProvider extends MatchingPatternItemProvider {
	public CustomMatchingPatternItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/MatchingPattern.png"); //$NON-NLS-1$
	}
}
