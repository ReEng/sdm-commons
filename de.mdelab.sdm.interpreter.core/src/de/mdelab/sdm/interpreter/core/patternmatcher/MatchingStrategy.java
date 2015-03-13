package de.mdelab.sdm.interpreter.core.patternmatcher;

import java.util.Set;

import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPart;

/**
 * Superclass of all matching strategies. A matching strategy defines the order
 * in which matches are sought for story pattern objects.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPattern>
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public abstract class MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private final MetamodelFacadeFactory<?, ?, ?, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	facadeFactory;

	public MatchingStrategy(
			MetamodelFacadeFactory<?, ?, ?, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory)
	{
		assert facadeFactory != null;

		this.facadeFactory = facadeFactory;
	}

	protected MetamodelFacadeFactory<?, ?, ?, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getFacadeFactory()
	{
		return this.facadeFactory;
	}

	/**
	 * Return the pattern part for which the next match should be sought.
	 * 
	 * @param uncheckedPatternParts
	 * @return
	 */
	public abstract PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> getNextPatternPartForMatching(
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts);
}
