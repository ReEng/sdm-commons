package org.storydriven.storydiagrams.activities.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomExceptionVariableExpressionItemProvider extends ExceptionVariableExpressionItemProvider {
	public CustomExceptionVariableExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/expressions/ExceptionVariableExpression.png"); //$NON-NLS-1$
	}
}
