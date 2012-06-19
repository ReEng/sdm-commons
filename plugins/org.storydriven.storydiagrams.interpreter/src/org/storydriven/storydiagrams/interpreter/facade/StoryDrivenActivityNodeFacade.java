package org.storydriven.storydiagrams.interpreter.facade;

import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.StartNode;
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
		else if (activityNode instanceof StartNode)
		{
			return EActivityNodeType.NON_EXECUTABLE_NODE;
		}
		else
		{
			throw new UnsupportedOperationException(
					"Activity nodes of type '"
							+ activityNode.eClass().getName()
							+ "' are not yet supported. Extend the getActivityNodeType() operation in StoryDrivenActivityNodeFacade to return CUSTOM_NODE for this node type and provide an appropriate implementation in StoryDrivenInterpreter.executeCustomNode() to execute these nodes.");
		}
	}

	@Override
	public String getName(ActivityNode activityNode)
	{
		assert activityNode != null;

		return activityNode.getName();
	}
}
