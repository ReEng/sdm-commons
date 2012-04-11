package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Path;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class StoryDrivenPathPatternPart extends StoryDrivenPatternPart<AbstractVariable, Path>
{

	public StoryDrivenPathPatternPart(
			PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			Path link)
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
						return EMatchType.NEGATIVE;
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
	protected void doDestroyLink(Map<AbstractVariable, Object> deletedObjects)
	{
		// Do nothing
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		if (this.patternMatcher.boundSPO.contains(this.link.getSource()) && this.patternMatcher.boundSPO.contains(this.link.getTarget()))
		{
			AbstractVariable sourceSpo = this.link.getSource();
			AbstractVariable targetSpo = this.link.getTarget();

			Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceSpo.getName());
			Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(targetSpo.getName());

			if (sourceVariable != null && targetVariable != null)
			{
				assert sourceVariable.getValue() != null;
				assert targetVariable.getValue() != null;

				assert sourceVariable.getValue() instanceof EObject;

				EObject sourceInstanceObject = (EObject) sourceVariable.getValue();
				Object targetInstanceObject = targetVariable.getValue();

				/*
				 * Evaluate the expression
				 */
				Variable<EClassifier> result = null;

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
	public boolean match() throws SDMException
	{
		AbstractVariable sourceVar = this.link.getSource();
		AbstractVariable targetVar = this.link.getTarget();

		assert this.patternMatcher.boundSPO.contains(sourceVar) || this.patternMatcher.boundSPO.contains(targetVar);
		assert !(this.patternMatcher.boundSPO.contains(sourceVar) && this.patternMatcher.boundSPO.contains(targetVar));

		assert this.patternMatcher.boundSPO.contains(sourceVar);

		Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());

		assert sourceVariable != null;
		assert sourceVariable.getValue() instanceof EObject;

		EObject sourceInstanceObject = (EObject) sourceVariable.getValue();

		/*
		 * Evaluate link expression
		 */
		Variable<EClassifier> result = null;

		/*
		 * TODO Here, the path must be evaluated. Result must be either a single
		 * object or a collection of objects.
		 */

		assert result != null;

		this.patternMatcher.getNotificationEmitter().traversingLink(this.link, sourceVar, sourceInstanceObject, targetVar,
				this.patternMatcher.getVariablesScope(), this.patternMatcher);

		if (result.getValue() instanceof Collection<?>)
		{
			for (Object targetObject : (Collection<Object>) result.getValue())
			{
				if (this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar, targetObject))
				{
					return true;
				}
			}
		}
		else
		{
			if (result.getValue() != null && this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar, result.getValue()))
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
		assert !(this.patternMatcher.boundSPO.contains(this.link.getSource()) && this.patternMatcher.boundSPO.contains(this.link
				.getTarget()));

		if (this.patternMatcher.boundSPO.contains(this.link.getSource()))
		{
			/*
			 * It is probably very difficult to provide a useful matching cost
			 * estimation for a path.
			 */
			return Integer.MAX_VALUE;
		}
		else
		{
			return MATCHING_NOT_POSSIBLE;
		}
	}

}
