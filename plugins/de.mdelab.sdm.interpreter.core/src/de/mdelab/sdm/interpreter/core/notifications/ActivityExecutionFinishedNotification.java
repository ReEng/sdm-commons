package de.mdelab.sdm.interpreter.core.notifications;

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
	private final Activity	activity;

	public ActivityExecutionFinishedNotification(VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, Activity activity)
	{
		super(variablesScope, notifier);

		assert activity != null;

		this.activity = activity;
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

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.ACTIVITY_EXECUTION_FINISHED;
	}

}
