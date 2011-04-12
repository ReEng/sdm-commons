/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.EOperationCallable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EOperation Callable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.calls.impl.EOperationCallableImpl#getName <em>Name</em>}</li>
 * <li>{@link org.storydriven.modeling.calls.impl.EOperationCallableImpl#getEOperation <em>EOperation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EOperationCallableImpl extends CallableImpl implements EOperationCallable
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The cached value of the '{@link #getEOperation() <em>EOperation</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEOperation()
    * @generated
    * @ordered
    */
   protected EOperation eOperation;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected EOperationCallableImpl ()
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
      return CallsPackage.Literals.EOPERATION_CALLABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName ()
   {
      return this.name;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setName (String newName)
   {
      String oldName = this.name;
      this.name = newName;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.EOPERATION_CALLABLE__NAME, oldName,
            this.name));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EOperation getEOperation ()
   {
      if (this.eOperation != null && this.eOperation.eIsProxy())
      {
         InternalEObject oldEOperation = (InternalEObject) this.eOperation;
         this.eOperation = (EOperation) eResolveProxy(oldEOperation);
         if (this.eOperation != oldEOperation)
         {
            InternalEObject newEOperation = (InternalEObject) this.eOperation;
            NotificationChain msgs = oldEOperation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - CallsPackage.EOPERATION_CALLABLE__EOPERATION, null, null);
            if (newEOperation.eInternalContainer() == null)
            {
               msgs = newEOperation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - CallsPackage.EOPERATION_CALLABLE__EOPERATION, null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallsPackage.EOPERATION_CALLABLE__EOPERATION,
                  oldEOperation, this.eOperation));
            }
         }
      }
      return this.eOperation;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EOperation basicGetEOperation ()
   {
      return this.eOperation;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetEOperation (EOperation newEOperation, NotificationChain msgs)
   {
      EOperation oldEOperation = this.eOperation;
      this.eOperation = newEOperation;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            CallsPackage.EOPERATION_CALLABLE__EOPERATION, oldEOperation, newEOperation);
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
   public void setEOperation (EOperation newEOperation)
   {
      if (newEOperation != this.eOperation)
      {
         NotificationChain msgs = null;
         if (this.eOperation != null)
         {
            msgs = ((InternalEObject) this.eOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - CallsPackage.EOPERATION_CALLABLE__EOPERATION, null, msgs);
         }
         if (newEOperation != null)
         {
            msgs = ((InternalEObject) newEOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - CallsPackage.EOPERATION_CALLABLE__EOPERATION, null, msgs);
         }
         msgs = basicSetEOperation(newEOperation, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.EOPERATION_CALLABLE__EOPERATION,
            newEOperation, newEOperation));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean NumberOfOutParams (DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return EOperationCallableOperations.NumberOfOutParams(this, diagnostics, context);
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
         case CallsPackage.EOPERATION_CALLABLE__EOPERATION:
            return basicSetEOperation(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
         case CallsPackage.EOPERATION_CALLABLE__NAME:
            return getName();
         case CallsPackage.EOPERATION_CALLABLE__EOPERATION:
            if (resolve)
            {
               return getEOperation();
            }
            return basicGetEOperation();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case CallsPackage.EOPERATION_CALLABLE__NAME:
            setName((String) newValue);
            return;
         case CallsPackage.EOPERATION_CALLABLE__EOPERATION:
            setEOperation((EOperation) newValue);
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
         case CallsPackage.EOPERATION_CALLABLE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case CallsPackage.EOPERATION_CALLABLE__EOPERATION:
            setEOperation((EOperation) null);
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
         case CallsPackage.EOPERATION_CALLABLE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
         case CallsPackage.EOPERATION_CALLABLE__EOPERATION:
            return this.eOperation != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   @SuppressWarnings ("unchecked")
   public Object eInvoke (int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
         case CallsPackage.EOPERATION_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP:
            return NumberOfOutParams((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
      }
      return super.eInvoke(operationID, arguments);
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
      result.append(" (name: ");
      result.append(this.name);
      result.append(')');
      return result.toString();
   }

   @Override
   public EList<EParameter> getInParameters ()
   {
      if (getEOperation() != null)
      {
         return getEOperation().getEParameters();
      }
      else
      {
         return new BasicEList<EParameter>();
      }
   }

   private EList<EParameter> outParameters = null;

   @Override
   public EList<EParameter> getOutParameters ()
   {
      if (getEOperation() == null)
      {
         return new BasicEList<EParameter>();
      }
      else
      {
         if (this.outParameters == null || this.outParameters.get(0).getEType() != getEOperation().getEType())
         {
            EParameter outParameter = EcoreFactory.eINSTANCE.createEParameter();
            outParameter.setEType(getEOperation().getEType());

            this.outParameters = new BasicEList<EParameter>();
            this.outParameters.add(outParameter);
         }

         return this.outParameters;
      }
   }

} // EOperationCallableImpl
