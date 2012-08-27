package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * An instance link was created.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 */
public class InstanceLinkCreatedNotification<StoryPatternObject, StoryPatternLink, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPatternObject	sourceStoryPatternObject;

	private final StoryPatternObject	targetStoryPatternObject;

	private final StoryPatternLink		link;

	private final Object				sourceObject;

	private final Object				targetObject;

	public InstanceLinkCreatedNotification(
			VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier,
			StoryPatternObject sourceStoryPatternObject, StoryPatternObject targetStoryPatternObject, StoryPatternLink link,
			Object sourceObject, Object targetObject)
	{
		super(NotificationTypeEnum.INSTANCE_LINK_CREATED, variablesScope, notifier);

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
}
