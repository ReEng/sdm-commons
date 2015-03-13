/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TType</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingPackage <em>Containing Package</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingType <em>Containing Type</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TType#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TType#getTypes <em>Types</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TType#getFields <em>Fields</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TType#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TType extends TNamed, TModifyable {
	/**
	 * Returns the value of the '<em><b>Containing Package</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getTypes <em>Types</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Package</em>' container reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containing Package</em>' container reference.
	 * @see #setContainingPackage(TPackage)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType_ContainingPackage()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	TPackage getContainingPackage();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingPackage
	 * <em>Containing Package</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Containing Package</em>' container reference.
	 * @see #getContainingPackage()
	 * @generated
	 */
	void setContainingPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.storydriven.storydiagrams.interpreter.tests.TType#getTypes <em>Types</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Type</em>' container reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containing Type</em>' container reference.
	 * @see #setContainingType(TType)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType_ContainingType()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	TType getContainingType();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingType
	 * <em>Containing Type</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Containing Type</em>' container reference.
	 * @see #getContainingType()
	 * @generated
	 */
	void setContainingType(TType value);

	/**
	 * Returns the value of the '<em><b>Extended Interfaces</b></em>' reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TInterface}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Interfaces</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extended Interfaces</em>' reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType_ExtendedInterfaces()
	 * @model
	 * @generated
	 */
	EList<TInterface> getExtendedInterfaces();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingType <em>Containing Type</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType_Types()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getContainingType
	 * @model opposite="containingType" containment="true"
	 * @generated
	 */
	EList<TType> getTypes();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TField}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TField#getContainingType <em>Containing Type</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType_Fields()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TField#getContainingType
	 * @model opposite="containingType" containment="true"
	 * @generated
	 */
	EList<TField> getFields();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethod}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getContainingType <em>Containing Type</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTType_Methods()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod#getContainingType
	 * @model opposite="containingType" containment="true"
	 * @generated
	 */
	EList<TMethod> getMethods();

} // TType
