package org.storydriven.storydiagrams.patterns.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomCollectionSizeExpressionItemProvider extends CollectionSizeExpressionItemProvider {
	public CustomCollectionSizeExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/expressions/CollectionSizeExpression.png"); //$NON-NLS-1$
	}
}
