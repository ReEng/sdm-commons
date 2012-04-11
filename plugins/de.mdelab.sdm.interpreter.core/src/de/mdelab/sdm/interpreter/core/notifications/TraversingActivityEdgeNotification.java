package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityEdge>
 * @param <Classifier>
 */
public class TraversingActivityEdgeNotification<ActivityEdge, Classifier> extends InterpreterNotification<Classifier>
{
	private final ActivityEdge	activityEdge;

	public TraversingActivityEdgeNotification(VariablesScope<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> notifier, ActivityEdge activityEdge)
	{
		super(variablesScope, notifier);

		assert activityEdge != null;

		this.activityEdge = activityEdge;
	}

	public ActivityEdge getActivityEdge()
	{
		return this.activityEdge;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getActivityEdge();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.TRAVERSING_ACTIVITY_EDGE;
	}
}
