/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet;
import de.mdelab.sdm.interpreter.core.executionTrace.Execution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.ExpressionEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkCreation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkDeletion;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectCreation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectDeletion;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectModification;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckFailed;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckSuccessful;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternApplication;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintHolds;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternInitialization;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBound;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintHolds;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectNotBound;
import de.mdelab.sdm.interpreter.core.executionTrace.TraversingLink;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableChanged;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableCreated;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableDeleted;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableModification;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage
 * @generated
 */
public class ExecutionTraceSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ExecutionTracePackage	modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ExecutionTraceSwitch()
	{
		if (ExecutionTraceSwitch.modelPackage == null)
		{
			ExecutionTraceSwitch.modelPackage = ExecutionTracePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(final EPackage ePackage)
	{
		return ePackage == ExecutionTraceSwitch.modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	@Override
	protected T doSwitch(final int classifierID, final EObject theEObject)
	{
		switch (classifierID)
		{
			case ExecutionTracePackage.MAP_ENTRY:
			{
				@SuppressWarnings("unchecked")
				final Map.Entry<?, ?> mapEntry = (Map.Entry<?, ?>) theEObject;
				T result = this.caseMapEntry(mapEntry);
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.EXECUTION_TRACE:
			{
				final ExecutionTrace executionTrace = (ExecutionTrace) theEObject;
				T result = this.caseExecutionTrace(executionTrace);
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.EXECUTION:
			{
				final Execution execution = (Execution) theEObject;
				T result = this.caseExecution(execution);
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.ACTIVITY_EXECUTION:
			{
				final ActivityExecution<?> activityExecution = (ActivityExecution<?>) theEObject;
				T result = this.caseActivityExecution(activityExecution);
				if (result == null)
				{
					result = this.caseExecution(activityExecution);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.ACTIVITY_NODE_EXECUTION:
			{
				final ActivityNodeExecution<?> activityNodeExecution = (ActivityNodeExecution<?>) theEObject;
				T result = this.caseActivityNodeExecution(activityNodeExecution);
				if (result == null)
				{
					result = this.caseExecution(activityNodeExecution);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL:
			{
				final ActivityEdgeTraversal<?> activityEdgeTraversal = (ActivityEdgeTraversal<?>) theEObject;
				T result = this.caseActivityEdgeTraversal(activityEdgeTraversal);
				if (result == null)
				{
					result = this.caseExecution(activityEdgeTraversal);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_EXECUTION:
			{
				final StoryPatternExecution<?> storyPatternExecution = (StoryPatternExecution<?>) theEObject;
				T result = this.caseStoryPatternExecution(storyPatternExecution);
				if (result == null)
				{
					result = this.caseExecution(storyPatternExecution);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_INITIALIZATION:
			{
				final StoryPatternInitialization<?> storyPatternInitialization = (StoryPatternInitialization<?>) theEObject;
				T result = this.caseStoryPatternInitialization(storyPatternInitialization);
				if (result == null)
				{
					result = this.caseStoryPatternExecution(storyPatternInitialization);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternInitialization);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_MATCHING:
			{
				final StoryPatternMatching<?> storyPatternMatching = (StoryPatternMatching<?>) theEObject;
				T result = this.caseStoryPatternMatching(storyPatternMatching);
				if (result == null)
				{
					result = this.caseStoryPatternExecution(storyPatternMatching);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternMatching);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_APPLICATION:
			{
				final StoryPatternApplication<?> storyPatternApplication = (StoryPatternApplication<?>) theEObject;
				T result = this.caseStoryPatternApplication(storyPatternApplication);
				if (result == null)
				{
					result = this.caseStoryPatternExecution(storyPatternApplication);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternApplication);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION:
			{
				final StoryPatternObjectExecution<?> storyPatternObjectExecution = (StoryPatternObjectExecution<?>) theEObject;
				T result = this.caseStoryPatternObjectExecution(storyPatternObjectExecution);
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectExecution);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BOUND:
			{
				final StoryPatternObjectBound<?> storyPatternObjectBound = (StoryPatternObjectBound<?>) theEObject;
				T result = this.caseStoryPatternObjectBound(storyPatternObjectBound);
				if (result == null)
				{
					result = this.caseStoryPatternObjectExecution(storyPatternObjectBound);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectBound);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_NOT_BOUND:
			{
				final StoryPatternObjectNotBound<?> storyPatternObjectNotBound = (StoryPatternObjectNotBound<?>) theEObject;
				T result = this.caseStoryPatternObjectNotBound(storyPatternObjectNotBound);
				if (result == null)
				{
					result = this.caseStoryPatternObjectExecution(storyPatternObjectNotBound);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectNotBound);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED:
			{
				final StoryPatternObjectBindingRevoked<?> storyPatternObjectBindingRevoked = (StoryPatternObjectBindingRevoked<?>) theEObject;
				T result = this.caseStoryPatternObjectBindingRevoked(storyPatternObjectBindingRevoked);
				if (result == null)
				{
					result = this.caseStoryPatternObjectExecution(storyPatternObjectBindingRevoked);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectBindingRevoked);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION:
			{
				final StoryPatternLinkExecution<?, ?> storyPatternLinkExecution = (StoryPatternLinkExecution<?, ?>) theEObject;
				T result = this.caseStoryPatternLinkExecution(storyPatternLinkExecution);
				if (result == null)
				{
					result = this.caseExecution(storyPatternLinkExecution);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.TRAVERSING_LINK:
			{
				final TraversingLink<?, ?> traversingLink = (TraversingLink<?, ?>) theEObject;
				T result = this.caseTraversingLink(traversingLink);
				if (result == null)
				{
					result = this.caseStoryPatternLinkExecution(traversingLink);
				}
				if (result == null)
				{
					result = this.caseExecution(traversingLink);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.LINK_CHECK:
			{
				final LinkCheck<?, ?> linkCheck = (LinkCheck<?, ?>) theEObject;
				T result = this.caseLinkCheck(linkCheck);
				if (result == null)
				{
					result = this.caseStoryPatternLinkExecution(linkCheck);
				}
				if (result == null)
				{
					result = this.caseExecution(linkCheck);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.LINK_CHECK_SUCCESSFUL:
			{
				final LinkCheckSuccessful<?, ?> linkCheckSuccessful = (LinkCheckSuccessful<?, ?>) theEObject;
				T result = this.caseLinkCheckSuccessful(linkCheckSuccessful);
				if (result == null)
				{
					result = this.caseLinkCheck(linkCheckSuccessful);
				}
				if (result == null)
				{
					result = this.caseStoryPatternLinkExecution(linkCheckSuccessful);
				}
				if (result == null)
				{
					result = this.caseExecution(linkCheckSuccessful);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.LINK_CHECK_FAILED:
			{
				final LinkCheckFailed<?, ?> linkCheckFailed = (LinkCheckFailed<?, ?>) theEObject;
				T result = this.caseLinkCheckFailed(linkCheckFailed);
				if (result == null)
				{
					result = this.caseLinkCheck(linkCheckFailed);
				}
				if (result == null)
				{
					result = this.caseStoryPatternLinkExecution(linkCheckFailed);
				}
				if (result == null)
				{
					result = this.caseExecution(linkCheckFailed);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.EXPRESSION_EVALUATION:
			{
				final ExpressionEvaluation<?> expressionEvaluation = (ExpressionEvaluation<?>) theEObject;
				T result = this.caseExpressionEvaluation(expressionEvaluation);
				if (result == null)
				{
					result = this.caseExecution(expressionEvaluation);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION:
			{
				final InstanceObjectModification<?> instanceObjectModification = (InstanceObjectModification<?>) theEObject;
				T result = this.caseInstanceObjectModification(instanceObjectModification);
				if (result == null)
				{
					result = this.caseExecution(instanceObjectModification);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.INSTANCE_OBJECT_CREATION:
			{
				final InstanceObjectCreation<?> instanceObjectCreation = (InstanceObjectCreation<?>) theEObject;
				T result = this.caseInstanceObjectCreation(instanceObjectCreation);
				if (result == null)
				{
					result = this.caseInstanceObjectModification(instanceObjectCreation);
				}
				if (result == null)
				{
					result = this.caseExecution(instanceObjectCreation);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.INSTANCE_OBJECT_DELETION:
			{
				final InstanceObjectDeletion<?> instanceObjectDeletion = (InstanceObjectDeletion<?>) theEObject;
				T result = this.caseInstanceObjectDeletion(instanceObjectDeletion);
				if (result == null)
				{
					result = this.caseInstanceObjectModification(instanceObjectDeletion);
				}
				if (result == null)
				{
					result = this.caseExecution(instanceObjectDeletion);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION:
			{
				final InstanceLinkModification<?, ?> instanceLinkModification = (InstanceLinkModification<?, ?>) theEObject;
				T result = this.caseInstanceLinkModification(instanceLinkModification);
				if (result == null)
				{
					result = this.caseExecution(instanceLinkModification);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.INSTANCE_LINK_CREATION:
			{
				final InstanceLinkCreation<?, ?> instanceLinkCreation = (InstanceLinkCreation<?, ?>) theEObject;
				T result = this.caseInstanceLinkCreation(instanceLinkCreation);
				if (result == null)
				{
					result = this.caseInstanceLinkModification(instanceLinkCreation);
				}
				if (result == null)
				{
					result = this.caseExecution(instanceLinkCreation);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.INSTANCE_LINK_DELETION:
			{
				final InstanceLinkDeletion<?, ?> instanceLinkDeletion = (InstanceLinkDeletion<?, ?>) theEObject;
				T result = this.caseInstanceLinkDeletion(instanceLinkDeletion);
				if (result == null)
				{
					result = this.caseInstanceLinkModification(instanceLinkDeletion);
				}
				if (result == null)
				{
					result = this.caseExecution(instanceLinkDeletion);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET:
			{
				final AttributeValueSet<?, ?> attributeValueSet = (AttributeValueSet<?, ?>) theEObject;
				T result = this.caseAttributeValueSet(attributeValueSet);
				if (result == null)
				{
					result = this.caseExecution(attributeValueSet);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.VARIABLE_MODIFICATION:
			{
				final VariableModification<?> variableModification = (VariableModification<?>) theEObject;
				T result = this.caseVariableModification(variableModification);
				if (result == null)
				{
					result = this.caseExecution(variableModification);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.VARIABLE_CREATED:
			{
				final VariableCreated<?> variableCreated = (VariableCreated<?>) theEObject;
				T result = this.caseVariableCreated(variableCreated);
				if (result == null)
				{
					result = this.caseVariableModification(variableCreated);
				}
				if (result == null)
				{
					result = this.caseExecution(variableCreated);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.VARIABLE_DELETED:
			{
				final VariableDeleted<?> variableDeleted = (VariableDeleted<?>) theEObject;
				T result = this.caseVariableDeleted(variableDeleted);
				if (result == null)
				{
					result = this.caseVariableModification(variableDeleted);
				}
				if (result == null)
				{
					result = this.caseExecution(variableDeleted);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.VARIABLE_CHANGED:
			{
				final VariableChanged<?> variableChanged = (VariableChanged<?>) theEObject;
				T result = this.caseVariableChanged(variableChanged);
				if (result == null)
				{
					result = this.caseVariableModification(variableChanged);
				}
				if (result == null)
				{
					result = this.caseExecution(variableChanged);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION:
			{
				final StoryPatternObjectConstraintEvaluation<?, ?> storyPatternObjectConstraintEvaluation = (StoryPatternObjectConstraintEvaluation<?, ?>) theEObject;
				T result = this.caseStoryPatternObjectConstraintEvaluation(storyPatternObjectConstraintEvaluation);
				if (result == null)
				{
					result = this.caseStoryPatternObjectExecution(storyPatternObjectConstraintEvaluation);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectConstraintEvaluation);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
			{
				final StoryPatternObjectConstraintHolds<?, ?> storyPatternObjectConstraintHolds = (StoryPatternObjectConstraintHolds<?, ?>) theEObject;
				T result = this.caseStoryPatternObjectConstraintHolds(storyPatternObjectConstraintHolds);
				if (result == null)
				{
					result = this.caseStoryPatternObjectConstraintEvaluation(storyPatternObjectConstraintHolds);
				}
				if (result == null)
				{
					result = this.caseStoryPatternObjectExecution(storyPatternObjectConstraintHolds);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectConstraintHolds);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
			{
				final StoryPatternObjectConstraintViolated<?, ?> storyPatternObjectConstraintViolated = (StoryPatternObjectConstraintViolated<?, ?>) theEObject;
				T result = this.caseStoryPatternObjectConstraintViolated(storyPatternObjectConstraintViolated);
				if (result == null)
				{
					result = this.caseStoryPatternObjectConstraintEvaluation(storyPatternObjectConstraintViolated);
				}
				if (result == null)
				{
					result = this.caseStoryPatternObjectExecution(storyPatternObjectConstraintViolated);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternObjectConstraintViolated);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_EVALUATION:
			{
				final StoryPatternConstraintEvaluation<?, ?> storyPatternConstraintEvaluation = (StoryPatternConstraintEvaluation<?, ?>) theEObject;
				T result = this.caseStoryPatternConstraintEvaluation(storyPatternConstraintEvaluation);
				if (result == null)
				{
					result = this.caseStoryPatternExecution(storyPatternConstraintEvaluation);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternConstraintEvaluation);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_HOLDS:
			{
				final StoryPatternConstraintHolds<?, ?> storyPatternConstraintHolds = (StoryPatternConstraintHolds<?, ?>) theEObject;
				T result = this.caseStoryPatternConstraintHolds(storyPatternConstraintHolds);
				if (result == null)
				{
					result = this.caseStoryPatternConstraintEvaluation(storyPatternConstraintHolds);
				}
				if (result == null)
				{
					result = this.caseStoryPatternExecution(storyPatternConstraintHolds);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternConstraintHolds);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			case ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_VIOLATED:
			{
				final StoryPatternConstraintViolated<?, ?> storyPatternConstraintViolated = (StoryPatternConstraintViolated<?, ?>) theEObject;
				T result = this.caseStoryPatternConstraintViolated(storyPatternConstraintViolated);
				if (result == null)
				{
					result = this.caseStoryPatternConstraintEvaluation(storyPatternConstraintViolated);
				}
				if (result == null)
				{
					result = this.caseStoryPatternExecution(storyPatternConstraintViolated);
				}
				if (result == null)
				{
					result = this.caseExecution(storyPatternConstraintViolated);
				}
				if (result == null)
				{
					result = this.defaultCase(theEObject);
				}
				return result;
			}
			default:
				return this.defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Map Entry</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <KeyType, ValueType> T caseMapEntry(final Map.Entry<KeyType, ValueType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Execution Trace</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Execution Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTrace(final ExecutionTrace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Execution</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(final Execution object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Activity Execution</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Activity Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ActivityType> T caseActivityExecution(final ActivityExecution<ActivityType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Activity Node Execution</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Activity Node Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ActivityNodeType> T caseActivityNodeExecution(final ActivityNodeExecution<ActivityNodeType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Activity Edge Traversal</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Activity Edge Traversal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ActivityEdgeType> T caseActivityEdgeTraversal(final ActivityEdgeTraversal<ActivityEdgeType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Execution</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternExecution(final StoryPatternExecution<StoryPatternType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Initialization</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternInitialization(final StoryPatternInitialization<StoryPatternType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Matching</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternMatching(final StoryPatternMatching<StoryPatternType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Application</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternApplication(final StoryPatternApplication<StoryPatternType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Execution</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectExecution(final StoryPatternObjectExecution<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Bound</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectBound(final StoryPatternObjectBound<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Not Bound</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Not Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectNotBound(final StoryPatternObjectNotBound<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Binding Revoked</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Binding Revoked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectBindingRevoked(
			final StoryPatternObjectBindingRevoked<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Link Execution</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Link Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseStoryPatternLinkExecution(
			final StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Traversing Link</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Traversing Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseTraversingLink(
			final TraversingLink<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Link Check</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Link Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseLinkCheck(
			final LinkCheck<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Link Check Successful</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Link Check Successful</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseLinkCheckSuccessful(
			final LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Link Check Failed</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Link Check Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseLinkCheckFailed(
			final LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Expression Evaluation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Expression Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ExpressionType> T caseExpressionEvaluation(final ExpressionEvaluation<ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance Object Modification</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance Object Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseInstanceObjectModification(final InstanceObjectModification<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance Object Creation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance Object Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseInstanceObjectCreation(final InstanceObjectCreation<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance Object Deletion</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance Object Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseInstanceObjectDeletion(final InstanceObjectDeletion<StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance Link Modification</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance Link Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseInstanceLinkModification(
			final InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance Link Creation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance Link Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseInstanceLinkCreation(
			final InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance Link Deletion</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance Link Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseInstanceLinkDeletion(
			final InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Attribute Value Set</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Attribute Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, FeatureType> T caseAttributeValueSet(final AttributeValueSet<StoryPatternObjectType, FeatureType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Modification</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableModification(final VariableModification<ClassifierType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Created</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Created</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableCreated(final VariableCreated<ClassifierType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Deleted</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Deleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableDeleted(final VariableDeleted<ClassifierType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Changed</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableChanged(final VariableChanged<ClassifierType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Constraint Evaluation</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Constraint Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> T caseStoryPatternObjectConstraintEvaluation(
			final StoryPatternObjectConstraintEvaluation<StoryPatternObjectType, ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Constraint Holds</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Constraint Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> T caseStoryPatternObjectConstraintHolds(
			final StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Object Constraint Violated</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Object Constraint Violated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> T caseStoryPatternObjectConstraintViolated(
			final StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Constraint Evaluation</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Constraint Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> T caseStoryPatternConstraintEvaluation(
			final StoryPatternConstraintEvaluation<StoryPatternType, ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Constraint Holds</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Constraint Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> T caseStoryPatternConstraintHolds(
			final StoryPatternConstraintHolds<StoryPatternType, ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Story Pattern Constraint Violated</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Story Pattern Constraint Violated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> T caseStoryPatternConstraintViolated(
			final StoryPatternConstraintViolated<StoryPatternType, ExpressionType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(final EObject object)
	{
		return null;
	}

} // ExecutionTraceSwitch
