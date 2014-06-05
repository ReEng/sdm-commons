package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.facade.IClassifierFacade;
import de.mdelab.sdm.interpreter.core.facade.IInstanceFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternObjectFacade;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.patternmatcher.MatchingStrategy;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * The pattern-part based pattern matcher splits the story pattern into pattern
 * parts before searching for matches. Each pattern part consists either of a
 * single story pattern link and its connected story pattern objects, or of only
 * a single story pattern object if this object is not connected to any link.
 * Matching, creating and deleting pattern parts is handled by subclasses of
 * PatternPart, which implement this behavior for a specific story diagram
 * metamodel.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <ActivityNode>
 * @param <StoryPattern>
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public abstract class PatternPartBasedMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		extends
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{

	protected final IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>			spoFacade;
	protected final IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression>							spFacade;
	protected final IClassifierFacade<Classifier>																				classifierFacade;
	protected final IInstanceFacade<StoryPatternLink, Classifier, Feature, Expression>											instanceFacade;

	/*
	 * The matching history stores information about which story pattern object
	 * was bound to which instance object.
	 */
	protected final Map<StoryPatternObject, Set<Object>>																		matchingHistory;

	/*
	 * The story pattern objects that are already bound to an instance object.
	 */
	protected final Set<StoryPatternObject>																						boundSPO;

	/*
	 * The story pattern objects that are still unbound.
	 */
	protected final Set<StoryPatternObject>																						unboundSPO;

	/*
	 * Those pattern parts that are already checked.
	 */
	protected final Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>								checkedPatternParts;

	/*
	 * Those pattern parts that still need to be checked or matched.
	 */
	protected final Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>								uncheckedPatternParts;

	/*
	 * The instance objects, to which a story pattern object is already bound.
	 * This is necessary to ensure isomorphism.
	 */
	protected final Set<Object>																									boundInstanceObjects;

	/*
	 * All changes on the above sets are wrapped in transactions. The
	 * transactions are put on this stack. Transactions are rolled back in case
	 * of backtracking.
	 */
	public final Stack<MatchTransaction>																						matchingStack;

	/*
	 * This map stores information, which story pattern object is contained in
	 * which pattern part. This is needed later on to find overlapping pattern
	 * parts.
	 */
	protected final Map<StoryPatternObject, List<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>>	spoToPatternPartsMap;

	/*
	 * The match states of the pattern parts.
	 */
	protected final Map<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>, MatchState>					patternPartMatchStates;

	/**
	 * Create a new PatternPartBasedMatcher and initialize it with the provided
	 * story pattern.
	 * 
	 * @param storyPattern
	 * @param variablesScope
	 * @param matchingStrategy
	 * @param facadeFactory
	 * @param notificationReceiver
	 * @param expressionInterpreterManager
	 * @param notificationEmitter
	 * @throws SDMException
	 */
	public PatternPartBasedMatcher(
			final StoryPattern storyPattern,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope,
			final MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> matchingStrategy,
			final MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> expressionInterpreterManager,
			final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
			throws SDMException
	{
		super(storyPattern, variablesScope, matchingStrategy, facadeFactory, expressionInterpreterManager, notificationEmitter);

		this.getNotificationEmitter().storyPatternInitializationStarted(this.getStoryPattern(), this.getVariablesScope(), this);

		this.spFacade = facadeFactory.getStoryPatternFacade();
		this.spoFacade = facadeFactory.getStoryPatternObjectFacade();
		this.classifierFacade = facadeFactory.getClassifierFacade();
		this.instanceFacade = facadeFactory.getInstanceFacade();

		this.matchingHistory = new HashMap<StoryPatternObject, Set<Object>>();
		this.matchingStack = new Stack<MatchTransaction>();

		this.boundSPO = new HashSet<StoryPatternObject>();
		this.unboundSPO = new HashSet<StoryPatternObject>();

		this.checkedPatternParts = new HashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();
		this.uncheckedPatternParts = new HashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();

		this.boundInstanceObjects = new HashSet<Object>();

		this.spoToPatternPartsMap = new HashMap<StoryPatternObject, List<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>>();

		this.patternPartMatchStates = new HashMap<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>, MatchState>();

		this.initializePatternParts();

		this.getNotificationEmitter().storyPatternInitializationFinished(this.getStoryPattern(), this.getVariablesScope(), this);
	}

	protected void initializePatternParts() throws SDMException
	{
		/*
		 * Split the story pattern into pattern parts.
		 */
		final Collection<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> patternParts = this
				.createPatternParts();

		/*
		 * Check each pattern part.
		 */
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : patternParts)
		{
			/*
			 * add pattern part to uncheckedPatternParts
			 */
			this.uncheckedPatternParts.add(patternPart);

			/*
			 * Maintain the spoToPatternParts map. This is map is needed to
			 * analyze overlapping pattern parts.
			 */
			for (final StoryPatternObject spo : patternPart.getStoryPatternObjects())
			{
				List<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> list = this.spoToPatternPartsMap.get(spo);

				if (list == null)
				{
					list = new ArrayList<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();
					this.spoToPatternPartsMap.put(spo, list);
				}

				list.add(patternPart);

				/*
				 * add story pattern object to set of unbound SPO
				 */
				this.unboundSPO.add(spo);

				/*
				 * create entry list in matching history
				 */
				if (!this.matchingHistory.containsKey(spo))
				{
					this.matchingHistory.put(spo, new HashSet<Object>());
				}
			}
		}
	}

	@Override
	public boolean findNextMatch() throws SDMException
	{
		this.getNotificationEmitter().storyPatternMatchingStarted(this.getStoryPattern(), this.getVariablesScope(), this);

		/*
		 * create a clone of the current variable scope
		 */
		final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> mainVariableScope = this
				.getVariablesScope();

		@SuppressWarnings("unchecked")
		final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> workingVariableScope = new VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>(
				this.getNotificationEmitter(), mainVariableScope, Collections.EMPTY_MAP);

		this.setVariablesScope(workingVariableScope);

		/*
		 * If the matching stack is not empty, a match has already been found in
		 * a previous run. Roll back the last matchPatternPartTransaction so a
		 * new match can be found. This is the case for for-each nodes after the
		 * first iteration.
		 */
		boolean secondRun = false; 
		if (!this.matchingStack.isEmpty())
		{
			this.rollBackLastMatchPatternPartTransaction();
			secondRun = true;
		}

		/*
		 * Also check if all elements on the stack are still valid. This is also
		 * necessary for for-each nodes.
		 */
		this.rollBackInvalidStackElements();

		/*
		 * Analyze all story pattern objects
		 */
		if (this.analyzeStoryPatternObjects() && this.checkAllUncheckedPatternParts() && !(this.uncheckedPatternParts.size() == 0 && secondRun) && this.findNextMatchForPattern())
		{
			/*
			 * if match found merge working variableScope into mainVariableScope
			 */
			this.getVariablesScope().mergeIntoParentScope();

			this.setVariablesScope(mainVariableScope);

			/*
			 * discard all match states, modifications to the instance model
			 * performed afterwards would invalidate them.
			 */
			this.patternPartMatchStates.clear();

			this.getNotificationEmitter().storyPatternMatchingSuccessful(this.getStoryPattern(), this.getVariablesScope(), this);

			return true;
		}
		else
		{
			this.setVariablesScope(mainVariableScope);

			this.getNotificationEmitter().storyPatternMatchingFailed(this.getStoryPattern(), this.getVariablesScope(), this);

			return false;
		}

	}

	/**
	 * Analyzes all story pattern objects. Bound and maybe bound objects are
	 * checked and sorted into the appropriate lists. Assignment expressions are
	 * also handled.
	 * 
	 * @return false if there can be no match for this pattern, true otherwise.
	 * @throws SDMException
	 */
	protected boolean analyzeStoryPatternObjects() throws SDMException
	{
		/*
		 * analyze all story pattern objects
		 */
		for (final StoryPatternObject spo : new HashSet<StoryPatternObject>(this.unboundSPO))
		{
			boolean bound = this.spoFacade.isBound(spo);

			if (!bound && this.spoFacade.isMaybeBound(spo))
			{
				/*
				 * Check if a variable exists with that name
				 */
				bound = this.getVariablesScope().variableExists(this.spoFacade.getName(spo));
			}

			if (bound)
			{
				/*
				 * Check if there is an assignment expression
				 */
				final Expression assignmentExpression = this.spoFacade.getAssignmentExpression(spo);

				Variable<Classifier> variable = null;

				if (assignmentExpression != null)
				{
					/*
					 * Evaluate the expression
					 */
					final Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(
							this.spoFacade.getAssignmentExpression(spo), null, null, this.getVariablesScope());

					if (result != null)
					{
						/*
						 * Create a new variable with the name and classifier of
						 * the story pattern object
						 */
						variable = this.getVariablesScope().createVariable(this.spoFacade.getName(spo), this.spoFacade.getClassifier(spo),
								result.getValue());
					}
					else
					{
						throw new SDMException("The expression '" + this.spoFacade.getAssignmentExpression(spo)
								+ "' could not be evaluated.");
					}
				}
				else
				{
					variable = this.getVariablesScope().getVariable(this.spoFacade.getName(spo));

					if (variable == null)
					{
						/*
						 * There is no variable with that name.
						 */
						this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

						return false;
					}
				}

				/*
				 * Check that the type of the existing variable matches the type
				 * of the story pattern object, check isomorphism condition and
				 * object constraints
				 */
				if ((variable.getValue() != null) && this.checkTypeConformance(this.spoFacade.getClassifier(spo), variable.getValue())
						&& this.checkIsomorphism(variable.getValue()) && this.checkStoryPatternObjectConstraints(spo, variable.getValue()))
				{
					/*
					 * push matchSpoTransaction onto stack
					 */
					final MatchStoryPatternObjectTransaction<StoryPatternObject> matchStoryPatternObjectTransaction = new MatchStoryPatternObjectTransaction<StoryPatternObject>(
							spo, variable.getValue(), this.unboundSPO, this.boundSPO, this.boundInstanceObjects);
					matchStoryPatternObjectTransaction.commit();
					this.matchingStack.push(matchStoryPatternObjectTransaction);

					this.getNotificationEmitter().storyPatternObjectBound(spo, variable.getValue(), this.getVariablesScope(), this);
				}
				else
				{
					/*
					 * Constraints are not satisfied or instance object already
					 * bound.
					 */
					this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

					return false;
				}
			}
			else
			{
				/*
				 * Delete existing variables of unbound story pattern objects
				 */
				this.getVariablesScope().deleteVariable(this.spoFacade.getName(spo));
			}
		}

		return true;
	}

	/**
	 * Checks all elements of the matching stack. If a check fails, this and all
	 * subsequent elements of the stack are rolled back so that only elements
	 * with successful checks are left on the stack.
	 * 
	 * @return false if there can be no match for this pattern, true otherwise.
	 * @throws SDMException
	 */
	@SuppressWarnings("unchecked")
	protected void rollBackInvalidStackElements() throws SDMException
	{
		for (final MatchTransaction matchTransaction : this.matchingStack)
		{
			if (matchTransaction instanceof MatchStoryPatternObjectTransaction)
			{
				final MatchStoryPatternObjectTransaction<StoryPatternObject> mt = (MatchStoryPatternObjectTransaction<StoryPatternObject>) matchTransaction;

				final Variable<Classifier> variable = this.getVariablesScope().getVariable(
						this.spoFacade.getName(mt.getStoryPatternObject()));

				/*
				 * Check that the variable still exists, check that the instance
				 * object of the match transaction is the same as the variable's
				 * value, check isomorphism, check that object constraints still
				 * hold
				 */
				if ((variable == null)
						|| !((variable.getValue() == mt.getInstanceObject()) && this.checkStoryPatternObjectConstraints(
								mt.getStoryPatternObject(), mt.getInstanceObject())))
				{
					/*
					 * roll back before matchTransaction
					 */
					this.rollBack(matchTransaction);

					/*
					 * roll back before the last match pattern part transaction,
					 * so this object can be bound again. If there is no match
					 * pattern part transaction before this transaction, the
					 * complete stack is rolled back. This can happen if a bound
					 * story pattern object is no longer bound to the same
					 * instance object.
					 */
					this.rollBackLastMatchPatternPartTransaction();

					break;
				}
			}
			else if ((matchTransaction instanceof MatchPatternPartTransaction) || (matchTransaction instanceof CheckPatternPartTransaction))
			{
				final PatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression> mt = (PatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression>) matchTransaction;

				boolean variablesExist = true;

				/*
				 * first, we must check if there is are variable for each SPO of
				 * this pattern part. Otherwise, the check may throw an
				 * exception.
				 */
				for (final StoryPatternObject spo : mt.getPatternPart().getStoryPatternObjects())
				{
					if (!this.getVariablesScope().variableExists(this.spoFacade.getName(spo)))
					{
						variablesExist = false;
						break;
					}
				}

				/*
				 * Check the pattern part
				 */
				if (!variablesExist || (mt.getPatternPart().check() != ECheckResult.OK))
				{
					/*
					 * roll back before match transaction
					 */
					this.rollBack(matchTransaction);

					/*
					 * if this is not a match pattern part transaction, roll
					 * back to the last match pattern part transaction
					 */
					if (!(matchTransaction instanceof MatchPatternPartTransaction))
					{
						this.rollBackLastMatchPatternPartTransaction();
					}

					break;
				}
			}
			else
			{
				throw new UnsupportedOperationException();
			}
		}
	}

	protected boolean findNextMatchForPattern() throws SDMException
	{
		boolean match = true;

		final MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> matchingStrategy = this
				.getMatchingStrategy();

		do
		{
			PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> nextPatternPart;

			while ((nextPatternPart = matchingStrategy.getNextPatternPartForMatching(this.uncheckedPatternParts)) != null)
			{
				/*
				 * Commit transaction
				 */
				final MatchPatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression> matchPatternPartTransaction = new MatchPatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression>(
						nextPatternPart, this.uncheckedPatternParts, this.checkedPatternParts);
				matchPatternPartTransaction.commit();
				this.matchingStack.push(matchPatternPartTransaction);

				/*
				 * Get match state for this pattern part
				 */
				MatchState matchState = this.patternPartMatchStates.get(nextPatternPart);

				if (matchState == null)
				{
					matchState = nextPatternPart.createMatchState();
					this.patternPartMatchStates.put(nextPatternPart, matchState);
				}

				/*
				 * search for a match of this pattern part
				 */
				match = nextPatternPart.match(matchState);

				switch (nextPatternPart.getMatchType())
				{
					case MANDATORY:
						/*
						 * do nothing else
						 */
						break;

					case OPTIONAL:
						/*
						 * In case of optional pattern parts, we do not care
						 * whether a match was found or not.
						 */
						match = true;
						break;

				// case NEGATIVE:
				/*
				 * Invert match, so the matching process continues if no match
				 * was found. Note: If a match was found, a corresponding
				 * variable was likely created. However, this is rolled back
				 * subsequently.
				 */
				// match = !match;
				// break;
				}

				if (!match)
				{
					this.patternPartMatchStates.remove(nextPatternPart);

					/*
					 * roll back before matchPatternPartTransaction
					 */
					this.rollBack(matchPatternPartTransaction);

					/*
					 * roll back before last matchPatternPartTransaction
					 */
					this.rollBackLastMatchPatternPartTransaction();

					if (this.matchingStack.isEmpty())
					{
						break;
					}
				}
			}

			/*
			 * check constraints of the whole story pattern
			 */
			if (match)
			{
				match = this.checkStoryPatternConstraints();

				if (!match)
				{
					/*
					 * roll back before last matchPatternPartTransaction
					 */
					this.rollBackLastMatchPatternPartTransaction();
				}
			}
		}
		while (!this.matchingStack.isEmpty() && !match);

		return match;
	}

	/**
	 * Check if the constraints defined on a story pattern object are satisfied
	 * by instanceObject.
	 * 
	 * @param spo
	 * @param instanceObject
	 * @return
	 * @throws SDMException
	 */
	public boolean checkStoryPatternObjectConstraints(final StoryPatternObject spo, final Object instanceObject) throws SDMException
	{
		assert spo != null;

		for (final Expression constraint : this.spoFacade.getConstraints(spo))
		{
			final Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(constraint,
					this.spoFacade.getClassifier(spo), instanceObject, this.getVariablesScope());

			if ((Boolean) result.getValue())
			{
				this.getNotificationEmitter().storyPatternObjectConstraintHolds(constraint, spo, this.getVariablesScope(), this);
			}
			else
			{
				this.getNotificationEmitter().storyPatternObjectConstraintViolated(constraint, spo, this.getVariablesScope(), this);

				return false;
			}
		}

		return true;
	}

	/**
	 * Check constraints of the overall story pattern. Returns true if all
	 * constraints are satisfied, false otherwise.
	 * 
	 * @return
	 * @throws SDMException
	 */
	protected boolean checkStoryPatternConstraints() throws SDMException
	{
		for (final Expression constraint : this.spFacade.getConstraints(this.getStoryPattern()))
		{
			final Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(constraint, null, null,
					this.getVariablesScope());

			if (result.getValue() != Boolean.TRUE)
			{
				this.getNotificationEmitter().storyPatternConstraintViolated(constraint, this.getStoryPattern(), this.getVariablesScope(),
						this);

				return false;
			}
			else
			{
				this.getNotificationEmitter().storyPatternConstraintHolds(constraint, this.getStoryPattern(), this.getVariablesScope(),
						this);
			}
		}

		return true;
	}

	/**
	 * Check the isomorphism condition.
	 * 
	 * @param instanceObject
	 * @return true if instanceObject is not already bound to another story
	 *         pattern object.
	 */
	public boolean checkIsomorphism(final Object instanceObject)
	{
		assert instanceObject != null;

		return !this.boundInstanceObjects.contains(instanceObject);
	}

	/**
	 * 
	 * @param classifier
	 * @param instanceObject
	 * @return true if instanceObject is an instance of the specified
	 *         classifier.
	 */
	public boolean checkTypeConformance(final Classifier classifier, final Object instanceObject)
	{
		assert classifier != null;
		assert instanceObject != null;

		return this.classifierFacade.isInstance(classifier, instanceObject);
	}

	/**
	 * Checks if the story pattern object was already bound to instanceObject.
	 * If so, false is returned.
	 * 
	 * @param storyPatternObject
	 * @param instanceObject
	 * @return
	 */
	public boolean checkHistory(final StoryPatternObject storyPatternObject, final Object instanceObject)
	{
		assert storyPatternObject != null;
		assert instanceObject != null;

		return !this.matchingHistory.get(storyPatternObject).contains(instanceObject);
	}

	/**
	 * Tries to match the specified story pattern object to instanceObject. Type
	 * compatibility, isomorphism and constraints are checked, as well as all
	 * unchecked pattern parts that contain this story pattern object. If these
	 * conditions are not satisfied, false is returned. Otherwise,
	 * storyPatternObject is matched to instanceObject, a corresponding
	 * matchStoryPatternObjectTransaction is committed and pushed on the stack,
	 * and true is returned.
	 * 
	 * @param storyPatternObject
	 * @param instanceObject
	 * @return
	 * @throws SDMException
	 */
	public boolean matchStoryPatternObject(final StoryPatternObject storyPatternObject, final Object instanceObject) throws SDMException
	{
		assert storyPatternObject != null;

		assert this.unboundSPO.contains(storyPatternObject);
		assert !this.boundSPO.contains(storyPatternObject);

		final int stackSize = this.matchingStack.size();

		if ((instanceObject != null) && this.checkIsomorphism(instanceObject)
				&& this.checkTypeConformance(this.spoFacade.getClassifier(storyPatternObject), instanceObject)
				&& this.checkHistory(storyPatternObject, instanceObject))
		{
			/*
			 * push matchSpoTransaction onto stack
			 */
			final MatchStoryPatternObjectTransaction<StoryPatternObject> matchStoryPatternObjectTransaction = new MatchStoryPatternObjectTransaction<StoryPatternObject>(
					storyPatternObject, instanceObject, this.unboundSPO, this.boundSPO, this.boundInstanceObjects);
			matchStoryPatternObjectTransaction.commit();
			this.matchingStack.push(matchStoryPatternObjectTransaction);

			/*
			 * update matching history
			 */
			this.matchingHistory.get(storyPatternObject).add(instanceObject);

			/*
			 * create variable
			 */
			this.getVariablesScope().createVariable(this.spoFacade.getName(storyPatternObject),
					this.spoFacade.getClassifier(storyPatternObject), instanceObject);

			if (this.checkUncheckedPatternParts(storyPatternObject)
					&& this.checkStoryPatternObjectConstraints(storyPatternObject, instanceObject))
			{
				return true;
			}
			else
			{
				/*
				 * roll back
				 */
				this.rollBack(matchStoryPatternObjectTransaction);

				assert stackSize == this.matchingStack.size();

				return false;
			}
		}
		else
		{
			assert stackSize == this.matchingStack.size();
			return false;
		}
	}

	/**
	 * Rolls back all match transactions on the stack until the specified match
	 * transaction has been rolled back.
	 * 
	 * @param matchTransaction
	 */
	public void rollBack(final MatchTransaction matchTransaction)
	{
		assert matchTransaction != null;

		MatchTransaction mt = null;

		while (!this.matchingStack.isEmpty() && (mt != matchTransaction))
		{
			mt = this.matchingStack.pop();

			if (mt instanceof MatchStoryPatternObjectTransaction)
			{
				@SuppressWarnings("unchecked")
				final MatchStoryPatternObjectTransaction<StoryPatternObject> mspot = (MatchStoryPatternObjectTransaction<StoryPatternObject>) mt;

				/*
				 * Delete the corresponding variable from the current variable
				 * scope but not its parent scope. If the variable only exists
				 * in the parent scope, it is not deleted.
				 */
				this.getVariablesScope().deleteVariable(this.spoFacade.getName(mspot.getStoryPatternObject()));

				this.getNotificationEmitter().storyPatternObjectBindingRevoked(mspot.getStoryPatternObject(), mspot.getInstanceObject(),
						this.getVariablesScope(), this);

				/*
				 * Delete the matching history of all other unbound story
				 * pattern objects. This has to be done before rolling back this
				 * transaction so that the current story pattern object is not
				 * yet contained in unboundSPO.
				 */
				for (final StoryPatternObject s : this.unboundSPO)
				{
					this.matchingHistory.get(s).clear();
				}
			}

			mt.rollBack();
		}
	}

	/**
	 * Rolls back all match transactions on the matching stack until the last
	 * MatchPatternPartTransaction, which is also rolled back.
	 */
	public void rollBackLastMatchPatternPartTransaction()
	{
		for (int i = this.matchingStack.size() - 1; i >= 0; i--)
		{
			final MatchTransaction mt = this.matchingStack.get(i);

			this.rollBack(mt);

			if (mt instanceof MatchPatternPartTransaction)
			{
				return;
			}
		}

		/*
		 * There is no match pattern part transaction left on the stack, roll
		 * back the complete stack.
		 */
		if (!this.matchingStack.isEmpty())
		{
			this.rollBack(this.matchingStack.get(0));
		}
	}

	/**
	 * Rolls back the last match transaction on the matching stack.
	 */
	public void rollBackLastMatchTransaction()
	{
		this.rollBack(this.matchingStack.peek());
	}

	/**
	 * Roll back all match transactions on the matching stack up to the last
	 * MatchStoryPatternObjectTransaction.
	 */
	public void rollBackLastMatchStoryPatternObjectTransaction()
	{
		while (!(this.matchingStack.peek() instanceof MatchStoryPatternObjectTransaction<?>))
		{
			this.rollBack(this.matchingStack.peek());
		}

		this.rollBack(this.matchingStack.peek());
	}

	/**
	 * Checks the pattern part. Check result indicates whether the pattern part
	 * matches (ECheckResult.OK) or not (ECheckResult.FAIL), or whether this
	 * cannot be checked at the moment (ECheckResult.UNKNOWN). If the check is
	 * OK, an appropriate transaction is put on the stack.
	 * 
	 * @param patternPart
	 * @return
	 * @throws SDMException
	 */
	protected ECheckResult checkPatternPart(final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart)
			throws SDMException
	{
		assert patternPart != null;

		ECheckResult result = ECheckResult.OK;

		result = patternPart.check();

		/*
		 * If this is a negative pattern part, invert the result. If this is an
		 * optional pattern part and the check result is FAIL, change it to OK.
		 */
		switch (patternPart.getMatchType())
		{
		// case NEGATIVE:
		// {
		// switch (result)
		// {
		// case OK:
		// result = ECheckResult.FAIL;
		// break;
		//
		// case FAIL:
		// result = ECheckResult.OK;
		// break;
		// default:
		// break;
		// }
		// break;
		// }
			case OPTIONAL:
			{
				switch (result)
				{
					case OK:
					case UNKNOWN:
						break;
					case FAIL:
						result = ECheckResult.OK;
						break;
				}
			}
			default:
				break;
		}

		if (result == ECheckResult.OK)
		{
			final CheckPatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression> checkPatternPartTransaction = new CheckPatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression>(
					patternPart, this.uncheckedPatternParts, this.checkedPatternParts);
			checkPatternPartTransaction.commit();

			this.matchingStack.push(checkPatternPartTransaction);
		}

		return result;
	}

	/**
	 * Checks all unchecked pattern parts that contain the specified story
	 * pattern object. For successfully checked pattern parts, an appropriate
	 * transaction is put on the stack. If a check fails, false is returned.
	 * Checks with result UNKOWN are ignored. If no check fails, true is
	 * returned.
	 * 
	 * @return
	 * @throws SDMException
	 */
	protected boolean checkUncheckedPatternParts(final StoryPatternObject storyPatternObject) throws SDMException
	{
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.spoToPatternPartsMap
				.get(storyPatternObject))
		{
			if (this.uncheckedPatternParts.contains(patternPart) && (this.checkPatternPart(patternPart) == ECheckResult.FAIL))
			{
				return false;
			}
		}

		return true;
	}

	/**
	 * Checks all unchecked pattern parts of the story pattern. For successfully
	 * checked pattern parts, an appropriate transaction is put on the stack. If
	 * a check fails, false is returned. Checks with result UNKOWN are ignored.
	 * If no check fails, true is returned.
	 * 
	 * @return
	 * @throws SDMException
	 */
	protected boolean checkAllUncheckedPatternParts() throws SDMException
	{
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : new ArrayList<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>(
				this.uncheckedPatternParts))
		{
			if (this.checkPatternPart(patternPart) == ECheckResult.FAIL)
			{
				return false;
			}
		}

		return true;
	}

	/**
	 * Returns true if the specified story pattern object is already bound to an
	 * instance object.
	 * 
	 * @param source
	 * @return
	 */
	public boolean isBound(final StoryPatternObject storyPatternObject)
	{
		return this.boundSPO.contains(storyPatternObject);
	}

	/**
	 * Returns the instance object for the specified story pattern object. The
	 * story pattern object must already be bound.
	 * 
	 * @param storyPatternObject
	 * @return
	 */
	public Object getInstanceObject(final StoryPatternObject storyPatternObject)
	{
		assert this.getVariablesScope().variableExists(this.spoFacade.getName(storyPatternObject));

		return this.getVariablesScope().getVariable(this.spoFacade.getName(storyPatternObject)).getValue();
	}

	@Override
	public void applyMatch() throws SDMException
	{
		this.getNotificationEmitter().storyPatternApplicationStarted(this.getStoryPattern(), this.getVariablesScope(), this);

		/*
		 * First, calculate the values of attribute assignments. This is
		 * necessary to allow to reference deleted objects in assignments.
		 */
		final Collection<AttributeAssignmentTuple> assignments = this.calculateNewAttributeValues(this.spFacade.getStoryPatternObjects(this
				.getStoryPattern()));

		/*
		 * Delete objects
		 */
		this.deleteElements();

		/*
		 * Create new objects
		 */
		this.createElements();

		/*
		 * Set new attribute values
		 */
		this.assignAttributeValues(assignments);

		this.getNotificationEmitter().storyPatternApplicationFinished(this.getStoryPattern(), this.getVariablesScope(), this);
	}

	/**
	 * Helper class to store information about which attribute must be assigned
	 * which value.
	 */
	protected class AttributeAssignmentTuple
	{
		public StoryPatternObject	storyPatternObject;
		public Feature				feature;
		public Object				newValue;
	}

	/**
	 * Calculate the new values of attribute assignments.
	 * 
	 * @param storyPatternObjects
	 * @param variablesScope
	 * @return
	 * @throws SDMException
	 */
	protected Collection<AttributeAssignmentTuple> calculateNewAttributeValues(final Collection<StoryPatternObject> storyPatternObjects)
			throws SDMException
	{
		final Collection<AttributeAssignmentTuple> returnValues = new LinkedList<AttributeAssignmentTuple>();

		for (final StoryPatternObject spo : storyPatternObjects)
		{
			final Map<Feature, Expression> map = this.spoFacade.getAttributeAssignments(spo);

			if (map != null)
			{
				for (final Entry<Feature, Expression> entry : map.entrySet())
				{
					final Variable<Classifier> spoVariable = this.getVariablesScope().getVariable(this.spoFacade.getName(spo));

					assert (spoVariable != null) || this.spoFacade.isCreate(spo);

					Variable<Classifier> attributeValueVariable = null;

					if (spoVariable == null)
					{
						attributeValueVariable = this.getExpressionInterpreterManager().evaluateExpression(entry.getValue(), null, null,
								this.getVariablesScope());
					}
					else
					{
						attributeValueVariable = this.getExpressionInterpreterManager().evaluateExpression(entry.getValue(),
								this.spoFacade.getClassifier(spo), spoVariable.getValue(), this.getVariablesScope());

					}

					assert attributeValueVariable != null;

					final AttributeAssignmentTuple at = new AttributeAssignmentTuple();
					at.storyPatternObject = spo;
					at.feature = entry.getKey();
					at.newValue = attributeValueVariable.getValue();

					returnValues.add(at);
				}
			}
		}

		return returnValues;
	}

	/**
	 * Delete instance objects marked for destruction.
	 * 
	 * @param variablesScope
	 */
	protected void deleteElements()
	{
		/*
		 * This map contains a mapping of deleted story patterns objects to
		 * their instance objects.
		 */
		final Map<StoryPatternObject, Object> deletedObjects = new HashMap<StoryPatternObject, Object>();

		for (final StoryPatternObject spo : this.boundSPO)
		{
			if (this.spoFacade.isDestroy(spo))
			{
				final Variable<Classifier> variable = this.getVariablesScope().getVariable(this.spoFacade.getName(spo));

				assert variable != null;

				deletedObjects.put(spo, variable.getValue());
			}
		}

		/*
		 * First destroy story pattern objects
		 */
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.checkedPatternParts)
		{
			patternPart.destroyObjects();
		}

		/*
		 * Now destroy links
		 */
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.checkedPatternParts)
		{
			patternPart.destroyLinks(deletedObjects);
		}
	}

	/**
	 * Create new elements.
	 * 
	 * @param variablesScope
	 * @throws SDMException
	 */
	protected void createElements() throws SDMException
	{
		/*
		 * First, delete all variables with names of created objects. If the
		 * story pattern object is set to optional-create and the variable
		 * exists, do not delete it.
		 */
		for (final StoryPatternObject spo : this.spoToPatternPartsMap.keySet())
		{
			if (this.spoFacade.isCreate(spo) && !this.spoFacade.isOptional(spo))
			{
				this.getVariablesScope().deleteVariable(this.spoFacade.getName(spo));
			}
		}

		/*
		 * Now, create objects
		 */
		for (final PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.checkedPatternParts)
		{
			patternPart.createObjects();
			patternPart.createLinks();
		}
	}

	/**
	 * Execute attribute assignments based on the pre-calculated assignment
	 * values.
	 * 
	 * @param assignments
	 * 
	 * @throws SDMException
	 */
	protected void assignAttributeValues(final Collection<AttributeAssignmentTuple> assignments) throws SDMException
	{
		for (final AttributeAssignmentTuple at : assignments)
		{
			/*
			 * Get the instance object
			 */
			final Variable<Classifier> variable = this.getVariablesScope().getVariable(this.spoFacade.getName(at.storyPatternObject));

			assert variable != null;

			this.instanceFacade.setAttributeValue(variable.getValue(), at.feature, at.newValue);

			this.getNotificationEmitter().attributeValueSet(at.storyPatternObject, variable.getValue(), at.feature, at.newValue,
					this.getVariablesScope(), this);
		}
	}

	/**
	 * Create pattern parts for the provided story pattern.
	 * 
	 * @return
	 */
	protected abstract Collection<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> createPatternParts();

}
