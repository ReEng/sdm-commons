/**
 */
package de.upb.swt.core.ui.properties.tests.model.impl;

import de.upb.swt.core.ui.properties.tests.model.BooleanAttribute;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.BooleanAttributeImpl#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.BooleanAttributeImpl#getBooleanObjectValue <em>Boolean Object Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanAttributeImpl extends AttributeImpl implements BooleanAttribute {
	/**
	 * The default value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooleanObjectValue() <em>Boolean Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooleanObjectValue() <em>Boolean Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean booleanObjectValue = BOOLEAN_OBJECT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOLEAN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(boolean newBooleanValue) {
		boolean oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_VALUE,
					oldBooleanValue, booleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBooleanObjectValue() {
		return booleanObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanObjectValue(Boolean newBooleanObjectValue) {
		Boolean oldBooleanObjectValue = booleanObjectValue;
		booleanObjectValue = newBooleanObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_OBJECT_VALUE,
					oldBooleanObjectValue, booleanObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_VALUE:
			return isBooleanValue();
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_OBJECT_VALUE:
			return getBooleanObjectValue();
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
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_VALUE:
			setBooleanValue((Boolean) newValue);
			return;
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_OBJECT_VALUE:
			setBooleanObjectValue((Boolean) newValue);
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
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_VALUE:
			setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
			return;
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_OBJECT_VALUE:
			setBooleanObjectValue(BOOLEAN_OBJECT_VALUE_EDEFAULT);
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
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_VALUE:
			return booleanValue != BOOLEAN_VALUE_EDEFAULT;
		case ModelPackage.BOOLEAN_ATTRIBUTE__BOOLEAN_OBJECT_VALUE:
			return BOOLEAN_OBJECT_VALUE_EDEFAULT == null ? booleanObjectValue != null : !BOOLEAN_OBJECT_VALUE_EDEFAULT
					.equals(booleanObjectValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (booleanValue: "); //$NON-NLS-1$
		result.append(booleanValue);
		result.append(", booleanObjectValue: "); //$NON-NLS-1$
		result.append(booleanObjectValue);
		result.append(')');
		return result.toString();
	}

} //BooleanAttributeImpl
