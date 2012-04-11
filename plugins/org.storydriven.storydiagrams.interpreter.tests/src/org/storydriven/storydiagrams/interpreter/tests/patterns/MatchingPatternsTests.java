package org.storydriven.storydiagrams.interpreter.tests.patterns;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.storydiagrams.interpreter.tests.TestBase;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class MatchingPatternsTests extends TestBase
{

	public MatchingPatternsTests(String name)
	{
		super(name);
	}

	@Override
	protected String getModelFolder()
	{
		return "/org.storydriven.modeling.interpreter.tests/models/patterns/matching/";
	}

	public void testConstraints() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testConstraints'.");

		Activity a = this.loadActivityDiagram("testConstraints.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	// public void testContainmentRelation() throws IOException, SDMException
	// {
	// System.out.println("\n\n\nExecuting 'testContainmentRelation'.");
	//
	// Activity a = loadActivityDiagram("testContainmentRelation.sdm");
	//
	// ActivityNode an = a.getOwnedActivityNodes().get(0);
	//
	// Map<String, Variable> vars = executeActivityNode(an);
	//
	//
	// assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
	//
	// vars = executeActivityNode(an);
	//
	//
	// assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
	// }

	public void testMatchingBidirectionalLinkVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingBidirectionalLinkVariable'.");

		Activity a = this.loadActivityDiagram("testMatchingBidirectionalLinkVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMatchingFails() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingFails'.");

		Activity a = this.loadActivityDiagram("testMatchingFails.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMatchingLinkVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingLinkVariable'.");

		Activity a = this.loadActivityDiagram("testMatchingLinkVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMatchingNegativeObjectVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingNegativeObjectVariable'.");

		Activity a = this.loadActivityDiagram("testMatchingNegativeObjectVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMatchingNegativeLinkVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingNegativeLinkVariable'.");

		Activity a = this.loadActivityDiagram("testMatchingNegativeLinkVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMatchingOptionalObjectVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingOptionalObjectVariable'.");

		Activity a = this.loadActivityDiagram("testMatchingOptionalObjectVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMatchingToManyLinkVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMatchingToManyLinkVariable'.");

		Activity a = this.loadActivityDiagram("testMatchingToManyLinkVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testMaybeBoundObjectVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testMaybeBoundObjectVariable'.");

		Activity a = this.loadActivityDiagram("testMaybeBoundObjectVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testObjectSetSizeExpression() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testObjectSetSizeExpression'.");

		Activity a = this.loadActivityDiagram("testObjectSetSizeExpression.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testObjectSetVariable() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testObjectSetVariable'.");

		Activity a = this.loadActivityDiagram("testObjectSetVariable.sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EList) vars.get("set1").getValue()).size() == 2);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(((EList) vars.get("set1").getValue()).size() == 2);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

}
