/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsFactory eINSTANCE = org.storydriven.storydiagrams.patterns.impl.PatternsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Object Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Variable</em>'.
	 * @generated
	 */
	ObjectVariable createObjectVariable();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Link Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Constraint</em>'.
	 * @generated
	 */
	LinkConstraint createLinkConstraint();

	/**
	 * Returns a new object of class '<em>Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Assignment</em>'.
	 * @generated
	 */
	AttributeAssignment createAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Collection Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Variable</em>'.
	 * @generated
	 */
	CollectionVariable createCollectionVariable();

	/**
	 * Returns a new object of class '<em>Primitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Variable</em>'.
	 * @generated
	 */
	PrimitiveVariable createPrimitiveVariable();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Link Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Variable</em>'.
	 * @generated
	 */
	LinkVariable createLinkVariable();

	/**
	 * Returns a new object of class '<em>Inclusion Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclusion Link</em>'.
	 * @generated
	 */
	InclusionLink createInclusionLink();

	/**
	 * Returns a new object of class '<em>Matching Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching Pattern</em>'.
	 * @generated
	 */
	MatchingPattern createMatchingPattern();

	/**
	 * Returns a new object of class '<em>Maybe Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maybe Link</em>'.
	 * @generated
	 */
	MaybeLink createMaybeLink();

	/**
	 * Returns a new object of class '<em>Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story Pattern</em>'.
	 * @generated
	 */
	StoryPattern createStoryPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternsPackage getPatternsPackage();

} //PatternsFactory
