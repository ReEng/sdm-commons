package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.Set;

public class CheckPatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression> extends
		PatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression>
{

	public CheckPatternPartTransaction(PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart,
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts,
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> checkedPatternParts)
	{
		super(patternPart, uncheckedPatternParts, checkedPatternParts);
	}
}
