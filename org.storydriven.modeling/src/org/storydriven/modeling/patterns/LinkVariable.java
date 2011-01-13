/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Link Variable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.LinkVariable#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkVariable#getTargetEnd <em>Target End</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkVariable#getQualifierExpression <em>Qualifier Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkVariable()
 * @model
 * @generated
 */
public interface LinkVariable extends AbstractLinkVariable
{
   /**
    * Returns the value of the '<em><b>Source End</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source End</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source End</em>' reference.
    * @see #setSourceEnd(EReference)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkVariable_SourceEnd()
    * @model transient="true" volatile="true" derived="true" ordered="false"
    * @generated
    */
   EReference getSourceEnd ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkVariable#getSourceEnd <em>Source End</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Source End</em>' reference.
    * @see #getSourceEnd()
    * @generated
    */
   void setSourceEnd (EReference value);

   /**
    * Returns the value of the '<em><b>Target End</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target End</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target End</em>' reference.
    * @see #setTargetEnd(EReference)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkVariable_TargetEnd()
    * @model required="true" ordered="false"
    * @generated
    */
   EReference getTargetEnd ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkVariable#getTargetEnd <em>Target End</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Target End</em>' reference.
    * @see #getTargetEnd()
    * @generated
    */
   void setTargetEnd (EReference value);

   /**
    * Returns the value of the '<em><b>Qualifier Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Qualifier Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Qualifier Expression</em>' containment reference.
    * @see #setQualifierExpression(Expression)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkVariable_QualifierExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getQualifierExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkVariable#getQualifierExpression <em>Qualifier Expression</em>}' containment reference.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Qualifier Expression</em>' containment reference.
    * @see #getQualifierExpression()
    * @generated
    */
   void setQualifierExpression (Expression value);

} // LinkVariable
