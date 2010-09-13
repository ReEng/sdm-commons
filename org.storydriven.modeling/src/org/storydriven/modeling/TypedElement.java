/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.TypedElement#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.SDMPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends ExtendableElement
{
   /**
    * Returns the value of the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Type</em>' reference.
    * @see #isSetType()
    * @see #unsetType()
    * @see #setType(EClassifier)
    * @see org.storydriven.modeling.SDMPackage#getTypedElement_Type()
    * @model unsettable="true" ordered="false"
    * @generated
    */
   EClassifier getType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.TypedElement#getType <em>Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' reference.
    * @see #isSetType()
    * @see #unsetType()
    * @see #getType()
    * @generated
    */
   void setType (EClassifier value);

   /**
    * Unsets the value of the '{@link org.storydriven.modeling.TypedElement#getType <em>Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isSetType()
    * @see #getType()
    * @see #setType(EClassifier)
    * @generated
    */
   void unsetType ();

   /**
    * Returns whether the value of the '{@link org.storydriven.modeling.TypedElement#getType <em>Type</em>}' reference is set.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return whether the value of the '<em>Type</em>' reference is set.
    * @see #unsetType()
    * @see #getType()
    * @see #setType(EClassifier)
    * @generated
    */
   boolean isSetType ();

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
    * @see org.storydriven.modeling.SDMPackage#getTypedElement_GenericType()
    * @model containment="true" resolveProxies="true" unsettable="true" ordered="false"
    * @generated
    */
   EGenericType getGenericType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Generic Type</em>' containment reference.
    * @see #isSetGenericType()
    * @see #unsetGenericType()
    * @see #getGenericType()
    * @generated
    */
   void setGenericType (EGenericType value);

   /**
    * Unsets the value of the '{@link org.storydriven.modeling.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isSetGenericType()
    * @see #getGenericType()
    * @see #setGenericType(EGenericType)
    * @generated
    */
   void unsetGenericType ();

   /**
    * Returns whether the value of the '{@link org.storydriven.modeling.TypedElement#getGenericType <em>Generic Type</em>}' containment reference is set.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return whether the value of the '<em>Generic Type</em>' containment reference is set.
    * @see #unsetGenericType()
    * @see #getGenericType()
    * @see #setGenericType(EGenericType)
    * @generated
    */
   boolean isSetGenericType ();

} // TypedElement
