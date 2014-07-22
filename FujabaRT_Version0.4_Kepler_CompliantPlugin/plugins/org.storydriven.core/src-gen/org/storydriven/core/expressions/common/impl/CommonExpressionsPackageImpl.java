/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.BinaryExpression;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.common.UnaryOperator;
import org.storydriven.core.expressions.impl.ExpressionsPackageImpl;
import org.storydriven.core.impl.CorePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonExpressionsPackageImpl extends EPackageImpl implements
		CommonExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparingOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

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
	 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonExpressionsPackageImpl() {
		super(eNS_URI, CommonExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonExpressionsPackage init() {
		if (isInited)
			return (CommonExpressionsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CommonExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		CommonExpressionsPackageImpl theCommonExpressionsPackage = (CommonExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CommonExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CommonExpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI)
				: ExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonExpressionsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theCommonExpressionsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonExpressionsPackage.eNS_URI,
				theCommonExpressionsPackage);
		return theCommonExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_EnclosedExpression() {
		return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute) unaryExpressionEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftExpression() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightExpression() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonExpression() {
		return comparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonExpression_Operator() {
		return (EAttribute) comparisonExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticExpression_Operator() {
		return (EAttribute) arithmeticExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalExpression_Operator() {
		return (EAttribute) logicalExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralExpression_Value() {
		return (EAttribute) literalExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicOperator() {
		return logicOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparingOperator() {
		return comparingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExpressionsFactory getCommonExpressionsFactory() {
		return (CommonExpressionsFactory) getEFactoryInstance();
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
		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass,
				UNARY_EXPRESSION__ENCLOSED_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass,
				BINARY_EXPRESSION__LEFT_EXPRESSION);
		createEReference(binaryExpressionEClass,
				BINARY_EXPRESSION__RIGHT_EXPRESSION);

		comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
		createEAttribute(comparisonExpressionEClass,
				COMPARISON_EXPRESSION__OPERATOR);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
		createEAttribute(arithmeticExpressionEClass,
				ARITHMETIC_EXPRESSION__OPERATOR);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);
		createEAttribute(logicalExpressionEClass, LOGICAL_EXPRESSION__OPERATOR);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);
		createEAttribute(literalExpressionEClass, LITERAL_EXPRESSION__VALUE);

		// Create enums
		logicOperatorEEnum = createEEnum(LOGIC_OPERATOR);
		comparingOperatorEEnum = createEEnum(COMPARING_OPERATOR);
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryExpressionEClass.getESuperTypes().add(
				theExpressionsPackage.getExpression());
		binaryExpressionEClass.getESuperTypes().add(
				theExpressionsPackage.getExpression());
		comparisonExpressionEClass.getESuperTypes().add(
				this.getBinaryExpression());
		arithmeticExpressionEClass.getESuperTypes().add(
				this.getBinaryExpression());
		logicalExpressionEClass.getESuperTypes()
				.add(this.getBinaryExpression());
		literalExpressionEClass.getESuperTypes().add(
				theExpressionsPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(unaryExpressionEClass, UnaryExpression.class,
				"UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_EnclosedExpression(),
				theExpressionsPackage.getExpression(), null,
				"enclosedExpression", null, 1, 1, UnaryExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getUnaryExpression_Operator(), this.getUnaryOperator(),
				"operator", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class,
				"BinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_LeftExpression(),
				theExpressionsPackage.getExpression(), null, "leftExpression",
				null, 1, 1, BinaryExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryExpression_RightExpression(),
				theExpressionsPackage.getExpression(), null, "rightExpression",
				null, 1, 1, BinaryExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(comparisonExpressionEClass, ComparisonExpression.class,
				"ComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonExpression_Operator(),
				this.getComparingOperator(), "operator", null, 1, 1,
				ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class,
				"ArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticExpression_Operator(),
				this.getArithmeticOperator(), "operator", null, 1, 1,
				ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(logicalExpressionEClass, LogicalExpression.class,
				"LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalExpression_Operator(),
				this.getLogicOperator(), "operator", null, 1, 1,
				LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class,
				"LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralExpression_Value(), ecorePackage.getEString(),
				"value", null, 1, 1, LiteralExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicOperatorEEnum, LogicOperator.class, "LogicOperator");
		addEEnumLiteral(logicOperatorEEnum, LogicOperator.AND);
		addEEnumLiteral(logicOperatorEEnum, LogicOperator.OR);
		addEEnumLiteral(logicOperatorEEnum, LogicOperator.XOR);
		addEEnumLiteral(logicOperatorEEnum, LogicOperator.IMPLY);
		addEEnumLiteral(logicOperatorEEnum, LogicOperator.EQUIVALENT);

		initEEnum(comparingOperatorEEnum, ComparingOperator.class,
				"ComparingOperator");
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.LESS);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.LESS_OR_EQUAL);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.EQUAL);
		addEEnumLiteral(comparingOperatorEEnum,
				ComparingOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.GREATER);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.UNEQUAL);
		addEEnumLiteral(comparingOperatorEEnum,
				ComparingOperator.REGULAR_EXPRESSION);

		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class,
				"ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.PLUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MINUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.TIMES);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVIDE);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MODULO);

		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.MINUS);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.INCREMENT);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.DECREMENT);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] { "invocationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"settingDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"validationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL" });
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
				logicOperatorEEnum,
				source,
				new String[] {
						"documentation",
						"Defines the operators for binary logic expressions. The unary logic expression representing negated expressions is reflected by the NotExpression." });
		addAnnotation(
				comparingOperatorEEnum,
				source,
				new String[] {
						"documentation",
						"Defines the operators for comparing expressions. The operators LESS, LESS_OR_EQUAL, EQUAL,\r\nGREATER_OR_EQUAL, GREATER, and UNEQUAL have their usual semantics.\r\nThe operator REGULAR_EXPRESSION enables to compare a String contained in the\r\nleft hand side of a ComparisonExpression with a regular expression contained in the \r\nright hand side of the ComparisonExpression." });
		addAnnotation(
				comparingOperatorEEnum.getELiterals().get(6),
				source,
				new String[] { "documentation",
						"For comparison of a String with a regular expression." });
		addAnnotation(arithmeticOperatorEEnum, source, new String[] {
				"documentation",
				"Defines the operators for arithmetic expressions." });
		addAnnotation(unaryExpressionEClass, source, new String[] {
				"documentation", "Represents an unary expression." });
		addAnnotation(
				getUnaryExpression_EnclosedExpression(),
				source,
				new String[] { "documentation",
						"Represents the operand of a NotExpression, e.g. a < 5 in NOT (a < 5)." });
		addAnnotation(getUnaryExpression_Operator(), source, new String[] {
				"documentation", "Represents the operator of the expression." });
		addAnnotation(binaryExpressionEClass, source, new String[] {
				"documentation",
				"Represents any binary expression like v < 5 or x + 7." });
		addAnnotation(
				getBinaryExpression_LeftExpression(),
				source,
				new String[] {
						"documentation",
						"Represents the first operand of a binary expression, e.g. x in the expression x < 5." });
		addAnnotation(
				getBinaryExpression_RightExpression(),
				source,
				new String[] {
						"documentation",
						"Represents the second operand of a binary expression, e.g. 5 in the expression x < 5." });
		addAnnotation(comparisonExpressionEClass, source, new String[] {
				"documentation",
				"Represents comparing expressions like a < 5 or a >= 7." });
		addAnnotation(
				getComparisonExpression_Operator(),
				source,
				new String[] { "documentation",
						"Specifies the expression\'s comparing operator, e.g. <, >=, !=." });
		addAnnotation(arithmeticExpressionEClass, source, new String[] {
				"documentation",
				"Represents arithmetic expressions like a + 5 or a * 7." });
		addAnnotation(
				getArithmeticExpression_Operator(),
				source,
				new String[] { "documentation",
						"Specifies the expression\'s arithmetic operator, e.g. +, -, *, /, or MODULO." });
		addAnnotation(
				logicalExpressionEClass,
				source,
				new String[] { "documentation",
						"Represents binary, logic expressions like a AND b and a OR b." });
		addAnnotation(
				getLogicalExpression_Operator(),
				source,
				new String[] { "documentation",
						"Specifies the expression\'s logic operator, e.g. AND, OR, or XOR." });
		addAnnotation(
				literalExpressionEClass,
				source,
				new String[] {
						"documentation",
						"Represents any literal, i.e. a value whose type is an EDataType. Literals are, for example, 5, 3.14, \'c\', \"text\", true." });
		addAnnotation(
				getLiteralExpression_Value(),
				source,
				new String[] {
						"documentation",
						"String representation of the value, e.g. \"5\", \"3.14\", \"c\", \"text\", or \"true\"." });
	}

} //CommonExpressionsPackageImpl
