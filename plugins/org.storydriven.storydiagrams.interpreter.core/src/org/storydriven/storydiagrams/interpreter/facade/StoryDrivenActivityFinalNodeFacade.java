package org.storydriven.storydiagrams.interpreter.facade;

import java.util.HashMap;
import java.util.Map;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;

import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.facade.IFinalNodeFacade;

public class StoryDrivenActivityFinalNodeFacade extends StoryDrivenActivityNodeFacade implements IFinalNodeFacade<ActivityNode, Expression>
{

	@Override
	public Map<String, Expression> getOutParameterExpressions(ActivityNode finalNode)
	{
		assert finalNode instanceof ActivityFinalNode;

		ActivityFinalNode ActivityFinalNode = (ActivityFinalNode) finalNode;

		Map<String, Expression> map = new HashMap<String, Expression>();

		if (ActivityFinalNode.getReturnValue() != null)
		{
			map.put(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME, ActivityFinalNode.getReturnValue());
		}

		return map;
	}

}
