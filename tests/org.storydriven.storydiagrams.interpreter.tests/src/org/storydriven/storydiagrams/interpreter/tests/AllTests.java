package org.storydriven.storydiagrams.interpreter.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.storydriven.storydiagrams.interpreter.tests.activities.ActivityTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.ArithmeticExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.ComparisonExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.LiteralExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.LogicalExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.MethodCallExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.TextualExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.expressions.UnaryExpressionTests;
import org.storydriven.storydiagrams.interpreter.tests.patterns.MatchingPatternTests;
import org.storydriven.storydiagrams.interpreter.tests.patterns.ModifyingPatternTests;

@RunWith(Suite.class)
@SuiteClasses({ ActivityTests.class, MatchingPatternTests.class, TextualExpressionTests.class,
		ArithmeticExpressionTests.class, ComparisonExpressionTests.class, LiteralExpressionTests.class,
		LogicalExpressionTests.class, UnaryExpressionTests.class, MethodCallExpressionTests.class,
		ModifyingPatternTests.class })
public class AllTests {

}
