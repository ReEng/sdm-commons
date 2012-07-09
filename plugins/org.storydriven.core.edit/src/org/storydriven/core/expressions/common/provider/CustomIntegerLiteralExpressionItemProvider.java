package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomIntegerLiteralExpressionItemProvider extends IntegerLiteralExpressionItemProvider {
	public CustomIntegerLiteralExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/IntegerLiteralExpression.png"); //$NON-NLS-1$
	}
}
