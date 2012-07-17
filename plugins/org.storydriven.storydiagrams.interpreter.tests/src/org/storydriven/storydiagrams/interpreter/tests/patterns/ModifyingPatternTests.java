package org.storydriven.storydiagrams.interpreter.tests.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.junit.Test;
import org.storydriven.storydiagrams.interpreter.tests.AbstractTests;
import org.storydriven.storydiagrams.tests.TestsPackage;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ModifyingPatternTests extends AbstractTests {
	@Test
	public void testAttributeAssignment() {
		Map<String, Variable<EClassifier>> result = execute(getActivity("AttributeAssignment.sdm"));

		assertEquals("newValue",
				((EObject) result.get(RESULT).getValue()).eGet(TestsPackage.Literals.NAMED__NAME, true));
	}

	@Test
	public void testObjectVariableCreate() {
		Map<String, Variable<EClassifier>> result = execute(getActivity("ObjectVariable_CREATE.sdm"));

		assertEquals("Class", ((EObject) result.get(RESULT).getValue()).eClass().getName());
	}

	@Test
	public void testObjectVariableDestroy() {
		// execute to TRUE
		Map<String, Variable<EClassifier>> result = assertResultTrue(getActivity("ObjectVariable_DESTROY.sdm"));

		// check if it is really destroyed
		EObject varA = (EObject) result.get("method").getValue();

		EReference ref = null;
		EList<EReference> references = varA.eClass().getEAllReferences();
		for (EReference eReference : references) {
			if (eReference.getName().equals("type")) {
				ref = eReference;
			}
		}

		assertNull("The variable has not been destroyed.", varA.eGet(ref, true));
	}

	@Test
	public void testObjectVariableOptionalCreate() {
		Map<String, Variable<EClassifier>> result = execute(getActivity("ObjectVariable_OPTIONAL_CREATE.sdm"));

		assertEquals("Class", ((EObject) result.get(RESULT).getValue()).eClass().getName());
	}

	@Override
	protected String getPath() {
		return "patterns/ModifyingStoryNode/";
	}
}
