/**
 */
package org.storydriven.storydiagrams.interpreter.tests.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.storydiagrams.interpreter.tests.TClass;
import org.storydriven.storydiagrams.interpreter.tests.TEnum;
import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TInterface;
import org.storydriven.storydiagrams.interpreter.tests.TMethod;
import org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement;
import org.storydriven.storydiagrams.interpreter.tests.TModel;
import org.storydriven.storydiagrams.interpreter.tests.TModifyable;
import org.storydriven.storydiagrams.interpreter.tests.TNamed;
import org.storydriven.storydiagrams.interpreter.tests.TPackage;
import org.storydriven.storydiagrams.interpreter.tests.TParameter;
import org.storydriven.storydiagrams.interpreter.tests.TReturnStatement;
import org.storydriven.storydiagrams.interpreter.tests.TStatement;
import org.storydriven.storydiagrams.interpreter.tests.TType;
import org.storydriven.storydiagrams.interpreter.tests.TTyped;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage
 * @generated
 */
public class TestsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static TestsPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestsSwitch() {
		if (modelPackage == null) {
			modelPackage = TestsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TestsPackage.TNAMED: {
			TNamed tNamed = (TNamed) theEObject;
			T result = caseTNamed(tNamed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TMODIFYABLE: {
			TModifyable tModifyable = (TModifyable) theEObject;
			T result = caseTModifyable(tModifyable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TTYPED: {
			TTyped tTyped = (TTyped) theEObject;
			T result = caseTTyped(tTyped);
			if (result == null)
				result = caseTNamed(tTyped);
			if (result == null)
				result = caseTModifyable(tTyped);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TMODEL: {
			TModel tModel = (TModel) theEObject;
			T result = caseTModel(tModel);
			if (result == null)
				result = caseTNamed(tModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TPACKAGE: {
			TPackage tPackage = (TPackage) theEObject;
			T result = caseTPackage(tPackage);
			if (result == null)
				result = caseTNamed(tPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TTYPE: {
			TType tType = (TType) theEObject;
			T result = caseTType(tType);
			if (result == null)
				result = caseTNamed(tType);
			if (result == null)
				result = caseTModifyable(tType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TINTERFACE: {
			TInterface tInterface = (TInterface) theEObject;
			T result = caseTInterface(tInterface);
			if (result == null)
				result = caseTType(tInterface);
			if (result == null)
				result = caseTNamed(tInterface);
			if (result == null)
				result = caseTModifyable(tInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TCLASS: {
			TClass tClass = (TClass) theEObject;
			T result = caseTClass(tClass);
			if (result == null)
				result = caseTType(tClass);
			if (result == null)
				result = caseTNamed(tClass);
			if (result == null)
				result = caseTModifyable(tClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TENUM: {
			TEnum tEnum = (TEnum) theEObject;
			T result = caseTEnum(tEnum);
			if (result == null)
				result = caseTType(tEnum);
			if (result == null)
				result = caseTNamed(tEnum);
			if (result == null)
				result = caseTModifyable(tEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TFIELD: {
			TField tField = (TField) theEObject;
			T result = caseTField(tField);
			if (result == null)
				result = caseTTyped(tField);
			if (result == null)
				result = caseTNamed(tField);
			if (result == null)
				result = caseTModifyable(tField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TMETHOD: {
			TMethod tMethod = (TMethod) theEObject;
			T result = caseTMethod(tMethod);
			if (result == null)
				result = caseTTyped(tMethod);
			if (result == null)
				result = caseTNamed(tMethod);
			if (result == null)
				result = caseTModifyable(tMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TPARAMETER: {
			TParameter tParameter = (TParameter) theEObject;
			T result = caseTParameter(tParameter);
			if (result == null)
				result = caseTTyped(tParameter);
			if (result == null)
				result = caseTNamed(tParameter);
			if (result == null)
				result = caseTModifyable(tParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TSTATEMENT: {
			TStatement tStatement = (TStatement) theEObject;
			T result = caseTStatement(tStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TRETURN_STATEMENT: {
			TReturnStatement tReturnStatement = (TReturnStatement) theEObject;
			T result = caseTReturnStatement(tReturnStatement);
			if (result == null)
				result = caseTStatement(tReturnStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestsPackage.TMETHOD_CALL_STATEMENT: {
			TMethodCallStatement tMethodCallStatement = (TMethodCallStatement) theEObject;
			T result = caseTMethodCallStatement(tMethodCallStatement);
			if (result == null)
				result = caseTStatement(tMethodCallStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNamed</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNamed(TNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TModifyable</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TModifyable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTModifyable(TModifyable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTyped</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTyped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTyped(TTyped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TModel</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTModel(TModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPackage</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPackage(TPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TType</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTType(TType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInterface</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInterface(TInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClass</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClass(TClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnum</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnum(TEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TField</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTField(TField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethod(TMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TParameter</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTParameter(TParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TStatement</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TStatement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTStatement(TStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TReturn Statement</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TReturn Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTReturnStatement(TReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMethod Call Statement</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMethod Call Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMethodCallStatement(TMethodCallStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // TestsSwitch
