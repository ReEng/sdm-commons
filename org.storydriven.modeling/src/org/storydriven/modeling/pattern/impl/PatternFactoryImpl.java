/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.storydriven.modeling.pattern.AttributeExpression;
import org.storydriven.modeling.pattern.BoundType;
import org.storydriven.modeling.pattern.Constraint;
import org.storydriven.modeling.pattern.Link;
import org.storydriven.modeling.pattern.Modifier;
import org.storydriven.modeling.pattern.MultiLink;
import org.storydriven.modeling.pattern.MultiLinkType;
import org.storydriven.modeling.pattern.ObjectPattern;
import org.storydriven.modeling.pattern.Operator;
import org.storydriven.modeling.pattern.Path;
import org.storydriven.modeling.pattern.PatternFactory;
import org.storydriven.modeling.pattern.PatternPackage;
import org.storydriven.modeling.pattern.StoryNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static PatternFactory init ()
   {
      try
      {
         PatternFactory thePatternFactory = (PatternFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/pattern/0.1.0");
         if (thePatternFactory != null)
         {
            return thePatternFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new PatternFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternFactoryImpl ()
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
         case PatternPackage.ATTRIBUTE_EXPRESSION:
            return createAttributeExpression();
         case PatternPackage.LINK:
            return createLink();
         case PatternPackage.MULTI_LINK:
            return createMultiLink();
         case PatternPackage.OBJECT_PATTERN:
            return createObjectPattern();
         case PatternPackage.STORY_NODE:
            return createStoryNode();
         case PatternPackage.PATH:
            return createPath();
         case PatternPackage.OBJECT:
            return createObject();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString (EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
         case PatternPackage.OPERATOR:
            return createOperatorFromString(eDataType, initialValue);
         case PatternPackage.BOUND_TYPE:
            return createBoundTypeFromString(eDataType, initialValue);
         case PatternPackage.CONSTRAINT:
            return createConstraintFromString(eDataType, initialValue);
         case PatternPackage.MODIFIER:
            return createModifierFromString(eDataType, initialValue);
         case PatternPackage.MULTI_LINK_TYPE:
            return createMultiLinkTypeFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString (EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
         case PatternPackage.OPERATOR:
            return convertOperatorToString(eDataType, instanceValue);
         case PatternPackage.BOUND_TYPE:
            return convertBoundTypeToString(eDataType, instanceValue);
         case PatternPackage.CONSTRAINT:
            return convertConstraintToString(eDataType, instanceValue);
         case PatternPackage.MODIFIER:
            return convertModifierToString(eDataType, instanceValue);
         case PatternPackage.MULTI_LINK_TYPE:
            return convertMultiLinkTypeToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AttributeExpression createAttributeExpression ()
   {
      AttributeExpressionImpl attributeExpression = new AttributeExpressionImpl();
      return attributeExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link createLink ()
   {
      LinkImpl link = new LinkImpl();
      return link;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public MultiLink createMultiLink ()
   {
      MultiLinkImpl multiLink = new MultiLinkImpl();
      return multiLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern createObjectPattern ()
   {
      ObjectPatternImpl objectPattern = new ObjectPatternImpl();
      return objectPattern;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StoryNode createStoryNode ()
   {
      StoryNodeImpl storyNode = new StoryNodeImpl();
      return storyNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Path createPath ()
   {
      PathImpl path = new PathImpl();
      return path;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.storydriven.modeling.pattern.Object createObject ()
   {
      ObjectImpl object = new ObjectImpl();
      return object;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Operator createOperatorFromString (EDataType eDataType, String initialValue)
   {
      Operator result = Operator.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertOperatorToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BoundType createBoundTypeFromString (EDataType eDataType, String initialValue)
   {
      BoundType result = BoundType.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertBoundTypeToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Constraint createConstraintFromString (EDataType eDataType, String initialValue)
   {
      Constraint result = Constraint.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertConstraintToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Modifier createModifierFromString (EDataType eDataType, String initialValue)
   {
      Modifier result = Modifier.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertModifierToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public MultiLinkType createMultiLinkTypeFromString (EDataType eDataType, String initialValue)
   {
      MultiLinkType result = MultiLinkType.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertMultiLinkTypeToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternPackage getPatternPackage ()
   {
      return (PatternPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static PatternPackage getPackage ()
   {
      return PatternPackage.eINSTANCE;
   }

} //PatternFactoryImpl
