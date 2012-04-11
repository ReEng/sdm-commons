package de.mdelab.sdm.interpreter.core.variables;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
	public static final String								INTERNAL_VARIABLE_NAME	= "##internalVariable##";

	private final Map<String, Variable<Classifier>>			variables;

	private final Map<String, Map<String, List<String>>>	expressionImports;

	@SuppressWarnings("unchecked")
	public VariablesScope(
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
	{
		this(notificationEmitter, Collections.EMPTY_MAP);
	}

	public VariablesScope(
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter,
			Map<String, Map<String, List<String>>> expressionImports)
	{
		super(notificationEmitter);

		this.variables = new HashMap<String, Variable<Classifier>>();
		this.expressionImports = expressionImports;
	}

	public Variable<Classifier> getVariable(String name)
	{
		return this.variables.get(name);
	}

	public boolean variableExists(String name)
	{
		return this.variables.containsKey(name);
	}

	public Variable<Classifier> deleteVariable(String name)
	{
		Variable<Classifier> variable = this.variables.remove(name);

		if (variable != null)
		{
			this.getNotificationEmitter().variableDeleted(variable, this);
		}

		return variable;
	}

	public Variable<Classifier> createVariable(String name, Classifier classifier, Object value)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifier != null;

		this.deleteVariable(name);

		Variable<Classifier> variable = new Variable<Classifier>(name, classifier, value);

		this.variables.put(name, variable);

		this.getNotificationEmitter().variableCreated(variable, this);

		return variable;
	}

	public Collection<Variable<Classifier>> getVariables()
	{
		return this.variables.values();
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

		this.getNotificationEmitter().variableValueChanged(variable, oldValue, this);
	}
}
