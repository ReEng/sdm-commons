package org.storydriven.storydiagrams.calls.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomMethodCallExpressionItemProvider extends MethodCallExpressionItemProvider {
	public CustomMethodCallExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/expressions/MethodCallExpression.png"); //$NON-NLS-1$
	}
}
