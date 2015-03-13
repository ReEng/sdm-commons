package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomUnaryExpressionItemProvider extends UnaryExpressionItemProvider {
	public CustomUnaryExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/UnaryExpression.png"); //$NON-NLS-1$
	}
}
