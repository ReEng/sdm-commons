/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;
import org.storydriven.core.NamedElement;
import org.storydriven.core.TypedElement;
import org.storydriven.storydiagrams.Variable;
import org.storydriven.storydiagrams.activities.*;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.ExceptionVariable;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.OperationExtension;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.Invocation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = ActivitiesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ActivitiesPackage.EXCEPTION_VARIABLE: {
			ExceptionVariable exceptionVariable = (ExceptionVariable) theEObject;
			T result = caseExceptionVariable(exceptionVariable);
			if (result == null)
				result = caseVariable(exceptionVariable);
			if (result == null)
				result = caseTypedElement(exceptionVariable);
			if (result == null)
				result = caseExtendableElement(exceptionVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.ACTIVITY_EDGE: {
			ActivityEdge activityEdge = (ActivityEdge) theEObject;
			T result = caseActivityEdge(activityEdge);
			if (result == null)
				result = caseExtendableElement(activityEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.ACTIVITY_NODE: {
			ActivityNode activityNode = (ActivityNode) theEObject;
			T result = caseActivityNode(activityNode);
			if (result == null)
				result = caseNamedElement(activityNode);
			if (result == null)
				result = caseCommentableElement(activityNode);
			if (result == null)
				result = caseExtendableElement(activityNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseCallable(activity);
			if (result == null)
				result = caseNamedElement(activity);
			if (result == null)
				result = caseCommentableElement(activity);
			if (result == null)
				result = caseExtendableElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.OPERATION_EXTENSION: {
			OperationExtension operationExtension = (OperationExtension) theEObject;
			T result = caseOperationExtension(operationExtension);
			if (result == null)
				result = caseExtension(operationExtension);
			if (result == null)
				result = caseCallable(operationExtension);
			if (result == null)
				result = caseCommentableElement(operationExtension);
			if (result == null)
				result = caseExtendableElement(operationExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.MATCHING_STORY_NODE: {
			MatchingStoryNode matchingStoryNode = (MatchingStoryNode) theEObject;
			T result = caseMatchingStoryNode(matchingStoryNode);
			if (result == null)
				result = caseStoryNode(matchingStoryNode);
			if (result == null)
				result = caseActivityNode(matchingStoryNode);
			if (result == null)
				result = caseNamedElement(matchingStoryNode);
			if (result == null)
				result = caseCommentableElement(matchingStoryNode);
			if (result == null)
				result = caseExtendableElement(matchingStoryNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.STORY_NODE: {
			StoryNode storyNode = (StoryNode) theEObject;
			T result = caseStoryNode(storyNode);
			if (result == null)
				result = caseActivityNode(storyNode);
			if (result == null)
				result = caseNamedElement(storyNode);
			if (result == null)
				result = caseCommentableElement(storyNode);
			if (result == null)
				result = caseExtendableElement(storyNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.STRUCTURED_NODE: {
			StructuredNode structuredNode = (StructuredNode) theEObject;
			T result = caseStructuredNode(structuredNode);
			if (result == null)
				result = caseActivityNode(structuredNode);
			if (result == null)
				result = caseNamedElement(structuredNode);
			if (result == null)
				result = caseCommentableElement(structuredNode);
			if (result == null)
				result = caseExtendableElement(structuredNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.JUNCTION_NODE: {
			JunctionNode junctionNode = (JunctionNode) theEObject;
			T result = caseJunctionNode(junctionNode);
			if (result == null)
				result = caseActivityNode(junctionNode);
			if (result == null)
				result = caseNamedElement(junctionNode);
			if (result == null)
				result = caseCommentableElement(junctionNode);
			if (result == null)
				result = caseExtendableElement(junctionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.INITIAL_NODE: {
			InitialNode initialNode = (InitialNode) theEObject;
			T result = caseInitialNode(initialNode);
			if (result == null)
				result = caseActivityNode(initialNode);
			if (result == null)
				result = caseNamedElement(initialNode);
			if (result == null)
				result = caseCommentableElement(initialNode);
			if (result == null)
				result = caseExtendableElement(initialNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.STATEMENT_NODE: {
			StatementNode statementNode = (StatementNode) theEObject;
			T result = caseStatementNode(statementNode);
			if (result == null)
				result = caseActivityNode(statementNode);
			if (result == null)
				result = caseNamedElement(statementNode);
			if (result == null)
				result = caseCommentableElement(statementNode);
			if (result == null)
				result = caseExtendableElement(statementNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.ACTIVITY_FINAL_NODE: {
			ActivityFinalNode activityFinalNode = (ActivityFinalNode) theEObject;
			T result = caseActivityFinalNode(activityFinalNode);
			if (result == null)
				result = caseActivityNode(activityFinalNode);
			if (result == null)
				result = caseNamedElement(activityFinalNode);
			if (result == null)
				result = caseCommentableElement(activityFinalNode);
			if (result == null)
				result = caseExtendableElement(activityFinalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.ACTIVITY_CALL_NODE: {
			ActivityCallNode activityCallNode = (ActivityCallNode) theEObject;
			T result = caseActivityCallNode(activityCallNode);
			if (result == null)
				result = caseActivityNode(activityCallNode);
			if (result == null)
				result = caseInvocation(activityCallNode);
			if (result == null)
				result = caseNamedElement(activityCallNode);
			if (result == null)
				result = caseCommentableElement(activityCallNode);
			if (result == null)
				result = caseExtendableElement(activityCallNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.MODIFYING_STORY_NODE: {
			ModifyingStoryNode modifyingStoryNode = (ModifyingStoryNode) theEObject;
			T result = caseModifyingStoryNode(modifyingStoryNode);
			if (result == null)
				result = caseStoryNode(modifyingStoryNode);
			if (result == null)
				result = caseActivityNode(modifyingStoryNode);
			if (result == null)
				result = caseNamedElement(modifyingStoryNode);
			if (result == null)
				result = caseCommentableElement(modifyingStoryNode);
			if (result == null)
				result = caseExtendableElement(modifyingStoryNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivitiesPackage.FLOW_FINAL_NODE: {
			FlowFinalNode flowFinalNode = (FlowFinalNode) theEObject;
			T result = caseFlowFinalNode(flowFinalNode);
			if (result == null)
				result = caseActivityFinalNode(flowFinalNode);
			if (result == null)
				result = caseActivityNode(flowFinalNode);
			if (result == null)
				result = caseNamedElement(flowFinalNode);
			if (result == null)
				result = caseCommentableElement(flowFinalNode);
			if (result == null)
				result = caseExtendableElement(flowFinalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionVariable(ExceptionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationExtension(OperationExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Story Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingStoryNode(MatchingStoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryNode(StoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredNode(StructuredNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunctionNode(JunctionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementNode(StatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Call Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Call Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityCallNode(ActivityCallNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifying Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifying Story Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyingStoryNode(ModifyingStoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallable(Callable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocation(Invocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActivitiesSwitch
