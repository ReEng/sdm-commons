/**
 */
package de.upb.swt.core.ui.properties.tests.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Reference#getContainer <em>Container</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Reference#getSource <em>Source</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Container#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getReference_Container()
	 * @see de.upb.swt.core.ui.properties.tests.model.Container#getReferences
	 * @model opposite="references" required="true" transient="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.Reference#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Type#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Type)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getReference_Source()
	 * @see de.upb.swt.core.ui.properties.tests.model.Type#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Type getSource();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.Reference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Type value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Type#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Type)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getReference_Target()
	 * @see de.upb.swt.core.ui.properties.tests.model.Type#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Type getTarget();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.Reference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Type value);

} // Reference
