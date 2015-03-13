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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#getPackage <em>Package</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#isFinal <em>Final</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#getFields <em>Fields</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Type#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType()
 * @generated
 */
public interface Type extends Named {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Package#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(org.storydriven.storydiagrams.tests.Package)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Package()
	 * @see org.storydriven.storydiagrams.tests.Package#getTypes
	 * @generated
	 */
	org.storydriven.storydiagrams.tests.Package getPackage();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Type#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.storydriven.storydiagrams.tests.Package value);

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Typed}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Typed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Usages()
	 * @see org.storydriven.storydiagrams.tests.Typed#getType
	 * @generated
	 */
	EList<Typed> getUsages();

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
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Visibility()
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Type#getVisibility <em>Visibility</em>}' attribute.
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
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Abstract()
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Type#isAbstract <em>Abstract</em>}' attribute.
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
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Final()
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Type#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Field}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Field#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Fields()
	 * @see org.storydriven.storydiagrams.tests.Field#getContainer
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Method}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Method#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getType_Methods()
	 * @see org.storydriven.storydiagrams.tests.Method#getContainer
	 * @generated
	 */
	EList<Method> getMethods();

} // Type
