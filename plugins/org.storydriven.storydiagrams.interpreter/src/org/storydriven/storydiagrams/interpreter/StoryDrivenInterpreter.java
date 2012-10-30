package org.storydriven.storydiagrams.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.interpreter.facade.StoryDrivenMetamodelFacadeFactory;
import org.storydriven.storydiagrams.interpreter.patternmatcher.StoryDrivenPatternMatcher;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreter;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StoryDrivenInterpreter
		extends
		SDMInterpreter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenInterpreter(
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager)
	{
		this(expressionInterpreterManager, null);
	}

	public StoryDrivenInterpreter(
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, expressionInterpreterManager, notificationEmitter);
	}

	@Override
	protected StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createStoryPatternMatcher(
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		return new StoryDrivenPatternMatcher(storyPattern, variablesScope, getExpressionInterpreterManager(), getNotificationEmitter());
	}

	@Override
	protected ActivityNode executeCustomNode(
			ActivityNode node,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		if (node instanceof ActivityCallNode)
		{
			ActivityCallNode activityCallNode = (ActivityCallNode) node;

			assert !activityCallNode.getCalledActivities().isEmpty();

			Collection<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();

			for (ParameterBinding pb : activityCallNode.getOwnedParameterBindings())
			{
				parameters.add(new Variable<EClassifier>(pb.getParameter().getName(), pb.getParameter().getEType(),
						getExpressionInterpreterManager().evaluateExpression(pb.getValueExpression(), null, null, variablesScope)));
			}

			/*
			 * TODO: implement polymorphic dispatch to select most suitable
			 * activity
			 */
			Activity activity = activityCallNode.getCalledActivities().get(0);

			StoryDrivenInterpreter sdi = new StoryDrivenInterpreter(getExpressionInterpreterManager(), getNotificationEmitter());

			Map<String, Variable<EClassifier>> returnValues = sdi.executeActivity(activity, parameters);

			for (EParameter param : activity.getOutParameters())
			{
				variablesScope.createVariable(param.getName(), param.getEType(), returnValues.get(param.getName()));
			}

			assert node.getOutgoings().size() == 1;
			assert node.getOutgoings().get(0).getTarget() != null;

			return node.getOutgoings().get(0).getTarget();
		}
		else
		{
			throw new UnsupportedOperationException();
		}
	}
}
