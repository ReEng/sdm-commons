package de.mdelab.sdm.interpreter.core.patternmatcher;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.notifications.Notifier;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * Metamodel-agnostic superclass of story pattern matchers.
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
public abstract class StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		extends
		Notifier<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private final StoryPattern																																				storyPattern;
	private final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>					variablesScope;
	private final MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>			facadeFactory;
	private final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	expressionInterpreterManager;
	private MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>															matchingStrategy;

	public StoryPatternMatcher(
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope,
			MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> matchingStrategy,
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> expressionInterpreterManager,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
	{
		super(notificationEmitter);

		assert storyPattern != null;
		assert variablesScope != null;
		assert facadeFactory != null;
		assert expressionInterpreterManager != null;
		assert matchingStrategy != null;

		this.storyPattern = storyPattern;
		this.variablesScope = variablesScope;
		this.facadeFactory = facadeFactory;
		this.expressionInterpreterManager = expressionInterpreterManager;
		this.matchingStrategy = matchingStrategy;
	}

	public StoryPattern getStoryPattern()
	{
		return this.storyPattern;
	}

	public VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getVariablesScope()
	{
		return this.variablesScope;
	}

	public MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getFacadeFactory()
	{
		return this.facadeFactory;
	}

	public ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getExpressionInterpreterManager()
	{
		return this.expressionInterpreterManager;
	}

	public MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getMatchingStrategy()
	{
		return this.matchingStrategy;
	}

	public void setMatchingStrategy(
			MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> matchingStrategy)
	{
		this.matchingStrategy = matchingStrategy;
	}

	/**
	 * Searches for a match of the LHS of the story pattern. The RHS of the
	 * pattern is not applied.
	 * 
	 * @return
	 * @throws SDMException
	 */
	public abstract boolean findNextMatch() throws SDMException;

	/**
	 * Apply the RHS of the story pattern.
	 * 
	 * @throws SDMException
	 */
	public void applyMatch() throws SDMException
	{
		this.applyMatch(this.getVariablesScope());
	}

	/**
	 * Apply the RHS of the story pattern based on the provided variablesScope.
	 * 
	 * @param variablesScope
	 * @return
	 * @throws SDMException
	 */
	public abstract void applyMatch(
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException;
}
