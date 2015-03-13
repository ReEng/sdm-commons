/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TModel</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTModel()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='false'"
 * @generated
 */
public interface TModel extends TNamed {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list. The list contents are of type
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage}. It is bidirectional and its opposite is '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getModel <em>Model</em>}'. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTModel_Packages()
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<TPackage> getPackages();

} // TModel
