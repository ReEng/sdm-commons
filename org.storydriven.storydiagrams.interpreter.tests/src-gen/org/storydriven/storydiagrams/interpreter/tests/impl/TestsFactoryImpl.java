/**
 */
package org.storydriven.storydiagrams.interpreter.tests.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.storydiagrams.interpreter.tests.TClass;
import org.storydriven.storydiagrams.interpreter.tests.TEnum;
import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TInheritanceType;
import org.storydriven.storydiagrams.interpreter.tests.TInterface;
import org.storydriven.storydiagrams.interpreter.tests.TMethod;
import org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement;
import org.storydriven.storydiagrams.interpreter.tests.TModel;
import org.storydriven.storydiagrams.interpreter.tests.TPackage;
import org.storydriven.storydiagrams.interpreter.tests.TParameter;
import org.storydriven.storydiagrams.interpreter.tests.TReturnStatement;
import org.storydriven.storydiagrams.interpreter.tests.TVisibilityType;
import org.storydriven.storydiagrams.interpreter.tests.TestsFactory;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TestsFactoryImpl extends EFactoryImpl implements TestsFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TestsFactory init() {
		try {
			TestsFactory theTestsFactory = (TestsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.storydriven.org/storydiagrams/interpreter/tests"); //$NON-NLS-1$ 
			if (theTestsFactory != null) {
				return theTestsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TestsPackage.TMODEL:
			return createTModel();
		case TestsPackage.TPACKAGE:
			return createTPackage();
		case TestsPackage.TINTERFACE:
			return createTInterface();
		case TestsPackage.TCLASS:
			return createTClass();
		case TestsPackage.TENUM:
			return createTEnum();
		case TestsPackage.TFIELD:
			return createTField();
		case TestsPackage.TMETHOD:
			return createTMethod();
		case TestsPackage.TPARAMETER:
			return createTParameter();
		case TestsPackage.TRETURN_STATEMENT:
			return createTReturnStatement();
		case TestsPackage.TMETHOD_CALL_STATEMENT:
			return createTMethodCallStatement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TestsPackage.TVISIBILITY_TYPE:
			return createTVisibilityTypeFromString(eDataType, initialValue);
		case TestsPackage.TINHERITANCE_TYPE:
			return createTInheritanceTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TestsPackage.TVISIBILITY_TYPE:
			return convertTVisibilityTypeToString(eDataType, instanceValue);
		case TestsPackage.TINHERITANCE_TYPE:
			return convertTInheritanceTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TModel createTModel() {
		TModelImpl tModel = new TModelImpl();
		return tModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TPackage createTPackage() {
		TPackageImpl tPackage = new TPackageImpl();
		return tPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TClass createTClass() {
		TClassImpl tClass = new TClassImpl();
		return tClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TEnum createTEnum() {
		TEnumImpl tEnum = new TEnumImpl();
		return tEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TField createTField() {
		TFieldImpl tField = new TFieldImpl();
		return tField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TMethod createTMethod() {
		TMethodImpl tMethod = new TMethodImpl();
		return tMethod;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TParameter createTParameter() {
		TParameterImpl tParameter = new TParameterImpl();
		return tParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TReturnStatement createTReturnStatement() {
		TReturnStatementImpl tReturnStatement = new TReturnStatementImpl();
		return tReturnStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TMethodCallStatement createTMethodCallStatement() {
		TMethodCallStatementImpl tMethodCallStatement = new TMethodCallStatementImpl();
		return tMethodCallStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TVisibilityType createTVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		TVisibilityType result = TVisibilityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TInheritanceType createTInheritanceTypeFromString(EDataType eDataType, String initialValue) {
		TInheritanceType result = TInheritanceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTInheritanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestsPackage getTestsPackage() {
		return (TestsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestsPackage getPackage() {
		return TestsPackage.eINSTANCE;
	}

} // TestsFactoryImpl
