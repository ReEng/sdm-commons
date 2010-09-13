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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.Expression;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.expressions.Collaboration;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import org.storydriven.modeling.impl.TypedElementImpl;

import org.storydriven.modeling.pattern.AttributeExpression;
import org.storydriven.modeling.pattern.BoundType;
import org.storydriven.modeling.pattern.Constraint;
import org.storydriven.modeling.pattern.Link;
import org.storydriven.modeling.pattern.Modifier;
import org.storydriven.modeling.pattern.ObjectPattern;
import org.storydriven.modeling.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getOwnedAttributeExpressions <em>Owned Attribute Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getLinkToSources <em>Link To Source</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getLinkToTargets <em>Link To Target</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getReceivedCollaborations <em>Received Collaboration</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.ObjectImpl#getSentCollaborations <em>Sent Collaboration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends TypedElementImpl implements org.storydriven.modeling.pattern.Object
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The cached value of the '{@link #getOwnedAttributeExpressions() <em>Owned Attribute Expression</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedAttributeExpressions()
    * @generated
    * @ordered
    */
   protected EList<AttributeExpression> ownedAttributeExpressions;

   /**
    * The cached value of the '{@link #getLinkToSources() <em>Link To Source</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLinkToSources()
    * @generated
    * @ordered
    */
   protected EList<Link> linkToSources;

   /**
    * The cached value of the '{@link #getLinkToTargets() <em>Link To Target</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLinkToTargets()
    * @generated
    * @ordered
    */
   protected EList<Link> linkToTargets;

   /**
    * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBound()
    * @generated
    * @ordered
    */
   protected static final BoundType BOUND_EDEFAULT = BoundType.UNBOUND;

   /**
    * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBound()
    * @generated
    * @ordered
    */
   protected BoundType bound = BOUND_EDEFAULT;

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
    * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getModifier()
    * @generated
    * @ordered
    */
   protected static final Modifier MODIFIER_EDEFAULT = Modifier.NONE;

   /**
    * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getModifier()
    * @generated
    * @ordered
    */
   protected Modifier modifier = MODIFIER_EDEFAULT;

   /**
    * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingExpression()
    * @generated
    * @ordered
    */
   protected Expression bindingExpression;

   /**
    * The cached value of the '{@link #getReceivedCollaborations() <em>Received Collaboration</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReceivedCollaborations()
    * @generated
    * @ordered
    */
   protected EList<Collaboration> receivedCollaborations;

   /**
    * The cached value of the '{@link #getSentCollaborations() <em>Sent Collaboration</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSentCollaborations()
    * @generated
    * @ordered
    */
   protected EList<Collaboration> sentCollaborations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ObjectImpl ()
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
      return PatternPackage.Literals.OBJECT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName (String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AttributeExpression> getOwnedAttributeExpressions ()
   {
      if (ownedAttributeExpressions == null)
      {
         ownedAttributeExpressions = new EObjectContainmentWithInverseEList.Resolving<AttributeExpression>(
            AttributeExpression.class, this, PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION,
            PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT);
      }
      return ownedAttributeExpressions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Link> getLinkToSources ()
   {
      if (linkToSources == null)
      {
         linkToSources = new EObjectWithInverseResolvingEList<Link>(Link.class, this,
            PatternPackage.OBJECT__LINK_TO_SOURCE, PatternPackage.LINK__TARGET);
      }
      return linkToSources;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Link> getLinkToTargets ()
   {
      if (linkToTargets == null)
      {
         linkToTargets = new EObjectContainmentWithInverseEList.Resolving<Link>(Link.class, this,
            PatternPackage.OBJECT__LINK_TO_TARGET, PatternPackage.LINK__SOURCE);
      }
      return linkToTargets;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern getPattern ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT__PATTERN)
         return null;
      return (ObjectPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern basicGetPattern ()
   {
      if (eContainerFeatureID() != PatternPackage.OBJECT__PATTERN)
         return null;
      return (ObjectPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPattern (ObjectPattern newPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newPattern, PatternPackage.OBJECT__PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPattern (ObjectPattern newPattern)
   {
      if (newPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.OBJECT__PATTERN && newPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newPattern))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newPattern != null)
            msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS,
               ObjectPattern.class, msgs);
         msgs = basicSetPattern(newPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT__PATTERN, newPattern, newPattern));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BoundType getBound ()
   {
      return bound;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBound (BoundType newBound)
   {
      BoundType oldBound = bound;
      bound = newBound == null ? BOUND_EDEFAULT : newBound;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT__BOUND, oldBound, bound));
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
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT__CONSTRAINT, oldConstraint,
            constraint));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Modifier getModifier ()
   {
      return modifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setModifier (Modifier newModifier)
   {
      Modifier oldModifier = modifier;
      modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT__MODIFIER, oldModifier, modifier));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getClassifier ()
   {
      EClass classifier = basicGetClassifier();
      return classifier != null && classifier.eIsProxy() ? (EClass) eResolveProxy((InternalEObject) classifier)
         : classifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
   public EClass basicGetClassifier ()
   {
      return (EClass) super.basicGetType();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
   public void setClassifier (EClass value)
   {
      EClassifier oldType = this.type;
      NotificationChain msgs = setType(value, null);
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.OBJECT__CLASSIFIER, oldType, type);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
   public boolean isSetClassifier ()
   {
      return super.isSetType();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getBindingExpression ()
   {
      if (bindingExpression != null && bindingExpression.eIsProxy())
      {
         InternalEObject oldBindingExpression = (InternalEObject) bindingExpression;
         bindingExpression = (Expression) eResolveProxy(oldBindingExpression);
         if (bindingExpression != oldBindingExpression)
         {
            InternalEObject newBindingExpression = (InternalEObject) bindingExpression;
            NotificationChain msgs = oldBindingExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternPackage.OBJECT__BINDING_EXPRESSION, null, null);
            if (newBindingExpression.eInternalContainer() == null)
            {
               msgs = newBindingExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternPackage.OBJECT__BINDING_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.OBJECT__BINDING_EXPRESSION,
                  oldBindingExpression, bindingExpression));
         }
      }
      return bindingExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetBindingExpression ()
   {
      return bindingExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBindingExpression (Expression newBindingExpression, NotificationChain msgs)
   {
      Expression oldBindingExpression = bindingExpression;
      bindingExpression = newBindingExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.OBJECT__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBindingExpression (Expression newBindingExpression)
   {
      if (newBindingExpression != bindingExpression)
      {
         NotificationChain msgs = null;
         if (bindingExpression != null)
            msgs = ((InternalEObject) bindingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternPackage.OBJECT__BINDING_EXPRESSION, null, msgs);
         if (newBindingExpression != null)
            msgs = ((InternalEObject) newBindingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternPackage.OBJECT__BINDING_EXPRESSION, null, msgs);
         msgs = basicSetBindingExpression(newBindingExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.OBJECT__BINDING_EXPRESSION,
            newBindingExpression, newBindingExpression));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Collaboration> getReceivedCollaborations ()
   {
      if (receivedCollaborations == null)
      {
         receivedCollaborations = new EObjectWithInverseResolvingEList.ManyInverse<Collaboration>(Collaboration.class,
            this, PatternPackage.OBJECT__RECEIVED_COLLABORATION, ExpressionsPackage.COLLABORATION__TARGET);
      }
      return receivedCollaborations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Collaboration> getSentCollaborations ()
   {
      if (sentCollaborations == null)
      {
         sentCollaborations = new EObjectWithInverseResolvingEList<Collaboration>(Collaboration.class, this,
            PatternPackage.OBJECT__SENT_COLLABORATION, ExpressionsPackage.COLLABORATION__SOURCE);
      }
      return sentCollaborations;
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
         case PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedAttributeExpressions()).basicAdd(
               otherEnd, msgs);
         case PatternPackage.OBJECT__LINK_TO_SOURCE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkToSources()).basicAdd(otherEnd, msgs);
         case PatternPackage.OBJECT__LINK_TO_TARGET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkToTargets()).basicAdd(otherEnd, msgs);
         case PatternPackage.OBJECT__PATTERN:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetPattern((ObjectPattern) otherEnd, msgs);
         case PatternPackage.OBJECT__RECEIVED_COLLABORATION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivedCollaborations()).basicAdd(otherEnd,
               msgs);
         case PatternPackage.OBJECT__SENT_COLLABORATION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSentCollaborations()).basicAdd(otherEnd,
               msgs);
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
         case PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION:
            return ((InternalEList<?>) getOwnedAttributeExpressions()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT__LINK_TO_SOURCE:
            return ((InternalEList<?>) getLinkToSources()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT__LINK_TO_TARGET:
            return ((InternalEList<?>) getLinkToTargets()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT__PATTERN:
            return basicSetPattern(null, msgs);
         case PatternPackage.OBJECT__BINDING_EXPRESSION:
            return basicSetBindingExpression(null, msgs);
         case PatternPackage.OBJECT__RECEIVED_COLLABORATION:
            return ((InternalEList<?>) getReceivedCollaborations()).basicRemove(otherEnd, msgs);
         case PatternPackage.OBJECT__SENT_COLLABORATION:
            return ((InternalEList<?>) getSentCollaborations()).basicRemove(otherEnd, msgs);
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
         case PatternPackage.OBJECT__PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternPackage.OBJECT_PATTERN__CONTAINED_OBJECTS,
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
         case PatternPackage.OBJECT__NAME:
            return getName();
         case PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION:
            return getOwnedAttributeExpressions();
         case PatternPackage.OBJECT__LINK_TO_SOURCE:
            return getLinkToSources();
         case PatternPackage.OBJECT__LINK_TO_TARGET:
            return getLinkToTargets();
         case PatternPackage.OBJECT__PATTERN:
            if (resolve)
               return getPattern();
            return basicGetPattern();
         case PatternPackage.OBJECT__BOUND:
            return getBound();
         case PatternPackage.OBJECT__CONSTRAINT:
            return getConstraint();
         case PatternPackage.OBJECT__MODIFIER:
            return getModifier();
         case PatternPackage.OBJECT__CLASSIFIER:
            if (resolve)
               return getClassifier();
            return basicGetClassifier();
         case PatternPackage.OBJECT__BINDING_EXPRESSION:
            if (resolve)
               return getBindingExpression();
            return basicGetBindingExpression();
         case PatternPackage.OBJECT__RECEIVED_COLLABORATION:
            return getReceivedCollaborations();
         case PatternPackage.OBJECT__SENT_COLLABORATION:
            return getSentCollaborations();
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
         case PatternPackage.OBJECT__NAME:
            setName((String) newValue);
            return;
         case PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION:
            getOwnedAttributeExpressions().clear();
            getOwnedAttributeExpressions().addAll((Collection<? extends AttributeExpression>) newValue);
            return;
         case PatternPackage.OBJECT__LINK_TO_SOURCE:
            getLinkToSources().clear();
            getLinkToSources().addAll((Collection<? extends Link>) newValue);
            return;
         case PatternPackage.OBJECT__LINK_TO_TARGET:
            getLinkToTargets().clear();
            getLinkToTargets().addAll((Collection<? extends Link>) newValue);
            return;
         case PatternPackage.OBJECT__PATTERN:
            setPattern((ObjectPattern) newValue);
            return;
         case PatternPackage.OBJECT__BOUND:
            setBound((BoundType) newValue);
            return;
         case PatternPackage.OBJECT__CONSTRAINT:
            setConstraint((Constraint) newValue);
            return;
         case PatternPackage.OBJECT__MODIFIER:
            setModifier((Modifier) newValue);
            return;
         case PatternPackage.OBJECT__CLASSIFIER:
            setClassifier((EClass) newValue);
            return;
         case PatternPackage.OBJECT__BINDING_EXPRESSION:
            setBindingExpression((Expression) newValue);
            return;
         case PatternPackage.OBJECT__RECEIVED_COLLABORATION:
            getReceivedCollaborations().clear();
            getReceivedCollaborations().addAll((Collection<? extends Collaboration>) newValue);
            return;
         case PatternPackage.OBJECT__SENT_COLLABORATION:
            getSentCollaborations().clear();
            getSentCollaborations().addAll((Collection<? extends Collaboration>) newValue);
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
         case PatternPackage.OBJECT__NAME:
            setName(NAME_EDEFAULT);
            return;
         case PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION:
            getOwnedAttributeExpressions().clear();
            return;
         case PatternPackage.OBJECT__LINK_TO_SOURCE:
            getLinkToSources().clear();
            return;
         case PatternPackage.OBJECT__LINK_TO_TARGET:
            getLinkToTargets().clear();
            return;
         case PatternPackage.OBJECT__PATTERN:
            setPattern((ObjectPattern) null);
            return;
         case PatternPackage.OBJECT__BOUND:
            setBound(BOUND_EDEFAULT);
            return;
         case PatternPackage.OBJECT__CONSTRAINT:
            setConstraint(CONSTRAINT_EDEFAULT);
            return;
         case PatternPackage.OBJECT__MODIFIER:
            setModifier(MODIFIER_EDEFAULT);
            return;
         case PatternPackage.OBJECT__CLASSIFIER:
            setClassifier((EClass) null);
            return;
         case PatternPackage.OBJECT__BINDING_EXPRESSION:
            setBindingExpression((Expression) null);
            return;
         case PatternPackage.OBJECT__RECEIVED_COLLABORATION:
            getReceivedCollaborations().clear();
            return;
         case PatternPackage.OBJECT__SENT_COLLABORATION:
            getSentCollaborations().clear();
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
         case PatternPackage.OBJECT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION:
            return ownedAttributeExpressions != null && !ownedAttributeExpressions.isEmpty();
         case PatternPackage.OBJECT__LINK_TO_SOURCE:
            return linkToSources != null && !linkToSources.isEmpty();
         case PatternPackage.OBJECT__LINK_TO_TARGET:
            return linkToTargets != null && !linkToTargets.isEmpty();
         case PatternPackage.OBJECT__PATTERN:
            return basicGetPattern() != null;
         case PatternPackage.OBJECT__BOUND:
            return bound != BOUND_EDEFAULT;
         case PatternPackage.OBJECT__CONSTRAINT:
            return constraint != CONSTRAINT_EDEFAULT;
         case PatternPackage.OBJECT__MODIFIER:
            return modifier != MODIFIER_EDEFAULT;
         case PatternPackage.OBJECT__CLASSIFIER:
            return isSetClassifier();
         case PatternPackage.OBJECT__BINDING_EXPRESSION:
            return bindingExpression != null;
         case PatternPackage.OBJECT__RECEIVED_COLLABORATION:
            return receivedCollaborations != null && !receivedCollaborations.isEmpty();
         case PatternPackage.OBJECT__SENT_COLLABORATION:
            return sentCollaborations != null && !sentCollaborations.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID (int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == NamedElement.class)
      {
         switch (derivedFeatureID)
         {
            case PatternPackage.OBJECT__NAME:
               return SDMPackage.NAMED_ELEMENT__NAME;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID (int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == NamedElement.class)
      {
         switch (baseFeatureID)
         {
            case SDMPackage.NAMED_ELEMENT__NAME:
               return PatternPackage.OBJECT__NAME;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(" (name: ");
      result.append(name);
      result.append(", bound: ");
      result.append(bound);
      result.append(", constraint: ");
      result.append(constraint);
      result.append(", modifier: ");
      result.append(modifier);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier getType ()
   {
      return getClassifier();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier basicGetType ()
   {
      return basicGetClassifier();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setType (EClassifier newType)
   {
      if (newType != null && !(newType instanceof EClass))
      {
         throw new IllegalArgumentException(String.valueOf(newType));
      }
      setClassifier((EClass) newType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
   public boolean isSetType ()
   {
      return false;
   }

} //ObjectImpl
