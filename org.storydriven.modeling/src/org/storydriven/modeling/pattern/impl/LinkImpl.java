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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.impl.NamedElementImpl;
import org.storydriven.modeling.pattern.Constraint;
import org.storydriven.modeling.pattern.Link;
import org.storydriven.modeling.pattern.Modifier;
import org.storydriven.modeling.pattern.MultiLink;
import org.storydriven.modeling.pattern.PatternPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getConstraint <em>Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getModifier <em>Modifier</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getMultiLinkToTargets <em>Multi Link To Target</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getMultiLinkFromSources <em>Multi Link From Source</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getSourceEnd <em>Source End</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getTargetEnd <em>Target End</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.LinkImpl#getRangeExpression <em>Range Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LinkImpl extends NamedElementImpl implements Link
{
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
    * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getModifier()
    * @generated
    * @ordered
    */
   protected static final Modifier MODIFIER_EDEFAULT = Modifier.NONE;

   /**
    * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getModifier()
    * @generated
    * @ordered
    */
   protected Modifier modifier = MODIFIER_EDEFAULT;

   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected org.storydriven.modeling.pattern.Object target;

   /**
    * The cached value of the '{@link #getMultiLinkToTargets() <em>Multi Link To Target</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getMultiLinkToTargets()
    * @generated
    * @ordered
    */
   protected EList<MultiLink> multiLinkToTargets;

   /**
    * The cached value of the '{@link #getMultiLinkFromSources() <em>Multi Link From Source</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getMultiLinkFromSources()
    * @generated
    * @ordered
    */
   protected EList<MultiLink> multiLinkFromSources;

   /**
    * The cached value of the '{@link #getTargetEnd() <em>Target End</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getTargetEnd()
    * @generated
    * @ordered
    */
   protected EReference targetEnd;

   /**
    * The cached value of the '{@link #getRangeExpression() <em>Range Expression</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getRangeExpression()
    * @generated
    * @ordered
    */
   protected Expression rangeExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected LinkImpl ()
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
      return PatternPackage.Literals.LINK;
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
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LINK__CONSTRAINT, oldConstraint,
            this.constraint));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Modifier getModifier ()
   {
      return this.modifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setModifier (Modifier newModifier)
   {
      Modifier oldModifier = this.modifier;
      this.modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LINK__MODIFIER, oldModifier,
            this.modifier));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public org.storydriven.modeling.pattern.Object getTarget ()
   {
      if (this.target != null && this.target.eIsProxy())
      {
         InternalEObject oldTarget = (InternalEObject) this.target;
         this.target = (org.storydriven.modeling.pattern.Object) eResolveProxy(oldTarget);
         if (this.target != oldTarget)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.LINK__TARGET, oldTarget,
                  this.target));
            }
         }
      }
      return this.target;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public org.storydriven.modeling.pattern.Object basicGetTarget ()
   {
      return this.target;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTarget (org.storydriven.modeling.pattern.Object newTarget, NotificationChain msgs)
   {
      org.storydriven.modeling.pattern.Object oldTarget = this.target;
      this.target = newTarget;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.LINK__TARGET,
            oldTarget, newTarget);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTarget (org.storydriven.modeling.pattern.Object newTarget)
   {
      if (newTarget != this.target)
      {
         NotificationChain msgs = null;
         if (this.target != null)
         {
            msgs = ((InternalEObject) this.target).eInverseRemove(this, PatternPackage.OBJECT__LINK_TO_SOURCE,
               org.storydriven.modeling.pattern.Object.class, msgs);
         }
         if (newTarget != null)
         {
            msgs = ((InternalEObject) newTarget).eInverseAdd(this, PatternPackage.OBJECT__LINK_TO_SOURCE,
               org.storydriven.modeling.pattern.Object.class, msgs);
         }
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LINK__TARGET, newTarget, newTarget));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public org.storydriven.modeling.pattern.Object getSource ()
   {
      if (eContainerFeatureID() != PatternPackage.LINK__SOURCE)
      {
         return null;
      }
      return (org.storydriven.modeling.pattern.Object) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public org.storydriven.modeling.pattern.Object basicGetSource ()
   {
      if (eContainerFeatureID() != PatternPackage.LINK__SOURCE)
      {
         return null;
      }
      return (org.storydriven.modeling.pattern.Object) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetSource (org.storydriven.modeling.pattern.Object newSource, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newSource, PatternPackage.LINK__SOURCE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setSource (org.storydriven.modeling.pattern.Object newSource)
   {
      if (newSource != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.LINK__SOURCE && newSource != null))
      {
         if (EcoreUtil.isAncestor(this, newSource))
         {
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         }
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
         {
            msgs = eBasicRemoveFromContainer(msgs);
         }
         if (newSource != null)
         {
            msgs = ((InternalEObject) newSource).eInverseAdd(this, PatternPackage.OBJECT__LINK_TO_TARGET,
               org.storydriven.modeling.pattern.Object.class, msgs);
         }
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LINK__SOURCE, newSource, newSource));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<MultiLink> getMultiLinkToTargets ()
   {
      if (this.multiLinkToTargets == null)
      {
         this.multiLinkToTargets = new EObjectWithInverseResolvingEList<MultiLink>(MultiLink.class, this,
            PatternPackage.LINK__MULTI_LINK_TO_TARGET, PatternPackage.MULTI_LINK__TARGET_LINK);
      }
      return this.multiLinkToTargets;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<MultiLink> getMultiLinkFromSources ()
   {
      if (this.multiLinkFromSources == null)
      {
         this.multiLinkFromSources = new EObjectContainmentWithInverseEList.Resolving<MultiLink>(MultiLink.class, this,
            PatternPackage.LINK__MULTI_LINK_FROM_SOURCE, PatternPackage.MULTI_LINK__SOURCE_LINK);
      }
      return this.multiLinkFromSources;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getSourceEnd ()
   {
      EReference sourceEnd = basicGetSourceEnd();
      return sourceEnd != null && sourceEnd.eIsProxy() ? (EReference) eResolveProxy((InternalEObject) sourceEnd)
         : sourceEnd;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EReference basicGetSourceEnd ()
   {
      EReference targetEnd = getTargetEnd();
      return targetEnd == null ? null : targetEnd.getEOpposite();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setSourceEnd (EReference newSourceEnd)
   {
      EReference newTargetEnd = newSourceEnd == null ? null : newSourceEnd.getEOpposite();
      if (newTargetEnd == null && newSourceEnd != null)
      {
         throw new IllegalArgumentException();
      }
      NotificationChain notification = basicSetSourceEnd(newSourceEnd, null);
      notification = basicSetTargetEnd(newTargetEnd, notification);
      if (notification != null)
      {
         notification.dispatch();
      }
   }

   protected NotificationChain basicSetSourceEnd (EReference newSourceEnd, NotificationChain msgs)
   {
      EReference oldSourceEnd = getSourceEnd();
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.LINK__SOURCE_END, oldSourceEnd, newSourceEnd);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getTargetEnd ()
   {
      if (this.targetEnd != null && this.targetEnd.eIsProxy())
      {
         InternalEObject oldTargetEnd = (InternalEObject) this.targetEnd;
         this.targetEnd = (EReference) eResolveProxy(oldTargetEnd);
         if (this.targetEnd != oldTargetEnd)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.LINK__TARGET_END, oldTargetEnd,
                  this.targetEnd));
            }
         }
      }
      return this.targetEnd;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference basicGetTargetEnd ()
   {
      return this.targetEnd;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setTargetEnd (EReference newTargetEnd)
   {
      NotificationChain notification = basicSetTargetEnd(newTargetEnd, null);
      EReference newSourceEnd = newTargetEnd == null ? null : newTargetEnd.getEOpposite();
      notification = basicSetSourceEnd(newSourceEnd, notification);
      if (notification != null)
      {
         notification.dispatch();
      }
   }

   protected NotificationChain basicSetTargetEnd (EReference newTargetEnd, NotificationChain msgs)
   {
      EReference oldTargetEnd = this.targetEnd;
      this.targetEnd = newTargetEnd;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.LINK__TARGET_END, oldTargetEnd, this.targetEnd);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression getRangeExpression ()
   {
      if (this.rangeExpression != null && this.rangeExpression.eIsProxy())
      {
         InternalEObject oldRangeExpression = (InternalEObject) this.rangeExpression;
         this.rangeExpression = (Expression) eResolveProxy(oldRangeExpression);
         if (this.rangeExpression != oldRangeExpression)
         {
            InternalEObject newRangeExpression = (InternalEObject) this.rangeExpression;
            NotificationChain msgs = oldRangeExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternPackage.LINK__RANGE_EXPRESSION, null, null);
            if (newRangeExpression.eInternalContainer() == null)
            {
               msgs = newRangeExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternPackage.LINK__RANGE_EXPRESSION, null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.LINK__RANGE_EXPRESSION,
                  oldRangeExpression, this.rangeExpression));
            }
         }
      }
      return this.rangeExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression basicGetRangeExpression ()
   {
      return this.rangeExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetRangeExpression (Expression newRangeExpression, NotificationChain msgs)
   {
      Expression oldRangeExpression = this.rangeExpression;
      this.rangeExpression = newRangeExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.LINK__RANGE_EXPRESSION, oldRangeExpression, newRangeExpression);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setRangeExpression (Expression newRangeExpression)
   {
      if (newRangeExpression != this.rangeExpression)
      {
         NotificationChain msgs = null;
         if (this.rangeExpression != null)
         {
            msgs = ((InternalEObject) this.rangeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternPackage.LINK__RANGE_EXPRESSION, null, msgs);
         }
         if (newRangeExpression != null)
         {
            msgs = ((InternalEObject) newRangeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternPackage.LINK__RANGE_EXPRESSION, null, msgs);
         }
         msgs = basicSetRangeExpression(newRangeExpression, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LINK__RANGE_EXPRESSION,
            newRangeExpression, newRangeExpression));
      }
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
         case PatternPackage.LINK__TARGET:
            if (this.target != null)
            {
               msgs = ((InternalEObject) this.target).eInverseRemove(this, PatternPackage.OBJECT__LINK_TO_SOURCE,
                  org.storydriven.modeling.pattern.Object.class, msgs);
            }
            return basicSetTarget((org.storydriven.modeling.pattern.Object) otherEnd, msgs);
         case PatternPackage.LINK__SOURCE:
            if (eInternalContainer() != null)
            {
               msgs = eBasicRemoveFromContainer(msgs);
            }
            return basicSetSource((org.storydriven.modeling.pattern.Object) otherEnd, msgs);
         case PatternPackage.LINK__MULTI_LINK_TO_TARGET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMultiLinkToTargets()).basicAdd(otherEnd,
               msgs);
         case PatternPackage.LINK__MULTI_LINK_FROM_SOURCE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMultiLinkFromSources()).basicAdd(otherEnd,
               msgs);
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
         case PatternPackage.LINK__TARGET:
            return basicSetTarget(null, msgs);
         case PatternPackage.LINK__SOURCE:
            return basicSetSource(null, msgs);
         case PatternPackage.LINK__MULTI_LINK_TO_TARGET:
            return ((InternalEList<?>) getMultiLinkToTargets()).basicRemove(otherEnd, msgs);
         case PatternPackage.LINK__MULTI_LINK_FROM_SOURCE:
            return ((InternalEList<?>) getMultiLinkFromSources()).basicRemove(otherEnd, msgs);
         case PatternPackage.LINK__RANGE_EXPRESSION:
            return basicSetRangeExpression(null, msgs);
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
         case PatternPackage.LINK__SOURCE:
            return eInternalContainer().eInverseRemove(this, PatternPackage.OBJECT__LINK_TO_TARGET,
               org.storydriven.modeling.pattern.Object.class, msgs);
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
         case PatternPackage.LINK__CONSTRAINT:
            return getConstraint();
         case PatternPackage.LINK__MODIFIER:
            return getModifier();
         case PatternPackage.LINK__TARGET:
            if (resolve)
            {
               return getTarget();
            }
            return basicGetTarget();
         case PatternPackage.LINK__SOURCE:
            if (resolve)
            {
               return getSource();
            }
            return basicGetSource();
         case PatternPackage.LINK__MULTI_LINK_TO_TARGET:
            return getMultiLinkToTargets();
         case PatternPackage.LINK__MULTI_LINK_FROM_SOURCE:
            return getMultiLinkFromSources();
         case PatternPackage.LINK__SOURCE_END:
            if (resolve)
            {
               return getSourceEnd();
            }
            return basicGetSourceEnd();
         case PatternPackage.LINK__TARGET_END:
            if (resolve)
            {
               return getTargetEnd();
            }
            return basicGetTargetEnd();
         case PatternPackage.LINK__RANGE_EXPRESSION:
            if (resolve)
            {
               return getRangeExpression();
            }
            return basicGetRangeExpression();
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
         case PatternPackage.LINK__CONSTRAINT:
            setConstraint((Constraint) newValue);
            return;
         case PatternPackage.LINK__MODIFIER:
            setModifier((Modifier) newValue);
            return;
         case PatternPackage.LINK__TARGET:
            setTarget((org.storydriven.modeling.pattern.Object) newValue);
            return;
         case PatternPackage.LINK__SOURCE:
            setSource((org.storydriven.modeling.pattern.Object) newValue);
            return;
         case PatternPackage.LINK__MULTI_LINK_TO_TARGET:
            getMultiLinkToTargets().clear();
            getMultiLinkToTargets().addAll((Collection<? extends MultiLink>) newValue);
            return;
         case PatternPackage.LINK__MULTI_LINK_FROM_SOURCE:
            getMultiLinkFromSources().clear();
            getMultiLinkFromSources().addAll((Collection<? extends MultiLink>) newValue);
            return;
         case PatternPackage.LINK__SOURCE_END:
            setSourceEnd((EReference) newValue);
            return;
         case PatternPackage.LINK__TARGET_END:
            setTargetEnd((EReference) newValue);
            return;
         case PatternPackage.LINK__RANGE_EXPRESSION:
            setRangeExpression((Expression) newValue);
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
         case PatternPackage.LINK__CONSTRAINT:
            setConstraint(CONSTRAINT_EDEFAULT);
            return;
         case PatternPackage.LINK__MODIFIER:
            setModifier(MODIFIER_EDEFAULT);
            return;
         case PatternPackage.LINK__TARGET:
            setTarget((org.storydriven.modeling.pattern.Object) null);
            return;
         case PatternPackage.LINK__SOURCE:
            setSource((org.storydriven.modeling.pattern.Object) null);
            return;
         case PatternPackage.LINK__MULTI_LINK_TO_TARGET:
            getMultiLinkToTargets().clear();
            return;
         case PatternPackage.LINK__MULTI_LINK_FROM_SOURCE:
            getMultiLinkFromSources().clear();
            return;
         case PatternPackage.LINK__SOURCE_END:
            setSourceEnd((EReference) null);
            return;
         case PatternPackage.LINK__TARGET_END:
            setTargetEnd((EReference) null);
            return;
         case PatternPackage.LINK__RANGE_EXPRESSION:
            setRangeExpression((Expression) null);
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
         case PatternPackage.LINK__CONSTRAINT:
            return this.constraint != CONSTRAINT_EDEFAULT;
         case PatternPackage.LINK__MODIFIER:
            return this.modifier != MODIFIER_EDEFAULT;
         case PatternPackage.LINK__TARGET:
            return this.target != null;
         case PatternPackage.LINK__SOURCE:
            return basicGetSource() != null;
         case PatternPackage.LINK__MULTI_LINK_TO_TARGET:
            return this.multiLinkToTargets != null && !this.multiLinkToTargets.isEmpty();
         case PatternPackage.LINK__MULTI_LINK_FROM_SOURCE:
            return this.multiLinkFromSources != null && !this.multiLinkFromSources.isEmpty();
         case PatternPackage.LINK__SOURCE_END:
            return basicGetSourceEnd() != null;
         case PatternPackage.LINK__TARGET_END:
            return this.targetEnd != null;
         case PatternPackage.LINK__RANGE_EXPRESSION:
            return this.rangeExpression != null;
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
      result.append(", modifier: ");
      result.append(this.modifier);
      result.append(')');
      return result.toString();
   }

} // LinkImpl
