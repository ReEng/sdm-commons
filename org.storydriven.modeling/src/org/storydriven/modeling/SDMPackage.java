/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see org.storydriven.modeling.SDMFactory
 * @model kind="package"
 * @generated
 */
public interface SDMPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "modeling";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdm";

   /**
    * The package content type ID.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eCONTENT_TYPE = "org.storydriven.modeling";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   SDMPackage eINSTANCE = org.storydriven.modeling.impl.SDMPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.ExtendableElementImpl <em>Extendable Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.ExtendableElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtendableElement()
    * @generated
    */
   int EXTENDABLE_ELEMENT = 2;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT__ANNOTATION = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT__EXTENSION = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Extendable Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.TypedElementImpl <em>Typed Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.TypedElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getTypedElement()
    * @generated
    */
   int TYPED_ELEMENT = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__TYPE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__GENERIC_TYPE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Typed Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.ExpressionImpl <em>Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.ExpressionImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getExpression()
    * @generated
    */
   int EXPRESSION = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__ANNOTATION = TYPED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__EXTENSION = TYPED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__TYPE = TYPED_ELEMENT__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__GENERIC_TYPE = TYPED_ELEMENT__GENERIC_TYPE;

   /**
    * The number of structural features of the '<em>Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.ExtensionImpl <em>Extension</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.ExtensionImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtension()
    * @generated
    */
   int EXTENSION = 3;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Base</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__BASE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Model Base</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__MODEL_BASE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__OWNING_ANNOTATION = EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__EXTENDABLE_BASE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Extension</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.StringExpressionImpl <em>String Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.StringExpressionImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getStringExpression()
    * @generated
    */
   int STRING_EXPRESSION = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION__EXTENSION = EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION__TYPE = EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION__GENERIC_TYPE = EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Expression</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Language</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION__LANGUAGE = EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>String Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.NamedElementImpl <em>Named Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.NamedElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getNamedElement()
    * @generated
    */
   int NAMED_ELEMENT = 5;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__NAME = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Named Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.CommentableElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getCommentableElement()
    * @generated
    */
   int COMMENTABLE_ELEMENT = 6;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT__COMMENT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Commentable Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Expression</em>'.
    * @see org.storydriven.modeling.Expression
    * @generated
    */
   EClass getExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.TypedElement <em>Typed Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Typed Element</em>'.
    * @see org.storydriven.modeling.TypedElement
    * @generated
    */
   EClass getTypedElement ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.TypedElement#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Type</em>'.
    * @see org.storydriven.modeling.TypedElement#getType()
    * @see #getTypedElement()
    * @generated
    */
   EReference getTypedElement_Type ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.TypedElement#getGenericType <em>Generic Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Generic Type</em>'.
    * @see org.storydriven.modeling.TypedElement#getGenericType()
    * @see #getTypedElement()
    * @generated
    */
   EReference getTypedElement_GenericType ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Extendable Element</em>'.
    * @see org.storydriven.modeling.ExtendableElement
    * @generated
    */
   EClass getExtendableElement ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.ExtendableElement#getAnnotations <em>Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Annotation</em>'.
    * @see org.storydriven.modeling.ExtendableElement#getAnnotations()
    * @see #getExtendableElement()
    * @generated
    */
   EReference getExtendableElement_Annotation ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.ExtendableElement#getExtensions <em>Extension</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Extension</em>'.
    * @see org.storydriven.modeling.ExtendableElement#getExtensions()
    * @see #getExtendableElement()
    * @generated
    */
   EReference getExtendableElement_Extension ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.Extension <em>Extension</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Extension</em>'.
    * @see org.storydriven.modeling.Extension
    * @generated
    */
   EClass getExtension ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.Extension#getBase <em>Base</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Base</em>'.
    * @see org.storydriven.modeling.Extension#getBase()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_Base ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.Extension#getModelBase <em>Model Base</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Model Base</em>'.
    * @see org.storydriven.modeling.Extension#getModelBase()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_ModelBase ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.Extension#getOwningAnnotation <em>Owning Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Owning Annotation</em>'.
    * @see org.storydriven.modeling.Extension#getOwningAnnotation()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_OwningAnnotation ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.Extension#getExtendableBase <em>Extendable Base</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Extendable Base</em>'.
    * @see org.storydriven.modeling.Extension#getExtendableBase()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_ExtendableBase ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.StringExpression <em>String Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>String Expression</em>'.
    * @see org.storydriven.modeling.StringExpression
    * @generated
    */
   EClass getStringExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.StringExpression#getExpression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Expression</em>'.
    * @see org.storydriven.modeling.StringExpression#getExpression()
    * @see #getStringExpression()
    * @generated
    */
   EAttribute getStringExpression_Expression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.StringExpression#getLanguage <em>Language</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Language</em>'.
    * @see org.storydriven.modeling.StringExpression#getLanguage()
    * @see #getStringExpression()
    * @generated
    */
   EAttribute getStringExpression_Language ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Named Element</em>'.
    * @see org.storydriven.modeling.NamedElement
    * @generated
    */
   EClass getNamedElement ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.NamedElement#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.storydriven.modeling.NamedElement#getName()
    * @see #getNamedElement()
    * @generated
    */
   EAttribute getNamedElement_Name ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.CommentableElement <em>Commentable Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Commentable Element</em>'.
    * @see org.storydriven.modeling.CommentableElement
    * @generated
    */
   EClass getCommentableElement ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.CommentableElement#getComment <em>Comment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Comment</em>'.
    * @see org.storydriven.modeling.CommentableElement#getComment()
    * @see #getCommentableElement()
    * @generated
    */
   EAttribute getCommentableElement_Comment ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   SDMFactory getSDMFactory ();

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
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.ExpressionImpl <em>Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.ExpressionImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getExpression()
       * @generated
       */
      EClass EXPRESSION = eINSTANCE.getExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.TypedElementImpl <em>Typed Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.TypedElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getTypedElement()
       * @generated
       */
      EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

      /**
       * The meta object literal for the '<em><b>Generic Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TYPED_ELEMENT__GENERIC_TYPE = eINSTANCE.getTypedElement_GenericType();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.ExtendableElementImpl <em>Extendable Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.ExtendableElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtendableElement()
       * @generated
       */
      EClass EXTENDABLE_ELEMENT = eINSTANCE.getExtendableElement();

      /**
       * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENDABLE_ELEMENT__ANNOTATION = eINSTANCE.getExtendableElement_Annotation();

      /**
       * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENDABLE_ELEMENT__EXTENSION = eINSTANCE.getExtendableElement_Extension();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.ExtensionImpl <em>Extension</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.ExtensionImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtension()
       * @generated
       */
      EClass EXTENSION = eINSTANCE.getExtension();

      /**
       * The meta object literal for the '<em><b>Base</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__BASE = eINSTANCE.getExtension_Base();

      /**
       * The meta object literal for the '<em><b>Model Base</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__MODEL_BASE = eINSTANCE.getExtension_ModelBase();

      /**
       * The meta object literal for the '<em><b>Owning Annotation</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__OWNING_ANNOTATION = eINSTANCE.getExtension_OwningAnnotation();

      /**
       * The meta object literal for the '<em><b>Extendable Base</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__EXTENDABLE_BASE = eINSTANCE.getExtension_ExtendableBase();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.StringExpressionImpl <em>String Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.StringExpressionImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getStringExpression()
       * @generated
       */
      EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

      /**
       * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute STRING_EXPRESSION__EXPRESSION = eINSTANCE.getStringExpression_Expression();

      /**
       * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute STRING_EXPRESSION__LANGUAGE = eINSTANCE.getStringExpression_Language();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.NamedElementImpl <em>Named Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.NamedElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getNamedElement()
       * @generated
       */
      EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.CommentableElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getCommentableElement()
       * @generated
       */
      EClass COMMENTABLE_ELEMENT = eINSTANCE.getCommentableElement();

      /**
       * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMMENTABLE_ELEMENT__COMMENT = eINSTANCE.getCommentableElement_Comment();

   }

} //SDMPackage
