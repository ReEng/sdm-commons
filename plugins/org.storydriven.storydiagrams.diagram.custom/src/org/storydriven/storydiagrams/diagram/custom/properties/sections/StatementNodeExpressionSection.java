package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEStringSection;

public class StatementNodeExpressionSection extends AbstractEStringSection {
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION;
	}

	@Override
	protected String getLabelText() {
		return "Expression";
	}
}
