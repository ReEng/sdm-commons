package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.Map;

import de.mdelab.sdm.interpreter.core.SDMException;

/**
 * 
 * Superclass of all pattern parts. A pattern part is a part of a story pattern
 * consisting either only of a link and its connected objects, or only a single
 * object. This class defines method signatures for matching and checking the
 * pattern part, and creating and destroying elements. Subclasses must implement
 * these methods for specific story diagram metamodels.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Expression>
 */
public abstract class PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>
{
	/*
	 * Constant for the matching cost indicating that matching this pattern part
	 * is currently not possible.
	 */
	public static final int																									MATCHING_NOT_POSSIBLE	= -1;

	protected final PatternPartBasedMatcher<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, Expression>	patternMatcher;

	public PatternPart(PatternPartBasedMatcher<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, Expression> patternMatcher)
	{
		assert patternMatcher != null;

		this.patternMatcher = patternMatcher;
	}

	/**
	 * Return the objects of the pattern part.
	 * 
	 * @return
	 */
	public abstract StoryPatternObject[] getStoryPatternObjects();

	/**
	 * Return the kind of matching of this pattern part, i.e., whether matching
	 * this part is mandatory or optional, or whether this part is a negative
	 * application condition.
	 * 
	 * @return
	 */
	public abstract EMatchType getMatchType();

	/**
	 * Check the pattern part, especially whether the instance objects are
	 * connected according to the pattern.
	 * 
	 * @return OK, if the instance objects are connected according to the
	 *         pattern, FAIL, if not, UNKNOWN, if this cannot be determined,
	 *         e.g., because not all objects are bound.
	 * @throws SDMException
	 */
	public abstract ECheckResult check() throws SDMException;

	/**
	 * Search for a match of the pattern part.
	 * 
	 * @param matchState
	 * 
	 * @return
	 * @throws SDMException
	 */
	public abstract boolean match(MatchState matchState) throws SDMException;

	/**
	 * Create those objects of the pattern part that are marked for creation.
	 * Attribute assignments are not executed here.
	 * 
	 * @throws SDMException
	 */
	public abstract void createObjects() throws SDMException;

	/**
	 * Create those links of the pattern part that are marked for creation.
	 * 
	 * @param variablesScope
	 * @throws SDMException
	 */
	public abstract void createLinks() throws SDMException;

	/**
	 * Destroy those objects of the pattern part that are marked for
	 * destruction.
	 * 
	 * Due to the fact, that pattern parts may overlap, implementors must be be
	 * aware, that a story pattern object may have already been deleted
	 * previously by an overlapping pattern part.
	 */
	public abstract void destroyObjects();

	/**
	 * Destroy the links of the pattern part.
	 * 
	 * @param deletedObjects
	 */
	public abstract void destroyLinks(Map<StoryPatternObject, Object> deletedObjects);

	/**
	 * Calculate an estimate of the cost of matching this pattern part. If it is
	 * currently not possible to match it, MATCHING_NOT_POSSIBLE is returned.
	 * 
	 * Due to the fact, that pattern parts may overlap, implementors must be be
	 * aware, that a story pattern object may have already been created
	 * previously by an overlapping pattern part.
	 * 
	 * @return
	 */
	public abstract int calculateMatchingCost();

	/**
	 * Create a match state that holds information about the state where the
	 * matcher left off for this pattern part, e.g., an iterator of an instance
	 * link.
	 * 
	 * @return
	 */
	public abstract MatchState createMatchState();

	/**
	 * Returns the priority of this pattern part when elements are created. This
	 * is necessary to create links with link constraints in the correct order.
	 * 0 is the highest priority.
	 * 
	 * @return
	 * @throws SDMException
	 */
	// public abstract int getCreationPriority() throws SDMException;

	/**
	 * Called by the pattern matcher when the matching phase for the whole story
	 * pattern has finished successfully.
	 * 
	 * @throws SDMException
	 */
	// public abstract void matchingPhaseFinished() throws SDMException;
}
