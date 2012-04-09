/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains all classes for modeling calls to activities and EOperations
 * from within an activity.
 * <!-- end-model-doc -->
 * @see org.storydriven.storydiagrams.calls.CallsFactory
 * @model kind="package"
 * @generated
 */
public interface CallsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.storydriven.org/storydiagrams/calls/0.2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CallsPackage eINSTANCE = org.storydriven.storydiagrams.calls.impl.CallsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.calls.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.calls.impl.InvocationImpl
	 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__OWNED_PARAMETER_BINDINGS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__CALLEE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.calls.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.calls.impl.ParameterBindingImpl
	 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__VALUE_EXPRESSION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__INVOCATION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.calls.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.calls.impl.CallableImpl
	 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__IN_PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__OUT_PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__CONTAINED_PARAMETERS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl <em>Opaque Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl
	 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getOpaqueCallable()
	 * @generated
	 */
	int OPAQUE_CALLABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__ANNOTATION = CALLABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__EXTENSION = CALLABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__COMMENT = CALLABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__IN_PARAMETER = CALLABLE__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__OUT_PARAMETER = CALLABLE__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__CONTAINED_PARAMETERS = CALLABLE__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__NAME = CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__CALL_EXPRESSION = CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE_FEATURE_COUNT = CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl <em>Parameter Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl
	 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getParameterExtension()
	 * @generated
	 */
	int PARAMETER_EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__ANNOTATION = CorePackage.EXTENSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__EXTENSION = CorePackage.EXTENSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__BASE = CorePackage.EXTENSION__BASE;

	/**
	 * The feature id for the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__MODEL_BASE = CorePackage.EXTENSION__MODEL_BASE;

	/**
	 * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__OWNING_ANNOTATION = CorePackage.EXTENSION__OWNING_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__TYPE = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__GENERIC_TYPE = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__VARIABLE_NAME = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__PARAMETER = CorePackage.EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.calls.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see org.storydriven.storydiagrams.calls.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter Bindings</em>'.
	 * @see org.storydriven.storydiagrams.calls.Invocation#getOwnedParameterBindings()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_OwnedParameterBindings();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.calls.Invocation#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see org.storydriven.storydiagrams.calls.Invocation#getCallee()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Callee();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.calls.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see org.storydriven.storydiagrams.calls.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.storydriven.storydiagrams.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.storydriven.storydiagrams.calls.ParameterBinding#getValueExpression()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.calls.ParameterBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.storydriven.storydiagrams.calls.ParameterBinding#getParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Parameter();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.calls.ParameterBinding#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocation</em>'.
	 * @see org.storydriven.storydiagrams.calls.ParameterBinding#getInvocation()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Invocation();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.calls.OpaqueCallable <em>Opaque Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Callable</em>'.
	 * @see org.storydriven.storydiagrams.calls.OpaqueCallable
	 * @generated
	 */
	EClass getOpaqueCallable();

	/**
	 * Returns the meta object for the attribute '{@link org.storydriven.storydiagrams.calls.OpaqueCallable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.storydriven.storydiagrams.calls.OpaqueCallable#getName()
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	EAttribute getOpaqueCallable_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.storydriven.storydiagrams.calls.OpaqueCallable#getCallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Call Expression</em>'.
	 * @see org.storydriven.storydiagrams.calls.OpaqueCallable#getCallExpression()
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	EReference getOpaqueCallable_CallExpression();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.calls.ParameterExtension <em>Parameter Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Extension</em>'.
	 * @see org.storydriven.storydiagrams.calls.ParameterExtension
	 * @generated
	 */
	EClass getParameterExtension();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.calls.ParameterExtension#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.storydriven.storydiagrams.calls.ParameterExtension#getParameter()
	 * @see #getParameterExtension()
	 * @generated
	 */
	EReference getParameterExtension_Parameter();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.calls.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see org.storydriven.storydiagrams.calls.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.calls.Callable#getInParameters <em>In Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Parameter</em>'.
	 * @see org.storydriven.storydiagrams.calls.Callable#getInParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_InParameter();

	/**
	 * Returns the meta object for the reference list '{@link org.storydriven.storydiagrams.calls.Callable#getOutParameters <em>Out Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Parameter</em>'.
	 * @see org.storydriven.storydiagrams.calls.Callable#getOutParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_OutParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.storydriven.storydiagrams.calls.Callable#getContainedParameters <em>Contained Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Parameters</em>'.
	 * @see org.storydriven.storydiagrams.calls.Callable#getContainedParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_ContainedParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CallsFactory getCallsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.calls.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.calls.impl.InvocationImpl
		 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__OWNED_PARAMETER_BINDINGS = eINSTANCE.getInvocation_OwnedParameterBindings();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__CALLEE = eINSTANCE.getInvocation_Callee();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.calls.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.calls.impl.ParameterBindingImpl
		 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__VALUE_EXPRESSION = eINSTANCE.getParameterBinding_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__PARAMETER = eINSTANCE.getParameterBinding_Parameter();

		/**
		 * The meta object literal for the '<em><b>Invocation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__INVOCATION = eINSTANCE.getParameterBinding_Invocation();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl <em>Opaque Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl
		 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getOpaqueCallable()
		 * @generated
		 */
		EClass OPAQUE_CALLABLE = eINSTANCE.getOpaqueCallable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_CALLABLE__NAME = eINSTANCE.getOpaqueCallable_Name();

		/**
		 * The meta object literal for the '<em><b>Call Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_CALLABLE__CALL_EXPRESSION = eINSTANCE.getOpaqueCallable_CallExpression();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl <em>Parameter Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl
		 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getParameterExtension()
		 * @generated
		 */
		EClass PARAMETER_EXTENSION = eINSTANCE.getParameterExtension();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXTENSION__PARAMETER = eINSTANCE.getParameterExtension_Parameter();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.calls.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.calls.impl.CallableImpl
		 * @see org.storydriven.storydiagrams.calls.impl.CallsPackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>In Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__IN_PARAMETER = eINSTANCE.getCallable_InParameter();

		/**
		 * The meta object literal for the '<em><b>Out Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__OUT_PARAMETER = eINSTANCE.getCallable_OutParameter();

		/**
		 * The meta object literal for the '<em><b>Contained Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__CONTAINED_PARAMETERS = eINSTANCE.getCallable_ContainedParameters();

	}

} //CallsPackage
