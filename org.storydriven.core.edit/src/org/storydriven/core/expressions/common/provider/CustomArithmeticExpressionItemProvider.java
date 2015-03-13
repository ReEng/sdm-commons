package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomArithmeticExpressionItemProvider extends ArithmeticExpressionItemProvider {
	public CustomArithmeticExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/ArithmeticExpression.png"); //$NON-NLS-1$
	}
}
