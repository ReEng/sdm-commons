/**
 * <copyright>
 * 	Copyright 2012 by storydriven.org and others. All rights reserved. This program and its materials are made
 * 	available under the terms of the Eclipse Public License v1.0 which is referenced in this distribution.
 * 
 * 	Contributors:
 * 		Aljoscha Hark <aljoscha@aljoschability.com> - Initial code
 * 
 * </copyright>
 * 
 * $Id$
 */
package org.storydriven.storydiagrams.tests;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.Member#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Member#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Member#isFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMember()
 * @generated
 */
public interface Member extends Typed {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.tests.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.storydriven.storydiagrams.tests.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMember_Visibility()
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Member#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.storydriven.storydiagrams.tests.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMember_Abstract()
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Member#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMember_Final()
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Member#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

} // Member
