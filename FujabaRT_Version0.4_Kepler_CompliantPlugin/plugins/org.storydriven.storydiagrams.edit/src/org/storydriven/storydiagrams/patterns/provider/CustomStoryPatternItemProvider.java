package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomStoryPatternItemProvider extends StoryPatternItemProvider {
	public CustomStoryPatternItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/StoryPattern.png"); //$NON-NLS-1$
	}
}
