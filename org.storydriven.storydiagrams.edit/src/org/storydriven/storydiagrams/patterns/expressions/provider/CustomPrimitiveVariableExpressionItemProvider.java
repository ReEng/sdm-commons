package org.storydriven.storydiagrams.patterns.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomPrimitiveVariableExpressionItemProvider extends PrimitiveVariableExpressionItemProvider {
	public CustomPrimitiveVariableExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/expressions/PrimitiveVariableExpression.png"); //$NON-NLS-1$
	}
}
