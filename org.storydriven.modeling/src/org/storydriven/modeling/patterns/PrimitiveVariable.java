/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.PrimitiveVariable#getEDataType <em>EData Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getPrimitiveVariable()
 * @model
 * @generated
 */
public interface PrimitiveVariable extends AbstractVariable
{
   /**
    * Returns the value of the '<em><b>EData Type</b></em>' reference.
    * <p>
    * This feature subsets the following features:
    * <ul>
    *   <li>'{@link org.storydriven.modeling.TypedElement#getType() <em>Type</em>}'</li>
    * </ul>
    * </p>
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EData Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>EData Type</em>' reference.
    * @see #setEDataType(EDataType)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getPrimitiveVariable_EDataType()
    * @model required="true" ordered="false"
    * @generated
    */
   EDataType getEDataType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.PrimitiveVariable#getEDataType <em>EData Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>EData Type</em>' reference.
    * @see #getEDataType()
    * @generated
    */
   void setEDataType (EDataType value);

} // PrimitiveVariable
