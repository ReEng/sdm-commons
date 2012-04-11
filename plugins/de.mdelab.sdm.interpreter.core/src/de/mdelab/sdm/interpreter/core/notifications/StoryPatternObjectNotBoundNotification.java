package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <Classifier>
 */
public class StoryPatternObjectNotBoundNotification<StoryPatternObject, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPatternObject	storyPatternObject;

	public StoryPatternObjectNotBoundNotification(VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier, StoryPatternObject storyPatternObject)
	{
		super(variablesScope, notifier);

		assert storyPatternObject != null;

		this.storyPatternObject = storyPatternObject;
	}

	public StoryPatternObject getStoryPatternObject()
	{
		return this.storyPatternObject;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getStoryPatternObject();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.STORY_PATTERN_OBJECT_NOT_BOUND;
	}

}
