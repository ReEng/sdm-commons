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
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.Method#getContainer <em>Container</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Method#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMethod()
 * @generated
 */
public interface Method extends Member {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Type#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Type)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMethod_Container()
	 * @see org.storydriven.storydiagrams.tests.Type#getMethods
	 * @generated
	 */
	Type getContainer();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Method#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Type value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Parameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMethod_Parameters()
	 * @see org.storydriven.storydiagrams.tests.Parameter#getMethod
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Statement}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Statement#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getMethod_Statements()
	 * @see org.storydriven.storydiagrams.tests.Statement#getMethod
	 * @generated
	 */
	EList<Statement> getStatements();

} // Method
