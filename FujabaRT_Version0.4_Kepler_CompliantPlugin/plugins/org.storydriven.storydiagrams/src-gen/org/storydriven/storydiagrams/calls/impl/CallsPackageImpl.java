/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage;
import org.storydriven.storydiagrams.activities.expressions.impl.ActivitiesExpressionsPackageImpl;
import org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.Invocation;
import org.storydriven.storydiagrams.calls.OpaqueCallable;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.calls.ParameterExtension;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage;
import org.storydriven.storydiagrams.calls.expressions.impl.CallsExpressionsPackageImpl;
import org.storydriven.storydiagrams.calls.util.CallsValidator;
import org.storydriven.storydiagrams.impl.StorydiagramsPackageImpl;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage;
import org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl;
import org.storydriven.storydiagrams.patterns.impl.PatternsPackageImpl;
import org.storydriven.storydiagrams.templates.TemplatesPackage;
import org.storydriven.storydiagrams.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallsPackageImpl extends EPackageImpl implements CallsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueCallableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableEClass = null;

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
	 * @see org.storydriven.storydiagrams.calls.CallsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CallsPackageImpl() {
		super(eNS_URI, CallsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CallsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CallsPackage init() {
		if (isInited)
			return (CallsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CallsPackage.eNS_URI);

		// Obtain or create and register package
		CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CallsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StorydiagramsPackageImpl theStorydiagramsPackage = (StorydiagramsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StorydiagramsPackage.eNS_URI) instanceof StorydiagramsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StorydiagramsPackage.eNS_URI)
				: StorydiagramsPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesPackage.eNS_URI)
				: ActivitiesPackage.eINSTANCE);
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesExpressionsPackage.eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesExpressionsPackage.eNS_URI)
				: ActivitiesExpressionsPackage.eINSTANCE);
		CallsExpressionsPackageImpl theCallsExpressionsPackage = (CallsExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CallsExpressionsPackage.eNS_URI) instanceof CallsExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CallsExpressionsPackage.eNS_URI)
				: CallsExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PatternsPackage.eNS_URI)
				: PatternsPackage.eINSTANCE);
		PatternsExpressionsPackageImpl thePatternsExpressionsPackage = (PatternsExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PatternsExpressionsPackage.eNS_URI) instanceof PatternsExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PatternsExpressionsPackage.eNS_URI)
				: PatternsExpressionsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TemplatesPackage.eNS_URI)
				: TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		theCallsPackage.createPackageContents();
		theStorydiagramsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theActivitiesExpressionsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theCallsPackage.initializePackageContents();
		theStorydiagramsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theActivitiesExpressionsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCallsPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return CallsValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theCallsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CallsPackage.eNS_URI, theCallsPackage);
		return theCallsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocation() {
		return invocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_OwnedParameterBindings() {
		return (EReference) invocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_Callee() {
		return (EReference) invocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBinding() {
		return parameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_ValueExpression() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_Parameter() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_Invocation() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueCallable() {
		return opaqueCallableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueCallable_Name() {
		return (EAttribute) opaqueCallableEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueCallable_CallExpression() {
		return (EReference) opaqueCallableEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map() {
		return opaqueCallableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterExtension() {
		return parameterExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterExtension_Parameter() {
		return (EReference) parameterExtensionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallable() {
		return callableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_InParameter() {
		return (EReference) callableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_OutParameter() {
		return (EReference) callableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_ContainedParameters() {
		return (EReference) callableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallsFactory getCallsFactory() {
		return (CallsFactory) getEFactoryInstance();
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
		invocationEClass = createEClass(INVOCATION);
		createEReference(invocationEClass, INVOCATION__OWNED_PARAMETER_BINDINGS);
		createEReference(invocationEClass, INVOCATION__CALLEE);

		parameterBindingEClass = createEClass(PARAMETER_BINDING);
		createEReference(parameterBindingEClass,
				PARAMETER_BINDING__VALUE_EXPRESSION);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__PARAMETER);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__INVOCATION);

		opaqueCallableEClass = createEClass(OPAQUE_CALLABLE);
		createEAttribute(opaqueCallableEClass, OPAQUE_CALLABLE__NAME);
		createEReference(opaqueCallableEClass, OPAQUE_CALLABLE__CALL_EXPRESSION);
		createEOperation(opaqueCallableEClass,
				OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP);

		parameterExtensionEClass = createEClass(PARAMETER_EXTENSION);
		createEReference(parameterExtensionEClass,
				PARAMETER_EXTENSION__PARAMETER);

		callableEClass = createEClass(CALLABLE);
		createEReference(callableEClass, CALLABLE__IN_PARAMETER);
		createEReference(callableEClass, CALLABLE__OUT_PARAMETER);
		createEReference(callableEClass, CALLABLE__CONTAINED_PARAMETERS);
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
		CallsExpressionsPackage theCallsExpressionsPackage = (CallsExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CallsExpressionsPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		StorydiagramsPackage theStorydiagramsPackage = (StorydiagramsPackage) EPackage.Registry.INSTANCE
				.getEPackage(StorydiagramsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCallsExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		invocationEClass.getESuperTypes().add(
				theCorePackage.getCommentableElement());
		parameterBindingEClass.getESuperTypes().add(
				theCorePackage.getCommentableElement());
		opaqueCallableEClass.getESuperTypes().add(this.getCallable());
		parameterExtensionEClass.getESuperTypes().add(
				theStorydiagramsPackage.getVariable());
		parameterExtensionEClass.getESuperTypes().add(
				theCorePackage.getExtension());
		callableEClass.getESuperTypes().add(
				theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(invocationEClass, Invocation.class, "Invocation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocation_OwnedParameterBindings(),
				this.getParameterBinding(),
				this.getParameterBinding_Invocation(),
				"ownedParameterBindings", null, 0, -1, Invocation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getInvocation_Callee(), this.getCallable(), null,
				"callee", null, 0, 1, Invocation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterBindingEClass, ParameterBinding.class,
				"ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBinding_ValueExpression(),
				theExpressionsPackage.getExpression(), null, "valueExpression",
				null, 1, 1, ParameterBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterBinding_Parameter(),
				theEcorePackage.getEParameter(), null, "parameter", null, 0, 1,
				ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterBinding_Invocation(), this.getInvocation(),
				this.getInvocation_OwnedParameterBindings(), "invocation",
				null, 1, 1, ParameterBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueCallableEClass, OpaqueCallable.class,
				"OpaqueCallable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueCallable_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, OpaqueCallable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getOpaqueCallable_CallExpression(),
				theCallsExpressionsPackage.getMethodCallExpression(),
				theCallsExpressionsPackage
						.getMethodCallExpression_OpaqueCallable(),
				"callExpression", null, 1, 1, OpaqueCallable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		EOperation op = initEOperation(
				getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "NumberOfOutParams", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterExtensionEClass, ParameterExtension.class,
				"ParameterExtension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterExtension_Parameter(),
				theEcorePackage.getEParameter(), null, "parameter", null, 0, 1,
				ParameterExtension.class, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(callableEClass, Callable.class, "Callable", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallable_InParameter(),
				theEcorePackage.getEParameter(), null, "inParameter", null, 0,
				-1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCallable_OutParameter(),
				theEcorePackage.getEParameter(), null, "outParameter", null, 0,
				-1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCallable_ContainedParameters(),
				theEcorePackage.getEParameter(), null, "containedParameters",
				null, 0, -1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
		// redefines
		createRedefinesAnnotations();
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
						"This package contains all classes for modeling calls to activities and EOperations\r\nfrom within an activity." });
		addAnnotation(
				invocationEClass,
				source,
				new String[] {
						"documentation",
						"Superclass for invocations of behavior which is specified elsewhere, e.g. in methods (MethodCallExpression) or activities (ActivityCallNode). An invocation has one parameter binding for each parameter (in or out) of the called method/activity. For Callables which are contained in the model (i.e. Activities and OperationExtensions) the Invocation directly points to the callee. OpaqueCallables are directly referenced by (and contained in) the MethodCallExpressions." });
		addAnnotation(
				parameterBindingEClass,
				source,
				new String[] {
						"documentation",
						"Binds a parameter to a certain value for a given invocation. The value of the parameter is represented by an expression." });
		addAnnotation(
				opaqueCallableEClass,
				source,
				new String[] {
						"documentation",
						"An OpaqueCallable represents an external method which is not explicitly modeled (e.g. a method in an external library). Because it is not contained anywhere in the model it is directly referenced by and contained in the MethodCallExpression." });
		addAnnotation(
				(getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map())
						.getEParameters().get(0),
				source,
				new String[] { "documentation",
						"The chain of diagnostics to which problems are to be appended." });
		addAnnotation(
				(getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map())
						.getEParameters().get(1), source, new String[] {
						"documentation",
						"The cache of context-specific information." });
		addAnnotation(
				parameterExtensionEClass,
				source,
				new String[] {
						"documentation",
						"Represents an EParameter and adds functionality to it, especially beiing subtype of Variable." });
		addAnnotation(
				callableEClass,
				source,
				new String[] {
						"documentation",
						"An entity which can be called by an Invocation. A Callable can have a number of (ordered) parameters which are either in or out parameters. In the case of activities, the number of in and out parameters is unbounded, whereas OperationExtensions and OpaqueCallables can only have one out parameter (This is enforced by an OCL constraint)." });
		addAnnotation(
				getCallable_InParameter(),
				source,
				new String[] {
						"documentation",
						"The ordered set of in parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference." });
		addAnnotation(
				getCallable_OutParameter(),
				source,
				new String[] {
						"documentation",
						"The ordered set of out parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference." });
		addAnnotation(
				getCallable_ContainedParameters(),
				source,
				new String[] {
						"documentation",
						"This reference is used to contain the parameters of a Callable if they are not already contained in another container. If the parameter is contained in another container as it is the case for parameters of a EOperation, they must not be added to this container!" });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation(opaqueCallableEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
		addAnnotation(
				getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map(),
				source, new String[] { "body",
						"self.oclAsType(Callable).out->size() <= 1" });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		addAnnotation(getParameterExtension_Parameter(), source,
				new String[] {}, new URI[] { URI.createURI(CorePackage.eNS_URI)
						.appendFragment("//Extension/modelBase") });
	}

} //CallsPackageImpl
