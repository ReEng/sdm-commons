package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StoryPatternConstraintHoldsNotification<StoryPattern, Classifier, Expression> extends InterpreterNotification<Classifier>
{
	private final Expression	constraint;
	private final StoryPattern	storyPattern;

	public StoryPatternConstraintHoldsNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, Expression constraint, StoryPattern storyPattern)
	{
		super(NotificationTypeEnum.STORY_PATTERN_CONSTRAINT_HOLDS, variablesScope, notifier);

		this.constraint = constraint;
		this.storyPattern = storyPattern;
	}

	public Expression getConstraint()
	{
		return this.constraint;
	}

	public StoryPattern getStoryPattern()
	{
		return this.storyPattern;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.constraint;
	}
}
