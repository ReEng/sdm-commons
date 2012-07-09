/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TMethod</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getContainingType <em>Containing Type</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTMethod()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='false'"
 * @generated
 */
public interface TMethod extends TTyped {
	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.storydriven.storydiagrams.interpreter.tests.TType#getMethods <em>Methods</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Type</em>' container reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containing Type</em>' container reference.
	 * @see #setContainingType(TType)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTMethod_ContainingType()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	TType getContainingType();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getContainingType
	 * <em>Containing Type</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Containing Type</em>' container reference.
	 * @see #getContainingType()
	 * @generated
	 */
	void setContainingType(TType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TParameter}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TParameter#getMethod <em>Method</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTMethod_Parameters()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<TParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TStatement}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTMethod_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TStatement> getStatements();

} // TMethod
