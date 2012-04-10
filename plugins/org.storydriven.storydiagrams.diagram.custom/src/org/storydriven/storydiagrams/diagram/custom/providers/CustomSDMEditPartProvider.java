package org.storydriven.storydiagrams.diagram.custom.providers;

import org.storydriven.storydiagrams.diagram.custom.edit.parts.CustomSDMEditPartFactory;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsEditPartProvider;


public class CustomSDMEditPartProvider extends StorydiagramsEditPartProvider {
	public CustomSDMEditPartProvider() {
		super();
		setFactory(new CustomSDMEditPartFactory());
	}
}
