/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.patterns.*;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.ContainmentRelation;
import org.storydriven.modeling.patterns.LinkOrderConstraint;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.Modifier;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.OrderConstraintType;
import org.storydriven.modeling.patterns.Path;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class PatternsFactoryImpl extends EFactoryImpl implements PatternsFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static PatternsFactory init ()
   {
      try
      {
         PatternsFactory thePatternsFactory = (PatternsFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/patterns/0.1.0");
         if (thePatternsFactory != null)
         {
            return thePatternsFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new PatternsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsFactoryImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create (EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case PatternsPackage.OBJECT_VARIABLE:
            return createObjectVariable();
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT:
            return createAttributeAssignment();
         case PatternsPackage.LINK_ORDER_CONSTRAINT:
            return createLinkOrderConstraint();
         case PatternsPackage.CONSTRAINT:
            return createConstraint();
         case PatternsPackage.OBJECT_SET_VARIABLE:
            return createObjectSetVariable();
         case PatternsPackage.PATH:
            return createPath();
         case PatternsPackage.LINK_VARIABLE:
            return createLinkVariable();
         case PatternsPackage.CONTAINMENT_RELATION:
            return createContainmentRelation();
         case PatternsPackage.MATCHING_PATTERN:
            return createMatchingPattern();
         case PatternsPackage.STORY_PATTERN:
            return createStoryPattern();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString (EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
         case PatternsPackage.BINDING_STATE:
            return createBindingStateFromString(eDataType, initialValue);
         case PatternsPackage.BINDING_SEMANTICS:
            return createBindingSemanticsFromString(eDataType, initialValue);
         case PatternsPackage.MODIFIER:
            return createModifierFromString(eDataType, initialValue);
         case PatternsPackage.ORDER_CONSTRAINT_TYPE:
            return createOrderConstraintTypeFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString (EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
         case PatternsPackage.BINDING_STATE:
            return convertBindingStateToString(eDataType, instanceValue);
         case PatternsPackage.BINDING_SEMANTICS:
            return convertBindingSemanticsToString(eDataType, instanceValue);
         case PatternsPackage.MODIFIER:
            return convertModifierToString(eDataType, instanceValue);
         case PatternsPackage.ORDER_CONSTRAINT_TYPE:
            return convertOrderConstraintTypeToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public AttributeAssignment createAttributeAssignment ()
   {
      AttributeAssignmentImpl attributeAssignment = new AttributeAssignmentImpl();
      return attributeAssignment;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable createObjectVariable ()
   {
      ObjectVariableImpl objectVariable = new ObjectVariableImpl();
      return objectVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LinkOrderConstraint createLinkOrderConstraint ()
   {
      LinkOrderConstraintImpl linkOrderConstraint = new LinkOrderConstraintImpl();
      return linkOrderConstraint;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Constraint createConstraint ()
   {
      ConstraintImpl constraint = new ConstraintImpl();
      return constraint;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Path createPath ()
   {
      PathImpl path = new PathImpl();
      return path;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LinkVariable createLinkVariable ()
   {
      LinkVariableImpl linkVariable = new LinkVariableImpl();
      return linkVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ContainmentRelation createContainmentRelation ()
   {
      ContainmentRelationImpl containmentRelation = new ContainmentRelationImpl();
      return containmentRelation;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public MatchingPattern createMatchingPattern ()
   {
      MatchingPatternImpl matchingPattern = new MatchingPatternImpl();
      return matchingPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectSetVariable createObjectSetVariable ()
   {
      ObjectSetVariableImpl objectSetVariable = new ObjectSetVariableImpl();
      return objectSetVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern createStoryPattern ()
   {
      StoryPatternImpl storyPattern = new StoryPatternImpl();
      return storyPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingState createBindingStateFromString (EDataType eDataType, String initialValue)
   {
      BindingState result = BindingState.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertBindingStateToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingSemantics createBindingSemanticsFromString (EDataType eDataType, String initialValue)
   {
      BindingSemantics result = BindingSemantics.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertBindingSemanticsToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertModifierToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public OrderConstraintType createOrderConstraintTypeFromString (EDataType eDataType, String initialValue)
   {
      OrderConstraintType result = OrderConstraintType.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertOrderConstraintTypeToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsPackage getPatternsPackage ()
   {
      return (PatternsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static PatternsPackage getPackage ()
   {
      return PatternsPackage.eINSTANCE;
   }

} // PatternsFactoryImpl
