package org.storydriven.storydiagrams.interpreter.tests.patterns;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.storydiagrams.interpreter.tests.TestBase;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ModifyingPatternsTests extends TestBase
{

	public ModifyingPatternsTests(String name)
	{
		super(name);
	}

	@Override
	protected String getModelFolder()
	{
		return "/org.storydriven.modeling.interpreter.tests/models/patterns/modifying/";
	}

	public void testAttributeAssignment() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testAttributeAssignment'.");

		Activity a = this.loadActivityDiagram("testAttributeAssignment.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		EObject obj = (EObject) vars.get("var").getValue();

		EAttribute attr = null;
		EList<EAttribute> attributes = obj.eClass().getEAllAttributes();
		for (EAttribute attribute : attributes)
		{
			if (attribute.getName().equals("attr"))
			{
				attr = attribute;
			}
		}

		assertTrue(obj.eGet(attr, true).equals("newValue"));

		vars = this.executeActivityNode(an);

		assertTrue(obj.eGet(attr, true).equals("newValue"));
	}

	public void testCreateObjectVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testCreateObjectVariable'.");

		Activity a = this.loadActivityDiagram("testCreateObjectVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));

		vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));
	}

	public void testDestroyObjectVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testDestroyObjectVariable'.");

		Activity a = this.loadActivityDiagram("testDestroyObjectVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		this.checkDestroyedReference(vars);

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		this.checkDestroyedReference(vars);
	}

	private void checkDestroyedReference(Map<String, Variable<EClassifier>> vars)
	{
		EObject varA = (EObject) vars.get("varA").getValue();

		EReference ref = null;
		EList<EReference> references = varA.eClass().getEAllReferences();
		for (EReference eReference : references)
		{
			if (eReference.getName().equals("toOneRef"))
			{
				ref = eReference;
			}
		}

		assertTrue(varA.eGet(ref, true) == null);
	}

	public void testOptionalCreateObjectVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testOptionalCreateObjectVariable'.");

		Activity a = this.loadActivityDiagram("testOptionalCreateObjectVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));

		vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));
	}

}
