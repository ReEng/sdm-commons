package de.mdelab.sdm.interpreter.core.facade;

import java.util.Map;

/**
 * Provides access to properties of decision nodes.
 * 
 * @author stephan
 * 
 * @param <ActivityNode>
 * @param <ActivityEdge>
 * @param <Expression>
 */
public interface IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression> extends IActivityNodeFacade<ActivityNode>
{
	/**
	 * Returns a map that contains all outgoing edges of the decision node that
	 * have a condition.
	 * 
	 * @param activityNode
	 * @return
	 */
	Map<Expression, ActivityEdge> getConditionalNextEdges(ActivityNode activityNode);

	/**
	 * Return the ELSE edge of the decision node.
	 * 
	 * @param activityNode
	 * @return
	 */
	ActivityEdge getUnconditionalNextEdge(ActivityNode activityNode);
}
