package de.mdelab.sdm.interpreter.core.notifications;

import java.util.Map;

import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * Execution of an activity has finished.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <Classifier>
 */
public class ActivityExecutionFinishedNotification<Activity, Classifier> extends InterpreterNotification<Classifier>
{
	private final Activity							activity;

	private final Map<String, Variable<Classifier>>	returnValues;

	public ActivityExecutionFinishedNotification(final VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, final Activity activity,
			final Map<String, Variable<Classifier>> returnValues)
	{
		super(NotificationTypeEnum.ACTIVITY_EXECUTION_FINISHED, variablesScope, notifier);

		assert activity != null;
		assert returnValues != null;

		this.activity = activity;
		this.returnValues = returnValues;
	}

	public Activity getActivity()
	{
		return this.activity;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getActivity();
	}

	public Map<String, Variable<Classifier>> getReturnValues()
	{
		return this.returnValues;
	}
}
