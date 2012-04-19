package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.ContainmentRelation;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.MatchState;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPart;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class StoryDrivenContainmentRelationPatternPart extends StoryDrivenPatternPart<AbstractVariable, ContainmentRelation>
{

	public StoryDrivenContainmentRelationPatternPart(
			PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			ContainmentRelation link)
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

	@SuppressWarnings("unchecked")
	@Override
	protected void doDestroyLink(Map<AbstractVariable, Object> deletedObjects)
	{
		assert this.link.getBindingOperator() == BindingOperator.DESTROY;

		AbstractVariable sourceVar = this.link.getSource();
		AbstractVariable targetVar = this.link.getTarget();

		assert deletedObjects.get(targetVar) == null || deletedObjects.get(targetVar) instanceof EObject;

		Object sourceInstanceObject = deletedObjects.get(sourceVar);

		if (sourceInstanceObject == null)
		{
			/*
			 * The source object was not deleted or it is optional and was not
			 * even matched.
			 */
			Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());

			if (sourceVariable != null)
			{
				sourceInstanceObject = sourceVariable.getValue();
			}
		}

		EObject targetInstanceObject = (EObject) deletedObjects.get(targetVar);

		if (sourceInstanceObject != null && targetInstanceObject == null)
		{
			/*
			 * The target object was not destroyed. Destroy the link now.
			 */
			Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(targetVar.getName());

			assert targetVariable != null;
			assert targetVariable.getValue() instanceof EObject;

			targetInstanceObject = (EObject) targetVariable.getValue();

			EObject container = targetInstanceObject.eContainer();

			if (!targetInstanceObject.eContainingFeature().isMany())
			{
				container.eSet(targetInstanceObject.eContainingFeature(), null);
			}
			else
			{
				((Collection<EObject>) container.eGet(targetInstanceObject.eContainingFeature())).remove(targetInstanceObject);
			}
		}

		this.patternMatcher.getNotificationEmitter().instanceLinkDestroyed(sourceVar, sourceInstanceObject, this.link, targetVar,
				targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		if (this.patternMatcher.isBound(this.link.getSource()) && this.patternMatcher.isBound(this.link.getTarget()))
		{
			AbstractVariable sourceVar = this.link.getSource();
			AbstractVariable targetVar = this.link.getTarget();

			Variable<EClassifier> sourceVariable = this.patternMatcher.getVariablesScope().getVariable(sourceVar.getName());
			Variable<EClassifier> targetVariable = this.patternMatcher.getVariablesScope().getVariable(targetVar.getName());

			if (sourceVariable != null && targetVariable != null)
			{
				assert sourceVariable.getValue() != null;
				assert targetVariable.getValue() != null;

				assert sourceVariable.getValue() instanceof EObject;

				EObject sourceInstanceObject = (EObject) sourceVariable.getValue();
				Object targetInstanceObject = targetVariable.getValue();

				TreeIterator<EObject> it = sourceInstanceObject.eAllContents();

				while (it.hasNext())
				{
					if (it.next() == targetInstanceObject)
					{
						this.patternMatcher.getNotificationEmitter().linkCheckSuccessful(sourceVar, sourceInstanceObject, this.link,
								targetVar, targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);

						return ECheckResult.OK;
					}
				}

				this.patternMatcher.getNotificationEmitter().linkCheckFailed(sourceVar, sourceInstanceObject, this.link, targetVar,
						targetInstanceObject, this.patternMatcher.getVariablesScope(), this.patternMatcher);

				return ECheckResult.FAIL;
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

	// @Override
	// public boolean match() throws SDMException
	// {
	// AbstractVariable sourceSpo = this.link.getSource();
	// AbstractVariable targetSpo = this.link.getTarget();
	//
	// if (this.patternMatcher.boundSPO.contains(sourceSpo))
	// {
	// /*
	// * Use a tree iterator to search all children of the source object
	// * for a match for the target object.
	// */
	// assert this.patternMatcher.unboundSPO.contains(targetSpo);
	//
	// Variable<EClassifier> sourceVariable =
	// this.patternMatcher.getVariablesScope().getVariable(sourceSpo.getName());
	//
	// assert sourceVariable != null;
	// assert sourceVariable.getValue() instanceof EObject;
	//
	// EObject sourceInstanceObject = (EObject) sourceVariable.getValue();
	//
	// this.patternMatcher.getNotificationEmitter().traversingLink(this.link,
	// sourceSpo, sourceInstanceObject, targetSpo,
	// this.patternMatcher.getVariablesScope(), this.patternMatcher);
	//
	// /*
	// * Find the first target object that matches.
	// */
	// TreeIterator<EObject> it = sourceInstanceObject.eAllContents();
	//
	// while (it.hasNext())
	// {
	// Object targetObject = it.next();
	//
	// if (matchTargetObject(sourceSpo, sourceInstanceObject, targetSpo,
	// targetObject))
	// {
	// return true;
	// }
	// }
	//
	// this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(targetSpo,
	// this.patternMatcher.getVariablesScope(),
	// this.patternMatcher);
	// }
	// else if (this.patternMatcher.boundSPO.contains(targetSpo))
	// {
	// /*
	// * Walk the containment hierarchy upwards from the target object
	// * until a match for the source object was found or the end of the
	// * hierarchy was reached.
	// */
	// assert this.patternMatcher.unboundSPO.contains(sourceSpo);
	//
	// Variable<EClassifier> targetVariable =
	// this.patternMatcher.getVariablesScope().getVariable(targetSpo.getName());
	//
	// assert targetVariable != null;
	// assert targetVariable.getValue() instanceof EObject;
	//
	// EObject targetInstanceObject = (EObject) targetVariable.getValue();
	//
	// this.patternMatcher.getNotificationEmitter().traversingLink(this.link,
	// targetSpo, targetInstanceObject, sourceSpo,
	// this.patternMatcher.getVariablesScope(), this.patternMatcher);
	//
	// /*
	// * Find the first target object that matches.
	// */
	// EObject sourceInstanceObject = targetInstanceObject.eContainer();
	//
	// do
	// {
	// if (matchTargetObject(targetSpo, targetInstanceObject, sourceSpo,
	// sourceInstanceObject))
	// {
	// return true;
	// }
	//
	// sourceInstanceObject = sourceInstanceObject.eContainer();
	//
	// }
	// while (sourceInstanceObject != null);
	//
	// this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(sourceSpo,
	// this.patternMatcher.getVariablesScope(),
	// this.patternMatcher);
	// }
	// else
	// {
	// /*
	// * Should never happen
	// */
	// throw new UnsupportedOperationException();
	// }
	//
	// return false;
	// }
	@Override
	public int calculateMatchingCost()
	{
		assert !(this.patternMatcher.isBound(this.link.getSource()) && this.patternMatcher.isBound(this.link.getTarget()));

		if (this.patternMatcher.isBound(this.link.getTarget()))
		{
			/*
			 * If the target object is bound, we can go from the target upwards
			 * to the source using eContainer().
			 */
			return 5;
		}
		else if (this.patternMatcher.isBound(this.link.getSource()))
		{
			/*
			 * If the source is bound, we have to search all children. We cannot
			 * provide an exact estimate.
			 */
			return Integer.MAX_VALUE;
		}
		else
		{
			return PatternPart.MATCHING_NOT_POSSIBLE;
		}
	}

	@Override
	public boolean match(MatchState matchState) throws SDMException
	{
		assert matchState != null;
		assert matchState instanceof StoryDrivenContainmentRelationMatchState;

		StoryDrivenContainmentRelationMatchState ms = (StoryDrivenContainmentRelationMatchState) matchState;

		AbstractVariable sourceSpo = this.link.getSource();
		AbstractVariable targetSpo = this.link.getTarget();

		if (this.patternMatcher.isBound(sourceSpo))
		{
			/*
			 * Use a tree iterator to search all children of the source object
			 * for a match for the target object.
			 */
			assert !this.patternMatcher.isBound(targetSpo);

			EObject sourceInstanceObject = (EObject) this.patternMatcher.getInstanceObject(sourceSpo);

			this.patternMatcher.getNotificationEmitter().traversingLink(this.link, sourceSpo, sourceInstanceObject, targetSpo,
					this.patternMatcher.getVariablesScope(), this.patternMatcher);

			/*
			 * Find the first target object that matches.
			 */
			TreeIterator<EObject> iterator = ms.getLinkIterator();

			if (iterator == null)
			{
				iterator = sourceInstanceObject.eAllContents();
				ms.setLinkIterator(iterator);
				ms.setSourceInstanceObject(sourceInstanceObject);
				ms.setLastContainer(null);
			}

			while (iterator.hasNext())
			{
				Object targetObject = iterator.next();

				if (this.patternMatcher.matchStoryPatternObject(targetSpo, targetObject))
				{
					return true;
				}
			}

			this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(targetSpo, this.patternMatcher.getVariablesScope(),
					this.patternMatcher);
		}
		else if (this.patternMatcher.isBound(targetSpo))
		{
			/*
			 * Walk the containment hierarchy upwards from the target object
			 * until a match for the source object was found or the end of the
			 * hierarchy was reached.
			 */
			assert !this.patternMatcher.isBound(sourceSpo);

			EObject targetInstanceObject = (EObject) this.patternMatcher.getInstanceObject(targetSpo);

			this.patternMatcher.getNotificationEmitter().traversingLink(this.link, targetSpo, targetInstanceObject, sourceSpo,
					this.patternMatcher.getVariablesScope(), this.patternMatcher);

			/*
			 * Find the first target object that matches.
			 */
			EObject sourceInstanceObject = ms.getLastContainer();

			if (sourceInstanceObject == null)
			{
				sourceInstanceObject = targetInstanceObject.eContainer();
				ms.setLastContainer(sourceInstanceObject);
				ms.setLinkIterator(null);
				ms.setSourceInstanceObject(targetInstanceObject);
			}

			while (sourceInstanceObject != null)
			{
				if (this.patternMatcher.matchStoryPatternObject(sourceSpo, sourceInstanceObject))
				{
					ms.setLastContainer(sourceInstanceObject);
					return true;
				}

				sourceInstanceObject = sourceInstanceObject.eContainer();
			}

			ms.setLastContainer(null);

			this.patternMatcher.getNotificationEmitter().storyPatternObjectNotBound(sourceSpo, this.patternMatcher.getVariablesScope(),
					this.patternMatcher);
		}
		else
		{
			/*
			 * Should never happen
			 */
			throw new UnsupportedOperationException();
		}

		return false;
	}

	@Override
	public MatchState createMatchState()
	{
		return new StoryDrivenContainmentRelationMatchState();
	}
}
