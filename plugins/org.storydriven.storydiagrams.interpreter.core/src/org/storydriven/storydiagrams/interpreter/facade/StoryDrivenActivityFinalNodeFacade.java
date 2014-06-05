package org.storydriven.storydiagrams.interpreter.facade;

import java.util.HashMap;
import java.util.Map;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.ActivityNode;

import de.mdelab.sdm.interpreter.core.facade.IFinalNodeFacade;

public class StoryDrivenActivityFinalNodeFacade extends StoryDrivenActivityNodeFacade implements IFinalNodeFacade<ActivityNode, Expression>
{

	@Override
	public Map<String, Expression> getOutParameterExpressions(ActivityNode finalNode)
	{
		assert finalNode instanceof ActivityFinalNode;

		ActivityFinalNode ActivityFinalNode = (ActivityFinalNode) finalNode;

		Map<String, Expression> map = new HashMap<String, Expression>();

		final Activity activity = finalNode.getOwningActivity();
		
		if (ActivityFinalNode.getReturnValue() != null)
		{
			assert activity.getOutParameters().size() == 1;
			
			map.put(activity.getOutParameters().get(0).getName(), ActivityFinalNode.getReturnValue());
		
		} else {

			assert activity.getOutParameters().size() == 0;
		
		}

		return map;
	}

}
