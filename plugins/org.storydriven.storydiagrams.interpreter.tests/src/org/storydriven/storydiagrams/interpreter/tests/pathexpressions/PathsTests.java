package org.storydriven.storydiagrams.interpreter.tests.pathexpressions;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.interpreter.tests.TestBase;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.Path;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class PathsTests extends TestBase
{

	public PathsTests(String name)
	{
		super(name);
	}

	@Override
	protected String getModelFolder()
	{
		return "/org.storydriven.storydiagrams.interpreter.tests/models/patterns/paths/";
	}

	public void testPathImplicit1() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicit1'.");

		// a--b--c

		Activity a = loadActivityDiagram("testPathImplicit1.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "-->*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void createPathExpression(Path path, String expression)
	{
		// PathExpressionBridge pathExpressionBridge =
		// PathbridgeFactory.eINSTANCE.createPathExpressionBridge();
		// Injector guiceInjector = new
		// PathExpressionsStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		// IParser parser = guiceInjector.getInstance(IAntlrParser.class);
		// IParseResult result = parser.parse(new StringReader(expression));
		// EObject eRoot = result.getRootASTElement();
		// PathExpression root = (PathExpression) eRoot;
		//
		// pathExpressionBridge.setPathExpression(root);
		// path.setPathExpression(pathExpressionBridge);

		// TODO

		throw new UnsupportedOperationException();
	}

	public void testPathImplicit2() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicit2'.");

		// a--b--c--c1

		Activity a = loadActivityDiagram("testPathImplicit2.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "-->*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassC"));

		vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassC"));
	}

	public void testPathImplicitFails() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicitFails'.");

		// a--b--b2

		Activity a = loadActivityDiagram("testPathImplicitFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "-->*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));
	}

	public void testPathImplicitContained1() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicitContained1'.");

		// a<>--b<>--c

		Activity a = loadActivityDiagram("testPathImplicitContained1.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "<>-->*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testPathImplicitContained2() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicitContained2'.");

		// a<>--a1<>--a2<>--a3<>--a4

		Activity a = loadActivityDiagram("testPathImplicitContained2.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "<>-->*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));

		vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));
	}

	public void testPathImplicitContainedFails() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicitContainedFails'.");

		// a<>--b<>--b2

		Activity a = loadActivityDiagram("testPathImplicitContainedFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "<>-->*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));
	}

	public void testPathExplicit1() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathExplicit1'.");

		// a--b--c

		Activity a = loadActivityDiagram("testPathExplicit1.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "toOneRef.refToC");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testPathExplicit2() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathExplicit2'.");

		// a<>--a1<>--a2<>--a3<>--a4

		Activity a = loadActivityDiagram("testPathExplicit2.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "elements*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));

		vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassA"));
	}

	public void testPathExplicitFails() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathExplicitFails'.");

		// a--b--b2

		Activity a = loadActivityDiagram("testPathExplicitFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "toOneRef*.refToC");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));
	}

	public void testTypeRestrictionsFails() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testTypeRestrictionsFails'.");

		// a--b--c

		Activity a = loadActivityDiagram("testTypeRestrictionsFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "-->[!ClassB]*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.FALSE));
	}

	public void testTypeRestrictions() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testTypeRestrictionsFails'.");

		// a--b--c

		Activity a = loadActivityDiagram("testTypeRestrictionsFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "-->[!X]*");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}

	public void testPathComplex1() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathComplex1'.");

		Activity a = loadActivityDiagram("testPathComplex.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "(-->[!ClassC]*|-->[!ClassB]*)");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassB"));

		vars = this.executeActivityNode(an);

		assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue()).eClass().getName().equals("ClassB"));
	}

	public void testPathComplex2() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathComplex2'.");

		Activity a = loadActivityDiagram("testPathComplex.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						createPathExpression(path, "(toOneRef[!ClassB]*.elements|toOneRef.refToC.elements[!ClassC]*.toOneRef)");
					}
				}
			}
		}

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME) == null);

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME) == null);
	}

}
