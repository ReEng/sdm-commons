package de.mdelab.sdm.interpreter.core.facade;

import java.util.List;
import java.util.Map;

/**
 * This facade provides access to properties of activities.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <ActivityNode>
 */
public interface IActivityFacade<Activity, ActivityNode> extends IMetamodelFacade
{
	ActivityNode getInitialNode(Activity activity);

	String getName(Activity activity);

	/**
	 * Return the expression imports of this activity per expression language
	 * (first key) and expression language version (second key).
	 * 
	 * @param activity
	 * @return
	 */
	Map<String, Map<String, List<String>>> getExpressionImports(Activity activity);
}
