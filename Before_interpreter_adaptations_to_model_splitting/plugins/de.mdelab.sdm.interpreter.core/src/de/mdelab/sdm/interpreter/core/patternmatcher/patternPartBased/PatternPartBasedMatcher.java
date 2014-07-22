package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.facade.IClassifierFacade;
import de.mdelab.sdm.interpreter.core.facade.IInstanceFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternObjectFacade;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.patternmatcher.ETransactionType;
import de.mdelab.sdm.interpreter.core.patternmatcher.MatchingStrategy;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.patternmatcher.Transaction;
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

	private final IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	spoFacade;
	private final IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression>				spFacade;
	private final IClassifierFacade<Classifier>																		classifierFacade;
	private final IInstanceFacade<StoryPatternLink, Classifier, Feature, Expression>								instanceFacade;

	/*
	 * The matching history stores information about which story pattern object
	 * was bound to which instance object.
	 */
	public Map<StoryPatternObject, Set<Object>>																		matchingHistory;

	/*
	 * The story pattern objects that are already bound to an instance object.
	 */
	public Set<StoryPatternObject>																					boundSPO;

	/*
	 * The story pattern objects that where bound when the pattern matcher was
	 * initialized. This is necessary to check in a for-each node, whether a
	 * bound object was deleted.
	 */
	public Set<StoryPatternObject>																					boundSpoAtInit;

	/*
	 * The story pattern objects that are still unbound.
	 */
	public Set<StoryPatternObject>																					unboundSPO;

	/*
	 * Those pattern parts that are already checked.
	 */
	public Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>							checkedPatternParts;

	/*
	 * Those pattern parts that still need to be checked or matched.
	 */
	public Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>							uncheckedPatternParts;

	/*
	 * The instance objects, to which a story pattern object is already bound.
	 * This is necessary to ensure isomorphism.
	 */
	public Set<Object>																								boundInstanceObjects;

	/*
	 * All changes on the above sets are wrapped in transactions. The
	 * transactions are put on this stack. Transactions are rolled back in case
	 * of backtracking.
	 */
	public Stack<Transaction<? extends Object>>																		matchTransactions;

	/*
	 * This map stores information, which story pattern object is contained in
	 * which pattern part. This is needed later on to find overlapping pattern
	 * parts.
	 */
	public Map<StoryPatternObject, List<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>>	spoToPatternPartsMap;

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
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope,
			MatchingStrategy<StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> matchingStrategy,
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> expressionInterpreterManager,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
			throws SDMException
	{
		super(storyPattern, variablesScope, matchingStrategy, facadeFactory, expressionInterpreterManager, notificationEmitter);

		this.spFacade = facadeFactory.getStoryPatternFacade();
		this.spoFacade = facadeFactory.getStoryPatternObjectFacade();
		this.classifierFacade = facadeFactory.getClassifierFacade();
		this.instanceFacade = facadeFactory.getInstanceFacade();

		this.matchingHistory = new HashMap<StoryPatternObject, Set<Object>>();
		this.matchTransactions = new Stack<Transaction<? extends Object>>();

		this.boundSPO = new HashSet<StoryPatternObject>();
		this.boundSpoAtInit = new HashSet<StoryPatternObject>();
		this.unboundSPO = new HashSet<StoryPatternObject>();

		this.checkedPatternParts = new HashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();
		this.uncheckedPatternParts = new HashSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();

		this.boundInstanceObjects = new HashSet<Object>();

		this.spoToPatternPartsMap = new HashMap<StoryPatternObject, List<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>>();

		this.init();
	}

	/**
	 * Initialize the story pattern. The story pattern is split into pattern
	 * parts and the pattern matcher's internal data structures are initialized.
	 * 
	 * @throws SDMException
	 */
	protected void init() throws SDMException
	{
		this.getNotificationEmitter().storyPatternInitializationStarted(this.getStoryPattern(), this.getVariablesScope(), this);

		try
		{
			for (StoryPatternObject spo : this.spFacade.getStoryPatternObjects(this.getStoryPattern()))
			{
				if (!this.initializeStoryPatternObject(spo))
				{
					this.matchTransactions.clear();
					return;
				}
			}

			/*
			 * Initialize the pattern parts of this story pattern.
			 */
			if (!this.initializePatternParts())
			{
				/*
				 * Delete variables created by direct assignments
				 */
				for (StoryPatternObject spo2 : this.boundSPO)
				{
					if (this.spoFacade.getAssignmentExpression(spo2) != null)
					{
						this.getVariablesScope().deleteVariable(this.spoFacade.getName(spo2));
					}
				}

				/*
				 * There can be no match for this story pattern.
				 */
				this.matchTransactions.clear();

				return;
			}

			/*
			 * Remove all previous transactions from the stack. The transactions
			 * are not rolled back.
			 */
			this.matchTransactions.clear();

			/*
			 * Create an initial element for the matcher stack. This indicates
			 * that the pattern matcher was just created.
			 */
			this.matchTransactions.push(new Transaction<Object>(null, null, null, ETransactionType.MATCHER_INITIALIZED));
		}
		finally
		{
			this.getNotificationEmitter().storyPatternInitializationFinished(this.getStoryPattern(), this.getVariablesScope(), this);
		}
	}

	protected boolean initializePatternParts() throws SDMException
	{
		/*
		 * Split the story pattern into pattern parts.
		 */
		Collection<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> patternParts = this.createPatternParts();

		/*
		 * Check each pattern part.
		 */
		for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : patternParts)
		{
			switch (this.checkPatternPart(patternPart))
			{
				case FAIL:
					switch (patternPart.getMatchType())
					{
						case MANDATORY:
							/*
							 * There can be no match for this story pattern.
							 */
							this.matchTransactions.clear();
							return false;

						case OPTIONAL:
						case NEGATIVE:
							/*
							 * Do not care
							 */
					}
					break;

				case UNKNOWN:
					this.uncheckedPatternParts.add(patternPart);
					break;

				case OK:
					switch (patternPart.getMatchType())
					{
						case MANDATORY:
						case OPTIONAL:
							this.commitTransaction(patternPart, this.uncheckedPatternParts, this.checkedPatternParts,
									ETransactionType.CHECKED_PATTERN_PART);
							break;

						case NEGATIVE:
							/*
							 * There can be no match for this story pattern.
							 */
							this.matchTransactions.clear();
							return false;
					}
			}

			/*
			 * Maintain the spoToPatternParts map. This is map is needed to
			 * analyze overlapping pattern parts.
			 */
			for (StoryPatternObject spo : patternPart.getStoryPatternObjects())
			{
				List<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> list = this.spoToPatternPartsMap.get(spo);

				if (list == null)
				{
					list = new ArrayList<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>();
					this.spoToPatternPartsMap.put(spo, list);
				}

				list.add(patternPart);
			}
		}

		return true;
	}

	/**
	 * Create a new transaction, commit it, and put it on the matchTransactions
	 * stack.
	 * 
	 * @param <Type>
	 * @param element
	 * @param sourceSet
	 * @param targetSet
	 * @param transactionType
	 */
	public <Type> void commitTransaction(Type element, Set<Type> sourceSet, Set<Type> targetSet, ETransactionType transactionType)
	{
		Transaction<Type> transaction = new Transaction<Type>(element, sourceSet, targetSet, transactionType);
		transaction.commit();
		this.matchTransactions.push(transaction);
	}

	/**
	 * Initialize a single story pattern object. Depending on its binding state,
	 * it is sorted into boundSPO or unboundSPO. If the story pattern object
	 * cannot be initialized, e.g., if the result of the assignment expression
	 * does not fit to the object's classifier, false is returned.
	 * 
	 * @param spo
	 * @return
	 * @throws SDMException
	 */
	protected boolean initializeStoryPatternObject(StoryPatternObject spo) throws SDMException
	{
		/*
		 * Create a HashSet in the matching history
		 */
		this.matchingHistory.put(spo, new HashSet<Object>());

		/*
		 * Perform checks
		 */
		assert this.spoFacade.getName(spo) != null;
		assert !"".equals(this.spoFacade.getName(spo));
		assert this.spoFacade.getClassifier(spo) != null;

		assert !(this.spoFacade.isBound(spo) && this.spoFacade.isCreate(spo));

		if (this.spoFacade.isBound(spo))
		{
			assert !this.spoFacade.isOptional(spo);
			assert !this.spoFacade.isCreate(spo);

			if (!this.initializeBoundSPO(spo))
			{
				return false;
			}
		}
		/*
		 * Objects that may be bound: Check if there is a variable with this
		 * name. If so, treat the object as a bound object, otherwise treat it
		 * as an unbound object.
		 */
		else if (this.spoFacade.isMaybeBound(spo) && this.getVariablesScope().variableExists(this.spoFacade.getName(spo)))
		{
			assert !this.spoFacade.isOptional(spo);
			assert !this.spoFacade.isCreate(spo);

			if (!this.initializeBoundSPO(spo))
			{
				return false;
			}
		}
		/*
		 * Unbound objects
		 */
		else
		{
			/*
			 * Remove existing variables for these objects, so they can be bound
			 * again
			 */
			this.getVariablesScope().deleteVariable(this.spoFacade.getName(spo));

			/*
			 * If the object is created and optional, we also need to look for a
			 * match.
			 */
			if (!this.spoFacade.isCreate(spo) || this.spoFacade.isOptional(spo))
			{
				this.unboundSPO.add(spo);
			}
		}

		return true;
	}

	/**
	 * Initialize a bound story pattern object. If there is an assignment
	 * expression, it is evaluated. Otherwise, the existence of the variable is
	 * checked. If the story pattern object cannot be initialized, e.g. because
	 * the result of the assignment expression does not fit to the story pattern
	 * object's classifier, false is returned.
	 * 
	 * @param spo
	 * @return
	 * @throws SDMException
	 */
	protected boolean initializeBoundSPO(StoryPatternObject spo) throws SDMException
	{
		Variable<Classifier> variable = null;

		/*
		 * Check if a direct assignment is set
		 */
		if (this.spoFacade.getAssignmentExpression(spo) != null)
		{
			/*
			 * Evaluate the expression
			 */
			Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(
					this.spoFacade.getAssignmentExpression(spo), null, null, this.getVariablesScope());

			/*
			 * Check the result.
			 */
			if (result != null)
			{
				/*
				 * Check if the type of the result of the expression matches the
				 * expected type of the story pattern object.
				 */
				if (this.classifierFacade.isInstance(this.spoFacade.getClassifier(spo), result.getValue())
						&& this.checkStoryPatternObjectConstraints(spo, result.getValue()))
				{
					/*
					 * Create a new variable with the name and classifier of the
					 * story pattern object
					 */
					variable = this.getVariablesScope().createVariable(this.spoFacade.getName(spo), this.spoFacade.getClassifier(spo),
							result.getValue());

					this.getNotificationEmitter().storyPatternObjectBound(spo, result.getValue(), this.getVariablesScope(), this);
				}
				else
				{
					/*
					 * The types do not match or the constraints are not
					 * satisfied.
					 */
					this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

					return false;
				}
			}
			else
			{
				throw new SDMException("The expression '" + this.spoFacade.getAssignmentExpression(spo) + "' could not be evaluated.");
			}

		}
		/*
		 * Find the variable for this story pattern object.
		 */
		else
		{
			variable = this.getVariablesScope().getVariable(this.spoFacade.getName(spo));

			if (variable == null)
			{
				throw new SDMException("The variable '" + this.spoFacade.getName(spo) + "' does not exist.");
			}

			assert variable.getValue() != null;

			/*
			 * Check that the type of the existing variable matches the type of
			 * the story pattern object.
			 */
			if (!this.classifierFacade.isInstance(this.spoFacade.getClassifier(spo), variable.getValue()))
			{
				throw new SDMException("The existing variable '" + this.spoFacade.getName(spo) + "' is of type " + variable.getClassifier()
						+ "'. The story pattern object '" + this.spoFacade.getName(spo) + "' is of type '"
						+ this.spoFacade.getClassifier(spo) + "'.");
			}
			else if (this.checkStoryPatternObjectConstraints(spo, variable.getValue()))
			{
				this.getNotificationEmitter().storyPatternObjectBound(spo, variable.getValue(), this.getVariablesScope(), this);
			}
			else
			{
				/*
				 * Constraints are not satisfied.
				 */
				this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

				return false;
			}
		}

		this.matchingHistory.get(spo).add(variable.getValue());

		this.boundInstanceObjects.add(variable.getValue());
		this.boundSPO.add(spo);
		this.boundSpoAtInit.add(spo);

		return true;
	}

	/**
	 * Check all unchecked pattern parts that contain the provided story pattern
	 * object.
	 * 
	 * @param spo
	 * @return
	 * @throws SDMException
	 */
	public boolean checkUncheckedPatternParts(StoryPatternObject spo) throws SDMException
	{
		assert spo != null;

		for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.spoToPatternPartsMap.get(spo))
		{
			if (this.uncheckedPatternParts.contains(patternPart) && this.checkPatternPart(patternPart) == ECheckResult.FAIL)
			{
				/*
				 * There is no match
				 */
				return false;
			}
		}

		return true;
	}

	/**
	 * Check a pattern part. The result may be OK, FAIL, or UNKNOWN.
	 * 
	 * @param patternPart
	 * @return
	 * @throws SDMException
	 */
	protected ECheckResult checkPatternPart(PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart)
			throws SDMException
	{
		assert patternPart != null;

		ECheckResult result = ECheckResult.OK;

		result = patternPart.check();

		if (result == ECheckResult.OK)
		{
			Transaction<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> transaction = new Transaction<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>(
					patternPart, this.uncheckedPatternParts, this.checkedPatternParts, ETransactionType.CHECKED_PATTERN_PART);
			transaction.commit();

			this.matchTransactions.push(transaction);
		}

		return result;
	}

	/**
	 * Check if the constraints defined on spo are satisfied by instanceObject.
	 * 
	 * @param spo
	 * @param instanceObject
	 * @return
	 * @throws SDMException
	 */
	public boolean checkStoryPatternObjectConstraints(StoryPatternObject spo, Object instanceObject) throws SDMException
	{
		assert spo != null;

		for (Expression constraint : this.spoFacade.getConstraints(spo))
		{
			Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(constraint,
					this.spoFacade.getClassifier(spo), instanceObject, this.getVariablesScope());

			if (result.getValue() != Boolean.TRUE)
			{
				this.getNotificationEmitter().storyPatternObjectConstraintViolated(constraint, spo, this.getVariablesScope(), this);

				return false;
			}
			else
			{
				this.getNotificationEmitter().storyPatternObjectConstraintHolds(constraint, spo, this.getVariablesScope(), this);
			}
		}

		return true;
	}

	@Override
	public boolean findNextMatch() throws SDMException
	{
		this.getNotificationEmitter().storyPatternMatchingStarted(this.getStoryPattern(), this.getVariablesScope(), this);

		if (this.matchStoryPattern())
		{
			this.getNotificationEmitter().storyPatternMatchingSuccessful(this.getStoryPattern(), this.getVariablesScope(), this);

			/*
			 * Inform all pattern parts that the matching phase has finished
			 */
			for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.checkedPatternParts)
			{
				patternPart.matchingPhaseFinished();
			}

			return true;
		}
		else
		{
			this.getNotificationEmitter().storyPatternMatchingFailed(this.getStoryPattern(), this.getVariablesScope(), this);

			return false;
		}
	}

	@Override
	public void applyMatch(
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		this.getNotificationEmitter().storyPatternApplicationStarted(this.getStoryPattern(), this.getVariablesScope(), this);

		/*
		 * First, calculate the values of attribute assignments. This is
		 * necessary to allow to reference deleted objects in assignments.
		 */
		Collection<AttributeAssignmentTuple> assignments = this.calculateNewAttributeValues(
				this.spFacade.getStoryPatternObjects(this.getStoryPattern()), variablesScope);

		/*
		 * Delete objects
		 */
		this.deleteElements(variablesScope);

		/*
		 * Create new objects
		 */
		this.createElements(variablesScope);

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
	 * Execute attribute assignments based on the pre-calculated assignment
	 * values.
	 * 
	 * @param assignments
	 * 
	 * @throws SDMException
	 */
	protected void assignAttributeValues(Collection<AttributeAssignmentTuple> assignments) throws SDMException
	{
		for (AttributeAssignmentTuple at : assignments)
		{
			/*
			 * Get the instance object
			 */
			Variable<Classifier> variable = this.getVariablesScope().getVariable(this.spoFacade.getName(at.storyPatternObject));

			assert variable != null;

			this.instanceFacade.setAttributeValue(variable.getValue(), at.feature, at.newValue);

			this.getNotificationEmitter().attributeValueSet(at.storyPatternObject, variable.getValue(), at.feature, at.newValue,
					this.getVariablesScope(), this);
		}
	}

	/**
	 * Calculate the new values of attribute assignments.
	 * 
	 * @param storyPatternObjects
	 * @param variablesScope
	 * @return
	 * @throws SDMException
	 */
	protected Collection<AttributeAssignmentTuple> calculateNewAttributeValues(
			Collection<StoryPatternObject> storyPatternObjects,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		Collection<AttributeAssignmentTuple> returnValues = new LinkedList<AttributeAssignmentTuple>();

		for (StoryPatternObject spo : storyPatternObjects)
		{
			Map<Feature, Expression> map = this.spoFacade.getAttributeAssignments(spo);

			if (map != null)
			{
				for (Entry<Feature, Expression> entry : map.entrySet())
				{
					Variable<Classifier> spoVariable = variablesScope.getVariable(this.spoFacade.getName(spo));

					assert spoVariable != null || this.spoFacade.isCreate(spo);

					Variable<Classifier> attributeValueVariable = null;

					if (spoVariable == null)
					{
						attributeValueVariable = this.getExpressionInterpreterManager().evaluateExpression(entry.getValue(), null, null,
								variablesScope);
					}
					else
					{
						attributeValueVariable = this.getExpressionInterpreterManager().evaluateExpression(entry.getValue(),
								this.spoFacade.getClassifier(spo), spoVariable.getValue(), variablesScope);

					}

					assert attributeValueVariable != null;

					AttributeAssignmentTuple at = new AttributeAssignmentTuple();
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
	protected void deleteElements(
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
	{
		/*
		 * This map contains a mapping of deleted story patterns objects to
		 * their instance objects.
		 */
		Map<StoryPatternObject, Object> deletedObjects = new HashMap<StoryPatternObject, Object>();

		for (StoryPatternObject spo : this.boundSPO)
		{
			if (this.spoFacade.isDestroy(spo))
			{
				Variable<Classifier> variable = this.getVariablesScope().getVariable(this.spoFacade.getName(spo));

				assert variable != null;

				deletedObjects.put(spo, variable.getValue());
			}
		}

		/*
		 * First destroy story pattern objects
		 */
		for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.checkedPatternParts)
		{
			patternPart.destroyObjects(variablesScope);
		}

		/*
		 * Now destroy links
		 */
		for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : this.checkedPatternParts)
		{
			patternPart.destroyLink(deletedObjects);
		}
	}

	/**
	 * Create new elements.
	 * 
	 * @param variablesScope
	 * @throws SDMException
	 */
	protected void createElements(
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> variablesScope)
			throws SDMException
	{
		/*
		 * First, delete all variables with names of created objects. If the
		 * story pattern object is set to optional-create and the variable
		 * exists, do not delete it.
		 */
		for (StoryPatternObject spo : this.spFacade.getStoryPatternObjects(this.getStoryPattern()))
		{
			if (this.spoFacade.isCreate(spo) && !this.spoFacade.isOptional(spo))
			{
				variablesScope.deleteVariable(this.spoFacade.getName(spo));
			}
		}

		TreeSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> patternParts = new TreeSet<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>(
				new Comparator<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>()
				{

					@Override
					public int compare(PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> p1,
							PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> p2)
					{
						try
						{
							if (p1.getCreationPriority() <= p2.getCreationPriority())
							{
								return -1;
							}
							else
							{
								return 1;
							}
						}
						catch (SDMException e)
						{
							throw new RuntimeException(e);
						}
					}

				});

		patternParts.addAll(this.checkedPatternParts);

		/*
		 * Now, create objects
		 */
		for (PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart : patternParts)
		{
			patternPart.createElements(variablesScope);
		}
	}

	/**
	 * Search for a match of the story pattern. Returns true if a match was
	 * found, false otherwise.
	 * 
	 * @return
	 * @throws SDMException
	 */
	protected boolean matchStoryPattern() throws SDMException
	{
		if (this.matchTransactions.size() == 0)
		{
			/*
			 * All possible matchings have already been found.
			 */
			return false;
		}

		/*
		 * Check that all bound story pattern objects exist
		 */
		for (StoryPatternObject spo : this.boundSpoAtInit)
		{
			if (!this.getVariablesScope().variableExists(this.spoFacade.getName(spo)))
			{
				return false;
			}
		}

		/*
		 * Find new matches
		 */
		while (this.matchStoryPatternInternal(0))
		{
			/*
			 * Check constraints of the whole pattern.
			 */
			if (this.checkStoryPatternConstraints())
			{
				return true;
			}
		}

		return false;
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
		for (Expression constraint : this.spFacade.getConstraints(this.getStoryPattern()))
		{
			Variable<Classifier> result = this.getExpressionInterpreterManager().evaluateExpression(constraint, null, null,
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
	 * Internal matching operation. However, it is public because pattern parts
	 * need to call it. If no match can be found for the remaining unbound story
	 * pattern objects, backtracking is only performed as long as the stack is
	 * larger then stackSize.
	 * 
	 * @param stackSize
	 * @return
	 * @throws SDMException
	 */
	public boolean matchStoryPatternInternal(int stackSize) throws SDMException
	{
		assert stackSize <= this.matchTransactions.size();

		if (this.unboundSPO.isEmpty() && !this.matchTransactions.isEmpty())
		{
			/*
			 * If there are no unbound story pattern objects, roll back to make
			 * the last bound object unbound again.
			 */
			this.rollBackLastMatchingPatternPart();

			this.rollBackInvalidPatternParts();

			if (this.matchTransactions.isEmpty())
			{
				/*
				 * If the matchTransactions are empty, return true. This can
				 * happen if a story pattern does not contain unbound objects.
				 */
				return true;
			}
		}

		if (this.matchTransactions.isEmpty())
		{
			/*
			 * The matcher stack has run empty. There are no more matches for
			 * this story pattern.
			 */
			return false;
		}

		boolean match = false;

		PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> nextPatternPart;

		do
		{
			/*
			 * Get the next pattern part to match
			 */
			while ((nextPatternPart = this.getMatchingStrategy().getNextPatternPartForMatching(this)) != null)
			{
				Transaction<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> transaction = new Transaction<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>>(
						nextPatternPart, this.uncheckedPatternParts, this.checkedPatternParts, ETransactionType.MATCHING_PATTERN_PART);
				transaction.commit();

				this.matchTransactions.push(transaction);

				/*
				 * Match the pattern part
				 */
				match = nextPatternPart.match();

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
					case NEGATIVE:
						/*
						 * Invert match, so the matching process continues if no
						 * match was found.
						 */
						match = !match;
						break;
				}

				if (!match)
				{
					this.rollBackLastMatchingPatternPart();

					break;
				}
			}

			/*
			 * Roll back if no match could be found.
			 */
			if (!match && this.matchTransactions.size() > stackSize)
			{
				this.rollBackLastMatchingPatternPart();
			}
		}
		while (!match && this.matchTransactions.size() > stackSize);

		return match;
	}

	/**
	 * Roll back all transaction on the matchTransactions stack until the most
	 * recent MATCHING_PATTERN_PART transaction was rolled back.
	 * 
	 * @throws SDMException
	 */
	protected void rollBackLastMatchingPatternPart() throws SDMException
	{
		Transaction<? extends Object> transaction;

		do
		{
			transaction = this.popFromMatchTransactions();
		}
		while (transaction.transactionType != ETransactionType.MATCHING_PATTERN_PART && !this.matchTransactions.isEmpty());

	}

	@SuppressWarnings("unchecked")
	protected void rollBackInvalidPatternParts() throws SDMException
	{
		/*
		 * Check all MATCH_PATTERN_PART and CHECK_PATTERN_PART transactions on
		 * the stack.
		 */
		for (int i = 0; i < this.matchTransactions.size(); i++)
		{
			switch (this.matchTransactions.get(i).transactionType)
			{
				case CHECKED_PATTERN_PART:
				case MATCHING_PATTERN_PART:
					if (((PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>) this.matchTransactions.get(i).element)
							.check() != ECheckResult.OK)
					{
						this.rollBack(i);
						return;
					}
			}
		}
	}

	/**
	 * Roll back all transactions until the matchTransactions stack has the size
	 * "size".
	 * 
	 * @param size
	 * @throws SDMException
	 */
	public void rollBack(int size) throws SDMException
	{
		while (this.matchTransactions.size() > size)
		{
			this.popFromMatchTransactions();
		}
	}

	/**
	 * Pop the most recent transaction from the matchTransactions stack and roll
	 * it back.
	 * 
	 * @return
	 * @throws SDMException
	 */
	protected Transaction<? extends Object> popFromMatchTransactions() throws SDMException
	{
		Transaction<? extends Object> transaction = this.matchTransactions.pop();

		if (transaction.transactionType == ETransactionType.SPO_MATCHED)
		{
			/*
			 * If a StoryPatternObject was matched, delete its interpreter
			 * variable and the matching history of all other unbound story
			 * pattern objects
			 */
			@SuppressWarnings("unchecked")
			StoryPatternObject spo = (StoryPatternObject) transaction.element;

			Variable<Classifier> variable = this.getVariablesScope().deleteVariable(this.spoFacade.getName(spo));

			if (variable != null)
			{
				this.getNotificationEmitter().storyPatternObjectBindingRevoked(spo, variable.getValue(), this.getVariablesScope(), this);
			}

			/*
			 * Delete the matching history
			 */
			for (StoryPatternObject s : this.unboundSPO)
			{
				this.matchingHistory.get(s).clear();
			}
		}

		transaction.rollBack();

		return transaction;
	}

	/**
	 * Create pattern parts for the provided story pattern.
	 * 
	 * @return
	 */
	protected abstract Collection<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> createPatternParts();
}
