package de.mdelab.sdm.interpreter.core.facade;

/**
 * The facade factory is responsible for creating facades of the concrete types.
 * Subclasses should implement this facade as a singleton.
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
public abstract class MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private IClassifierFacade<Classifier>																		classifierFacade;

	private IFeatureFacade<Feature>																				featureFacade;

	private IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	storyPatternObjectFacade;

	private IStoryPatternLinkFacade<StoryPatternObject, StoryPatternLink, Feature>								storyPatternLinkFacade;

	private IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression>					storyPatternFacade;

	private IInstanceFacade<StoryPatternLink, Classifier, Feature, Expression>									instanceFacade;

	private IExpressionFacade<Expression>																		expressionFacade;

	private IActivityFacade<Activity, ActivityNode>																activityFacade;

	private IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge>											unspecificActivityNodeFacade;

	private IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern>											storyNodeFacade;

	private IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression>											decisionNodeFacade;

	private IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression>										expressionNodeFacade;

	private IFinalNodeFacade<ActivityNode, Expression>															finalNodeFacade;

	private IActivityEdgeFacade<ActivityNode, ActivityEdge>														activityEdgeFacade;

	protected MetamodelFacadeFactory()
	{

	}

	public final IClassifierFacade<Classifier> getClassifierFacade()
	{
		if (this.classifierFacade == null)
		{
			this.classifierFacade = this.createClassifierFacade();
		}

		assert this.classifierFacade != null;

		return this.classifierFacade;
	}

	public final IFeatureFacade<Feature> getFeatureFacade()
	{
		if (this.featureFacade == null)
		{
			this.featureFacade = this.createFeatureFacade();
		}

		assert this.featureFacade != null;

		return this.featureFacade;
	}

	public final IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getStoryPatternObjectFacade()

	{
		if (this.storyPatternObjectFacade == null)
		{
			this.storyPatternObjectFacade = this.createStoryPatternObjectFacade();
		}

		assert this.storyPatternObjectFacade != null;

		return this.storyPatternObjectFacade;
	}

	public final IStoryPatternLinkFacade<StoryPatternObject, StoryPatternLink, Feature> getStoryPatternLinkFacade()
	{
		if (this.storyPatternLinkFacade == null)
		{
			this.storyPatternLinkFacade = this.createStoryPatternLinkFacade();
		}

		assert this.storyPatternLinkFacade != null;

		return this.storyPatternLinkFacade;
	}

	public final IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression> getStoryPatternFacade()
	{
		if (this.storyPatternFacade == null)
		{
			this.storyPatternFacade = this.createStoryPatternFacade();
		}

		assert this.storyPatternFacade != null;

		return this.storyPatternFacade;
	}

	public final IInstanceFacade<StoryPatternLink, Classifier, Feature, Expression> getInstanceFacade()
	{
		if (this.instanceFacade == null)
		{
			this.instanceFacade = this.createInstanceFacade();
		}

		assert this.instanceFacade != null;

		return this.instanceFacade;
	}

	public final IExpressionFacade<Expression> getExpressionFacade()
	{
		if (this.expressionFacade == null)
		{
			this.expressionFacade = this.createExpressionFacade();
		}

		assert this.expressionFacade != null;

		return this.expressionFacade;
	}

	public final IActivityFacade<Activity, ActivityNode> getActivityFacade()
	{
		if (this.activityFacade == null)
		{
			this.activityFacade = this.createActivityFacade();
		}

		assert this.activityFacade != null;

		return this.activityFacade;
	}

	public final IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression> getDecisionNodeFacade()
	{
		if (this.decisionNodeFacade == null)
		{
			this.decisionNodeFacade = this.createDecisionNodeFacade();
		}

		assert this.decisionNodeFacade != null;

		return this.decisionNodeFacade;
	}

	public final IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression> getExpressionNodeFacade()
	{
		if (this.expressionNodeFacade == null)
		{
			this.expressionNodeFacade = this.createExpressionNodeFacade();
		}

		assert this.expressionNodeFacade != null;

		return this.expressionNodeFacade;
	}

	public final IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> getStoryNodeFacade()
	{
		if (this.storyNodeFacade == null)
		{
			this.storyNodeFacade = this.createStoryNodeFacade();
		}

		assert this.storyNodeFacade != null;

		return this.storyNodeFacade;
	}

	public final IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> getUnspecificActivityNodeFacade()
	{
		if (this.unspecificActivityNodeFacade == null)
		{
			this.unspecificActivityNodeFacade = this.createUnspecificActivityNodeFacade();
		}

		assert this.unspecificActivityNodeFacade != null;

		return this.unspecificActivityNodeFacade;
	}

	public final IFinalNodeFacade<ActivityNode, Expression> getFinalNodeFacade()
	{
		if (this.finalNodeFacade == null)
		{
			this.finalNodeFacade = this.createFinalNodeFacade();
		}

		assert this.finalNodeFacade != null;

		return this.finalNodeFacade;
	}

	public final IActivityEdgeFacade<ActivityNode, ActivityEdge> getActivityEdgeFacade()
	{
		if (this.activityEdgeFacade == null)
		{
			this.activityEdgeFacade = this.createActivityEdgeFacade();
		}

		assert this.activityEdgeFacade != null;

		return this.activityEdgeFacade;
	}

	protected abstract IClassifierFacade<Classifier> createClassifierFacade();

	protected abstract IFeatureFacade<Feature> createFeatureFacade();

	protected abstract IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> createStoryPatternObjectFacade();

	protected abstract IStoryPatternLinkFacade<StoryPatternObject, StoryPatternLink, Feature> createStoryPatternLinkFacade();

	protected abstract IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression> createStoryPatternFacade();

	protected abstract IInstanceFacade<StoryPatternLink, Classifier, Feature, Expression> createInstanceFacade();

	protected abstract IExpressionFacade<Expression> createExpressionFacade();

	protected abstract IActivityFacade<Activity, ActivityNode> createActivityFacade();

	protected abstract IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> createUnspecificActivityNodeFacade();

	protected abstract IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> createStoryNodeFacade();

	protected abstract IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression> createExpressionNodeFacade();

	protected abstract IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression> createDecisionNodeFacade();

	protected abstract IFinalNodeFacade<ActivityNode, Expression> createFinalNodeFacade();

	protected abstract IActivityEdgeFacade<ActivityNode, ActivityEdge> createActivityEdgeFacade();
}
