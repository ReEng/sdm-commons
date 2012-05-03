package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;

public class ActivityEdgeGuardExpression extends AbstractExpressionSection {

	@Override
	protected Expression getExpression() {
		return getElement().getGuardExpression();
	}

	@Override
	protected ActivityEdge getElement() {
		return (ActivityEdge) super.getElement();
	}

	@Override
	protected EClassifier getContextClassifier() {
		return EcorePackage.Literals.EBOOLEAN;
	}
}
