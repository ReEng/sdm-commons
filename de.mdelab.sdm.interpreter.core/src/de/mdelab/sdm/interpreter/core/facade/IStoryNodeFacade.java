package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to properties of story nodes.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <ActivityEdge>
 * @param <StoryPattern>
 */
public interface IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> extends IActivityNodeFacade<ActivityNode>
{
	/**
	 * Return the story pattern contained in the story node.
	 * 
	 * @param activityNode
	 * @return
	 */
	StoryPattern getStoryPattern(ActivityNode activityNode);

	/**
	 * Return the for-each semantics of the story node.
	 * 
	 * @param activityNode
	 * @return
	 */
	EForEachSemantics getForEachSemantics(ActivityNode activityNode);

	/**
	 * Return the outgoing edge for successful matches.
	 * 
	 * @param activityNode
	 * @return
	 */
	ActivityEdge getSuccessNextEdge(ActivityNode activityNode);

	/**
	 * Return the outgoing edge for failed matches.
	 * 
	 * @param activityNode
	 * @return
	 */
	ActivityEdge getFailureNextEdge(ActivityNode activityNode);
}
