/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TModifyable</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#getVisibility <em>Visibility</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#getInheritance <em>Inheritance</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTModifyable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TModifyable extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute. The literals are from the enumeration
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TVisibilityType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
	 * @see #setVisibility(TVisibilityType)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTModifyable_Visibility()
	 * @model unique="false" required="true"
	 * @generated
	 */
	TVisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#getVisibility
	 * <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(TVisibilityType value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute. The literals are from the enumeration
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TInheritanceType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inheritance</em>' attribute.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
	 * @see #setInheritance(TInheritanceType)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTModifyable_Inheritance()
	 * @model unique="false" required="true"
	 * @generated
	 */
	TInheritanceType getInheritance();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#getInheritance
	 * <em>Inheritance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Inheritance</em>' attribute.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(TInheritanceType value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTModifyable_Static()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#isStatic
	 * <em>Static</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // TModifyable
