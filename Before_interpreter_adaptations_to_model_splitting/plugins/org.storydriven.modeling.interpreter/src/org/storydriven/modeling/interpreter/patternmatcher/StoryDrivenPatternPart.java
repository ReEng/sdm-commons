package org.storydriven.modeling.interpreter.patternmatcher;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.ETransactionType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPart;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public abstract class StoryDrivenPatternPart<AV extends AbstractVariable, ALV extends AbstractLinkVariable> extends
		PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>
{

	protected boolean			isCreate	= false;

	protected boolean			isDestroy	= false;

	protected final ALV			link;

	protected final AV[]		variables;

	protected final EMatchType	matchType;

	public StoryDrivenPatternPart(
			PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			ALV link, AV[] variables)
	{
		super(patternMatcher);

		assert variables.length > 0;
		assert link != null || variables.length == 1;

		this.link = link;
		this.variables = variables;

		this.matchType = this.doGetMatchType();

		if (link != null)
		{
			switch (link.getBindingOperator())
			{
				case CREATE:
					this.isCreate = true;
					break;

				case DESTROY:
					this.isDestroy = true;
					break;
			}
		}

		for (AV av : variables)
		{
			if (av instanceof ObjectVariable)
			{
				switch (((ObjectVariable) av).getBindingOperator())
				{
					case CREATE:
						this.isCreate = true;
						break;

					case DESTROY:
						this.isDestroy = true;
						break;
				}
			}
		}
	}

	@Override
	public AV[] getStoryPatternObjects()
	{
		return this.variables;
	}

	@Override
	public void createElements(VariablesScope<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> variablesScope)
	{
		if (this.isCreate)
		{
			/*
			 * Create objects
			 */
			for (AbstractVariable var : this.variables)
			{
				if (var instanceof ObjectVariable && ((ObjectVariable) var).getBindingOperator() == BindingOperator.CREATE)
				{
					if (!variablesScope.variableExists(var.getName()))
					{
						ObjectVariable objectVariable = (ObjectVariable) var;

						EFactory factory = objectVariable.getClassifier().getEPackage().getEFactoryInstance();

						EObject eObject = factory.create(objectVariable.getClassifier());

						variablesScope.createVariable(objectVariable.getName(), objectVariable.getClassifier(), eObject);

						this.patternMatcher.getNotificationEmitter().instanceObjectCreated(var, eObject,
								this.patternMatcher.getVariablesScope(), this.patternMatcher);
					}
				}
			}

			/*
			 * Create link
			 */
			this.doCreateLink();
		}
	}

	@Override
	public void destroyObjects(VariablesScope<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> variablesScope)
	{
		if (this.isDestroy)
		{
			for (AbstractVariable var : this.variables)
			{
				if (var instanceof ObjectVariable && ((ObjectVariable) var).getBindingOperator() == BindingOperator.DESTROY)
				{
					Variable<EClassifier> variable = variablesScope.deleteVariable(var.getName());

					/*
					 * Variable may be null in case of optional objects and
					 * objects destroyed in a different pattern part.
					 */
					if (variable != null)
					{
						assert variable.getValue() instanceof EObject;

						EObject instanceObject = (EObject) variable.getValue();

						assert instanceObject != null;

						EcoreUtil.delete(instanceObject, true);

						this.patternMatcher.getNotificationEmitter().instanceObjectDestroyed(var, instanceObject,
								this.patternMatcher.getVariablesScope(), this.patternMatcher);
					}
				}
			}
		}
	}

	protected boolean matchTargetObject(AbstractVariable sourceVar, Object sourceInstanceObject, AbstractVariable targetVar,
			Object targetObject) throws SDMException
	{
		/*
		 * The targetObject must exist, it must not be bound to another story
		 * pattern object, the targetSpo must not have been bound to the
		 * targetObject before, and the type of the targetObject must be
		 * correct.
		 */
		if (targetObject != null && !this.patternMatcher.boundInstanceObjects.contains(targetObject)
				&& !this.patternMatcher.matchingHistory.get(targetVar).contains(targetObject)
				&& targetVar.getType().isInstance(targetObject))
		{
			int size = this.patternMatcher.matchTransactions.size();

			this.patternMatcher.getVariablesScope().createVariable(targetVar.getName(), targetVar.getType(), targetObject);

			assert this.patternMatcher.unboundSPO.contains(targetVar);
			assert !this.patternMatcher.boundSPO.contains(targetVar);
			assert !this.patternMatcher.boundInstanceObjects.contains(targetObject);

			/*
			 * Transaction for targetSPO
			 */
			this.patternMatcher.commitTransaction(targetVar, this.patternMatcher.unboundSPO, this.patternMatcher.boundSPO,
					ETransactionType.SPO_MATCHED);

			/*
			 * Transaction for targetObject
			 */
			this.patternMatcher.commitTransaction(targetObject, null, this.patternMatcher.boundInstanceObjects,
					ETransactionType.INSTANCE_OBJECT_MATCHED);

			/*
			 * Update matchingHistory
			 */
			this.patternMatcher.matchingHistory.get(targetVar).add(targetObject);

			this.patternMatcher.getNotificationEmitter().storyPatternObjectBound(targetVar, targetObject,
					this.patternMatcher.getVariablesScope(), this.patternMatcher);

			/*
			 * Check links and attributes.
			 */
			if (this.patternMatcher.checkStoryPatternObjectConstraints(targetVar, targetObject)
					&& this.patternMatcher.checkUncheckedPatternParts(targetVar)
					&& (this.patternMatcher.unboundSPO.isEmpty() || this.patternMatcher
							.matchStoryPatternInternal(this.patternMatcher.matchTransactions.size())))
			{
				assert !this.patternMatcher.unboundSPO.isEmpty() || this.patternMatcher.uncheckedPatternParts.isEmpty();

				return true;
			}
			else
			{
				this.patternMatcher.getNotificationEmitter().storyPatternObjectBindingRevoked(targetVar, targetObject,
						this.patternMatcher.getVariablesScope(), this.patternMatcher);

				this.patternMatcher.rollBack(size);

				return false;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	public final void destroyLink(java.util.Map<AbstractVariable, Object> deletedObjects)
	{
		if (this.isDestroy)
		{
			this.doDestroyLink(deletedObjects);
		}
	};

	@Override
	public EMatchType getMatchType()
	{
		return this.matchType;
	}

	protected abstract EMatchType doGetMatchType();

	protected abstract void doCreateLink();

	protected abstract void doDestroyLink(Map<AbstractVariable, Object> deletedObjects);

	@Override
	public int getCreationPriority() throws SDMException
	{
		return 0;
	}

	@Override
	public void matchingPhaseFinished() throws SDMException
	{
		// Do nothing
	}
}
