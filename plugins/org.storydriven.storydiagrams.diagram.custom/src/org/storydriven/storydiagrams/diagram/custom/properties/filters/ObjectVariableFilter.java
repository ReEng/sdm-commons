package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class ObjectVariableFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ObjectVariable;
	}
}
