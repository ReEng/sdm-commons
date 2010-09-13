/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.Expression;

import org.storydriven.modeling.impl.CommentableElementImpl;

import org.storydriven.modeling.pattern.Constraint;
import org.storydriven.modeling.pattern.ObjectPattern;
import org.storydriven.modeling.pattern.PatternPackage;
import org.storydriven.modeling.pattern.StoryNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getContainedObjects <em>Contained Objects</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getStatements <em>Statement</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getContainingNode <em>Containing Node</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getParentPattern <em>Parent Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getChildPatterns <em>Child Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getConstraintExpressions <em>Constraint Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPatternImpl extends CommentableElementImpl implements ObjectPattern
{
   /**
    * The cached value of the '{@link #getContainedObjects() <em>Contained Objects</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContainedObjects()
    * @generated
    * @ordered
    */
   protected EList<org.storydriven.modeling.pattern.Object> containedObjects;

   /**
    * The cached value of the '{@link #getStatements() <em>Statement</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStatements()
    * @generated
    * @ordered
    */
   protected EList<Expression> statements;

   /**
    * The cached value of the '{@link #getChildPatterns() <em>Child Pattern</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getChildPatterns()
    * @generated
    * @ordered
    */
   protected EList<ObjectPattern> childPatterns;

   /**
    * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstraint()
    * @generated
    * @ordered
    */
   protected static final Constraint CONSTRAINT_EDEFAULT = Constraint.NONE;

   /**
    * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstraint()
    * @generated
    * @ordered
    */
   protected Constraint constraint = CONSTRAINT_EDEFAULT;

   /**
    * The cached value of the '{@link #getConstraintExpressions() <em>Constraint Expression</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstraintExpressions()
    * @generated
    * @ordered
    */
   protected EList<Expression> constraintExpressions;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ObjectPatternImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return PatternPackage.Literals.OBJECT_PATTERN;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<org.storydriven.modeling.pattern.Object> getContainedObjects ()
   {
      if (containedObjects == null)
      {
         containedObjects = new EObjectContainmentWithInverseEList.Resolving<org.storydriven.modeling.pattern.Object>(
            org.storydriven.modeling.pattern.Object.class, this, PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS,
            PatternPackage.OBJECT__PATTERN);
      }
      return containedObjects;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Expression> getStatements ()
   {
      if (statements == null)
      {
         statements = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            PatternPackage.OBJECT_PATTERN__STATEMENT);
      }
      return statements;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StoryNode getContainingNode ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__CONTAINING_NODE)
         return null;
      return (StoryNode) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StoryNode basicGetContainingNode ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__CONTAINING_NODE)
         return null;
      return (StoryNode) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetContainingNode (StoryNode newContainingNode, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newContainingNode, PatternPackage.OBJECT_PATTERN__CONTAINING_NODE,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setContainingNode (StoryNode newContainingNode)
   {
      if (newContainingNode != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__CONTAINING_NODE && newContainingNode != null))
      {
         if (EcoreUtil.isAncestor(this, newContainingNode))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newContainingNode != null)
            msgs = ((InternalEObject) newContainingNode).eInverseAdd(this,
               PatternPackage.STORY_NODE__CONTAINED_PATTERN, StoryNode.class, msgs);
         msgs = basicSetContainingNode(newContainingNode, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT_PATTERN__CONTAINING_NODE,
            newContainingNode, newContainingNode));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern getParentPattern ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__PARENT_PATTERN)
         return null;
      return (ObjectPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern basicGetParentPattern ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__PARENT_PATTERN)
         return null;
      return (ObjectPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentPattern (ObjectPattern newParentPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newParentPattern, PatternPackage.OBJECT_PATTERN__PARENT_PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParentPattern (ObjectPattern newParentPattern)
   {
      if (newParentPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__PARENT_PATTERN && newParentPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newParentPattern))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentPattern != null)
            msgs = ((InternalEObject) newParentPattern).eInverseAdd(this, PatternPackage.OBJECT_PATTERN__CHILD_PATTERN,
               ObjectPattern.class, msgs);
         msgs = basicSetParentPattern(newParentPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT_PATTERN__PARENT_PATTERN,
            newParentPattern, newParentPattern));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ObjectPattern> getChildPatterns ()
   {
      if (childPatterns == null)
      {
         childPatterns = new EObjectContainmentWithInverseEList.Resolving<ObjectPattern>(ObjectPattern.class, this,
            PatternPackage.OBJECT_PATTERN__CHILD_PATTERN, PatternPackage.OBJECT_PATTERN__PARENT_PATTERN);
      }
      return childPatterns;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Constraint getConstraint ()
   {
      return constraint;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setConstraint (Constraint newConstraint)
   {
      Constraint oldConstraint = constraint;
      constraint = newConstraint == null ? CONSTRAINT_EDEFAULT : newConstraint;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT_PATTERN__CONSTRAINT,
            oldConstraint, constraint));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Expression> getConstraintExpressions ()
   {
      if (constraintExpressions == null)
      {
         constraintExpressions = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION);
      }
      return constraintExpressions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedObjects()).basicAdd(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetContainingNode((StoryNode) otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentPattern((ObjectPattern) otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__CHILD_PATTERN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildPatterns()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS:
            return ((InternalEList<?>) getContainedObjects()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            return basicSetContainingNode(null, msgs);
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            return basicSetParentPattern(null, msgs);
         case PatternPackage.OBJECT_PATTERN__CHILD_PATTERN:
            return ((InternalEList<?>) getChildPatterns()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            return ((InternalEList<?>) getConstraintExpressions()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            return eInternalContainer().eInverseRemove(this, PatternPackage.STORY_NODE__CONTAINED_PATTERN,
               StoryNode.class, msgs);
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternPackage.OBJECT_PATTERN__CHILD_PATTERN,
               ObjectPattern.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS:
            return getContainedObjects();
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            return getStatements();
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            if (resolve)
               return getContainingNode();
            return basicGetContainingNode();
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            if (resolve)
               return getParentPattern();
            return basicGetParentPattern();
         case PatternPackage.OBJECT_PATTERN__CHILD_PATTERN:
            return getChildPatterns();
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT:
            return getConstraint();
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            return getConstraintExpressions();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS:
            getContainedObjects().clear();
            getContainedObjects().addAll((Collection<? extends org.storydriven.modeling.pattern.Object>) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Expression>) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            setContainingNode((StoryNode) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            setParentPattern((ObjectPattern) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__CHILD_PATTERN:
            getChildPatterns().clear();
            getChildPatterns().addAll((Collection<? extends ObjectPattern>) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT:
            setConstraint((Constraint) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            getConstraintExpressions().clear();
            getConstraintExpressions().addAll((Collection<? extends Expression>) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS:
            getContainedObjects().clear();
            return;
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            getStatements().clear();
            return;
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            setContainingNode((StoryNode) null);
            return;
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            setParentPattern((ObjectPattern) null);
            return;
         case PatternPackage.OBJECT_PATTERN__CHILD_PATTERN:
            getChildPatterns().clear();
            return;
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT:
            setConstraint(CONSTRAINT_EDEFAULT);
            return;
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            getConstraintExpressions().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS:
            return containedObjects != null && !containedObjects.isEmpty();
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            return statements != null && !statements.isEmpty();
         case PatternPackage.OBJECT_PATTERN__CONTAINING_NODE:
            return basicGetContainingNode() != null;
         case PatternPackage.OBJECT_PATTERN__PARENT_PATTERN:
            return basicGetParentPattern() != null;
         case PatternPackage.OBJECT_PATTERN__CHILD_PATTERN:
            return childPatterns != null && !childPatterns.isEmpty();
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT:
            return constraint != CONSTRAINT_EDEFAULT;
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            return constraintExpressions != null && !constraintExpressions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (constraint: ");
      result.append(constraint);
      result.append(')');
      return result.toString();
   }

} //ObjectPatternImpl
