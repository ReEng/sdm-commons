package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomStringLiteralExpressionItemProvider extends StringLiteralExpressionItemProvider {
	public CustomStringLiteralExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/StringLiteralExpression.png"); //$NON-NLS-1$
	}
}
