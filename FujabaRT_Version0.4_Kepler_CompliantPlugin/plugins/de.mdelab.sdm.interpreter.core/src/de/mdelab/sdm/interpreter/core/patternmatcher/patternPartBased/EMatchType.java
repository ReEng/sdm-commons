package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

/**
 * Enumeration of the possible match types of story pattern elements.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum EMatchType
{
	/*
	 * The element must be matched, i.e. it is part of the application condition
	 * of the story pattern.
	 */
	MANDATORY,

	/*
	 * A match does not need to be found for the element.
	 */
	OPTIONAL,

	/*
	 * A match must not be found for the element.
	 */
	// NEGATIVE
}
