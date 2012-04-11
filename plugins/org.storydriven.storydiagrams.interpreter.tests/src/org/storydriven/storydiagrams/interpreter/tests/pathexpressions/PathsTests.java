package org.storydriven.storydiagrams.interpreter.tests.pathexpressions;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.expressions.PathExpressionsStandaloneSetupGenerated;
import org.storydriven.modeling.expressions.pathExpressions.PathExpression;
import org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge;
import org.storydriven.modeling.expressions.pathbridge.PathbridgeFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.Path;
import org.storydriven.storydiagrams.interpreter.tests.TestBase;

import com.google.inject.Injector;

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
		return "/org.storydriven.modeling.interpreter.tests/models/patterns/paths/";
	}

	public void testPathImplicit1() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicit1'.");

		// a--b--c

		Activity a = this.loadActivityDiagram("testPathImplicit1.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "-->*");
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
		PathExpressionBridge pathExpressionBridge = PathbridgeFactory.eINSTANCE.createPathExpressionBridge();
		Injector guiceInjector = new PathExpressionsStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		IParser parser = guiceInjector.getInstance(IAntlrParser.class);
		IParseResult result = parser.parse(new StringReader(expression));
		EObject eRoot = result.getRootASTElement();
		PathExpression root = (PathExpression) eRoot;

		pathExpressionBridge.setPathExpression(root);
		path.setPathExpression(pathExpressionBridge);
	}

	public void testPathImplicit2() throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting 'testPathImplicit2'.");

		// a--b--c--c1

		Activity a = this.loadActivityDiagram("testPathImplicit2.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "-->*");
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

		Activity a = this.loadActivityDiagram("testPathImplicitFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "-->*");
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

		Activity a = this.loadActivityDiagram("testPathImplicitContained1.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "<>-->*");
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

		Activity a = this.loadActivityDiagram("testPathImplicitContained2.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "<>-->*");
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

		Activity a = this.loadActivityDiagram("testPathImplicitContainedFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "<>-->*");
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

		Activity a = this.loadActivityDiagram("testPathExplicit1.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "toOneRef.refToC");
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

		Activity a = this.loadActivityDiagram("testPathExplicit2.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "elements*");
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

		Activity a = this.loadActivityDiagram("testPathExplicitFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "toOneRef*.refToC");
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

		Activity a = this.loadActivityDiagram("testTypeRestrictionsFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "-->[!ClassB]*");
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

		Activity a = this.loadActivityDiagram("testTypeRestrictionsFails.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "-->[!X]*");
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

		Activity a = this.loadActivityDiagram("testPathComplex.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "(-->[!ClassC]*|-->[!ClassB]*)");
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

		Activity a = this.loadActivityDiagram("testPathComplex.sdm");

		for (ActivityNode node : a.getOwnedActivityNodes())
		{
			if (node instanceof MatchingStoryNode)
			{
				for (AbstractLinkVariable link : ((MatchingStoryNode) node).getOwnedPattern().getLinkVariables())
				{
					if (link instanceof Path)
					{
						Path path = (Path) link;
						this.createPathExpression(path, "(toOneRef[!ClassB]*.elements|toOneRef.refToC.elements[!ClassC]*.toOneRef)");
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
