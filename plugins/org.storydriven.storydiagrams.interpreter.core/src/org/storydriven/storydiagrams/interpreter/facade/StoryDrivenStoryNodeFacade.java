package org.storydriven.storydiagrams.interpreter.facade;

import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.facade.EForEachSemantics;
import de.mdelab.sdm.interpreter.core.facade.IStoryNodeFacade;

public class StoryDrivenStoryNodeFacade extends StoryDrivenActivityNodeFacade implements
		IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern>
{

	@Override
	public StoryPattern getStoryPattern(final ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof StoryNode;

		return ((StoryNode) activityNode).getStoryPattern();
	}

	@Override
	public EForEachSemantics getForEachSemantics(final ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof StoryNode;

		if (((StoryNode) activityNode).isForEach())
		{
			return EForEachSemantics.FRESH_MATCH;
		}
		else
		{
			return EForEachSemantics.SINGLE_MATCH;
		}
	}

	@Override
	public ActivityEdge getSuccessNextEdge(final ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof StoryNode;
		assert activityNode.getOutgoings().size() >= 1;
		assert activityNode.getOutgoings().size() <= 2;

		if (activityNode.getOutgoings().size() == 1)
		{
			return activityNode.getOutgoings().get(0);
		}
		else
		{
			for (final ActivityEdge edge : activityNode.getOutgoings())
			{
				switch (edge.getGuard())
				{
					case SUCCESS:
					case EACH_TIME:
						return edge;
					default:
						break;
				}
			}

			return null;
		}
	}

	@Override
	public ActivityEdge getFailureNextEdge(final ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof StoryNode;
		assert activityNode.getOutgoings().size() >= 1;
		assert activityNode.getOutgoings().size() <= 2;

		if (activityNode.getOutgoings().size() == 1)
		{
			return activityNode.getOutgoings().get(0);
		}
		else
		{
			for (final ActivityEdge edge : activityNode.getOutgoings())
			{
				switch (edge.getGuard())
				{
					case FAILURE:
					case END:
						return edge;
					default:
						break;
				}
			}

			return null;
		}
	}

}
