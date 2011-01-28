/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.calls.Callable;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operation Extension</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.OperationExtension#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getOperationExtension()
 * @model
 * @generated
 */
public interface OperationExtension extends Extension, Callable
{
   /**
    * Returns the value of the '<em><b>Operation</b></em>' reference.
    * <p>
    * This feature redefines the following features:
    * <ul>
    *   <li>'{@link org.storydriven.modeling.Extension#getBase() <em>Base</em>}'</li>
    * </ul>
    * </p>
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operation</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operation</em>' reference.
    * @see #isSetOperation()
    * @see #unsetOperation()
    * @see #setOperation(EOperation)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getOperationExtension_Operation()
    * @model resolveProxies="false" unsettable="true" transient="true" volatile="true" derived="true" ordered="false"
    * @generated
    */
   EOperation getOperation ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.OperationExtension#getOperation <em>Operation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Operation</em>' reference.
    * @see #getOperation()
    * @generated
    */
   void setOperation (EOperation value);

   /**
    * Unsets the value of the '{@link org.storydriven.modeling.activities.OperationExtension#getOperation <em>Operation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isSetOperation()
    * @see #getOperation()
    * @see #setOperation(EOperation)
    * @generated
    */
   void unsetOperation ();

   /**
    * Returns whether the value of the '{@link org.storydriven.modeling.activities.OperationExtension#getOperation <em>Operation</em>}' reference is set.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return whether the value of the '<em>Operation</em>' reference is set.
    * @see #unsetOperation()
    * @see #getOperation()
    * @see #setOperation(EOperation)
    * @generated
    */
   boolean isSetOperation ();

   /**
    * Returns the value of the '<em><b>Owned Activity</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.activities.Activity#getOwningOperation <em>Owning Operation</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Activity</em>' containment reference isn't clear, there really should be more of a description here...
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

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> self.oclAsType(Callable).out->size() <= 1
    * 
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information. <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(Callable).out->size() <= 1'"
    * @generated
    */
   boolean NumberOfOutParams (DiagnosticChain diagnostics, Map<Object, Object> context);

} // OperationExtension
