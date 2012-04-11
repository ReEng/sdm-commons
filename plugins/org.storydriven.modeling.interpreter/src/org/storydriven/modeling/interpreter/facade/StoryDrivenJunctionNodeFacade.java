package org.storydriven.modeling.interpreter.facade;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.activities.JunctionNode;

import de.mdelab.sdm.interpreter.core.facade.IDecisionNodeFacade;

public class StoryDrivenJunctionNodeFacade extends StoryDrivenActivityNodeFacade implements
		IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression>
{

	@Override
	public Map<Expression, ActivityEdge> getConditionalNextEdges(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof JunctionNode;

		Map<Expression, ActivityEdge> map = new HashMap<Expression, ActivityEdge>();

		if (activityNode.getOutgoings().size() == 1)
		{
			/*
			 * Merge Node
			 */
			return Collections.emptyMap();
		}

		for (ActivityEdge edge : activityNode.getOutgoings())
		{
			if (edge.getGuard() == EdgeGuard.BOOL)
			{
				map.put(edge.getGuardExpression(), edge);
			}
			else
			{
				assert edge.getGuard() == EdgeGuard.ELSE;
			}
		}

		return map;
	}

	@Override
	public ActivityEdge getUnconditionalNextEdge(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof JunctionNode;

		if (activityNode.getOutgoings().size() == 1)
		{
			/*
			 * Merge Node
			 */
			return activityNode.getOutgoings().get(0);
		}
		else
		{
			for (ActivityEdge edge : activityNode.getOutgoings())
			{
				if (edge.getGuard() == EdgeGuard.ELSE)
				{
					return edge;
				}
				else
				{
					assert edge.getGuard() == EdgeGuard.BOOL;
				}
			}

			return null;
		}
	}

}
