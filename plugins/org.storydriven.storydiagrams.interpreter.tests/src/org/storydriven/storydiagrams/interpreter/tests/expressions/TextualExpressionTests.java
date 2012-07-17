package org.storydriven.storydiagrams.interpreter.tests.expressions;

import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

public class TextualExpressionTests extends AbstractTests {
	@Test
	public void testTextualExpressionOcl() {
		assertResultTrue(getActivity("TextualExpression_OCL.sdm"));
	}

	@Override
	protected String getPath() {
		return "expressions/TextualExpression/";
	}
}
