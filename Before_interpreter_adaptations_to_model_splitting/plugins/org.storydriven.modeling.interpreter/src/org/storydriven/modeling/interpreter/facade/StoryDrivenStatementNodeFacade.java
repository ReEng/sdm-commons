package org.storydriven.modeling.interpreter.facade;

import java.util.Collection;
import java.util.Collections;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StatementNode;

import de.mdelab.sdm.interpreter.core.facade.IExpressionNodeFacade;

public class StoryDrivenStatementNodeFacade extends StoryDrivenActivityNodeFacade implements
		IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression>
{

	@Override
	public Collection<Expression> getExpressions(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof StatementNode;

		return Collections.singletonList(((StatementNode) activityNode).getStatementExpression());
	}

	@Override
	public ActivityEdge getNextActivityEdge(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode.getOutgoings().size() == 1;

		return activityNode.getOutgoings().get(0);
	}

}
