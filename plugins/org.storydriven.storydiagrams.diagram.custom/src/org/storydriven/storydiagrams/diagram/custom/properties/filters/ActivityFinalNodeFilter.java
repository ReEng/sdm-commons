package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.FlowFinalNode;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class ActivityFinalNodeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ActivityFinalNode && !(element instanceof FlowFinalNode);
	}
}
