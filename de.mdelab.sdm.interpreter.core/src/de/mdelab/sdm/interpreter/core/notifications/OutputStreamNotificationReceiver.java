package de.mdelab.sdm.interpreter.core.notifications;

import java.io.OutputStream;
import java.io.PrintStream;

import de.mdelab.sdm.interpreter.core.facade.IActivityEdgeFacade;
import de.mdelab.sdm.interpreter.core.facade.IActivityFacade;
import de.mdelab.sdm.interpreter.core.facade.IActivityNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IExpressionFacade;
import de.mdelab.sdm.interpreter.core.facade.IFeatureFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternLinkFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternObjectFacade;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;

/**
 * This notification receiver prints received notifications to the provided
 * output stream or System.out if no output stream is specified.
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
public class OutputStreamNotificationReceiver<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		implements NotificationReceiver<Classifier>
{
	private PrintStream																							printStream;
	private IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	spoFacade;
	private IStoryPatternLinkFacade<StoryPatternObject, StoryPatternLink, Feature>								splFacade;
	private IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression>					spFacade;
	private IFeatureFacade<Feature>																				featureFacade;
	private IExpressionFacade<Expression>																		expressionFacade;
	private IActivityFacade<Activity, ActivityNode>																activityFacade;
	private IActivityNodeFacade<ActivityNode>																	activityNodeFacade;
	private IActivityEdgeFacade<ActivityNode, ActivityEdge>														activityEdgeFacade;

	public OutputStreamNotificationReceiver(
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			OutputStream outputStream)
	{
		assert facadeFactory != null;

		if (outputStream == null)
		{
			this.printStream = System.out;
		}
		else
		{
			this.printStream = new PrintStream(outputStream);
		}

		this.spoFacade = facadeFactory.getStoryPatternObjectFacade();
		this.splFacade = facadeFactory.getStoryPatternLinkFacade();
		this.spFacade = facadeFactory.getStoryPatternFacade();
		this.featureFacade = facadeFactory.getFeatureFacade();
		this.expressionFacade = facadeFactory.getExpressionFacade();
		this.activityFacade = facadeFactory.getActivityFacade();
		this.activityNodeFacade = facadeFactory.getUnspecificActivityNodeFacade();
		this.activityEdgeFacade = facadeFactory.getActivityEdgeFacade();
	}

	public OutputStreamNotificationReceiver(
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory)
	{
		this(facadeFactory, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(InterpreterNotification<Classifier> notification)
	{
		switch (notification.getNotificationType())
		{
			case ACTIVITY_EXECUTION_FINISHED:
				this.activityExecutionFinished((ActivityExecutionFinishedNotification<Activity, Classifier>) notification);
				break;

			case ACTIVITY_EXECUTION_STARTED:
				this.activityExecutionStarted((ActivityExecutionStartedNotification<Activity, Classifier>) notification);
				break;

			case ACTIVITY_NODE_EXECUTION_FINISHED:
				this.activityNodeExecutionFinished((ActivityNodeExecutionFinishedNotification<ActivityNode, Classifier>) notification);
				break;

			case ACTIVITY_NODE_EXECUTION_STARTED:
				this.activityNodeExecutionStarted((ActivityNodeExecutionStartedNotification<ActivityNode, Classifier>) notification);
				break;

			case ATTRIBUTE_VALUE_SET:
				this.attributeValueSet((AttributeValueSetNotification<StoryPatternObject, Classifier, Feature>) notification);
				break;

			case EVALUATED_EXPRESSION:
				this.evaluatedExpression((EvaluatedExpressionNotification<Classifier, Expression>) notification);
				break;

			case EVALUATING_EXPRESSION:
				this.evaluatingExpression((EvaluatingExpressionNotification<Classifier, Expression>) notification);
				break;

			case INSTANCE_LINK_CREATED:
				this.instanceLinkCreated((InstanceLinkCreatedNotification<StoryPatternObject, StoryPatternLink, Classifier>) notification);
				break;

			case INSTANCE_LINK_DESTROYED:
				this.instanceLinkDestroyed((InstanceLinkDestroyedNotification<StoryPatternObject, StoryPatternLink, Classifier>) notification);
				break;

			case INSTANCE_OBJECT_CREATED:
				this.instanceObjectCreated((InstanceObjectCreatedNotification<StoryPatternObject, Classifier>) notification);
				break;

			case INSTANCE_OBJECT_DESTROYED:
				this.instanceObjectDestroyed((InstanceObjectDestroyedNotification<StoryPatternObject, Classifier>) notification);
				break;

			case LINK_CHECK_FAILED:
				this.linkCheckFailed((LinkCheckFailedNotification<StoryPatternObject, StoryPatternLink, Classifier>) notification);
				break;

			case LINK_CHECK_SUCCESSFUL:
				this.linkCheckSuccessful((LinkCheckSuccessfulNotification<StoryPatternObject, StoryPatternLink, Classifier>) notification);
				break;

			case STORY_PATTERN_APPLICATION_FINISHED:
				this.storyPatternApplicationFinished((StoryPatternApplicationFinishedNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_APPLICATION_STARTED:
				this.storyPatternApplicationStarted((StoryPatternApplicationStartedNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_INITIALIZATION_FINISHED:
				this.storyPatternInitializationFinished((StoryPatternInitializationFinishedNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_INITIALIZATION_STARTED:
				this.storyPatternInitializationStarted((StoryPatternInitializationStartedNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_MATCHING_FAILED:
				this.storyPatternMatchingFailed((StoryPatternMatchingFailedNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_MATCHING_STARTED:
				this.storyPatternMatchingStarted((StoryPatternMatchingStartedNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_MATCHING_SUCCESSFUL:
				this.storyPatternMatchingSuccessful((StoryPatternMatchingSuccessfulNotification<StoryPattern, Classifier>) notification);
				break;

			case STORY_PATTERN_OBJECT_BINDING_REVOKED:
				this.storyPatternObjectBindingRevoked((StoryPatternObjectBindingRevokedNotification<StoryPatternObject, Classifier>) notification);
				break;

			case STORY_PATTERN_OBJECT_BOUND:
				this.storyPatternObjectBound((StoryPatternObjectBoundNotification<StoryPatternObject, Classifier>) notification);
				break;

			case STORY_PATTERN_OBJECT_NOT_BOUND:
				this.storyPatternObjectNotBound((StoryPatternObjectNotBoundNotification<StoryPatternObject, Classifier>) notification);
				break;

			case TRAVERSING_ACTIVITY_EDGE:
				this.traversingActivityEdge((TraversingActivityEdgeNotification<ActivityEdge, Classifier>) notification);
				break;

			case TRAVERSING_LINK:
				this.traversingLink((TraversingLinkNotification<StoryPatternObject, StoryPatternLink, Classifier>) notification);
				break;

			case VARIABLE_CREATED:
				this.variableCreated((VariableCreatedNotification<Classifier>) notification);
				break;

			case VARIABLE_DELETED:
				this.variableDeleted((VariableDeletedNotification<Classifier>) notification);
				break;

			case VARIABLE_VALUE_CHANGED:
				this.variableValueChanged((VariableValueChangedNotification<Classifier>) notification);
				break;

			case STORY_PATTERN_CONSTRAINT_HOLDS:
				this.storyPatternConstraintHolds((StoryPatternConstraintHoldsNotification<StoryPattern, Classifier, Expression>) notification);
				break;

			case STORY_PATTERN_CONSTRAINT_VIOLATED:
				this.storyPatternConstraintViolated((StoryPatternConstraintViolatedNotification<StoryPattern, Classifier, Expression>) notification);
				break;

			case STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
				this.storyPatternObjectConstraintHolds((StoryPatternObjectConstraintHoldsNotification<StoryPatternObject, Classifier, Expression>) notification);
				break;

			case STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
				this.storyPatternObjectConstraintViolated((StoryPatternObjectConstraintViolatedNotification<StoryPatternObject, Classifier, Expression>) notification);
				break;

			default:
				throw new UnsupportedOperationException();
		}
	}

	public void storyPatternObjectBound(StoryPatternObjectBoundNotification<StoryPatternObject, Classifier> notification)
	{
		this.printStream.println("Bound story pattern object '" + this.spoFacade.getName(notification.getStoryPatternObject()) + "' to '"
				+ notification.getInstanceObject() + ".");
	}

	public void storyPatternObjectNotBound(StoryPatternObjectNotBoundNotification<StoryPatternObject, Classifier> notification)
	{
		this.printStream.println("Could not bind story pattern object '" + this.spoFacade.getName(notification.getStoryPatternObject())
				+ "'.");
	}

	public void linkCheckSuccessful(LinkCheckSuccessfulNotification<StoryPatternObject, StoryPatternLink, Classifier> notification)
	{
		this.printStream.println("Link check successful: '" + this.splFacade.getName(notification.getLink()) + "' from '"
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + "' to '"
				+ this.spoFacade.getName(notification.getTargetStoryPatternObject()) + "' (source: '" + notification.getSourceObject()
				+ "', target: '" + notification.getTargetObject() + "').");
	}

	public void linkCheckFailed(LinkCheckFailedNotification<StoryPatternObject, StoryPatternLink, Classifier> notification)
	{
		this.printStream.println("Link check failed: '" + this.splFacade.getName(notification.getLink()) + "' from '"
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + "' to '"
				+ this.spoFacade.getName(notification.getTargetStoryPatternObject()) + "' (source: '" + notification.getSourceObject()
				+ "', target: '" + notification.getTargetObject() + "').");
	}

	public void storyPatternInitializationStarted(StoryPatternInitializationStartedNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Initializing story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + "'...");
	}

	public void storyPatternInitializationFinished(StoryPatternInitializationFinishedNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Initialization finished of story pattern '" + this.spFacade.getName(notification.getStoryPattern())
				+ "'.");
	};

	public void storyPatternMatchingStarted(StoryPatternMatchingStartedNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Matching story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + "'...");
	}

	public void storyPatternMatchingSuccessful(StoryPatternMatchingSuccessfulNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Matching successful of story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + ".");
	}

	public void storyPatternMatchingFailed(StoryPatternMatchingFailedNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Matching failed of story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + ".");
	}

	public void storyPatternApplicationStarted(StoryPatternApplicationStartedNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Applying story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + "...");
	};

	public void storyPatternApplicationFinished(StoryPatternApplicationFinishedNotification<StoryPattern, Classifier> notification)
	{
		this.printStream.println("Applied story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + "...");

	};

	public void instanceObjectCreated(InstanceObjectCreatedNotification<StoryPatternObject, Classifier> notification)
	{
		this.printStream.println("Instance object created for '" + this.spoFacade.getName(notification.getStoryPatternObject()) + "': "
				+ notification.getInstanceObject());
	}

	public void instanceLinkCreated(InstanceLinkCreatedNotification<StoryPatternObject, StoryPatternLink, Classifier> notification)
	{
		this.printStream.println("Instance link '" + this.splFacade.getName(notification.getLink()) + "' created from '"
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + "' to '"
				+ this.spoFacade.getName(notification.getTargetStoryPatternObject()) + "' ("
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + ": '" + notification.getSourceObject() + "', "
				+ this.spoFacade.getName(notification.getTargetStoryPatternObject()) + ": '" + notification.getTargetObject() + "')");
	}

	public void instanceObjectDestroyed(InstanceObjectDestroyedNotification<StoryPatternObject, Classifier> notification)
	{
		this.printStream.println("Instance object destroyed for '" + this.spoFacade.getName(notification.getStoryPatternObject()) + "': "
				+ notification.getInstanceObject());
	}

	public void instanceLinkDestroyed(InstanceLinkDestroyedNotification<StoryPatternObject, StoryPatternLink, Classifier> notification)
	{
		this.printStream.println("Instance link '" + this.splFacade.getName(notification.getLink()) + "' destroyed from '"
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + "' to '"
				+ this.spoFacade.getName(notification.getTargetStoryPatternObject()) + "' ("
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + ": '" + notification.getSourceStoryPatternObject()
				+ "', " + this.spoFacade.getName(notification.getTargetStoryPatternObject()) + ": '" + notification.getTargetObject()
				+ "')");
	}

	public void traversingLink(TraversingLinkNotification<StoryPatternObject, StoryPatternLink, Classifier> notification)
	{
		this.printStream.println("Traversing link '" + this.splFacade.getName(notification.getLink()) + "' from '"
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + "' to '"
				+ this.spoFacade.getName(notification.getTargetStoryPatternObject()) + "' ("
				+ this.spoFacade.getName(notification.getSourceStoryPatternObject()) + ": " + notification.getSourceObject() + ")...");
	}

	public void storyPatternObjectBindingRevoked(StoryPatternObjectBindingRevokedNotification<StoryPatternObject, Classifier> notification)
	{
		this.printStream.println("Binding revoked for story pattern object '"
				+ this.spoFacade.getName(notification.getStoryPatternObject()) + "', was bound to '" + notification.getInstanceObject()
				+ ".");

	}

	public void attributeValueSet(AttributeValueSetNotification<StoryPatternObject, Classifier, Feature> notification)
	{
		this.printStream.println("Attribute '" + this.spoFacade.getName(notification.getStoryPatternObject()) + "."
				+ this.featureFacade.getName(notification.getFeature()) + "' set to '" + notification.getFeatureValue() + " ("
				+ this.spoFacade.getName(notification.getStoryPatternObject()) + ": '" + notification.getInstanceObject() + "')");
	}

	public void evaluatingExpression(EvaluatingExpressionNotification<Classifier, Expression> notification)
	{
		this.printStream.println("Evaluating expression '" + this.expressionFacade.getExpressionString(notification.getExpression())
				+ "'...");
	}

	public void evaluatedExpression(EvaluatedExpressionNotification<Classifier, Expression> notification)
	{
		this.printStream.println("Evaluated expression '" + this.expressionFacade.getExpressionString(notification.getExpression())
				+ "' to '" + notification.getResult() + "'.");
	}

	public void activityExecutionStarted(ActivityExecutionStartedNotification<Activity, Classifier> notification)
	{
		this.printStream.println("\n\nExecuting activity '" + this.activityFacade.getName(notification.getActivity()) + "'...");
	}

	public void activityExecutionFinished(ActivityExecutionFinishedNotification<Activity, Classifier> notification)
	{
		this.printStream.println("Finished execution of activity '" + this.activityFacade.getName(notification.getActivity()) + "'.");
	}

	public void activityNodeExecutionStarted(ActivityNodeExecutionStartedNotification<ActivityNode, Classifier> notification)
	{
		this.printStream
				.println("\n\nExecuting activity node '" + this.activityNodeFacade.getName(notification.getActivityNode()) + "'...");
	}

	public void activityNodeExecutionFinished(ActivityNodeExecutionFinishedNotification<ActivityNode, Classifier> notification)
	{
		this.printStream.println("Finished execution of activity node '" + this.activityNodeFacade.getName(notification.getActivityNode())
				+ "'.");
	}

	public void traversingActivityEdge(TraversingActivityEdgeNotification<ActivityEdge, Classifier> notification)
	{
		this.printStream.println("Traversing activity edge from '"
				+ this.activityNodeFacade.getName(this.activityEdgeFacade.getSource(notification.getActivityEdge())) + "' to '"
				+ this.activityNodeFacade.getName(this.activityEdgeFacade.getTarget(notification.getActivityEdge())) + "'.");
	}

	public void variableCreated(VariableCreatedNotification<Classifier> notification)
	{
		this.printStream.println("Variable created: " + notification.getVariable().getName() + ":"
				+ notification.getVariable().getClassifier() + " = " + notification.getVariable().getValue());
	}

	public void variableDeleted(VariableDeletedNotification<Classifier> notification)
	{
		this.printStream.println("Variable deleted: " + notification.getVariable().getName());
	}

	public void variableValueChanged(VariableValueChangedNotification<Classifier> notification)
	{
		this.printStream.println("Variable value changed: " + notification.getVariable().getName() + ": " + notification.getOldValue()
				+ " -> " + notification.getVariable().getValue());
	}

	public void storyPatternConstraintHolds(StoryPatternConstraintHoldsNotification<StoryPattern, Classifier, Expression> notification)
	{
		this.printStream.println("Constraint '" + this.expressionFacade.getExpressionString(notification.getConstraint())
				+ "' holds on story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + "'.");
	}

	public void storyPatternConstraintViolated(StoryPatternConstraintViolatedNotification<StoryPattern, Classifier, Expression> notification)
	{
		this.printStream.println("Constraint '" + this.expressionFacade.getExpressionString(notification.getConstraint())
				+ "' is violated on story pattern '" + this.spFacade.getName(notification.getStoryPattern()) + "'.");
	}

	public void storyPatternObjectConstraintHolds(
			StoryPatternObjectConstraintHoldsNotification<StoryPatternObject, Classifier, Expression> notification)
	{
		this.printStream.println("Constraint '" + this.expressionFacade.getExpressionString(notification.getConstraint())
				+ "' holds on story pattern object '" + this.spoFacade.getName(notification.getStoryPatternObject()) + "'.");
	}

	public void storyPatternObjectConstraintViolated(
			StoryPatternObjectConstraintViolatedNotification<StoryPatternObject, Classifier, Expression> notification)
	{
		this.printStream.println("Constraint '" + this.expressionFacade.getExpressionString(notification.getConstraint())
				+ "' is violated on story pattern object '" + this.spoFacade.getName(notification.getStoryPatternObject()) + "'.");
	}
}
