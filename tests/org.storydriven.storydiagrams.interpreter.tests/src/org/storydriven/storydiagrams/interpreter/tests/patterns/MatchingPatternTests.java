package org.storydriven.storydiagrams.interpreter.tests.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class MatchingPatternTests extends AbstractTests {
	@Test
	public void testConstraintPatternCommonGuarded() {
		assertResultTrue(getActivity("ConstraintPatternCommonGuarded.sdm"));
	}

	@Test
	public void testMatchingFails() {
		assertResultTrue(getActivity("MatchingFails.sdm"));
	}

	@Test
	public void testInclusionLinkCreate() {
		assertResultTrue(getActivity("InclusionLink_CREATE.sdm"));
	}

	@Test
	public void testLinkVariable() {
		assertResultTrue(getActivity("LinkVariable.sdm"));
	}

	@Test
	public void testLinkVariableBidirectional() {
		assertResultTrue(getActivity("LinkVariable_bidirectional.sdm"));
	}

	@Test
	public void testLinkVariableMulti() {
		assertResultTrue(getActivity("LinkVariable_multi.sdm"));
	}

	@Test
	public void testLinkVariableMany() {
		assertResultTrue(getActivity("LinkVariable_MANY.sdm"));
	}

	@Test
	public void testObjectVariable() {
		assertResultTrue(getActivity("ObjectVariable.sdm"));
	}

	@Test
	public void testObjectVariableOptional() {
		assertResultTrue(getActivity("ObjectVariable_OPTIONAL.sdm"));
	}

	@Test
	public void testObjectVariableNegative() {
		assertResultTrue(getActivity("ObjectVariable_NEGATIVE.sdm"));
	}

	@Test
	public void testObjectVariableNegativeMulti() {
		assertResultTrue(getActivity("ObjectVariable_NEGATIVE_MULTI.sdm"));
	}

	@Test
	public void testObjectVariableMaybe() {
		assertResultTrue(getActivity("ObjectVariable_MAYBE.sdm"));
	}

	@Test
	public void testCollectionVariable() {
		Map<String, Variable<EClassifier>> result = assertResultTrue(getActivity("CollectionVariable.sdm"));

		assertTrue(((Collection<?>) result.get("set1").getValue()).size() == 2);
	}

	@Test
	public void testCollectionSizeExpression() {
		assertResultTrue(getActivity("CollectionSizeExpression.sdm"));
	}

	@Test
	public void testMatchFromResource() {
		Activity activity = getActivity("MatchFromResource.sdm");
		Resource resource = getResource("MatchFromResource.tests");

		Map<String, Object> arguments = new LinkedHashMap<String, Object>();
		arguments.put("clazz", resource.getEObject("//@packages.0/@types.0"));

		// execute
		Map<String, Variable<EClassifier>> result = execute(activity, arguments);

		// check for 'class' variable
		assertEquals("The variable 'clazz' has wrong value.", result.get("clazz").getValue(),
				resource.getEObject("//@packages.0/@types.0"));

		// check for 'method' variable
		assertEquals("The variable 'method' has wrong value.", result.get("method").getValue(),
				resource.getEObject("//@packages.0/@types.0/@methods.0"));

		// check for result
		assertEquals("The return value is wrong.", result.get(RESULT).getValue(),
				resource.getEObject("//@packages.0/@types.0/@methods.0"));

	}

	@Override
	protected String getPath() {
		return "patterns/MatchingStoryNode/";
	}
}
