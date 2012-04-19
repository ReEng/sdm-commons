package org.storydriven.storydiagrams.interpreter.facade;

import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.activities.StoryNode;

import de.mdelab.sdm.interpreter.core.facade.EActivityNodeType;
import de.mdelab.sdm.interpreter.core.facade.IActivityNodeFacade;

public abstract class StoryDrivenActivityNodeFacade implements IActivityNodeFacade<ActivityNode>
{
	@Override
	public EActivityNodeType getActivityNodeType(ActivityNode activityNode)
	{
		assert activityNode != null;

		if (activityNode instanceof StoryNode)
		{
			return EActivityNodeType.STORY_NODE;
		}
		else if (activityNode instanceof StatementNode)
		{
			return EActivityNodeType.STATEMENT_NODE;
		}
		else if (activityNode instanceof JunctionNode)
		{
			return EActivityNodeType.DECISION_NODE;
		}
		else if (activityNode instanceof StopNode)
		{
			return EActivityNodeType.ACTIVITY_FINAL_NODE;
		}
		else
		{
			return EActivityNodeType.UNSPECIFIC;
		}
	}

	@Override
	public String getName(ActivityNode activityNode)
	{
		assert activityNode != null;

		return activityNode.getName();
	}
}
