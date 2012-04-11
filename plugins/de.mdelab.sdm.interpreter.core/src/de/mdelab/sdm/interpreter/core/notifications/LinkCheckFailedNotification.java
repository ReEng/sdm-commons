package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 */
public class LinkCheckFailedNotification<StoryPatternObject, StoryPatternLink, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPatternObject	sourceStoryPatternObject;

	private final StoryPatternObject	targetStoryPatternObject;

	private final StoryPatternLink		link;

	private final Object				sourceObject;

	private final Object				targetObject;

	public LinkCheckFailedNotification(VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier,
			StoryPatternObject sourceStoryPatternObject, StoryPatternObject targetStoryPatternObject, StoryPatternLink link,
			Object sourceObject, Object targetObject)
	{
		super(variablesScope, notifier);

		assert sourceStoryPatternObject != null;
		assert targetStoryPatternObject != null;
		assert link != null;
		assert sourceObject != null;
		assert targetObject != null;

		this.sourceStoryPatternObject = sourceStoryPatternObject;
		this.targetStoryPatternObject = targetStoryPatternObject;
		this.link = link;
		this.sourceObject = sourceObject;
		this.targetObject = targetObject;
	}

	public StoryPatternObject getSourceStoryPatternObject()
	{
		return this.sourceStoryPatternObject;
	}

	public StoryPatternObject getTargetStoryPatternObject()
	{
		return this.targetStoryPatternObject;
	}

	public StoryPatternLink getLink()
	{
		return this.link;
	}

	public Object getSourceObject()
	{
		return this.sourceObject;
	}

	public Object getTargetObject()
	{
		return this.targetObject;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getLink();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.LINK_CHECK_FAILED;
	}

}
