package de.mdelab.sdm.interpreter.core.executionTrace;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.eclipse.emf.ecore.EClassifier;

import de.mdelab.sdm.interpreter.core.notifications.ActivityExecutionFinishedNotification;
import de.mdelab.sdm.interpreter.core.notifications.ActivityExecutionStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.ActivityNodeExecutionFinishedNotification;
import de.mdelab.sdm.interpreter.core.notifications.ActivityNodeExecutionStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.AttributeValueSetNotification;
import de.mdelab.sdm.interpreter.core.notifications.EvaluatedExpressionNotification;
import de.mdelab.sdm.interpreter.core.notifications.EvaluatingExpressionNotification;
import de.mdelab.sdm.interpreter.core.notifications.InstanceLinkCreatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InstanceLinkDestroyedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InstanceObjectCreatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InstanceObjectDestroyedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InterpreterNotification;
import de.mdelab.sdm.interpreter.core.notifications.LinkCheckFailedNotification;
import de.mdelab.sdm.interpreter.core.notifications.LinkCheckSuccessfulNotification;
import de.mdelab.sdm.interpreter.core.notifications.NotificationReceiver;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternApplicationFinishedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternApplicationStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternConstraintHoldsNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternConstraintViolatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternInitializationFinishedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternInitializationStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternMatchingFailedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternMatchingStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternMatchingSuccessfulNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternObjectBindingRevokedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternObjectBoundNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternObjectConstraintHoldsNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternObjectConstraintViolatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.StoryPatternObjectNotBoundNotification;
import de.mdelab.sdm.interpreter.core.notifications.TraversingActivityEdgeNotification;
import de.mdelab.sdm.interpreter.core.notifications.TraversingLinkNotification;
import de.mdelab.sdm.interpreter.core.notifications.VariableCreatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.VariableDeletedNotification;
import de.mdelab.sdm.interpreter.core.notifications.VariableValueChangedNotification;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ExecutionTraceNotificationReceiver<ActivityType, ActivityNodeType, ActivityEdgeType, StoryPatternType, StoryPatternObjectType, StoryPatternLinkType, ClassifierType, FeatureType, ExpressionType>
		implements NotificationReceiver<ClassifierType>
{
	private ExecutionTrace							executionTrace;

	private Stack<Execution>						currentContainerStack;

	private Map<Execution, List<Execution>>			containerToChildrenMap;

	private List<Execution>							executionTraceChildren;

	private final ProfilingFilter<ClassifierType>[]	filters;

	@SuppressWarnings("unchecked")
	public ExecutionTraceNotificationReceiver(final ProfilingFilter<ClassifierType>[] filters)
	{
		this.reset();

		if (filters == null)
		{
			this.filters = new ProfilingFilter[0];
		}
		else
		{
			this.filters = filters;
		}
	}

	public ExecutionTraceNotificationReceiver()
	{
		this(null);
	}

	public void reset()
	{
		this.executionTrace = ExecutionTraceFactory.eINSTANCE.createExecutionTrace();
		this.currentContainerStack = new Stack<Execution>();
		this.containerToChildrenMap = new HashMap<Execution, List<Execution>>();
		this.executionTraceChildren = new LinkedList<Execution>();
	}

	private void addChildToCurrentContainer(final Execution child)
	{
		List<Execution> list = this.containerToChildrenMap.get(this.currentContainerStack.peek());

		if (list == null)
		{
			list = new LinkedList<Execution>();
			this.containerToChildrenMap.put(this.currentContainerStack.peek(), list);
		}

		list.add(child);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(final InterpreterNotification<ClassifierType> notification)
	{
		for (final ProfilingFilter<ClassifierType> filter : this.filters)
		{
			if (!filter.doProfile(notification))
			{
				return;
			}
		}

		switch (notification.getNotificationType())
		{
			case ACTIVITY_EXECUTION_STARTED:
			{
				this.handleActivityExecutionStarted((ActivityExecutionStartedNotification<ActivityType, ClassifierType>) notification);

				break;
			}
			case ACTIVITY_EXECUTION_FINISHED:
			{
				this.handleActivityExecutionFinished((ActivityExecutionFinishedNotification<ActivityType, ClassifierType>) notification);

				break;
			}
			case ACTIVITY_NODE_EXECUTION_STARTED:
			{
				this.handleActivityNodeExecutionStarted((ActivityNodeExecutionStartedNotification<ActivityNodeType, ClassifierType>) notification);

				break;
			}
			case ACTIVITY_NODE_EXECUTION_FINISHED:
			{
				this.handleActivityNodeExecutionFinished((ActivityNodeExecutionFinishedNotification<ActivityNodeType, ClassifierType>) notification);

				break;
			}
			case TRAVERSING_ACTIVITY_EDGE:
			{
				this.handleTraversingActivityEdge((TraversingActivityEdgeNotification<ActivityEdgeType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_INITIALIZATION_STARTED:
			{
				this.handleStoryPatternInitializationStarted((StoryPatternInitializationStartedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_INITIALIZATION_FINISHED:
			{
				this.handleStoryPatternInitializationFinished((StoryPatternInitializationFinishedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_MATCHING_STARTED:
			{
				this.handleStoryPatternMatchingStarted((StoryPatternMatchingStartedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_MATCHING_SUCCESSFUL:
			{
				this.handleStoryPatternMatchingSuccesful((StoryPatternMatchingSuccessfulNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}

			case STORY_PATTERN_MATCHING_FAILED:
			{
				this.handleStoryPatternMatchingFailed((StoryPatternMatchingFailedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_APPLICATION_STARTED:
			{
				this.handleStoryPatternApplicationStarted((StoryPatternApplicationStartedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_APPLICATION_FINISHED:
			{
				this.handleStoryPatternApplicationFinished((StoryPatternApplicationFinishedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_BOUND:
			{
				this.handleStoryPatternObjectBound((StoryPatternObjectBoundNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_NOT_BOUND:
			{
				this.handleStoryPatternObjectNotBound((StoryPatternObjectNotBoundNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_BINDING_REVOKED:
			{
				this.handleStoryPatternObjectBindingRevoked((StoryPatternObjectBindingRevokedNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case TRAVERSING_LINK:
			{
				this.handleTraversingLink((TraversingLinkNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case LINK_CHECK_SUCCESSFUL:
			{
				this.handleLinkCheckSuccessful((LinkCheckSuccessfulNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case LINK_CHECK_FAILED:
			{
				this.handleLinkCheckFailed((LinkCheckFailedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case EVALUATING_EXPRESSION:
			{
				this.handleEvaluatingExpression((EvaluatingExpressionNotification<ClassifierType, ExpressionType>) notification);

				break;
			}
			case EVALUATED_EXPRESSION:
			{
				this.handleEvaluatedExpression((EvaluatedExpressionNotification<ClassifierType, ExpressionType>) notification);

				break;
			}
			case INSTANCE_OBJECT_CREATED:
			{
				this.handleInstanceObjectCreated((InstanceObjectCreatedNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case INSTANCE_OBJECT_DESTROYED:
			{
				this.handleInstanceObjectDesctroyed((InstanceObjectDestroyedNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case INSTANCE_LINK_CREATED:
			{
				this.handleInstanceLinkCreated((InstanceLinkCreatedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case INSTANCE_LINK_DESTROYED:
			{
				this.handleInstanceLinkDestroyed((InstanceLinkDestroyedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case VARIABLE_CREATED:
			{
				this.handleVariableCreated((VariableCreatedNotification<ClassifierType>) notification);

				break;
			}
			case VARIABLE_DELETED:
			{
				this.handleVariableDeleted((VariableDeletedNotification<ClassifierType>) notification);

				break;
			}
			case VARIABLE_VALUE_CHANGED:
			{
				this.handleVariableValueChanged((VariableValueChangedNotification<ClassifierType>) notification);

				break;
			}
			case ATTRIBUTE_VALUE_SET:
			{
				this.handleAttributeValueSet((AttributeValueSetNotification<StoryPatternObjectType, ClassifierType, FeatureType>) notification);

				break;
			}
			case STORY_PATTERN_CONSTRAINT_HOLDS:
			{
				this.handleStoryPatternConstraintHolds((StoryPatternConstraintHoldsNotification<StoryPatternType, ClassifierType, ExpressionType>) notification);

				break;
			}
			case STORY_PATTERN_CONSTRAINT_VIOLATED:
			{
				this.handleStoryPatternConstraintViolated((StoryPatternConstraintViolatedNotification<StoryPatternType, ClassifierType, ExpressionType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
			{
				this.handleStoryPatternObjectConstraintHolds((StoryPatternObjectConstraintHoldsNotification<StoryPatternObjectType, ClassifierType, ExpressionType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
			{
				this.handleStoryPatternObjectConstraintViolated((StoryPatternObjectConstraintViolatedNotification<StoryPatternObjectType, ClassifierType, ExpressionType>) notification);

				break;
			}
			default:
				throw new UnsupportedOperationException();
		}
	}

	private void handleActivityNodeExecutionStarted(
			final ActivityNodeExecutionStartedNotification<ActivityNodeType, ClassifierType> notification)
	{
		final ActivityNodeExecution<ActivityNodeType> a = ExecutionTraceFactory.eINSTANCE.createActivityNodeExecution();

		a.setActivityNode(notification.getActivityNode());
		a.setExecutionStartedTimeStamp(System.nanoTime());

		this.addChildToCurrentContainer(a);

		this.currentContainerStack.push(a);
	}

	private void handleActivityNodeExecutionFinished(
			final ActivityNodeExecutionFinishedNotification<ActivityNodeType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof ActivityNodeExecution;

		@SuppressWarnings("unchecked")
		final ActivityNodeExecution<ActivityNodeType> e = (ActivityNodeExecution<ActivityNodeType>) this.currentContainerStack.pop();

		assert e.getActivityNode() == notification.getActivityNode();

		e.setExecutionFinishedTimeStamp(System.nanoTime());
	}

	private void handleTraversingActivityEdge(final TraversingActivityEdgeNotification<ActivityEdgeType, ClassifierType> notification)
	{
		final ActivityEdgeTraversal<ActivityEdgeType> a = ExecutionTraceFactory.eINSTANCE.createActivityEdgeTraversal();
		a.setActivityEdge(notification.getActivityEdge());
		a.setExecutionStartedTimeStamp(System.nanoTime());
		a.setExecutionFinishedTimeStamp(a.getExecutionStartedTimeStamp());

		this.addChildToCurrentContainer(a);
	}

	private void handleStoryPatternInitializationStarted(
			final StoryPatternInitializationStartedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternInitialization<StoryPatternType> s = ExecutionTraceFactory.eINSTANCE.createStoryPatternInitialization();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setStoryPattern(notification.getStoryPattern());

		this.addChildToCurrentContainer(s);

		this.currentContainerStack.push(s);
	}

	private void handleStoryPatternInitializationFinished(
			final StoryPatternInitializationFinishedNotification<StoryPatternType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof StoryPatternInitialization;

		@SuppressWarnings("unchecked")
		final StoryPatternInitialization<StoryPatternType> s = (StoryPatternInitialization<StoryPatternType>) this.currentContainerStack
				.pop();

		assert s.getStoryPattern() == notification.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());
	}

	private void handleStoryPatternMatchingStarted(
			final StoryPatternMatchingStartedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternMatching<StoryPatternType> s = ExecutionTraceFactory.eINSTANCE.createStoryPatternMatching();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setStoryPattern(notification.getStoryPattern());

		this.addChildToCurrentContainer(s);

		this.currentContainerStack.push(s);
	}

	@SuppressWarnings("unchecked")
	private void handleStoryPatternMatchingSuccesful(
			final StoryPatternMatchingSuccessfulNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternMatching<StoryPatternType> s = (StoryPatternMatching<StoryPatternType>) this.currentContainerStack.pop();

		assert ((StoryPatternMatchingSuccessfulNotification<StoryPatternType, EClassifier>) notification).getStoryPattern() == s
				.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());

		s.setSuccessful(true);
	}

	@SuppressWarnings("unchecked")
	private void handleStoryPatternMatchingFailed(
			final StoryPatternMatchingFailedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternMatching<StoryPatternType> s = (StoryPatternMatching<StoryPatternType>) this.currentContainerStack.pop();

		assert ((StoryPatternMatchingFailedNotification<StoryPatternType, EClassifier>) notification).getStoryPattern() == s
				.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());

		s.setSuccessful(false);
	}

	private void handleStoryPatternApplicationStarted(
			final StoryPatternApplicationStartedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternApplication<StoryPatternType> s = ExecutionTraceFactory.eINSTANCE.createStoryPatternApplication();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setStoryPattern(notification.getStoryPattern());

		this.addChildToCurrentContainer(s);

		this.currentContainerStack.push(s);
	}

	private void handleStoryPatternApplicationFinished(
			final StoryPatternApplicationFinishedNotification<StoryPatternType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof StoryPatternApplication;

		@SuppressWarnings("unchecked")
		final StoryPatternApplication<StoryPatternType> s = (StoryPatternApplication<StoryPatternType>) this.currentContainerStack.pop();

		assert s.getStoryPattern() == notification.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());
	}

	private void handleStoryPatternObjectBound(
			final StoryPatternObjectBoundNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final StoryPatternObjectBound<StoryPatternObjectType> s = ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectBound();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setValue(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectNotBound(
			final StoryPatternObjectNotBoundNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final StoryPatternObjectNotBound<StoryPatternObjectType> s = ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectNotBound();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectBindingRevoked(
			final StoryPatternObjectBindingRevokedNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final StoryPatternObjectBindingRevoked<StoryPatternObjectType> s = ExecutionTraceFactory.eINSTANCE
				.createStoryPatternObjectBindingRevoked();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setPreviousValue(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(s);
	}

	private void handleTraversingLink(
			final TraversingLinkNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final TraversingLink<StoryPatternLinkType, StoryPatternObjectType> e = ExecutionTraceFactory.eINSTANCE.createTraversingLink();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExecutionFinishedTimeStamp(e.getExecutionStartedTimeStamp());
		e.setStoryPatternLink(notification.getLink());
		e.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		e.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		e.setSourceObject(notification.getSourceObject().toString());

		this.addChildToCurrentContainer(e);
	}

	private void handleLinkCheckSuccessful(
			final LinkCheckSuccessfulNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> e = ExecutionTraceFactory.eINSTANCE
				.createLinkCheckSuccessful();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExecutionFinishedTimeStamp(e.getExecutionStartedTimeStamp());
		e.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		e.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		e.setSourceObject(notification.getSourceObject().toString());
		e.setTargetObject(notification.getTargetObject().toString());
		e.setStoryPatternLink(notification.getLink());

		this.addChildToCurrentContainer(e);
	}

	private void handleLinkCheckFailed(
			final LinkCheckFailedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> e = ExecutionTraceFactory.eINSTANCE.createLinkCheckFailed();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExecutionFinishedTimeStamp(e.getExecutionStartedTimeStamp());
		e.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		e.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		e.setSourceObject(notification.getSourceObject().toString());
		e.setTargetObject(notification.getTargetObject().toString());
		e.setStoryPatternLink(notification.getLink());

		this.addChildToCurrentContainer(e);
	}

	private void handleEvaluatingExpression(final EvaluatingExpressionNotification<ClassifierType, ExpressionType> notification)
	{
		final ExpressionEvaluation<ExpressionType> e = ExecutionTraceFactory.eINSTANCE.createExpressionEvaluation();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExpression(notification.getExpression());

		this.addChildToCurrentContainer(e);

		this.currentContainerStack.push(e);
	}

	private void handleEvaluatedExpression(final EvaluatedExpressionNotification<ClassifierType, ExpressionType> notification)
	{
		assert this.currentContainerStack.peek() instanceof ExpressionEvaluation;

		@SuppressWarnings("unchecked")
		final ExpressionEvaluation<ExpressionType> e = (ExpressionEvaluation<ExpressionType>) this.currentContainerStack.pop();

		assert e.getExpression() == notification.getExpression();
		e.setExecutionFinishedTimeStamp(System.nanoTime());

		if (notification.getResult() == null)
		{
			e.setResult("null");
		}
		else
		{
			e.setResult(notification.getResult().toString());
		}
	}

	private void handleInstanceObjectCreated(final InstanceObjectCreatedNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final InstanceObjectCreation<StoryPatternObjectType> i = ExecutionTraceFactory.eINSTANCE.createInstanceObjectCreation();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionFinishedTimeStamp());
		i.setStoryPatternObject(notification.getStoryPatternObject());
		i.setInstanceObject(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleInstanceObjectDesctroyed(
			final InstanceObjectDestroyedNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final InstanceObjectDeletion<StoryPatternObjectType> i = ExecutionTraceFactory.eINSTANCE.createInstanceObjectDeletion();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionFinishedTimeStamp());
		i.setStoryPatternObject(notification.getStoryPatternObject());
		i.setInstanceObject(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleInstanceLinkCreated(
			final InstanceLinkCreatedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> i = ExecutionTraceFactory.eINSTANCE
				.createInstanceLinkCreation();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionStartedTimeStamp());
		i.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		i.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		i.setSourceInstanceObject(notification.getSourceObject().toString());
		i.setTargetInstanceObject(notification.getTargetObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleInstanceLinkDestroyed(
			final InstanceLinkDestroyedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> i = ExecutionTraceFactory.eINSTANCE
				.createInstanceLinkDeletion();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionStartedTimeStamp());
		i.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		i.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		i.setSourceInstanceObject(notification.getSourceObject().toString());
		i.setTargetInstanceObject(notification.getTargetObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleVariableCreated(final VariableCreatedNotification<ClassifierType> notification)
	{
		final VariableCreated<ClassifierType> v = ExecutionTraceFactory.eINSTANCE.createVariableCreated();
		v.setExecutionStartedTimeStamp(System.nanoTime());
		v.setExecutionFinishedTimeStamp(v.getExecutionStartedTimeStamp());

		final Variable<ClassifierType> variable = notification.getVariable();
		v.setVariableName(variable.getName());
		v.setClassifier(variable.getClassifier());

		if (variable.getValue() == null)
		{
			v.setValue("null");
		}
		else
		{
			v.setValue(variable.getValue().toString());
		}

		this.addChildToCurrentContainer(v);
	}

	private void handleVariableDeleted(final VariableDeletedNotification<ClassifierType> notification)
	{
		final VariableDeleted<ClassifierType> v = ExecutionTraceFactory.eINSTANCE.createVariableDeleted();
		v.setExecutionStartedTimeStamp(System.nanoTime());
		v.setExecutionFinishedTimeStamp(v.getExecutionStartedTimeStamp());

		final Variable<ClassifierType> variable = notification.getVariable();
		v.setVariableName(variable.getName());
		v.setClassifier(variable.getClassifier());

		if (variable.getValue() == null)
		{
			v.setValue("null");
		}
		else
		{
			v.setValue(variable.getValue().toString());
		}

		this.addChildToCurrentContainer(v);
	}

	private void handleVariableValueChanged(final VariableValueChangedNotification<ClassifierType> notification)
	{
		final VariableChanged<ClassifierType> v = ExecutionTraceFactory.eINSTANCE.createVariableChanged();
		v.setExecutionStartedTimeStamp(System.nanoTime());
		v.setExecutionFinishedTimeStamp(v.getExecutionStartedTimeStamp());

		final Variable<ClassifierType> variable = notification.getVariable();
		v.setVariableName(variable.getName());
		v.setClassifier(variable.getClassifier());

		if (variable.getValue() == null)
		{
			v.setValue("null");
		}
		else
		{
			v.setValue(variable.getValue().toString());
		}

		if (notification.getOldValue() == null)
		{
			v.setOldValue("null");
		}
		else
		{
			v.setOldValue(notification.getOldValue().toString());
		}

		this.addChildToCurrentContainer(v);
	}

	private void handleAttributeValueSet(
			final AttributeValueSetNotification<StoryPatternObjectType, ClassifierType, FeatureType> notification)
	{
		final AttributeValueSet<StoryPatternObjectType, FeatureType> a = ExecutionTraceFactory.eINSTANCE.createAttributeValueSet();
		a.setExecutionStartedTimeStamp(System.nanoTime());
		a.setExecutionFinishedTimeStamp(a.getExecutionStartedTimeStamp());
		a.setFeature(notification.getFeature());
		a.setStoryPatternObject(notification.getStoryPatternObject());
		a.setInstanceObject(notification.getInstanceObject().toString());

		if (notification.getFeatureValue() == null)
		{
			a.setNewValue("null");
		}
		else
		{
			a.setNewValue(notification.getFeatureValue().toString());
		}

		this.addChildToCurrentContainer(a);
	}

	private void handleStoryPatternConstraintHolds(
			final StoryPatternConstraintHoldsNotification<StoryPatternType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternConstraintHolds<StoryPatternType, ExpressionType> s = ExecutionTraceFactory.eINSTANCE
				.createStoryPatternConstraintHolds();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPattern(notification.getStoryPattern());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternConstraintViolated(
			final StoryPatternConstraintViolatedNotification<StoryPatternType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternConstraintViolated<StoryPatternType, ExpressionType> s = ExecutionTraceFactory.eINSTANCE
				.createStoryPatternConstraintViolated();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPattern(notification.getStoryPattern());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectConstraintHolds(
			final StoryPatternObjectConstraintHoldsNotification<StoryPatternObjectType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> s = ExecutionTraceFactory.eINSTANCE
				.createStoryPatternObjectConstraintHolds();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectConstraintViolated(
			final StoryPatternObjectConstraintViolatedNotification<StoryPatternObjectType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> s = ExecutionTraceFactory.eINSTANCE
				.createStoryPatternObjectConstraintViolated();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleActivityExecutionStarted(final ActivityExecutionStartedNotification<ActivityType, ClassifierType> notification)
	{
		final ActivityExecution<ActivityType> a = ExecutionTraceFactory.eINSTANCE.createActivityExecution();
		a.setActivity(notification.getActivity());
		a.setExecutionStartedTimeStamp(System.nanoTime());

		for (final Variable<ClassifierType> var : notification.getParameters())
		{
			if (var.getValue() != null)
			{
				a.getInParameterValues().put(var.getName(), var.getValue().toString());
			}
			else
			{
				a.getInParameterValues().put(var.getName(), "null");
			}
		}

		if (this.currentContainerStack.isEmpty())
		{
			this.executionTraceChildren.add(a);
		}
		else
		{
			this.addChildToCurrentContainer(a);
		}

		this.currentContainerStack.push(a);
	}

	private void handleActivityExecutionFinished(final ActivityExecutionFinishedNotification<ActivityType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof ActivityExecution;

		@SuppressWarnings("unchecked")
		final ActivityExecution<ActivityType> a = (ActivityExecution<ActivityType>) this.currentContainerStack.pop();

		assert a.getActivity() == notification.getActivity();

		a.setExecutionFinishedTimeStamp(System.nanoTime());

		for (final Variable<ClassifierType> var : notification.getReturnValues().values())
		{
			if (var.getValue() != null)
			{
				a.getOutParameterValues().put(var.getName(), var.getValue().toString());
			}
			else
			{
				a.getOutParameterValues().put(var.getName(), "null");
			}
		}
	}

	public ExecutionTrace createExecutionTrace()
	{
		this.executionTrace.getExecutions().addAll(this.executionTraceChildren);

		for (final Entry<Execution, List<Execution>> entry : this.containerToChildrenMap.entrySet())
		{
			entry.getKey().getElements().addAll(entry.getValue());
		}

		return this.executionTrace;
	}
}
