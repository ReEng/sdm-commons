package de.mdelab.sdm.interpreter.core.executionTrace;

import java.util.HashSet;
import java.util.Set;

import de.mdelab.sdm.interpreter.core.notifications.InterpreterNotification;
import de.mdelab.sdm.interpreter.core.notifications.NotificationTypeEnum;

/**
 * A profiling filter that filters notifications based on their types. The
 * notification types to be profiled have to be specified in the constructor.
 * Note: For notification types that have a counterpart, e.g.,
 * ACTIVITY_NODE_EXECUTION_STARTED and ACTIVITY_NODE_EXECUTION_FINISHED, the
 * counterpart will always be profiled, too.
 * 
 * @author Stephan
 * 
 * @param <Classifier>
 */
public class TypeBasedProfilingFilter<Classifier> implements ProfilingFilter<Classifier>
{
	private final Set<NotificationTypeEnum>	profiledTypes;

	public TypeBasedProfilingFilter(final NotificationTypeEnum[] profiledTypes)
	{
		this.profiledTypes = new HashSet<NotificationTypeEnum>();

		for (final NotificationTypeEnum type : profiledTypes)
		{
			this.profiledTypes.add(type);

			switch (type)
			{
				case ACTIVITY_EXECUTION_STARTED:
				case ACTIVITY_EXECUTION_FINISHED:
				{
					this.profiledTypes.add(NotificationTypeEnum.ACTIVITY_EXECUTION_STARTED);
					this.profiledTypes.add(NotificationTypeEnum.ACTIVITY_EXECUTION_FINISHED);
					break;
				}
				case ACTIVITY_NODE_EXECUTION_STARTED:
				case ACTIVITY_NODE_EXECUTION_FINISHED:
				{
					this.profiledTypes.add(NotificationTypeEnum.ACTIVITY_NODE_EXECUTION_STARTED);
					this.profiledTypes.add(NotificationTypeEnum.ACTIVITY_NODE_EXECUTION_FINISHED);
					break;
				}
				case STORY_PATTERN_INITIALIZATION_STARTED:
				case STORY_PATTERN_INITIALIZATION_FINISHED:
				{
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_INITIALIZATION_STARTED);
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_INITIALIZATION_FINISHED);
					break;
				}
				case STORY_PATTERN_MATCHING_STARTED:
				case STORY_PATTERN_MATCHING_SUCCESSFUL:
				case STORY_PATTERN_MATCHING_FAILED:
				{
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_MATCHING_STARTED);
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_MATCHING_SUCCESSFUL);
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_MATCHING_FAILED);
					break;
				}
				case STORY_PATTERN_APPLICATION_STARTED:
				case STORY_PATTERN_APPLICATION_FINISHED:
				{
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_APPLICATION_STARTED);
					this.profiledTypes.add(NotificationTypeEnum.STORY_PATTERN_APPLICATION_FINISHED);
					break;
				}
				case EVALUATING_EXPRESSION:
				case EVALUATED_EXPRESSION:
				{
					this.profiledTypes.add(NotificationTypeEnum.EVALUATING_EXPRESSION);
					this.profiledTypes.add(NotificationTypeEnum.EVALUATED_EXPRESSION);
					break;
				}
				default:
					break;
			}
		}
	}

	@Override
	public boolean doProfile(final InterpreterNotification<Classifier> notification)
	{
		return this.profiledTypes.contains(notification.getNotificationType());
	}
}
