/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
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
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass attributeExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass linkEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass multiLinkEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass objectPatternEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass storyNodeEClass = null;

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
   private EClass objectEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum operatorEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum boundTypeEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum constraintEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum modifierEEnum = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum multiLinkTypeEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the
    * registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.storydriven.modeling.pattern.PatternPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private PatternPackageImpl ()
   {
      super(eNS_URI, PatternFactory.eINSTANCE);
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
    * This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that
    * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PatternPackage init ()
   {
      if (isInited)
      {
         return (PatternPackage) EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
      }

      // Obtain or create and register package
      PatternPackageImpl thePatternPackage = (PatternPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) : SDMPackage.eINSTANCE);
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      thePatternPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      thePatternPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      thePatternPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
      return thePatternPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getAttributeExpression ()
   {
      return this.attributeExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getAttributeExpression_Operator ()
   {
      return (EAttribute) this.attributeExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAttributeExpression_OwningObject ()
   {
      return (EReference) this.attributeExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAttributeExpression_Attribute ()
   {
      return (EReference) this.attributeExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAttributeExpression_Value ()
   {
      return (EReference) this.attributeExpressionEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getLink ()
   {
      return this.linkEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getLink_Constraint ()
   {
      return (EAttribute) this.linkEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getLink_Modifier ()
   {
      return (EAttribute) this.linkEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_Target ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_Source ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_MultiLinkToTarget ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_MultiLinkFromSource ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_SourceEnd ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_TargetEnd ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getLink_RangeExpression ()
   {
      return (EReference) this.linkEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMultiLink ()
   {
      return this.multiLinkEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMultiLink_Index ()
   {
      return (EAttribute) this.multiLinkEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMultiLink_MultiLinkType ()
   {
      return (EAttribute) this.multiLinkEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMultiLink_Negative ()
   {
      return (EAttribute) this.multiLinkEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getMultiLink_SourceLink ()
   {
      return (EReference) this.multiLinkEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getMultiLink_TargetObject ()
   {
      return (EReference) this.multiLinkEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getMultiLink_TargetLink ()
   {
      return (EReference) this.multiLinkEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getObjectPattern ()
   {
      return this.objectPatternEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectPattern_OwnedObjects ()
   {
      return (EReference) this.objectPatternEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectPattern_Statement ()
   {
      return (EReference) this.objectPatternEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectPattern_OwningNode ()
   {
      return (EReference) this.objectPatternEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectPattern_OwningPattern ()
   {
      return (EReference) this.objectPatternEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectPattern_OwnedPattern ()
   {
      return (EReference) this.objectPatternEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObjectPattern_Constraint ()
   {
      return (EAttribute) this.objectPatternEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObjectPattern_ConstraintExpression ()
   {
      return (EReference) this.objectPatternEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStoryNode ()
   {
      return this.storyNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getStoryNode_ForEach ()
   {
      return (EAttribute) this.storyNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryNode_OwnedPattern ()
   {
      return (EReference) this.storyNodeEClass.getEStructuralFeatures().get(1);
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
   public EClass getObject ()
   {
      return this.objectEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_OwnedAttributeExpression ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_LinkToSource ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_LinkToTarget ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_Pattern ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObject_Bound ()
   {
      return (EAttribute) this.objectEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObject_Constraint ()
   {
      return (EAttribute) this.objectEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getObject_Modifier ()
   {
      return (EAttribute) this.objectEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_Classifier ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_BindingExpression ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_ReceivedCollaboration ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getObject_SentCollaboration ()
   {
      return (EReference) this.objectEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getOperator ()
   {
      return this.operatorEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getBoundType ()
   {
      return this.boundTypeEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getConstraint ()
   {
      return this.constraintEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getModifier ()
   {
      return this.modifierEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getMultiLinkType ()
   {
      return this.multiLinkTypeEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public PatternFactory getPatternFactory ()
   {
      return (PatternFactory) getEFactoryInstance();
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
      this.attributeExpressionEClass = createEClass(ATTRIBUTE_EXPRESSION);
      createEAttribute(this.attributeExpressionEClass, ATTRIBUTE_EXPRESSION__OPERATOR);
      createEReference(this.attributeExpressionEClass, ATTRIBUTE_EXPRESSION__OWNING_OBJECT);
      createEReference(this.attributeExpressionEClass, ATTRIBUTE_EXPRESSION__ATTRIBUTE);
      createEReference(this.attributeExpressionEClass, ATTRIBUTE_EXPRESSION__VALUE);

      this.linkEClass = createEClass(LINK);
      createEAttribute(this.linkEClass, LINK__CONSTRAINT);
      createEAttribute(this.linkEClass, LINK__MODIFIER);
      createEReference(this.linkEClass, LINK__TARGET);
      createEReference(this.linkEClass, LINK__SOURCE);
      createEReference(this.linkEClass, LINK__MULTI_LINK_TO_TARGET);
      createEReference(this.linkEClass, LINK__MULTI_LINK_FROM_SOURCE);
      createEReference(this.linkEClass, LINK__SOURCE_END);
      createEReference(this.linkEClass, LINK__TARGET_END);
      createEReference(this.linkEClass, LINK__RANGE_EXPRESSION);

      this.multiLinkEClass = createEClass(MULTI_LINK);
      createEAttribute(this.multiLinkEClass, MULTI_LINK__INDEX);
      createEAttribute(this.multiLinkEClass, MULTI_LINK__MULTI_LINK_TYPE);
      createEAttribute(this.multiLinkEClass, MULTI_LINK__NEGATIVE);
      createEReference(this.multiLinkEClass, MULTI_LINK__SOURCE_LINK);
      createEReference(this.multiLinkEClass, MULTI_LINK__TARGET_OBJECT);
      createEReference(this.multiLinkEClass, MULTI_LINK__TARGET_LINK);

      this.objectPatternEClass = createEClass(OBJECT_PATTERN);
      createEReference(this.objectPatternEClass, OBJECT_PATTERN__OWNED_OBJECTS);
      createEReference(this.objectPatternEClass, OBJECT_PATTERN__STATEMENT);
      createEReference(this.objectPatternEClass, OBJECT_PATTERN__OWNING_NODE);
      createEReference(this.objectPatternEClass, OBJECT_PATTERN__OWNING_PATTERN);
      createEReference(this.objectPatternEClass, OBJECT_PATTERN__OWNED_PATTERN);
      createEAttribute(this.objectPatternEClass, OBJECT_PATTERN__CONSTRAINT);
      createEReference(this.objectPatternEClass, OBJECT_PATTERN__CONSTRAINT_EXPRESSION);

      this.storyNodeEClass = createEClass(STORY_NODE);
      createEAttribute(this.storyNodeEClass, STORY_NODE__FOR_EACH);
      createEReference(this.storyNodeEClass, STORY_NODE__OWNED_PATTERN);

      this.pathEClass = createEClass(PATH);
      createEReference(this.pathEClass, PATH__PATH_EXPRESSION);

      this.objectEClass = createEClass(OBJECT);
      createEReference(this.objectEClass, OBJECT__OWNED_ATTRIBUTE_EXPRESSION);
      createEReference(this.objectEClass, OBJECT__LINK_TO_SOURCE);
      createEReference(this.objectEClass, OBJECT__LINK_TO_TARGET);
      createEReference(this.objectEClass, OBJECT__PATTERN);
      createEAttribute(this.objectEClass, OBJECT__BOUND);
      createEAttribute(this.objectEClass, OBJECT__CONSTRAINT);
      createEAttribute(this.objectEClass, OBJECT__MODIFIER);
      createEReference(this.objectEClass, OBJECT__CLASSIFIER);
      createEReference(this.objectEClass, OBJECT__BINDING_EXPRESSION);
      createEReference(this.objectEClass, OBJECT__RECEIVED_COLLABORATION);
      createEReference(this.objectEClass, OBJECT__SENT_COLLABORATION);

      // Create enums
      this.operatorEEnum = createEEnum(OPERATOR);
      this.boundTypeEEnum = createEEnum(BOUND_TYPE);
      this.constraintEEnum = createEEnum(CONSTRAINT);
      this.modifierEEnum = createEEnum(MODIFIER);
      this.multiLinkTypeEEnum = createEEnum(MULTI_LINK_TYPE);
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
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI);
      ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      this.attributeExpressionEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      this.linkEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      this.multiLinkEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      this.objectPatternEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      this.storyNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());
      this.pathEClass.getESuperTypes().add(getLink());
      this.objectEClass.getESuperTypes().add(theSDMPackage.getTypedElement());
      this.objectEClass.getESuperTypes().add(theSDMPackage.getNamedElement());

      // Initialize classes and features; add operations and parameters
      initEClass(this.attributeExpressionEClass, AttributeExpression.class, "AttributeExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAttributeExpression_Operator(), getOperator(), "operator", "EQUAL", 1, 1,
         AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeExpression_OwningObject(), getObject(), getObject_OwnedAttributeExpression(),
         "owningObject", null, 1, 1, AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeExpression_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1,
         1, AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeExpression_Value(), theSDMPackage.getExpression(), null, "value", null, 0, -1,
         AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLink_Constraint(), getConstraint(), "constraint", "NONE", 1, 1, Link.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLink_Modifier(), getModifier(), "modifier", "NONE", 1, 1, Link.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_Target(), getObject(), getObject_LinkToSource(), "target", null, 1, 1, Link.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_Source(), getObject(), getObject_LinkToTarget(), "source", null, 1, 1, Link.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_MultiLinkToTarget(), getMultiLink(), getMultiLink_TargetLink(), "multiLinkToTarget", null,
         0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_MultiLinkFromSource(), getMultiLink(), getMultiLink_SourceLink(), "multiLinkFromSource",
         null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_SourceEnd(), theEcorePackage.getEReference(), null, "sourceEnd", null, 0, 1, Link.class,
         IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_TargetEnd(), theEcorePackage.getEReference(), null, "targetEnd", null, 0, 1, Link.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_RangeExpression(), theSDMPackage.getExpression(), null, "rangeExpression", null, 0, 1,
         Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.multiLinkEClass, MultiLink.class, "MultiLink", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMultiLink_Index(), this.ecorePackage.getEInt(), "index", null, 1, 1, MultiLink.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getMultiLink_MultiLinkType(), getMultiLinkType(), "multiLinkType", "DIRECT", 1, 1,
         MultiLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEAttribute(getMultiLink_Negative(), this.ecorePackage.getEBoolean(), "negative", null, 1, 1, MultiLink.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getMultiLink_SourceLink(), getLink(), getLink_MultiLinkFromSource(), "sourceLink", null, 1, 1,
         MultiLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getMultiLink_TargetObject(), getObject(), null, "targetObject", null, 0, 1, MultiLink.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getMultiLink_TargetLink(), getLink(), getLink_MultiLinkToTarget(), "targetLink", null, 1, 1,
         MultiLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.objectPatternEClass, ObjectPattern.class, "ObjectPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObjectPattern_OwnedObjects(), getObject(), getObject_Pattern(), "ownedObjects", null, 0, -1,
         ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_Statement(), theSDMPackage.getExpression(), null, "statement", null, 0, -1,
         ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectPattern_OwningNode(), getStoryNode(), getStoryNode_OwnedPattern(), "owningNode", null, 0,
         1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_OwningPattern(), getObjectPattern(), getObjectPattern_OwnedPattern(),
         "owningPattern", null, 0, 1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_OwnedPattern(), getObjectPattern(), getObjectPattern_OwningPattern(),
         "ownedPattern", null, 0, -1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectPattern_Constraint(), getConstraint(), "constraint", "NONE", 1, 1, ObjectPattern.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_ConstraintExpression(), theSDMPackage.getExpression(), null,
         "constraintExpression", null, 0, -1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.storyNodeEClass, StoryNode.class, "StoryNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStoryNode_ForEach(), this.ecorePackage.getEBoolean(), "forEach", null, 1, 1, StoryNode.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryNode_OwnedPattern(), getObjectPattern(), getObjectPattern_OwningNode(), "ownedPattern",
         null, 1, 1, StoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPath_PathExpression(), theSDMPackage.getExpression(), null, "pathExpression", null, 1, 1,
         Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.objectEClass, org.storydriven.modeling.pattern.Object.class, "Object", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObject_OwnedAttributeExpression(), getAttributeExpression(),
         getAttributeExpression_OwningObject(), "ownedAttributeExpression", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_LinkToSource(), getLink(), getLink_Target(), "linkToSource", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_LinkToTarget(), getLink(), getLink_Source(), "linkToTarget", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_Pattern(), getObjectPattern(), getObjectPattern_OwnedObjects(), "pattern", null, 0, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObject_Bound(), getBoundType(), "bound", "UNBOUND", 1, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObject_Constraint(), getConstraint(), "constraint", "NONE", 1, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObject_Modifier(), getModifier(), "modifier", "NONE", 1, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_Classifier(), theEcorePackage.getEClass(), null, "classifier", null, 1, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_BindingExpression(), theSDMPackage.getExpression(), null, "bindingExpression", null, 0,
         1, org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_ReceivedCollaboration(), theExpressionsPackage.getCollaboration(),
         theExpressionsPackage.getCollaboration_Target(), "receivedCollaboration", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_SentCollaboration(), theExpressionsPackage.getCollaboration(),
         theExpressionsPackage.getCollaboration_Source(), "sentCollaboration", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(this.operatorEEnum, Operator.class, "Operator");
      addEEnumLiteral(this.operatorEEnum, Operator.ASSIGN);
      addEEnumLiteral(this.operatorEEnum, Operator.EQUAL);
      addEEnumLiteral(this.operatorEEnum, Operator.NOT_EQUAL);
      addEEnumLiteral(this.operatorEEnum, Operator.LESS);
      addEEnumLiteral(this.operatorEEnum, Operator.GREATER);
      addEEnumLiteral(this.operatorEEnum, Operator.LESS_EQUAL);
      addEEnumLiteral(this.operatorEEnum, Operator.GREATER_EQUAL);

      initEEnum(this.boundTypeEEnum, BoundType.class, "BoundType");
      addEEnumLiteral(this.boundTypeEEnum, BoundType.BOUND);
      addEEnumLiteral(this.boundTypeEEnum, BoundType.UNBOUND);
      addEEnumLiteral(this.boundTypeEEnum, BoundType.MAYBE_BOUND);

      initEEnum(this.constraintEEnum, Constraint.class, "Constraint");
      addEEnumLiteral(this.constraintEEnum, Constraint.NONE);
      addEEnumLiteral(this.constraintEEnum, Constraint.NEGATIVE);
      addEEnumLiteral(this.constraintEEnum, Constraint.OPTIONAL);
      addEEnumLiteral(this.constraintEEnum, Constraint.SET);

      initEEnum(this.modifierEEnum, Modifier.class, "Modifier");
      addEEnumLiteral(this.modifierEEnum, Modifier.NONE);
      addEEnumLiteral(this.modifierEEnum, Modifier.CREATE);
      addEEnumLiteral(this.modifierEEnum, Modifier.DESTROY);

      initEEnum(this.multiLinkTypeEEnum, MultiLinkType.class, "MultiLinkType");
      addEEnumLiteral(this.multiLinkTypeEEnum, MultiLinkType.FIRST);
      addEEnumLiteral(this.multiLinkTypeEEnum, MultiLinkType.LAST);
      addEEnumLiteral(this.multiLinkTypeEEnum, MultiLinkType.DIRECT);
      addEEnumLiteral(this.multiLinkTypeEEnum, MultiLinkType.INDIRECT);
      addEEnumLiteral(this.multiLinkTypeEEnum, MultiLinkType.INDEX);

      // Create annotations
      // redefines
      createRedefinesAnnotations();
   }

   /**
    * Initializes the annotations for <b>redefines</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createRedefinesAnnotations ()
   {
      String source = "redefines";
      addAnnotation(getObject_Classifier(), source, new String[] {}, new URI[] {URI.createURI(SDMPackage.eNS_URI)
         .appendFragment("//TypedElement/type")});
   }

} // PatternPackageImpl
