package de.mdelab.sdm.interpreter.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.facade.IActivityEdgeFacade;
import de.mdelab.sdm.interpreter.core.facade.IActivityFacade;
import de.mdelab.sdm.interpreter.core.facade.IDecisionNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IExpressionNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IUnspecificActivityNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.notifications.Notifier;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.DefaultMatchingStrategyWithLog;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.LogReproducingMatchingStrategy;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * This is the superclass of all SDM interpreters. It is not tailored to a
 * specific story diagram metamodel or meta-metamodel, like EMF. Instead, it
 * uses generics, which have to be configured for the appropriate metamodels by
 * a subclass. To access certain features of elements, e.g. names or source and
 * target nodes of edges, facades are used. These facades have to be implemented
 * for specific metamodels.
 * 
 * Expressions (e.g. OCL expressions) are evaluated by an
 * ExpressionInterpreterManager. Expression interpreters can be integrated into
 * the ExpressionInterpreterManager to support different kinds of expressions in
 * story diagrams.
 * 
 * Furthermore, the interpreter emits notifications using a NotificationEmitter.
 * NotificationReceivers can be attached to the NotificationEmitter to receive
 * notifications.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <ActivityNode>
 * @param <ActivityEdge>
 * @param <StoryPattern>
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public abstract class SDMInterpreter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		extends
		Notifier<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>			expressionInterpreterManager;

	private final MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>					facadeFactory;

	/*
	 * The next node to be executed.
	 */
	private ActivityNode																																							nextNode;

	/*
	 * Stores the variable scope for each activity node.
	 */
	private final Map<ActivityNode, VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>>		variableScopes;

	/*
	 * Stores pattern matchers for for-each story patterns. After returning from
	 * a loop body back to a for-each node, the pattern matcher continues the
	 * pattern matching process.
	 */
	private final Map<StoryPattern, StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>>	storyPatternMatchers;

	public SDMInterpreter(
			final MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> expressionInterpreterManager,
			final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
	{
		super(notificationEmitter);

		assert facadeFactory != null;
		assert expressionInterpreterManager != null;

		this.expressionInterpreterManager = expressionInterpreterManager;

		this.facadeFactory = facadeFactory;

		this.variableScopes = new HashMap<ActivityNode, VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>>();

		this.storyPatternMatchers = new HashMap<StoryPattern, StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>>();
	}

	/**
	 * 
	 * @return this SDM interpreter's ExpressionInterpreterManager to evaluate
	 *         expressions.
	 */
	public ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getExpressionInterpreterManager()
	{
		return this.expressionInterpreterManager;
	}

	/**
	 * 
	 * @return this SDM interpreter's facade factory to access certain
	 *         attributes of elements.
	 */
	public MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getFacadeFactory()
	{
		return this.facadeFactory;
	}

	/**
	 * Execute the specified activity.
	 * 
	 * @param activity
	 *            The activity to execute.
	 * @param parameters
	 *            A list of parameters. Each parameter is triple of name,
	 *            classifier, and value.
	 * @return A map containing all variables of the activity, when the
	 *         execution is finished. The return value of the activity is
	 *         available under the key
	 *         SDMInterpreterConstants.RETURN_VALUE_VAR_NAME.
	 * @throws SDMException
	 *             If something goes wrong during the execution, e.g., due to
	 *             erroneous story diagrams or expressions.
	 */
	public Map<String, Variable<Classifier>> executeActivity(final Activity activity, final Collection<Variable<Classifier>> parameters)
			throws SDMException
	{
		if (activity == null)
		{
			throw new SDMException("activity is null.");
		}

		final IActivityFacade<Activity, ActivityNode> activityFacade = this.facadeFactory.getActivityFacade();

		/*
		 * Create the root variable scope
		 */
		final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variableScope = new VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>(
				this.getNotificationEmitter(), null, activityFacade.getExpressionImports(activity));

		this.getNotificationEmitter().activityExecutionStarted(activity, parameters, variableScope, this);

		/*
		 * create variables for parameters
		 */
		if (parameters != null)
		{
			for (final Variable<Classifier> variable : parameters)
			{
				assert variable.getName() != null;
				assert !"".equals(variable.getName());

				assert variable.getClassifier() != null;

				variableScope.createVariable(variable.getName(), variable.getClassifier(), variable.getValue());
			}
		}

		this.nextNode = activityFacade.getInitialNode(activity);

		if (this.nextNode == null)
		{
			throw new SDMException("The activity " + activity + " does not contain an initial node.");
		}

		this.variableScopes.put(this.nextNode, variableScope);

		ActivityNode lastNode = null;

		ActivityNode n = null;

		/*
		 * Execute the diagram
		 */
		do
		{
			lastNode = this.nextNode;

			this.nextNode = null;

			try
			{
				n = this.executeActivityNode(lastNode, this.variableScopes.get(lastNode));
			}
			catch (final AbortInterpretationException e)
			{
				/*
				 * If this is not the target interpreter that should catch the
				 * exception, throw it again.
				 */
				if (e.getTargetInterpreter() != this)
				{
					throw e;
				}
			}

			/*
			 * Check if someone manipulated the control flow
			 */
			if (this.nextNode != null)
			{
				// TODO Emit a notification
			}
			else
			{
				/*
				 * No external manipulations, set nextNode appropriately.
				 */
				this.nextNode = n;
			}
		}
		while (this.nextNode != null);

		/*
		 * Create the map of return values
		 */
		final Map<String, Variable<Classifier>> returnValues = new HashMap<String, Variable<Classifier>>();

		// WTF? Should not be here, I guess... remove if it works without
//		for (final Variable<Classifier> var : variableScope.getVariables())
//		{
//			final Variable<Classifier> v = new Variable<Classifier>(var.getName(), var.getClassifier(), var.getValue());
//
//			returnValues.put(v.getName(), v);
//		}

		/*
		 * Evaluate expression for outgoing parameters
		 */
		final Map<String, Expression> outParameterExpressions = this.facadeFactory.getFinalNodeFacade()
				.getOutParameterExpressions(lastNode);

		if (outParameterExpressions != null)
		{
			for (final Entry<String, Expression> entry : outParameterExpressions.entrySet())
			{
				final Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(entry.getValue(), null, null,
						variableScope);

				final Variable<Classifier> resultVar = new Variable<Classifier>(entry.getKey(), result.getClassifier(), result.getValue());

				returnValues.put(resultVar.getName(), resultVar);
			}
		}

		this.getNotificationEmitter().activityExecutionFinished(activity, returnValues, variableScope, this);

		this.variableScopes.clear();
		
		this.storyPatternMatchers.clear();
		
		return returnValues;
	}

	/**
	 * Execute a single activity node.
	 * 
	 * @param node
	 *            The node to execute.
	 * @param variablesScope
	 *            The variables scope to use for this node.
	 * @return The next activity node to execute.
	 * @throws SDMException
	 */
	protected ActivityNode executeActivityNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		assert node != null;
		assert variablesScope != null;

		final IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> unspecificActivityNodeFacade = this.facadeFactory
				.getUnspecificActivityNodeFacade();

		ActivityNode nextNode = null;

		switch (unspecificActivityNodeFacade.getActivityNodeType(node))
		{
			case NON_EXECUTABLE_NODE:

				this.getNotificationEmitter().activityNodeExecutionStarted(node, variablesScope, this);

				final ActivityEdge nextEdge = unspecificActivityNodeFacade.getNextActivityEdge(node);

				this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);

				nextNode = this.executeActivityEdge(nextEdge, variablesScope);

				break;

			case STORY_NODE:
				nextNode = this.executeStoryNode(node, variablesScope);
				break;

			case DECISION_NODE:
				nextNode = this.executeDecisionNode(node, variablesScope);
				break;

			case ACTIVITY_FINAL_NODE:
			case FLOW_FINAL_NODE:
				this.getNotificationEmitter().activityNodeExecutionStarted(node, variablesScope, this);
				this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);
				return null;

			case STATEMENT_NODE:
				nextNode = this.executeStatementNode(node, variablesScope);
				break;

			case CUSTOM_NODE:
				nextNode = this.executeCustomNode(node, variablesScope);
				break;

			default:
				throw new UnsupportedOperationException();
		}

		if (nextNode == null)
		{
			throw new SDMException("Node '" + unspecificActivityNodeFacade.getName(node) + "' has no successor node.");
		}

		this.variableScopes.put(nextNode, variablesScope);

		return nextNode;
	}

	protected ActivityNode executeStatementNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		this.getNotificationEmitter().activityNodeExecutionStarted(node, variablesScope, this);

		final IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression> expressionNodeFacade = this.getFacadeFactory()
				.getExpressionNodeFacade();

		/*
		 * Evaluate expressions
		 */
		for (final Expression expression : expressionNodeFacade.getExpressions(node))
		{
			this.getExpressionInterpreterManager().evaluateExpression(expression, null, null, variablesScope);
		}

		this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);

		return this.executeActivityEdge(expressionNodeFacade.getNextActivityEdge(node), variablesScope);
	}

	protected ActivityNode executeStoryNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		switch (this.facadeFactory.getStoryNodeFacade().getForEachSemantics(node))
		{
			case SINGLE_MATCH:
				return this.executeSingleMatchStoryNode(node, variablesScope);

			case FRESH_MATCH:
				return this.executeForEachFreshMatchStoryNode(node, variablesScope);

			default:
				throw new UnsupportedOperationException();
		}
	}

	protected ActivityNode executeSingleMatchStoryNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		this.getNotificationEmitter().activityNodeExecutionStarted(node, variablesScope, this);

		final StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> storyPatternMatcher = this
				.createStoryPatternMatcher(this.facadeFactory.getStoryNodeFacade().getStoryPattern(node), variablesScope);

		final boolean success = storyPatternMatcher.findNextMatch();

		if (success)
		{
			storyPatternMatcher.applyMatch();
		}

		final IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> storyNodeFacade = this.facadeFactory.getStoryNodeFacade();

		this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);

		ActivityEdge nextEdge;

		if (success)
		{
			nextEdge = storyNodeFacade.getSuccessNextEdge(node);
		}
		else
		{
			nextEdge = storyNodeFacade.getFailureNextEdge(node);
		}

		return this.executeActivityEdge(nextEdge, variablesScope);
	}

	protected ActivityNode executeForEachFreshMatchStoryNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		this.getNotificationEmitter().activityNodeExecutionStarted(node, variablesScope, this);

		final IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> storyNodeFacade = this.facadeFactory.getStoryNodeFacade();

		/*
		 * Check if there is already a story pattern matcher for this foreach
		 * node
		 */
		final StoryPattern storyPattern = storyNodeFacade.getStoryPattern(node);

		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> storyPatternMatcher = this.storyPatternMatchers
				.get(storyPattern);

		if (storyPatternMatcher == null)
		{
			/*
			 * There is none, create a new one.
			 */
			storyPatternMatcher = this.createStoryPatternMatcher(storyPattern, variablesScope);
			this.storyPatternMatchers.put(storyPattern, storyPatternMatcher);

			/*
			 * For the first run, the pattern matcher has to use a matching
			 * strategy that produces a log.
			 */
			final DefaultMatchingStrategyWithLog<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> matchingStrategy = new DefaultMatchingStrategyWithLog<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>(
					this.facadeFactory);

			storyPatternMatcher.setMatchingStrategy(matchingStrategy);
		}
		else if (storyPatternMatcher.getMatchingStrategy() instanceof DefaultMatchingStrategyWithLog<?, ?, ?, ?, ?, ?>)
		{
			/*
			 * Replace the story pattern matcher's matching strategy to make
			 * sure that objects are matched in the same order in the following
			 * iterations. This is important to avoid finding the same match
			 * multiple times if the matching order changes, e.g., because the
			 * cardinality of the instance links have changed.
			 */
			storyPatternMatcher
					.setMatchingStrategy(new LogReproducingMatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>(
							this.facadeFactory,
							((DefaultMatchingStrategyWithLog<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>) storyPatternMatcher
									.getMatchingStrategy()).getLog()));

		}

		ActivityNode nextNode = node;
		ActivityEdge nextEdge;

		if (storyPatternMatcher.findNextMatch())
		{
			storyPatternMatcher.applyMatch();

			this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);

			nextEdge = storyNodeFacade.getSuccessNextEdge(node);

			if (nextEdge != null)
			{
				nextNode = this.executeActivityEdge(nextEdge, variablesScope);
			}
		}
		else
		{
			this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);

			nextEdge = storyNodeFacade.getFailureNextEdge(node);
			if (nextEdge == null) {
				throw new SDMException("Missing outgoing link to next node from "+node.toString());
			}
			nextNode = this.executeActivityEdge(nextEdge, variablesScope);

			/*
			 * All matches have been found for this story pattern, the pattern
			 * matcher is not necessary anymore.
			 */
			this.storyPatternMatchers.remove(storyPattern);
		}

		return nextNode;
	}

	protected ActivityNode executeActivityEdge(
			final ActivityEdge nextEdge,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
	{
		final IActivityEdgeFacade<ActivityNode, ActivityEdge> activityEdgeFacade = this.facadeFactory.getActivityEdgeFacade();

		this.getNotificationEmitter().traversingActivityEdge(nextEdge, variablesScope, this);

		final ActivityNode nextNode = activityEdgeFacade.getTarget(nextEdge);

		return nextNode;
	}

	protected ActivityNode executeDecisionNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		this.getNotificationEmitter().activityNodeExecutionStarted(node, variablesScope, this);

		final IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression> decisionNodeFacade = this.getFacadeFactory()
				.getDecisionNodeFacade();

		ActivityEdge nextEdge = null;

		/*
		 * Evaluate expressions
		 */
		for (final Entry<Expression, ActivityEdge> entry : decisionNodeFacade.getConditionalNextEdges(node).entrySet())
		{
			final Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(entry.getKey(), null, null,
					variablesScope);

			assert result != null;

			if (result.getValue().equals(Boolean.TRUE))
			{
				nextEdge = entry.getValue();
				break;
			}
		}

		this.getNotificationEmitter().activityNodeExecutionFinished(node, variablesScope, this);

		/*
		 * No expression is true, execute else
		 */
		if (nextEdge == null)
		{
			nextEdge = decisionNodeFacade.getUnconditionalNextEdge(node);
		}

		return this.executeActivityEdge(nextEdge, variablesScope);
	}

	/**
	 * Set the next node to be executed by the interpreter.
	 * 
	 * @param nextNode
	 */
	public void setNextNode(final ActivityNode nextNode)
	{
		this.nextNode = nextNode;
	}

	public Map<StoryPattern, StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>> getStoryPatternMatchers()
	{
		return this.storyPatternMatchers;
	}

	public Map<ActivityNode, VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>> getVariableScopes()
	{
		return this.variableScopes;
	}

	/**
	 * Create a story pattern matcher to execute story patterns.
	 * 
	 * @param storyPattern
	 * @param variablesScope
	 * @return
	 * @throws SDMException
	 */
	protected abstract StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> createStoryPatternMatcher(
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException;

	/**
	 * Execute an activity node specific to a particular metamodel.
	 * 
	 * @param node
	 *            The node to execute.
	 * @param variablesScope
	 *            The current variables scope.
	 * @return The next node to execute.
	 * @throws SDMException
	 */
	protected abstract ActivityNode executeCustomNode(
			ActivityNode node,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException;

}
