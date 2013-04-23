package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.ui.properties.AbstractExtendedExpressionSection;

public class ConstraintExpressionSection extends AbstractExtendedExpressionSection {
	@Override
	protected Expression getExpression() {
		return getElement().getConstraintExpression();
	}

	@Override
	protected void setExpression(Expression expression) {
		getElement().setConstraintExpression(expression);
	}

	@Override
	protected EClassifier getContextClassifier() {
		if (getElement().getObjectVariable() != null) {
			return getElement().getObjectVariable().getType();
		}
		return super.getContextClassifier();
	}

	@Override
	protected Constraint getElement() {
		return (Constraint) super.getElement();
	}

	@Override
	protected String getLabelText() {
		return "Constraint Expression";
	}
}
