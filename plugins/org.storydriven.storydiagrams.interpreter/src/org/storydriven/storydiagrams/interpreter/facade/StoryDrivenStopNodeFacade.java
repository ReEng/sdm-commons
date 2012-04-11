package org.storydriven.storydiagrams.interpreter.facade;

import java.util.HashMap;
import java.util.Map;

import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.expressions.Expression;

import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.facade.IFinalNodeFacade;

public class StoryDrivenStopNodeFacade extends StoryDrivenActivityNodeFacade implements IFinalNodeFacade<ActivityNode, Expression>
{

	@Override
	public Map<String, Expression> getOutParameterExpressions(ActivityNode finalNode)
	{
		assert finalNode instanceof StopNode;

		StopNode stopNode = (StopNode) finalNode;

		Map<String, Expression> map = new HashMap<String, Expression>();

		if (stopNode.getReturnValue() != null)
		{
			map.put(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME, stopNode.getReturnValue());
		}

		return map;
	}

}
