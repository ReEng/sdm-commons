package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <Classifier>
 */
public class StoryPatternObjectBindingRevokedNotification<StoryPatternObject, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPatternObject	storyPatternObject;

	private final Object				instanceObject;

	public StoryPatternObjectBindingRevokedNotification(VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier, StoryPatternObject storyPatternObject,
			Object instanceObject)
	{
		super(NotificationTypeEnum.STORY_PATTERN_OBJECT_BINDING_REVOKED, variablesScope, notifier);

		assert storyPatternObject != null;
		assert instanceObject != null;

		this.storyPatternObject = storyPatternObject;
		this.instanceObject = instanceObject;
	}

	public StoryPatternObject getStoryPatternObject()
	{
		return this.storyPatternObject;
	}

	public Object getInstanceObject()
	{
		return this.instanceObject;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getStoryPatternObject();
	}
}
