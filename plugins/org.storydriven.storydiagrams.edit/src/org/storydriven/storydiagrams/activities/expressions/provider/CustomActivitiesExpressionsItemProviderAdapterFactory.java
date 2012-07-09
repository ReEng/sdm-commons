package org.storydriven.storydiagrams.activities.expressions.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomActivitiesExpressionsItemProviderAdapterFactory extends
		ActivitiesExpressionsItemProviderAdapterFactory {
	@Override
	public Adapter createExceptionVariableExpressionAdapter() {
		if (exceptionVariableExpressionItemProvider == null) {
			exceptionVariableExpressionItemProvider = new CustomExceptionVariableExpressionItemProvider(this);
		}
		return exceptionVariableExpressionItemProvider;
	}
}
