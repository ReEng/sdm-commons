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
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.ContainmentRelation;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.LinkConstraintType;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.Path;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.patterns.util.PatternsValidator;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass attributeAssignmentEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass objectVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass abstractLinkVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass linkConstraintEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass constraintEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass pathEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass linkVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass containmentRelationEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass matchingPatternEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass objectSetVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass storyPatternEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum bindingStateEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum bindingSemanticsEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum bindingOperatorEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum linkConstraintTypeEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the
    * registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
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
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * <p>
    * This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access
    * that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PatternsPackage init ()
   {
      if (isInited)
      {
         return (PatternsPackage) EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
      }

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
    * 
    * @generated
    */
   public EClass getAttributeAssignment ()
   {
      return this.attributeAssignmentEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAttributeAssignment_ObjectVariable ()
   {
      return (EReference) this.attributeAssignmentEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAttributeAssignment_Attribute ()
   {
      return (EReference) this.attributeAssignmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAttributeAssignment_ValueExpression ()
   {
      return (EReference) this.attributeAssignmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getObjectVariable ()
   {
      return this.objectVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObjectVariable_BindingState ()
   {
      return (EAttribute) this.objectVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObjectVariable_BindingSemantics ()
   {
      return (EAttribute) this.objectVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObjectVariable_BindingOperator ()
   {
      return (EAttribute) this.objectVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_Pattern ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_OutgoingLink ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_IncomingLink ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_LinkOrderConstraint ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_Classifier ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_BindingExpression ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_Constraint ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectVariable_AttributeAssignment ()
   {
      return (EReference) this.objectVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getAbstractLinkVariable ()
   {
      return this.abstractLinkVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingSemantics ()
   {
      return (EAttribute) this.abstractLinkVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingOperator ()
   {
      return (EAttribute) this.abstractLinkVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAbstractLinkVariable_Target ()
   {
      return (EReference) this.abstractLinkVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAbstractLinkVariable_SecondLinkOrderConstraint ()
   {
      return (EReference) this.abstractLinkVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAbstractLinkVariable_FirstLinkOrderConstraint ()
   {
      return (EReference) this.abstractLinkVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getAbstractLinkVariable_BindingState ()
   {
      return (EAttribute) this.abstractLinkVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAbstractLinkVariable_Pattern ()
   {
      return (EReference) this.abstractLinkVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAbstractLinkVariable_Source ()
   {
      return (EReference) this.abstractLinkVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getLinkConstraint ()
   {
      return this.linkConstraintEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getLinkConstraint_Index ()
   {
      return (EAttribute) this.linkConstraintEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getLinkConstraint_ConstraintType ()
   {
      return (EAttribute) this.linkConstraintEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getLinkConstraint_Negative ()
   {
      return (EAttribute) this.linkConstraintEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLinkConstraint_FirstLink ()
   {
      return (EReference) this.linkConstraintEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLinkConstraint_ReferencingObject ()
   {
      return (EReference) this.linkConstraintEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLinkConstraint_SecondLink ()
   {
      return (EReference) this.linkConstraintEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getConstraint ()
   {
      return this.constraintEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getConstraint_ConstraintExpression ()
   {
      return (EReference) this.constraintEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getConstraint_Pattern ()
   {
      return (EReference) this.constraintEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getConstraint_ObjectVariable ()
   {
      return (EReference) this.constraintEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getPath ()
   {
      return this.pathEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getPath_PathExpression ()
   {
      return (EReference) this.pathEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getLinkVariable ()
   {
      return this.linkVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLinkVariable_SourceEnd ()
   {
      return (EReference) this.linkVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLinkVariable_TargetEnd ()
   {
      return (EReference) this.linkVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLinkVariable_QualifierExpression ()
   {
      return (EReference) this.linkVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getContainmentRelation ()
   {
      return this.containmentRelationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMatchingPattern ()
   {
      return this.matchingPatternEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map ()
   {
      return this.matchingPatternEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getObjectSetVariable ()
   {
      return this.objectSetVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStoryPattern ()
   {
      return this.storyPatternEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryPattern_ObjectVariable ()
   {
      return (EReference) this.storyPatternEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryPattern_LinkVariable ()
   {
      return (EReference) this.storyPatternEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryPattern_Constraint ()
   {
      return (EReference) this.storyPatternEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryPattern_ParentPattern ()
   {
      return (EReference) this.storyPatternEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryPattern_ContainedPattern ()
   {
      return (EReference) this.storyPatternEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getStoryPattern_BindingSemantics ()
   {
      return (EAttribute) this.storyPatternEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryPattern_TemplateSignature ()
   {
      return (EReference) this.storyPatternEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getBindingState ()
   {
      return this.bindingStateEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getBindingSemantics ()
   {
      return this.bindingSemanticsEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getBindingOperator ()
   {
      return this.bindingOperatorEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getLinkConstraintType ()
   {
      return this.linkConstraintTypeEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public PatternsFactory getPatternsFactory ()
   {
      return (PatternsFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents ()
   {
      if (this.isCreated)
      {
         return;
      }
      this.isCreated = true;

      // Create classes and their features
      this.objectVariableEClass = createEClass(OBJECT_VARIABLE);
      createEAttribute(this.objectVariableEClass, OBJECT_VARIABLE__BINDING_STATE);
      createEAttribute(this.objectVariableEClass, OBJECT_VARIABLE__BINDING_SEMANTICS);
      createEAttribute(this.objectVariableEClass, OBJECT_VARIABLE__BINDING_OPERATOR);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__PATTERN);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__OUTGOING_LINK);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__INCOMING_LINK);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__CLASSIFIER);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__BINDING_EXPRESSION);
      createEReference(this.objectVariableEClass, OBJECT_VARIABLE__CONSTRAINT);

      this.attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
      createEReference(this.attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);
      createEReference(this.attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION);
      createEReference(this.attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);

      this.abstractLinkVariableEClass = createEClass(ABSTRACT_LINK_VARIABLE);
      createEAttribute(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS);
      createEAttribute(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR);
      createEReference(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__TARGET);
      createEReference(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT);
      createEReference(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT);
      createEAttribute(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_STATE);
      createEReference(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__PATTERN);
      createEReference(this.abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SOURCE);

      this.linkConstraintEClass = createEClass(LINK_CONSTRAINT);
      createEAttribute(this.linkConstraintEClass, LINK_CONSTRAINT__INDEX);
      createEAttribute(this.linkConstraintEClass, LINK_CONSTRAINT__CONSTRAINT_TYPE);
      createEAttribute(this.linkConstraintEClass, LINK_CONSTRAINT__NEGATIVE);
      createEReference(this.linkConstraintEClass, LINK_CONSTRAINT__FIRST_LINK);
      createEReference(this.linkConstraintEClass, LINK_CONSTRAINT__REFERENCING_OBJECT);
      createEReference(this.linkConstraintEClass, LINK_CONSTRAINT__SECOND_LINK);

      this.constraintEClass = createEClass(CONSTRAINT);
      createEReference(this.constraintEClass, CONSTRAINT__CONSTRAINT_EXPRESSION);
      createEReference(this.constraintEClass, CONSTRAINT__PATTERN);
      createEReference(this.constraintEClass, CONSTRAINT__OBJECT_VARIABLE);

      this.objectSetVariableEClass = createEClass(OBJECT_SET_VARIABLE);

      this.pathEClass = createEClass(PATH);
      createEReference(this.pathEClass, PATH__PATH_EXPRESSION);

      this.linkVariableEClass = createEClass(LINK_VARIABLE);
      createEReference(this.linkVariableEClass, LINK_VARIABLE__SOURCE_END);
      createEReference(this.linkVariableEClass, LINK_VARIABLE__TARGET_END);
      createEReference(this.linkVariableEClass, LINK_VARIABLE__QUALIFIER_EXPRESSION);

      this.containmentRelationEClass = createEClass(CONTAINMENT_RELATION);

      this.matchingPatternEClass = createEClass(MATCHING_PATTERN);
      createEOperation(this.matchingPatternEClass,
         MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP);

      this.storyPatternEClass = createEClass(STORY_PATTERN);
      createEReference(this.storyPatternEClass, STORY_PATTERN__OBJECT_VARIABLE);
      createEReference(this.storyPatternEClass, STORY_PATTERN__LINK_VARIABLE);
      createEReference(this.storyPatternEClass, STORY_PATTERN__CONSTRAINT);
      createEReference(this.storyPatternEClass, STORY_PATTERN__PARENT_PATTERN);
      createEReference(this.storyPatternEClass, STORY_PATTERN__CONTAINED_PATTERN);
      createEAttribute(this.storyPatternEClass, STORY_PATTERN__BINDING_SEMANTICS);
      createEReference(this.storyPatternEClass, STORY_PATTERN__TEMPLATE_SIGNATURE);

      // Create enums
      this.bindingStateEEnum = createEEnum(BINDING_STATE);
      this.bindingSemanticsEEnum = createEEnum(BINDING_SEMANTICS);
      this.bindingOperatorEEnum = createEEnum(BINDING_OPERATOR);
      this.linkConstraintTypeEEnum = createEEnum(LINK_CONSTRAINT_TYPE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents ()
   {
      if (this.isInitialized)
      {
         return;
      }
      this.isInitialized = true;

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
      this.objectVariableEClass.getESuperTypes().add(theSDMPackage.getVariable());
      this.objectVariableEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      this.abstractLinkVariableEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      this.linkConstraintEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      this.objectSetVariableEClass.getESuperTypes().add(getObjectVariable());
      this.pathEClass.getESuperTypes().add(getAbstractLinkVariable());
      this.linkVariableEClass.getESuperTypes().add(getAbstractLinkVariable());
      this.containmentRelationEClass.getESuperTypes().add(getAbstractLinkVariable());
      this.matchingPatternEClass.getESuperTypes().add(getStoryPattern());
      this.storyPatternEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());

      // Initialize classes, features, and operations; add parameters
      initEClass(this.objectVariableEClass, ObjectVariable.class, "ObjectVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getObjectVariable_BindingState(), getBindingState(), "bindingState", "UNBOUND", 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectVariable_BindingSemantics(), getBindingSemantics(), "bindingSemantics", "MANDATORY", 1,
         1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectVariable_BindingOperator(), getBindingOperator(), "bindingOperator", "CHECK", 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_Pattern(), getStoryPattern(), getStoryPattern_ObjectVariable(), "pattern", null,
         1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_AttributeAssignment(), getAttributeAssignment(),
         getAttributeAssignment_ObjectVariable(), "attributeAssignment", null, 0, -1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectVariable_OutgoingLink(), getAbstractLinkVariable(), getAbstractLinkVariable_Source(),
         "outgoingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_IncomingLink(), getAbstractLinkVariable(), getAbstractLinkVariable_Target(),
         "incomingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_LinkOrderConstraint(), getLinkConstraint(),
         getLinkConstraint_ReferencingObject(), "linkOrderConstraint", null, 0, -1, ObjectVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectVariable_Classifier(), theEcorePackage.getEClass(), null, "classifier", null, 1, 1,
         ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_BindingExpression(), theExpressionsPackage_1.getExpression(), null,
         "bindingExpression", null, 0, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectVariable_Constraint(), getConstraint(), getConstraint_ObjectVariable(), "constraint",
         null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(this.attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAttributeAssignment_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1,
         1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeAssignment_ValueExpression(), theExpressionsPackage_1.getExpression(), null,
         "valueExpression", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeAssignment_ObjectVariable(), getObjectVariable(),
         getObjectVariable_AttributeAssignment(), "objectVariable", null, 1, 1, AttributeAssignment.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(this.abstractLinkVariableEClass, AbstractLinkVariable.class, "AbstractLinkVariable", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAbstractLinkVariable_BindingSemantics(), getBindingSemantics(), "bindingSemantics",
         "MANDATORY", 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractLinkVariable_BindingOperator(), getBindingOperator(), "bindingOperator", "CHECK", 1, 1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Target(), getObjectVariable(), getObjectVariable_IncomingLink(), "target",
         null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_SecondLinkOrderConstraint(), getLinkConstraint(),
         getLinkConstraint_SecondLink(), "secondLinkOrderConstraint", null, 0, -1, AbstractLinkVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_FirstLinkOrderConstraint(), getLinkConstraint(),
         getLinkConstraint_FirstLink(), "firstLinkOrderConstraint", null, 0, -1, AbstractLinkVariable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbstractLinkVariable_BindingState(), getBindingState(), "bindingState", null, 1, 1,
         AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Pattern(), getStoryPattern(), getStoryPattern_LinkVariable(), "pattern",
         null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractLinkVariable_Source(), getObjectVariable(), getObjectVariable_OutgoingLink(), "source",
         null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.linkConstraintEClass, LinkConstraint.class, "LinkConstraint", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLinkConstraint_Index(), this.ecorePackage.getEInt(), "index", null, 1, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLinkConstraint_ConstraintType(), getLinkConstraintType(), "constraintType", "DIRECT_SUCCESSOR",
         1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLinkConstraint_Negative(), this.ecorePackage.getEBoolean(), "negative", null, 1, 1,
         LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkConstraint_FirstLink(), getAbstractLinkVariable(),
         getAbstractLinkVariable_FirstLinkOrderConstraint(), "firstLink", null, 1, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkConstraint_ReferencingObject(), getObjectVariable(),
         getObjectVariable_LinkOrderConstraint(), "referencingObject", null, 1, 1, LinkConstraint.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getLinkConstraint_SecondLink(), getAbstractLinkVariable(),
         getAbstractLinkVariable_SecondLinkOrderConstraint(), "secondLink", null, 0, 1, LinkConstraint.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(this.constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getConstraint_ConstraintExpression(), theExpressionsPackage_1.getExpression(), null,
         "constraintExpression", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConstraint_Pattern(), getStoryPattern(), getStoryPattern_Constraint(), "pattern", null, 0, 1,
         Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConstraint_ObjectVariable(), getObjectVariable(), getObjectVariable_Constraint(),
         "objectVariable", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.objectSetVariableEClass, ObjectSetVariable.class, "ObjectSetVariable", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(this.pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPath_PathExpression(), theExpressionsPackage_1.getExpression(), null, "pathExpression", null,
         1, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.linkVariableEClass, LinkVariable.class, "LinkVariable", !IS_ABSTRACT, !IS_INTERFACE,
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

      initEClass(this.containmentRelationEClass, ContainmentRelation.class, "ContainmentRelation", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(this.matchingPatternEClass, MatchingPattern.class, "MatchingPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      EOperation op = initEOperation(getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(),
         this.ecorePackage.getEBoolean(), "NoModifierInMatchingPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(this.ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(this.ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(this.ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(this.storyPatternEClass, StoryPattern.class, "StoryPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStoryPattern_ObjectVariable(), getObjectVariable(), getObjectVariable_Pattern(),
         "objectVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_LinkVariable(), getAbstractLinkVariable(), getAbstractLinkVariable_Pattern(),
         "linkVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getStoryPattern_Constraint(), getConstraint(), getConstraint_Pattern(), "constraint", null, 0, -1,
         StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_ParentPattern(), getStoryPattern(), getStoryPattern_ContainedPattern(),
         "parentPattern", null, 0, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_ContainedPattern(), getStoryPattern(), getStoryPattern_ParentPattern(),
         "containedPattern", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getStoryPattern_BindingSemantics(), getBindingSemantics(), "bindingSemantics", "MANDATORY", 1, 1,
         StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryPattern_TemplateSignature(), theTemplatesPackage.getTemplateSignature(),
         theTemplatesPackage.getTemplateSignature_Pattern(), "templateSignature", null, 0, 1, StoryPattern.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(this.bindingStateEEnum, BindingState.class, "BindingState");
      addEEnumLiteral(this.bindingStateEEnum, BindingState.UNBOUND);
      addEEnumLiteral(this.bindingStateEEnum, BindingState.BOUND);
      addEEnumLiteral(this.bindingStateEEnum, BindingState.MAYBE_BOUND);

      initEEnum(this.bindingSemanticsEEnum, BindingSemantics.class, "BindingSemantics");
      addEEnumLiteral(this.bindingSemanticsEEnum, BindingSemantics.MANDATORY);
      addEEnumLiteral(this.bindingSemanticsEEnum, BindingSemantics.NEGATIVE);
      addEEnumLiteral(this.bindingSemanticsEEnum, BindingSemantics.OPTIONAL);

      initEEnum(this.bindingOperatorEEnum, BindingOperator.class, "BindingOperator");
      addEEnumLiteral(this.bindingOperatorEEnum, BindingOperator.CHECK);
      addEEnumLiteral(this.bindingOperatorEEnum, BindingOperator.CREATE);
      addEEnumLiteral(this.bindingOperatorEEnum, BindingOperator.DESTROY);

      initEEnum(this.linkConstraintTypeEEnum, LinkConstraintType.class, "LinkConstraintType");
      addEEnumLiteral(this.linkConstraintTypeEEnum, LinkConstraintType.FIRST);
      addEEnumLiteral(this.linkConstraintTypeEEnum, LinkConstraintType.LAST);
      addEEnumLiteral(this.linkConstraintTypeEEnum, LinkConstraintType.DIRECT_SUCCESSOR);
      addEEnumLiteral(this.linkConstraintTypeEEnum, LinkConstraintType.INDIRECT_SUCCESSOR);
      addEEnumLiteral(this.linkConstraintTypeEEnum, LinkConstraintType.INDEX);

      // Create annotations
      // subsets
      createSubsetsAnnotations();
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
   }

   /**
    * Initializes the annotations for <b>subsets</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createSubsetsAnnotations ()
   {
      String source = "subsets";
      addAnnotation(getObjectVariable_Classifier(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//TypedElement/type")});
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createGenModelAnnotations ()
   {
      String source = "http://www.eclipse.org/emf/2002/GenModel";
      addAnnotation(
         this.bindingStateEEnum.getELiterals().get(2),
         source,
         new String[] {
               "documentation",
               "MAYBE_BOUND: unknown whether the variable is bound or not. If the variable is not bound, an object is matched and bound to the variable. If it is already bound, it is not altered. If the variable is still unbound after this process, the matching fails (except for OPTIONAL variables)."});
      addAnnotation(
         this.objectSetVariableEClass,
         source,
         new String[] {
               "documentation",
               "Represents a set of objects.\r\nThe context for contained Constraints and AttributeAssignments is a single object (e.g., \"name = \'abc\'\").\r\nAfter the set has been computed by the pattern matching, every other Constraints or AttributeAssignment can use the ObjectSetVariable as a set (e.g., \"osv1->size()\")."});
      addAnnotation(
         this.containmentRelationEClass,
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
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
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
