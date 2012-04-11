package org.storydriven.storydiagrams.interpreter.facade;

import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StoryNode;

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
