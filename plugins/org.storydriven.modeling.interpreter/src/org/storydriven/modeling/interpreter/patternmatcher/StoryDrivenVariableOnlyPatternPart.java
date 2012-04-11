package org.storydriven.modeling.interpreter.patternmatcher;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;

public class StoryDrivenVariableOnlyPatternPart extends StoryDrivenPatternPart<AbstractVariable, AbstractLinkVariable>
{

	public StoryDrivenVariableOnlyPatternPart(
			PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			AbstractVariable variable)
	{
		super(patternMatcher, null, new AbstractVariable[]
		{
			variable
		});
	}

	@Override
	protected EMatchType doGetMatchType()
	{
		return EMatchType.OPTIONAL;
	}

	@Override
	protected void doCreateLink()
	{
		// Do nothing
	}

	@Override
	protected void doDestroyLink(Map<AbstractVariable, Object> deletedObjects)
	{
		// Do nothing
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		return ECheckResult.OK;
	}

	@Override
	public boolean match() throws SDMException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public int calculateMatchingCost()
	{
		throw new UnsupportedOperationException();
	}

}
