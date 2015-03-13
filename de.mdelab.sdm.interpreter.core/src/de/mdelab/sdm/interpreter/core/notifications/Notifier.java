package de.mdelab.sdm.interpreter.core.notifications;

/**
 * Superclass of all notifiers. A notifier can call operations on a
 * NotificationEmitter, which forwards the notification to notification
 * receivers.
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
public abstract class Notifier<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	notificationEmitter;

	public Notifier(
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
	{
		assert notificationEmitter != null;

		this.notificationEmitter = notificationEmitter;
	}

	public NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getNotificationEmitter()
	{
		return this.notificationEmitter;
	}
}