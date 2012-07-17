package org.storydriven.storydiagrams.interpreter.tests.expressions;

import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

public class ArithmeticExpressionTests extends AbstractTests {
	@Test
	public void testArithmeticExpressionPlus() {
		assertResultTrue(getActivity("ArithmeticExpression_PLUS.sdm"));
	}

	@Test
	public void testArithmeticExpressionMinus() {
		assertResultTrue(getActivity("ArithmeticExpression_MINUS.sdm"));
	}

	@Test
	public void testArithmeticExpressionTimes() {
		assertResultTrue(getActivity("ArithmeticExpression_TIMES.sdm"));
	}

	@Test
	public void testArithmeticExpressionDivide() {
		assertResultTrue(getActivity("ArithmeticExpression_DIVIDE.sdm"));
	}

	@Test
	public void testArithmeticExpressionModulo() {
		assertResultTrue(getActivity("ArithmeticExpression_MODULO.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/ArithmeticExpression/";
	}
}
