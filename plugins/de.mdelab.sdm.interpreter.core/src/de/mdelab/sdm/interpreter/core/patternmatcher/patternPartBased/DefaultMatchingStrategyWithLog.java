package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.LinkedHashSet;
import java.util.Set;

import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;

/**
 * Subclass of the default matching strategy. This strategy maintains a log of
 * the matching order. This is required for for-each nodes. Here, the matching
 * order must be the same in each iteration to ensure that all matches are
 * returned and each match is returned only once.
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
public class DefaultMatchingStrategyWithLog<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> extends
		DefaultMatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{

	private final LinkedHashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>	log;

	public DefaultMatchingStrategyWithLog(
			MetamodelFacadeFactory<?, ?, ?, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory)
	{
		super(facadeFactory);

		this.log = new LinkedHashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();
	}

	@Override
	public PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> getNextPatternPartForMatching(
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts)
	{
		PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart = super
				.getNextPatternPartForMatching(uncheckedPatternParts);

		if (patternPart != null && !this.log.contains(patternPart))
		{
			this.log.add(patternPart);
		}

		return patternPart;
	}

	public LinkedHashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> getLog()
	{
		return this.log;
	}
}
