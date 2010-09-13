/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.storydriven.modeling.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage
{
   /**
    * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "pattern";

   /**
    * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/pattern/0.1.0";

   /**
    * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "sdmp";

   /**
    * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   PatternPackage eINSTANCE = org.storydriven.modeling.pattern.impl.PatternPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.AttributeExpressionImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getAttributeExpression()
    * @generated
    */
   int ATTRIBUTE_EXPRESSION = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__NAME = SDMPackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Operator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__OPERATOR = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Owning Object</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__OWNING_OBJECT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Attribute</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__ATTRIBUTE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Value</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION__VALUE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Attribute Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ATTRIBUTE_EXPRESSION_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.LinkImpl <em>Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.LinkImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getLink()
    * @generated
    */
   int LINK = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__NAME = SDMPackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__CONSTRAINT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__MODIFIER = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__TARGET = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Source</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__SOURCE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Multi Link To Target</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__MULTI_LINK_TO_TARGET = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Multi Link From Source</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__MULTI_LINK_FROM_SOURCE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Source End</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__SOURCE_END = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Target End</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__TARGET_END = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The feature id for the '<em><b>Range Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK__RANGE_EXPRESSION = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

   /**
    * The number of structural features of the '<em>Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LINK_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl <em>Multi Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.MultiLinkImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getMultiLink()
    * @generated
    */
   int MULTI_LINK = 2;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Index</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__INDEX = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Multi Link Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__MULTI_LINK_TYPE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Negative</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__NEGATIVE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Source Link</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__SOURCE_LINK = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Target Object</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__TARGET_OBJECT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Target Link</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK__TARGET_LINK = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Multi Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MULTI_LINK_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl <em>Object Pattern</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.ObjectPatternImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getObjectPattern()
    * @generated
    */
   int OBJECT_PATTERN = 3;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__ANNOTATION = SDMPackage.COMMENTABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__EXTENSION = SDMPackage.COMMENTABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__COMMENT = SDMPackage.COMMENTABLE_ELEMENT__COMMENT;

   /**
    * The feature id for the '<em><b>Owned Objects</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__OWNED_OBJECTS = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Statement</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__STATEMENT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Owning Node</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__OWNING_NODE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Owning Pattern</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__OWNING_PATTERN = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Owned Pattern</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__OWNED_PATTERN = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__CONSTRAINT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Constraint Expression</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN__CONSTRAINT_EXPRESSION = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Object Pattern</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_FEATURE_COUNT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.StoryNodeImpl <em>Story Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.StoryNodeImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getStoryNode()
    * @generated
    */
   int STORY_NODE = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__ANNOTATION = ActivitiesPackage.ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__EXTENSION = ActivitiesPackage.ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__INCOMING = ActivitiesPackage.ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__OUTGOING = ActivitiesPackage.ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>For Each</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__FOR_EACH = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Owned Pattern</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE__OWNED_PATTERN = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Story Node</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STORY_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.PathImpl <em>Path</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.PathImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getPath()
    * @generated
    */
   int PATH = 5;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__ANNOTATION = LINK__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__EXTENSION = LINK__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__NAME = LINK__NAME;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__CONSTRAINT = LINK__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__MODIFIER = LINK__MODIFIER;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__TARGET = LINK__TARGET;

   /**
    * The feature id for the '<em><b>Source</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__SOURCE = LINK__SOURCE;

   /**
    * The feature id for the '<em><b>Multi Link To Target</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__MULTI_LINK_TO_TARGET = LINK__MULTI_LINK_TO_TARGET;

   /**
    * The feature id for the '<em><b>Multi Link From Source</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__MULTI_LINK_FROM_SOURCE = LINK__MULTI_LINK_FROM_SOURCE;

   /**
    * The feature id for the '<em><b>Source End</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__SOURCE_END = LINK__SOURCE_END;

   /**
    * The feature id for the '<em><b>Target End</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__TARGET_END = LINK__TARGET_END;

   /**
    * The feature id for the '<em><b>Range Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__RANGE_EXPRESSION = LINK__RANGE_EXPRESSION;

   /**
    * The feature id for the '<em><b>Path Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH__PATH_EXPRESSION = LINK_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Path</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PATH_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.impl.ObjectImpl <em>Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.impl.ObjectImpl
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getObject()
    * @generated
    */
   int OBJECT = 6;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__ANNOTATION = SDMPackage.TYPED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__EXTENSION = SDMPackage.TYPED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__TYPE = SDMPackage.TYPED_ELEMENT__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__GENERIC_TYPE = SDMPackage.TYPED_ELEMENT__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__NAME = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Owned Attribute Expression</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__OWNED_ATTRIBUTE_EXPRESSION = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Link To Source</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__LINK_TO_SOURCE = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Link To Target</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__LINK_TO_TARGET = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__PATTERN = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Bound</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__BOUND = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__CONSTRAINT = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__MODIFIER = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__CLASSIFIER = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 8;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__BINDING_EXPRESSION = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 9;

   /**
    * The feature id for the '<em><b>Received Collaboration</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__RECEIVED_COLLABORATION = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 10;

   /**
    * The feature id for the '<em><b>Sent Collaboration</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT__SENT_COLLABORATION = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 11;

   /**
    * The number of structural features of the '<em>Object</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_FEATURE_COUNT = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 12;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.Operator <em>Operator</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.Operator
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getOperator()
    * @generated
    */
   int OPERATOR = 7;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.BoundType <em>Bound Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.BoundType
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getBoundType()
    * @generated
    */
   int BOUND_TYPE = 8;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.Constraint <em>Constraint</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.Constraint
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getConstraint()
    * @generated
    */
   int CONSTRAINT = 9;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.Modifier <em>Modifier</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.Modifier
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getModifier()
    * @generated
    */
   int MODIFIER = 10;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.pattern.MultiLinkType <em>Multi Link Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.storydriven.modeling.pattern.MultiLinkType
    * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getMultiLinkType()
    * @generated
    */
   int MULTI_LINK_TYPE = 11;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.AttributeExpression <em>Attribute Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Attribute Expression</em>'.
    * @see org.storydriven.modeling.pattern.AttributeExpression
    * @generated
    */
   EClass getAttributeExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.AttributeExpression#getOperator <em>Operator</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Operator</em>'.
    * @see org.storydriven.modeling.pattern.AttributeExpression#getOperator()
    * @see #getAttributeExpression()
    * @generated
    */
   EAttribute getAttributeExpression_Operator ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.pattern.AttributeExpression#getOwningObject <em>Owning Object</em>}'. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Owning Object</em>'.
    * @see org.storydriven.modeling.pattern.AttributeExpression#getOwningObject()
    * @see #getAttributeExpression()
    * @generated
    */
   EReference getAttributeExpression_OwningObject ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.AttributeExpression#getAttribute <em>Attribute</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Attribute</em>'.
    * @see org.storydriven.modeling.pattern.AttributeExpression#getAttribute()
    * @see #getAttributeExpression()
    * @generated
    */
   EReference getAttributeExpression_Attribute ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.AttributeExpression#getValues <em>Value</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Value</em>'.
    * @see org.storydriven.modeling.pattern.AttributeExpression#getValues()
    * @see #getAttributeExpression()
    * @generated
    */
   EReference getAttributeExpression_Value ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.Link <em>Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Link</em>'.
    * @see org.storydriven.modeling.pattern.Link
    * @generated
    */
   EClass getLink ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.Link#getConstraint <em>Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Constraint</em>'.
    * @see org.storydriven.modeling.pattern.Link#getConstraint()
    * @see #getLink()
    * @generated
    */
   EAttribute getLink_Constraint ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.Link#getModifier <em>Modifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.storydriven.modeling.pattern.Link#getModifier()
    * @see #getLink()
    * @generated
    */
   EAttribute getLink_Modifier ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.Link#getTarget <em>Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.storydriven.modeling.pattern.Link#getTarget()
    * @see #getLink()
    * @generated
    */
   EReference getLink_Target ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.pattern.Link#getSource <em>Source</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Source</em>'.
    * @see org.storydriven.modeling.pattern.Link#getSource()
    * @see #getLink()
    * @generated
    */
   EReference getLink_Source ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.pattern.Link#getMultiLinkToTargets <em>Multi Link To Target</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Multi Link To Target</em>'.
    * @see org.storydriven.modeling.pattern.Link#getMultiLinkToTargets()
    * @see #getLink()
    * @generated
    */
   EReference getLink_MultiLinkToTarget ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.Link#getMultiLinkFromSources <em>Multi Link From Source</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Multi Link From Source</em>'.
    * @see org.storydriven.modeling.pattern.Link#getMultiLinkFromSources()
    * @see #getLink()
    * @generated
    */
   EReference getLink_MultiLinkFromSource ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.Link#getSourceEnd <em>Source End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Source End</em>'.
    * @see org.storydriven.modeling.pattern.Link#getSourceEnd()
    * @see #getLink()
    * @generated
    */
   EReference getLink_SourceEnd ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.Link#getTargetEnd <em>Target End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Target End</em>'.
    * @see org.storydriven.modeling.pattern.Link#getTargetEnd()
    * @see #getLink()
    * @generated
    */
   EReference getLink_TargetEnd ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.pattern.Link#getRangeExpression <em>Range Expression</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Range Expression</em>'.
    * @see org.storydriven.modeling.pattern.Link#getRangeExpression()
    * @see #getLink()
    * @generated
    */
   EReference getLink_RangeExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.MultiLink <em>Multi Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Multi Link</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink
    * @generated
    */
   EClass getMultiLink ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.MultiLink#getIndex <em>Index</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Index</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink#getIndex()
    * @see #getMultiLink()
    * @generated
    */
   EAttribute getMultiLink_Index ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.MultiLink#getMultiLinkType <em>Multi Link Type</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Multi Link Type</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink#getMultiLinkType()
    * @see #getMultiLink()
    * @generated
    */
   EAttribute getMultiLink_MultiLinkType ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.MultiLink#isNegative <em>Negative</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Negative</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink#isNegative()
    * @see #getMultiLink()
    * @generated
    */
   EAttribute getMultiLink_Negative ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.pattern.MultiLink#getSourceLink <em>Source Link</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Source Link</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink#getSourceLink()
    * @see #getMultiLink()
    * @generated
    */
   EReference getMultiLink_SourceLink ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.MultiLink#getTargetObject <em>Target Object</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Target Object</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink#getTargetObject()
    * @see #getMultiLink()
    * @generated
    */
   EReference getMultiLink_TargetObject ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.MultiLink#getTargetLink <em>Target Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for the reference '<em>Target Link</em>'.
    * @see org.storydriven.modeling.pattern.MultiLink#getTargetLink()
    * @see #getMultiLink()
    * @generated
    */
   EReference getMultiLink_TargetLink ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.ObjectPattern <em>Object Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Object Pattern</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern
    * @generated
    */
   EClass getObjectPattern ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwnedObjects <em>Owned Objects</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Owned Objects</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getOwnedObjects()
    * @see #getObjectPattern()
    * @generated
    */
   EReference getObjectPattern_OwnedObjects ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.ObjectPattern#getStatements <em>Statement</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Statement</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getStatements()
    * @see #getObjectPattern()
    * @generated
    */
   EReference getObjectPattern_Statement ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningNode <em>Owning Node</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Owning Node</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getOwningNode()
    * @see #getObjectPattern()
    * @generated
    */
   EReference getObjectPattern_OwningNode ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningPattern <em>Owning Pattern</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Owning Pattern</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getOwningPattern()
    * @see #getObjectPattern()
    * @generated
    */
   EReference getObjectPattern_OwningPattern ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwnedPatterns <em>Owned Pattern</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Owned Pattern</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getOwnedPatterns()
    * @see #getObjectPattern()
    * @generated
    */
   EReference getObjectPattern_OwnedPattern ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.ObjectPattern#getConstraint <em>Constraint</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Constraint</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getConstraint()
    * @see #getObjectPattern()
    * @generated
    */
   EAttribute getObjectPattern_Constraint ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.ObjectPattern#getConstraintExpressions <em>Constraint Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Constraint Expression</em>'.
    * @see org.storydriven.modeling.pattern.ObjectPattern#getConstraintExpressions()
    * @see #getObjectPattern()
    * @generated
    */
   EReference getObjectPattern_ConstraintExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.StoryNode <em>Story Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Story Node</em>'.
    * @see org.storydriven.modeling.pattern.StoryNode
    * @generated
    */
   EClass getStoryNode ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.StoryNode#isForEach <em>For Each</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>For Each</em>'.
    * @see org.storydriven.modeling.pattern.StoryNode#isForEach()
    * @see #getStoryNode()
    * @generated
    */
   EAttribute getStoryNode_ForEach ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.pattern.StoryNode#getOwnedPattern <em>Owned Pattern</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Owned Pattern</em>'.
    * @see org.storydriven.modeling.pattern.StoryNode#getOwnedPattern()
    * @see #getStoryNode()
    * @generated
    */
   EReference getStoryNode_OwnedPattern ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.Path <em>Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Path</em>'.
    * @see org.storydriven.modeling.pattern.Path
    * @generated
    */
   EClass getPath ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.pattern.Path#getPathExpression <em>Path Expression</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Path Expression</em>'.
    * @see org.storydriven.modeling.pattern.Path#getPathExpression()
    * @see #getPath()
    * @generated
    */
   EReference getPath_PathExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.pattern.Object <em>Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Object</em>'.
    * @see org.storydriven.modeling.pattern.Object
    * @generated
    */
   EClass getObject ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.Object#getOwnedAttributeExpressions <em>Owned Attribute Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Owned Attribute Expression</em>'.
    * @see org.storydriven.modeling.pattern.Object#getOwnedAttributeExpressions()
    * @see #getObject()
    * @generated
    */
   EReference getObject_OwnedAttributeExpression ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.pattern.Object#getLinkToSources <em>Link To Source</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Link To Source</em>'.
    * @see org.storydriven.modeling.pattern.Object#getLinkToSources()
    * @see #getObject()
    * @generated
    */
   EReference getObject_LinkToSource ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.pattern.Object#getLinkToTargets <em>Link To Target</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Link To Target</em>'.
    * @see org.storydriven.modeling.pattern.Object#getLinkToTargets()
    * @see #getObject()
    * @generated
    */
   EReference getObject_LinkToTarget ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.pattern.Object#getPattern <em>Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for the container reference '<em>Pattern</em>'.
    * @see org.storydriven.modeling.pattern.Object#getPattern()
    * @see #getObject()
    * @generated
    */
   EReference getObject_Pattern ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.Object#getBound <em>Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Bound</em>'.
    * @see org.storydriven.modeling.pattern.Object#getBound()
    * @see #getObject()
    * @generated
    */
   EAttribute getObject_Bound ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.Object#getConstraint <em>Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Constraint</em>'.
    * @see org.storydriven.modeling.pattern.Object#getConstraint()
    * @see #getObject()
    * @generated
    */
   EAttribute getObject_Constraint ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.pattern.Object#getModifier <em>Modifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.storydriven.modeling.pattern.Object#getModifier()
    * @see #getObject()
    * @generated
    */
   EAttribute getObject_Modifier ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.pattern.Object#getClassifier <em>Classifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Classifier</em>'.
    * @see org.storydriven.modeling.pattern.Object#getClassifier()
    * @see #getObject()
    * @generated
    */
   EReference getObject_Classifier ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.pattern.Object#getBindingExpression <em>Binding Expression</em>}'. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Binding Expression</em>'.
    * @see org.storydriven.modeling.pattern.Object#getBindingExpression()
    * @see #getObject()
    * @generated
    */
   EReference getObject_BindingExpression ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.pattern.Object#getReceivedCollaborations <em>Received Collaboration</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Received Collaboration</em>'.
    * @see org.storydriven.modeling.pattern.Object#getReceivedCollaborations()
    * @see #getObject()
    * @generated
    */
   EReference getObject_ReceivedCollaboration ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.pattern.Object#getSentCollaborations <em>Sent Collaboration</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Sent Collaboration</em>'.
    * @see org.storydriven.modeling.pattern.Object#getSentCollaborations()
    * @see #getObject()
    * @generated
    */
   EReference getObject_SentCollaboration ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.pattern.Operator <em>Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Operator</em>'.
    * @see org.storydriven.modeling.pattern.Operator
    * @generated
    */
   EEnum getOperator ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.pattern.BoundType <em>Bound Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Bound Type</em>'.
    * @see org.storydriven.modeling.pattern.BoundType
    * @generated
    */
   EEnum getBoundType ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.pattern.Constraint <em>Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Constraint</em>'.
    * @see org.storydriven.modeling.pattern.Constraint
    * @generated
    */
   EEnum getConstraint ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.pattern.Modifier <em>Modifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Modifier</em>'.
    * @see org.storydriven.modeling.pattern.Modifier
    * @generated
    */
   EEnum getModifier ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.pattern.MultiLinkType <em>Multi Link Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Multi Link Type</em>'.
    * @see org.storydriven.modeling.pattern.MultiLinkType
    * @generated
    */
   EEnum getMultiLinkType ();

   /**
    * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   PatternFactory getPatternFactory ();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.impl.AttributeExpressionImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getAttributeExpression()
       * @generated
       */
      EClass ATTRIBUTE_EXPRESSION = eINSTANCE.getAttributeExpression();

      /**
       * The meta object literal for the '<em><b>Operator</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ATTRIBUTE_EXPRESSION__OPERATOR = eINSTANCE.getAttributeExpression_Operator();

      /**
       * The meta object literal for the '<em><b>Owning Object</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ATTRIBUTE_EXPRESSION__OWNING_OBJECT = eINSTANCE.getAttributeExpression_OwningObject();

      /**
       * The meta object literal for the '<em><b>Attribute</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ATTRIBUTE_EXPRESSION__ATTRIBUTE = eINSTANCE.getAttributeExpression_Attribute();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ATTRIBUTE_EXPRESSION__VALUE = eINSTANCE.getAttributeExpression_Value();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.LinkImpl <em>Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.impl.LinkImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getLink()
       * @generated
       */
      EClass LINK = eINSTANCE.getLink();

      /**
       * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute LINK__CONSTRAINT = eINSTANCE.getLink_Constraint();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute LINK__MODIFIER = eINSTANCE.getLink_Modifier();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__TARGET = eINSTANCE.getLink_Target();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__SOURCE = eINSTANCE.getLink_Source();

      /**
       * The meta object literal for the '<em><b>Multi Link To Target</b></em>' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__MULTI_LINK_TO_TARGET = eINSTANCE.getLink_MultiLinkToTarget();

      /**
       * The meta object literal for the '<em><b>Multi Link From Source</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__MULTI_LINK_FROM_SOURCE = eINSTANCE.getLink_MultiLinkFromSource();

      /**
       * The meta object literal for the '<em><b>Source End</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__SOURCE_END = eINSTANCE.getLink_SourceEnd();

      /**
       * The meta object literal for the '<em><b>Target End</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__TARGET_END = eINSTANCE.getLink_TargetEnd();

      /**
       * The meta object literal for the '<em><b>Range Expression</b></em>' containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LINK__RANGE_EXPRESSION = eINSTANCE.getLink_RangeExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl <em>Multi Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.impl.MultiLinkImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getMultiLink()
       * @generated
       */
      EClass MULTI_LINK = eINSTANCE.getMultiLink();

      /**
       * The meta object literal for the '<em><b>Index</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MULTI_LINK__INDEX = eINSTANCE.getMultiLink_Index();

      /**
       * The meta object literal for the '<em><b>Multi Link Type</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MULTI_LINK__MULTI_LINK_TYPE = eINSTANCE.getMultiLink_MultiLinkType();

      /**
       * The meta object literal for the '<em><b>Negative</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MULTI_LINK__NEGATIVE = eINSTANCE.getMultiLink_Negative();

      /**
       * The meta object literal for the '<em><b>Source Link</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MULTI_LINK__SOURCE_LINK = eINSTANCE.getMultiLink_SourceLink();

      /**
       * The meta object literal for the '<em><b>Target Object</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MULTI_LINK__TARGET_OBJECT = eINSTANCE.getMultiLink_TargetObject();

      /**
       * The meta object literal for the '<em><b>Target Link</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MULTI_LINK__TARGET_LINK = eINSTANCE.getMultiLink_TargetLink();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl <em>Object Pattern</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.pattern.impl.ObjectPatternImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getObjectPattern()
       * @generated
       */
      EClass OBJECT_PATTERN = eINSTANCE.getObjectPattern();

      /**
       * The meta object literal for the '<em><b>Owned Objects</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN__OWNED_OBJECTS = eINSTANCE.getObjectPattern_OwnedObjects();

      /**
       * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN__STATEMENT = eINSTANCE.getObjectPattern_Statement();

      /**
       * The meta object literal for the '<em><b>Owning Node</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN__OWNING_NODE = eINSTANCE.getObjectPattern_OwningNode();

      /**
       * The meta object literal for the '<em><b>Owning Pattern</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN__OWNING_PATTERN = eINSTANCE.getObjectPattern_OwningPattern();

      /**
       * The meta object literal for the '<em><b>Owned Pattern</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN__OWNED_PATTERN = eINSTANCE.getObjectPattern_OwnedPattern();

      /**
       * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute OBJECT_PATTERN__CONSTRAINT = eINSTANCE.getObjectPattern_Constraint();

      /**
       * The meta object literal for the '<em><b>Constraint Expression</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN__CONSTRAINT_EXPRESSION = eINSTANCE.getObjectPattern_ConstraintExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.StoryNodeImpl <em>Story Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.impl.StoryNodeImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getStoryNode()
       * @generated
       */
      EClass STORY_NODE = eINSTANCE.getStoryNode();

      /**
       * The meta object literal for the '<em><b>For Each</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute STORY_NODE__FOR_EACH = eINSTANCE.getStoryNode_ForEach();

      /**
       * The meta object literal for the '<em><b>Owned Pattern</b></em>' containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference STORY_NODE__OWNED_PATTERN = eINSTANCE.getStoryNode_OwnedPattern();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.PathImpl <em>Path</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.impl.PathImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getPath()
       * @generated
       */
      EClass PATH = eINSTANCE.getPath();

      /**
       * The meta object literal for the '<em><b>Path Expression</b></em>' containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PATH__PATH_EXPRESSION = eINSTANCE.getPath_PathExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.impl.ObjectImpl <em>Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.impl.ObjectImpl
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getObject()
       * @generated
       */
      EClass OBJECT = eINSTANCE.getObject();

      /**
       * The meta object literal for the '<em><b>Owned Attribute Expression</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__OWNED_ATTRIBUTE_EXPRESSION = eINSTANCE.getObject_OwnedAttributeExpression();

      /**
       * The meta object literal for the '<em><b>Link To Source</b></em>' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__LINK_TO_SOURCE = eINSTANCE.getObject_LinkToSource();

      /**
       * The meta object literal for the '<em><b>Link To Target</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__LINK_TO_TARGET = eINSTANCE.getObject_LinkToTarget();

      /**
       * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__PATTERN = eINSTANCE.getObject_Pattern();

      /**
       * The meta object literal for the '<em><b>Bound</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute OBJECT__BOUND = eINSTANCE.getObject_Bound();

      /**
       * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute OBJECT__CONSTRAINT = eINSTANCE.getObject_Constraint();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute OBJECT__MODIFIER = eINSTANCE.getObject_Modifier();

      /**
       * The meta object literal for the '<em><b>Classifier</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__CLASSIFIER = eINSTANCE.getObject_Classifier();

      /**
       * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__BINDING_EXPRESSION = eINSTANCE.getObject_BindingExpression();

      /**
       * The meta object literal for the '<em><b>Received Collaboration</b></em>' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__RECEIVED_COLLABORATION = eINSTANCE.getObject_ReceivedCollaboration();

      /**
       * The meta object literal for the '<em><b>Sent Collaboration</b></em>' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT__SENT_COLLABORATION = eINSTANCE.getObject_SentCollaboration();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.Operator <em>Operator</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.Operator
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getOperator()
       * @generated
       */
      EEnum OPERATOR = eINSTANCE.getOperator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.BoundType <em>Bound Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.BoundType
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getBoundType()
       * @generated
       */
      EEnum BOUND_TYPE = eINSTANCE.getBoundType();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.Constraint <em>Constraint</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.Constraint
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getConstraint()
       * @generated
       */
      EEnum CONSTRAINT = eINSTANCE.getConstraint();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.Modifier <em>Modifier</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.Modifier
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getModifier()
       * @generated
       */
      EEnum MODIFIER = eINSTANCE.getModifier();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.pattern.MultiLinkType <em>Multi Link Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.pattern.MultiLinkType
       * @see org.storydriven.modeling.pattern.impl.PatternPackageImpl#getMultiLinkType()
       * @generated
       */
      EEnum MULTI_LINK_TYPE = eINSTANCE.getMultiLinkType();

   }

} // PatternPackage
