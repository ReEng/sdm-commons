package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEStringSection;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class PathExpressionSection extends AbstractEStringSection {
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.PATH__PATH_EXPRESSION;
	}

	@Override
	protected String getLabelText() {
		return "Expression";
	}
}
