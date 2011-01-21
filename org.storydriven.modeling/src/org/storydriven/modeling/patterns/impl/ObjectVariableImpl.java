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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.impl.VariableImpl;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.LinkOrderConstraint;
import org.storydriven.modeling.patterns.Modifier;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.util.SDMUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getAttributeAssignments <em>Attribute Assignment</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getOutgoingLinks <em>Outgoing Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getIncomingLinks <em>Incoming Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getLinkOrderConstraints <em>Link Order Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl#getConstraints <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectVariableImpl extends VariableImpl implements ObjectVariable
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;
   /**
    * The default value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingState()
    * @generated
    * @ordered
    */
   protected static final BindingState BINDING_STATE_EDEFAULT = BindingState.UNBOUND;
   /**
    * The cached value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingState()
    * @generated
    * @ordered
    */
   protected BindingState bindingState = BINDING_STATE_EDEFAULT;
   /**
    * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;
   /**
    * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingSemantics()
    * @generated
    * @ordered
    */
   protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;
   /**
    * The default value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingOperator()
    * @generated
    * @ordered
    */
   protected static final BindingOperator BINDING_OPERATOR_EDEFAULT = BindingOperator.CHECK;
   /**
    * The cached value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBindingOperator()
    * @generated
    * @ordered
    */
   protected BindingOperator bindingOperator = BINDING_OPERATOR_EDEFAULT;
   /**
    * The cached value of the '{@link #getAttributeAssignments() <em>Attribute Assignment</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getAttributeAssignments()
    * @generated
    * @ordered
    */
   protected EList<AttributeAssignment> attributeAssignments;
   /**
    * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Link</em>}' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOutgoingLinks()
    * @generated
    * @ordered
    */
   protected EList<AbstractLinkVariable> outgoingLinks;
   /**
    * The cached value of the '{@link #getIncomingLinks() <em>Incoming Link</em>}' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getIncomingLinks()
    * @generated
    * @ordered
    */
   protected EList<AbstractLinkVariable> incomingLinks;
   /**
    * The cached value of the '{@link #getLinkOrderConstraints() <em>Link Order Constraint</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getLinkOrderConstraints()
    * @generated
    * @ordered
    */
   protected EList<LinkOrderConstraint> linkOrderConstraints;
   /**
    * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getClassifier()
    * @generated
    * @ordered
    */
   protected EClass classifier;
   /**
    * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getBindingExpression()
    * @generated
    * @ordered
    */
   protected Expression bindingExpression;
   /**
    * The cached value of the '{@link #getConstraints() <em>Constraint</em>}' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getConstraints()
    * @generated
    * @ordered
    */
   protected EList<Constraint> constraints;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ObjectVariableImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return PatternsPackage.Literals.OBJECT_VARIABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setName (String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BindingState getBindingState ()
   {
      return bindingState;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBindingState (BindingState newBindingState)
   {
      BindingState oldBindingState = bindingState;
      bindingState = newBindingState == null ? BINDING_STATE_EDEFAULT : newBindingState;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_STATE,
            oldBindingState, bindingState));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingSemantics getBindingSemantics ()
   {
      return bindingSemantics;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBindingSemantics (BindingSemantics newBindingSemantics)
   {
      BindingSemantics oldBindingSemantics = bindingSemantics;
      bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS,
            oldBindingSemantics, bindingSemantics));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingOperator getBindingOperator ()
   {
      return bindingOperator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBindingOperator (BindingOperator newBindingOperator)
   {
      BindingOperator oldBindingOperator = bindingOperator;
      bindingOperator = newBindingOperator == null ? BINDING_OPERATOR_EDEFAULT : newBindingOperator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR,
            oldBindingOperator, bindingOperator));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern getPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.OBJECT_VARIABLE__PATTERN)
         return null;
      return (StoryPattern) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public StoryPattern basicGetPattern ()
   {
      if (eContainerFeatureID() != PatternsPackage.OBJECT_VARIABLE__PATTERN)
         return null;
      return (StoryPattern) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPattern (StoryPattern newPattern, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newPattern, PatternsPackage.OBJECT_VARIABLE__PATTERN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setPattern (StoryPattern newPattern)
   {
      if (newPattern != eInternalContainer()
         || (eContainerFeatureID() != PatternsPackage.OBJECT_VARIABLE__PATTERN && newPattern != null))
      {
         if (EcoreUtil.isAncestor(this, newPattern))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newPattern != null)
            msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE,
               StoryPattern.class, msgs);
         msgs = basicSetPattern(newPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__PATTERN, newPattern,
            newPattern));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractLinkVariable> getOutgoingLinks ()
   {
      if (outgoingLinks == null)
      {
         outgoingLinks = new EObjectWithInverseResolvingEList<AbstractLinkVariable>(AbstractLinkVariable.class, this,
            PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK, PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE);
      }
      return outgoingLinks;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractLinkVariable> getIncomingLinks ()
   {
      if (incomingLinks == null)
      {
         incomingLinks = new EObjectWithInverseResolvingEList<AbstractLinkVariable>(AbstractLinkVariable.class, this,
            PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK, PatternsPackage.ABSTRACT_LINK_VARIABLE__TARGET);
      }
      return incomingLinks;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<LinkOrderConstraint> getLinkOrderConstraints ()
   {
      if (linkOrderConstraints == null)
      {
         linkOrderConstraints = new EObjectContainmentWithInverseEList.Resolving<LinkOrderConstraint>(
            LinkOrderConstraint.class, this, PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT,
            PatternsPackage.LINK_ORDER_CONSTRAINT__REFERENCING_OBJECT);
      }
      return linkOrderConstraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getClassifier ()
   {
      if (classifier != null && classifier.eIsProxy())
      {
         InternalEObject oldClassifier = (InternalEObject) classifier;
         classifier = (EClass) eResolveProxy(oldClassifier);
         if (classifier != oldClassifier)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.OBJECT_VARIABLE__CLASSIFIER,
                  oldClassifier, classifier));
         }
      }
      return classifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass basicGetClassifier ()
   {
      return classifier;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setClassifier (EClass newClassifier)
   {
      EClass oldClassifier = this.classifier;
      this.classifier = newClassifier;
      NotificationChain msgs = updateGenericType(newClassifier, null);
      SDMUtil.dispatch(msgs, eNotificationRequired() ? new ENotificationImpl(this, Notification.SET,
         PatternsPackage.OBJECT_VARIABLE__CLASSIFIER, oldClassifier, this.classifier) : null);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
               - PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, null, null);
            if (newBindingExpression.eInternalContainer() == null)
            {
               msgs = newBindingExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, oldBindingExpression, bindingExpression));
         }
      }
      return bindingExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetBindingExpression ()
   {
      return bindingExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBindingExpression (Expression newBindingExpression, NotificationChain msgs)
   {
      Expression oldBindingExpression = bindingExpression;
      bindingExpression = newBindingExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setBindingExpression (Expression newBindingExpression)
   {
      if (newBindingExpression != bindingExpression)
      {
         NotificationChain msgs = null;
         if (bindingExpression != null)
            msgs = ((InternalEObject) bindingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, null, msgs);
         if (newBindingExpression != null)
            msgs = ((InternalEObject) newBindingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, null, msgs);
         msgs = basicSetBindingExpression(newBindingExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION,
            newBindingExpression, newBindingExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<Constraint> getConstraints ()
   {
      if (constraints == null)
      {
         constraints = new EObjectContainmentWithInverseEList.Resolving<Constraint>(Constraint.class, this,
            PatternsPackage.OBJECT_VARIABLE__CONSTRAINT, PatternsPackage.CONSTRAINT__OBJECT_VARIABLE);
      }
      return constraints;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EList<AttributeAssignment> getAttributeAssignments ()
   {
      if (attributeAssignments == null)
      {
         attributeAssignments = new EObjectContainmentWithInverseEList.Resolving<AttributeAssignment>(
            AttributeAssignment.class, this, PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT,
            PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);
      }
      return attributeAssignments;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetPattern((StoryPattern) otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributeAssignments()).basicAdd(otherEnd,
               msgs);
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingLinks()).basicAdd(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingLinks()).basicAdd(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkOrderConstraints()).basicAdd(otherEnd,
               msgs);
         case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            return basicSetPattern(null, msgs);
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return ((InternalEList<?>) getAttributeAssignments()).basicRemove(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return ((InternalEList<?>) getOutgoingLinks()).basicRemove(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
            return ((InternalEList<?>) getIncomingLinks()).basicRemove(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return ((InternalEList<?>) getLinkOrderConstraints()).basicRemove(otherEnd, msgs);
         case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
            return basicSetBindingExpression(null, msgs);
         case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
            return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE,
               StoryPattern.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__NAME:
            return getName();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
            return getBindingState();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            return getBindingSemantics();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            return getBindingOperator();
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            if (resolve)
               return getPattern();
            return basicGetPattern();
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return getAttributeAssignments();
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return getOutgoingLinks();
         case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
            return getIncomingLinks();
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return getLinkOrderConstraints();
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            if (resolve)
               return getClassifier();
            return basicGetClassifier();
         case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
            if (resolve)
               return getBindingExpression();
            return basicGetBindingExpression();
         case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
            return getConstraints();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__NAME:
            setName((String) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
            setBindingState((BindingState) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            setBindingSemantics((BindingSemantics) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            setBindingOperator((BindingOperator) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            setPattern((StoryPattern) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            getAttributeAssignments().clear();
            getAttributeAssignments().addAll((Collection<? extends AttributeAssignment>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            getOutgoingLinks().clear();
            getOutgoingLinks().addAll((Collection<? extends AbstractLinkVariable>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
            getIncomingLinks().clear();
            getIncomingLinks().addAll((Collection<? extends AbstractLinkVariable>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            getLinkOrderConstraints().clear();
            getLinkOrderConstraints().addAll((Collection<? extends LinkOrderConstraint>) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            setClassifier((EClass) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
            setBindingExpression((Expression) newValue);
            return;
         case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
            getConstraints().clear();
            getConstraints().addAll((Collection<? extends Constraint>) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
            setBindingState(BINDING_STATE_EDEFAULT);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            setBindingOperator(BINDING_OPERATOR_EDEFAULT);
            return;
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            setPattern((StoryPattern) null);
            return;
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            getAttributeAssignments().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            getOutgoingLinks().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
            getIncomingLinks().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            getLinkOrderConstraints().clear();
            return;
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            setClassifier((EClass) null);
            return;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
            setBindingExpression((Expression) null);
            return;
         case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
            getConstraints().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case PatternsPackage.OBJECT_VARIABLE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
            return bindingState != BINDING_STATE_EDEFAULT;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
            return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
            return bindingOperator != BINDING_OPERATOR_EDEFAULT;
         case PatternsPackage.OBJECT_VARIABLE__PATTERN:
            return basicGetPattern() != null;
         case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
            return attributeAssignments != null && !attributeAssignments.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
            return outgoingLinks != null && !outgoingLinks.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
            return incomingLinks != null && !incomingLinks.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
            return linkOrderConstraints != null && !linkOrderConstraints.isEmpty();
         case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
            return classifier != null;
         case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
            return bindingExpression != null;
         case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
            return constraints != null && !constraints.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID (int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == NamedElement.class)
      {
         switch (derivedFeatureID)
         {
            case PatternsPackage.OBJECT_VARIABLE__NAME:
               return SDMPackage.NAMED_ELEMENT__NAME;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
               return PatternsPackage.OBJECT_VARIABLE__NAME;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
      result.append(", bindingState: ");
      result.append(bindingState);
      result.append(", bindingSemantics: ");
      result.append(bindingSemantics);
      result.append(", bindingOperator: ");
      result.append(bindingOperator);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSetType ()
   {
      return super.isSetType() || eIsSet(PatternsPackage.OBJECT_VARIABLE__CLASSIFIER);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier getType ()
   {
      EClassifier type = basicGetType();
      return type != null && type.eIsProxy() ? (EClassifier) eResolveProxy((InternalEObject) type) : type;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EClassifier basicGetType ()
   {
      if (eIsSet(PatternsPackage.OBJECT_VARIABLE__CLASSIFIER))
      {
         return basicGetClassifier();
      }
      return super.basicGetType();
   }

   @Override
   protected NotificationChain basicSetType (EClassifier newType, NotificationChain msgs)
   {
      EClass oldClassifier = this.classifier;
      this.classifier = (EClass) newType;
      if (eNotificationRequired())
      {
         return SDMUtil.chain(msgs, new ENotificationImpl(this, Notification.SET,
            PatternsPackage.OBJECT_VARIABLE__CLASSIFIER, oldClassifier, this.classifier));
      }
      return msgs;
   }
} // ObjectVariableImpl
