package de.mdelab.sdm.interpreter.core.notifications;

/**
 * Enumeration of all possible kinds of notifications.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum NotificationTypeEnum
{
	ACTIVITY_EXECUTION_FINISHED,
	ACTIVITY_EXECUTION_STARTED,
	ACTIVITY_NODE_EXECUTION_FINISHED,
	ACTIVITY_NODE_EXECUTION_STARTED,
	ATTRIBUTE_VALUE_SET,
	EVALUATED_EXPRESSION,
	EVALUATING_EXPRESSION,
	INSTANCE_LINK_CREATED,
	INSTANCE_LINK_DESTROYED,
	INSTANCE_OBJECT_CREATED,
	INSTANCE_OBJECT_DESTROYED,
	LINK_CHECK_FAILED,
	LINK_CHECK_SUCCESSFUL,
	STORY_PATTERN_APPLICATION_FINISHED,
	STORY_PATTERN_APPLICATION_STARTED,
	STORY_PATTERN_INITIALIZATION_FINISHED,
	STORY_PATTERN_INITIALIZATION_STARTED,
	STORY_PATTERN_MATCHING_FAILED,
	STORY_PATTERN_MATCHING_STARTED,
	STORY_PATTERN_MATCHING_SUCCESSFUL,
	STORY_PATTERN_OBJECT_BINDING_REVOKED,
	STORY_PATTERN_OBJECT_BOUND,
	STORY_PATTERN_OBJECT_NOT_BOUND,
	TRAVERSING_ACTIVITY_EDGE,
	TRAVERSING_LINK,
	VARIABLE_CREATED,
	VARIABLE_DELETED,
	VARIABLE_VALUE_CHANGED,
	STORY_PATTERN_CONSTRAINT_HOLDS,
	STORY_PATTERN_CONSTRAINT_VIOLATED,
	STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS,
	STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED
}
