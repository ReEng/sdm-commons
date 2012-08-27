package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.LinkVariable;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.MatchState;
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

		if (this.link.getBindingOperator() != BindingOperator.CREATE && this.patternMatcher.isBound(source)
				&& this.patternMatcher.isBound(target))
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
	public boolean match(MatchState matchState) throws SDMException
	{
		assert matchState instanceof StoryDrivenLinkVariableMatchState;

		StoryDrivenLinkVariableMatchState<Iterator<Object>> ms = (StoryDrivenLinkVariableMatchState<Iterator<Object>>) matchState;

		AbstractVariable sourceSpo = this.link.getSource();
		AbstractVariable targetSpo = this.link.getTarget();

		assert this.patternMatcher.isBound(sourceSpo) || this.patternMatcher.isBound(targetSpo);
		assert !(this.patternMatcher.isBound(sourceSpo) && this.patternMatcher.isBound(targetSpo));

		/*
		 * The source object is bound. Search for a match of the target object.
		 */
		if (this.patternMatcher.isBound(sourceSpo))
		{
			EObject sourceInstanceObject = (EObject) this.patternMatcher.getInstanceObject(sourceSpo);

			return matchTargetObject(ms, sourceSpo, targetSpo, sourceInstanceObject, this.link.getTargetEnd());
		}
		else
		{
			/*
			 * Start matching from the target object
			 */
			sourceSpo = this.link.getTarget();
			targetSpo = this.link.getSource();

			EObject sourceInstanceObject = (EObject) this.patternMatcher.getInstanceObject(sourceSpo);

			if (this.link.getTargetEnd() instanceof EReference)
			{
				EReference eReference = this.link.getTargetEnd();

				/*
				 * The link's reference has an opposite. Navigate via the
				 * opposite reference.
				 */
				if (eReference.getEOpposite() != null)
				{
					return matchTargetObject(ms, sourceSpo, targetSpo, sourceInstanceObject, eReference.getEOpposite());
				}
				/*
				 * The link's reference is a containment.
				 */
				else if (eReference.isContainment())
				{
					this.patternMatcher.getNotificationEmitter().traversingLink(this.link, sourceSpo, sourceInstanceObject, targetSpo,
							this.patternMatcher.getVariablesScope(), this.patternMatcher);

					EObject targetInstanceObject = sourceInstanceObject.eContainer();

					if (this.patternMatcher.matchStoryPatternObject(targetSpo, targetInstanceObject)
							&& (!eReference.isMany() && sourceInstanceObject.eContainer().eGet(eReference) == sourceInstanceObject || eReference
									.isMany()
									&& ((Collection<Object>) sourceInstanceObject.eContainer().eGet(eReference))
											.contains(sourceInstanceObject)))
					{
						this.patternMatcher.getNotificationEmitter().storyPatternObjectBound(targetSpo, targetInstanceObject,
								this.patternMatcher.getVariablesScope(), this.patternMatcher);

						return true;
					}
				}
				else
				{
					throw new UnsupportedOperationException();
				}
			}
			else
			{
				throw new UnsupportedOperationException();
			}

			this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(targetSpo, this.patternMatcher.getVariablesScope(),
					this.patternMatcher);
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int calculateMatchingCost()
	{
		assert !(this.patternMatcher.isBound(this.link.getSource()) && this.patternMatcher.isBound(this.link.getTarget()));

		if (this.patternMatcher.isBound(this.link.getSource()))
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
		else if (this.patternMatcher.isBound(this.link.getTarget()))
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

	@Override
	public MatchState createMatchState()
	{
		return new StoryDrivenLinkVariableMatchState<Iterator<Object>>();
	}

	@SuppressWarnings("unchecked")
	private boolean matchTargetObject(StoryDrivenLinkVariableMatchState<Iterator<Object>> matchState, AbstractVariable sourceSpo,
			AbstractVariable targetSpo, EObject sourceInstanceObject, EStructuralFeature feature) throws SDMException
	{
		assert matchState != null;
		assert sourceSpo != null;
		assert targetSpo != null;
		assert sourceInstanceObject != null;
		assert feature != null;

		this.patternMatcher.getNotificationEmitter().traversingLink(this.link, sourceSpo, sourceInstanceObject, targetSpo,
				this.patternMatcher.getVariablesScope(), this.patternMatcher);

		/*
		 * This is a to-one feature.
		 */
		if (!feature.isMany())
		{
			Object targetInstanceObject = sourceInstanceObject.eGet(feature);

			if (this.patternMatcher.matchStoryPatternObject(targetSpo, targetInstanceObject))
			{
				this.patternMatcher.getNotificationEmitter().storyPatternObjectBound(targetSpo, targetInstanceObject,
						this.patternMatcher.getVariablesScope(), this.patternMatcher);

				return true;
			}
		}
		/*
		 * This is a to-many feature.
		 */
		else
		{
			Iterator<Object> linkIterator = matchState.getLinkIterator();

			if (linkIterator == null || sourceInstanceObject != matchState.getSourceInstanceObject())
			{
				linkIterator = ((Collection<Object>) sourceInstanceObject.eGet(feature)).iterator();

				matchState.setLinkIterator(linkIterator);
				matchState.setSourceInstanceObject(sourceInstanceObject);
			}

			while (linkIterator.hasNext())
			{
				Object targetInstanceObject = linkIterator.next();

				if (this.patternMatcher.matchStoryPatternObject(targetSpo, targetInstanceObject))
				{
					this.patternMatcher.getNotificationEmitter().storyPatternObjectBound(targetSpo, targetInstanceObject,
							this.patternMatcher.getVariablesScope(), this.patternMatcher);

					return true;
				}
			}
		}

		this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(targetSpo, this.patternMatcher.getVariablesScope(),
				this.patternMatcher);

		return false;
	}
}
