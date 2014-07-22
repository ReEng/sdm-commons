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
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.Field#getContainer <em>Container</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Field#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.tests.TestsPackage#getField()
 * @generated
 */
public interface Field extends Member {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Type#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Type)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getField_Container()
	 * @see org.storydriven.storydiagrams.tests.Type#getFields
	 * @generated
	 */
	Type getContainer();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Field#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Type value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Statement#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getField_Statement()
	 * @see org.storydriven.storydiagrams.tests.Statement#getField
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Field#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // Field
