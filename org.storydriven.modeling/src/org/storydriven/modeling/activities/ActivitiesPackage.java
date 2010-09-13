/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.modeling.SDMPackage;

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
 * @see org.storydriven.modeling.activities.ActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitiesPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "activities";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/activities/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdma";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ActivitiesPackage eINSTANCE = org.storydriven.modeling.activities.impl.ActivitiesPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityImpl <em>Activity</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivity()
    * @generated
    */
   int ACTIVITY = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__ANNOTATION = SDMPackage.COMMENTABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__EXTENSION = SDMPackage.COMMENTABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__COMMENT = SDMPackage.COMMENTABLE_ELEMENT__COMMENT;

   /**
    * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OWNED_ACTIVITY_NODE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OWNING_OPERATION = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Activity</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_FEATURE_COUNT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl <em>Operation Extension</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.OperationExtensionImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getOperationExtension()
    * @generated
    */
   int OPERATION_EXTENSION = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__ANNOTATION = SDMPackage.EXTENSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__EXTENSION = SDMPackage.EXTENSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Base</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__BASE = SDMPackage.EXTENSION__BASE;

   /**
    * The feature id for the '<em><b>Model Base</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__MODEL_BASE = SDMPackage.EXTENSION__MODEL_BASE;

   /**
    * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__OWNING_ANNOTATION = SDMPackage.EXTENSION__OWNING_ANNOTATION;

   /**
    * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__EXTENDABLE_BASE = SDMPackage.EXTENSION__EXTENDABLE_BASE;

   /**
    * The feature id for the '<em><b>Owned Activity</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__OWNED_ACTIVITY = SDMPackage.EXTENSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Operation Extension</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION_FEATURE_COUNT = SDMPackage.EXTENSION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityEdgeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityEdge()
    * @generated
    */
   int ACTIVITY_EDGE = 2;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__TARGET = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Source</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__SOURCE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Guard Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__GUARD_TYPE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Owned Guard Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Activity Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityNode()
    * @generated
    */
   int ACTIVITY_NODE = 9;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__ANNOTATION = SDMPackage.COMMENTABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__EXTENSION = SDMPackage.COMMENTABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__COMMENT = SDMPackage.COMMENTABLE_ELEMENT__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__NAME = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OWNING_ACTIVITY = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__INCOMING = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OUTGOING = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OWNING_ACTIVITY_NODE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Activity Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE_FEATURE_COUNT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.DecisionNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getDecisionNode()
    * @generated
    */
   int DECISION_NODE = 3;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The number of structural features of the '<em>Decision Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ExceptionExpressionImpl <em>Exception Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ExceptionExpressionImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getExceptionExpression()
    * @generated
    */
   int EXCEPTION_EXPRESSION = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION__ANNOTATION = SDMPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION__EXTENSION = SDMPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION__TYPE = SDMPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION__GENERIC_TYPE = SDMPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Exception Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION__EXCEPTION_TYPE = SDMPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION__VARIABLE_NAME = SDMPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Exception Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_EXPRESSION_FEATURE_COUNT = SDMPackage.EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StartNodeImpl <em>Start Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StartNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStartNode()
    * @generated
    */
   int START_NODE = 5;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The number of structural features of the '<em>Start Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StatementNodeImpl <em>Statement Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StatementNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStatementNode()
    * @generated
    */
   int STATEMENT_NODE = 6;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Statement Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__STATEMENT_EXPRESSION = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Statement Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StopNodeImpl <em>Stop Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StopNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStopNode()
    * @generated
    */
   int STOP_NODE = 7;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Flow Stop Only</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__FLOW_STOP_ONLY = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Return Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__RETURN_VALUE = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Stop Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StructuredNodeImpl <em>Structured Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StructuredNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStructuredNode()
    * @generated
    */
   int STRUCTURED_NODE = 8;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OWNED_ACTIVITY_NODE = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Structured Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.TransitionGuard <em>Transition Guard</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.TransitionGuard
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getTransitionGuard()
    * @generated
    */
   int TRANSITION_GUARD = 10;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.Activity <em>Activity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity</em>'.
    * @see org.storydriven.modeling.activities.Activity
    * @generated
    */
   EClass getActivity ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.Activity#getOwnedActivityNodes <em>Owned Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Owned Activity Node</em>'.
    * @see org.storydriven.modeling.activities.Activity#getOwnedActivityNodes()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_OwnedActivityNode ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.Activity#getOwningOperation <em>Owning Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Owning Operation</em>'.
    * @see org.storydriven.modeling.activities.Activity#getOwningOperation()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_OwningOperation ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.OperationExtension <em>Operation Extension</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Operation Extension</em>'.
    * @see org.storydriven.modeling.activities.OperationExtension
    * @generated
    */
   EClass getOperationExtension ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Owned Activity</em>'.
    * @see org.storydriven.modeling.activities.OperationExtension#getOwnedActivity()
    * @see #getOperationExtension()
    * @generated
    */
   EReference getOperationExtension_OwnedActivity ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ActivityEdge <em>Activity Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Edge</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge
    * @generated
    */
   EClass getActivityEdge ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.ActivityEdge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getTarget()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Target ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ActivityEdge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Source</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getSource()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Source ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.ActivityEdge#getGuardType <em>Guard Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Guard Type</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getGuardType()
    * @see #getActivityEdge()
    * @generated
    */
   EAttribute getActivityEdge_GuardType ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.ActivityEdge#getOwnedGuardExpression <em>Owned Guard Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Owned Guard Expression</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getOwnedGuardExpression()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_OwnedGuardExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.DecisionNode <em>Decision Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Decision Node</em>'.
    * @see org.storydriven.modeling.activities.DecisionNode
    * @generated
    */
   EClass getDecisionNode ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ExceptionExpression <em>Exception Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Exception Expression</em>'.
    * @see org.storydriven.modeling.activities.ExceptionExpression
    * @generated
    */
   EClass getExceptionExpression ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ExceptionExpression#getExceptionTypes <em>Exception Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Exception Type</em>'.
    * @see org.storydriven.modeling.activities.ExceptionExpression#getExceptionTypes()
    * @see #getExceptionExpression()
    * @generated
    */
   EReference getExceptionExpression_ExceptionType ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.ExceptionExpression#getVariableName <em>Variable Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Variable Name</em>'.
    * @see org.storydriven.modeling.activities.ExceptionExpression#getVariableName()
    * @see #getExceptionExpression()
    * @generated
    */
   EAttribute getExceptionExpression_VariableName ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StartNode <em>Start Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Start Node</em>'.
    * @see org.storydriven.modeling.activities.StartNode
    * @generated
    */
   EClass getStartNode ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StatementNode <em>Statement Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Statement Node</em>'.
    * @see org.storydriven.modeling.activities.StatementNode
    * @generated
    */
   EClass getStatementNode ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Statement Expression</em>'.
    * @see org.storydriven.modeling.activities.StatementNode#getStatementExpression()
    * @see #getStatementNode()
    * @generated
    */
   EReference getStatementNode_StatementExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StopNode <em>Stop Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Stop Node</em>'.
    * @see org.storydriven.modeling.activities.StopNode
    * @generated
    */
   EClass getStopNode ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Flow Stop Only</em>'.
    * @see org.storydriven.modeling.activities.StopNode#isFlowStopOnly()
    * @see #getStopNode()
    * @generated
    */
   EAttribute getStopNode_FlowStopOnly ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.StopNode#getReturnValue <em>Return Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Return Value</em>'.
    * @see org.storydriven.modeling.activities.StopNode#getReturnValue()
    * @see #getStopNode()
    * @generated
    */
   EReference getStopNode_ReturnValue ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StructuredNode <em>Structured Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Structured Node</em>'.
    * @see org.storydriven.modeling.activities.StructuredNode
    * @generated
    */
   EClass getStructuredNode ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.StructuredNode#getOwnedActivityNodes <em>Owned Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Owned Activity Node</em>'.
    * @see org.storydriven.modeling.activities.StructuredNode#getOwnedActivityNodes()
    * @see #getStructuredNode()
    * @generated
    */
   EReference getStructuredNode_OwnedActivityNode ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ActivityNode <em>Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Node</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode
    * @generated
    */
   EClass getActivityNode ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Owning Activity</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getOwningActivity()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_OwningActivity ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ActivityNode#getIncomings <em>Incoming</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Incoming</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getIncomings()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_Incoming ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.ActivityNode#getOutgoings <em>Outgoing</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Outgoing</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getOutgoings()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_Outgoing ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Owning Activity Node</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getOwningActivityNode()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_OwningActivityNode ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.activities.TransitionGuard <em>Transition Guard</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Transition Guard</em>'.
    * @see org.storydriven.modeling.activities.TransitionGuard
    * @generated
    */
   EEnum getTransitionGuard ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ActivitiesFactory getActivitiesFactory ();

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
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityImpl <em>Activity</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ActivityImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivity()
       * @generated
       */
      EClass ACTIVITY = eINSTANCE.getActivity();

      /**
       * The meta object literal for the '<em><b>Owned Activity Node</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__OWNED_ACTIVITY_NODE = eINSTANCE.getActivity_OwnedActivityNode();

      /**
       * The meta object literal for the '<em><b>Owning Operation</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__OWNING_OPERATION = eINSTANCE.getActivity_OwningOperation();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl <em>Operation Extension</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.OperationExtensionImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getOperationExtension()
       * @generated
       */
      EClass OPERATION_EXTENSION = eINSTANCE.getOperationExtension();

      /**
       * The meta object literal for the '<em><b>Owned Activity</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_EXTENSION__OWNED_ACTIVITY = eINSTANCE.getOperationExtension_OwnedActivity();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ActivityEdgeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityEdge()
       * @generated
       */
      EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

      /**
       * The meta object literal for the '<em><b>Guard Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ACTIVITY_EDGE__GUARD_TYPE = eINSTANCE.getActivityEdge_GuardType();

      /**
       * The meta object literal for the '<em><b>Owned Guard Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION = eINSTANCE.getActivityEdge_OwnedGuardExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.DecisionNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getDecisionNode()
       * @generated
       */
      EClass DECISION_NODE = eINSTANCE.getDecisionNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ExceptionExpressionImpl <em>Exception Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ExceptionExpressionImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getExceptionExpression()
       * @generated
       */
      EClass EXCEPTION_EXPRESSION = eINSTANCE.getExceptionExpression();

      /**
       * The meta object literal for the '<em><b>Exception Type</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXCEPTION_EXPRESSION__EXCEPTION_TYPE = eINSTANCE.getExceptionExpression_ExceptionType();

      /**
       * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXCEPTION_EXPRESSION__VARIABLE_NAME = eINSTANCE.getExceptionExpression_VariableName();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StartNodeImpl <em>Start Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StartNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStartNode()
       * @generated
       */
      EClass START_NODE = eINSTANCE.getStartNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StatementNodeImpl <em>Statement Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StatementNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStatementNode()
       * @generated
       */
      EClass STATEMENT_NODE = eINSTANCE.getStatementNode();

      /**
       * The meta object literal for the '<em><b>Statement Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference STATEMENT_NODE__STATEMENT_EXPRESSION = eINSTANCE.getStatementNode_StatementExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StopNodeImpl <em>Stop Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StopNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStopNode()
       * @generated
       */
      EClass STOP_NODE = eINSTANCE.getStopNode();

      /**
       * The meta object literal for the '<em><b>Flow Stop Only</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute STOP_NODE__FLOW_STOP_ONLY = eINSTANCE.getStopNode_FlowStopOnly();

      /**
       * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference STOP_NODE__RETURN_VALUE = eINSTANCE.getStopNode_ReturnValue();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StructuredNodeImpl <em>Structured Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StructuredNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStructuredNode()
       * @generated
       */
      EClass STRUCTURED_NODE = eINSTANCE.getStructuredNode();

      /**
       * The meta object literal for the '<em><b>Owned Activity Node</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference STRUCTURED_NODE__OWNED_ACTIVITY_NODE = eINSTANCE.getStructuredNode_OwnedActivityNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ActivityNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityNode()
       * @generated
       */
      EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

      /**
       * The meta object literal for the '<em><b>Owning Activity</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OWNING_ACTIVITY = eINSTANCE.getActivityNode_OwningActivity();

      /**
       * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

      /**
       * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

      /**
       * The meta object literal for the '<em><b>Owning Activity Node</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OWNING_ACTIVITY_NODE = eINSTANCE.getActivityNode_OwningActivityNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.TransitionGuard <em>Transition Guard</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.TransitionGuard
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getTransitionGuard()
       * @generated
       */
      EEnum TRANSITION_GUARD = eINSTANCE.getTransitionGuard();

   }

} //ActivitiesPackage
