package org.storydriven.storydiagrams.interpreter.facade;

import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;

import de.mdelab.sdm.interpreter.core.facade.IUnspecificActivityNodeFacade;

public class StoryDrivenUnspecificActivityNodeFacade extends StoryDrivenActivityNodeFacade implements
		IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge>
{

	@Override
	public ActivityEdge getNextActivityEdge(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode.getOutgoings().size() == 1;

		return activityNode.getOutgoings().get(0);
	}

}
