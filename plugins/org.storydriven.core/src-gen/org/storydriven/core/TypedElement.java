/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all meta-model elements that are typed by means of an EClassifier or an EGenericType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.core.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.core.TypedElement#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.core.CorePackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see org.storydriven.core.CorePackage#getTypedElement_Type()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EClassifier getType();

	/**
	 * Returns the value of the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Type</em>' containment reference.
	 * @see #isSetGenericType()
	 * @see #unsetGenericType()
	 * @see #setGenericType(EGenericType)
	 * @see org.storydriven.core.CorePackage#getTypedElement_GenericType()
	 * @model containment="true" resolveProxies="true" unsettable="true" ordered="false"
	 * @generated
	 */
	EGenericType getGenericType();

	/**
	 * Sets the value of the '{@link org.storydriven.core.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Type</em>' containment reference.
	 * @see #isSetGenericType()
	 * @see #unsetGenericType()
	 * @see #getGenericType()
	 * @generated
	 */
	void setGenericType(EGenericType value);

	/**
	 * Unsets the value of the '{@link org.storydriven.core.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenericType()
	 * @see #getGenericType()
	 * @see #setGenericType(EGenericType)
	 * @generated
	 */
	void unsetGenericType();

	/**
	 * Returns whether the value of the '{@link org.storydriven.core.TypedElement#getGenericType <em>Generic Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generic Type</em>' containment reference is set.
	 * @see #unsetGenericType()
	 * @see #getGenericType()
	 * @see #setGenericType(EGenericType)
	 * @generated
	 */
	boolean isSetGenericType();

} // TypedElement
