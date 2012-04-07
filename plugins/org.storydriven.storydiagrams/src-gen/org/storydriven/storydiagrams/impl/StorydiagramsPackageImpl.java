/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.StorydiagramsFactory;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.storydriven.storydiagrams.Variable;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage;
import org.storydriven.storydiagrams.activities.expressions.impl.ActivitiesExpressionsPackageImpl;
import org.storydriven.storydiagrams.activities.impl.ActivitiesPackageImpl;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage;
import org.storydriven.storydiagrams.calls.expressions.impl.CallsExpressionsPackageImpl;
import org.storydriven.storydiagrams.calls.impl.CallsPackageImpl;
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
public class StorydiagramsPackageImpl extends EPackageImpl implements StorydiagramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

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
	 * @see org.storydriven.storydiagrams.StorydiagramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StorydiagramsPackageImpl() {
		super(eNS_URI, StorydiagramsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StorydiagramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StorydiagramsPackage init() {
		if (isInited) return (StorydiagramsPackage)EPackage.Registry.INSTANCE.getEPackage(StorydiagramsPackage.eNS_URI);

		// Obtain or create and register package
		StorydiagramsPackageImpl theStorydiagramsPackage = (StorydiagramsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StorydiagramsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StorydiagramsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) : ActivitiesExpressionsPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		CallsExpressionsPackageImpl theCallsExpressionsPackage = (CallsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) instanceof CallsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) : CallsExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		PatternsExpressionsPackageImpl thePatternsExpressionsPackage = (PatternsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) instanceof PatternsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) : PatternsExpressionsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		theStorydiagramsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theActivitiesExpressionsPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theStorydiagramsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theActivitiesExpressionsPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStorydiagramsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StorydiagramsPackage.eNS_URI, theStorydiagramsPackage);
		return theStorydiagramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_VariableName() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorydiagramsFactory getStorydiagramsFactory() {
		return (StorydiagramsFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VARIABLE_NAME);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitiesPackage);
		getESubpackages().add(theCallsPackage);
		getESubpackages().add(thePatternsPackage);
		getESubpackages().add(theTemplatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(theCorePackage.getTypedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, Variable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "The storydiagram package is the root package for the story diagram meta-model. It defines the type Variable and otherwise is only used to contain more specific sub-packages."
		   });		
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represents a variable which can be, for example, an object variable, an attribute, or any other kind of variable."
		   });
	}

} //StorydiagramsPackageImpl
