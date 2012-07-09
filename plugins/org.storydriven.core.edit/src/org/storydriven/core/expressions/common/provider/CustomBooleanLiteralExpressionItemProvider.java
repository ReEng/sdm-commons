package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomBooleanLiteralExpressionItemProvider extends BooleanLiteralExpressionItemProvider {
	public CustomBooleanLiteralExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/BooleanLiteralExpression.png"); //$NON-NLS-1$
	}
}
