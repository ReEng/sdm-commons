package org.storydriven.storydiagrams.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

/**
 * @generated
 */
public class StorydiagramsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7020;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof StorydiagramsNavigatorItem) {
			StorydiagramsNavigatorItem item = (StorydiagramsNavigatorItem) element;
			return StorydiagramsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
