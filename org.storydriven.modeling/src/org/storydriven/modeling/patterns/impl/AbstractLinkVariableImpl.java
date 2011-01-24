/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.NamedElementImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Link Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getSecondLinkOrderConstraints <em>Second Link Order Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getFirstLinkOrderConstraints <em>First Link Order Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getBindingState <em>Binding State</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getPattern <em>Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractLinkVariableImpl extends NamedElementImpl implements AbstractLinkVariable
{
   /**
    * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;

   /**
    * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;

   /**
    * The default value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingOperator()
    * @generated
    * @ordered
    */
   protected static final BindingOperator BINDING_OPERATOR_EDEFAULT = BindingOperator.CHECK;

   /**
    * The cached value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingOperator()
    * @generated
    * @ordered
    */
   protected BindingOperator bindingOperator = BINDING_OPERATOR_EDEFAULT;

   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected ObjectVariable target;

   /**
    * The cached value of the '{@link #getSecondLinkOrderConstraints() <em>Second Link Order Constraint</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getSecondLinkOrderConstraints()
    * @generated
    * @ordered
    */
   protected EList<LinkConstraint> secondLinkOrderConstraints;

   /**
    * The cached value of the '{@link #getFirstLinkOrderConstraints() <em>First Link Order Constraint</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getFirstLinkOrderConstraints()
    * @generated
    * @ordered
    */
   protected EList<LinkConstraint> firstLinkOrderConstraints;

   /**
    * The default value of the '{@link #getBindingState() <em>Binding State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingState()
    * @generated
    * @ordered
    */
   protected static final BindingState BINDING_STATE_EDEFAULT = BindingState.UNBOUND;

   /**
    * The cached value of the '{@link #getBindingState() <em>Binding State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingState()
    * @generated
    * @ordered
    */
   protected BindingState bindingState = BINDING_STATE_EDEFAULT;

   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected ObjectVariable source;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected AbstractLinkVariableImpl ()
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
      return PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public BindingSemantics getBindingSemantics ()
   {
      return this.bindingSemantics;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setBindingSemantics (BindingSemantics newBindingSemantics)
   {
      BindingSemantics oldBindingSemantics = this.bindingSemantics;
      this.bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET,
            PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS, oldBindingSemantics, this.bindingSemantics));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public BindingOperator getBindingOperator ()
   {
      return this.bindingOperator;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setBindingOperator (BindingOperator newBindingOperator)
   {
      BindingOperator oldBindingOperator = this.bindingOperator;
      this.bindingOperator = newBindingOperator == null ? BINDING_OPERATOR_EDEFAULT : newBindingOperator;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET,
            PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR, oldBindingOperator, this.bindingOperator));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectVariable getTarget ()
   {
      if (this.target != null && this.target.eIsProxy())
      {
         InternalEObject oldTarget = (InternalEObject) this.target;
         this.target = (ObjectVariable) eResolveProxy(oldTarget);
         if (this.target != oldTarget)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET, oldTarget, this.target));
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
   public ObjectVariable basicGetTarget ()
   {
      return this.target;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTarget (ObjectVariable newTarget, NotificationChain msgs)
   {
      ObjectVariable oldTarget = this.target;
      this.target = newTarget;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET, oldTarget, newTarget);
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
   public void setTarget (ObjectVariable newTarget)
   {
      if (newTarget != this.target)
      {
         NotificationChain msgs = null;
         if (this.target != null)
         {
            msgs = ((InternalEObject) this.target).eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK,
               ObjectVariable.class, msgs);
         }
         if (newTarget != null)
         {
            msgs = ((InternalEObject) newTarget).eInverseAdd(this, PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK,
               ObjectVariable.class, msgs);
         }
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET,
            newTarget, newTarget));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<LinkConstraint> getSecondLinkOrderConstraints ()
   {
      if (this.secondLinkOrderConstraints == null)
      {
         this.secondLinkOrderConstraints = new EObjectWithInverseResolvingEList<LinkConstraint>(LinkConstraint.class,
            this, PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT,
            PatternsPackage.LINK_CONSTRAINT__SECOND_LINK);
      }
      return this.secondLinkOrderConstraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<LinkConstraint> getFirstLinkOrderConstraints ()
   {
      if (this.firstLinkOrderConstraints == null)
      {
         this.firstLinkOrderConstraints = new EObjectWithInverseResolvingEList<LinkConstraint>(LinkConstraint.class,
            this, PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT,
            PatternsPackage.LINK_CONSTRAINT__FIRST_LINK);
      }
      return this.firstLinkOrderConstraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public BindingState getBindingState ()
   {
      return this.bindingState;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setBindingState (BindingState newBindingState)
   {
      BindingState oldBindingState = this.bindingState;
      this.bindingState = newBindingState == null ? BINDING_STATE_EDEFAULT : newBindingState;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_STATE,
            oldBindingState, this.bindingState));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StoryPattern getPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN)
      {
         return null;
      }
      return (StoryPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StoryPattern basicGetPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN)
      {
         return null;
      }
      return (StoryPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetPattern (StoryPattern newPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newPattern, PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setPattern (StoryPattern newPattern)
   {
      if (newPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN && newPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newPattern))
         {
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         }
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
         {
            msgs = eBasicRemoveFromContainer(msgs);
         }
         if (newPattern != null)
         {
            msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__LINK_VARIABLE,
               StoryPattern.class, msgs);
         }
         msgs = basicSetPattern(newPattern, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN,
            newPattern, newPattern));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectVariable getSource ()
   {
      if (this.source != null && this.source.eIsProxy())
      {
         InternalEObject oldSource = (InternalEObject) this.source;
         this.source = (ObjectVariable) eResolveProxy(oldSource);
         if (this.source != oldSource)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE, oldSource, this.source));
            }
         }
      }
      return this.source;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectVariable basicGetSource ()
   {
      return this.source;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetSource (ObjectVariable newSource, NotificationChain msgs)
   {
      ObjectVariable oldSource = this.source;
      this.source = newSource;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE, oldSource, newSource);
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
   public void setSource (ObjectVariable newSource)
   {
      if (newSource != this.source)
      {
         NotificationChain msgs = null;
         if (this.source != null)
         {
            msgs = ((InternalEObject) this.source).eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK,
               ObjectVariable.class, msgs);
         }
         if (newSource != null)
         {
            msgs = ((InternalEObject) newSource).eInverseAdd(this, PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK,
               ObjectVariable.class, msgs);
         }
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE,
            newSource, newSource));
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET:
            if (this.target != null)
            {
               msgs = ((InternalEObject) this.target).eInverseRemove(this,
                  PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK, ObjectVariable.class, msgs);
            }
            return basicSetTarget((ObjectVariable) otherEnd, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSecondLinkOrderConstraints()).basicAdd(
               otherEnd, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getFirstLinkOrderConstraints()).basicAdd(
               otherEnd, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            if (eInternalContainer() != null)
            {
               msgs = eBasicRemoveFromContainer(msgs);
            }
            return basicSetPattern((StoryPattern) otherEnd, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE:
            if (this.source != null)
            {
               msgs = ((InternalEObject) this.source).eInverseRemove(this,
                  PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK, ObjectVariable.class, msgs);
            }
            return basicSetSource((ObjectVariable) otherEnd, msgs);
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET:
            return basicSetTarget(null, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT:
            return ((InternalEList<?>) getSecondLinkOrderConstraints()).basicRemove(otherEnd, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT:
            return ((InternalEList<?>) getFirstLinkOrderConstraints()).basicRemove(otherEnd, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            return basicSetPattern(null, msgs);
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE:
            return basicSetSource(null, msgs);
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__LINK_VARIABLE,
               StoryPattern.class, msgs);
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS:
            return getBindingSemantics();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR:
            return getBindingOperator();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET:
            if (resolve)
            {
               return getTarget();
            }
            return basicGetTarget();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT:
            return getSecondLinkOrderConstraints();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT:
            return getFirstLinkOrderConstraints();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_STATE:
            return getBindingState();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            if (resolve)
            {
               return getPattern();
            }
            return basicGetPattern();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE:
            if (resolve)
            {
               return getSource();
            }
            return basicGetSource();
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS:
            setBindingSemantics((BindingSemantics) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR:
            setBindingOperator((BindingOperator) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET:
            setTarget((ObjectVariable) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT:
            getSecondLinkOrderConstraints().clear();
            getSecondLinkOrderConstraints().addAll((Collection<? extends LinkConstraint>) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT:
            getFirstLinkOrderConstraints().clear();
            getFirstLinkOrderConstraints().addAll((Collection<? extends LinkConstraint>) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_STATE:
            setBindingState((BindingState) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            setPattern((StoryPattern) newValue);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE:
            setSource((ObjectVariable) newValue);
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS:
            setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR:
            setBindingOperator(BINDING_OPERATOR_EDEFAULT);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET:
            setTarget((ObjectVariable) null);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT:
            getSecondLinkOrderConstraints().clear();
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT:
            getFirstLinkOrderConstraints().clear();
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_STATE:
            setBindingState(BINDING_STATE_EDEFAULT);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            setPattern((StoryPattern) null);
            return;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE:
            setSource((ObjectVariable) null);
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
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS:
            return this.bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR:
            return this.bindingOperator != BINDING_OPERATOR_EDEFAULT;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET:
            return this.target != null;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SECOND_LINK_ORDER_CONSTRAINT:
            return this.secondLinkOrderConstraints != null && !this.secondLinkOrderConstraints.isEmpty();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__FIRST_LINK_ORDER_CONSTRAINT:
            return this.firstLinkOrderConstraints != null && !this.firstLinkOrderConstraints.isEmpty();
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__BINDING_STATE:
            return this.bindingState != BINDING_STATE_EDEFAULT;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN:
            return basicGetPattern() != null;
         case PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE:
            return this.source != null;
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
      result.append(" (bindingSemantics: ");
      result.append(this.bindingSemantics);
      result.append(", bindingOperator: ");
      result.append(this.bindingOperator);
      result.append(", bindingState: ");
      result.append(this.bindingState);
      result.append(')');
      return result.toString();
   }

} // AbstractLinkVariableImpl
