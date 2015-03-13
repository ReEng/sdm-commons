package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * This is the super class of all interpreter notifications.
 * InterpreterNotifications are emitted by a NotificationEmitter.
 * NotificationReceivers can be attached to a NotificationEmitter to receive
 * notifications.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public abstract class InterpreterNotification<Classifier>
{
	private final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?>	variablesScope;

	private final Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?>			notifier;

	private final NotificationTypeEnum									notificationType;

	public InterpreterNotification(NotificationTypeEnum notificationType,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope, Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		assert notificationType != null;
		assert variablesScope != null;
		assert notifier != null;

		this.notificationType = notificationType;
		this.variablesScope = variablesScope;
		this.notifier = notifier;
	}

	public VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> getVariablesScope()
	{
		return this.variablesScope;
	}

	public Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?> getNotifier()
	{
		return this.notifier;
	}

	/**
	 * 
	 * @return The type of this notification.
	 */
	public NotificationTypeEnum getNotificationType()
	{
		return this.notificationType;
	}

	/**
	 * 
	 * @return The main story diagram that was executed.
	 */
	public abstract Object getMainStoryDiagramElement();
}
