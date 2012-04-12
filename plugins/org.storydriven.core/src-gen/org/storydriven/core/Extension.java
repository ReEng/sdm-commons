/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for an Extension that can be defined for an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.core.Extension#getBase <em>Base</em>}</li>
 *   <li>{@link org.storydriven.core.Extension#getModelBase <em>Model Base</em>}</li>
 *   <li>{@link org.storydriven.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.storydriven.core.Extension#getExtendableBase <em>Extendable Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.core.CorePackage#getExtension()
 * @model abstract="true"
 * @generated
 */
public interface Extension extends ExtendableElement {
	/**
	 * @generated NOT
	 */
	String EXTENSION_SOURCE_URI = "http://www.storydriven.org/core/extension";

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see org.storydriven.core.CorePackage#getExtension_Base()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EObject getBase();

	/**
	 * Returns the value of the '<em><b>Model Base</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.storydriven.core.Extension#getBase() <em>Base</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Base</em>' reference.
	 * @see #isSetModelBase()
	 * @see #unsetModelBase()
	 * @see #setModelBase(EModelElement)
	 * @see org.storydriven.core.CorePackage#getExtension_ModelBase()
	 * @model unsettable="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EModelElement getModelBase();

	/**
	 * Sets the value of the '{@link org.storydriven.core.Extension#getModelBase <em>Model Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Base</em>' reference.
	 * @see #isSetModelBase()
	 * @see #unsetModelBase()
	 * @see #getModelBase()
	 * @generated
	 */
	void setModelBase(EModelElement value);

	/**
	 * Unsets the value of the '{@link org.storydriven.core.Extension#getModelBase <em>Model Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModelBase()
	 * @see #getModelBase()
	 * @see #setModelBase(EModelElement)
	 * @generated
	 */
	void unsetModelBase();

	/**
	 * Returns whether the value of the '{@link org.storydriven.core.Extension#getModelBase <em>Model Base</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model Base</em>' reference is set.
	 * @see #unsetModelBase()
	 * @see #getModelBase()
	 * @see #setModelBase(EModelElement)
	 * @generated
	 */
	boolean isSetModelBase();

	/**
	 * Returns the value of the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Annotation</em>' reference.
	 * @see #isSetOwningAnnotation()
	 * @see #unsetOwningAnnotation()
	 * @see #setOwningAnnotation(EAnnotation)
	 * @see org.storydriven.core.CorePackage#getExtension_OwningAnnotation()
	 * @model unsettable="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EAnnotation getOwningAnnotation();

	/**
	 * Sets the value of the '{@link org.storydriven.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Annotation</em>' reference.
	 * @see #isSetOwningAnnotation()
	 * @see #unsetOwningAnnotation()
	 * @see #getOwningAnnotation()
	 * @generated
	 */
	void setOwningAnnotation(EAnnotation value);

	/**
	 * Unsets the value of the '{@link org.storydriven.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwningAnnotation()
	 * @see #getOwningAnnotation()
	 * @see #setOwningAnnotation(EAnnotation)
	 * @generated
	 */
	void unsetOwningAnnotation();

	/**
	 * Returns whether the value of the '{@link org.storydriven.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owning Annotation</em>' reference is set.
	 * @see #unsetOwningAnnotation()
	 * @see #getOwningAnnotation()
	 * @see #setOwningAnnotation(EAnnotation)
	 * @generated
	 */
	boolean isSetOwningAnnotation();

	/**
	 * Returns the value of the '<em><b>Extendable Base</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.core.ExtendableElement#getExtensions <em>Extension</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.storydriven.core.Extension#getBase() <em>Base</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extendable Base</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extendable Base</em>' container reference.
	 * @see #setExtendableBase(ExtendableElement)
	 * @see org.storydriven.core.CorePackage#getExtension_ExtendableBase()
	 * @see org.storydriven.core.ExtendableElement#getExtensions
	 * @model opposite="extension" transient="false" ordered="false"
	 * @generated
	 */
	ExtendableElement getExtendableBase();

	/**
	 * Sets the value of the '{@link org.storydriven.core.Extension#getExtendableBase <em>Extendable Base</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendable Base</em>' container reference.
	 * @see #getExtendableBase()
	 * @generated
	 */
	void setExtendableBase(ExtendableElement value);

} // Extension
