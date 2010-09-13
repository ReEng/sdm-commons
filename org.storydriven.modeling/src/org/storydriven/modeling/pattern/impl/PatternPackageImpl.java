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
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass attributeExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass linkEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass multiLinkEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass objectPatternEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass storyNodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pathEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass objectEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum operatorEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum boundTypeEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum constraintEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum modifierEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum multiLinkTypeEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PatternPackage init ()
   {
      if (isInited)
         return (PatternPackage) EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAttributeExpression ()
   {
      return attributeExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAttributeExpression_Operator ()
   {
      return (EAttribute) attributeExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeExpression_OwningObject ()
   {
      return (EReference) attributeExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeExpression_Attribute ()
   {
      return (EReference) attributeExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAttributeExpression_Value ()
   {
      return (EReference) attributeExpressionEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLink ()
   {
      return linkEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLink_Constraint ()
   {
      return (EAttribute) linkEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLink_Modifier ()
   {
      return (EAttribute) linkEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_Target ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_Source ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_MultiLinkToTarget ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_MultiLinkFromSource ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_SourceEnd ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_TargetEnd ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLink_RangeExpression ()
   {
      return (EReference) linkEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getMultiLink ()
   {
      return multiLinkEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getMultiLink_Index ()
   {
      return (EAttribute) multiLinkEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getMultiLink_MultiLinkType ()
   {
      return (EAttribute) multiLinkEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getMultiLink_Negative ()
   {
      return (EAttribute) multiLinkEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getMultiLink_SourceLink ()
   {
      return (EReference) multiLinkEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getMultiLink_TargetObject ()
   {
      return (EReference) multiLinkEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getMultiLink_TargetLink ()
   {
      return (EReference) multiLinkEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectPattern ()
   {
      return objectPatternEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPattern_ContainedObjects ()
   {
      return (EReference) objectPatternEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPattern_Statement ()
   {
      return (EReference) objectPatternEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPattern_ContainingNode ()
   {
      return (EReference) objectPatternEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPattern_ParentPattern ()
   {
      return (EReference) objectPatternEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPattern_ChildPattern ()
   {
      return (EReference) objectPatternEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObjectPattern_Constraint ()
   {
      return (EAttribute) objectPatternEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPattern_ConstraintExpression ()
   {
      return (EReference) objectPatternEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStoryNode ()
   {
      return storyNodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStoryNode_ForEach ()
   {
      return (EAttribute) storyNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryNode_ContainedPattern ()
   {
      return (EReference) storyNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPath ()
   {
      return pathEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPath_PathExpression ()
   {
      return (EReference) pathEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getObject ()
   {
      return objectEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_OwnedAttributeExpression ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_LinkToSource ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_LinkToTarget ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_Pattern ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObject_Bound ()
   {
      return (EAttribute) objectEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObject_Constraint ()
   {
      return (EAttribute) objectEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getObject_Modifier ()
   {
      return (EAttribute) objectEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_Classifier ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_BindingExpression ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_ReceivedCollaboration ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObject_SentCollaboration ()
   {
      return (EReference) objectEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getOperator ()
   {
      return operatorEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBoundType ()
   {
      return boundTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getConstraint ()
   {
      return constraintEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getModifier ()
   {
      return modifierEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getMultiLinkType ()
   {
      return multiLinkTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternFactory getPatternFactory ()
   {
      return (PatternFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents ()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      attributeExpressionEClass = createEClass(ATTRIBUTE_EXPRESSION);
      createEAttribute(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__OPERATOR);
      createEReference(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__OWNING_OBJECT);
      createEReference(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__ATTRIBUTE);
      createEReference(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__VALUE);

      linkEClass = createEClass(LINK);
      createEAttribute(linkEClass, LINK__CONSTRAINT);
      createEAttribute(linkEClass, LINK__MODIFIER);
      createEReference(linkEClass, LINK__TARGET);
      createEReference(linkEClass, LINK__SOURCE);
      createEReference(linkEClass, LINK__MULTI_LINK_TO_TARGET);
      createEReference(linkEClass, LINK__MULTI_LINK_FROM_SOURCE);
      createEReference(linkEClass, LINK__SOURCE_END);
      createEReference(linkEClass, LINK__TARGET_END);
      createEReference(linkEClass, LINK__RANGE_EXPRESSION);

      multiLinkEClass = createEClass(MULTI_LINK);
      createEAttribute(multiLinkEClass, MULTI_LINK__INDEX);
      createEAttribute(multiLinkEClass, MULTI_LINK__MULTI_LINK_TYPE);
      createEAttribute(multiLinkEClass, MULTI_LINK__NEGATIVE);
      createEReference(multiLinkEClass, MULTI_LINK__SOURCE_LINK);
      createEReference(multiLinkEClass, MULTI_LINK__TARGET_OBJECT);
      createEReference(multiLinkEClass, MULTI_LINK__TARGET_LINK);

      objectPatternEClass = createEClass(OBJECT_PATTERN);
      createEReference(objectPatternEClass, OBJECT_PATTERN__CONTAINED_OBJECTS);
      createEReference(objectPatternEClass, OBJECT_PATTERN__STATEMENT);
      createEReference(objectPatternEClass, OBJECT_PATTERN__CONTAINING_NODE);
      createEReference(objectPatternEClass, OBJECT_PATTERN__PARENT_PATTERN);
      createEReference(objectPatternEClass, OBJECT_PATTERN__CHILD_PATTERN);
      createEAttribute(objectPatternEClass, OBJECT_PATTERN__CONSTRAINT);
      createEReference(objectPatternEClass, OBJECT_PATTERN__CONSTRAINT_EXPRESSION);

      storyNodeEClass = createEClass(STORY_NODE);
      createEAttribute(storyNodeEClass, STORY_NODE__FOR_EACH);
      createEReference(storyNodeEClass, STORY_NODE__CONTAINED_PATTERN);

      pathEClass = createEClass(PATH);
      createEReference(pathEClass, PATH__PATH_EXPRESSION);

      objectEClass = createEClass(OBJECT);
      createEReference(objectEClass, OBJECT__OWNED_ATTRIBUTE_EXPRESSION);
      createEReference(objectEClass, OBJECT__LINK_TO_SOURCE);
      createEReference(objectEClass, OBJECT__LINK_TO_TARGET);
      createEReference(objectEClass, OBJECT__PATTERN);
      createEAttribute(objectEClass, OBJECT__BOUND);
      createEAttribute(objectEClass, OBJECT__CONSTRAINT);
      createEAttribute(objectEClass, OBJECT__MODIFIER);
      createEReference(objectEClass, OBJECT__CLASSIFIER);
      createEReference(objectEClass, OBJECT__BINDING_EXPRESSION);
      createEReference(objectEClass, OBJECT__RECEIVED_COLLABORATION);
      createEReference(objectEClass, OBJECT__SENT_COLLABORATION);

      // Create enums
      operatorEEnum = createEEnum(OPERATOR);
      boundTypeEEnum = createEEnum(BOUND_TYPE);
      constraintEEnum = createEEnum(CONSTRAINT);
      modifierEEnum = createEEnum(MODIFIER);
      multiLinkTypeEEnum = createEEnum(MULTI_LINK_TYPE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
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
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI);
      ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      attributeExpressionEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      linkEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      multiLinkEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      objectPatternEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      storyNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());
      pathEClass.getESuperTypes().add(this.getLink());
      objectEClass.getESuperTypes().add(theSDMPackage.getTypedElement());
      objectEClass.getESuperTypes().add(theSDMPackage.getNamedElement());

      // Initialize classes and features; add operations and parameters
      initEClass(attributeExpressionEClass, AttributeExpression.class, "AttributeExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAttributeExpression_Operator(), this.getOperator(), "operator", "EQUAL", 1, 1,
         AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeExpression_OwningObject(), this.getObject(),
         this.getObject_OwnedAttributeExpression(), "owningObject", null, 1, 1, AttributeExpression.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeExpression_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1,
         1, AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAttributeExpression_Value(), theSDMPackage.getExpression(), null, "value", null, 0, -1,
         AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLink_Constraint(), this.getConstraint(), "constraint", "NONE", 1, 1, Link.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getLink_Modifier(), this.getModifier(), "modifier", "NONE", 1, 1, Link.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_Target(), this.getObject(), this.getObject_LinkToSource(), "target", null, 1, 1,
         Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_Source(), this.getObject(), this.getObject_LinkToTarget(), "source", null, 1, 1,
         Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_MultiLinkToTarget(), this.getMultiLink(), this.getMultiLink_TargetLink(),
         "multiLinkToTarget", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_MultiLinkFromSource(), this.getMultiLink(), this.getMultiLink_SourceLink(),
         "multiLinkFromSource", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_SourceEnd(), theEcorePackage.getEReference(), null, "sourceEnd", null, 0, 1, Link.class,
         IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_TargetEnd(), theEcorePackage.getEReference(), null, "targetEnd", null, 0, 1, Link.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getLink_RangeExpression(), theSDMPackage.getExpression(), null, "rangeExpression", null, 0, 1,
         Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(multiLinkEClass, MultiLink.class, "MultiLink", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMultiLink_Index(), ecorePackage.getEInt(), "index", null, 1, 1, MultiLink.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getMultiLink_MultiLinkType(), this.getMultiLinkType(), "multiLinkType", "DIRECT", 1, 1,
         MultiLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEAttribute(getMultiLink_Negative(), ecorePackage.getEBoolean(), "negative", null, 1, 1, MultiLink.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getMultiLink_SourceLink(), this.getLink(), this.getLink_MultiLinkFromSource(), "sourceLink", null,
         1, 1, MultiLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getMultiLink_TargetObject(), this.getObject(), null, "targetObject", null, 0, 1, MultiLink.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getMultiLink_TargetLink(), this.getLink(), this.getLink_MultiLinkToTarget(), "targetLink", null,
         1, 1, MultiLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(objectPatternEClass, ObjectPattern.class, "ObjectPattern", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObjectPattern_ContainedObjects(), this.getObject(), this.getObject_Pattern(),
         "containedObjects", null, 0, -1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_Statement(), theSDMPackage.getExpression(), null, "statement", null, 0, -1,
         ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getObjectPattern_ContainingNode(), this.getStoryNode(), this.getStoryNode_ContainedPattern(),
         "containingNode", null, 0, 1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_ParentPattern(), this.getObjectPattern(), this.getObjectPattern_ChildPattern(),
         "parentPattern", null, 0, 1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_ChildPattern(), this.getObjectPattern(), this.getObjectPattern_ParentPattern(),
         "childPattern", null, 0, -1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObjectPattern_Constraint(), this.getConstraint(), "constraint", "NONE", 1, 1,
         ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPattern_ConstraintExpression(), theSDMPackage.getExpression(), null,
         "constraintExpression", null, 0, -1, ObjectPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(storyNodeEClass, StoryNode.class, "StoryNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStoryNode_ForEach(), ecorePackage.getEBoolean(), "forEach", null, 1, 1, StoryNode.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryNode_ContainedPattern(), this.getObjectPattern(), this.getObjectPattern_ContainingNode(),
         "containedPattern", null, 1, 1, StoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPath_PathExpression(), theSDMPackage.getExpression(), null, "pathExpression", null, 1, 1,
         Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(objectEClass, org.storydriven.modeling.pattern.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObject_OwnedAttributeExpression(), this.getAttributeExpression(),
         this.getAttributeExpression_OwningObject(), "ownedAttributeExpression", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_LinkToSource(), this.getLink(), this.getLink_Target(), "linkToSource", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_LinkToTarget(), this.getLink(), this.getLink_Source(), "linkToTarget", null, 0, -1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObject_Pattern(), this.getObjectPattern(), this.getObjectPattern_ContainedObjects(), "pattern",
         null, 0, 1, org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObject_Bound(), this.getBoundType(), "bound", "UNBOUND", 1, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObject_Constraint(), this.getConstraint(), "constraint", "NONE", 1, 1,
         org.storydriven.modeling.pattern.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getObject_Modifier(), this.getModifier(), "modifier", "NONE", 1, 1,
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
      initEEnum(operatorEEnum, Operator.class, "Operator");
      addEEnumLiteral(operatorEEnum, Operator.ASSIGN);
      addEEnumLiteral(operatorEEnum, Operator.EQUAL);
      addEEnumLiteral(operatorEEnum, Operator.NOT_EQUAL);
      addEEnumLiteral(operatorEEnum, Operator.LESS);
      addEEnumLiteral(operatorEEnum, Operator.GREATER);
      addEEnumLiteral(operatorEEnum, Operator.LESS_EQUAL);
      addEEnumLiteral(operatorEEnum, Operator.GREATER_EQUAL);

      initEEnum(boundTypeEEnum, BoundType.class, "BoundType");
      addEEnumLiteral(boundTypeEEnum, BoundType.BOUND);
      addEEnumLiteral(boundTypeEEnum, BoundType.UNBOUND);
      addEEnumLiteral(boundTypeEEnum, BoundType.MAYBE_BOUND);

      initEEnum(constraintEEnum, Constraint.class, "Constraint");
      addEEnumLiteral(constraintEEnum, Constraint.NONE);
      addEEnumLiteral(constraintEEnum, Constraint.NEGATIVE);
      addEEnumLiteral(constraintEEnum, Constraint.OPTIONAL);
      addEEnumLiteral(constraintEEnum, Constraint.SET);

      initEEnum(modifierEEnum, Modifier.class, "Modifier");
      addEEnumLiteral(modifierEEnum, Modifier.NONE);
      addEEnumLiteral(modifierEEnum, Modifier.CREATE);
      addEEnumLiteral(modifierEEnum, Modifier.DESTROY);

      initEEnum(multiLinkTypeEEnum, MultiLinkType.class, "MultiLinkType");
      addEEnumLiteral(multiLinkTypeEEnum, MultiLinkType.FIRST);
      addEEnumLiteral(multiLinkTypeEEnum, MultiLinkType.LAST);
      addEEnumLiteral(multiLinkTypeEEnum, MultiLinkType.DIRECT);
      addEEnumLiteral(multiLinkTypeEEnum, MultiLinkType.INDIRECT);
      addEEnumLiteral(multiLinkTypeEEnum, MultiLinkType.INDEX);

      // Create annotations
      // redefines
      createRedefinesAnnotations();
   }

   /**
    * Initializes the annotations for <b>redefines</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createRedefinesAnnotations ()
   {
      String source = "redefines";
      addAnnotation(getObject_Classifier(), source, new String[] {}, new URI[] {URI.createURI(SDMPackage.eNS_URI)
         .appendFragment("//TypedElement/type")});
   }

} //PatternPackageImpl
