package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.Set;

public abstract class PatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression> extends MatchTransaction
{
	private final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>					patternPart;

	private final SetTransaction<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>	patternPartMoveTransaction;

	public PatternPartTransaction(PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart,
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts,
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> checkedPatternParts)
	{
		assert patternPart != null;
		assert uncheckedPatternParts != null;
		assert checkedPatternParts != null;

		assert uncheckedPatternParts.contains(patternPart);
		assert !checkedPatternParts.contains(patternPart);

		this.patternPart = patternPart;

		this.patternPartMoveTransaction = new SetTransaction<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>(
				patternPart, uncheckedPatternParts, checkedPatternParts);
	}

	@Override
	public void commit()
	{
		this.patternPartMoveTransaction.commit();
	}

	@Override
	public void rollBack()
	{
		this.patternPartMoveTransaction.rollBack();
	}

	public PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> getPatternPart()
	{
		return this.patternPart;
	}
}
