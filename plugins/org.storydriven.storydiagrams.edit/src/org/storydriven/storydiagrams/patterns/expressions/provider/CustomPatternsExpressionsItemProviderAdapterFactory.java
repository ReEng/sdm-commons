package org.storydriven.storydiagrams.patterns.expressions.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomPatternsExpressionsItemProviderAdapterFactory extends PatternsExpressionsItemProviderAdapterFactory {
	@Override
	public Adapter createAttributeValueExpressionAdapter() {
		if (attributeValueExpressionItemProvider == null) {
			attributeValueExpressionItemProvider = new CustomAttributeValueExpressionItemProvider(this);
		}
		return attributeValueExpressionItemProvider;
	}

	@Override
	public Adapter createCollectionSizeExpressionAdapter() {
		if (collectionSizeExpressionItemProvider == null) {
			collectionSizeExpressionItemProvider = new CustomCollectionSizeExpressionItemProvider(this);
		}
		return collectionSizeExpressionItemProvider;
	}

	@Override
	public Adapter createObjectVariableExpressionAdapter() {
		if (objectVariableExpressionItemProvider == null) {
			objectVariableExpressionItemProvider = new CustomObjectVariableExpressionItemProvider(this);
		}
		return objectVariableExpressionItemProvider;
	}

	@Override
	public Adapter createPrimitiveVariableExpressionAdapter() {
		if (primitiveVariableExpressionItemProvider == null) {
			primitiveVariableExpressionItemProvider = new CustomPrimitiveVariableExpressionItemProvider(this);
		}
		return primitiveVariableExpressionItemProvider;
	}
}
