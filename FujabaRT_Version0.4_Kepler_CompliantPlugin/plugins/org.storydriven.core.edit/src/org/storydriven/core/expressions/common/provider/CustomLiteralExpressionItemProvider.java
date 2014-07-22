package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomLiteralExpressionItemProvider extends LiteralExpressionItemProvider {
	public CustomLiteralExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		// TODO Auto-generated method stub
		return getImage("core/expressions/common/LiteralExpression.png"); //$NON-NLS-1$
	}
}
