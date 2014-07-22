package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomComparisonExpressionItemProvider extends ComparisonExpressionItemProvider {
	public CustomComparisonExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/ComparisonExpression.png"); //$NON-NLS-1$
	}
}
