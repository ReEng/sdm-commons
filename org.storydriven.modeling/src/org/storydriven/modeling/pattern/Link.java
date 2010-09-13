/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.Link#getConstraint <em>Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getModifier <em>Modifier</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getTarget <em>Target</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getSource <em>Source</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getMultiLinkToTargets <em>Multi Link To Target</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getMultiLinkFromSources <em>Multi Link From Source</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getSourceEnd <em>Source End</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getTargetEnd <em>Target End</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Link#getRangeExpression <em>Range Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement
{
   /**
    * Returns the value of the '<em><b>Constraint</b></em>' attribute. The default value is <code>"NONE"</code>. The literals are from the enumeration
    * {@link org.storydriven.modeling.pattern.Constraint}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Constraint</em>' attribute.
    * @see org.storydriven.modeling.pattern.Constraint
    * @see #setConstraint(Constraint)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_Constraint()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   Constraint getConstraint ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getConstraint <em>Constraint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Constraint</em>' attribute.
    * @see org.storydriven.modeling.pattern.Constraint
    * @see #getConstraint()
    * @generated
    */
   void setConstraint (Constraint value);

   /**
    * Returns the value of the '<em><b>Modifier</b></em>' attribute. The default value is <code>"NONE"</code>. The literals are from the enumeration
    * {@link org.storydriven.modeling.pattern.Modifier}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifier</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifier</em>' attribute.
    * @see org.storydriven.modeling.pattern.Modifier
    * @see #setModifier(Modifier)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_Modifier()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   Modifier getModifier ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getModifier <em>Modifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Modifier</em>' attribute.
    * @see org.storydriven.modeling.pattern.Modifier
    * @see #getModifier()
    * @generated
    */
   void setModifier (Modifier value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference. It is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Object#getLinkToSources
    * <em>Link To Source</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(org.storydriven.modeling.pattern.Object)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_Target()
    * @see org.storydriven.modeling.pattern.Object#getLinkToSources
    * @model opposite="linkToSource" required="true" ordered="false"
    * @generated
    */
   org.storydriven.modeling.pattern.Object getTarget ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getTarget <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget (org.storydriven.modeling.pattern.Object value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.Object#getLinkToTargets <em>Link To Target</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Source</em>' container reference.
    * @see #setSource(org.storydriven.modeling.pattern.Object)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_Source()
    * @see org.storydriven.modeling.pattern.Object#getLinkToTargets
    * @model opposite="linkToTarget" required="true" transient="false" ordered="false"
    * @generated
    */
   org.storydriven.modeling.pattern.Object getSource ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getSource <em>Source</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Source</em>' container reference.
    * @see #getSource()
    * @generated
    */
   void setSource (org.storydriven.modeling.pattern.Object value);

   /**
    * Returns the value of the '<em><b>Multi Link To Target</b></em>' reference list. The list contents are of type {@link org.storydriven.modeling.pattern.MultiLink}. It is
    * bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.MultiLink#getTargetLink <em>Target Link</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Multi Link To Target</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Multi Link To Target</em>' reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_MultiLinkToTarget()
    * @see org.storydriven.modeling.pattern.MultiLink#getTargetLink
    * @model opposite="targetLink" ordered="false"
    * @generated
    */
   EList<MultiLink> getMultiLinkToTargets ();

   /**
    * Returns the value of the '<em><b>Multi Link From Source</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.pattern.MultiLink}
    * . It is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.MultiLink#getSourceLink <em>Source Link</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Multi Link From Source</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Multi Link From Source</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_MultiLinkFromSource()
    * @see org.storydriven.modeling.pattern.MultiLink#getSourceLink
    * @model opposite="sourceLink" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<MultiLink> getMultiLinkFromSources ();

   /**
    * Returns the value of the '<em><b>Source End</b></em>' reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source End</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Source End</em>' reference.
    * @see #setSourceEnd(EReference)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_SourceEnd()
    * @model transient="true" volatile="true" derived="true" ordered="false"
    * @generated
    */
   EReference getSourceEnd ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getSourceEnd <em>Source End</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Source End</em>' reference.
    * @see #getSourceEnd()
    * @generated
    */
   void setSourceEnd (EReference value);

   /**
    * Returns the value of the '<em><b>Target End</b></em>' reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target End</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Target End</em>' reference.
    * @see #setTargetEnd(EReference)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_TargetEnd()
    * @model ordered="false"
    * @generated
    */
   EReference getTargetEnd ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getTargetEnd <em>Target End</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Target End</em>' reference.
    * @see #getTargetEnd()
    * @generated
    */
   void setTargetEnd (EReference value);

   /**
    * Returns the value of the '<em><b>Range Expression</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Range Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Range Expression</em>' containment reference.
    * @see #setRangeExpression(Expression)
    * @see org.storydriven.modeling.pattern.PatternPackage#getLink_RangeExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getRangeExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Link#getRangeExpression <em>Range Expression</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Range Expression</em>' containment reference.
    * @see #getRangeExpression()
    * @generated
    */
   void setRangeExpression (Expression value);

} // Link
