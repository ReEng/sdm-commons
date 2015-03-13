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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.Package#getProject <em>Project</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Package#getParent <em>Parent</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Package#getChildren <em>Children</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.Package#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.tests.TestsPackage#getPackage()
 * @generated
 */
public interface Package extends Named {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Project#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getPackage_Project()
	 * @see org.storydriven.storydiagrams.tests.Project#getPackages
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Package#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Package#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Package)
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getPackage_Parent()
	 * @see org.storydriven.storydiagrams.tests.Package#getChildren
	 * @generated
	 */
	Package getParent();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.tests.Package#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Package value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Package}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getPackage_Children()
	 * @see org.storydriven.storydiagrams.tests.Package#getParent
	 * @generated
	 */
	EList<Package> getChildren();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.tests.Type}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.tests.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.tests.TestsPackage#getPackage_Types()
	 * @see org.storydriven.storydiagrams.tests.Type#getPackage
	 * @generated
	 */
	EList<Type> getTypes();

} // Package
