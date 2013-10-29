/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Callable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OpaqueCallable represents an external method which is not explicitly modeled (e.g. a method in an external library). Because it is not contained anywhere in the model it is directly referenced by and contained in the MethodCallExpression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.calls.OpaqueCallable#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.OpaqueCallable#getCallExpression <em>Call Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.calls.CallsPackage#getOpaqueCallable()
 * @model
 * @generated
 */
public interface OpaqueCallable extends Callable {
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
	 * @see org.storydriven.storydiagrams.calls.CallsPackage#getOpaqueCallable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.calls.OpaqueCallable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Call Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.calls.expressions.MethodCallExpression#getOpaqueCallable <em>Opaque Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Expression</em>' container reference.
	 * @see #setCallExpression(MethodCallExpression)
	 * @see org.storydriven.storydiagrams.calls.CallsPackage#getOpaqueCallable_CallExpression()
	 * @see org.storydriven.storydiagrams.calls.expressions.MethodCallExpression#getOpaqueCallable
	 * @model opposite="opaqueCallable" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MethodCallExpression getCallExpression();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.calls.OpaqueCallable#getCallExpression <em>Call Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Expression</em>' container reference.
	 * @see #getCallExpression()
	 * @generated
	 */
	void setCallExpression(MethodCallExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(Callable).out->size() <= 1'"
	 * @generated
	 */
	boolean NumberOfOutParams(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // OpaqueCallable
