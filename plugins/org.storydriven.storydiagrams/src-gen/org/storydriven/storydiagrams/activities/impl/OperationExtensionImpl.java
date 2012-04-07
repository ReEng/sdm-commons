/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.OperationExtension;
import org.storydriven.storydiagrams.activities.util.OperationExtensionOperations;
import org.storydriven.storydiagrams.calls.impl.CallableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getModelBase <em>Model Base</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getExtendableBase <em>Extendable Base</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.OperationExtensionImpl#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationExtensionImpl extends CallableImpl implements OperationExtension {
	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected EParameter returnValue;

	/**
	 * The cached value of the '{@link #getOwnedActivity() <em>Owned Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity ownedActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.OPERATION_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBase() {
		EObject base = basicGetBase();
		return base != null && base.eIsProxy() ? eResolveProxy((InternalEObject)base) : base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBase() {
		if (isSetModelBase()) {
			return basicGetModelBase();
		}
		ExtendableElement extendableBase = basicGetExtendableBase();			
		if (extendableBase != null) {
			return extendableBase;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getModelBase() {
		EModelElement modelBase = basicGetModelBase();
		return modelBase != null && modelBase.eIsProxy() ? (EModelElement)eResolveProxy((InternalEObject)modelBase) : modelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetModelBase() {
		// TODO: implement this method to return the 'Model Base' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelBase(EModelElement newModelBase) {
		// TODO: implement this method to set the 'Model Base' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModelBase() {
		// TODO: implement this method to unset the 'Model Base' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModelBase() {
		// TODO: implement this method to return whether the 'Model Base' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getOwningAnnotation() {
		EAnnotation owningAnnotation = basicGetOwningAnnotation();
		return owningAnnotation != null && owningAnnotation.eIsProxy() ? (EAnnotation)eResolveProxy((InternalEObject)owningAnnotation) : owningAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetOwningAnnotation() {
		// TODO: implement this method to return the 'Owning Annotation' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAnnotation(EAnnotation newOwningAnnotation) {
		// TODO: implement this method to set the 'Owning Annotation' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOwningAnnotation() {
		// TODO: implement this method to unset the 'Owning Annotation' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningAnnotation() {
		// TODO: implement this method to return whether the 'Owning Annotation' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableElement getExtendableBase() {
		if (eContainerFeatureID() != ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE) return null;
		return (ExtendableElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableElement basicGetExtendableBase() {
		if (eContainerFeatureID() != ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE) return null;
		return (ExtendableElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendableBase(ExtendableElement newExtendableBase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExtendableBase, ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendableBase(ExtendableElement newExtendableBase) {
		if (newExtendableBase != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE && newExtendableBase != null)) {
			if (EcoreUtil.isAncestor(this, newExtendableBase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtendableBase != null)
				msgs = ((InternalEObject)newExtendableBase).eInverseAdd(this, CorePackage.EXTENDABLE_ELEMENT__EXTENSION, ExtendableElement.class, msgs);
			msgs = basicSetExtendableBase(newExtendableBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE, newExtendableBase, newExtendableBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EOperation getOperation() {
		return OperationExtensionOperations.getOperation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOperation(EOperation newOperation) {
		OperationExtensionOperations.setOperation(this, newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetOperation() {
		OperationExtensionOperations.unsetOperation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOperation() {
		return OperationExtensionOperations.isSetOperation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(EParameter newReturnValue, NotificationChain msgs) {
		EParameter oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, oldReturnValue, newReturnValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(EParameter newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOwnedActivity() {
		return ownedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedActivity(Activity newOwnedActivity, NotificationChain msgs) {
		Activity oldOwnedActivity = ownedActivity;
		ownedActivity = newOwnedActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, oldOwnedActivity, newOwnedActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedActivity(Activity newOwnedActivity) {
		if (newOwnedActivity != ownedActivity) {
			NotificationChain msgs = null;
			if (ownedActivity != null)
				msgs = ((InternalEObject)ownedActivity).eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, Activity.class, msgs);
			if (newOwnedActivity != null)
				msgs = ((InternalEObject)newOwnedActivity).eInverseAdd(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, Activity.class, msgs);
			msgs = basicSetOwnedActivity(newOwnedActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, newOwnedActivity, newOwnedActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean NumberOfOutParams(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperationExtensionOperations.NumberOfOutParams(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtendableBase((ExtendableElement)otherEnd, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				if (ownedActivity != null)
					msgs = ((InternalEObject)ownedActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, null, msgs);
				return basicSetOwnedActivity((Activity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				return basicSetExtendableBase(null, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				return basicSetReturnValue(null, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				return basicSetOwnedActivity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				return eInternalContainer().eInverseRemove(this, CorePackage.EXTENDABLE_ELEMENT__EXTENSION, ExtendableElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE:
				if (resolve) return getModelBase();
				return basicGetModelBase();
			case ActivitiesPackage.OPERATION_EXTENSION__OWNING_ANNOTATION:
				if (resolve) return getOwningAnnotation();
				return basicGetOwningAnnotation();
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				if (resolve) return getExtendableBase();
				return basicGetExtendableBase();
			case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
				return getOperation();
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				return getReturnValue();
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				return getOwnedActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE:
				setModelBase((EModelElement)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNING_ANNOTATION:
				setOwningAnnotation((EAnnotation)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				setExtendableBase((ExtendableElement)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
				setOperation((EOperation)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				setReturnValue((EParameter)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				setOwnedActivity((Activity)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE:
				unsetModelBase();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNING_ANNOTATION:
				unsetOwningAnnotation();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				setExtendableBase((ExtendableElement)null);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
				unsetOperation();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				setReturnValue((EParameter)null);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				setOwnedActivity((Activity)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__BASE:
				return isSetBase();
			case ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE:
				return isSetModelBase();
			case ActivitiesPackage.OPERATION_EXTENSION__OWNING_ANNOTATION:
				return isSetOwningAnnotation();
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
				return basicGetExtendableBase() != null;
			case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
				return isSetOperation();
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				return returnValue != null;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				return ownedActivity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.OPERATION_EXTENSION__BASE: return CorePackage.EXTENSION__BASE;
				case ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE: return CorePackage.EXTENSION__MODEL_BASE;
				case ActivitiesPackage.OPERATION_EXTENSION__OWNING_ANNOTATION: return CorePackage.EXTENSION__OWNING_ANNOTATION;
				case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE: return CorePackage.EXTENSION__EXTENDABLE_BASE;
				default: return -1;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENSION__BASE: return ActivitiesPackage.OPERATION_EXTENSION__BASE;
				case CorePackage.EXTENSION__MODEL_BASE: return ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE;
				case CorePackage.EXTENSION__OWNING_ANNOTATION: return ActivitiesPackage.OPERATION_EXTENSION__OWNING_ANNOTATION;
				case CorePackage.EXTENSION__EXTENDABLE_BASE: return ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBase() {
		return isSetModelBase()
			|| eIsSet(ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE);
	}

	public EList<EParameter> getInParameters() {
		final EOperation operation = getOperation();
		return operation == null ? ECollections.<EParameter> emptyEList()
				: operation.getEParameters();
	}

	public EList<EParameter> getOutParameters() {
		final EOperation operation = getOperation();

		if (operation == null || operation.getEType() == null) {
			return ECollections.<EParameter> emptyEList();
		}

		if (getReturnValue() == null) {
			final EParameter parameter;
			parameter = EcorePackage.eINSTANCE.getEcoreFactory()
					.createEParameter();
			setReturnValue(parameter);
		}

		if (operation.getEType() != getReturnValue().getEType()) {
			getReturnValue().setEType(operation.getEType());
		}

		return new BasicEList.UnmodifiableEList<EParameter>(1,
				new EParameter[] { getReturnValue() });
	}
} //OperationExtensionImpl
