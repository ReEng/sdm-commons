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
public class TraversingLinkNotification<StoryPatternObject, StoryPatternLink, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPatternObject	sourceStoryPatternObject;

	private final StoryPatternObject	targetStoryPatternObject;

	private final StoryPatternLink		link;

	private final Object				sourceObject;

	public TraversingLinkNotification(VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier,
			StoryPatternObject sourceStoryPatternObject, StoryPatternObject targetStoryPatternObject, StoryPatternLink link,
			Object sourceObject)
	{
		super(variablesScope, notifier);

		assert sourceStoryPatternObject != null;
		assert targetStoryPatternObject != null;
		assert link != null;
		assert sourceObject != null;

		this.sourceStoryPatternObject = sourceStoryPatternObject;
		this.targetStoryPatternObject = targetStoryPatternObject;
		this.link = link;
		this.sourceObject = sourceObject;
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

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getLink();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.TRAVERSING_LINK;
	}
}
