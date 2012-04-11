package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public class VariableValueChangedNotification<Classifier> extends InterpreterNotification<Classifier>
{

	private final Variable<Classifier>	variable;
	private final Object				oldValue;

	public VariableValueChangedNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Variable<Classifier> variable, Object oldValue)
	{
		super(variablesScope, variablesScope);

		assert variable != null;

		this.variable = variable;
		this.oldValue = oldValue;
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.VARIABLE_VALUE_CHANGED;
	}

	public Variable<Classifier> getVariable()
	{
		return this.variable;
	}

	public Object getOldValue()
	{
		return this.oldValue;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return null;
	}
}
