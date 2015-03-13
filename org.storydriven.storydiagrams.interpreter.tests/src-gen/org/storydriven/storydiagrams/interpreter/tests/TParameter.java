/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TParameter</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TParameter#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='false'"
 * @generated
 */
public interface TParameter extends TTyped {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getParameters <em>Parameters</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(TMethod)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTParameter_Method()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	TMethod getMethod();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TParameter#getMethod
	 * <em>Method</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(TMethod value);

} // TParameter
