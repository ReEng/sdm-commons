package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractFilter;

public class ActivityCallNodeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ActivityCallNode;
	}
}
