package org.storydriven.storydiagrams.diagram.custom.providers;

import org.storydriven.storydiagrams.diagram.custom.edit.parts.CustomStorydiagramsEditPartFactory;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsEditPartProvider;

public class CustomStorydiagramsEditPartProvider extends StorydiagramsEditPartProvider {
	public CustomStorydiagramsEditPartProvider() {
		super();
		setFactory(new CustomStorydiagramsEditPartFactory());
	}
}
