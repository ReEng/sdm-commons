package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to properties of activity nodes of unknown types.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <ActivityEdge>
 */
public interface IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> extends IActivityNodeFacade<ActivityNode>
{
	ActivityEdge getNextActivityEdge(ActivityNode activityNode);
}
