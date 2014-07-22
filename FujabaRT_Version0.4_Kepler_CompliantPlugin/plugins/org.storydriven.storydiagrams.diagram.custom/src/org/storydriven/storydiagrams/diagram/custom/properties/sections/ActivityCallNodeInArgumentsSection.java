package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.Collection;

import org.eclipse.emf.ecore.EParameter;

public class ActivityCallNodeInArgumentsSection extends AbstractActivityCallNodeArgumentsSection {
	@Override
	protected Collection<? extends EParameter> getParameters() {
		return getElement().getCallee().getInParameters();
	}
}
