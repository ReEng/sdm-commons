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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.Statement#getMethod <em>Method</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Statement#getField <em>Field</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Statement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.tests.TestsPackage#getStatement()
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Method#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getStatement_Method()
	 * @see org.storydriven.storydiagrams.tests.Method#getStatements
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Statement#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Field#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' container reference.
	 * @see #setField(Field)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getStatement_Field()
	 * @see org.storydriven.storydiagrams.tests.Field#getStatement
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Statement#getField <em>Field</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' container reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getStatement_Value()
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Statement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Statement
