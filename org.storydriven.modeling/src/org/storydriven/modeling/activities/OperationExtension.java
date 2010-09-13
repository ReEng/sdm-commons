/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.ecore.EOperation;

import org.storydriven.modeling.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getOperationExtension()
 * @model
 * @generated
 */
public interface OperationExtension extends Extension
{
   /**
    * Returns the value of the '<em><b>Owned Activity</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.activities.Activity#getOwningOperation <em>Owning Operation</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Activity</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Activity</em>' containment reference.
    * @see #setOwnedActivity(Activity)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getOperationExtension_OwnedActivity()
    * @see org.storydriven.modeling.activities.Activity#getOwningOperation
    * @model opposite="owningOperation" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Activity getOwnedActivity ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Owned Activity</em>' containment reference.
    * @see #getOwnedActivity()
    * @generated
    */
   void setOwnedActivity (Activity value);

} // OperationExtension
