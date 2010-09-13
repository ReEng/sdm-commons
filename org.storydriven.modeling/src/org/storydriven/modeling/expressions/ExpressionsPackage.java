/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.modeling.SDMPackage;

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
 * @see org.storydriven.modeling.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "expressions";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/expressions/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdme";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ExpressionsPackage eINSTANCE = org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.CollaborationImpl <em>Collaboration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.CollaborationImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getCollaboration()
    * @generated
    */
   int COLLABORATION = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__ANNOTATION = SDMPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__EXTENSION = SDMPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__TYPE = SDMPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__GENERIC_TYPE = SDMPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__SOURCE = SDMPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__TARGET = SDMPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__BODY = SDMPackage.EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>For Each</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION__FOR_EACH = SDMPackage.EXPRESSION_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Collaboration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLABORATION_FEATURE_COUNT = SDMPackage.EXPRESSION_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.ComplexExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getComplexExpression()
    * @generated
    */
   int COMPLEX_EXPRESSION = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_EXPRESSION__ANNOTATION = SDMPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_EXPRESSION__EXTENSION = SDMPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_EXPRESSION__TYPE = SDMPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_EXPRESSION__GENERIC_TYPE = SDMPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Child Expression</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_EXPRESSION__CHILD_EXPRESSION = SDMPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Complex Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_EXPRESSION_FEATURE_COUNT = SDMPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.ForLoopImpl <em>For Loop</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.ForLoopImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getForLoop()
    * @generated
    */
   int FOR_LOOP = 2;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__ANNOTATION = SDMPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__EXTENSION = SDMPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__TYPE = SDMPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__GENERIC_TYPE = SDMPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Loop Variable</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__LOOP_VARIABLE = SDMPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Start Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__START_VALUE = SDMPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Stop Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP__STOP_VALUE = SDMPackage.EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>For Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_LOOP_FEATURE_COUNT = SDMPackage.EXPRESSION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.WhileLoopImpl <em>While Loop</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.WhileLoopImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getWhileLoop()
    * @generated
    */
   int WHILE_LOOP = 3;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP__ANNOTATION = SDMPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP__EXTENSION = SDMPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP__TYPE = SDMPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP__GENERIC_TYPE = SDMPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP__LOOP_CONDITION = SDMPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP__BODY = SDMPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>While Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WHILE_LOOP_FEATURE_COUNT = SDMPackage.EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getConditionalExpression()
    * @generated
    */
   int CONDITIONAL_EXPRESSION = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__ANNOTATION = SDMPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__EXTENSION = SDMPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__TYPE = SDMPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__GENERIC_TYPE = SDMPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Condition</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__CONDITION = SDMPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Then</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__THEN = SDMPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Else</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__ELSE = SDMPackage.EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Conditional Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION_FEATURE_COUNT = SDMPackage.EXPRESSION_FEATURE_COUNT + 3;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.Collaboration <em>Collaboration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Collaboration</em>'.
    * @see org.storydriven.modeling.expressions.Collaboration
    * @generated
    */
   EClass getCollaboration ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.expressions.Collaboration#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.storydriven.modeling.expressions.Collaboration#getSource()
    * @see #getCollaboration()
    * @generated
    */
   EReference getCollaboration_Source ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.expressions.Collaboration#getTargets <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Target</em>'.
    * @see org.storydriven.modeling.expressions.Collaboration#getTargets()
    * @see #getCollaboration()
    * @generated
    */
   EReference getCollaboration_Target ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.Collaboration#getBody <em>Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Body</em>'.
    * @see org.storydriven.modeling.expressions.Collaboration#getBody()
    * @see #getCollaboration()
    * @generated
    */
   EReference getCollaboration_Body ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.Collaboration#isForEach <em>For Each</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>For Each</em>'.
    * @see org.storydriven.modeling.expressions.Collaboration#isForEach()
    * @see #getCollaboration()
    * @generated
    */
   EAttribute getCollaboration_ForEach ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.ComplexExpression <em>Complex Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Complex Expression</em>'.
    * @see org.storydriven.modeling.expressions.ComplexExpression
    * @generated
    */
   EClass getComplexExpression ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.expressions.ComplexExpression#getChildExpressions <em>Child Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Child Expression</em>'.
    * @see org.storydriven.modeling.expressions.ComplexExpression#getChildExpressions()
    * @see #getComplexExpression()
    * @generated
    */
   EReference getComplexExpression_ChildExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.ForLoop <em>For Loop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>For Loop</em>'.
    * @see org.storydriven.modeling.expressions.ForLoop
    * @generated
    */
   EClass getForLoop ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.ForLoop#getLoopVariable <em>Loop Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Loop Variable</em>'.
    * @see org.storydriven.modeling.expressions.ForLoop#getLoopVariable()
    * @see #getForLoop()
    * @generated
    */
   EReference getForLoop_LoopVariable ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.ForLoop#getStartValue <em>Start Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Start Value</em>'.
    * @see org.storydriven.modeling.expressions.ForLoop#getStartValue()
    * @see #getForLoop()
    * @generated
    */
   EReference getForLoop_StartValue ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.ForLoop#getStopValue <em>Stop Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Stop Value</em>'.
    * @see org.storydriven.modeling.expressions.ForLoop#getStopValue()
    * @see #getForLoop()
    * @generated
    */
   EReference getForLoop_StopValue ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.WhileLoop <em>While Loop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>While Loop</em>'.
    * @see org.storydriven.modeling.expressions.WhileLoop
    * @generated
    */
   EClass getWhileLoop ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.WhileLoop#getLoopCondition <em>Loop Condition</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Loop Condition</em>'.
    * @see org.storydriven.modeling.expressions.WhileLoop#getLoopCondition()
    * @see #getWhileLoop()
    * @generated
    */
   EReference getWhileLoop_LoopCondition ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.WhileLoop#getBody <em>Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Body</em>'.
    * @see org.storydriven.modeling.expressions.WhileLoop#getBody()
    * @see #getWhileLoop()
    * @generated
    */
   EReference getWhileLoop_Body ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.ConditionalExpression <em>Conditional Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Conditional Expression</em>'.
    * @see org.storydriven.modeling.expressions.ConditionalExpression
    * @generated
    */
   EClass getConditionalExpression ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.ConditionalExpression#getCondition <em>Condition</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Condition</em>'.
    * @see org.storydriven.modeling.expressions.ConditionalExpression#getCondition()
    * @see #getConditionalExpression()
    * @generated
    */
   EReference getConditionalExpression_Condition ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.ConditionalExpression#getThen <em>Then</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Then</em>'.
    * @see org.storydriven.modeling.expressions.ConditionalExpression#getThen()
    * @see #getConditionalExpression()
    * @generated
    */
   EReference getConditionalExpression_Then ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.ConditionalExpression#getElse <em>Else</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Else</em>'.
    * @see org.storydriven.modeling.expressions.ConditionalExpression#getElse()
    * @see #getConditionalExpression()
    * @generated
    */
   EReference getConditionalExpression_Else ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ExpressionsFactory getExpressionsFactory ();

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
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.CollaborationImpl <em>Collaboration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.CollaborationImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getCollaboration()
       * @generated
       */
      EClass COLLABORATION = eINSTANCE.getCollaboration();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COLLABORATION__SOURCE = eINSTANCE.getCollaboration_Source();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COLLABORATION__TARGET = eINSTANCE.getCollaboration_Target();

      /**
       * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COLLABORATION__BODY = eINSTANCE.getCollaboration_Body();

      /**
       * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COLLABORATION__FOR_EACH = eINSTANCE.getCollaboration_ForEach();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.ComplexExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getComplexExpression()
       * @generated
       */
      EClass COMPLEX_EXPRESSION = eINSTANCE.getComplexExpression();

      /**
       * The meta object literal for the '<em><b>Child Expression</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPLEX_EXPRESSION__CHILD_EXPRESSION = eINSTANCE.getComplexExpression_ChildExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.ForLoopImpl <em>For Loop</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.ForLoopImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getForLoop()
       * @generated
       */
      EClass FOR_LOOP = eINSTANCE.getForLoop();

      /**
       * The meta object literal for the '<em><b>Loop Variable</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FOR_LOOP__LOOP_VARIABLE = eINSTANCE.getForLoop_LoopVariable();

      /**
       * The meta object literal for the '<em><b>Start Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FOR_LOOP__START_VALUE = eINSTANCE.getForLoop_StartValue();

      /**
       * The meta object literal for the '<em><b>Stop Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FOR_LOOP__STOP_VALUE = eINSTANCE.getForLoop_StopValue();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.WhileLoopImpl <em>While Loop</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.WhileLoopImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getWhileLoop()
       * @generated
       */
      EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

      /**
       * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference WHILE_LOOP__LOOP_CONDITION = eINSTANCE.getWhileLoop_LoopCondition();

      /**
       * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference WHILE_LOOP__BODY = eINSTANCE.getWhileLoop_Body();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getConditionalExpression()
       * @generated
       */
      EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

      /**
       * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getConditionalExpression_Condition();

      /**
       * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CONDITIONAL_EXPRESSION__THEN = eINSTANCE.getConditionalExpression_Then();

      /**
       * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CONDITIONAL_EXPRESSION__ELSE = eINSTANCE.getConditionalExpression_Else();

   }

} //ExpressionsPackage
