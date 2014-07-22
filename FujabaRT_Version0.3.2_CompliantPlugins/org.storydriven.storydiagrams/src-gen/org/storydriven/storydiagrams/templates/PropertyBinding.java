/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.templates;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.templates.TemplatesPackage#getPropertyBinding()
 * @model
 * @generated
 */
public interface PropertyBinding extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Bound Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Property</em>' reference.
	 * @see #setBoundProperty(EStructuralFeature)
	 * @see org.storydriven.storydiagrams.templates.TemplatesPackage#getPropertyBinding_BoundProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EStructuralFeature getBoundProperty();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Property</em>' reference.
	 * @see #getBoundProperty()
	 * @generated
	 */
	void setBoundProperty(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Expression</em>' containment reference.
	 * @see #setBindingExpression(Expression)
	 * @see org.storydriven.storydiagrams.templates.TemplatesPackage#getPropertyBinding_BindingExpression()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBindingExpression();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Expression</em>' containment reference.
	 * @see #getBindingExpression()
	 * @generated
	 */
	void setBindingExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.storydriven.storydiagrams.templates.TemplateBinding#getPropertyBindings <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' container reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see org.storydriven.storydiagrams.templates.TemplatesPackage#getPropertyBinding_TemplateBinding()
	 * @see org.storydriven.storydiagrams.templates.TemplateBinding#getPropertyBindings
	 * @model opposite="propertyBinding" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' container reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

} // PropertyBinding
