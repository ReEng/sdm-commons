package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.StoryNode;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class StoryNodeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof StoryNode;
	}
}
