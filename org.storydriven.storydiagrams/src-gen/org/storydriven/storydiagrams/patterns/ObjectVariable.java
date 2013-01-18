/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectVariable holds a value of a complex type which is defined by an EClass. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Link</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraint</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getAttributeAssignments <em>Attribute Assignment</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable()
 * @model
 * @generated
 */
public interface ObjectVariable extends AbstractVariable {
	/**
	 * Returns the value of the '<em><b>Outgoing Link</b></em>' reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Link</em>' reference list.
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable_OutgoingLink()
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<AbstractLinkVariable> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Link Order Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.patterns.LinkConstraint}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Order Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Order Constraint</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable_LinkOrderConstraint()
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#getReferencingObject
	 * @model opposite="referencingObject" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<LinkConstraint> getLinkOrderConstraints();

	/**
	 * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.patterns.BindingSemantics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binding semantics defines whether the object must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
	 * @see #setBindingSemantics(BindingSemantics)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable_BindingSemantics()
	 * @model default="MANDATORY" required="true" ordered="false"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
	 * @see #getBindingSemantics()
	 * @generated
	 */
	void setBindingSemantics(BindingSemantics value);

	/**
	 * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
	 * The default value is <code>"CHECK_ONLY"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.patterns.BindingOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binding operator defines whether this object will be matched, created or destroyed by the story pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Operator</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingOperator
	 * @see #setBindingOperator(BindingOperator)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable_BindingOperator()
	 * @model default="CHECK_ONLY" required="true" ordered="false"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Operator</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingOperator
	 * @see #getBindingOperator()
	 * @generated
	 */
	void setBindingOperator(BindingOperator value);

	/**
	 * Returns the value of the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.storydiagrams.patterns.AttributeAssignment}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Assignment</em>' containment reference list.
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable_AttributeAssignment()
	 * @see org.storydriven.storydiagrams.patterns.AttributeAssignment#getObjectVariable
	 * @model opposite="objectVariable" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AttributeAssignment> getAttributeAssignments();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.storydriven.core.TypedElement#getType() <em>Type</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this ObjectVariable, given as an EClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(EClass)
	 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectVariable_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(EClass value);

} // ObjectVariable
