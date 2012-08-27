package de.mdelab.sdm.interpreter.core.patternmatcher;

/**
 * Enumerations of all kinds of possible transactions on the pattern matcher
 * stack.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum ETransactionType
{
	MATCHING_PATTERN_PART,
	CHECKED_PATTERN_PART,
	SPO_MATCHED,
	INSTANCE_OBJECT_MATCHED,
	MATCHER_INITIALIZED,
	SPO_DELETED,
	INSTANCE_OBJECT_DELETED,
}
