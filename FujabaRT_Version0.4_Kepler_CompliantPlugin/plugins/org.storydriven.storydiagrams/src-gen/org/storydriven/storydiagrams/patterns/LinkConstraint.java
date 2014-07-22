/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns;

import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Link constraints (formerly known as MultiLinks in old meta-model) constrain the ordering of links of the referencingObject is a collection. This way objects can be required to have a certain position in the collection (FIRST, LAST, INDEX) or a certain ordering relative to each other (DIRECT_SUCCESSOR, INDIRECT_SUCCESSOR). While the first kind of LinkConstraint can be imposed upon a single link, the second kind requires two links that are related to each other (e.g., have the same referencingObject).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getIndex <em>Index</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.LinkConstraint#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getFirstLink <em>First Link</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint()
 * @model
 * @generated
 */
public interface LinkConstraint extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The index of the linked object in the collection. The semantics of this attribute is only defined if the constraintType of the LinkConstraint is INDEX.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint_Index()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * The default value is <code>"NEXT"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.patterns.LinkConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint type of the LinkConstraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraintType
	 * @see #setConstraintType(LinkConstraintType)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint_ConstraintType()
	 * @model default="NEXT" required="true" ordered="false"
	 * @generated
	 */
	LinkConstraintType getConstraintType();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraintType
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(LinkConstraintType value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the negative attribute is true, the link constraint may not be fulfilled for the complete pattern application to be successful.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(boolean)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint_Negative()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

	/**
	 * Returns the value of the '<em><b>First Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getFirstLinkConstraints <em>First Link Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Link</em>' reference.
	 * @see #setFirstLink(AbstractLinkVariable)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint_FirstLink()
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getFirstLinkConstraints
	 * @model opposite="firstLinkConstraint" required="true" ordered="false"
	 * @generated
	 */
	AbstractLinkVariable getFirstLink();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getFirstLink <em>First Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Link</em>' reference.
	 * @see #getFirstLink()
	 * @generated
	 */
	void setFirstLink(AbstractLinkVariable value);

	/**
	 * Returns the value of the '<em><b>Referencing Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Object</em>' container reference.
	 * @see #setReferencingObject(ObjectVariable)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint_ReferencingObject()
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getLinkOrderConstraints
	 * @model opposite="linkOrderConstraint" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ObjectVariable getReferencingObject();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencing Object</em>' container reference.
	 * @see #getReferencingObject()
	 * @generated
	 */
	void setReferencingObject(ObjectVariable value);

	/**
	 * Returns the value of the '<em><b>Second Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSecondLinkConstraints <em>Second Link Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Link</em>' reference.
	 * @see #setSecondLink(AbstractLinkVariable)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getLinkConstraint_SecondLink()
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSecondLinkConstraints
	 * @model opposite="secondLinkConstraint" ordered="false"
	 * @generated
	 */
	AbstractLinkVariable getSecondLink();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Link</em>' reference.
	 * @see #getSecondLink()
	 * @generated
	 */
	void setSecondLink(AbstractLinkVariable value);

} // LinkConstraint
