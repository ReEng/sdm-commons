package de.mdelab.sdm.interpreter.core.notifications;

import java.util.HashSet;
import java.util.Set;

import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * The NotificationEmitter can be attached to one or more notifiers, which call
 * one of the NotificationEmitter's operations. The NotificationEmitter creates
 * an appropriate InterpreterNotification and sends it to all attached
 * NotificationReceivers.
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
public class NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private final Set<NotificationReceiver<Classifier>>	notificationReceivers;

	public NotificationEmitter()
	{
		this.notificationReceivers = new HashSet<NotificationReceiver<Classifier>>();
	}

	public void addNotificationReceiver(NotificationReceiver<Classifier> notificationReceiver)
	{
		this.notificationReceivers.add(notificationReceiver);
	}

	public void removeNotificationReceiver(NotificationReceiver<Classifier> notificationReceiver)
	{
		this.notificationReceivers.remove(notificationReceiver);
	}

	protected void sendNotifications(InterpreterNotification<Classifier> notification)
	{
		for (NotificationReceiver<Classifier> notificationReceiver : this.notificationReceivers)
		{
			notificationReceiver.notifyChanged(notification);
		}
	}

	public void storyPatternObjectBound(StoryPatternObject storyPatternObject, Object instanceObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectBoundNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject, instanceObject));
		}
	}

	public void storyPatternObjectNotBound(StoryPatternObject storyPatternObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectNotBoundNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject));
		}
	}

	public void storyPatternObjectBindingRevoked(StoryPatternObject storyPatternObject, Object instanceObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectBindingRevokedNotification<StoryPatternObject, Classifier>(variablesScope,
					notifier, storyPatternObject, instanceObject));
		}
	}

	public void linkCheckSuccessful(StoryPatternObject sourceStoryPatternObject, Object sourceObject, StoryPatternLink link,
			StoryPatternObject targetStoryPatternObject, Object targetObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new LinkCheckSuccessfulNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void linkCheckFailed(StoryPatternObject sourceStoryPatternObject, Object sourceObject, StoryPatternLink link,
			StoryPatternObject targetStoryPatternObject, Object targetObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new LinkCheckFailedNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void storyPatternInitializationStarted(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternInitializationStartedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternInitializationFinished(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternInitializationFinishedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternMatchingStarted(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternMatchingStartedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternMatchingSuccessful(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternMatchingSuccessfulNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternMatchingFailed(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternMatchingFailedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternApplicationStarted(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternApplicationStartedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternApplicationFinished(StoryPattern storyPattern,
			VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternApplicationFinishedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void instanceObjectCreated(StoryPatternObject storyPatternObject, Object instanceObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceObjectCreatedNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject, instanceObject));
		}
	}

	public void instanceObjectDestroyed(StoryPatternObject storyPatternObject, Object instanceObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceObjectCreatedNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject, instanceObject));
		}
	}

	public void instanceLinkCreated(StoryPatternObject sourceStoryPatternObject, Object sourceObject, StoryPatternLink link,
			StoryPatternObject targetStoryPatternObject, Object targetObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceLinkCreatedNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void instanceLinkDestroyed(StoryPatternObject sourceStoryPatternObject, Object sourceObject, StoryPatternLink link,
			StoryPatternObject targetStoryPatternObject, Object targetObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceLinkDestroyedNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void traversingLink(StoryPatternLink link, StoryPatternObject sourceStoryPatternObject, Object sourceObject,
			StoryPatternObject targetStoryPatternObject,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new TraversingLinkNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject));
		}
	}

	public void attributeValueSet(StoryPatternObject storyPatternObject, Object instanceObject, Feature feature, Object featureValue,
			VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, Feature, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, Feature, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new AttributeValueSetNotification<StoryPatternObject, Classifier, Feature>(variablesScope, notifier,
					storyPatternObject, instanceObject, feature, featureValue));
		}
	}

	public void evaluatingExpression(Expression expression, VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new EvaluatingExpressionNotification<Classifier, Expression>(variablesScope, notifier, expression));
		}
	}

	public void evaluatedExpression(Expression expression, Object result,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new EvaluatedExpressionNotification<Classifier, Expression>(variablesScope, notifier, expression, result));
		}
	}

	public void activityExecutionStarted(Activity activity, VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityExecutionStartedNotification<Activity, Classifier>(variablesScope, notifier, activity));
		}
	}

	public void activityExecutionFinished(Activity activity, VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityExecutionFinishedNotification<Activity, Classifier>(variablesScope, notifier, activity));
		}
	}

	public void activityNodeExecutionStarted(ActivityNode activityNode,
			VariablesScope<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityNodeExecutionStartedNotification<ActivityNode, Classifier>(variablesScope, notifier,
					activityNode));
		}
	}

	public void activityNodeExecutionFinished(ActivityNode activityNode,
			VariablesScope<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityNodeExecutionFinishedNotification<ActivityNode, Classifier>(variablesScope, notifier,
					activityNode));
		}
	}

	public void traversingActivityEdge(ActivityEdge activityEdge,
			VariablesScope<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new TraversingActivityEdgeNotification<ActivityEdge, Classifier>(variablesScope, notifier, activityEdge));
		}
	}

	public void variableCreated(Variable<Classifier> variable, VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new VariableCreatedNotification<Classifier>(variablesScope, variable));
		}
	}

	public void variableDeleted(Variable<Classifier> variable, VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new VariableDeletedNotification<Classifier>(variablesScope, variable));
		}
	}

	public void variableValueChanged(Variable<Classifier> variable, Object oldValue,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new VariableValueChangedNotification<Classifier>(variablesScope, variable, oldValue));
		}
	}

	public void storyPatternConstraintHolds(Expression constraint, StoryPattern storyPattern,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternConstraintHoldsNotification<StoryPattern, Classifier, Expression>(variablesScope,
					notifier, constraint, storyPattern));
		}
	}

	public void storyPatternConstraintViolated(Expression constraint, StoryPattern storyPattern,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternConstraintViolatedNotification<StoryPattern, Classifier, Expression>(variablesScope,
					notifier, constraint, storyPattern));
		}
	}

	public void storyPatternObjectConstraintHolds(Expression constraint, StoryPatternObject storyPatternObject,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectConstraintHoldsNotification<StoryPatternObject, Classifier, Expression>(
					variablesScope, notifier, constraint, storyPatternObject));
		}
	}

	public void storyPatternObjectConstraintViolated(Expression constraint, StoryPatternObject storyPatternObject,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectConstraintViolatedNotification<StoryPatternObject, Classifier, Expression>(
					variablesScope, notifier, constraint, storyPatternObject));
		}
	}
}
