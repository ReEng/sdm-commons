package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * Execution of an activity node has finished.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <Classifier>
 */
public class ActivityNodeExecutionFinishedNotification<ActivityNode, Classifier> extends InterpreterNotification<Classifier>
{
	private final ActivityNode	activityNode;

	public ActivityNodeExecutionFinishedNotification(VariablesScope<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> notifier, ActivityNode activityNode)
	{
		super(variablesScope, notifier);

		assert activityNode != null;

		this.activityNode = activityNode;
	}

	public ActivityNode getActivityNode()
	{
		return this.activityNode;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getActivityNode();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.ACTIVITY_NODE_EXECUTION_FINISHED;
	}

}
