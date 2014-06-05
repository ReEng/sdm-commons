package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.Path;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.MatchState;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPart;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class StoryDrivenPathPatternPart extends StoryDrivenPatternPart<AbstractVariable, Path>
{

	public StoryDrivenPathPatternPart(
			final PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			final Path link)
	{
		super(patternMatcher, link, new AbstractVariable[]
		{
				link.getSource(), link.getTarget()
		});
	}

	@Override
	protected EMatchType doGetMatchType()
	{
		switch (this.link.getBindingOperator())
		{
			case CHECK_ONLY:
				switch (this.link.getBindingSemantics())
				{
					case MANDATORY:
						return EMatchType.MANDATORY;
					case OPTIONAL:
						return EMatchType.OPTIONAL;
					case NEGATIVE:
						// return EMatchType.NEGATIVE;
						throw new UnsupportedOperationException();
				}
			case CREATE:
				throw new UnsupportedOperationException();
			case DESTROY:
				switch (this.link.getBindingSemantics())
				{
					case MANDATORY:
						return EMatchType.MANDATORY;
					case OPTIONAL:
						return EMatchType.OPTIONAL;
					case NEGATIVE:
						throw new UnsupportedOperationException();
				}
			default:
				throw new UnsupportedOperationException();
		}
	}

	@Override
	protected void doCreateLink()
	{
		// Do nothing
	}

	@Override
	protected void doDestroyLink(final Map<AbstractVariable, Object> deletedObjects)
	{
		// Do nothing
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		if (this.patternMatcher.isBound(this.link.getSource()) && this.patternMatcher.isBound(this.link.getTarget()))
		{
			final AbstractVariable sourceSpo = this.link.getSource();
			final AbstractVariable targetSpo = this.link.getTarget();

			final Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceSpo.getName());
			final Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(targetSpo.getName());

			if ((sourceVariable != null) && (targetVariable != null))
			{
				assert sourceVariable.getValue() != null;
				assert targetVariable.getValue() != null;

				assert sourceVariable.getValue() instanceof EObject;

				final EObject sourceInstanceObject = (EObject) sourceVariable.getValue();
				final Object targetInstanceObject = targetVariable.getValue();

				/*
				 * Evaluate the expression
				 */
				final Variable<EClassifier> result = null;

				/*
				 * TODO Here, the path must be evaluated. Either a single object
				 * or a collection of objects must be returned.
				 */

				if (result.getValue() instanceof Collection<?>)
				{
					if (((Collection<Object>) result.getValue()).contains(targetInstanceObject))
					{
						this.patternMatcher.getNotificationEmitter().linkCheckSuccessful(sourceSpo, sourceInstanceObject, this.link,
								targetSpo, targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);

						return ECheckResult.OK;
					}
					else
					{
						this.patternMatcher.getNotificationEmitter().linkCheckFailed(sourceSpo, sourceInstanceObject, this.link, targetSpo,
								targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);

						return ECheckResult.FAIL;
					}
				}
				else
				{
					if (result.getValue() == targetInstanceObject)
					{
						this.patternMatcher.getNotificationEmitter().linkCheckSuccessful(sourceSpo, sourceInstanceObject, this.link,
								targetSpo, targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);

						return ECheckResult.OK;
					}
					else
					{
						this.patternMatcher.getNotificationEmitter().linkCheckFailed(sourceSpo, sourceInstanceObject, this.link, targetSpo,
								targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);

						return ECheckResult.FAIL;
					}
				}
			}
			else
			{
				return ECheckResult.UNKNOWN;
			}
		}
		else
		{
			return ECheckResult.UNKNOWN;
		}
	}

	@Override
	public boolean match(final MatchState matchState) throws SDMException
	{
		final AbstractVariable sourceVar = this.link.getSource();
		final AbstractVariable targetVar = this.link.getTarget();

		assert this.patternMatcher.isBound(sourceVar) || this.patternMatcher.isBound(targetVar);
		assert !(this.patternMatcher.isBound(sourceVar) && this.patternMatcher.isBound(targetVar));

		assert this.patternMatcher.isBound(sourceVar);

		final Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());

		assert sourceVariable != null;
		assert sourceVariable.getValue() instanceof EObject;

		final EObject sourceInstanceObject = (EObject) sourceVariable.getValue();

		/*
		 * Evaluate link expression
		 */
		final Variable<EClassifier> result = null;

		/*
		 * TODO Here, the path must be evaluated. Result must be either a single
		 * object or a collection of objects.
		 * 
		 */
		if (1==1)
			throw new UnsupportedOperationException("Path not implemented yet");
		
		assert result != null;

		this.patternMatcher.getNotificationEmitter().traversingLink(this.link, sourceVar, sourceInstanceObject, targetVar,
				this.patternMatcher.getVariablesScope(), this.patternMatcher);

		if (result.getValue() instanceof Collection<?>)
		{
			for (final Object targetObject : (Collection<Object>) result.getValue())
			{
				if (this.patternMatcher.matchStoryPatternObject(targetVar, targetObject))
				{
					return true;
				}
			}
		}
		else
		{
			if ((result.getValue() != null) && this.patternMatcher.matchStoryPatternObject(targetVar, result.getValue()))
			{
				return true;
			}
		}

		this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(targetVar, this.patternMatcher.getVariablesScope(),
				this.patternMatcher);

		return false;
	}

	@Override
	public int calculateMatchingCost()
	{
		assert !(this.patternMatcher.isBound(this.link.getSource()) && this.patternMatcher.isBound(this.link.getTarget()));

		if (this.patternMatcher.isBound(this.link.getSource()))
		{
			/*
			 * It is probably very difficult to provide a useful matching cost
			 * estimation for a path.
			 */
			return Integer.MAX_VALUE - 1;
		}
		else
		{
			return PatternPart.MATCHING_NOT_POSSIBLE;
		}
	}

	@Override
	public MatchState createMatchState()
	{
		return null;
	}

}
