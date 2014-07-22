package org.storydriven.storydiagrams.interpreter.tests.expressions;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class MethodCallExpressionTests extends AbstractTests {
	@Test
	public void testMethodCallExpressionSystemNanoTime() {
		long started = System.nanoTime();

		Map<String, Variable<EClassifier>> result = execute(getActivity("MethodCallExpression_System_nanoTime.sdm"));

		long ended = System.nanoTime();

		long calculated = (Long) result.get(RESULT).getValue();

		assertTrue(calculated >= started);
		assertTrue(calculated <= ended);
	}

	@Test
	public void testMethodCallExpressionMathRound() {
		assertResultTrue(getActivity("MethodCallExpression_Math_round.sdm"));
	}

	@Test
	public void testMethodCallExpressionStringLength() {
		assertResultTrue(getActivity("MethodCallExpression_String_length.sdm"));
	}

	@Test
	public void testMethodCallExpressionStringSubstring() {
		assertResultTrue(getActivity("MethodCallExpression_String_substring.sdm"));
	}

	@Test
	public void testMethodCallExpressionStringSubStringWithVariable() {
		assertResultTrue(getActivity("MethodCallExpression_String_substring_with_variable.sdm"));
	}

	@Test
	public void testMethodCallExpressionActivity() {
		assertResultTrue(getActivity("MethodCallExpression_Activity.sdm"));
	}

	@Test
	public void testMethodCallExpressionActivityWithParameter() {
		assertResultTrue(getActivity("MethodCallExpression_ActivityWithParameter.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/MethodCallExpression/";
	}
}
