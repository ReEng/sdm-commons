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
 *   <li>{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isAtLeastOne <em>At Least One</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getCollectionVariable()
 * @model
 * @generated
 */
public interface CollectionVariable extends ObjectVariable {
	/**
	 * Returns the value of the '<em><b>At Least One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Least One</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Least One</em>' attribute.
	 * @see #setAtLeastOne(boolean)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getCollectionVariable_AtLeastOne()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAtLeastOne();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isAtLeastOne <em>At Least One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Least One</em>' attribute.
	 * @see #isAtLeastOne()
	 * @generated
	 */
	void setAtLeastOne(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getCollectionVariable_Unique()
	 * @model default="" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // CollectionVariable
