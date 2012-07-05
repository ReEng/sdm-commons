/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a set of objects of the same type that are represented by a single node.
 * The context for contained Constraints and AttributeAssignments is every single object in the set. E.g., if the constraint is "name = 'abc'", only objects with that name are matched and added to the set. The use of the binding operator "CREATE" is not defined for ObjectSetVariables, i.e., the sets can only be matched and deleted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isMaybeEmpty <em>Maybe Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getCollectionVariable()
 * @model
 * @generated
 */
public interface CollectionVariable extends ObjectVariable {
	/**
	 * Returns the value of the '<em><b>Maybe Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maybe Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maybe Empty</em>' attribute.
	 * @see #setMaybeEmpty(boolean)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getCollectionVariable_MaybeEmpty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isMaybeEmpty();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isMaybeEmpty <em>Maybe Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maybe Empty</em>' attribute.
	 * @see #isMaybeEmpty()
	 * @generated
	 */
	void setMaybeEmpty(boolean value);

} // CollectionVariable
