/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.storydriven.modeling.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ExpressionsFactory init ()
   {
      try
      {
         ExpressionsFactory theExpressionsFactory = (ExpressionsFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/expressions/0.1.0");
         if (theExpressionsFactory != null)
         {
            return theExpressionsFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ExpressionsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsFactoryImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create (EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case ExpressionsPackage.COLLABORATION:
            return createCollaboration();
         case ExpressionsPackage.COMPLEX_EXPRESSION:
            return createComplexExpression();
         case ExpressionsPackage.FOR_LOOP:
            return createForLoop();
         case ExpressionsPackage.WHILE_LOOP:
            return createWhileLoop();
         case ExpressionsPackage.CONDITIONAL_EXPRESSION:
            return createConditionalExpression();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Collaboration createCollaboration ()
   {
      CollaborationImpl collaboration = new CollaborationImpl();
      return collaboration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComplexExpression createComplexExpression ()
   {
      ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
      return complexExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ForLoop createForLoop ()
   {
      ForLoopImpl forLoop = new ForLoopImpl();
      return forLoop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public WhileLoop createWhileLoop ()
   {
      WhileLoopImpl whileLoop = new WhileLoopImpl();
      return whileLoop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ConditionalExpression createConditionalExpression ()
   {
      ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
      return conditionalExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsPackage getExpressionsPackage ()
   {
      return (ExpressionsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ExpressionsPackage getPackage ()
   {
      return ExpressionsPackage.eINSTANCE;
   }

} //ExpressionsFactoryImpl
