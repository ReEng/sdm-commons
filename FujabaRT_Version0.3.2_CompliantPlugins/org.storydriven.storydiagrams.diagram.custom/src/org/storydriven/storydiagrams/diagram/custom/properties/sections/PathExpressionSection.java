package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;
import org.storydriven.storydiagrams.patterns.Path;

public class PathExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		return getElement().getPathExpression();
	}

	@Override
	protected Path getElement() {
		return (Path) super.getElement();
	}
}
