package org.storydriven.storydiagrams.interpreter.facade;

import java.util.Collection;
import java.util.Collections;

import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.expressions.Expression;

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
