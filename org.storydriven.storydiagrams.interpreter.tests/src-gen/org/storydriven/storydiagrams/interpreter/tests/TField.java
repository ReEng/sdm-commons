/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TField</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TField#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTField()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='false'"
 * @generated
 */
public interface TField extends TTyped {
	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.storydriven.storydiagrams.interpreter.tests.TType#getFields <em>Fields</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Type</em>' container reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containing Type</em>' container reference.
	 * @see #setContainingType(TType)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTField_ContainingType()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	TType getContainingType();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TField#getContainingType
	 * <em>Containing Type</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Containing Type</em>' container reference.
	 * @see #getContainingType()
	 * @generated
	 */
	void setContainingType(TType value);

} // TField
