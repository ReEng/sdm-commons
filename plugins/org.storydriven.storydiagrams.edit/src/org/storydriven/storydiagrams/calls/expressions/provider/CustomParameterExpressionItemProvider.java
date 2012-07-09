package org.storydriven.storydiagrams.calls.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomParameterExpressionItemProvider extends ParameterExpressionItemProvider {
	public CustomParameterExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/expressions/ParameterExpression.png"); //$NON-NLS-1$
	}
}
