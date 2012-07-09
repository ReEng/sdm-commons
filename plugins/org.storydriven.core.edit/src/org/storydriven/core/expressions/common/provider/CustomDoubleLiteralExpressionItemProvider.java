package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomDoubleLiteralExpressionItemProvider extends DoubleLiteralExpressionItemProvider {
	public CustomDoubleLiteralExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/DoubleLiteralExpression.png"); //$NON-NLS-1$
	}
}
