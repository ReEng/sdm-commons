package org.storydriven.storydiagrams.interpreter.tests.expressions;

import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

public class LiteralExpressionTests extends AbstractTests {
	@Test
	public void testLiteralExpressionBooleanFalse() {
		assertResultTrue(getActivity("LiteralExpression__Boolean_FALSE.sdm"));
	}

	@Test
	public void testLiteralExpressionBooleanTrue() {
		assertResultTrue(getActivity("LiteralExpression__Boolean_TRUE.sdm"));
	}

	@Test
	public void testLiteralExpressionInteger() {
		assertResultTrue(getActivity("LiteralExpression__Integer.sdm"));
	}

	@Test
	public void testLiteralExpressionDecimal() {
		assertResultTrue(getActivity("LiteralExpression__Decimal.sdm"));
	}

	@Test
	public void testLiteralExpressionStringSingleQuote() {
		assertResultTrue(getActivity("LiteralExpression__String_SingleQuote.sdm"));
	}

	@Test
	public void testLiteralExpressionStringDoubleQuote() {
		assertResultTrue(getActivity("LiteralExpression__String_DoubleQuote.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/LiteralExpression/";
	}
}
