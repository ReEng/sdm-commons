/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extendable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.core.impl.ExtendableElementImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link org.storydriven.core.impl.ExtendableElementImpl#getExtensions <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExtendableElementImpl extends EObjectImpl implements
		ExtendableElement {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXTENDABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(
					EAnnotation.class, this,
					CorePackage.EXTENDABLE_ELEMENT__ANNOTATION);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(
					Extension.class, this,
					CorePackage.EXTENDABLE_ELEMENT__EXTENSION,
					CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CorePackage.EXTENDABLE_ELEMENT__EXTENSION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtensions())
					.basicAdd(otherEnd, msgs);
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
		case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd,
					msgs);
		case CorePackage.EXTENDABLE_ELEMENT__EXTENSION:
			return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION:
			return getAnnotations();
		case CorePackage.EXTENDABLE_ELEMENT__EXTENSION:
			return getExtensions();
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
		case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION:
			getAnnotations().clear();
			getAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
			return;
		case CorePackage.EXTENDABLE_ELEMENT__EXTENSION:
			getExtensions().clear();
			getExtensions().addAll((Collection<? extends Extension>) newValue);
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
		case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION:
			getAnnotations().clear();
			return;
		case CorePackage.EXTENDABLE_ELEMENT__EXTENSION:
			getExtensions().clear();
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
		case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION:
			return annotations != null && !annotations.isEmpty();
		case CorePackage.EXTENDABLE_ELEMENT__EXTENSION:
			return extensions != null && !extensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS:
			return getExtension((EClass) arguments.get(0));
		case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS:
			return provideExtension((EClass) arguments.get(0));
		case CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING:
			return getAnnotation((String) arguments.get(0));
		case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING:
			return provideAnnotation((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtendableElementImpl
