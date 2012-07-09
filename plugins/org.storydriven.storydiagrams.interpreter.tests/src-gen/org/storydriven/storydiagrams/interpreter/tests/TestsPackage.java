/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsFactory
 * @model kind="package" annotation=
 *        "http://www.eclipse.org/emf/2002/GenModel basePackage='org.storydriven.storydiagrams.interpreter' creationIcons='false' editPluginID='org.storydriven.storydiagrams.interpreter.tests' complianceLevel='6.0' nonNLSMarkers='true' runtimeVersion='2.7' editDirectory='/org.storydriven.storydiagrams.interpreter.tests/src-gen' resource='XMI' codeFormatting='true'"
 * @generated
 */
public interface TestsPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "tests"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.storydriven.org/storydiagrams/interpreter/tests"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "tests"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TestsPackage eINSTANCE = org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TNamed <em>TNamed</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TNamed
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTNamed()
	 * @generated
	 */
	int TNAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TNAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>TNamed</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TNAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TNamed</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TNAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable
	 * <em>TModifyable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTModifyable()
	 * @generated
	 */
	int TMODIFYABLE = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODIFYABLE__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODIFYABLE__INHERITANCE = 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODIFYABLE__STATIC = 2;

	/**
	 * The number of structural features of the '<em>TModifyable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODIFYABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TModifyable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODIFYABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped <em>TTyped</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTTyped()
	 * @generated
	 */
	int TTYPED = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__NAME = TNAMED__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__VISIBILITY = TNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__INHERITANCE = TNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__STATIC = TNAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__TRANSIENT = TNAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__NATIVE = TNAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strictfp</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__STRICTFP = TNAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__SYNCHRONIZED = TNAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED__TYPE = TNAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TTyped</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED_FEATURE_COUNT = TNAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>TTyped</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPED_OPERATION_COUNT = TNAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TModelImpl
	 * <em>TModel</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TModelImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTModel()
	 * @generated
	 */
	int TMODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODEL__NAME = TNAMED__NAME;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODEL__PACKAGES = TNAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TModel</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODEL_FEATURE_COUNT = TNAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TModel</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMODEL_OPERATION_COUNT = TNAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl
	 * <em>TPackage</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTPackage()
	 * @generated
	 */
	int TPACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__NAME = TNAMED__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__MODEL = TNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__CONTAINING_PACKAGE = TNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__PACKAGES = TNAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TYPES = TNAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TPackage</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_FEATURE_COUNT = TNAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TPackage</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_OPERATION_COUNT = TNAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TType <em>TType</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTType()
	 * @generated
	 */
	int TTYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__NAME = TNAMED__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__VISIBILITY = TNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__INHERITANCE = TNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__STATIC = TNAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containing Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__CONTAINING_PACKAGE = TNAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__CONTAINING_TYPE = TNAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__EXTENDED_INTERFACES = TNAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__TYPES = TNAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__FIELDS = TNAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE__METHODS = TNAMED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TType</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE_FEATURE_COUNT = TNAMED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TType</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TTYPE_OPERATION_COUNT = TNAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TInterfaceImpl
	 * <em>TInterface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TInterfaceImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__NAME = TTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__VISIBILITY = TTYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__INHERITANCE = TTYPE__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__STATIC = TTYPE__STATIC;

	/**
	 * The feature id for the '<em><b>Containing Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__CONTAINING_PACKAGE = TTYPE__CONTAINING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__CONTAINING_TYPE = TTYPE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__EXTENDED_INTERFACES = TTYPE__EXTENDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TYPES = TTYPE__TYPES;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__FIELDS = TTYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__METHODS = TTYPE__METHODS;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = TTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TInterface</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = TTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl
	 * <em>TClass</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTClass()
	 * @generated
	 */
	int TCLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__NAME = TTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__VISIBILITY = TTYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__INHERITANCE = TTYPE__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__STATIC = TTYPE__STATIC;

	/**
	 * The feature id for the '<em><b>Containing Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__CONTAINING_PACKAGE = TTYPE__CONTAINING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__CONTAINING_TYPE = TTYPE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__EXTENDED_INTERFACES = TTYPE__EXTENDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__TYPES = TTYPE__TYPES;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__FIELDS = TTYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__METHODS = TTYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Extended Class</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS__EXTENDED_CLASS = TTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TClass</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS_FEATURE_COUNT = TTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TClass</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TCLASS_OPERATION_COUNT = TTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TEnumImpl <em>TEnum</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TEnumImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTEnum()
	 * @generated
	 */
	int TENUM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__NAME = TTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__VISIBILITY = TTYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__INHERITANCE = TTYPE__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__STATIC = TTYPE__STATIC;

	/**
	 * The feature id for the '<em><b>Containing Package</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__CONTAINING_PACKAGE = TTYPE__CONTAINING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__CONTAINING_TYPE = TTYPE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__EXTENDED_INTERFACES = TTYPE__EXTENDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__TYPES = TTYPE__TYPES;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__FIELDS = TTYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM__METHODS = TTYPE__METHODS;

	/**
	 * The number of structural features of the '<em>TEnum</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM_FEATURE_COUNT = TTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TEnum</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENUM_OPERATION_COUNT = TTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl
	 * <em>TField</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTField()
	 * @generated
	 */
	int TFIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__NAME = TTYPED__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__VISIBILITY = TTYPED__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__INHERITANCE = TTYPED__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__STATIC = TTYPED__STATIC;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__TRANSIENT = TTYPED__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__NATIVE = TTYPED__NATIVE;

	/**
	 * The feature id for the '<em><b>Strictfp</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__STRICTFP = TTYPED__STRICTFP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__SYNCHRONIZED = TTYPED__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__TYPE = TTYPED__TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD__CONTAINING_TYPE = TTYPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TField</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD_FEATURE_COUNT = TTYPED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TField</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TFIELD_OPERATION_COUNT = TTYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TMethodImpl
	 * <em>TMethod</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TMethodImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTMethod()
	 * @generated
	 */
	int TMETHOD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__NAME = TTYPED__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__VISIBILITY = TTYPED__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__INHERITANCE = TTYPED__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__STATIC = TTYPED__STATIC;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__TRANSIENT = TTYPED__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__NATIVE = TTYPED__NATIVE;

	/**
	 * The feature id for the '<em><b>Strictfp</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__STRICTFP = TTYPED__STRICTFP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__SYNCHRONIZED = TTYPED__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__TYPE = TTYPED__TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__CONTAINING_TYPE = TTYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__PARAMETERS = TTYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD__STATEMENTS = TTYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TMethod</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD_FEATURE_COUNT = TTYPED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TMethod</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD_OPERATION_COUNT = TTYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TParameterImpl
	 * <em>TParameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TParameterImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NAME = TTYPED__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__VISIBILITY = TTYPED__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__INHERITANCE = TTYPED__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__STATIC = TTYPED__STATIC;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TRANSIENT = TTYPED__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NATIVE = TTYPED__NATIVE;

	/**
	 * The feature id for the '<em><b>Strictfp</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__STRICTFP = TTYPED__STRICTFP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__SYNCHRONIZED = TTYPED__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TYPE = TTYPED__TYPE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__METHOD = TTYPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = TTYPED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TParameter</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = TTYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TStatement
	 * <em>TStatement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TStatement
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTStatement()
	 * @generated
	 */
	int TSTATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TSTATEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>TStatement</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TSTATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TStatement</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TSTATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TReturnStatementImpl
	 * <em>TReturn Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TReturnStatementImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTReturnStatement()
	 * @generated
	 */
	int TRETURN_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRETURN_STATEMENT__TEXT = TSTATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>TReturn Statement</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRETURN_STATEMENT_FEATURE_COUNT = TSTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TReturn Statement</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRETURN_STATEMENT_OPERATION_COUNT = TSTATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TMethodCallStatementImpl
	 * <em>TMethod Call Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TMethodCallStatementImpl
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTMethodCallStatement()
	 * @generated
	 */
	int TMETHOD_CALL_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD_CALL_STATEMENT__TEXT = TSTATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Accessed Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD_CALL_STATEMENT__ACCESSED_TARGET = TSTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMethod Call Statement</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD_CALL_STATEMENT_FEATURE_COUNT = TSTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMethod Call Statement</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TMETHOD_CALL_STATEMENT_OPERATION_COUNT = TSTATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
	 * <em>TVisibility Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTVisibilityType()
	 * @generated
	 */
	int TVISIBILITY_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
	 * <em>TInheritance Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
	 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTInheritanceType()
	 * @generated
	 */
	int TINHERITANCE_TYPE = 16;

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TNamed <em>TNamed</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TNamed</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TNamed
	 * @generated
	 */
	EClass getTNamed();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.interpreter.tests.TNamed#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TNamed#getName()
	 * @see #getTNamed()
	 * @generated
	 */
	EAttribute getTNamed_Name();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable
	 * <em>TModifyable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TModifyable</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable
	 * @generated
	 */
	EClass getTModifyable();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#getVisibility <em>Visibility</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable#getVisibility()
	 * @see #getTModifyable()
	 * @generated
	 */
	EAttribute getTModifyable_Visibility();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#getInheritance <em>Inheritance</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Inheritance</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable#getInheritance()
	 * @see #getTModifyable()
	 * @generated
	 */
	EAttribute getTModifyable_Inheritance();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TModifyable#isStatic <em>Static</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable#isStatic()
	 * @see #getTModifyable()
	 * @generated
	 */
	EAttribute getTModifyable_Static();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped <em>TTyped</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TTyped</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped
	 * @generated
	 */
	EClass getTTyped();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isTransient <em>Transient</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped#isTransient()
	 * @see #getTTyped()
	 * @generated
	 */
	EAttribute getTTyped_Transient();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isNative <em>Native</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped#isNative()
	 * @see #getTTyped()
	 * @generated
	 */
	EAttribute getTTyped_Native();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isStrictfp <em>Strictfp</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Strictfp</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped#isStrictfp()
	 * @see #getTTyped()
	 * @generated
	 */
	EAttribute getTTyped_Strictfp();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isSynchronized <em>Synchronized</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped#isSynchronized()
	 * @see #getTTyped()
	 * @generated
	 */
	EAttribute getTTyped_Synchronized();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped#getType()
	 * @see #getTTyped()
	 * @generated
	 */
	EReference getTTyped_Type();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TModel <em>TModel</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TModel</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModel
	 * @generated
	 */
	EClass getTModel();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TModel#getPackages <em>Packages</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModel#getPackages()
	 * @see #getTModel()
	 * @generated
	 */
	EReference getTModel_Packages();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TPackage
	 * <em>TPackage</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TPackage</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage
	 * @generated
	 */
	EClass getTPackage();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getModel <em>Model</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getModel()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Model();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getContainingPackage <em>Containing Package</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Containing Package</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getContainingPackage()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_ContainingPackage();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getPackages <em>Packages</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getPackages()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Packages();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TPackage#getTypes <em>Types</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage#getTypes()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Types();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TType <em>TType</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TType</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType
	 * @generated
	 */
	EClass getTType();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingPackage <em>Containing Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Containing Package</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getContainingPackage()
	 * @see #getTType()
	 * @generated
	 */
	EReference getTType_ContainingPackage();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getContainingType <em>Containing Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Containing Type</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getContainingType()
	 * @see #getTType()
	 * @generated
	 */
	EReference getTType_ContainingType();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getExtendedInterfaces <em>Extended Interfaces</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Extended Interfaces</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getExtendedInterfaces()
	 * @see #getTType()
	 * @generated
	 */
	EReference getTType_ExtendedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getTypes <em>Types</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getTypes()
	 * @see #getTType()
	 * @generated
	 */
	EReference getTType_Types();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getFields <em>Fields</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getFields()
	 * @see #getTType()
	 * @generated
	 */
	EReference getTType_Fields();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TType#getMethods <em>Methods</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType#getMethods()
	 * @see #getTType()
	 * @generated
	 */
	EReference getTType_Methods();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TInterface
	 * <em>TInterface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TClass <em>TClass</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TClass</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TClass
	 * @generated
	 */
	EClass getTClass();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TClass#getExtendedClass <em>Extended Class</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Extended Class</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TClass#getExtendedClass()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ExtendedClass();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TEnum <em>TEnum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TEnum</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TEnum
	 * @generated
	 */
	EClass getTEnum();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TField <em>TField</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TField</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TField
	 * @generated
	 */
	EClass getTField();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TField#getContainingType <em>Containing Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Containing Type</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TField#getContainingType()
	 * @see #getTField()
	 * @generated
	 */
	EReference getTField_ContainingType();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TMethod
	 * <em>TMethod</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TMethod</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod
	 * @generated
	 */
	EClass getTMethod();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getContainingType <em>Containing Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Containing Type</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod#getContainingType()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_ContainingType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getParameters <em>Parameters</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod#getParameters()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethod#getStatements <em>Statements</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod#getStatements()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Statements();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TParameter
	 * <em>TParameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TParameter#getMethod <em>Method</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TParameter#getMethod()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Method();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TStatement
	 * <em>TStatement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TStatement</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TStatement
	 * @generated
	 */
	EClass getTStatement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TStatement#getText <em>Text</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TStatement#getText()
	 * @see #getTStatement()
	 * @generated
	 */
	EAttribute getTStatement_Text();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TReturnStatement
	 * <em>TReturn Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TReturn Statement</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TReturnStatement
	 * @generated
	 */
	EClass getTReturnStatement();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement
	 * <em>TMethod Call Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TMethod Call Statement</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement
	 * @generated
	 */
	EClass getTMethodCallStatement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement#getAccessedTarget
	 * <em>Accessed Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Accessed Target</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement#getAccessedTarget()
	 * @see #getTMethodCallStatement()
	 * @generated
	 */
	EReference getTMethodCallStatement_AccessedTarget();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
	 * <em>TVisibility Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>TVisibility Type</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
	 * @generated
	 */
	EEnum getTVisibilityType();

	/**
	 * Returns the meta object for enum '{@link org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
	 * <em>TInheritance Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>TInheritance Type</em>'.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
	 * @generated
	 */
	EEnum getTInheritanceType();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestsFactory getTestsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TNamed
		 * <em>TNamed</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TNamed
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTNamed()
		 * @generated
		 */
		EClass TNAMED = eINSTANCE.getTNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TNAMED__NAME = eINSTANCE.getTNamed_Name();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable
		 * <em>TModifyable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTModifyable()
		 * @generated
		 */
		EClass TMODIFYABLE = eINSTANCE.getTModifyable();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TMODIFYABLE__VISIBILITY = eINSTANCE.getTModifyable_Visibility();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TMODIFYABLE__INHERITANCE = eINSTANCE.getTModifyable_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TMODIFYABLE__STATIC = eINSTANCE.getTModifyable_Static();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped
		 * <em>TTyped</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTTyped()
		 * @generated
		 */
		EClass TTYPED = eINSTANCE.getTTyped();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TTYPED__TRANSIENT = eINSTANCE.getTTyped_Transient();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TTYPED__NATIVE = eINSTANCE.getTTyped_Native();

		/**
		 * The meta object literal for the '<em><b>Strictfp</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TTYPED__STRICTFP = eINSTANCE.getTTyped_Strictfp();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TTYPED__SYNCHRONIZED = eINSTANCE.getTTyped_Synchronized();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPED__TYPE = eINSTANCE.getTTyped_Type();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TModelImpl
		 * <em>TModel</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TModelImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTModel()
		 * @generated
		 */
		EClass TMODEL = eINSTANCE.getTModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TMODEL__PACKAGES = eINSTANCE.getTModel_Packages();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl
		 * <em>TPackage</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTPackage()
		 * @generated
		 */
		EClass TPACKAGE = eINSTANCE.getTPackage();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TPACKAGE__MODEL = eINSTANCE.getTPackage_Model();

		/**
		 * The meta object literal for the '<em><b>Containing Package</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TPACKAGE__CONTAINING_PACKAGE = eINSTANCE.getTPackage_ContainingPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TPACKAGE__PACKAGES = eINSTANCE.getTPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TPACKAGE__TYPES = eINSTANCE.getTPackage_Types();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TType <em>TType</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TType
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTType()
		 * @generated
		 */
		EClass TTYPE = eINSTANCE.getTType();

		/**
		 * The meta object literal for the '<em><b>Containing Package</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPE__CONTAINING_PACKAGE = eINSTANCE.getTType_ContainingPackage();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPE__CONTAINING_TYPE = eINSTANCE.getTType_ContainingType();

		/**
		 * The meta object literal for the '<em><b>Extended Interfaces</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPE__EXTENDED_INTERFACES = eINSTANCE.getTType_ExtendedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPE__TYPES = eINSTANCE.getTType_Types();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPE__FIELDS = eINSTANCE.getTType_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TTYPE__METHODS = eINSTANCE.getTType_Methods();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TInterfaceImpl
		 * <em>TInterface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TInterfaceImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTInterface()
		 * @generated
		 */
		EClass TINTERFACE = eINSTANCE.getTInterface();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl
		 * <em>TClass</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTClass()
		 * @generated
		 */
		EClass TCLASS = eINSTANCE.getTClass();

		/**
		 * The meta object literal for the '<em><b>Extended Class</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TCLASS__EXTENDED_CLASS = eINSTANCE.getTClass_ExtendedClass();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TEnumImpl
		 * <em>TEnum</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TEnumImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTEnum()
		 * @generated
		 */
		EClass TENUM = eINSTANCE.getTEnum();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl
		 * <em>TField</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTField()
		 * @generated
		 */
		EClass TFIELD = eINSTANCE.getTField();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TFIELD__CONTAINING_TYPE = eINSTANCE.getTField_ContainingType();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TMethodImpl
		 * <em>TMethod</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TMethodImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTMethod()
		 * @generated
		 */
		EClass TMETHOD = eINSTANCE.getTMethod();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TMETHOD__CONTAINING_TYPE = eINSTANCE.getTMethod_ContainingType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TMETHOD__PARAMETERS = eINSTANCE.getTMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TMETHOD__STATEMENTS = eINSTANCE.getTMethod_Statements();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.impl.TParameterImpl
		 * <em>TParameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TParameterImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TPARAMETER__METHOD = eINSTANCE.getTParameter_Method();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TStatement
		 * <em>TStatement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TStatement
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTStatement()
		 * @generated
		 */
		EClass TSTATEMENT = eINSTANCE.getTStatement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TSTATEMENT__TEXT = eINSTANCE.getTStatement_Text();

		/**
		 * The meta object literal for the '
		 * {@link org.storydriven.storydiagrams.interpreter.tests.impl.TReturnStatementImpl <em>TReturn Statement</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TReturnStatementImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTReturnStatement()
		 * @generated
		 */
		EClass TRETURN_STATEMENT = eINSTANCE.getTReturnStatement();

		/**
		 * The meta object literal for the '
		 * {@link org.storydriven.storydiagrams.interpreter.tests.impl.TMethodCallStatementImpl
		 * <em>TMethod Call Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TMethodCallStatementImpl
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTMethodCallStatement()
		 * @generated
		 */
		EClass TMETHOD_CALL_STATEMENT = eINSTANCE.getTMethodCallStatement();

		/**
		 * The meta object literal for the '<em><b>Accessed Target</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TMETHOD_CALL_STATEMENT__ACCESSED_TARGET = eINSTANCE.getTMethodCallStatement_AccessedTarget();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
		 * <em>TVisibility Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TVisibilityType
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTVisibilityType()
		 * @generated
		 */
		EEnum TVISIBILITY_TYPE = eINSTANCE.getTVisibilityType();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
		 * <em>TInheritance Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.storydriven.storydiagrams.interpreter.tests.TInheritanceType
		 * @see org.storydriven.storydiagrams.interpreter.tests.impl.TestsPackageImpl#getTInheritanceType()
		 * @generated
		 */
		EEnum TINHERITANCE_TYPE = eINSTANCE.getTInheritanceType();

	}

} // TestsPackage
