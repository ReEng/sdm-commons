/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation Callable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.EOperationCallable#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.EOperationCallable#getEOperation <em>EOperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.calls.CallsPackage#getEOperationCallable()
 * @model
 * @generated
 */
public interface EOperationCallable extends Callable
{
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.storydriven.modeling.calls.CallsPackage#getEOperationCallable_Name()
    * @model required="true" ordered="false"
    * @generated
    */
   String getName ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.calls.EOperationCallable#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName (String value);

   /**
    * Returns the value of the '<em><b>EOperation</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EOperation</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>EOperation</em>' containment reference.
    * @see #setEOperation(EOperation)
    * @see org.storydriven.modeling.calls.CallsPackage#getEOperationCallable_EOperation()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   EOperation getEOperation ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.calls.EOperationCallable#getEOperation <em>EOperation</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>EOperation</em>' containment reference.
    * @see #getEOperation()
    * @generated
    */
   void setEOperation (EOperation value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * self.oclAsType(Callable).out->size() <= 1
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(Callable).out->size() <= 1'"
    * @generated
    */
   boolean NumberOfOutParams (DiagnosticChain diagnostics, Map<Object, Object> context);

} // EOperationCallable
