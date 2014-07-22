/**
 */
package de.upb.swt.core.ui.properties.tests.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Container#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Container#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.swt.core.ui.properties.tests.model.Type}.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Type#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getContainer_Types()
	 * @see de.upb.swt.core.ui.properties.tests.model.Type#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.swt.core.ui.properties.tests.model.Reference}.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Reference#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getContainer_References()
	 * @see de.upb.swt.core.ui.properties.tests.model.Reference#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

} // Container
