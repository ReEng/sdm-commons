/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TMethod Call Statement</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement#getAccessedTarget <em>Accessed Target
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTMethodCallStatement()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='false'"
 * @generated
 */
public interface TMethodCallStatement extends TStatement {
	/**
	 * Returns the value of the '<em><b>Accessed Target</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed Target</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Accessed Target</em>' reference.
	 * @see #setAccessedTarget(TMethod)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTMethodCallStatement_AccessedTarget()
	 * @model required="true"
	 * @generated
	 */
	TMethod getAccessedTarget();

	/**
	 * Sets the value of the '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement#getAccessedTarget
	 * <em>Accessed Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Accessed Target</em>' reference.
	 * @see #getAccessedTarget()
	 * @generated
	 */
	void setAccessedTarget(TMethod value);

} // TMethodCallStatement
