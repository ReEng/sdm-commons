package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomLogicExpressionItemProvider extends LogicExpressionItemProvider {
	public CustomLogicExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/LogicExpression.png"); //$NON-NLS-1$
	}
}
