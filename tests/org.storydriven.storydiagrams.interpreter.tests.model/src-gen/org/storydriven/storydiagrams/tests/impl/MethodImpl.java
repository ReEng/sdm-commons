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

import org.storydriven.storydiagrams.tests.Method;
import org.storydriven.storydiagrams.tests.Parameter;
import org.storydriven.storydiagrams.tests.Statement;
import org.storydriven.storydiagrams.tests.TestsPackage;
import org.storydriven.storydiagrams.tests.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.MethodImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.tests.impl.MethodImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends MemberImpl implements Method {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getContainer() {
		if (eContainerFeatureID() != TestsPackage.METHOD__CONTAINER)
			return null;
		return (Type) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Type newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, TestsPackage.METHOD__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Type newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.METHOD__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, TestsPackage.TYPE__METHODS, Type.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.METHOD__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this,
					TestsPackage.METHOD__PARAMETERS, TestsPackage.PARAMETER__METHOD);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentWithInverseEList<Statement>(Statement.class, this,
					TestsPackage.METHOD__STATEMENTS, TestsPackage.STATEMENT__METHOD);
		}
		return statements;
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
		case TestsPackage.METHOD__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((Type) otherEnd, msgs);
		case TestsPackage.METHOD__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
		case TestsPackage.METHOD__STATEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStatements()).basicAdd(otherEnd, msgs);
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
		case TestsPackage.METHOD__CONTAINER:
			return basicSetContainer(null, msgs);
		case TestsPackage.METHOD__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case TestsPackage.METHOD__STATEMENTS:
			return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
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
		case TestsPackage.METHOD__CONTAINER:
			return eInternalContainer().eInverseRemove(this, TestsPackage.TYPE__METHODS, Type.class, msgs);
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
		case TestsPackage.METHOD__CONTAINER:
			return getContainer();
		case TestsPackage.METHOD__PARAMETERS:
			return getParameters();
		case TestsPackage.METHOD__STATEMENTS:
			return getStatements();
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
		case TestsPackage.METHOD__CONTAINER:
			setContainer((Type) newValue);
			return;
		case TestsPackage.METHOD__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case TestsPackage.METHOD__STATEMENTS:
			getStatements().clear();
			getStatements().addAll((Collection<? extends Statement>) newValue);
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
		case TestsPackage.METHOD__CONTAINER:
			setContainer((Type) null);
			return;
		case TestsPackage.METHOD__PARAMETERS:
			getParameters().clear();
			return;
		case TestsPackage.METHOD__STATEMENTS:
			getStatements().clear();
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
		case TestsPackage.METHOD__CONTAINER:
			return getContainer() != null;
		case TestsPackage.METHOD__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case TestsPackage.METHOD__STATEMENTS:
			return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
