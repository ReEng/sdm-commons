package org.storydriven.storydiagrams.interpreter.tests.expressions;

import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

public class UnaryExpressionTests extends AbstractTests {
	@Test
	public void testUnaryExpressionNot() {
		assertResultTrue(getActivity("UnaryExpression_NOT.sdm"));
	}

	@Test
	public void testUnaryExpressionPlus() {
		assertResultTrue(getActivity("UnaryExpression_PLUS.sdm"));
	}

	@Test
	public void testUnaryExpressionMinus() {
		assertResultTrue(getActivity("UnaryExpression_MINUS.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/UnaryExpression/";
	}
}
