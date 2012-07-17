package org.storydriven.storydiagrams.interpreter.tests.expressions;

import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

public class ComparisonExpressionTests extends AbstractTests {
	@Test
	public void testComparisonExpressionEqual() {
		assertResultTrue(getActivity("ComparisonExpression_EQUAL.sdm"));
	}

	@Test
	public void testComparisonExpressionGreaterOrEqual() {
		assertResultTrue(getActivity("ComparisonExpression_GREATER_OR_EQUAL.sdm"));
	}

	@Test
	public void testComparisonExpressionGreater() {
		assertResultTrue(getActivity("ComparisonExpression_GREATER.sdm"));
	}

	@Test
	public void testComparisonExpressionLessOrEqual() {
		assertResultTrue(getActivity("ComparisonExpression_LESS_OR_EQUAL.sdm"));
	}

	@Test
	public void testComparisonExpressionLess() {
		assertResultTrue(getActivity("ComparisonExpression_LESS.sdm"));
	}

	@Test
	public void testComparisonExpressionUnequal() {
		assertResultTrue(getActivity("ComparisonExpression_UNEQUAL.sdm"));
	}

	@Test
	public void testComparisonExpressionRegularExpression() {
		assertResultTrue(getActivity("ComparisonExpression_REGULAR_EXPRESSION.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/ComparisonExpression/";
	}
}
