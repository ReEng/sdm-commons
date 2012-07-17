package org.storydriven.storydiagrams.interpreter.tests.activities;

import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ActivityTests extends AbstractTests {
	@Test
	public void testFromInitialToActivityFinalNode() {
		assertResultTrue(getActivity("FromInitialToActivityFinalNode.sdm"));
	}

	@Test
	public void testWorkWithInputParameter() {
		Activity activity = getActivity("WorkWithInputParameter.sdm");

		int number = 50;
		Map<String, Object> arguments = new LinkedHashMap<String, Object>();
		arguments.put("param", number);

		// check that the result is the doubled input
		assertResultEquals(activity, arguments, (number * 2));
	}

	@Test
	public void testJunctionNodeGuard() {
		Map<String, Variable<EClassifier>> result = execute(getActivity("JunctionNodeGuard.sdm"));

		assertTrue(((EObject) result.get(RESULT).getValue()).eClass().getName().equals("Interface"));
	}

	@Test
	public void testStoryNodeForEach() {
		assertResultTrue(getActivity("StoryNodeForEach.sdm"));
	}

	@Test
	public void testActivityCallNodeCallee() {
		Map<String, Variable<EClassifier>> result = execute(getActivity("ActivityCallNode_callee.sdm"));

		// check if there is a (correct) element returned
		result.get(RESULT).getClassifier().getName().equals("Class");
	}

	@Test
	public void testActivityCallNode() {
		assertResultTrue(getActivity("ActivityCallNode.sdm"));
	}

	@Override
	protected String getPath() {
		return "activities/";
	}

	@Test
	public void testExceptionFinallyGuard() {
		assertResultTrue(getActivity("ExceptionFinallyGuard.sdm"));
	}
}
