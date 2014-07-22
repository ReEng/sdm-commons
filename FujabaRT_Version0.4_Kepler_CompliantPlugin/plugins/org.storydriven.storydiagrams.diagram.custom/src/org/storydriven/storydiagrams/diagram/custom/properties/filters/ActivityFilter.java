package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.Activity;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class ActivityFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof Activity;
	}
}
