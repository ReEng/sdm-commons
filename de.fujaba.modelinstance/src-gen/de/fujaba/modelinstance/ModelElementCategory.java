/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.modelinstance.ModelElementCategory#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link de.fujaba.modelinstance.ModelElementCategory#getKey <em>Key</em>}</li>
 *   <li>{@link de.fujaba.modelinstance.ModelElementCategory#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.modelinstance.ModelinstancePackage#getModelElementCategory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExclusivelyContainsValidElements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ExclusivelyContainsValidElements='self.modelElements->select (e | not isValidElement(e))->isEmpty()'"
 * @generated
 */
public interface ModelElementCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.modeling.ExtendableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see de.fujaba.modelinstance.ModelinstancePackage#getModelElementCategory_ModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendableElement> getModelElements();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.fujaba.modelinstance.ModelinstancePackage#getModelElementCategory_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.fujaba.modelinstance.ModelElementCategory#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.fujaba.modelinstance.ModelinstancePackage#getModelElementCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fujaba.modelinstance.ModelElementCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isValidElement(EObject object);

} // ModelElementCategory
