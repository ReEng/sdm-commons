package de.mdelab.sdm.interpreter.core.variables;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.notifications.Notifier;

/**
 * A VariablesScope holds a set of variables that are valid in a certain
 * context, e.g. an activity node.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <ActivityNode>
 * @param <ActivityEdge>
 * @param <StoryPattern>
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public class VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		extends
		Notifier<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	public static final String																																INTERNAL_VARIABLE_NAME	= "##internalVariable##";

	private final Map<String, Variable<Classifier>>																											variables;

	private final Map<String, Map<String, List<String>>>																									expressionImports;

	private final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	parentScope;

	@SuppressWarnings("unchecked")
	public VariablesScope(
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
	{
		this(notificationEmitter, null, Collections.EMPTY_MAP);
	}

	public VariablesScope(
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> parentScope,
			Map<String, Map<String, List<String>>> expressionImports)
	{
		super(notificationEmitter);

		this.variables = new HashMap<String, Variable<Classifier>>();
		this.expressionImports = expressionImports;
		this.parentScope = parentScope;
	}

	/**
	 * Retrieves the variable with the specified name. The variable scope
	 * hierarchy is walked upwards.
	 * 
	 * @param name
	 * @return
	 */
	public Variable<Classifier> getVariable(String name)
	{
		Variable<Classifier> variable = this.variables.get(name);

		if (variable == null && this.parentScope != null)
		{
			return this.parentScope.getVariable(name);
		}
		else
		{
			return variable;
		}
	}

	/**
	 * Checks whether the variable with the specified name exists in this
	 * variableScope or its parent variableScope.
	 * 
	 * @param name
	 * @return
	 */
	public boolean variableExists(String name)
	{
		if (this.variables.containsKey(name))
		{
			return true;
		}
		else if (this.parentScope != null)
		{
			return this.parentScope.variableExists(name);
		}
		else
		{
			return false;
		}
	}

	/**
	 * Deletes the specified variable from this variable scope but not its
	 * parent scopes.
	 * 
	 * @param name
	 * @return
	 */
	public Variable<Classifier> deleteVariable(String name)
	{
		Variable<Classifier> variable = this.variables.remove(name);

		if (variable != null)
		{
			getNotificationEmitter().variableDeleted(variable, this);
		}

		return variable;
	}

	/**
	 * Creates a new variable in this variableScope.
	 * 
	 * @param name
	 * @param classifier
	 * @param value
	 * @return
	 */
	public Variable<Classifier> createVariable(String name, Classifier classifier, Object value)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifier != null;

		this.deleteVariable(name);

		Variable<Classifier> variable = new Variable<Classifier>(name, classifier, value);

		this.variables.put(name, variable);

		getNotificationEmitter().variableCreated(variable, this);

		return variable;
	}

	/**
	 * Returns an unmodifiable collection of all variables of this variableScope
	 * and its parent scopes.
	 * 
	 * @return
	 */
	public Collection<Variable<Classifier>> getVariables()
	{
		if (this.parentScope == null)
		{
			return Collections.unmodifiableCollection(this.variables.values());
		}
		else
		{
			LinkedList<Variable<Classifier>> variables = new LinkedList<Variable<Classifier>>(this.variables.values());
			variables.addAll(this.parentScope.getVariables());

			return Collections.unmodifiableCollection(variables);
		}
	}

	public List<String> getExpressionImports(String expressionLanguage, String expressionLanguageVersion)
	{
		assert expressionLanguage != null;
		assert expressionLanguageVersion != null;
		assert !"".equals(expressionLanguage);
		assert !"".equals(expressionLanguageVersion);

		Map<String, List<String>> m1 = this.expressionImports.get(expressionLanguage);

		if (m1 != null)
		{
			List<String> m2 = m1.get(expressionLanguageVersion);

			if (m2 != null)
			{
				return m2;
			}
		}

		return Collections.emptyList();
	}

	/**
	 * Change the value of the variable with the specified name.
	 * 
	 * @param name
	 * @param value
	 */
	public void changeVariableValue(String name, Object value)
	{
		assert this.variableExists(name);

		Variable<Classifier> variable = this.variables.get(name);

		Object oldValue = variable.getValue();

		variable.setValue(value);

		getNotificationEmitter().variableValueChanged(variable, oldValue, this);
	}

	public VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getParentScope()
	{
		return this.parentScope;
	}

	/**
	 * Merges this scope's variables into the parent scope. The variables are
	 * removed from this scope.
	 * 
	 * @throws NullPointerException
	 *             if there is no parent scope
	 */
	public void mergeIntoParentScope() throws NullPointerException
	{
		if (this.parentScope == null)
		{
			throw new NullPointerException();
		}
		else
		{
			for (Variable<Classifier> variable : this.variables.values())
			{
				this.parentScope.variables.put(variable.getName(), variable);
			}

			this.variables.clear();
		}
	}
}
