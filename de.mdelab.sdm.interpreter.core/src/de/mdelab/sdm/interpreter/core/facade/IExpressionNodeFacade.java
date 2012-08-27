package de.mdelab.sdm.interpreter.core.facade;

import java.util.Collection;

/**
 * This facade provides access to properties of expression nodes.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <ActivityEdge>
 * @param <Expression>
 */
public interface IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression> extends IActivityNodeFacade<ActivityNode>
{
	/**
	 * Return all expressions contained in this expression node.
	 * 
	 * @param activityNode
	 * @return
	 */
	Collection<Expression> getExpressions(ActivityNode activityNode);

	ActivityEdge getNextActivityEdge(ActivityNode activityNode);
}
