package org.storydriven.storydiagrams.calls.expressions.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomCallsExpressionsItemProviderAdapterFactory extends CallsExpressionsItemProviderAdapterFactory {
	@Override
	public Adapter createMethodCallExpressionAdapter() {
		if (methodCallExpressionItemProvider == null) {
			methodCallExpressionItemProvider = new CustomMethodCallExpressionItemProvider(this);
		}
		return methodCallExpressionItemProvider;
	}

	@Override
	public Adapter createParameterExpressionAdapter() {
		if (parameterExpressionItemProvider == null) {
			parameterExpressionItemProvider = new CustomParameterExpressionItemProvider(this);
		}
		return parameterExpressionItemProvider;
	}
}
