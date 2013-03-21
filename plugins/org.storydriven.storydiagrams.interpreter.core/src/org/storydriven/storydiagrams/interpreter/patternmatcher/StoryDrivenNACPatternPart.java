package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.MatchState;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;

public class StoryDrivenNACPatternPart extends StoryDrivenPatternPart<AbstractVariable, AbstractLinkVariable>
{

	private final StoryDrivenPatternPart<AbstractVariable, ? extends AbstractLinkVariable>	nacPatternPart;

	public StoryDrivenNACPatternPart(
			final PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			final StoryDrivenPatternPart<AbstractVariable, ? extends AbstractLinkVariable> nacPatternPart)
	{
		super(patternMatcher, nacPatternPart.link, nacPatternPart.variables);

		assert this.nacPatternPart.link.getBindingSemantics() == BindingSemantics.NEGATIVE;
		assert this.nacPatternPart.link.getBindingOperator() == BindingOperator.CHECK_ONLY;

		this.nacPatternPart = nacPatternPart;
	}

	@Override
	protected EMatchType doGetMatchType()
	{
		return EMatchType.MANDATORY;
	}

	@Override
	protected void doCreateLink()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	protected void doDestroyLink(final Map<AbstractVariable, Object> deletedObjects)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		switch (this.nacPatternPart.check())
		{
			case OK:
				return ECheckResult.FAIL;
			case FAIL:
				return ECheckResult.OK;
			case UNKNOWN:
				return ECheckResult.UNKNOWN;
			default:
				throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean match(final MatchState matchState) throws SDMException
	{
		return !this.nacPatternPart.match(matchState);
	}

	@Override
	public int calculateMatchingCost()
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public MatchState createMatchState()
	{
		return this.nacPatternPart.createMatchState();
	}

}
