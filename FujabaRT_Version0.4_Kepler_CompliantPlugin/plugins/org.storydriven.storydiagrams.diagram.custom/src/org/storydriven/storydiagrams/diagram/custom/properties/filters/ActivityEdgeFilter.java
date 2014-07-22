package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.InitialNode;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class ActivityEdgeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ActivityEdge && !(((ActivityEdge) element).getSource() instanceof InitialNode);
	}
}
