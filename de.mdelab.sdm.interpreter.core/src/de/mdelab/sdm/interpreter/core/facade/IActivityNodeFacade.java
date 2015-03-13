package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to general properties of activity nodes.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 */
public interface IActivityNodeFacade<ActivityNode> extends IMetamodelFacade
{
	EActivityNodeType getActivityNodeType(ActivityNode activityNode);

	String getName(ActivityNode activityNode);
}
