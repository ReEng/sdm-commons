/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.storydriven.storydiagrams.calls.CallsPackage;

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
 * @see org.storydriven.storydiagrams.activities.ActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitiesPackage extends EPackage {
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
	String eNS_URI = "http://www..storydriven.org/storydiagrams/activities/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitiesPackage eINSTANCE = org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.ExceptionVariableImpl <em>Exception Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.ExceptionVariableImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getExceptionVariable()
	 * @generated
	 */
	int EXCEPTION_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__ANNOTATION = StorydiagramsPackage.VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__EXTENSION = StorydiagramsPackage.VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__TYPE = StorydiagramsPackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__GENERIC_TYPE = StorydiagramsPackage.VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__VARIABLE_NAME = StorydiagramsPackage.VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Activity Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__ACTIVITY_EDGE = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__NAME = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__EXCEPTION_TYPE = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPE = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exception Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_FEATURE_COUNT = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.ActivityEdgeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OWNING_ACTIVITY = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD_EXPRESSION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD_EXCEPTION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNING_ACTIVITY = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNING_ACTIVITY_NODE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.ActivityImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANNOTATION = CallsPackage.CALLABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSION = CallsPackage.CALLABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COMMENT = CallsPackage.CALLABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IN_PARAMETER = CallsPackage.CALLABLE__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUT_PARAMETER = CallsPackage.CALLABLE__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTAINED_PARAMETERS = CallsPackage.CALLABLE__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = CallsPackage.CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNING_OPERATION = CallsPackage.CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Activity Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_ACTIVITY_EDGE = CallsPackage.CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRECONDITION = CallsPackage.CALLABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_ACTIVITY_NODE = CallsPackage.CALLABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = CallsPackage.CALLABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl <em>Operation Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getOperationExtension()
	 * @generated
	 */
	int OPERATION_EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__ANNOTATION = CallsPackage.CALLABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__EXTENSION = CallsPackage.CALLABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__COMMENT = CallsPackage.CALLABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__IN_PARAMETER = CallsPackage.CALLABLE__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__OUT_PARAMETER = CallsPackage.CALLABLE__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__CONTAINED_PARAMETERS = CallsPackage.CALLABLE__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__BASE = CallsPackage.CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__MODEL_BASE = CallsPackage.CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__OWNING_ANNOTATION = CallsPackage.CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__EXTENDABLE_BASE = CallsPackage.CALLABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__OPERATION = CallsPackage.CALLABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__RETURN_VALUE = CallsPackage.CALLABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION__OWNED_ACTIVITY = CallsPackage.CALLABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operation Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXTENSION_FEATURE_COUNT = CallsPackage.CALLABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.StoryNodeImpl <em>Story Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.StoryNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStoryNode()
	 * @generated
	 */
	int STORY_NODE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__FOR_EACH = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE__STORY_PATTERN = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.MatchingStoryNodeImpl <em>Matching Story Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.MatchingStoryNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getMatchingStoryNode()
	 * @generated
	 */
	int MATCHING_STORY_NODE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__ANNOTATION = STORY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__EXTENSION = STORY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__COMMENT = STORY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__NAME = STORY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__OUTGOING = STORY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__OWNING_ACTIVITY = STORY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__OWNING_ACTIVITY_NODE = STORY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__INCOMING = STORY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__FOR_EACH = STORY_NODE__FOR_EACH;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__STORY_PATTERN = STORY_NODE__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Owned Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE__OWNED_PATTERN = STORY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matching Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_STORY_NODE_FEATURE_COUNT = STORY_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.StructuredNodeImpl <em>Structured Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.StructuredNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStructuredNode()
	 * @generated
	 */
	int STRUCTURED_NODE = 7;

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
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

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
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.JunctionNodeImpl <em>Junction Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.JunctionNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getJunctionNode()
	 * @generated
	 */
	int JUNCTION_NODE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Junction Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.StartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.StartNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStartNode()
	 * @generated
	 */
	int START_NODE = 9;

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
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.StatementNodeImpl <em>Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.StatementNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStatementNode()
	 * @generated
	 */
	int STATEMENT_NODE = 10;

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
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

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
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.StopNodeImpl <em>Stop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.StopNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStopNode()
	 * @generated
	 */
	int STOP_NODE = 11;

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
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Flow Stop Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__FLOW_STOP_ONLY = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__RETURN_VALUE = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__RETURN_VALUES = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityCallNodeImpl <em>Activity Call Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.ActivityCallNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivityCallNode()
	 * @generated
	 */
	int ACTIVITY_CALL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__CALLEE = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Called Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE__CALLED_ACTIVITY = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Call Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.impl.ModifyingStoryNodeImpl <em>Modifying Story Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.impl.ModifyingStoryNodeImpl
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getModifyingStoryNode()
	 * @generated
	 */
	int MODIFYING_STORY_NODE = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__ANNOTATION = STORY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__EXTENSION = STORY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__COMMENT = STORY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__NAME = STORY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__OUTGOING = STORY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__OWNING_ACTIVITY = STORY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__OWNING_ACTIVITY_NODE = STORY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__INCOMING = STORY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__FOR_EACH = STORY_NODE__FOR_EACH;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__STORY_PATTERN = STORY_NODE__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE__OWNED_RULE = STORY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modifying Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFYING_STORY_NODE_FEATURE_COUNT = STORY_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.activities.EdgeGuard <em>Edge Guard</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.activities.EdgeGuard
	 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getEdgeGuard()
	 * @generated
	 */
	int EDGE_GUARD = 14;


	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.ExceptionVariable <em>Exception Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Variable</em>'.
	 * @see org.storydriven.storydiagrams.activities.ExceptionVariable
	 * @generated
	 */
	EClass getExceptionVariable();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity Edge</em>'.
	 * @see org.storydriven.storydiagrams.activities.ExceptionVariable#getActivityEdge()
	 * @see #getExceptionVariable()
	 * @generated
	 */
	EReference getExceptionVariable_ActivityEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.activities.ExceptionVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.storydriven.storydiagrams.activities.ExceptionVariable#getName()
	 * @see #getExceptionVariable()
	 * @generated
	 */
	EAttribute getExceptionVariable_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.activities.ExceptionVariable#getExceptionTypes <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception Type</em>'.
	 * @see org.storydriven.storydiagrams.activities.ExceptionVariable#getExceptionTypes()
	 * @see #getExceptionVariable()
	 * @generated
	 */
	EReference getExceptionVariable_ExceptionType();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.activities.ExceptionVariable#getGenericExceptionTypes <em>Generic Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generic Exception Type</em>'.
	 * @see org.storydriven.storydiagrams.activities.ExceptionVariable#getGenericExceptionTypes()
	 * @see #getExceptionVariable()
	 * @generated
	 */
	EReference getExceptionVariable_GenericExceptionType();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Activity</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge#getOwningActivity()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_OwningActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge#getGuard()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard Expression</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExpression()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_GuardExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExceptions <em>Guard Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard Exception</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityEdge#getGuardExceptions()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_GuardException();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.activities.ActivityNode#getOutgoings <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityNode#getOutgoings()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Activity</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityNode#getOwningActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_OwningActivity();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Activity Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityNode#getOwningActivityNode()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_OwningActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.activities.ActivityNode#getIncomings <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityNode#getIncomings()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.storydriven.storydiagrams.activities.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.activities.Activity#getOwningOperation <em>Owning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Operation</em>'.
	 * @see org.storydriven.storydiagrams.activities.Activity#getOwningOperation()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwningOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.activities.Activity#getOwnedActivityEdges <em>Owned Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Activity Edge</em>'.
	 * @see org.storydriven.storydiagrams.activities.Activity#getOwnedActivityEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwnedActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.activities.Activity#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precondition</em>'.
	 * @see org.storydriven.storydiagrams.activities.Activity#getPrecondition()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.activities.Activity#getOwnedActivityNodes <em>Owned Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Activity Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.Activity#getOwnedActivityNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwnedActivityNode();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.OperationExtension <em>Operation Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Extension</em>'.
	 * @see org.storydriven.storydiagrams.activities.OperationExtension
	 * @generated
	 */
	EClass getOperationExtension();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.activities.OperationExtension#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.storydriven.storydiagrams.activities.OperationExtension#getOperation()
	 * @see #getOperationExtension()
	 * @generated
	 */
	EReference getOperationExtension_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.activities.OperationExtension#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see org.storydriven.storydiagrams.activities.OperationExtension#getReturnValue()
	 * @see #getOperationExtension()
	 * @generated
	 */
	EReference getOperationExtension_ReturnValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Activity</em>'.
	 * @see org.storydriven.storydiagrams.activities.OperationExtension#getOwnedActivity()
	 * @see #getOperationExtension()
	 * @generated
	 */
	EReference getOperationExtension_OwnedActivity();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.MatchingStoryNode <em>Matching Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Story Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.MatchingStoryNode
	 * @generated
	 */
	EClass getMatchingStoryNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.activities.MatchingStoryNode#getOwnedPattern <em>Owned Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Pattern</em>'.
	 * @see org.storydriven.storydiagrams.activities.MatchingStoryNode#getOwnedPattern()
	 * @see #getMatchingStoryNode()
	 * @generated
	 */
	EReference getMatchingStoryNode_OwnedPattern();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.StoryNode <em>Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.StoryNode
	 * @generated
	 */
	EClass getStoryNode();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.activities.StoryNode#isForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Each</em>'.
	 * @see org.storydriven.storydiagrams.activities.StoryNode#isForEach()
	 * @see #getStoryNode()
	 * @generated
	 */
	EAttribute getStoryNode_ForEach();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.activities.StoryNode#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern</em>'.
	 * @see org.storydriven.storydiagrams.activities.StoryNode#getStoryPattern()
	 * @see #getStoryNode()
	 * @generated
	 */
	EReference getStoryNode_StoryPattern();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.StructuredNode <em>Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.StructuredNode
	 * @generated
	 */
	EClass getStructuredNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.activities.StructuredNode#getOwnedActivityNodes <em>Owned Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Activity Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.StructuredNode#getOwnedActivityNodes()
	 * @see #getStructuredNode()
	 * @generated
	 */
	EReference getStructuredNode_OwnedActivityNode();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.JunctionNode <em>Junction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.JunctionNode
	 * @generated
	 */
	EClass getJunctionNode();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.StartNode
	 * @generated
	 */
	EClass getStartNode();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.StatementNode <em>Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.StatementNode
	 * @generated
	 */
	EClass getStatementNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement Expression</em>'.
	 * @see org.storydriven.storydiagrams.activities.StatementNode#getStatementExpression()
	 * @see #getStatementNode()
	 * @generated
	 */
	EReference getStatementNode_StatementExpression();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.StopNode <em>Stop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.StopNode
	 * @generated
	 */
	EClass getStopNode();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Stop Only</em>'.
	 * @see org.storydriven.storydiagrams.activities.StopNode#isFlowStopOnly()
	 * @see #getStopNode()
	 * @generated
	 */
	EAttribute getStopNode_FlowStopOnly();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.activities.StopNode#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see org.storydriven.storydiagrams.activities.StopNode#getReturnValue()
	 * @see #getStopNode()
	 * @generated
	 */
	EReference getStopNode_ReturnValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.activities.StopNode#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see org.storydriven.storydiagrams.activities.StopNode#getReturnValues()
	 * @see #getStopNode()
	 * @generated
	 */
	EReference getStopNode_ReturnValues();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.ActivityCallNode <em>Activity Call Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Call Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityCallNode
	 * @generated
	 */
	EClass getActivityCallNode();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.activities.ActivityCallNode#getCalledActivities <em>Called Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Called Activity</em>'.
	 * @see org.storydriven.storydiagrams.activities.ActivityCallNode#getCalledActivities()
	 * @see #getActivityCallNode()
	 * @generated
	 */
	EReference getActivityCallNode_CalledActivity();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.activities.ModifyingStoryNode <em>Modifying Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifying Story Node</em>'.
	 * @see org.storydriven.storydiagrams.activities.ModifyingStoryNode
	 * @generated
	 */
	EClass getModifyingStoryNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.activities.ModifyingStoryNode#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Rule</em>'.
	 * @see org.storydriven.storydiagrams.activities.ModifyingStoryNode#getOwnedRule()
	 * @see #getModifyingStoryNode()
	 * @generated
	 */
	EReference getModifyingStoryNode_OwnedRule();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.activities.EdgeGuard <em>Edge Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Guard</em>'.
	 * @see org.storydriven.storydiagrams.activities.EdgeGuard
	 * @generated
	 */
	EEnum getEdgeGuard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitiesFactory getActivitiesFactory();

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
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.ExceptionVariableImpl <em>Exception Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.ExceptionVariableImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getExceptionVariable()
		 * @generated
		 */
		EClass EXCEPTION_VARIABLE = eINSTANCE.getExceptionVariable();

		/**
		 * The meta object literal for the '<em><b>Activity Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_VARIABLE__ACTIVITY_EDGE = eINSTANCE.getExceptionVariable_ActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_VARIABLE__NAME = eINSTANCE.getExceptionVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_VARIABLE__EXCEPTION_TYPE = eINSTANCE.getExceptionVariable_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Generic Exception Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPE = eINSTANCE.getExceptionVariable_GenericExceptionType();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.ActivityEdgeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivityEdge()
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
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Owning Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__OWNING_ACTIVITY = eINSTANCE.getActivityEdge_OwningActivity();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__GUARD_EXPRESSION = eINSTANCE.getActivityEdge_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Guard Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__GUARD_EXCEPTION = eINSTANCE.getActivityEdge_GuardException();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Owning Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OWNING_ACTIVITY = eINSTANCE.getActivityNode_OwningActivity();

		/**
		 * The meta object literal for the '<em><b>Owning Activity Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OWNING_ACTIVITY_NODE = eINSTANCE.getActivityNode_OwningActivityNode();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.ActivityImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Owning Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OWNING_OPERATION = eINSTANCE.getActivity_OwningOperation();

		/**
		 * The meta object literal for the '<em><b>Owned Activity Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OWNED_ACTIVITY_EDGE = eINSTANCE.getActivity_OwnedActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PRECONDITION = eINSTANCE.getActivity_Precondition();

		/**
		 * The meta object literal for the '<em><b>Owned Activity Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OWNED_ACTIVITY_NODE = eINSTANCE.getActivity_OwnedActivityNode();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl <em>Operation Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getOperationExtension()
		 * @generated
		 */
		EClass OPERATION_EXTENSION = eINSTANCE.getOperationExtension();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXTENSION__OPERATION = eINSTANCE.getOperationExtension_Operation();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXTENSION__RETURN_VALUE = eINSTANCE.getOperationExtension_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Owned Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXTENSION__OWNED_ACTIVITY = eINSTANCE.getOperationExtension_OwnedActivity();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.MatchingStoryNodeImpl <em>Matching Story Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.MatchingStoryNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getMatchingStoryNode()
		 * @generated
		 */
		EClass MATCHING_STORY_NODE = eINSTANCE.getMatchingStoryNode();

		/**
		 * The meta object literal for the '<em><b>Owned Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_STORY_NODE__OWNED_PATTERN = eINSTANCE.getMatchingStoryNode_OwnedPattern();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.StoryNodeImpl <em>Story Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.StoryNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStoryNode()
		 * @generated
		 */
		EClass STORY_NODE = eINSTANCE.getStoryNode();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_NODE__FOR_EACH = eINSTANCE.getStoryNode_ForEach();

		/**
		 * The meta object literal for the '<em><b>Story Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_NODE__STORY_PATTERN = eINSTANCE.getStoryNode_StoryPattern();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.StructuredNodeImpl <em>Structured Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.StructuredNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStructuredNode()
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
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.JunctionNodeImpl <em>Junction Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.JunctionNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getJunctionNode()
		 * @generated
		 */
		EClass JUNCTION_NODE = eINSTANCE.getJunctionNode();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.StartNodeImpl <em>Start Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.StartNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStartNode()
		 * @generated
		 */
		EClass START_NODE = eINSTANCE.getStartNode();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.StatementNodeImpl <em>Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.StatementNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStatementNode()
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
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.StopNodeImpl <em>Stop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.StopNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getStopNode()
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
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_NODE__RETURN_VALUE = eINSTANCE.getStopNode_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_NODE__RETURN_VALUES = eINSTANCE.getStopNode_ReturnValues();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.ActivityCallNodeImpl <em>Activity Call Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.ActivityCallNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getActivityCallNode()
		 * @generated
		 */
		EClass ACTIVITY_CALL_NODE = eINSTANCE.getActivityCallNode();

		/**
		 * The meta object literal for the '<em><b>Called Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CALL_NODE__CALLED_ACTIVITY = eINSTANCE.getActivityCallNode_CalledActivity();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.impl.ModifyingStoryNodeImpl <em>Modifying Story Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.impl.ModifyingStoryNodeImpl
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getModifyingStoryNode()
		 * @generated
		 */
		EClass MODIFYING_STORY_NODE = eINSTANCE.getModifyingStoryNode();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFYING_STORY_NODE__OWNED_RULE = eINSTANCE.getModifyingStoryNode_OwnedRule();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.activities.EdgeGuard <em>Edge Guard</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.activities.EdgeGuard
		 * @see org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl#getEdgeGuard()
		 * @generated
		 */
		EEnum EDGE_GUARD = eINSTANCE.getEdgeGuard();

	}

} //ActivitiesPackage
