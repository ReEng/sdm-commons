package org.storydriven.storydiagrams.patterns.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomObjectVariableExpressionItemProvider extends ObjectVariableExpressionItemProvider {
	public CustomObjectVariableExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/expressions/ObjectVariableExpression.png"); //$NON-NLS-1$
	}
}
