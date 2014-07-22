/**
 */
package de.upb.swt.core.ui.properties.tests.model.impl;

import de.upb.swt.core.ui.properties.tests.model.IntegerAttribute;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getByteValue <em>Byte Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getByteObjectValue <em>Byte Object Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getShortValue <em>Short Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getShortObjectValue <em>Short Object Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getIntegerObjectValue <em>Integer Object Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getLongValue <em>Long Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.IntegerAttributeImpl#getLongObjectValue <em>Long Object Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerAttributeImpl extends AttributeImpl implements IntegerAttribute {
	/**
	 * The default value of the '{@link #getByteValue() <em>Byte Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte BYTE_VALUE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getByteValue() <em>Byte Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteValue()
	 * @generated
	 * @ordered
	 */
	protected byte byteValue = BYTE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteObjectValue() <em>Byte Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Byte BYTE_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteObjectValue() <em>Byte Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Byte byteObjectValue = BYTE_OBJECT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortValue() <em>Short Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortValue()
	 * @generated
	 * @ordered
	 */
	protected static final short SHORT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShortValue() <em>Short Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortValue()
	 * @generated
	 * @ordered
	 */
	protected short shortValue = SHORT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortObjectValue() <em>Short Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Short SHORT_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortObjectValue() <em>Short Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Short shortObjectValue = SHORT_OBJECT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected int intValue = INT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegerObjectValue() <em>Integer Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTEGER_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegerObjectValue() <em>Integer Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Integer integerObjectValue = INTEGER_OBJECT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongValue() <em>Long Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongValue()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLongValue() <em>Long Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongValue()
	 * @generated
	 * @ordered
	 */
	protected long longValue = LONG_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongObjectValue() <em>Long Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Long LONG_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongObjectValue() <em>Long Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Long longObjectValue = LONG_OBJECT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INTEGER_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByteValue() {
		return byteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteValue(byte newByteValue) {
		byte oldByteValue = byteValue;
		byteValue = newByteValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__BYTE_VALUE,
					oldByteValue, byteValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getByteObjectValue() {
		return byteObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteObjectValue(Byte newByteObjectValue) {
		Byte oldByteObjectValue = byteObjectValue;
		byteObjectValue = newByteObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE,
					oldByteObjectValue, byteObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getShortValue() {
		return shortValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortValue(short newShortValue) {
		short oldShortValue = shortValue;
		shortValue = newShortValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__SHORT_VALUE,
					oldShortValue, shortValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getShortObjectValue() {
		return shortObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortObjectValue(Short newShortObjectValue) {
		Short oldShortObjectValue = shortObjectValue;
		shortObjectValue = newShortObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE,
					oldShortObjectValue, shortObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntValue() {
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntValue(int newIntValue) {
		int oldIntValue = intValue;
		intValue = newIntValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__INT_VALUE,
					oldIntValue, intValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIntegerObjectValue() {
		return integerObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerObjectValue(Integer newIntegerObjectValue) {
		Integer oldIntegerObjectValue = integerObjectValue;
		integerObjectValue = newIntegerObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE,
					oldIntegerObjectValue, integerObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLongValue() {
		return longValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongValue(long newLongValue) {
		long oldLongValue = longValue;
		longValue = newLongValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__LONG_VALUE,
					oldLongValue, longValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLongObjectValue() {
		return longObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongObjectValue(Long newLongObjectValue) {
		Long oldLongObjectValue = longObjectValue;
		longObjectValue = newLongObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE,
					oldLongObjectValue, longObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_VALUE:
			return getByteValue();
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE:
			return getByteObjectValue();
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_VALUE:
			return getShortValue();
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE:
			return getShortObjectValue();
		case ModelPackage.INTEGER_ATTRIBUTE__INT_VALUE:
			return getIntValue();
		case ModelPackage.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE:
			return getIntegerObjectValue();
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_VALUE:
			return getLongValue();
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE:
			return getLongObjectValue();
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
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_VALUE:
			setByteValue((Byte) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE:
			setByteObjectValue((Byte) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_VALUE:
			setShortValue((Short) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE:
			setShortObjectValue((Short) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__INT_VALUE:
			setIntValue((Integer) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE:
			setIntegerObjectValue((Integer) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_VALUE:
			setLongValue((Long) newValue);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE:
			setLongObjectValue((Long) newValue);
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
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_VALUE:
			setByteValue(BYTE_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE:
			setByteObjectValue(BYTE_OBJECT_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_VALUE:
			setShortValue(SHORT_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE:
			setShortObjectValue(SHORT_OBJECT_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__INT_VALUE:
			setIntValue(INT_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE:
			setIntegerObjectValue(INTEGER_OBJECT_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_VALUE:
			setLongValue(LONG_VALUE_EDEFAULT);
			return;
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE:
			setLongObjectValue(LONG_OBJECT_VALUE_EDEFAULT);
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
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_VALUE:
			return byteValue != BYTE_VALUE_EDEFAULT;
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE:
			return BYTE_OBJECT_VALUE_EDEFAULT == null ? byteObjectValue != null : !BYTE_OBJECT_VALUE_EDEFAULT
					.equals(byteObjectValue);
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_VALUE:
			return shortValue != SHORT_VALUE_EDEFAULT;
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE:
			return SHORT_OBJECT_VALUE_EDEFAULT == null ? shortObjectValue != null : !SHORT_OBJECT_VALUE_EDEFAULT
					.equals(shortObjectValue);
		case ModelPackage.INTEGER_ATTRIBUTE__INT_VALUE:
			return intValue != INT_VALUE_EDEFAULT;
		case ModelPackage.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE:
			return INTEGER_OBJECT_VALUE_EDEFAULT == null ? integerObjectValue != null : !INTEGER_OBJECT_VALUE_EDEFAULT
					.equals(integerObjectValue);
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_VALUE:
			return longValue != LONG_VALUE_EDEFAULT;
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE:
			return LONG_OBJECT_VALUE_EDEFAULT == null ? longObjectValue != null : !LONG_OBJECT_VALUE_EDEFAULT
					.equals(longObjectValue);
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
		result.append(" (byteValue: "); //$NON-NLS-1$
		result.append(byteValue);
		result.append(", byteObjectValue: "); //$NON-NLS-1$
		result.append(byteObjectValue);
		result.append(", shortValue: "); //$NON-NLS-1$
		result.append(shortValue);
		result.append(", shortObjectValue: "); //$NON-NLS-1$
		result.append(shortObjectValue);
		result.append(", intValue: "); //$NON-NLS-1$
		result.append(intValue);
		result.append(", integerObjectValue: "); //$NON-NLS-1$
		result.append(integerObjectValue);
		result.append(", longValue: "); //$NON-NLS-1$
		result.append(longValue);
		result.append(", longObjectValue: "); //$NON-NLS-1$
		result.append(longObjectValue);
		result.append(')');
		return result.toString();
	}

} //IntegerAttributeImpl
