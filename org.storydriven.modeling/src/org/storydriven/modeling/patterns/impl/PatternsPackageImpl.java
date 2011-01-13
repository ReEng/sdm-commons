/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.expressions.ExpressionsPackage;
import org.storydriven.modeling.activities.expressions.impl.ExpressionsPackageImpl;
import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
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
import org.storydriven.modeling.patterns.util.PatternsValidator;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass attributeAssignmentEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass objectVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractLinkVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass linkOrderConstraintEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass constraintEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass pathEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass linkVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass containmentRelationEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass matchingPatternEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass objectSetVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass storyPatternEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum bindingStateEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum bindingSemanticsEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum modifierEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum orderConstraintTypeEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.storydriven.modeling.patterns.PatternsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private PatternsPackageImpl ()
   {
      super(eNS_URI, PatternsFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PatternsPackage init ()
   {
      if (isInited)
         return (PatternsPackage) EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

      // Obtain or create and register package
      PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternsPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternsPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) : SDMPackage.eINSTANCE);
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
      org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_1 = (org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.expressions.ExpressionsPackage.eINSTANCE);
      CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
      org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.calls.expressions.ExpressionsPackage.eINSTANCE);
      org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_3 = (org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eINSTANCE);
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      thePatternsPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      theExpressionsPackage_1.createPackageContents();
      theCallsPackage.createPackageContents();
      theExpressionsPackage_2.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      thePatternsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theCallsPackage.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
      theExpressionsPackage_3.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put(thePatternsPackage, new EValidator.Descriptor()
      {
         public EValidator getEValidator ()
         {
            return PatternsValidator.INSTANCE;
         }
      });

      // Mark meta-data to indicate it can't be changed
      thePatternsPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
      return thePatternsPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getAttributeAssignment ()
   {
      return attributeAssignmentEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeAssignment_ObjectVariable ()
   {
      return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeAssignment_Attribute ()
   {
      return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeAssignment_ValueExpression ()
   {
      return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectVariable ()
   {
      return objectVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObjectVariable_BindingState ()
   {
      return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObjectVariable_BindingType ()
   {
      return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObjectVariable_Modifier ()
   {
      return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_Pattern ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_OutgoingLink ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_IncomingLink ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_LinkOrderConstraint ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_Classifier ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_BindingExpression ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_Constraint ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectVariable_AttributeAssignment ()
   {
      return (EReference) objectVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractLinkVariable ()
   {
      return abstractLinkVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingType ()
   {
      return (EAttribute) abstractLinkVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractLinkVariable_Modifier ()
   {
      return (EAttribute) abstractLinkVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_Target ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_SecondLinkOrderConstraint ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_FirstLinkOrderConstraint ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingState ()
   {
      return (EAttribute) abstractLinkVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_Pattern ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLinkVariable_Source ()
   {
      return (EReference) abstractLinkVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getLinkOrderConstraint ()
   {
      return linkOrderConstraintEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLinkOrderConstraint_Index ()
   {
      return (EAttribute) linkOrderConstraintEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLinkOrderConstraint_ConstraintType ()
   {
      return (EAttribute) linkOrderConstraintEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLinkOrderConstraint_Negative ()
   {
      return (EAttribute) linkOrderConstraintEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkOrderConstraint_FirstLink ()
   {
      return (EReference) linkOrderConstraintEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkOrderConstraint_ReferencingObject ()
   {
      return (EReference) linkOrderConstraintEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkOrderConstraint_SecondLink ()
   {
      return (EReference) linkOrderConstraintEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getConstraint ()
   {
      return constraintEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getConstraint_ConstraintExpression ()
   {
      return (EReference) constraintEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getConstraint_Pattern ()
   {
      return (EReference) constraintEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getConstraint_ObjectVariable ()
   {
      return (EReference) constraintEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getPath ()
   {
      return pathEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getPath_PathExpression ()
   {
      return (EReference) pathEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getLinkVariable ()
   {
      return linkVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkVariable_SourceEnd ()
   {
      return (EReference) linkVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkVariable_TargetEnd ()
   {
      return (EReference) linkVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkVariable_QualifierExpression ()
   {
      return (EReference) linkVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getContainmentRelation ()
   {
      return containmentRelationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getMatchingPattern ()
   {
      return matchingPatternEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map ()
   {
      return matchingPatternEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectSetVariable ()
   {
      return objectSetVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStoryPattern ()
   {
      return storyPatternEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_ObjectVariable ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_LinkVariable ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_Constraint ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_ParentPattern ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_ContainedPattern ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStoryPattern_BindingType ()
   {
      return (EAttribute) storyPatternEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryPattern_TemplateSignature ()
   {
      return (EReference) storyPatternEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBindingState ()
   {
      return bindingStateEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBindingSemantics ()
   {
      return bindingSemanticsEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getModifier ()
   {
      return modifierEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getOrderConstraintType ()
   {
      return orderConstraintTypeEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsFactory getPatternsFactory ()
   {
      return (PatternsFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents ()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      objectVariableEClass = createEClass(OBJECT_VARIABLE);
      createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_STATE);
      createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_TYPE);
      createEAttribute(objectVariableEClass, OBJECT_VARIABLE__MODIFIER);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__PATTERN);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__OUTGOING_LINK);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__INCOMING_LINK);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__CLASSIFIER);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__BINDING_EXPRESSION);
      createEReference(objectVariableEClass, OBJECT_VARIABLE__CONSTRAINT);

      attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
      createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);
      createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION);
      createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);

      abstractLinkVariableEClass = createEClass(ABSTRACT_LINK_VARIABLE);
      createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_TYPE);
      createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__MODIFIER);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__TARGET);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT);
      createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_STATE);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__PATTERN);
      createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SOURCE);

      linkOrderConstraintEClass = createEClass(LINK_ORDER_CONSTRAINT);
      createEAttribute(linkOrderConstraintEClass, LINK_ORDER_CONSTRAINT__INDEX);
      createEAttribute(linkOrderConstraintEClass, LINK_ORDER_CONSTRAINT__CONSTRAINT_TYPE);
      createEAttribute(linkOrderConstraintEClass, LINK_ORDER_CONSTRAINT__NEGATIVE);
      createEReference(linkOrderConstraintEClass, LINK_ORDER_CONSTRAINT__FIRST_LINK);
      createEReference(linkOrderConstraintEClass, LINK_ORDER_CONSTRAINT__REFERENCING_OBJECT);
      createEReference(linkOrderConstraintEClass, LINK_ORDER_CONSTRAINT__SECOND_LINK);

      constraintEClass = createEClass(CONSTRAINT);
      createEReference(constraintEClass, CONSTRAINT__CONSTRAINT_EXPRESSION);
      createEReference(constraintEClass, CONSTRAINT__PATTERN);
      createEReference(constraintEClass, CONSTRAINT__OBJECT_VARIABLE);

      objectSetVariableEClass = createEClass(OBJECT_SET_VARIABLE);

      pathEClass = createEClass(PATH);
      createEReference(pathEClass, PATH__PATH_EXPRESSION);

      linkVariableEClass = createEClass(LINK_VARIABLE);
      createEReference(linkVariableEClass, LINK_VARIABLE__SOURCE_END);
      createEReference(linkVariableEClass, LINK_VARIABLE__TARGET_END);
      createEReference(linkVariableEClass, LINK_VARIABLE__QUALIFIER_EXPRESSION);

      containmentRelationEClass = createEClass(CONTAINMENT_RELATION);

      matchingPatternEClass = createEClass(MATCHING_PATTERN);
      createEOperation(matchingPatternEClass, MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP);

      storyPatternEClass = createEClass(STORY_PATTERN);
      createEReference(storyPatternEClass, STORY_PATTERN__OBJECT_VARIABLE);
      createEReference(storyPatternEClass, STORY_PATTERN__LINK_VARIABLE);
      createEReference(storyPatternEClass, STORY_PATTERN__CONSTRAINT);
      createEReference(storyPatternEClass, STORY_PATTERN__PARENT_PATTERN);
      createEReference(storyPatternEClass, STORY_PATTERN__CONTAINED_PATTERN);
      createEAttribute(storyPatternEClass, STORY_PATTERN__BINDING_TYPE);
      createEReference(storyPatternEClass, STORY_PATTERN__TEMPLATE_SIGNATURE);

      // Create enums
      bindingStateEEnum = createEEnum(BINDING_STATE);
      bindingSemanticsEEnum = createEEnum(BINDING_SEMANTICS);
      modifierEEnum = createEEnum(MODIFIER);
      orderConstraintTypeEEnum = createEEnum(ORDER_CONSTRAINT_TYPE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @generated
    */
   public void initializePackageContents ()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      org.storydriven.modeling.patterns.expressions.ExpressionsPackage theExpressionsPackage_3 = (org.storydriven.modeling.patterns.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI);
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      org.storydriven.modeling.expressions.ExpressionsPackage theExpressionsPackage_1 = (org.storydriven.modeling.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI);
      TemplatesPackage theTemplatesPackage = (TemplatesPackage) EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theExpressionsPackage_3);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      objectVariableEClass.getESuperTypes().add(theSDMPackage.getVariable());
      objectVariableEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      abstractLinkVariableEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      linkOrderConstraintEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      objectSetVariableEClass.getESuperTypes().add(this.getObjectVariable());
      pathEClass.getESuperTypes().add(this.getAbstractLinkVariable());
      linkVariableEClass.getESuperTypes().add(this.getAbstractLinkVariable());
      containmentRelationEClass.getESuperTypes().add(this.getAbstractLinkVariable());
      matchingPatternEClass.getESuperTypes().add(this.getStoryPattern());
      storyPatternEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());

      // Initialize classes, features, and operations; add parameters
      initEClass(objectVariableEClass, ObjectVariable.class, "ObjectVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getObjectVariable_BindingState(), this.getBindingState(), "bindingState", "UNBOUND", 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectVariable_BindingType(), this.getBindingSemantics(), "bindingType", "NONE", 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectVariable_Modifier(), this.getModifier(), "modifier", "NONE", 1, 1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_ObjectVariable(),
         "pattern", null, 1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_AttributeAssignment(), this.getAttributeAssignment(),
         this.getAttributeAssignment_ObjectVariable(), "attributeAssignment", null, 0, -1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectVariable_OutgoingLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_Source(), "outgoingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getObjectVariable_IncomingLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_Target(), "incomingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getObjectVariable_LinkOrderConstraint(), this.getLinkOrderConstraint(),
         this.getLinkOrderConstraint_ReferencingObject(), "linkOrderConstraint", null, 0, -1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectVariable_Classifier(), theEcorePackage.getEClass(), null, "classifier", null, 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_BindingExpression(), theExpressionsPackage_1.getExpression(), null,
         "bindingExpression", null, 0, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_Constraint(), this.getConstraint(), this.getConstraint_ObjectVariable(),
         "constraint", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAttributeAssignment_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1,
         1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeAssignment_ValueExpression(), theExpressionsPackage_1.getExpression(), null,
         "valueExpression", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeAssignment_ObjectVariable(), this.getObjectVariable(),
         this.getObjectVariable_AttributeAssignment(), "objectVariable", null, 1, 1, AttributeAssignment.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(abstractLinkVariableEClass, AbstractLinkVariable.class, "AbstractLinkVariable", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAbstractLinkVariable_BindingType(), this.getBindingSemantics(), "bindingType", "NONE", 1, 1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractLinkVariable_Modifier(), this.getModifier(), "modifier", "NONE", 1, 1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Target(), this.getObjectVariable(), this.getObjectVariable_IncomingLink(),
         "target", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_SecondLinkOrderConstraint(), this.getLinkOrderConstraint(),
         this.getLinkOrderConstraint_SecondLink(), "secondLinkOrderConstraint", null, 0, -1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_FirstLinkOrderConstraint(), this.getLinkOrderConstraint(),
         this.getLinkOrderConstraint_FirstLink(), "firstLinkOrderConstraint", null, 0, -1, AbstractLinkVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractLinkVariable_BindingState(), this.getBindingState(), "bindingState", null, 1, 1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_LinkVariable(),
         "pattern", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Source(), this.getObjectVariable(), this.getObjectVariable_OutgoingLink(),
         "source", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(linkOrderConstraintEClass, LinkOrderConstraint.class, "LinkOrderConstraint", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLinkOrderConstraint_Index(), ecorePackage.getEInt(), "index", null, 1, 1,
         LinkOrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLinkOrderConstraint_ConstraintType(), this.getOrderConstraintType(), "constraintType",
         "DIRECT", 1, 1, LinkOrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLinkOrderConstraint_Negative(), ecorePackage.getEBoolean(), "negative", null, 1, 1,
         LinkOrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkOrderConstraint_FirstLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_FirstLinkOrderConstraint(), "firstLink", null, 1, 1, LinkOrderConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkOrderConstraint_ReferencingObject(), this.getObjectVariable(),
         this.getObjectVariable_LinkOrderConstraint(), "referencingObject", null, 1, 1, LinkOrderConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkOrderConstraint_SecondLink(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_SecondLinkOrderConstraint(), "secondLink", null, 1, 1, LinkOrderConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getConstraint_ConstraintExpression(), theExpressionsPackage_1.getExpression(), null,
         "constraintExpression", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConstraint_Pattern(), this.getStoryPattern(), this.getStoryPattern_Constraint(), "pattern",
         null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConstraint_ObjectVariable(), this.getObjectVariable(), this.getObjectVariable_Constraint(),
         "objectVariable", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(objectSetVariableEClass, ObjectSetVariable.class, "ObjectSetVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPath_PathExpression(), theExpressionsPackage_1.getExpression(), null, "pathExpression", null,
         1, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(linkVariableEClass, LinkVariable.class, "LinkVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLinkVariable_SourceEnd(), theEcorePackage.getEReference(), null, "sourceEnd", null, 0, 1,
         LinkVariable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkVariable_TargetEnd(), theEcorePackage.getEReference(), null, "targetEnd", null, 1, 1,
         LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkVariable_QualifierExpression(), theExpressionsPackage_1.getExpression(), null,
         "qualifierExpression", null, 0, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(containmentRelationEClass, ContainmentRelation.class, "ContainmentRelation", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(matchingPatternEClass, MatchingPattern.class, "MatchingPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      EOperation op = initEOperation(getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         ecorePackage.getEBoolean(), "NoModifierInMatchingPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(storyPatternEClass, StoryPattern.class, "StoryPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStoryPattern_ObjectVariable(), this.getObjectVariable(), this.getObjectVariable_Pattern(),
         "objectVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_LinkVariable(), this.getAbstractLinkVariable(),
         this.getAbstractLinkVariable_Pattern(), "linkVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEReference(getStoryPattern_Constraint(), this.getConstraint(), this.getConstraint_Pattern(), "constraint",
         null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_ParentPattern(), this.getStoryPattern(), this.getStoryPattern_ContainedPattern(),
         "parentPattern", null, 0, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_ContainedPattern(), this.getStoryPattern(), this.getStoryPattern_ParentPattern(),
         "containedPattern", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getStoryPattern_BindingType(), this.getBindingSemantics(), "bindingType", "NONE", 1, 1,
         StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_TemplateSignature(), theTemplatesPackage.getTemplateSignature(),
         theTemplatesPackage.getTemplateSignature_Pattern(), "templateSignature", null, 0, 1, StoryPattern.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(bindingStateEEnum, BindingState.class, "BindingState");
      addEEnumLiteral(bindingStateEEnum, BindingState.UNBOUND);
      addEEnumLiteral(bindingStateEEnum, BindingState.BOUND);
      addEEnumLiteral(bindingStateEEnum, BindingState.MAYBE_BOUND);

      initEEnum(bindingSemanticsEEnum, BindingSemantics.class, "BindingSemantics");
      addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.NONE);
      addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.NEGATIVE);
      addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.OPTIONAL);

      initEEnum(modifierEEnum, Modifier.class, "Modifier");
      addEEnumLiteral(modifierEEnum, Modifier.NONE);
      addEEnumLiteral(modifierEEnum, Modifier.CREATE);
      addEEnumLiteral(modifierEEnum, Modifier.DESTROY);

      initEEnum(orderConstraintTypeEEnum, OrderConstraintType.class, "OrderConstraintType");
      addEEnumLiteral(orderConstraintTypeEEnum, OrderConstraintType.FIRST);
      addEEnumLiteral(orderConstraintTypeEEnum, OrderConstraintType.LAST);
      addEEnumLiteral(orderConstraintTypeEEnum, OrderConstraintType.DIRECT);
      addEEnumLiteral(orderConstraintTypeEEnum, OrderConstraintType.INDIRECT);
      addEEnumLiteral(orderConstraintTypeEEnum, OrderConstraintType.INDEX);

      // Create annotations
      // subsets
      createSubsetsAnnotations();
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
   }

   /**
    * Initializes the annotations for <b>subsets</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createSubsetsAnnotations ()
   {
      String source = "subsets";
      addAnnotation(getObjectVariable_Classifier(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//TypedElement/type")});
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModelAnnotations ()
   {
      String source = "http://www.eclipse.org/emf/2002/GenModel";
      addAnnotation(
         bindingStateEEnum.getELiterals().get(2),
         source,
         new String[] {
               "documentation",
               "MAYBE_BOUND: unknown whether the variable is bound or not. If the variable is not bound, an object is matched and bound to the variable. If it is already bound, it is not altered. If the variable is still unbound after this process, the matching fails (except for OPTIONAL variables)."});
      addAnnotation(
         objectSetVariableEClass,
         source,
         new String[] {
               "documentation",
               "Represents a set of objects.\r\nThe context for contained Constraints and AttributeAssignments is a single object (e.g., \"name = \'abc\'\").\r\nAfter the set has been computed by the pattern matching, every other Constraints or AttributeAssignment can use the ObjectSetVariable as a set (e.g., \"osv1->size()\")."});
      addAnnotation(
         containmentRelationEClass,
         source,
         new String[] {
               "documentation",
               "Specifies the containment of an object in a set. Will be displayed by a line having a circle with a plus inside at the end of the container. Create modifier specifies that the object will be added to the container, delete that it will be removed, and none that it will be checked to be contained."});
      addAnnotation(
         getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         source,
         new String[] {
               "documentation",
               "self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)"});
      addAnnotation((getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map()).getEParameters().get(0),
         source, new String[] {"documentation", "The chain of diagnostics to which problems are to be appended."});
      addAnnotation((getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map()).getEParameters().get(1),
         source, new String[] {"documentation", "The cache of context-specific information."});
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations ()
   {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
      addAnnotation(
         getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         source,
         new String[] {
               "body",
               "self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)"});
   }

} // PatternsPackageImpl
