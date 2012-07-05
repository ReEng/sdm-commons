/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage;
import org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression;
import org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage;
import org.storydriven.storydiagrams.calls.expressions.impl.CallsExpressionsPackageImpl;
import org.storydriven.storydiagrams.calls.impl.CallsPackageImpl;
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
public class ActivitiesExpressionsPackageImpl extends EPackageImpl implements
		ActivitiesExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionVariableExpressionEClass = null;

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
	 * @see org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitiesExpressionsPackageImpl() {
		super(eNS_URI, ActivitiesExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitiesExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitiesExpressionsPackage init() {
		if (isInited)
			return (ActivitiesExpressionsPackage) EPackage.Registry.INSTANCE
					.getEPackage(ActivitiesExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ActivitiesExpressionsPackageImpl());

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
		CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
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
		theActivitiesExpressionsPackage.createPackageContents();
		theStorydiagramsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theActivitiesExpressionsPackage.initializePackageContents();
		theStorydiagramsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitiesExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitiesExpressionsPackage.eNS_URI,
				theActivitiesExpressionsPackage);
		return theActivitiesExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionVariableExpression() {
		return exceptionVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionVariableExpression_ExceptionVariable() {
		return (EReference) exceptionVariableExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesExpressionsFactory getActivitiesExpressionsFactory() {
		return (ActivitiesExpressionsFactory) getEFactoryInstance();
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
		exceptionVariableExpressionEClass = createEClass(EXCEPTION_VARIABLE_EXPRESSION);
		createEReference(exceptionVariableExpressionEClass,
				EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE);
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
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exceptionVariableExpressionEClass.getESuperTypes().add(
				theExpressionsPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(exceptionVariableExpressionEClass,
				ExceptionVariableExpression.class,
				"ExceptionVariableExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionVariableExpression_ExceptionVariable(),
				theActivitiesPackage.getExceptionVariable(), null,
				"exceptionVariable", null, 1, 1,
				ExceptionVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
				exceptionVariableExpressionEClass,
				source,
				new String[] {
						"documentation",
						"Represents the value of an exception variable declared as a transition guard (the guard of an activity edge)." });
		addAnnotation(
				getExceptionVariableExpression_ExceptionVariable(),
				source,
				new String[] {
						"documentation",
						"Specifies the exception variable that this expression refers to. If you have an activity edge that catches an exception e, then this expression can represent the reference e." });
	}

} //ActivitiesExpressionsPackageImpl
