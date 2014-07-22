/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;
import org.storydriven.core.util.ExtensionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.core.impl.ExtensionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.storydriven.core.impl.ExtensionImpl#getModelBase <em>Model Base</em>}</li>
 *   <li>{@link org.storydriven.core.impl.ExtensionImpl#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.storydriven.core.impl.ExtensionImpl#getExtendableBase <em>Extendable Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExtensionImpl extends ExtendableElementImpl implements
		Extension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBase() {
		EObject base = basicGetBase();
		return base != null && base.eIsProxy() ? eResolveProxy((InternalEObject) base)
				: base;
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
		return modelBase != null && modelBase.eIsProxy() ? (EModelElement) eResolveProxy((InternalEObject) modelBase)
				: modelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EModelElement basicGetModelBase() {
		return ExtensionOperations.getModelBase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setModelBase(EModelElement newModelBase) {
		ExtensionOperations.setModelBase(this, newModelBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetModelBase() {
		ExtensionOperations.unsetModelBase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetModelBase() {
		return ExtensionOperations.isSetModelBase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getOwningAnnotation() {
		EAnnotation owningAnnotation = basicGetOwningAnnotation();
		return owningAnnotation != null && owningAnnotation.eIsProxy() ? (EAnnotation) eResolveProxy((InternalEObject) owningAnnotation)
				: owningAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAnnotation basicGetOwningAnnotation() {
		return ExtensionOperations.getOwningAnnotation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningAnnotation(EAnnotation newOwningAnnotation) {
		ExtensionOperations.setOwningAnnotation(this, newOwningAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetOwningAnnotation() {
		ExtensionOperations.unsetOwningAnnotation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOwningAnnotation() {
		return ExtensionOperations.isSetOwningAnnotation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableElement getExtendableBase() {
		if (eContainerFeatureID() != CorePackage.EXTENSION__EXTENDABLE_BASE)
			return null;
		return (ExtendableElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableElement basicGetExtendableBase() {
		if (eContainerFeatureID() != CorePackage.EXTENSION__EXTENDABLE_BASE)
			return null;
		return (ExtendableElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendableBase(
			ExtendableElement newExtendableBase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newExtendableBase,
				CorePackage.EXTENSION__EXTENDABLE_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendableBase(ExtendableElement newExtendableBase) {
		if (newExtendableBase != eInternalContainer()
				|| (eContainerFeatureID() != CorePackage.EXTENSION__EXTENDABLE_BASE && newExtendableBase != null)) {
			if (EcoreUtil.isAncestor(this, newExtendableBase))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtendableBase != null)
				msgs = ((InternalEObject) newExtendableBase).eInverseAdd(this,
						CorePackage.EXTENDABLE_ELEMENT__EXTENSION,
						ExtendableElement.class, msgs);
			msgs = basicSetExtendableBase(newExtendableBase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.EXTENSION__EXTENDABLE_BASE, newExtendableBase,
					newExtendableBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetExtendableBase((ExtendableElement) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			return basicSetExtendableBase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			return eInternalContainer().eInverseRemove(this,
					CorePackage.EXTENDABLE_ELEMENT__EXTENSION,
					ExtendableElement.class, msgs);
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
		case CorePackage.EXTENSION__BASE:
			if (resolve)
				return getBase();
			return basicGetBase();
		case CorePackage.EXTENSION__MODEL_BASE:
			if (resolve)
				return getModelBase();
			return basicGetModelBase();
		case CorePackage.EXTENSION__OWNING_ANNOTATION:
			if (resolve)
				return getOwningAnnotation();
			return basicGetOwningAnnotation();
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			if (resolve)
				return getExtendableBase();
			return basicGetExtendableBase();
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
		case CorePackage.EXTENSION__MODEL_BASE:
			setModelBase((EModelElement) newValue);
			return;
		case CorePackage.EXTENSION__OWNING_ANNOTATION:
			setOwningAnnotation((EAnnotation) newValue);
			return;
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			setExtendableBase((ExtendableElement) newValue);
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
		case CorePackage.EXTENSION__MODEL_BASE:
			unsetModelBase();
			return;
		case CorePackage.EXTENSION__OWNING_ANNOTATION:
			unsetOwningAnnotation();
			return;
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			setExtendableBase((ExtendableElement) null);
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
		case CorePackage.EXTENSION__BASE:
			return isSetBase();
		case CorePackage.EXTENSION__MODEL_BASE:
			return isSetModelBase();
		case CorePackage.EXTENSION__OWNING_ANNOTATION:
			return isSetOwningAnnotation();
		case CorePackage.EXTENSION__EXTENDABLE_BASE:
			return basicGetExtendableBase() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBase() {
		return isSetModelBase()
				|| eIsSet(CorePackage.EXTENSION__EXTENDABLE_BASE);
	}

} //ExtensionImpl
