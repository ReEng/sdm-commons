/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.modeling.pattern.ObjectPattern;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Pattern Template</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.templates.ObjectPatternTemplate#getTypeParameters <em>Type Parameter</em>}</li>
 * <li>{@link org.storydriven.modeling.templates.ObjectPatternTemplate#getTemplateBindings <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.templates.TemplatesPackage#getObjectPatternTemplate()
 * @model
 * @generated
 */
public interface ObjectPatternTemplate extends ObjectPattern
{
   /**
    * Returns the value of the '<em><b>Type Parameter</b></em>' containment reference list. The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Parameter</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Parameter</em>' containment reference list.
    * @see org.storydriven.modeling.templates.TemplatesPackage#getObjectPatternTemplate_TypeParameter()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<EClassifier> getTypeParameters ();

   /**
    * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list. The list contents are of type
    * {@link org.storydriven.modeling.templates.TemplateBinding}. It is bidirectional and its opposite is '{@link org.storydriven.modeling.templates.TemplateBinding#getTemplate
    * <em>Template</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Template Binding</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Template Binding</em>' containment reference list.
    * @see org.storydriven.modeling.templates.TemplatesPackage#getObjectPatternTemplate_TemplateBinding()
    * @see org.storydriven.modeling.templates.TemplateBinding#getTemplate
    * @model opposite="template" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<TemplateBinding> getTemplateBindings ();

} // ObjectPatternTemplate
