/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage
 * @generated
 */
public interface TestsFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TestsFactory eINSTANCE = org.storydriven.storydiagrams.interpreter.tests.impl.TestsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TModel</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TModel</em>'.
	 * @generated
	 */
	TModel createTModel();

	/**
	 * Returns a new object of class '<em>TPackage</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TPackage</em>'.
	 * @generated
	 */
	TPackage createTPackage();

	/**
	 * Returns a new object of class '<em>TInterface</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TInterface</em>'.
	 * @generated
	 */
	TInterface createTInterface();

	/**
	 * Returns a new object of class '<em>TClass</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TClass</em>'.
	 * @generated
	 */
	TClass createTClass();

	/**
	 * Returns a new object of class '<em>TEnum</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TEnum</em>'.
	 * @generated
	 */
	TEnum createTEnum();

	/**
	 * Returns a new object of class '<em>TField</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TField</em>'.
	 * @generated
	 */
	TField createTField();

	/**
	 * Returns a new object of class '<em>TMethod</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TMethod</em>'.
	 * @generated
	 */
	TMethod createTMethod();

	/**
	 * Returns a new object of class '<em>TParameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TParameter</em>'.
	 * @generated
	 */
	TParameter createTParameter();

	/**
	 * Returns a new object of class '<em>TReturn Statement</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TReturn Statement</em>'.
	 * @generated
	 */
	TReturnStatement createTReturnStatement();

	/**
	 * Returns a new object of class '<em>TMethod Call Statement</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>TMethod Call Statement</em>'.
	 * @generated
	 */
	TMethodCallStatement createTMethodCallStatement();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestsPackage getTestsPackage();

} // TestsFactory
