package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.LinkVariable;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StoryDrivenLinkVariablePatternPart extends StoryDrivenPatternPart<AbstractVariable, LinkVariable>
{

	public StoryDrivenLinkVariablePatternPart(
			PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			LinkVariable link)
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
				switch (this.link.getBindingSemantics())
				{
					case MANDATORY:
						return EMatchType.OPTIONAL;
					case OPTIONAL:
						return EMatchType.OPTIONAL;
					case NEGATIVE:
						throw new UnsupportedOperationException();
				}
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

	@SuppressWarnings("unchecked")
	@Override
	protected void doCreateLink()
	{
		Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(this.link.getSource().getName());
		Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(this.link.getTarget().getName());

		assert sourceVariable != null;
		assert targetVariable != null;

		assert sourceVariable.getValue() instanceof EObject;

		EObject sourceEObject = (EObject) sourceVariable.getValue();

		if (!this.link.getTargetEnd().isMany())
		{
			sourceEObject.eSet(this.link.getTargetEnd(), targetVariable.getValue());
		}
		else
		{
			((Collection<Object>) sourceEObject.eGet(this.link.getTargetEnd())).add(targetVariable.getValue());
		}

		this.patternMatcher.getNotificationEmitter().instanceLinkCreated(this.link.getSource(), sourceEObject, this.link,
				this.link.getTarget(), targetVariable.getValue(), this.patternMatcher.getVariablesScope(), this.patternMatcher);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doDestroyLink(Map<AbstractVariable, Object> deletedObjects)
	{
		assert this.link.getBindingOperator() == BindingOperator.DESTROY;

		AbstractVariable sourceVar = this.link.getSource();
		AbstractVariable targetVar = this.link.getTarget();

		assert deletedObjects.get(sourceVar) == null || deletedObjects.get(sourceVar) instanceof EObject;

		EObject sourceInstanceObject = (EObject) deletedObjects.get(sourceVar);

		Object targetInstanceObject = deletedObjects.get(targetVar);

		if (sourceInstanceObject == null)
		{
			/*
			 * The source spo was not destroyed
			 */
			Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());

			if (sourceVariable != null)
			{
				assert sourceVariable.getValue() instanceof EObject;

				sourceInstanceObject = (EObject) sourceVariable.getValue();
			}
		}

		if (targetInstanceObject == null)
		{
			/*
			 * The target spo was not destroyed.
			 */
			Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(targetVar.getName());

			if (targetVariable != null)
			{
				targetInstanceObject = targetVariable.getValue();
			}
		}

		if (sourceInstanceObject != null && targetInstanceObject != null)
		{
			/*
			 * Delete the link
			 */
			if (!this.link.getTargetEnd().isMany())
			{
				sourceInstanceObject.eSet(this.link.getTargetEnd(), null);
			}
			else
			{
				((Collection<Object>) sourceInstanceObject.eGet(this.link.getTargetEnd())).remove(targetInstanceObject);
			}

			this.patternMatcher.getNotificationEmitter().instanceLinkDestroyed(sourceVar, sourceInstanceObject, this.link, targetVar,
					targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ECheckResult check() throws SDMException
	{
		AbstractVariable source = this.link.getSource();
		AbstractVariable target = this.link.getTarget();

		if (this.link.getBindingOperator() != BindingOperator.CREATE && this.patternMatcher.boundSPO.contains(source)
				&& this.patternMatcher.boundSPO.contains(target))
		{
			VariablesScope<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> variablesScope = this.patternMatcher
					.getVariablesScope();

			Variable<EClassifier> sourceVariable = variablesScope.getVariable(source.getName());
			Variable<EClassifier> targetVariable = variablesScope.getVariable(target.getName());

			if (sourceVariable != null && targetVariable != null)
			{
				assert sourceVariable.getValue() != null;
				assert targetVariable.getValue() != null;

				assert sourceVariable.getValue() instanceof EObject;

				EObject sourceInstanceObject = (EObject) sourceVariable.getValue();
				Object targetInstanceObject = targetVariable.getValue();

				EStructuralFeature eStructuralFeature = this.link.getTargetEnd();

				if (!eStructuralFeature.isMany())
				{
					if (sourceInstanceObject.eGet(eStructuralFeature) == targetInstanceObject)
					{
						this.patternMatcher.getNotificationEmitter().linkCheckSuccessful(source, sourceInstanceObject, this.link, target,
								targetInstanceObject, variablesScope, this.patternMatcher);

						return ECheckResult.OK;
					}
					else
					{
						this.patternMatcher.getNotificationEmitter().linkCheckFailed(source, sourceInstanceObject, this.link, target,
								targetInstanceObject, variablesScope, this.patternMatcher);

						return ECheckResult.FAIL;
					}
				}
				else
				{
					if (((Collection<Object>) sourceInstanceObject.eGet(eStructuralFeature)).contains(targetInstanceObject))
					{
						this.patternMatcher.getNotificationEmitter().linkCheckSuccessful(source, sourceInstanceObject, this.link, target,
								targetInstanceObject, variablesScope, this.patternMatcher);

						return ECheckResult.OK;
					}
					else
					{
						this.patternMatcher.getNotificationEmitter().linkCheckFailed(source, sourceInstanceObject, this.link, target,
								targetInstanceObject, variablesScope, this.patternMatcher);

						return ECheckResult.FAIL;
					}
				}
			}
			else
			{
				return ECheckResult.UNKNOWN;
			}
		}
		else if (this.link.getBindingOperator() == BindingOperator.CREATE && this.link.getBindingSemantics() != BindingSemantics.OPTIONAL)
		{
			return ECheckResult.OK;
		}
		else
		{
			return ECheckResult.UNKNOWN;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean match() throws SDMException
	{
		AbstractVariable sourceVar = this.link.getSource();
		AbstractVariable targetVar = this.link.getTarget();

		assert this.patternMatcher.boundSPO.contains(sourceVar) || this.patternMatcher.boundSPO.contains(targetVar);
		assert !(this.patternMatcher.boundSPO.contains(sourceVar) && this.patternMatcher.boundSPO.contains(targetVar));

		if (this.patternMatcher.boundSPO.contains(sourceVar))
		{
			Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());

			assert sourceVariable != null;
			assert sourceVariable.getValue() instanceof EObject;

			EObject sourceInstanceObject = (EObject) sourceVariable.getValue();

			this.patternMatcher.getNotificationEmitter().traversingLink(this.link, sourceVar, sourceInstanceObject, targetVar,
					this.patternMatcher.getVariablesScope(), this.patternMatcher);

			if (!this.link.getTargetEnd().isMany())
			{
				if (this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar, sourceInstanceObject.eGet(this.link.getTargetEnd())))
				{
					return true;
				}
			}
			else
			{
				/*
				 * Find the first target object that matches.
				 */
				for (Object targetObject : (Collection<Object>) sourceInstanceObject.eGet(this.link.getTargetEnd()))
				{
					if (this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar, targetObject))
					{
						return true;
					}
				}
			}

			this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(targetVar, this.patternMatcher.getVariablesScope(),
					this.patternMatcher);
		}
		else
		{
			/*
			 * Start from the target object
			 */
			sourceVar = this.link.getTarget();
			targetVar = this.link.getSource();

			Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());

			assert sourceVariable != null;
			assert sourceVariable.getValue() instanceof EObject;

			EObject sourceInstanceObject = (EObject) sourceVariable.getValue();

			if (this.link.getSourceEnd() != null)
			{
				if (!this.link.getSourceEnd().isMany())
				{
					if (this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar,
							sourceInstanceObject.eGet(this.link.getSourceEnd())))
					{
						return true;
					}
				}
				else
				{
					for (Object targetObject : (Collection<Object>) sourceInstanceObject.eGet(this.link.getSourceEnd()))
					{
						if (this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar, targetObject))
						{
							return true;
						}
					}
				}
			}
			else if (this.link.getTargetEnd().isContainment())
			{
				if (this.matchTargetObject(sourceVar, sourceInstanceObject, targetVar, sourceInstanceObject.eContainer()))
				{
					return true;
				}
			}
			else
			{
				throw new UnsupportedOperationException();
			}

			this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(sourceVar, this.patternMatcher.getVariablesScope(),
					this.patternMatcher);
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int calculateMatchingCost()
	{
		assert !(this.patternMatcher.boundSPO.contains(this.link.getSource()) && this.patternMatcher.boundSPO.contains(this.link
				.getTarget()));

		if (this.patternMatcher.boundSPO.contains(this.link.getSource()))
		{
			if (!this.link.getTargetEnd().isMany())
			{
				return 1;
			}
			else
			{
				Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(this.link.getSource().getName());

				assert sourceVariable.getValue() instanceof EObject;

				EObject sourceEObject = (EObject) sourceVariable.getValue();

				return ((Collection<Object>) sourceEObject.eGet(this.link.getTargetEnd())).size();
			}
		}
		else if (this.patternMatcher.boundSPO.contains(this.link.getTarget()))
		{
			EReference eReference = this.link.getTargetEnd();

			if (eReference.isContainment())
			{
				/*
				 * We can get the direct container by calling eContainer() on
				 * the target object.
				 */
				return 2;
			}
			else if (eReference.getEOpposite() != null)
			{
				if (!eReference.getEOpposite().isMany())
				{
					return 1;
				}
				else
				{
					Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(
							this.link.getTarget().getName());

					assert targetVariable.getValue() instanceof EObject;

					EObject targetEObject = (EObject) targetVariable.getValue();

					return ((Collection<EObject>) targetEObject.eGet(eReference.getEOpposite())).size();
				}
			}
			else
			{
				return MATCHING_NOT_POSSIBLE;
			}

		}
		else
		{
			return MATCHING_NOT_POSSIBLE;
		}
	}

}
