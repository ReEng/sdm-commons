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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getOwnedObjects <em>Owned Objects</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getStatements <em>Statement</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getOwningNode <em>Owning Node</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getOwningPattern <em>Owning Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getOwnedPatterns <em>Owned Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getConstraint <em>Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.ObjectPatternImpl#getConstraintExpressions <em>Constraint Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObjectPatternImpl extends CommentableElementImpl implements ObjectPattern
{
   /**
    * The cached value of the '{@link #getOwnedObjects() <em>Owned Objects</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getOwnedObjects()
    * @generated
    * @ordered
    */
   protected EList<org.storydriven.modeling.pattern.Object> ownedObjects;

   /**
    * The cached value of the '{@link #getStatements() <em>Statement</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getStatements()
    * @generated
    * @ordered
    */
   protected EList<Expression> statements;

   /**
    * The cached value of the '{@link #getOwnedPatterns() <em>Owned Pattern</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getOwnedPatterns()
    * @generated
    * @ordered
    */
   protected EList<ObjectPattern> ownedPatterns;

   /**
    * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getConstraint()
    * @generated
    * @ordered
    */
   protected static final Constraint CONSTRAINT_EDEFAULT = Constraint.NONE;

   /**
    * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getConstraint()
    * @generated
    * @ordered
    */
   protected Constraint constraint = CONSTRAINT_EDEFAULT;

   /**
    * The cached value of the '{@link #getConstraintExpressions() <em>Constraint Expression</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getConstraintExpressions()
    * @generated
    * @ordered
    */
   protected EList<Expression> constraintExpressions;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ObjectPatternImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return PatternPackage.Literals.OBJECT_PATTERN;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<org.storydriven.modeling.pattern.Object> getOwnedObjects ()
   {
      if (this.ownedObjects == null)
      {
         this.ownedObjects = new EObjectContainmentWithInverseEList.Resolving<org.storydriven.modeling.pattern.Object>(
            org.storydriven.modeling.pattern.Object.class, this, PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS,
            PatternPackage.OBJECT__PATTERN);
      }
      return this.ownedObjects;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Expression> getStatements ()
   {
      if (this.statements == null)
      {
         this.statements = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            PatternPackage.OBJECT_PATTERN__STATEMENT);
      }
      return this.statements;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StoryNode getOwningNode ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__OWNING_NODE)
      {
         return null;
      }
      return (StoryNode) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StoryNode basicGetOwningNode ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__OWNING_NODE)
      {
         return null;
      }
      return (StoryNode) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetOwningNode (StoryNode newOwningNode, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newOwningNode, PatternPackage.OBJECT_PATTERN__OWNING_NODE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOwningNode (StoryNode newOwningNode)
   {
      if (newOwningNode != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__OWNING_NODE && newOwningNode != null))
      {
         if (EcoreUtil.isAncestor(this, newOwningNode))
         {
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         }
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
         {
            msgs = eBasicRemoveFromContainer(msgs);
         }
         if (newOwningNode != null)
         {
            msgs = ((InternalEObject) newOwningNode).eInverseAdd(this, PatternPackage.STORY_NODE__OWNED_PATTERN,
               StoryNode.class, msgs);
         }
         msgs = basicSetOwningNode(newOwningNode, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT_PATTERN__OWNING_NODE,
            newOwningNode, newOwningNode));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectPattern getOwningPattern ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__OWNING_PATTERN)
      {
         return null;
      }
      return (ObjectPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectPattern basicGetOwningPattern ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__OWNING_PATTERN)
      {
         return null;
      }
      return (ObjectPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetOwningPattern (ObjectPattern newOwningPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newOwningPattern, PatternPackage.OBJECT_PATTERN__OWNING_PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOwningPattern (ObjectPattern newOwningPattern)
   {
      if (newOwningPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.OBJECT_PATTERN__OWNING_PATTERN && newOwningPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newOwningPattern))
         {
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         }
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
         {
            msgs = eBasicRemoveFromContainer(msgs);
         }
         if (newOwningPattern != null)
         {
            msgs = ((InternalEObject) newOwningPattern).eInverseAdd(this, PatternPackage.OBJECT_PATTERN__OWNED_PATTERN,
               ObjectPattern.class, msgs);
         }
         msgs = basicSetOwningPattern(newOwningPattern, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT_PATTERN__OWNING_PATTERN,
            newOwningPattern, newOwningPattern));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<ObjectPattern> getOwnedPatterns ()
   {
      if (this.ownedPatterns == null)
      {
         this.ownedPatterns = new EObjectContainmentWithInverseEList.Resolving<ObjectPattern>(ObjectPattern.class,
            this, PatternPackage.OBJECT_PATTERN__OWNED_PATTERN, PatternPackage.OBJECT_PATTERN__OWNING_PATTERN);
      }
      return this.ownedPatterns;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Constraint getConstraint ()
   {
      return this.constraint;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setConstraint (Constraint newConstraint)
   {
      Constraint oldConstraint = this.constraint;
      this.constraint = newConstraint == null ? CONSTRAINT_EDEFAULT : newConstraint;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT_PATTERN__CONSTRAINT,
            oldConstraint, this.constraint));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Expression> getConstraintExpressions ()
   {
      if (this.constraintExpressions == null)
      {
         this.constraintExpressions = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION);
      }
      return this.constraintExpressions;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedObjects()).basicAdd(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            if (eInternalContainer() != null)
            {
               msgs = eBasicRemoveFromContainer(msgs);
            }
            return basicSetOwningNode((StoryNode) otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            if (eInternalContainer() != null)
            {
               msgs = eBasicRemoveFromContainer(msgs);
            }
            return basicSetOwningPattern((ObjectPattern) otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__OWNED_PATTERN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedPatterns()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS:
            return ((InternalEList<?>) getOwnedObjects()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            return basicSetOwningNode(null, msgs);
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            return basicSetOwningPattern(null, msgs);
         case PatternPackage.OBJECT_PATTERN__OWNED_PATTERN:
            return ((InternalEList<?>) getOwnedPatterns()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            return ((InternalEList<?>) getConstraintExpressions()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            return eInternalContainer().eInverseRemove(this, PatternPackage.STORY_NODE__OWNED_PATTERN, StoryNode.class,
               msgs);
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternPackage.OBJECT_PATTERN__OWNED_PATTERN,
               ObjectPattern.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS:
            return getOwnedObjects();
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            return getStatements();
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            if (resolve)
            {
               return getOwningNode();
            }
            return basicGetOwningNode();
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            if (resolve)
            {
               return getOwningPattern();
            }
            return basicGetOwningPattern();
         case PatternPackage.OBJECT_PATTERN__OWNED_PATTERN:
            return getOwnedPatterns();
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT:
            return getConstraint();
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            return getConstraintExpressions();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS:
            getOwnedObjects().clear();
            getOwnedObjects().addAll((Collection<? extends org.storydriven.modeling.pattern.Object>) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Expression>) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            setOwningNode((StoryNode) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            setOwningPattern((ObjectPattern) newValue);
            return;
         case PatternPackage.OBJECT_PATTERN__OWNED_PATTERN:
            getOwnedPatterns().clear();
            getOwnedPatterns().addAll((Collection<? extends ObjectPattern>) newValue);
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS:
            getOwnedObjects().clear();
            return;
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            getStatements().clear();
            return;
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            setOwningNode((StoryNode) null);
            return;
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            setOwningPattern((ObjectPattern) null);
            return;
         case PatternPackage.OBJECT_PATTERN__OWNED_PATTERN:
            getOwnedPatterns().clear();
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS:
            return this.ownedObjects != null && !this.ownedObjects.isEmpty();
         case PatternPackage.OBJECT_PATTERN__STATEMENT:
            return this.statements != null && !this.statements.isEmpty();
         case PatternPackage.OBJECT_PATTERN__OWNING_NODE:
            return basicGetOwningNode() != null;
         case PatternPackage.OBJECT_PATTERN__OWNING_PATTERN:
            return basicGetOwningPattern() != null;
         case PatternPackage.OBJECT_PATTERN__OWNED_PATTERN:
            return this.ownedPatterns != null && !this.ownedPatterns.isEmpty();
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT:
            return this.constraint != CONSTRAINT_EDEFAULT;
         case PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION:
            return this.constraintExpressions != null && !this.constraintExpressions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
      {
         return super.toString();
      }

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (constraint: ");
      result.append(this.constraint);
      result.append(')');
      return result.toString();
   }

} // ObjectPatternImpl
