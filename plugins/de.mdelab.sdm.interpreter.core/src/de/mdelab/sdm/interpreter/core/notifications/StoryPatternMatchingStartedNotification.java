package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPattern>
 * @param <Classifier>
 */
public class StoryPatternMatchingStartedNotification<StoryPattern, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPattern	storyPattern;

	public StoryPatternMatchingStartedNotification(VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier, StoryPattern storyPattern)
	{
		super(NotificationTypeEnum.STORY_PATTERN_MATCHING_STARTED, variablesScope, notifier);

		assert storyPattern != null;

		this.storyPattern = storyPattern;
	}

	public StoryPattern getStoryPattern()
	{
		return this.storyPattern;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getStoryPattern();
	}
}
