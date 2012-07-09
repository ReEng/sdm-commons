/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TPackage</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getModel <em>Model</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getContainingPackage <em>Containing Package</em>}
 * </li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getPackages <em>Packages</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='false'"
 * @generated
 */
public interface TPackage extends TNamed {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TModel#getPackages <em>Packages</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(TModel)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTPackage_Model()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModel#getPackages
	 * @model opposite="packages" transient="false"
	 * @generated
	 */
	TModel getModel();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getModel <em>Model</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(TModel value);

	/**
	 * Returns the value of the '<em><b>Containing Package</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Package</em>' container reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containing Package</em>' container reference.
	 * @see #setContainingPackage(TPackage)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTPackage_ContainingPackage()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getPackages
	 * @model opposite="packages" transient="false"
	 * @generated
	 */
	TPackage getContainingPackage();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getContainingPackage
	 * <em>Containing Package</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Containing Package</em>' container reference.
	 * @see #getContainingPackage()
	 * @generated
	 */
	void setContainingPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getContainingPackage <em>Containing Package</em>}
	 * '. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTPackage_Packages()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getContainingPackage
	 * @model opposite="containingPackage" containment="true"
	 * @generated
	 */
	EList<TPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingPackage <em>Containing Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTPackage_Types()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getContainingPackage
	 * @model opposite="containingPackage" containment="true"
	 * @generated
	 */
	EList<TType> getTypes();

} // TPackage
