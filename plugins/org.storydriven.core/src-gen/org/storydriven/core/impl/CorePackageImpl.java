/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CoreFactory;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;
import org.storydriven.core.NamedElement;
import org.storydriven.core.TypedElement;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.impl.CommonExpressionsPackageImpl;
import org.storydriven.core.expressions.impl.ExpressionsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.storydriven.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited)
			return (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		CommonExpressionsPackageImpl theCommonExpressionsPackage = (CommonExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommonExpressionsPackage.eNS_URI) instanceof CommonExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CommonExpressionsPackage.eNS_URI) : CommonExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theCommonExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theCommonExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_GenericType() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendableElement() {
		return extendableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendableElement_Annotation() {
		return (EReference) extendableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendableElement_Extension() {
		return (EReference) extendableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtendableElement__GetExtension__EClass() {
		return extendableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtendableElement__ProvideExtension__EClass() {
		return extendableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtendableElement__GetAnnotation__String() {
		return extendableElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtendableElement__ProvideAnnotation__String() {
		return extendableElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Base() {
		return (EReference) extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ModelBase() {
		return (EReference) extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_OwningAnnotation() {
		return (EReference) extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ExtendableBase() {
		return (EReference) extensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentableElement() {
		return commentableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentableElement_Comment() {
		return (EAttribute) commentableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		commentableElementEClass = createEClass(COMMENTABLE_ELEMENT);
		createEAttribute(commentableElementEClass, COMMENTABLE_ELEMENT__COMMENT);

		extendableElementEClass = createEClass(EXTENDABLE_ELEMENT);
		createEReference(extendableElementEClass, EXTENDABLE_ELEMENT__ANNOTATION);
		createEReference(extendableElementEClass, EXTENDABLE_ELEMENT__EXTENSION);
		createEOperation(extendableElementEClass, EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS);
		createEOperation(extendableElementEClass, EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS);
		createEOperation(extendableElementEClass, EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING);
		createEOperation(extendableElementEClass, EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING);

		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__BASE);
		createEReference(extensionEClass, EXTENSION__MODEL_BASE);
		createEReference(extensionEClass, EXTENSION__OWNING_ANNOTATION);
		createEReference(extensionEClass, EXTENSION__EXTENDABLE_BASE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);
		createEReference(typedElementEClass, TYPED_ELEMENT__GENERIC_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentableElementEClass.getESuperTypes().add(this.getExtendableElement());
		extendableElementEClass.getESuperTypes().add(theEcorePackage.getEObject());
		extensionEClass.getESuperTypes().add(this.getExtendableElement());
		namedElementEClass.getESuperTypes().add(this.getExtendableElement());
		typedElementEClass.getESuperTypes().add(this.getExtendableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(commentableElementEClass, CommentableElement.class, "CommentableElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentableElement_Comment(), ecorePackage.getEString(), "comment",
				"\"no comment provided\"", 0, 1, CommentableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extendableElementEClass, ExtendableElement.class, "ExtendableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendableElement_Annotation(), theEcorePackage.getEAnnotation(), null, "annotation", null,
				0, -1, ExtendableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExtendableElement_Extension(), this.getExtension(), this.getExtension_ExtendableBase(),
				"extension", null, 0, -1, ExtendableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getExtendableElement__GetExtension__EClass(), this.getExtension(),
				"getExtension", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtendableElement__ProvideExtension__EClass(), this.getExtension(), "provideExtension",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtendableElement__GetAnnotation__String(), theEcorePackage.getEAnnotation(),
				"getAnnotation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtendableElement__ProvideAnnotation__String(), theEcorePackage.getEAnnotation(),
				"provideAnnotation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_Base(), theEcorePackage.getEObject(), null, "base", null, 1, 1, Extension.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExtension_ModelBase(), theEcorePackage.getEModelElement(), null, "modelBase", null, 0, 1,
				Extension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExtension_OwningAnnotation(), theEcorePackage.getEAnnotation(), null, "owningAnnotation",
				null, 0, 1, Extension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExtension_ExtendableBase(), this.getExtendableElement(),
				this.getExtendableElement_Extension(), "extendableBase", null, 0, 1, Extension.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), theEcorePackage.getEClassifier(), null, "type", null, 0, 1,
				TypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTypedElement_GenericType(), theEcorePackage.getEGenericType(), null, "genericType", null, 0,
				1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"The core package is the root package for the storydriven core meta-model. It defines several abstract super classes which implement an extension mechanism as well as recurring structural features like, e.g., names of elements. The classes in this package are intended to be sub-classed by any meta-model element." });
		addAnnotation(commentableElementEClass, source, new String[] { "documentation",
				"Abstract super class for all meta-model elements that may carry a comment in form of a string." });
		addAnnotation(getCommentableElement_Comment(), source, new String[] { "documentation",
				"The comment string that can be used to attach arbitrary information to CommentableElements." });
		addAnnotation(
				extendableElementEClass,
				source,
				new String[] {
						"documentation",
						"Abstract base class for the whole story diagram model. The ExtendableElement specifies the extension mechanism that can be used to extend an object by an Extension containing additional attributes and references." });
		addAnnotation(extensionEClass, source, new String[] { "documentation",
				"Abstract super class for an Extension that can be defined for an object." });
		addAnnotation(namedElementEClass, source, new String[] { "documentation",
				"Abstract super class for all meta-model elements that carry a name. " });
		addAnnotation(getNamedElement_Name(), source, new String[] { "documentation",
				"The name attribute of a meta-model element." });
		addAnnotation(
				typedElementEClass,
				source,
				new String[] { "documentation",
						"Abstract super class for all meta-model elements that are typed by means of an EClassifier or an EGenericType." });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation(getExtension_Base(), source, new String[] {});
		addAnnotation(getTypedElement_Type(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation(getExtension_ModelBase(), source, new String[] {}, new URI[] { URI.createURI(eNS_URI)
				.appendFragment("//Extension/base") });
		addAnnotation(getExtension_ExtendableBase(), source, new String[] {}, new URI[] { URI.createURI(eNS_URI)
				.appendFragment("//Extension/base") });
	}

} //CorePackageImpl
