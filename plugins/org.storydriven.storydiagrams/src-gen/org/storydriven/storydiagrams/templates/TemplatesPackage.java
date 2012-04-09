/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.templates;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.templates.TemplatesFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "templates";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.storydriven.org/storydiagrams/templates/0.2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplatesPackage eINSTANCE = org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.templates.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.templates.impl.TemplateBindingImpl
	 * @see org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl#getTemplateBinding()
	 * @generated
	 */
	int TEMPLATE_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Bound Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__BOUND_PARAMETER = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__BINDING_EXPRESSION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__TEMPLATE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__PROPERTY_BINDING = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Template Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.templates.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.templates.impl.PropertyBindingImpl
	 * @see org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl#getPropertyBinding()
	 * @generated
	 */
	int PROPERTY_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Bound Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__BOUND_PROPERTY = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__BINDING_EXPRESSION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING__TEMPLATE_BINDING = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BINDING_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.templates.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.templates.impl.TemplateSignatureImpl
	 * @see org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl#getTemplateSignature()
	 * @generated
	 */
	int TEMPLATE_SIGNATURE = 2;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__TEMPLATE_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__TYPE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Template Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.templates.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Binding</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateBinding
	 * @generated
	 */
	EClass getTemplateBinding();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.templates.TemplateBinding#getBoundParameter <em>Bound Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Parameter</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateBinding#getBoundParameter()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_BoundParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.templates.TemplateBinding#getBindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Expression</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateBinding#getBindingExpression()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_BindingExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.templates.TemplateBinding#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateBinding#getTemplate()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.templates.TemplateBinding#getPropertyBindings <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Binding</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateBinding#getPropertyBindings()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_PropertyBinding();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.templates.PropertyBinding <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Binding</em>'.
	 * @see org.storydriven.storydiagrams.templates.PropertyBinding
	 * @generated
	 */
	EClass getPropertyBinding();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Property</em>'.
	 * @see org.storydriven.storydiagrams.templates.PropertyBinding#getBoundProperty()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EReference getPropertyBinding_BoundProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Expression</em>'.
	 * @see org.storydriven.storydiagrams.templates.PropertyBinding#getBindingExpression()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EReference getPropertyBinding_BindingExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template Binding</em>'.
	 * @see org.storydriven.storydiagrams.templates.PropertyBinding#getTemplateBinding()
	 * @see #getPropertyBinding()
	 * @generated
	 */
	EReference getPropertyBinding_TemplateBinding();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.templates.TemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Signature</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateSignature
	 * @generated
	 */
	EClass getTemplateSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.templates.TemplateSignature#getTemplateBindings <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Binding</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateSignature#getTemplateBindings()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_TemplateBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.templates.TemplateSignature#getTypeParameters <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameter</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateSignature#getTypeParameters()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_TypeParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.templates.TemplateSignature#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.storydriven.storydiagrams.templates.TemplateSignature#getPattern()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemplatesFactory getTemplatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.templates.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.templates.impl.TemplateBindingImpl
		 * @see org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl#getTemplateBinding()
		 * @generated
		 */
		EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Bound Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__BOUND_PARAMETER = eINSTANCE.getTemplateBinding_BoundParameter();

		/**
		 * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__BINDING_EXPRESSION = eINSTANCE.getTemplateBinding_BindingExpression();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__TEMPLATE = eINSTANCE.getTemplateBinding_Template();

		/**
		 * The meta object literal for the '<em><b>Property Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__PROPERTY_BINDING = eINSTANCE.getTemplateBinding_PropertyBinding();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.templates.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.templates.impl.PropertyBindingImpl
		 * @see org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl#getPropertyBinding()
		 * @generated
		 */
		EClass PROPERTY_BINDING = eINSTANCE.getPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Bound Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BINDING__BOUND_PROPERTY = eINSTANCE.getPropertyBinding_BoundProperty();

		/**
		 * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BINDING__BINDING_EXPRESSION = eINSTANCE.getPropertyBinding_BindingExpression();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BINDING__TEMPLATE_BINDING = eINSTANCE.getPropertyBinding_TemplateBinding();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.templates.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.templates.impl.TemplateSignatureImpl
		 * @see org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl#getTemplateSignature()
		 * @generated
		 */
		EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__TEMPLATE_BINDING = eINSTANCE.getTemplateSignature_TemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__TYPE_PARAMETER = eINSTANCE.getTemplateSignature_TypeParameter();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__PATTERN = eINSTANCE.getTemplateSignature_Pattern();

	}

} //TemplatesPackage
