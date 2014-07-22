/**
 * <copyright>
 * 	Copyright 2012 by storydriven.org and others. All rights reserved. This program and its materials are made
 * 	available under the terms of the Eclipse Public License v1.0 which is referenced in this distribution.
 * 
 * 	Contributors:
 * 		Aljoscha Hark <aljoscha@aljoschability.com> - Initial code
 * 
 * </copyright>
 * 
 * $Id$
 */
package org.storydriven.storydiagrams.tests.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.storydiagrams.tests.Project;
import org.storydriven.storydiagrams.tests.TestsPackage;
import org.storydriven.storydiagrams.tests.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.PackageImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.PackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.PackageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.PackageImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedImpl implements org.storydriven.storydiagrams.tests.Package {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<org.storydriven.storydiagrams.tests.Package> children;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != TestsPackage.PACKAGE__PROJECT)
			return null;
		return (Project) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProject, TestsPackage.PACKAGE__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.PACKAGE__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject) newProject).eInverseAdd(this, TestsPackage.PROJECT__PACKAGES, Project.class,
						msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.PACKAGE__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.storydriven.storydiagrams.tests.Package getParent() {
		if (eContainerFeatureID() != TestsPackage.PACKAGE__PARENT)
			return null;
		return (org.storydriven.storydiagrams.tests.Package) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(org.storydriven.storydiagrams.tests.Package newParent,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, TestsPackage.PACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(org.storydriven.storydiagrams.tests.Package newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.PACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, TestsPackage.PACKAGE__CHILDREN,
						org.storydriven.storydiagrams.tests.Package.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.PACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.storydriven.storydiagrams.tests.Package> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<org.storydriven.storydiagrams.tests.Package>(
					org.storydriven.storydiagrams.tests.Package.class, this, TestsPackage.PACKAGE__CHILDREN,
					TestsPackage.PACKAGE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<Type>(Type.class, this, TestsPackage.PACKAGE__TYPES,
					TestsPackage.TYPE__PACKAGE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestsPackage.PACKAGE__PROJECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProject((Project) otherEnd, msgs);
		case TestsPackage.PACKAGE__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((org.storydriven.storydiagrams.tests.Package) otherEnd, msgs);
		case TestsPackage.PACKAGE__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		case TestsPackage.PACKAGE__TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTypes()).basicAdd(otherEnd, msgs);
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
		case TestsPackage.PACKAGE__PROJECT:
			return basicSetProject(null, msgs);
		case TestsPackage.PACKAGE__PARENT:
			return basicSetParent(null, msgs);
		case TestsPackage.PACKAGE__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case TestsPackage.PACKAGE__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
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
		case TestsPackage.PACKAGE__PROJECT:
			return eInternalContainer().eInverseRemove(this, TestsPackage.PROJECT__PACKAGES, Project.class, msgs);
		case TestsPackage.PACKAGE__PARENT:
			return eInternalContainer().eInverseRemove(this, TestsPackage.PACKAGE__CHILDREN,
					org.storydriven.storydiagrams.tests.Package.class, msgs);
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
		case TestsPackage.PACKAGE__PROJECT:
			return getProject();
		case TestsPackage.PACKAGE__PARENT:
			return getParent();
		case TestsPackage.PACKAGE__CHILDREN:
			return getChildren();
		case TestsPackage.PACKAGE__TYPES:
			return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestsPackage.PACKAGE__PROJECT:
			setProject((Project) newValue);
			return;
		case TestsPackage.PACKAGE__PARENT:
			setParent((org.storydriven.storydiagrams.tests.Package) newValue);
			return;
		case TestsPackage.PACKAGE__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends org.storydriven.storydiagrams.tests.Package>) newValue);
			return;
		case TestsPackage.PACKAGE__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends Type>) newValue);
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
		case TestsPackage.PACKAGE__PROJECT:
			setProject((Project) null);
			return;
		case TestsPackage.PACKAGE__PARENT:
			setParent((org.storydriven.storydiagrams.tests.Package) null);
			return;
		case TestsPackage.PACKAGE__CHILDREN:
			getChildren().clear();
			return;
		case TestsPackage.PACKAGE__TYPES:
			getTypes().clear();
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
		case TestsPackage.PACKAGE__PROJECT:
			return getProject() != null;
		case TestsPackage.PACKAGE__PARENT:
			return getParent() != null;
		case TestsPackage.PACKAGE__CHILDREN:
			return children != null && !children.isEmpty();
		case TestsPackage.PACKAGE__TYPES:
			return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
