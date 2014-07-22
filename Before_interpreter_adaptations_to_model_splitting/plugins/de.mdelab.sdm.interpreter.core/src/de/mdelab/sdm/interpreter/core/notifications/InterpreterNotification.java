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

	public InterpreterNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		assert variablesScope != null;
		assert notifier != null;

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

	public abstract Object getMainStoryDiagramElement();

	public abstract NotificationTypeEnum getNotificationType();

}
