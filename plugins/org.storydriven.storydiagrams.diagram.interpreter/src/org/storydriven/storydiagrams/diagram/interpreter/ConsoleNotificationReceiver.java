package org.storydriven.storydiagrams.diagram.interpreter;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.diagram.interpreter.util.InterpreterConsole;
import org.storydriven.storydiagrams.diagram.interpreter.util.Texts;
import org.storydriven.storydiagrams.diagram.interpreter.util.InterpreterConsole.StreamType;
import org.storydriven.storydiagrams.interpreter.notifications.StoryDrivenNotificationReceiver;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

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

/**
 * This notification receiver appends received notifications to the provided StyledText.
 */
public class ConsoleNotificationReceiver implements StoryDrivenNotificationReceiver {

	private InterpreterConsole console;

	private int indent;

	public ConsoleNotificationReceiver(InterpreterConsole text) {
		console = text;
		indent = 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(InterpreterNotification<EClassifier> notification) {
		switch (notification.getNotificationType()) {
		case ACTIVITY_EXECUTION_FINISHED:
			indent--;
			activityExecutionFinished((ActivityExecutionFinishedNotification<Activity, EClassifier>) notification);
			break;
		case ACTIVITY_EXECUTION_STARTED:
			activityExecutionStarted((ActivityExecutionStartedNotification<Activity, EClassifier>) notification);
			indent++;
			break;
		case ACTIVITY_NODE_EXECUTION_FINISHED:
			indent--;
			activityNodeExecutionFinished((ActivityNodeExecutionFinishedNotification<ActivityNode, EClassifier>) notification);
			break;
		case ACTIVITY_NODE_EXECUTION_STARTED:
			activityNodeExecutionStarted((ActivityNodeExecutionStartedNotification<ActivityNode, EClassifier>) notification);
			indent++;
			break;
		case ATTRIBUTE_VALUE_SET:
			attributeValueSet((AttributeValueSetNotification<AbstractVariable, EClassifier, EStructuralFeature>) notification);
			break;
		case EVALUATED_EXPRESSION:
			indent--;
			evaluatedExpression((EvaluatedExpressionNotification<EClassifier, Expression>) notification);
			break;
		case EVALUATING_EXPRESSION:
			evaluatingExpression((EvaluatingExpressionNotification<EClassifier, Expression>) notification);
			indent++;
			break;
		case INSTANCE_LINK_CREATED:
			instanceLinkCreated((InstanceLinkCreatedNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case INSTANCE_LINK_DESTROYED:
			instanceLinkDestroyed((InstanceLinkDestroyedNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case INSTANCE_OBJECT_CREATED:
			instanceObjectCreated((InstanceObjectCreatedNotification<AbstractVariable, EClassifier>) notification);
			break;
		case INSTANCE_OBJECT_DESTROYED:
			instanceObjectDestroyed((InstanceObjectDestroyedNotification<AbstractVariable, EClassifier>) notification);
			break;
		case LINK_CHECK_FAILED:
			linkCheckFailed((LinkCheckFailedNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case LINK_CHECK_SUCCESSFUL:
			linkCheckSuccessful((LinkCheckSuccessfulNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case STORY_PATTERN_APPLICATION_FINISHED:
			indent--;
			storyPatternApplicationFinished((StoryPatternApplicationFinishedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_APPLICATION_STARTED:
			storyPatternApplicationStarted((StoryPatternApplicationStartedNotification<StoryPattern, EClassifier>) notification);
			indent++;
			break;
		case STORY_PATTERN_INITIALIZATION_FINISHED:
			indent--;
			storyPatternInitializationFinished((StoryPatternInitializationFinishedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_INITIALIZATION_STARTED:
			storyPatternInitializationStarted((StoryPatternInitializationStartedNotification<StoryPattern, EClassifier>) notification);
			indent++;
			break;
		case STORY_PATTERN_MATCHING_FAILED:
			storyPatternMatchingFailed((StoryPatternMatchingFailedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_MATCHING_STARTED:
			storyPatternMatchingStarted((StoryPatternMatchingStartedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_MATCHING_SUCCESSFUL:
			storyPatternMatchingSuccessful((StoryPatternMatchingSuccessfulNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_OBJECT_BINDING_REVOKED:
			storyPatternObjectBindingRevoked((StoryPatternObjectBindingRevokedNotification<AbstractVariable, EClassifier>) notification);
			break;
		case STORY_PATTERN_OBJECT_BOUND:
			storyPatternObjectBound((StoryPatternObjectBoundNotification<AbstractVariable, EClassifier>) notification);
			break;
		case STORY_PATTERN_OBJECT_NOT_BOUND:
			storyPatternObjectNotBound((StoryPatternObjectNotBoundNotification<AbstractVariable, EClassifier>) notification);
			break;
		case TRAVERSING_ACTIVITY_EDGE:
			traversingActivityEdge((TraversingActivityEdgeNotification<ActivityEdge, EClassifier>) notification);
			break;
		case TRAVERSING_LINK:
			traversingLink((TraversingLinkNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case VARIABLE_CREATED:
			variableCreated((VariableCreatedNotification<EClassifier>) notification);
			break;
		case VARIABLE_DELETED:
			variableDeleted((VariableDeletedNotification<EClassifier>) notification);
			break;
		case VARIABLE_VALUE_CHANGED:
			variableValueChanged((VariableValueChangedNotification<EClassifier>) notification);
			break;
		case STORY_PATTERN_CONSTRAINT_HOLDS:
			storyPatternConstraintHolds((StoryPatternConstraintHoldsNotification<StoryPattern, EClassifier, Expression>) notification);
			break;
		case STORY_PATTERN_CONSTRAINT_VIOLATED:
			storyPatternConstraintViolated((StoryPatternConstraintViolatedNotification<StoryPattern, EClassifier, Expression>) notification);
			break;
		case STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
			storyPatternObjectConstraintHolds((StoryPatternObjectConstraintHoldsNotification<AbstractVariable, EClassifier, Expression>) notification);
			break;
		case STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
			storyPatternObjectConstraintViolated((StoryPatternObjectConstraintViolatedNotification<AbstractVariable, EClassifier, Expression>) notification);
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

	private void activityExecutionFinished(ActivityExecutionFinishedNotification<Activity, EClassifier> notification) {
		debug("Finished execution of %1s.", notification.getActivity());
	}

	private void activityNodeExecutionFinished(
			ActivityNodeExecutionFinishedNotification<ActivityNode, EClassifier> notification) {
		debug("Finished execution of %1s.", notification.getActivityNode());
	}

	private void attributeValueSet(
			AttributeValueSetNotification<AbstractVariable, EClassifier, EStructuralFeature> notification) {
		debug("Attribute '%1s.%2s' set to '%3s' ($4s: $5s)", notification.getStoryPatternObject(),
				notification.getFeature(), notification.getFeatureValue(), notification.getInstanceObject(),notification.getFeature());
	}

	private void evaluatedExpression(EvaluatedExpressionNotification<EClassifier, Expression> notification) {
		debug("Evaluated expression '%1s' to '%2s'.", notification.getExpression(), notification.getResult());
	}

	private void instanceLinkCreated(
			InstanceLinkCreatedNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		debug("Instance link '%1s' created from '%2s' to '%3s' (%4s: '%5s', %6s: '%7s')", notification.getLink(),
				notification.getSourceStoryPatternObject(), notification.getSourceObject(),
				notification.getTargetStoryPatternObject(), notification.getTargetObject(),
				notification.getTargetStoryPatternObject(), notification.getTargetObject());
	}

	private void instanceLinkDestroyed(
			InstanceLinkDestroyedNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		debug("Instance link '%1s' destroyed from '%2s' to '%3s' (%4s: '%5s', %6s: '%7s')", notification.getLink(),
				notification.getSourceStoryPatternObject(), notification.getSourceObject(),
				notification.getTargetStoryPatternObject(), notification.getTargetObject(),
				notification.getTargetStoryPatternObject(), notification.getTargetObject());
	}

	private void instanceObjectCreated(InstanceObjectCreatedNotification<AbstractVariable, EClassifier> notification) {
		debug("Instance object created for '" + notification.getStoryPatternObject() + "': "
				+ notification.getInstanceObject());
	}

	private void instanceObjectDestroyed(InstanceObjectDestroyedNotification<AbstractVariable, EClassifier> notification) {
		debug("Instance object destroyed for '" + notification.getStoryPatternObject() + "': "
				+ notification.getInstanceObject());
	};

	private void storyPatternApplicationFinished(
			StoryPatternApplicationFinishedNotification<StoryPattern, EClassifier> notification) {
		debug("Finished application of %1s.", notification.getStoryPattern());

	}

	private void storyPatternInitializationFinished(
			StoryPatternInitializationFinishedNotification<StoryPattern, EClassifier> notification) {
		debug("Finished initialization of story pattern '%1s'", notification.getStoryPattern());
	}

	private void storyPatternInitializationStarted(
			StoryPatternInitializationStartedNotification<StoryPattern, EClassifier> notification) {
		debug("Starting initialization of story pattern '%1s'.", notification.getStoryPattern());
	}

	private void variableCreated(VariableCreatedNotification<EClassifier> notification) {
		debug("Created variable %1s : %2s = %3s.", notification.getVariable().getName(), notification.getVariable()
				.getClassifier(), notification.getVariable().getValue());
	};

	private void variableDeleted(VariableDeletedNotification<EClassifier> notification) {
		debug("Deleted variable '%1s'.", notification.getVariable().getName());
	};

	private void variableValueChanged(VariableValueChangedNotification<EClassifier> notification) {
		debug("Variable value changed: %1s: %2s -> %3s", notification.getVariable().getName(),
				notification.getOldValue(), notification.getVariable().getValue());
	}

	private void activityExecutionStarted(ActivityExecutionStartedNotification<Activity, EClassifier> notification) {
		info("Starting execution of %1s...", notification.getActivity());
	}

	private void activityNodeExecutionStarted(
			ActivityNodeExecutionStartedNotification<ActivityNode, EClassifier> notification) {
		wrap();
		info("Starting execution of %1s...", notification.getActivityNode());
	}

	private void evaluatingExpression(EvaluatingExpressionNotification<EClassifier, Expression> notification) {
		info("Evaluating expression '%1s'...", notification.getExpression());
	}

	private void storyPatternApplicationStarted(
			StoryPatternApplicationStartedNotification<StoryPattern, EClassifier> notification) {
		wrap();
		info("Starting application of %1s...", notification.getStoryPattern());
	}

	private void storyPatternMatchingStarted(
			StoryPatternMatchingStartedNotification<StoryPattern, EClassifier> notification) {
		info("Starting matching of %1s...", notification.getStoryPattern());
	}

	private void traversingActivityEdge(TraversingActivityEdgeNotification<ActivityEdge, EClassifier> notification) {
		ActivityEdge edge = notification.getActivityEdge();
		wrap();
		info("Traversing %1s from %2s to %3s...", edge, edge.getSource(), edge.getTarget());
	}

	private void traversingLink(
			TraversingLinkNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		wrap();
		info("Traversing link '%1s' from '%2s' to '%3s'...", notification.getLink(),
				notification.getSourceStoryPatternObject(), notification.getTargetStoryPatternObject());
		wrap();
	}

	private void storyPatternObjectBound(StoryPatternObjectBoundNotification<AbstractVariable, EClassifier> notification) {
		wrap();
		succeeded("Bound story pattern object '%1s' to '%2s'.", notification.getStoryPatternObject(),
				notification.getInstanceObject());
	}

	private void wrap() {
		console.wrap();
	}

	private void linkCheckFailed(
			LinkCheckFailedNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		failed("Link check failed: '%1s' from '%2s' to '%3s' (source: '%4s', target: '%5s').", notification.getLink(),
				notification.getSourceStoryPatternObject(), notification.getTargetStoryPatternObject(),
				notification.getSourceObject(), notification.getTargetObject());
	}

	private void storyPatternMatchingFailed(
			StoryPatternMatchingFailedNotification<StoryPattern, EClassifier> notification) {
		failed("Matching of story pattern '%1s' failed.", notification.getStoryPattern());
	}

	private void storyPatternObjectBindingRevoked(
			StoryPatternObjectBindingRevokedNotification<AbstractVariable, EClassifier> notification) {
		failed("Binding revoked for story pattern object '%1s', was bound to '%2s'.",
				notification.getStoryPatternObject(), notification.getInstanceObject());
	}

	private void storyPatternObjectNotBound(
			StoryPatternObjectNotBoundNotification<AbstractVariable, EClassifier> notification) {
		failed("Could not bind object variable '%1s'.", notification.getStoryPatternObject());
	}

	private void storyPatternConstraintViolated(
			StoryPatternConstraintViolatedNotification<StoryPattern, EClassifier, Expression> notification) {
		failed("Constraint '%1s' is violated on story pattern '%2s'.", notification.getConstraint(),
				notification.getStoryPattern());
	}

	private void storyPatternObjectConstraintViolated(
			StoryPatternObjectConstraintViolatedNotification<AbstractVariable, EClassifier, Expression> notification) {
		failed("Constraint '%1s' is violated on story pattern object '%2s'.", notification.getConstraint(),
				notification.getStoryPatternObject());
	}

	private void linkCheckSuccessful(
			LinkCheckSuccessfulNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		succeeded("Link check successful: '%1s' from '%2s' to '%3s' (source: '%4s', target: '%5s').",
				notification.getLink(), notification.getSourceStoryPatternObject(),
				notification.getTargetStoryPatternObject(), notification.getSourceObject(),
				notification.getTargetObject());
	}

	private void storyPatternMatchingSuccessful(
			StoryPatternMatchingSuccessfulNotification<StoryPattern, EClassifier> notification) {
		succeeded("Matching of story pattern '%1s' succeeded.", notification.getStoryPattern());
	}

	private void storyPatternConstraintHolds(
			StoryPatternConstraintHoldsNotification<StoryPattern, EClassifier, Expression> notification) {
		succeeded("Constraint '%1s' holds on story pattern '%2s'.", notification.getConstraint(),
				notification.getStoryPattern());
	}

	private void storyPatternObjectConstraintHolds(
			StoryPatternObjectConstraintHoldsNotification<AbstractVariable, EClassifier, Expression> notification) {
		succeeded("Constraint '%1s' holds on story pattern object '%2s'.", notification.getConstraint(),
				notification.getStoryPatternObject());
	}

	private void debug(String format, Object... args) {
		append(StreamType.DEBUG, format, args);
	}

	private void failed(String format, Object... args) {
		append(StreamType.FAILURE, format, args);
	}

	private void info(String format, Object... args) {
		append(StreamType.INFO, format, args);
	}

	private void succeeded(String format, Object... args) {
		append(StreamType.SUCCESS, format, args);
	}

	private void append(StreamType type, String format, Object[] args) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < indent; i++) {
			builder.append("  "); //$NON-NLS-1$
		}
		builder.append(format);

		if (args == null) {
			console.append(type, builder.toString());
		} else {
			Object[] translated = new Object[args.length];
			for (int i = 0; i < translated.length; i++) {
				translated[i] = Texts.get(args[i]);
			}
			console.append(type, String.format(builder.toString(), translated));
		}
	}
}
