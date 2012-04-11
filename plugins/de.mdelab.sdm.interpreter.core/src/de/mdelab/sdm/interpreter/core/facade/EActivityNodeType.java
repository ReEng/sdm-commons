package de.mdelab.sdm.interpreter.core.facade;

/**
 * Enumeration of the activity node types that the interpreter can handle.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum EActivityNodeType
{
	UNSPECIFIC,
	DECISION_NODE,
	STORY_NODE,
	FORK_NODE,
	JOIN_NODE,
	STATEMENT_NODE,
	ACTIVITY_FINAL_NODE,
	FLOW_FINAL_NODE
}
