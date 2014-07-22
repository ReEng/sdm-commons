/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Final Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * At a StopNode, the execution of an activity terminates. If the activity specifies any out-parameters, they have to be bound to a return expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityFinalNode#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityFinalNode#getReturnValues <em>Return Values</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityFinalNode#isSuccess <em>Success</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityFinalNode()
 * @model
 * @generated
 */
public interface ActivityFinalNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenience method when dealing with activities that implement an EOperation. In this case, only one out parameter is supported. This attributes then returns the first out parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value</em>' reference.
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityFinalNode_ReturnValue()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Expression getReturnValue();

	/**
	 * Returns the value of the '<em><b>Return Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the return values of the activity. These return values will be assigned to the out-parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Values</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityFinalNode_ReturnValues()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getReturnValues();

	/**
	 * Returns the value of the '<em><b>Success</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' attribute.
	 * @see #setSuccess(boolean)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityFinalNode_Success()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSuccess();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ActivityFinalNode#isSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' attribute.
	 * @see #isSuccess()
	 * @generated
	 */
	void setSuccess(boolean value);

} // ActivityFinalNode
