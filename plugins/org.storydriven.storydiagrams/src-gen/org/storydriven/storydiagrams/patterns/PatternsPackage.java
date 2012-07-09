/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;

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
 * <!-- begin-model-doc -->
 * This package contains all classes for modeling story patterns that may be 
 * embedded into StoryActivityNodes of an Activity.
 * <!-- end-model-doc -->
 * @see org.storydriven.storydiagrams.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.storydriven.org/storydiagrams/patterns/0.2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.AbstractVariableImpl <em>Abstract Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.AbstractVariableImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getAbstractVariable()
	 * @generated
	 */
	int ABSTRACT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__ANNOTATION = StorydiagramsPackage.VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__EXTENSION = StorydiagramsPackage.VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__TYPE = StorydiagramsPackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__GENERIC_TYPE = StorydiagramsPackage.VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__VARIABLE_NAME = StorydiagramsPackage.VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__NAME = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__PATTERN = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__BINDING_STATE = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__BINDING_EXPRESSION = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__CONSTRAINT = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE__INCOMING_LINK = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_FEATURE_COUNT = StorydiagramsPackage.VARIABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ECLASS = StorydiagramsPackage.VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EIS_PROXY = StorydiagramsPackage.VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ERESOURCE = StorydiagramsPackage.VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ECONTAINER = StorydiagramsPackage.VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ECONTAINING_FEATURE = StorydiagramsPackage.VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ECONTAINMENT_FEATURE = StorydiagramsPackage.VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ECONTENTS = StorydiagramsPackage.VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EALL_CONTENTS = StorydiagramsPackage.VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ECROSS_REFERENCES = StorydiagramsPackage.VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE = StorydiagramsPackage.VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = StorydiagramsPackage.VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = StorydiagramsPackage.VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = StorydiagramsPackage.VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = StorydiagramsPackage.VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___EINVOKE__EOPERATION_ELIST = StorydiagramsPackage.VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS = StorydiagramsPackage.VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___PROVIDE_EXTENSION__ECLASS = StorydiagramsPackage.VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___GET_ANNOTATION__STRING = StorydiagramsPackage.VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE___PROVIDE_ANNOTATION__STRING = StorydiagramsPackage.VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Abstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_OPERATION_COUNT = StorydiagramsPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.ObjectVariableImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getObjectVariable()
	 * @generated
	 */
	int OBJECT_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__ANNOTATION = ABSTRACT_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__EXTENSION = ABSTRACT_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__TYPE = ABSTRACT_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__GENERIC_TYPE = ABSTRACT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__VARIABLE_NAME = ABSTRACT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__NAME = ABSTRACT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__PATTERN = ABSTRACT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_STATE = ABSTRACT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_EXPRESSION = ABSTRACT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__CONSTRAINT = ABSTRACT_VARIABLE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__INCOMING_LINK = ABSTRACT_VARIABLE__INCOMING_LINK;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__OUTGOING_LINK = ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Order Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT = ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_SEMANTICS = ABSTRACT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_OPERATOR = ABSTRACT_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT = ABSTRACT_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__CLASSIFIER = ABSTRACT_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_FEATURE_COUNT = ABSTRACT_VARIABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ECLASS = ABSTRACT_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EIS_PROXY = ABSTRACT_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ERESOURCE = ABSTRACT_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ECONTAINER = ABSTRACT_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ECONTAINING_FEATURE = ABSTRACT_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ECONTAINMENT_FEATURE = ABSTRACT_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ECONTENTS = ABSTRACT_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EALL_CONTENTS = ABSTRACT_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ECROSS_REFERENCES = ABSTRACT_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___EINVOKE__EOPERATION_ELIST = ABSTRACT_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___PROVIDE_EXTENSION__ECLASS = ABSTRACT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___GET_ANNOTATION__STRING = ABSTRACT_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE___PROVIDE_ANNOTATION__STRING = ABSTRACT_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_OPERATION_COUNT = ABSTRACT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.ConstraintImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Constraint Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OBJECT_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.AbstractLinkVariableImpl <em>Abstract Link Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.AbstractLinkVariableImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getAbstractLinkVariable()
	 * @generated
	 */
	int ABSTRACT_LINK_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__SOURCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__PATTERN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE__TARGET = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Abstract Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_VARIABLE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.LinkConstraintImpl <em>Link Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.LinkConstraintImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getLinkConstraint()
	 * @generated
	 */
	int LINK_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__INDEX = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__CONSTRAINT_TYPE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__NEGATIVE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__FIRST_LINK = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referencing Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__REFERENCING_OBJECT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Second Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT__SECOND_LINK = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Link Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Link Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINT_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.AttributeAssignmentImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl <em>Collection Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getCollectionVariable()
	 * @generated
	 */
	int COLLECTION_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__ANNOTATION = OBJECT_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__EXTENSION = OBJECT_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__TYPE = OBJECT_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__GENERIC_TYPE = OBJECT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__VARIABLE_NAME = OBJECT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__NAME = OBJECT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__PATTERN = OBJECT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_STATE = OBJECT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_EXPRESSION = OBJECT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__CONSTRAINT = OBJECT_VARIABLE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__INCOMING_LINK = OBJECT_VARIABLE__INCOMING_LINK;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__OUTGOING_LINK = OBJECT_VARIABLE__OUTGOING_LINK;

	/**
	 * The feature id for the '<em><b>Link Order Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__LINK_ORDER_CONSTRAINT = OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_SEMANTICS = OBJECT_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__BINDING_OPERATOR = OBJECT_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__ATTRIBUTE_ASSIGNMENT = OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__CLASSIFIER = OBJECT_VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Maybe Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE__MAYBE_EMPTY = OBJECT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_FEATURE_COUNT = OBJECT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ECLASS = OBJECT_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EIS_PROXY = OBJECT_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ERESOURCE = OBJECT_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ECONTAINER = OBJECT_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ECONTAINING_FEATURE = OBJECT_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ECONTAINMENT_FEATURE = OBJECT_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ECONTENTS = OBJECT_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EALL_CONTENTS = OBJECT_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ECROSS_REFERENCES = OBJECT_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EGET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = OBJECT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EUNSET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___EINVOKE__EOPERATION_ELIST = OBJECT_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___GET_EXTENSION__ECLASS = OBJECT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___PROVIDE_EXTENSION__ECLASS = OBJECT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___GET_ANNOTATION__STRING = OBJECT_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE___PROVIDE_ANNOTATION__STRING = OBJECT_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Collection Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_OPERATION_COUNT = OBJECT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.PrimitiveVariableImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getPrimitiveVariable()
	 * @generated
	 */
	int PRIMITIVE_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__ANNOTATION = ABSTRACT_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__EXTENSION = ABSTRACT_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__TYPE = ABSTRACT_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__GENERIC_TYPE = ABSTRACT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__VARIABLE_NAME = ABSTRACT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__NAME = ABSTRACT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__PATTERN = ABSTRACT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__BINDING_STATE = ABSTRACT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__BINDING_EXPRESSION = ABSTRACT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__CONSTRAINT = ABSTRACT_VARIABLE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__INCOMING_LINK = ABSTRACT_VARIABLE__INCOMING_LINK;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__CLASSIFIER = ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_FEATURE_COUNT = ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ECLASS = ABSTRACT_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EIS_PROXY = ABSTRACT_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ERESOURCE = ABSTRACT_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ECONTAINER = ABSTRACT_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ECONTAINING_FEATURE = ABSTRACT_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ECONTAINMENT_FEATURE = ABSTRACT_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ECONTENTS = ABSTRACT_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EALL_CONTENTS = ABSTRACT_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ECROSS_REFERENCES = ABSTRACT_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EGET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___EINVOKE__EOPERATION_ELIST = ABSTRACT_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___PROVIDE_EXTENSION__ECLASS = ABSTRACT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___GET_ANNOTATION__STRING = ABSTRACT_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE___PROVIDE_ANNOTATION__STRING = ABSTRACT_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Primitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_OPERATION_COUNT = ABSTRACT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.PathImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The feature id for the '<em><b>Path Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH_EXPRESSION = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.LinkVariableImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getLinkVariable()
	 * @generated
	 */
	int LINK_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SOURCE_END = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__TARGET_END = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__QUALIFIER_EXPRESSION = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.InclusionLinkImpl <em>Inclusion Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.InclusionLinkImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getInclusionLink()
	 * @generated
	 */
	int INCLUSION_LINK = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The number of structural features of the '<em>Inclusion Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Inclusion Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_LINK_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.StoryPatternImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getStoryPattern()
	 * @generated
	 */
	int STORY_PATTERN = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__VARIABLE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__CONSTRAINT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__LINK_VARIABLE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__PARENT_PATTERN = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__CONTAINED_PATTERN = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__BINDING_SEMANTICS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__TEMPLATE_SIGNATURE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___PROVIDE_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___GET_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN___PROVIDE_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.MatchingPatternImpl <em>Matching Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.MatchingPatternImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getMatchingPattern()
	 * @generated
	 */
	int MATCHING_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__ANNOTATION = STORY_PATTERN__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__EXTENSION = STORY_PATTERN__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__COMMENT = STORY_PATTERN__COMMENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__VARIABLE = STORY_PATTERN__VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__CONSTRAINT = STORY_PATTERN__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__LINK_VARIABLE = STORY_PATTERN__LINK_VARIABLE;

	/**
	 * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__PARENT_PATTERN = STORY_PATTERN__PARENT_PATTERN;

	/**
	 * The feature id for the '<em><b>Contained Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__CONTAINED_PATTERN = STORY_PATTERN__CONTAINED_PATTERN;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__BINDING_SEMANTICS = STORY_PATTERN__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN__TEMPLATE_SIGNATURE = STORY_PATTERN__TEMPLATE_SIGNATURE;

	/**
	 * The number of structural features of the '<em>Matching Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN_FEATURE_COUNT = STORY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ECLASS = STORY_PATTERN___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EIS_PROXY = STORY_PATTERN___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ERESOURCE = STORY_PATTERN___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ECONTAINER = STORY_PATTERN___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ECONTAINING_FEATURE = STORY_PATTERN___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ECONTAINMENT_FEATURE = STORY_PATTERN___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ECONTENTS = STORY_PATTERN___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EALL_CONTENTS = STORY_PATTERN___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ECROSS_REFERENCES = STORY_PATTERN___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EGET__ESTRUCTURALFEATURE = STORY_PATTERN___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = STORY_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = STORY_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EIS_SET__ESTRUCTURALFEATURE = STORY_PATTERN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EUNSET__ESTRUCTURALFEATURE = STORY_PATTERN___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___EINVOKE__EOPERATION_ELIST = STORY_PATTERN___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___GET_EXTENSION__ECLASS = STORY_PATTERN___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___PROVIDE_EXTENSION__ECLASS = STORY_PATTERN___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___GET_ANNOTATION__STRING = STORY_PATTERN___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___PROVIDE_ANNOTATION__STRING = STORY_PATTERN___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>No Modifier In Matching Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP = STORY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Matching Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_PATTERN_OPERATION_COUNT = STORY_PATTERN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.impl.MaybeLinkImpl <em>Maybe Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.impl.MaybeLinkImpl
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getMaybeLink()
	 * @generated
	 */
	int MAYBE_LINK = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__NAME = ABSTRACT_LINK_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

	/**
	 * The number of structural features of the '<em>Maybe Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Maybe Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_LINK_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.BindingState <em>Binding State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.BindingState
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getBindingState()
	 * @generated
	 */
	int BINDING_STATE = 14;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getBindingSemantics()
	 * @generated
	 */
	int BINDING_SEMANTICS = 15;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.BindingOperator <em>Binding Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.BindingOperator
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getBindingOperator()
	 * @generated
	 */
	int BINDING_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.LinkConstraintType <em>Link Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraintType
	 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getLinkConstraintType()
	 * @generated
	 */
	int LINK_CONSTRAINT_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.ObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable
	 * @generated
	 */
	EClass getObjectVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Link</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getOutgoingLinks()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_OutgoingLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Order Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getLinkOrderConstraints()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_LinkOrderConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingSemantics()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getBindingOperator()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getAttributeAssignments <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Assignment</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getAttributeAssignments()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_AttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.ObjectVariable#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.storydriven.storydiagrams.patterns.ObjectVariable#getClassifier()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_Classifier();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.AbstractVariable <em>Abstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractVariable
	 * @generated
	 */
	EClass getAbstractVariable();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.AbstractVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractVariable#getPattern()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.AbstractVariable#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractVariable#getBindingState()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EAttribute getAbstractVariable_BindingState();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractVariable#getBindingExpression()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_BindingExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.AbstractVariable#getConstraints <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractVariable#getConstraints()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.patterns.AbstractVariable#getIncomingLinks <em>Incoming Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Link</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractVariable#getIncomingLinks()
	 * @see #getAbstractVariable()
	 * @generated
	 */
	EReference getAbstractVariable_IncomingLink();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.Constraint#getConstraintExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstraintExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.Constraint#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.Constraint#getPattern()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Pattern();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.Constraint#getObjectVariable()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ObjectVariable();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable <em>Abstract Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Link Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable
	 * @generated
	 */
	EClass getAbstractLinkVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getBindingSemantics()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EAttribute getAbstractLinkVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getBindingOperator()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EAttribute getAbstractLinkVariable_BindingOperator();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSource()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSecondLinkConstraints <em>Second Link Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Link Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getSecondLinkConstraints()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_SecondLinkConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getFirstLinkConstraints <em>First Link Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>First Link Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getFirstLinkConstraints()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_FirstLinkConstraint();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getPattern()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_Pattern();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AbstractLinkVariable#getTarget()
	 * @see #getAbstractLinkVariable()
	 * @generated
	 */
	EReference getAbstractLinkVariable_Target();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.LinkConstraint <em>Link Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint
	 * @generated
	 */
	EClass getLinkConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#getIndex()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EAttribute getLinkConstraint_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#getConstraintType()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EAttribute getLinkConstraint_ConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#isNegative()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EAttribute getLinkConstraint_Negative();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getFirstLink <em>First Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Link</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#getFirstLink()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EReference getLinkConstraint_FirstLink();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referencing Object</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#getReferencingObject()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EReference getLinkConstraint_ReferencingObject();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Link</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraint#getSecondLink()
	 * @see #getLinkConstraint()
	 * @generated
	 */
	EReference getLinkConstraint_SecondLink();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AttributeAssignment
	 * @generated
	 */
	EClass getAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.AttributeAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AttributeAssignment#getAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.patterns.AttributeAssignment#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AttributeAssignment#getValueExpression()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_ValueExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.AttributeAssignment#getObjectVariable()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_ObjectVariable();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.CollectionVariable <em>Collection Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.CollectionVariable
	 * @generated
	 */
	EClass getCollectionVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.CollectionVariable#isMaybeEmpty <em>Maybe Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maybe Empty</em>'.
	 * @see org.storydriven.storydiagrams.patterns.CollectionVariable#isMaybeEmpty()
	 * @see #getCollectionVariable()
	 * @generated
	 */
	EAttribute getCollectionVariable_MaybeEmpty();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.PrimitiveVariable <em>Primitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.PrimitiveVariable
	 * @generated
	 */
	EClass getPrimitiveVariable();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.PrimitiveVariable#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.storydriven.storydiagrams.patterns.PrimitiveVariable#getClassifier()
	 * @see #getPrimitiveVariable()
	 * @generated
	 */
	EReference getPrimitiveVariable_Classifier();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.storydriven.storydiagrams.patterns.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.patterns.Path#getPathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.Path#getPathExpression()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_PathExpression();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.LinkVariable <em>Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkVariable
	 * @generated
	 */
	EClass getLinkVariable();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.LinkVariable#getSourceEnd <em>Source End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source End</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkVariable#getSourceEnd()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_SourceEnd();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.LinkVariable#getTargetEnd <em>Target End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target End</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkVariable#getTargetEnd()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_TargetEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.patterns.LinkVariable#getQualifierExpression <em>Qualifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkVariable#getQualifierExpression()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_QualifierExpression();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.InclusionLink <em>Inclusion Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion Link</em>'.
	 * @see org.storydriven.storydiagrams.patterns.InclusionLink
	 * @generated
	 */
	EClass getInclusionLink();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.MatchingPattern <em>Matching Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.MatchingPattern
	 * @generated
	 */
	EClass getMatchingPattern();

	/**
	 * Returns the meta object for the '{@link org.storydriven.storydiagrams.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Modifier In Matching Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Modifier In Matching Pattern</em>' operation.
	 * @see org.storydriven.storydiagrams.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.StoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern
	 * @generated
	 */
	EClass getStoryPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getVariables <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getVariables()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getConstraints <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getConstraints()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getLinkVariables <em>Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getLinkVariables()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_LinkVariable();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getParentPattern <em>Parent Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getParentPattern()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_ParentPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getContainedPatterns <em>Contained Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Pattern</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getContainedPatterns()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_ContainedPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getBindingSemantics()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EAttribute getStoryPattern_BindingSemantics();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.patterns.StoryPattern#getTemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Signature</em>'.
	 * @see org.storydriven.storydiagrams.patterns.StoryPattern#getTemplateSignature()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_TemplateSignature();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.MaybeLink <em>Maybe Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maybe Link</em>'.
	 * @see org.storydriven.storydiagrams.patterns.MaybeLink
	 * @generated
	 */
	EClass getMaybeLink();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.patterns.BindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding State</em>'.
	 * @see org.storydriven.storydiagrams.patterns.BindingState
	 * @generated
	 */
	EEnum getBindingState();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.patterns.BindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Semantics</em>'.
	 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
	 * @generated
	 */
	EEnum getBindingSemantics();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.patterns.BindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Operator</em>'.
	 * @see org.storydriven.storydiagrams.patterns.BindingOperator
	 * @generated
	 */
	EEnum getBindingOperator();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.patterns.LinkConstraintType <em>Link Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Constraint Type</em>'.
	 * @see org.storydriven.storydiagrams.patterns.LinkConstraintType
	 * @generated
	 */
	EEnum getLinkConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

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
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.ObjectVariableImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getObjectVariable()
		 * @generated
		 */
		EClass OBJECT_VARIABLE = eINSTANCE.getObjectVariable();

		/**
		 * The meta object literal for the '<em><b>Outgoing Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__OUTGOING_LINK = eINSTANCE.getObjectVariable_OutgoingLink();

		/**
		 * The meta object literal for the '<em><b>Link Order Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT = eINSTANCE.getObjectVariable_LinkOrderConstraint();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getObjectVariable_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_OPERATOR = eINSTANCE.getObjectVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT = eINSTANCE.getObjectVariable_AttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__CLASSIFIER = eINSTANCE.getObjectVariable_Classifier();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.AbstractVariableImpl <em>Abstract Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.AbstractVariableImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getAbstractVariable()
		 * @generated
		 */
		EClass ABSTRACT_VARIABLE = eINSTANCE.getAbstractVariable();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__PATTERN = eINSTANCE.getAbstractVariable_Pattern();

		/**
		 * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VARIABLE__BINDING_STATE = eINSTANCE.getAbstractVariable_BindingState();

		/**
		 * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__BINDING_EXPRESSION = eINSTANCE.getAbstractVariable_BindingExpression();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__CONSTRAINT = eINSTANCE.getAbstractVariable_Constraint();

		/**
		 * The meta object literal for the '<em><b>Incoming Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE__INCOMING_LINK = eINSTANCE.getAbstractVariable_IncomingLink();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.ConstraintImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINT_EXPRESSION = eINSTANCE.getConstraint_ConstraintExpression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PATTERN = eINSTANCE.getConstraint_Pattern();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OBJECT_VARIABLE = eINSTANCE.getConstraint_ObjectVariable();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.AbstractLinkVariableImpl <em>Abstract Link Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.AbstractLinkVariableImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getAbstractLinkVariable()
		 * @generated
		 */
		EClass ABSTRACT_LINK_VARIABLE = eINSTANCE.getAbstractLinkVariable();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getAbstractLinkVariable_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR = eINSTANCE.getAbstractLinkVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__SOURCE = eINSTANCE.getAbstractLinkVariable_Source();

		/**
		 * The meta object literal for the '<em><b>Second Link Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT = eINSTANCE
				.getAbstractLinkVariable_SecondLinkConstraint();

		/**
		 * The meta object literal for the '<em><b>First Link Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT = eINSTANCE
				.getAbstractLinkVariable_FirstLinkConstraint();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__PATTERN = eINSTANCE.getAbstractLinkVariable_Pattern();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LINK_VARIABLE__TARGET = eINSTANCE.getAbstractLinkVariable_Target();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.LinkConstraintImpl <em>Link Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.LinkConstraintImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getLinkConstraint()
		 * @generated
		 */
		EClass LINK_CONSTRAINT = eINSTANCE.getLinkConstraint();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONSTRAINT__INDEX = eINSTANCE.getLinkConstraint_Index();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getLinkConstraint_ConstraintType();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONSTRAINT__NEGATIVE = eINSTANCE.getLinkConstraint_Negative();

		/**
		 * The meta object literal for the '<em><b>First Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONSTRAINT__FIRST_LINK = eINSTANCE.getLinkConstraint_FirstLink();

		/**
		 * The meta object literal for the '<em><b>Referencing Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONSTRAINT__REFERENCING_OBJECT = eINSTANCE.getLinkConstraint_ReferencingObject();

		/**
		 * The meta object literal for the '<em><b>Second Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONSTRAINT__SECOND_LINK = eINSTANCE.getLinkConstraint_SecondLink();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.AttributeAssignmentImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = eINSTANCE.getAttributeAssignment_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = eINSTANCE.getAttributeAssignment_ObjectVariable();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl <em>Collection Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getCollectionVariable()
		 * @generated
		 */
		EClass COLLECTION_VARIABLE = eINSTANCE.getCollectionVariable();

		/**
		 * The meta object literal for the '<em><b>Maybe Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_VARIABLE__MAYBE_EMPTY = eINSTANCE.getCollectionVariable_MaybeEmpty();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.PrimitiveVariableImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getPrimitiveVariable()
		 * @generated
		 */
		EClass PRIMITIVE_VARIABLE = eINSTANCE.getPrimitiveVariable();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VARIABLE__CLASSIFIER = eINSTANCE.getPrimitiveVariable_Classifier();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.PathImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Path Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PATH_EXPRESSION = eINSTANCE.getPath_PathExpression();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.LinkVariableImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getLinkVariable()
		 * @generated
		 */
		EClass LINK_VARIABLE = eINSTANCE.getLinkVariable();

		/**
		 * The meta object literal for the '<em><b>Source End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__SOURCE_END = eINSTANCE.getLinkVariable_SourceEnd();

		/**
		 * The meta object literal for the '<em><b>Target End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__TARGET_END = eINSTANCE.getLinkVariable_TargetEnd();

		/**
		 * The meta object literal for the '<em><b>Qualifier Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__QUALIFIER_EXPRESSION = eINSTANCE.getLinkVariable_QualifierExpression();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.InclusionLinkImpl <em>Inclusion Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.InclusionLinkImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getInclusionLink()
		 * @generated
		 */
		EClass INCLUSION_LINK = eINSTANCE.getInclusionLink();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.MatchingPatternImpl <em>Matching Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.MatchingPatternImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getMatchingPattern()
		 * @generated
		 */
		EClass MATCHING_PATTERN = eINSTANCE.getMatchingPattern();

		/**
		 * The meta object literal for the '<em><b>No Modifier In Matching Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.StoryPatternImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getStoryPattern()
		 * @generated
		 */
		EClass STORY_PATTERN = eINSTANCE.getStoryPattern();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__VARIABLE = eINSTANCE.getStoryPattern_Variable();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__CONSTRAINT = eINSTANCE.getStoryPattern_Constraint();

		/**
		 * The meta object literal for the '<em><b>Link Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__LINK_VARIABLE = eINSTANCE.getStoryPattern_LinkVariable();

		/**
		 * The meta object literal for the '<em><b>Parent Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__PARENT_PATTERN = eINSTANCE.getStoryPattern_ParentPattern();

		/**
		 * The meta object literal for the '<em><b>Contained Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__CONTAINED_PATTERN = eINSTANCE.getStoryPattern_ContainedPattern();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATTERN__BINDING_SEMANTICS = eINSTANCE.getStoryPattern_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Template Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__TEMPLATE_SIGNATURE = eINSTANCE.getStoryPattern_TemplateSignature();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.impl.MaybeLinkImpl <em>Maybe Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.impl.MaybeLinkImpl
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getMaybeLink()
		 * @generated
		 */
		EClass MAYBE_LINK = eINSTANCE.getMaybeLink();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.BindingState <em>Binding State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.BindingState
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getBindingState()
		 * @generated
		 */
		EEnum BINDING_STATE = eINSTANCE.getBindingState();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getBindingSemantics()
		 * @generated
		 */
		EEnum BINDING_SEMANTICS = eINSTANCE.getBindingSemantics();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.BindingOperator <em>Binding Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.BindingOperator
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getBindingOperator()
		 * @generated
		 */
		EEnum BINDING_OPERATOR = eINSTANCE.getBindingOperator();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.LinkConstraintType <em>Link Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.LinkConstraintType
		 * @see org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl#getLinkConstraintType()
		 * @generated
		 */
		EEnum LINK_CONSTRAINT_TYPE = eINSTANCE.getLinkConstraintType();

	}

} //PatternsPackage
