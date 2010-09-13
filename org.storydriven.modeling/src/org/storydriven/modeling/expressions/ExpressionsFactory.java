/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ExpressionsFactory eINSTANCE = org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Collaboration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Collaboration</em>'.
    * @generated
    */
   Collaboration createCollaboration ();

   /**
    * Returns a new object of class '<em>Complex Expression</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Complex Expression</em>'.
    * @generated
    */
   ComplexExpression createComplexExpression ();

   /**
    * Returns a new object of class '<em>For Loop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>For Loop</em>'.
    * @generated
    */
   ForLoop createForLoop ();

   /**
    * Returns a new object of class '<em>While Loop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>While Loop</em>'.
    * @generated
    */
   WhileLoop createWhileLoop ();

   /**
    * Returns a new object of class '<em>Conditional Expression</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Conditional Expression</em>'.
    * @generated
    */
   ConditionalExpression createConditionalExpression ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ExpressionsPackage getExpressionsPackage ();

} //ExpressionsFactory
