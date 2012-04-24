package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractFilter;

public class ActivityEdgeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ActivityEdge && !(((ActivityEdge) element).getSource() instanceof StartNode);
	}
}
