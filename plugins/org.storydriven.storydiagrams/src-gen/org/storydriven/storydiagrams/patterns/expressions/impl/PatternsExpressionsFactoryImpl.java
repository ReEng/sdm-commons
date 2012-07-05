/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.storydiagrams.patterns.expressions.*;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsExpressionsFactoryImpl extends EFactoryImpl implements
		PatternsExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternsExpressionsFactory init() {
		try {
			PatternsExpressionsFactory thePatternsExpressionsFactory = (PatternsExpressionsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.storydriven.org/storydiagrams/patterns/expressions/0.2.1");
			if (thePatternsExpressionsFactory != null) {
				return thePatternsExpressionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternsExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PatternsExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION:
			return createAttributeValueExpression();
		case PatternsExpressionsPackage.OBJECT_VARIABLE_EXPRESSION:
			return createObjectVariableExpression();
		case PatternsExpressionsPackage.COLLECTION_SIZE_EXPRESSION:
			return createCollectionSizeExpression();
		case PatternsExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION:
			return createPrimitiveVariableExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueExpression createAttributeValueExpression() {
		AttributeValueExpressionImpl attributeValueExpression = new AttributeValueExpressionImpl();
		return attributeValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariableExpression createObjectVariableExpression() {
		ObjectVariableExpressionImpl objectVariableExpression = new ObjectVariableExpressionImpl();
		return objectVariableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionSizeExpression createCollectionSizeExpression() {
		CollectionSizeExpressionImpl collectionSizeExpression = new CollectionSizeExpressionImpl();
		return collectionSizeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveVariableExpression createPrimitiveVariableExpression() {
		PrimitiveVariableExpressionImpl primitiveVariableExpression = new PrimitiveVariableExpressionImpl();
		return primitiveVariableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsExpressionsPackage getPatternsExpressionsPackage() {
		return (PatternsExpressionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternsExpressionsPackage getPackage() {
		return PatternsExpressionsPackage.eINSTANCE;
	}

} //PatternsExpressionsFactoryImpl
