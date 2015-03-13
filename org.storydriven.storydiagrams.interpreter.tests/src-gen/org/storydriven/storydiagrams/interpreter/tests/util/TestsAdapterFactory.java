/**
 */
package org.storydriven.storydiagrams.interpreter.tests.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage
 * @generated
 */
public class TestsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static TestsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TestsSwitch<Adapter> modelSwitch = new TestsSwitch<Adapter>() {
		@Override
		public Adapter caseTNamed(TNamed object) {
			return createTNamedAdapter();
		}

		@Override
		public Adapter caseTModifyable(TModifyable object) {
			return createTModifyableAdapter();
		}

		@Override
		public Adapter caseTTyped(TTyped object) {
			return createTTypedAdapter();
		}

		@Override
		public Adapter caseTModel(TModel object) {
			return createTModelAdapter();
		}

		@Override
		public Adapter caseTPackage(TPackage object) {
			return createTPackageAdapter();
		}

		@Override
		public Adapter caseTType(TType object) {
			return createTTypeAdapter();
		}

		@Override
		public Adapter caseTInterface(TInterface object) {
			return createTInterfaceAdapter();
		}

		@Override
		public Adapter caseTClass(TClass object) {
			return createTClassAdapter();
		}

		@Override
		public Adapter caseTEnum(TEnum object) {
			return createTEnumAdapter();
		}

		@Override
		public Adapter caseTField(TField object) {
			return createTFieldAdapter();
		}

		@Override
		public Adapter caseTMethod(TMethod object) {
			return createTMethodAdapter();
		}

		@Override
		public Adapter caseTParameter(TParameter object) {
			return createTParameterAdapter();
		}

		@Override
		public Adapter caseTStatement(TStatement object) {
			return createTStatementAdapter();
		}

		@Override
		public Adapter caseTReturnStatement(TReturnStatement object) {
			return createTReturnStatementAdapter();
		}

		@Override
		public Adapter caseTMethodCallStatement(TMethodCallStatement object) {
			return createTMethodCallStatementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TNamed
	 * <em>TNamed</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TNamed
	 * @generated
	 */
	public Adapter createTNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TModifyable
	 * <em>TModifyable</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModifyable
	 * @generated
	 */
	public Adapter createTModifyableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped
	 * <em>TTyped</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TTyped
	 * @generated
	 */
	public Adapter createTTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TModel
	 * <em>TModel</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TModel
	 * @generated
	 */
	public Adapter createTModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TPackage
	 * <em>TPackage</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TPackage
	 * @generated
	 */
	public Adapter createTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TType
	 * <em>TType</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TType
	 * @generated
	 */
	public Adapter createTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TInterface
	 * <em>TInterface</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TInterface
	 * @generated
	 */
	public Adapter createTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TClass
	 * <em>TClass</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TClass
	 * @generated
	 */
	public Adapter createTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TEnum
	 * <em>TEnum</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TEnum
	 * @generated
	 */
	public Adapter createTEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TField
	 * <em>TField</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TField
	 * @generated
	 */
	public Adapter createTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TMethod
	 * <em>TMethod</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethod
	 * @generated
	 */
	public Adapter createTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TParameter
	 * <em>TParameter</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TParameter
	 * @generated
	 */
	public Adapter createTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.interpreter.tests.TStatement
	 * <em>TStatement</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TStatement
	 * @generated
	 */
	public Adapter createTStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TReturnStatement <em>TReturn Statement</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TReturnStatement
	 * @generated
	 */
	public Adapter createTReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement <em>TMethod Call Statement</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement
	 * @generated
	 */
	public Adapter createTMethodCallStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // TestsAdapterFactory
