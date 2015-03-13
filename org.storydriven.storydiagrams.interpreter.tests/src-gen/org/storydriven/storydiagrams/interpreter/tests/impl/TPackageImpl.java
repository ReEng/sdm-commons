/**
 */
package org.storydriven.storydiagrams.interpreter.tests.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.storydiagrams.interpreter.tests.TModel;
import org.storydriven.storydiagrams.interpreter.tests.TPackage;
import org.storydriven.storydiagrams.interpreter.tests.TType;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TPackage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl#getName <em>Name</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl#getModel <em>Model</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl#getContainingPackage <em>Containing
 * Package</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl#getPackages <em>Packages</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TPackageImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TPackageImpl extends MinimalEObjectImpl.Container implements TPackage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TPackage> packages;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TType> types;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.Literals.TPACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TModel getModel() {
		if (eContainerFeatureID() != TestsPackage.TPACKAGE__MODEL)
			return null;
		return (TModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetModel(TModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModel, TestsPackage.TPACKAGE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModel(TModel newModel) {
		if (newModel != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.TPACKAGE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel)
						.eInverseAdd(this, TestsPackage.TMODEL__PACKAGES, TModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TPACKAGE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TPackage getContainingPackage() {
		if (eContainerFeatureID() != TestsPackage.TPACKAGE__CONTAINING_PACKAGE)
			return null;
		return (TPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainingPackage(TPackage newContainingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainingPackage, TestsPackage.TPACKAGE__CONTAINING_PACKAGE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingPackage(TPackage newContainingPackage) {
		if (newContainingPackage != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.TPACKAGE__CONTAINING_PACKAGE && newContainingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newContainingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingPackage != null)
				msgs = ((InternalEObject) newContainingPackage).eInverseAdd(this, TestsPackage.TPACKAGE__PACKAGES,
						TPackage.class, msgs);
			msgs = basicSetContainingPackage(newContainingPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TPACKAGE__CONTAINING_PACKAGE,
					newContainingPackage, newContainingPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<TPackage>(TPackage.class, this,
					TestsPackage.TPACKAGE__PACKAGES, TestsPackage.TPACKAGE__CONTAINING_PACKAGE);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<TType>(TType.class, this, TestsPackage.TPACKAGE__TYPES,
					TestsPackage.TTYPE__CONTAINING_PACKAGE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestsPackage.TPACKAGE__MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModel((TModel) otherEnd, msgs);
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingPackage((TPackage) otherEnd, msgs);
		case TestsPackage.TPACKAGE__PACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackages()).basicAdd(otherEnd, msgs);
		case TestsPackage.TPACKAGE__TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestsPackage.TPACKAGE__MODEL:
			return basicSetModel(null, msgs);
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			return basicSetContainingPackage(null, msgs);
		case TestsPackage.TPACKAGE__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case TestsPackage.TPACKAGE__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TestsPackage.TPACKAGE__MODEL:
			return eInternalContainer().eInverseRemove(this, TestsPackage.TMODEL__PACKAGES, TModel.class, msgs);
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			return eInternalContainer().eInverseRemove(this, TestsPackage.TPACKAGE__PACKAGES, TPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestsPackage.TPACKAGE__NAME:
			return getName();
		case TestsPackage.TPACKAGE__MODEL:
			return getModel();
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			return getContainingPackage();
		case TestsPackage.TPACKAGE__PACKAGES:
			return getPackages();
		case TestsPackage.TPACKAGE__TYPES:
			return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestsPackage.TPACKAGE__NAME:
			setName((String) newValue);
			return;
		case TestsPackage.TPACKAGE__MODEL:
			setModel((TModel) newValue);
			return;
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			setContainingPackage((TPackage) newValue);
			return;
		case TestsPackage.TPACKAGE__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends TPackage>) newValue);
			return;
		case TestsPackage.TPACKAGE__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends TType>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestsPackage.TPACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TestsPackage.TPACKAGE__MODEL:
			setModel((TModel) null);
			return;
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			setContainingPackage((TPackage) null);
			return;
		case TestsPackage.TPACKAGE__PACKAGES:
			getPackages().clear();
			return;
		case TestsPackage.TPACKAGE__TYPES:
			getTypes().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestsPackage.TPACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TestsPackage.TPACKAGE__MODEL:
			return getModel() != null;
		case TestsPackage.TPACKAGE__CONTAINING_PACKAGE:
			return getContainingPackage() != null;
		case TestsPackage.TPACKAGE__PACKAGES:
			return packages != null && !packages.isEmpty();
		case TestsPackage.TPACKAGE__TYPES:
			return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // TPackageImpl
