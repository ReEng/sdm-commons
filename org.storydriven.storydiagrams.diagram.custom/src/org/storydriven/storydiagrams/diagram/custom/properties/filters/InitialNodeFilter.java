package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractFilter;

public class InitialNodeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof InitialNode;
	}
}
