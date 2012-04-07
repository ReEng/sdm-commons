/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.core.TypedElement;
import org.storydriven.core.impl.ExtensionImpl;
import org.storydriven.core.util.ExtensionOperations;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.storydriven.storydiagrams.Variable;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.ParameterExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.ParameterExtensionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterExtensionImpl extends ExtensionImpl implements ParameterExtension {
	/**
	 * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericType()
	 * @generated
	 * @ordered
	 */
	protected EGenericType genericType;

	/**
	 * This is true if the Generic Type containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genericTypeESet;

	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallsPackage.Literals.PARAMETER_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getType() {
		EClassifier type = basicGetType();
		return type != null && type.eIsProxy() ? (EClassifier)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClassifier basicGetType() {
		EParameter parameter = getParameter();
		return parameter == null ? null : parameter.getEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getGenericType() {
		if (genericType != null && genericType.eIsProxy()) {
			InternalEObject oldGenericType = (InternalEObject)genericType;
			genericType = (EGenericType)eResolveProxy(oldGenericType);
			if (genericType != oldGenericType) {
				InternalEObject newGenericType = (InternalEObject)genericType;
				NotificationChain msgs = oldGenericType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, null, null);
				if (newGenericType.eInternalContainer() == null) {
					msgs = newGenericType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, oldGenericType, genericType));
			}
		}
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType basicGetGenericType() {
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericType(EGenericType newGenericType, NotificationChain msgs) {
		EGenericType oldGenericType = genericType;
		genericType = newGenericType;
		boolean oldGenericTypeESet = genericTypeESet;
		genericTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, oldGenericType, newGenericType, !oldGenericTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericType(EGenericType newGenericType) {
		if (newGenericType != genericType) {
			NotificationChain msgs = null;
			if (genericType != null)
				msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, null, msgs);
			if (newGenericType != null)
				msgs = ((InternalEObject)newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, null, msgs);
			msgs = basicSetGenericType(newGenericType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGenericTypeESet = genericTypeESet;
			genericTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, newGenericType, newGenericType, !oldGenericTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetGenericType(NotificationChain msgs) {
		EGenericType oldGenericType = genericType;
		genericType = null;
		boolean oldGenericTypeESet = genericTypeESet;
		genericTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, oldGenericType, null, oldGenericTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenericType() {
		if (genericType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, null, msgs);
			msgs = basicUnsetGenericType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGenericTypeESet = genericTypeESet;
			genericTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE, null, null, oldGenericTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenericType() {
		return genericTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getVariableName() {
		ENamedElement namedElement = getParameter();
		return namedElement == null ? null : namedElement.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EParameter getParameter() {
		return (EParameter) ExtensionOperations.getModelBase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setParameter(EParameter newParameter) {
		ExtensionOperations.setModelBase(this, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetParameter() {
		ExtensionOperations.unsetModelBase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetParameter() {
		return ExtensionOperations.isSetModelBase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE:
				return basicUnsetGenericType(msgs);
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
			case CallsPackage.PARAMETER_EXTENSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE:
				if (resolve) return getGenericType();
				return basicGetGenericType();
			case CallsPackage.PARAMETER_EXTENSION__VARIABLE_NAME:
				return getVariableName();
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				return getParameter();
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
			case CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE:
				setGenericType((EGenericType)newValue);
				return;
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				setParameter((EParameter)newValue);
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
			case CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE:
				unsetGenericType();
				return;
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				unsetParameter();
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
			case CallsPackage.PARAMETER_EXTENSION__TYPE:
				return isSetType();
			case CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE:
				return isSetGenericType();
			case CallsPackage.PARAMETER_EXTENSION__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? getVariableName() != null : !VARIABLE_NAME_EDEFAULT.equals(getVariableName());
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				return isSetParameter();
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case CallsPackage.PARAMETER_EXTENSION__TYPE: return CorePackage.TYPED_ELEMENT__TYPE;
				case CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE: return CorePackage.TYPED_ELEMENT__GENERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case CallsPackage.PARAMETER_EXTENSION__VARIABLE_NAME: return StorydiagramsPackage.VARIABLE__VARIABLE_NAME;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.TYPED_ELEMENT__TYPE: return CallsPackage.PARAMETER_EXTENSION__TYPE;
				case CorePackage.TYPED_ELEMENT__GENERIC_TYPE: return CallsPackage.PARAMETER_EXTENSION__GENERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case StorydiagramsPackage.VARIABLE__VARIABLE_NAME: return CallsPackage.PARAMETER_EXTENSION__VARIABLE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public boolean isSetType() {
		return false;
	}

	@Override
	public boolean isSetBase() {
		return isSetParameter();
	}

	@Override
	public boolean isSetOwningAnnotation() {
		return ExtensionOperations.isSetOwningAnnotation(this);
	}

	@Override
	public void unsetOwningAnnotation() {
		ExtensionOperations.unsetOwningAnnotation(this);
	}

	@Override
	public void setOwningAnnotation(EAnnotation newOwningAnnotation) {
		ExtensionOperations.setOwningAnnotation(this, newOwningAnnotation);
	}

	@Override
	public EAnnotation basicGetOwningAnnotation() {
		return ExtensionOperations.getOwningAnnotation(this);
	}

	@Override
	public boolean isSetModelBase() {
		return isSetParameter();
	}

	@Override
	public void unsetModelBase() {
		unsetParameter();
	}

	@Override
	public void setModelBase(EModelElement newModelBase) {
		setParameter((EParameter) newModelBase);
	}

	@Override
	public EModelElement basicGetModelBase() {
		return getParameter();
	}
} //ParameterExtensionImpl
