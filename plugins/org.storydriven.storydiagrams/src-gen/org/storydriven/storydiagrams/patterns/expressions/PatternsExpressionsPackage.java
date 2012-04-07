/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.expressions.ExpressionsPackage;

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
 * @see org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsExpressionsPackage extends EPackage {
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
	String eNS_URI = "http://www..storydriven.org/storydiagrams/patterns/expressions/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdpe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsExpressionsPackage eINSTANCE = org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.AttributeValueExpressionImpl <em>Attribute Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.AttributeValueExpressionImpl
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getAttributeValueExpression()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__OBJECT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.ObjectVariableExpressionImpl <em>Object Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.ObjectVariableExpressionImpl
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getObjectVariableExpression()
	 * @generated
	 */
	int OBJECT_VARIABLE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__OBJECT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.ObjectSetSizeExpressionImpl <em>Object Set Size Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.ObjectSetSizeExpressionImpl
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getObjectSetSizeExpression()
	 * @generated
	 */
	int OBJECT_SET_SIZE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION__SET = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Set Size Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_SIZE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.PrimitiveVariableExpressionImpl <em>Primitive Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PrimitiveVariableExpressionImpl
	 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getPrimitiveVariableExpression()
	 * @generated
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Primitive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression <em>Attribute Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression
	 * @generated
	 */
	EClass getAttributeValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getObject()
	 * @see #getAttributeValueExpression()
	 * @generated
	 */
	EReference getAttributeValueExpression_Object();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getAttribute()
	 * @see #getAttributeValueExpression()
	 * @generated
	 */
	EReference getAttributeValueExpression_Attribute();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression <em>Object Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression
	 * @generated
	 */
	EClass getObjectVariableExpression();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression#getObject()
	 * @see #getObjectVariableExpression()
	 * @generated
	 */
	EReference getObjectVariableExpression_Object();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression <em>Object Set Size Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Set Size Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression
	 * @generated
	 */
	EClass getObjectSetSizeExpression();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression#getSet()
	 * @see #getObjectSetSizeExpression()
	 * @generated
	 */
	EReference getObjectSetSizeExpression_Set();

	/**
	 * Returns the meta object for class '{@link org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression <em>Primitive Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Variable Expression</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression
	 * @generated
	 */
	EClass getPrimitiveVariableExpression();

	/**
	 * Returns the meta object for the reference '{@link org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression#getPrimitiveVariable <em>Primitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Variable</em>'.
	 * @see org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression#getPrimitiveVariable()
	 * @see #getPrimitiveVariableExpression()
	 * @generated
	 */
	EReference getPrimitiveVariableExpression_PrimitiveVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsExpressionsFactory getPatternsExpressionsFactory();

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
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.AttributeValueExpressionImpl <em>Attribute Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.AttributeValueExpressionImpl
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getAttributeValueExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EXPRESSION = eINSTANCE.getAttributeValueExpression();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EXPRESSION__OBJECT = eINSTANCE.getAttributeValueExpression_Object();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE = eINSTANCE.getAttributeValueExpression_Attribute();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.ObjectVariableExpressionImpl <em>Object Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.ObjectVariableExpressionImpl
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getObjectVariableExpression()
		 * @generated
		 */
		EClass OBJECT_VARIABLE_EXPRESSION = eINSTANCE.getObjectVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE_EXPRESSION__OBJECT = eINSTANCE.getObjectVariableExpression_Object();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.ObjectSetSizeExpressionImpl <em>Object Set Size Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.ObjectSetSizeExpressionImpl
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getObjectSetSizeExpression()
		 * @generated
		 */
		EClass OBJECT_SET_SIZE_EXPRESSION = eINSTANCE.getObjectSetSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SET_SIZE_EXPRESSION__SET = eINSTANCE.getObjectSetSizeExpression_Set();

		/**
		 * The meta object literal for the '{@link org.storydriven.storydiagrams.patterns.expressions.impl.PrimitiveVariableExpressionImpl <em>Primitive Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PrimitiveVariableExpressionImpl
		 * @see org.storydriven.storydiagrams.patterns.expressions.impl.PatternsExpressionsPackageImpl#getPrimitiveVariableExpression()
		 * @generated
		 */
		EClass PRIMITIVE_VARIABLE_EXPRESSION = eINSTANCE.getPrimitiveVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Primitive Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE = eINSTANCE.getPrimitiveVariableExpression_PrimitiveVariable();

	}

} //PatternsExpressionsPackage
