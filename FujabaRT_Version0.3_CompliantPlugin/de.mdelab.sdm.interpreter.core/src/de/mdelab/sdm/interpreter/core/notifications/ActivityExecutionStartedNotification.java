package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * Execution of an activity has started.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <Classifier>
 */
public class ActivityExecutionStartedNotification<Activity, Classifier> extends InterpreterNotification<Classifier>
{
	private final Activity	activity;

	public ActivityExecutionStartedNotification(VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, Activity activity)
	{
		super(NotificationTypeEnum.ACTIVITY_EXECUTION_STARTED, variablesScope, notifier);

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
}
