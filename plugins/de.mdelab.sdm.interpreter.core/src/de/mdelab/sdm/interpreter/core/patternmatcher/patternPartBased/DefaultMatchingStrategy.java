package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.Set;

import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.patternmatcher.MatchingStrategy;

/**
 * The default matching strategy of the story pattern matcher. It searches
 * matches in the order of their cost estimates, starting with the cheapest
 * ones.
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
public class DefaultMatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> extends
		MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	public DefaultMatchingStrategy(
			final MetamodelFacadeFactory<?, ?, ?, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory)
	{
		super(facadeFactory);
	}

	@Override
	public PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> getNextPatternPartForMatching(
			final Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts)
	{
		int lowestCost = PatternPart.MATCHING_NOT_POSSIBLE;
		int lowestCostOptional = PatternPart.MATCHING_NOT_POSSIBLE;
		int cost = 0;

		PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> cheapestPatternPart = null;
		PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> cheapestPatternPartOptional = null;

		/*
		 * Look at all unchecked pattern parts.
		 */
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : uncheckedPatternParts)
		{
			/*
			 * Calculate matching cost.
			 */
			cost = patternPart.calculateMatchingCost();

			if (cost == PatternPart.MATCHING_NOT_POSSIBLE)
			{
				// Skip
			}
			else
			{
				switch (patternPart.getMatchType())
				{
					case MANDATORY:
						// case NEGATIVE:
						if (cost == 1)
						{
							/*
							 * The cost can hardly be lower, return immediately.
							 */
							return patternPart;
						}
						else if ((cost < lowestCost) || (cheapestPatternPart == null))
						{
							/*
							 * keep this pattern part if it is cheaper
							 */
							lowestCost = cost;
							cheapestPatternPart = patternPart;
						}
						break;
					case OPTIONAL:
						if ((cost < lowestCostOptional) || (cheapestPatternPartOptional == null))
						{
							lowestCostOptional = cost;
							cheapestPatternPartOptional = patternPart;
						}
						break;
				}
			}
		}
		
		if (uncheckedPatternParts.size() > 0 && cheapestPatternPart == null && cheapestPatternPartOptional == null) {
			throw new UnsupportedOperationException("Unmatched pattern parts exist but none of them can be matched next.");
		}

		if (cheapestPatternPart != null)
		{
			return cheapestPatternPart;
		}
		else
		{
			return cheapestPatternPartOptional;
		}
	}
}
