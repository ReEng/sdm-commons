/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ActivityEdge represents the control flow in an activity. It is a dericted connection from one activity to another one. There exist different kinds of activity edges which are differentiated by the guard attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExceptions <em>Guard Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge()
 * @model
 * @generated
 */
public interface ActivityEdge extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.activities.ActivityNode#getIncomings <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target node of this ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge_Target()
	 * @see org.storydriven.storydiagrams.activities.ActivityNode#getIncomings
	 * @model opposite="incoming" required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.activities.ActivityNode#getOutgoings <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source node of this ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge_Source()
	 * @see org.storydriven.storydiagrams.activities.ActivityNode#getOutgoings
	 * @model opposite="outgoing" required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Owning Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.activities.Activity#getOwnedActivityEdges <em>Owned Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to the activity this ActivityEdge is contained in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Activity</em>' container reference.
	 * @see #setOwningActivity(Activity)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge_OwningActivity()
	 * @see org.storydriven.storydiagrams.activities.Activity#getOwnedActivityEdges
	 * @model opposite="ownedActivityEdge" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Activity getOwningActivity();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Activity</em>' container reference.
	 * @see #getOwningActivity()
	 * @generated
	 */
	void setOwningActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.activities.EdgeGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard defines the kind of the activity edge. The possible kinds of guards are specified by the EdgeGuard enum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see org.storydriven.storydiagrams.activities.EdgeGuard
	 * @see #setGuard(EdgeGuard)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge_Guard()
	 * @model default="NONE" required="true" ordered="false"
	 * @generated
	 */
	EdgeGuard getGuard();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see org.storydriven.storydiagrams.activities.EdgeGuard
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(EdgeGuard value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to an expression in case the transition guard is BOOL. The expression has to evaulate to a boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Expression</em>' containment reference.
	 * @see #setGuardExpression(Expression)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge_GuardExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getGuardExpression();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExpression <em>Guard Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' containment reference.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Guard Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.activities.ExceptionVariable}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declares variables representing the Exceptions that lead to firing this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Exception</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getActivityEdge_GuardException()
	 * @see org.storydriven.storydiagrams.activities.ExceptionVariable#getActivityEdge
	 * @model opposite="activityEdge" containment="true"
	 * @generated
	 */
	EList<ExceptionVariable> getGuardExceptions();

} // ActivityEdge
