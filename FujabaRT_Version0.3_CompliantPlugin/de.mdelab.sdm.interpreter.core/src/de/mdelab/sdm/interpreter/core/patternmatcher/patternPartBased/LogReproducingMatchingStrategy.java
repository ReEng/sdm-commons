package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.LinkedHashSet;
import java.util.Set;

import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.patternmatcher.MatchingStrategy;

/**
 * 
 * This matching strategy returns pattern parts in the order defined in the log,
 * which has to be provided as a parameter. This is required for for-each nodes.
 * Changes in the instance model can make the default strategy use a different
 * matching order in later iterations than in the first one. Therefore, the
 * DefaultMatchingStrategyWithLog can be used to produce a log in the first run.
 * The LogReproducingMatchingStrategy uses this log to maintain the same
 * matching order.
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
public class LogReproducingMatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> extends
		MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{

	private final LinkedHashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>	log;

	public LogReproducingMatchingStrategy(
			MetamodelFacadeFactory<?, ?, ?, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			LinkedHashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> log)
	{
		super(facadeFactory);

		assert log != null;

		this.log = log;
	}

	@Override
	public PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> getNextPatternPartForMatching(
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts)
	{
		for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.log)
		{
			if (uncheckedPatternParts.contains(patternPart))
			{
				return patternPart;
			}
		}

		return null;
	}

}
