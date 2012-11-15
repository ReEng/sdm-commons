package de.mdelab.sdm.interpreter.core.notifications;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
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

	public void addNotificationReceiver(final NotificationReceiver<Classifier> notificationReceiver)
	{
		this.notificationReceivers.add(notificationReceiver);
	}

	public void removeNotificationReceiver(final NotificationReceiver<Classifier> notificationReceiver)
	{
		this.notificationReceivers.remove(notificationReceiver);
	}

	protected void sendNotifications(final InterpreterNotification<Classifier> notification)
	{
		for (final NotificationReceiver<Classifier> notificationReceiver : this.notificationReceivers)
		{
			notificationReceiver.notifyChanged(notification);
		}
	}

	public void storyPatternObjectBound(final StoryPatternObject storyPatternObject, final Object instanceObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectBoundNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject, instanceObject));
		}
	}

	public void storyPatternObjectNotBound(final StoryPatternObject storyPatternObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectNotBoundNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject));
		}
	}

	public void storyPatternObjectBindingRevoked(final StoryPatternObject storyPatternObject, final Object instanceObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectBindingRevokedNotification<StoryPatternObject, Classifier>(variablesScope,
					notifier, storyPatternObject, instanceObject));
		}
	}

	public void linkCheckSuccessful(final StoryPatternObject sourceStoryPatternObject, final Object sourceObject,
			final StoryPatternLink link, final StoryPatternObject targetStoryPatternObject, final Object targetObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new LinkCheckSuccessfulNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void linkCheckFailed(final StoryPatternObject sourceStoryPatternObject, final Object sourceObject, final StoryPatternLink link,
			final StoryPatternObject targetStoryPatternObject, final Object targetObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new LinkCheckFailedNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void storyPatternInitializationStarted(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternInitializationStartedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternInitializationFinished(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternInitializationFinishedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternMatchingStarted(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternMatchingStartedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternMatchingSuccessful(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternMatchingSuccessfulNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternMatchingFailed(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternMatchingFailedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternApplicationStarted(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternApplicationStartedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void storyPatternApplicationFinished(final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternApplicationFinishedNotification<StoryPattern, Classifier>(variablesScope, notifier,
					storyPattern));
		}
	}

	public void instanceObjectCreated(final StoryPatternObject storyPatternObject, final Object instanceObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceObjectCreatedNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject, instanceObject));
		}
	}

	public void instanceObjectDestroyed(final StoryPatternObject storyPatternObject, final Object instanceObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceObjectCreatedNotification<StoryPatternObject, Classifier>(variablesScope, notifier,
					storyPatternObject, instanceObject));
		}
	}

	public void instanceLinkCreated(final StoryPatternObject sourceStoryPatternObject, final Object sourceObject,
			final StoryPatternLink link, final StoryPatternObject targetStoryPatternObject, final Object targetObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceLinkCreatedNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void instanceLinkDestroyed(final StoryPatternObject sourceStoryPatternObject, final Object sourceObject,
			final StoryPatternLink link, final StoryPatternObject targetStoryPatternObject, final Object targetObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new InstanceLinkDestroyedNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject, targetObject));
		}
	}

	public void traversingLink(final StoryPatternLink link, final StoryPatternObject sourceStoryPatternObject, final Object sourceObject,
			final StoryPatternObject targetStoryPatternObject,
			final VariablesScope<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, StoryPatternLink, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new TraversingLinkNotification<StoryPatternObject, StoryPatternLink, Classifier>(variablesScope,
					notifier, sourceStoryPatternObject, targetStoryPatternObject, link, sourceObject));
		}
	}

	public void attributeValueSet(final StoryPatternObject storyPatternObject, final Object instanceObject, final Feature feature,
			final Object featureValue, final VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, Feature, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, Feature, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new AttributeValueSetNotification<StoryPatternObject, Classifier, Feature>(variablesScope, notifier,
					storyPatternObject, instanceObject, feature, featureValue));
		}
	}

	public void evaluatingExpression(final Expression expression,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope,
			final Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new EvaluatingExpressionNotification<Classifier, Expression>(variablesScope, notifier, expression));
		}
	}

	public void evaluatedExpression(final Expression expression, final Object result,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope,
			final Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new EvaluatedExpressionNotification<Classifier, Expression>(variablesScope, notifier, expression, result));
		}
	}

	public void activityExecutionStarted(final Activity activity, final Collection<Variable<Classifier>> parameters,
			final VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityExecutionStartedNotification<Activity, Classifier>(variablesScope, notifier, activity,
					parameters));
		}
	}

	public void activityExecutionFinished(final Activity activity, final Map<String, Variable<Classifier>> returnValues,
			final VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityExecutionFinishedNotification<Activity, Classifier>(variablesScope, notifier, activity,
					returnValues));
		}
	}

	public void activityNodeExecutionStarted(final ActivityNode activityNode,
			final VariablesScope<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityNodeExecutionStartedNotification<ActivityNode, Classifier>(variablesScope, notifier,
					activityNode));
		}
	}

	public void activityNodeExecutionFinished(final ActivityNode activityNode,
			final VariablesScope<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ActivityNode, ?, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new ActivityNodeExecutionFinishedNotification<ActivityNode, Classifier>(variablesScope, notifier,
					activityNode));
		}
	}

	public void traversingActivityEdge(final ActivityEdge activityEdge,
			final VariablesScope<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new TraversingActivityEdgeNotification<ActivityEdge, Classifier>(variablesScope, notifier, activityEdge));
		}
	}

	public void variableCreated(final Variable<Classifier> variable, final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new VariableCreatedNotification<Classifier>(variablesScope, variable));
		}
	}

	public void variableDeleted(final Variable<Classifier> variable, final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new VariableDeletedNotification<Classifier>(variablesScope, variable));
		}
	}

	public void variableValueChanged(final Variable<Classifier> variable, final Object oldValue,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new VariableValueChangedNotification<Classifier>(variablesScope, variable, oldValue));
		}
	}

	public void storyPatternConstraintHolds(final Expression constraint, final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternConstraintHoldsNotification<StoryPattern, Classifier, Expression>(variablesScope,
					notifier, constraint, storyPattern));
		}
	}

	public void storyPatternConstraintViolated(final Expression constraint, final StoryPattern storyPattern,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternConstraintViolatedNotification<StoryPattern, Classifier, Expression>(variablesScope,
					notifier, constraint, storyPattern));
		}
	}

	public void storyPatternObjectConstraintHolds(final Expression constraint, final StoryPatternObject storyPatternObject,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectConstraintHoldsNotification<StoryPatternObject, Classifier, Expression>(
					variablesScope, notifier, constraint, storyPatternObject));
		}
	}

	public void storyPatternObjectConstraintViolated(final Expression constraint, final StoryPatternObject storyPatternObject,
			final VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, ?, Expression> notifier)
	{
		if (!this.notificationReceivers.isEmpty())
		{
			this.sendNotifications(new StoryPatternObjectConstraintViolatedNotification<StoryPatternObject, Classifier, Expression>(
					variablesScope, notifier, constraint, storyPatternObject));
		}
	}
}
