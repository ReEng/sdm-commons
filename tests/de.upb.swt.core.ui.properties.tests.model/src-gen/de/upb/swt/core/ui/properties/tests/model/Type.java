/**
 */
package de.upb.swt.core.ui.properties.tests.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Type#getContainer <em>Container</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Type#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Type#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Container#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getType_Container()
	 * @see de.upb.swt.core.ui.properties.tests.model.Container#getTypes
	 * @model opposite="types" required="true" transient="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.Type#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.swt.core.ui.properties.tests.model.Attribute}.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getType_Attributes()
	 * @see de.upb.swt.core.ui.properties.tests.model.Attribute#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.upb.swt.core.ui.properties.tests.model.Reference}.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getType_Outgoing()
	 * @see de.upb.swt.core.ui.properties.tests.model.Reference#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Reference> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.upb.swt.core.ui.properties.tests.model.Reference}.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getType_Incoming()
	 * @see de.upb.swt.core.ui.properties.tests.model.Reference#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Reference> getIncoming();

} // Type
