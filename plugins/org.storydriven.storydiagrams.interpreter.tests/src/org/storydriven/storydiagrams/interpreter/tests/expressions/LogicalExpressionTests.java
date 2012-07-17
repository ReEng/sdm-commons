package org.storydriven.storydiagrams.interpreter.tests.expressions;

import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

public class LogicalExpressionTests extends AbstractTests {
	@Test
	public void testLogicalExpressionAnd() {
		assertResultTrue(getActivity("LogicalExpression_AND.sdm"));
	}

	@Test
	public void testLogicalExpressionOr() {
		assertResultTrue(getActivity("LogicalExpression_OR.sdm"));
	}

	@Test
	public void testLogicalExpressionXor() {
		assertResultTrue(getActivity("LogicalExpression_XOR.sdm"));
	}

	@Test
	public void testLogicalExpressionImply() {
		assertResultTrue(getActivity("LogicalExpression_IMPLY.sdm"));
	}

	@Test
	public void testLogicalExpressionEquivalent() {
		assertResultTrue(getActivity("LogicalExpression_EQUIVALENT.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/LogicalExpression/";
	}
}
