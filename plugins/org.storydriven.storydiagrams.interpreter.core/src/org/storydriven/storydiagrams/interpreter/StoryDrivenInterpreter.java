package org.storydriven.storydiagrams.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
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
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

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
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager)
	{
		this(expressionInterpreterManager, null);
	}

	public StoryDrivenInterpreter(
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, expressionInterpreterManager, notificationEmitter);
	}

	@Override
	protected StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createStoryPatternMatcher(
			final StoryPattern storyPattern,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		return new StoryDrivenPatternMatcher(storyPattern, variablesScope, this.getExpressionInterpreterManager(),
				this.getNotificationEmitter());
	}

	@Override
	protected ActivityNode executeCustomNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		if (node instanceof ActivityCallNode)
		{
			final ActivityCallNode activityCallNode = (ActivityCallNode) node;

			assert !activityCallNode.getCalledActivities().isEmpty();

			final Collection<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();

			assert !activityCallNode.getCalledActivities().isEmpty();

			/*
			 * TODO: implement polymorphic dispatch to select most suitable
			 * activity
			 */
			if (activityCallNode.getCalledActivities().size() > 1)
			{
				throw new UnsupportedOperationException("Polymorphic dispatch for ActivityCallNodes is not yet implemented.");
			}

			final Activity activity = activityCallNode.getCalledActivities().get(0);

			for (final ParameterBinding pb : activityCallNode.getOwnedParameterBindings())
			{
				if (!activity.getOutParameters().contains(pb.getParameter())) {
					parameters.add(new Variable<EClassifier>(pb.getParameter().getName(), pb.getParameter().getEType(), this
							.getExpressionInterpreterManager().evaluateExpression(pb.getValueExpression(), null, null, variablesScope)
							.getValue()));
				}
			}
			
			final StoryDrivenInterpreter sdi = new StoryDrivenInterpreter(this.getExpressionInterpreterManager(),
					this.getNotificationEmitter());

			final Map<String, Variable<EClassifier>> returnValues = sdi.executeActivity(activity, parameters);

			assert activity.getOutParameters().size() <= 1;
			//FIXME for outParameters > 1
			//for (final EParameter param : activity.getOutParameters())
			//{
			//	variablesScope.createVariable(param.getName(), param.getEType(), returnValues.get(param.getName()).getValue());
			//}
			
			if (activity.getOutParameters().size() == 1) {
			
				for (final ParameterBinding pb : activityCallNode.getOwnedParameterBindings())
				{
					if (activity.getOutParameters().contains(pb.getParameter())) {
						assert pb.getValueExpression() instanceof ObjectVariableExpression ||
							pb.getValueExpression() instanceof PrimitiveVariableExpression;
						
						assert returnValues.containsKey(pb.getParameter().getName());
						
						String variableName = null;
						if (pb.getValueExpression() instanceof ObjectVariableExpression) {
							variableName = ((ObjectVariableExpression)pb.getValueExpression()).getObject().getVariableName();
						} else {
							variableName = ((PrimitiveVariableExpression)pb.getValueExpression()).getPrimitiveVariable().getVariableName();
						}
						
						if (variablesScope.variableExists(variableName)) {
							variablesScope.changeVariableValue(
								variableName,
								returnValues.get(pb.getParameter().getName()).getValue());
						} else {
							variablesScope.createVariable(
									variableName,
									pb.getParameter().getEType(),
									returnValues.get(pb.getParameter().getName()).getValue());
							
						}
						break;
					}
				}
				
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
