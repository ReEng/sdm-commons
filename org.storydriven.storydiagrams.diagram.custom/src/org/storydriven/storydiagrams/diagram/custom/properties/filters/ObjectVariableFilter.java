package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractFilter;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class ObjectVariableFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ObjectVariable;
	}
}
