package de.mdelab.sdm.interpreter.core.facade;

import java.util.Map;

/**
 * This facade provides access to properties of final nodes.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <Expression>
 */
public interface IFinalNodeFacade<ActivityNode, Expression> extends IActivityNodeFacade<ActivityNode>
{
	/**
	 * Return the expressions to compute the values of the final node's outgoing
	 * parameters. The special return value is stored under the key
	 * SDMInterpreterConstants.RETURN_VALUE_VAR_NAME.
	 * 
	 * @param finalNode
	 * @return
	 */
	Map<String, Expression> getOutParameterExpressions(ActivityNode finalNode);

}
