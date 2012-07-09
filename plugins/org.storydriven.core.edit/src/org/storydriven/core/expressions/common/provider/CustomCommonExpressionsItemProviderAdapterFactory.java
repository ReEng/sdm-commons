package org.storydriven.core.expressions.common.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomCommonExpressionsItemProviderAdapterFactory extends CommonExpressionsItemProviderAdapterFactory {

	@Override
	public Adapter createUnaryExpressionAdapter() {
		if (unaryExpressionItemProvider == null) {
			unaryExpressionItemProvider = new CustomUnaryExpressionItemProvider(this);
		}
		return unaryExpressionItemProvider;
	}

	@Override
	public Adapter createComparisonExpressionAdapter() {
		if (comparisonExpressionItemProvider == null) {
			comparisonExpressionItemProvider = new CustomComparisonExpressionItemProvider(this);
		}
		return comparisonExpressionItemProvider;
	}

	@Override
	public Adapter createArithmeticExpressionAdapter() {
		if (arithmeticExpressionItemProvider == null) {
			arithmeticExpressionItemProvider = new CustomArithmeticExpressionItemProvider(this);
		}
		return arithmeticExpressionItemProvider;
	}

	@Override
	public Adapter createLogicExpressionAdapter() {
		if (logicExpressionItemProvider == null) {
			logicExpressionItemProvider = new CustomLogicExpressionItemProvider(this);
		}
		return logicExpressionItemProvider;
	}

	@Override
	public Adapter createBooleanLiteralExpressionAdapter() {
		if (booleanLiteralExpressionItemProvider == null) {
			booleanLiteralExpressionItemProvider = new CustomBooleanLiteralExpressionItemProvider(this);
		}
		return booleanLiteralExpressionItemProvider;
	}

	@Override
	public Adapter createIntegerLiteralExpressionAdapter() {
		if (integerLiteralExpressionItemProvider == null) {
			integerLiteralExpressionItemProvider = new CustomIntegerLiteralExpressionItemProvider(this);
		}
		return integerLiteralExpressionItemProvider;
	}

	@Override
	public Adapter createDoubleLiteralExpressionAdapter() {
		if (doubleLiteralExpressionItemProvider == null) {
			doubleLiteralExpressionItemProvider = new CustomDoubleLiteralExpressionItemProvider(this);
		}
		return doubleLiteralExpressionItemProvider;
	}

	@Override
	public Adapter createStringLiteralExpressionAdapter() {
		if (stringLiteralExpressionItemProvider == null) {
			stringLiteralExpressionItemProvider = new CustomStringLiteralExpressionItemProvider(this);
		}
		return stringLiteralExpressionItemProvider;
	}
}
