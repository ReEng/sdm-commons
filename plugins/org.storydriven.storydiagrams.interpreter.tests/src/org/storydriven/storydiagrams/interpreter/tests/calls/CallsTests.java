package org.storydriven.storydiagrams.interpreter.tests.calls;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.storydiagrams.interpreter.tests.TestBase;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;

public class CallsTests extends TestBase
{

	public CallsTests(String name)
	{
		super(name);
	}

	@Override
	protected String getModelFolder()
	{
		return "/org.storydriven.modeling.interpreter.tests/models/calls/";
	}

	public void testOCL() throws IOException, SDMException
	{
		this.booleanTest("testOCL");
	}

	public void testLiteralExpression() throws IOException, SDMException
	{
		this.booleanTest("testLiteralExpression");
	}

	public void testNotExpression() throws IOException, SDMException
	{
		this.booleanTest("testNotExpression");
	}

	public void testComparisonExpression() throws IOException, SDMException
	{
		this.booleanTest("testComparisonExpression");
	}

	public void testComparisonExpressionLess() throws IOException, SDMException
	{
		this.booleanTest("testComparisonExpressionLess");
	}

	public void testComparisonExpressionLessEqual() throws IOException, SDMException
	{
		this.booleanTest("testComparisonExpressionLessEqual");
	}

	public void testArithmeticExpressionPlus() throws IOException, SDMException
	{
		this.booleanTest("testArithmeticExpressionPlus");
	}

	public void testArithmeticExpressionMinus() throws IOException, SDMException
	{
		this.booleanTest("testArithmeticExpressionMinus");
	}

	public void testArithmeticExpressionTimes() throws IOException, SDMException
	{
		this.booleanTest("testArithmeticExpressionTimes");
	}

	public void testArithmeticExpressionDivide() throws IOException, SDMException
	{
		this.booleanTest("testArithmeticExpressionDivide");
	}

	public void testArithmeticExpressionModulo() throws IOException, SDMException
	{
		this.booleanTest("testArithmeticExpressionModulo");
	}

	public void testArithmeticExpressionExp() throws IOException, SDMException
	{
		this.booleanTest("testArithmeticExpressionExp");
	}

	public void testBinaryLogicExpressionAND() throws IOException, SDMException
	{
		this.booleanTest("testBinaryLogicExpressionAND");
	}

	public void testBinaryLogicExpressionOR() throws IOException, SDMException
	{
		this.booleanTest("testBinaryLogicExpressionOR");
	}

	public void testBinaryLogicExpressionEquivalent() throws IOException, SDMException
	{
		this.booleanTest("testBinaryLogicExpressionEquivalent");
	}

	public void testBinaryLogicExpressionImply() throws IOException, SDMException
	{
		this.booleanTest("testBinaryLogicExpressionImply");
	}

	public void testBinaryLogicExpressionXor() throws IOException, SDMException
	{
		this.booleanTest("testBinaryLogicExpressionXor");
	}

	public void testMethodCallExpression() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMethodCallExpression'.");

		Activity a = this.loadActivityDiagram("testMethodCallExpression.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		long start = System.nanoTime();

		Map<String, de.mdelab.sdm.interpreter.core.variables.Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue((Long) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue() > start);

		vars = this.executeActivityNode(an);

		assertTrue((Long) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue() > start);
	}

	public void testMethodCallExpression2() throws IOException, SDMException
	{
		this.booleanTest("testMethodCallExpression2");
	}

	public void testMethodCallExpression3() throws IOException, SDMException
	{
		this.booleanTest("testMethodCallExpression3");
	}

	public void testMethodCallExpression4() throws IOException, SDMException
	{
		this.booleanTest("testMethodCallExpression4");
	}

	public void testMethodCallExpression5() throws IOException, SDMException
	{
		this.booleanTest("testMethodCallExpression5");
	}

	public void testMethodCallExpression_Activity() throws IOException, SDMException
	{
		this.booleanTest("testMethodCallExpression_Activity");
	}

	public void testMethodCallExpression_Activity2() throws IOException, SDMException
	{
		this.booleanTest("testMethodCallExpression_Activity2");
	}
}
