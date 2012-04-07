/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.templates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage;
import org.storydriven.storydiagrams.activities.expressions.impl.ActivitiesExpressionsPackageImpl;
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
import org.storydriven.storydiagrams.templates.PropertyBinding;
import org.storydriven.storydiagrams.templates.TemplateBinding;
import org.storydriven.storydiagrams.templates.TemplateSignature;
import org.storydriven.storydiagrams.templates.TemplatesFactory;
import org.storydriven.storydiagrams.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatesPackageImpl extends EPackageImpl implements TemplatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureEClass = null;

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
	 * @see org.storydriven.storydiagrams.templates.TemplatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TemplatesPackageImpl() {
		super(eNS_URI, TemplatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TemplatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TemplatesPackage init() {
		if (isInited) return (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);

		// Obtain or create and register package
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemplatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StorydiagramsPackageImpl theStorydiagramsPackage = (StorydiagramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StorydiagramsPackage.eNS_URI) instanceof StorydiagramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StorydiagramsPackage.eNS_URI) : StorydiagramsPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) : ActivitiesExpressionsPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		CallsExpressionsPackageImpl theCallsExpressionsPackage = (CallsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) instanceof CallsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) : CallsExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		PatternsExpressionsPackageImpl thePatternsExpressionsPackage = (PatternsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) instanceof PatternsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) : PatternsExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theTemplatesPackage.createPackageContents();
		theStorydiagramsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theActivitiesExpressionsPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theTemplatesPackage.initializePackageContents();
		theStorydiagramsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theActivitiesExpressionsPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTemplatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TemplatesPackage.eNS_URI, theTemplatesPackage);
		return theTemplatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBinding() {
		return templateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_BoundParameter() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_BindingExpression() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_Template() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_PropertyBinding() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyBinding() {
		return propertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBinding_BoundProperty() {
		return (EReference)propertyBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBinding_BindingExpression() {
		return (EReference)propertyBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBinding_TemplateBinding() {
		return (EReference)propertyBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignature() {
		return templateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_TemplateBinding() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_TypeParameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Pattern() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatesFactory getTemplatesFactory() {
		return (TemplatesFactory)getEFactoryInstance();
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
		templateBindingEClass = createEClass(TEMPLATE_BINDING);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_PARAMETER);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__BINDING_EXPRESSION);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__TEMPLATE);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__PROPERTY_BINDING);

		propertyBindingEClass = createEClass(PROPERTY_BINDING);
		createEReference(propertyBindingEClass, PROPERTY_BINDING__BOUND_PROPERTY);
		createEReference(propertyBindingEClass, PROPERTY_BINDING__BINDING_EXPRESSION);
		createEReference(propertyBindingEClass, PROPERTY_BINDING__TEMPLATE_BINDING);

		templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE_BINDING);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TYPE_PARAMETER);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__PATTERN);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		templateBindingEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		propertyBindingEClass.getESuperTypes().add(theCorePackage.getExtendableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateBinding_BoundParameter(), theEcorePackage.getEClassifier(), null, "boundParameter", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_BindingExpression(), theExpressionsPackage.getExpression(), null, "bindingExpression", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_Template(), this.getTemplateSignature(), this.getTemplateSignature_TemplateBinding(), "template", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_PropertyBinding(), this.getPropertyBinding(), this.getPropertyBinding_TemplateBinding(), "propertyBinding", null, 0, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyBindingEClass, PropertyBinding.class, "PropertyBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyBinding_BoundProperty(), theEcorePackage.getEStructuralFeature(), null, "boundProperty", null, 1, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyBinding_BindingExpression(), theExpressionsPackage.getExpression(), null, "bindingExpression", null, 1, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyBinding_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_PropertyBinding(), "templateBinding", null, 1, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSignature_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_Template(), "templateBinding", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateSignature_TypeParameter(), theEcorePackage.getEClassifier(), null, "typeParameter", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateSignature_Pattern(), thePatternsPackage.getStoryPattern(), thePatternsPackage.getStoryPattern_TemplateSignature(), "pattern", null, 1, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //TemplatesPackageImpl
