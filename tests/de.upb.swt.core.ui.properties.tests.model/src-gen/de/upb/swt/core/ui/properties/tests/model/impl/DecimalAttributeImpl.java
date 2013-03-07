/**
 */
package de.upb.swt.core.ui.properties.tests.model.impl;

import de.upb.swt.core.ui.properties.tests.model.DecimalAttribute;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.DecimalAttributeImpl#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.DecimalAttributeImpl#getFloatObjectValue <em>Float Object Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.DecimalAttributeImpl#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.DecimalAttributeImpl#getDoubleObjectValue <em>Double Object Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.impl.DecimalAttributeImpl#getBigDecimalValue <em>Big Decimal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalAttributeImpl extends AttributeImpl implements DecimalAttribute {
	/**
	 * The default value of the '{@link #getFloatValue() <em>Float Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatValue()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloatValue() <em>Float Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatValue()
	 * @generated
	 * @ordered
	 */
	protected float floatValue = FLOAT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatObjectValue() <em>Float Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Float FLOAT_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatObjectValue() <em>Float Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Float floatObjectValue = FLOAT_OBJECT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected double doubleValue = DOUBLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleObjectValue() <em>Double Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObjectValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_OBJECT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoubleObjectValue() <em>Double Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObjectValue()
	 * @generated
	 * @ordered
	 */
	protected Double doubleObjectValue = DOUBLE_OBJECT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigDecimalValue() <em>Big Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIG_DECIMAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBigDecimalValue() <em>Big Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimalValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bigDecimalValue = BIG_DECIMAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DECIMAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloatValue() {
		return floatValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatValue(float newFloatValue) {
		float oldFloatValue = floatValue;
		floatValue = newFloatValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_VALUE,
					oldFloatValue, floatValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFloatObjectValue() {
		return floatObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatObjectValue(Float newFloatObjectValue) {
		Float oldFloatObjectValue = floatObjectValue;
		floatObjectValue = newFloatObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_OBJECT_VALUE,
					oldFloatObjectValue, floatObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDoubleValue() {
		return doubleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleValue(double newDoubleValue) {
		double oldDoubleValue = doubleValue;
		doubleValue = newDoubleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_VALUE,
					oldDoubleValue, doubleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDoubleObjectValue() {
		return doubleObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleObjectValue(Double newDoubleObjectValue) {
		Double oldDoubleObjectValue = doubleObjectValue;
		doubleObjectValue = newDoubleObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_OBJECT_VALUE,
					oldDoubleObjectValue, doubleObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBigDecimalValue() {
		return bigDecimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigDecimalValue(BigDecimal newBigDecimalValue) {
		BigDecimal oldBigDecimalValue = bigDecimalValue;
		bigDecimalValue = newBigDecimalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECIMAL_ATTRIBUTE__BIG_DECIMAL_VALUE,
					oldBigDecimalValue, bigDecimalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_VALUE:
			return getFloatValue();
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_OBJECT_VALUE:
			return getFloatObjectValue();
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_VALUE:
			return getDoubleValue();
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_OBJECT_VALUE:
			return getDoubleObjectValue();
		case ModelPackage.DECIMAL_ATTRIBUTE__BIG_DECIMAL_VALUE:
			return getBigDecimalValue();
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
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_VALUE:
			setFloatValue((Float) newValue);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_OBJECT_VALUE:
			setFloatObjectValue((Float) newValue);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_VALUE:
			setDoubleValue((Double) newValue);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_OBJECT_VALUE:
			setDoubleObjectValue((Double) newValue);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__BIG_DECIMAL_VALUE:
			setBigDecimalValue((BigDecimal) newValue);
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
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_VALUE:
			setFloatValue(FLOAT_VALUE_EDEFAULT);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_OBJECT_VALUE:
			setFloatObjectValue(FLOAT_OBJECT_VALUE_EDEFAULT);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_VALUE:
			setDoubleValue(DOUBLE_VALUE_EDEFAULT);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_OBJECT_VALUE:
			setDoubleObjectValue(DOUBLE_OBJECT_VALUE_EDEFAULT);
			return;
		case ModelPackage.DECIMAL_ATTRIBUTE__BIG_DECIMAL_VALUE:
			setBigDecimalValue(BIG_DECIMAL_VALUE_EDEFAULT);
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
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_VALUE:
			return floatValue != FLOAT_VALUE_EDEFAULT;
		case ModelPackage.DECIMAL_ATTRIBUTE__FLOAT_OBJECT_VALUE:
			return FLOAT_OBJECT_VALUE_EDEFAULT == null ? floatObjectValue != null : !FLOAT_OBJECT_VALUE_EDEFAULT
					.equals(floatObjectValue);
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_VALUE:
			return doubleValue != DOUBLE_VALUE_EDEFAULT;
		case ModelPackage.DECIMAL_ATTRIBUTE__DOUBLE_OBJECT_VALUE:
			return DOUBLE_OBJECT_VALUE_EDEFAULT == null ? doubleObjectValue != null : !DOUBLE_OBJECT_VALUE_EDEFAULT
					.equals(doubleObjectValue);
		case ModelPackage.DECIMAL_ATTRIBUTE__BIG_DECIMAL_VALUE:
			return BIG_DECIMAL_VALUE_EDEFAULT == null ? bigDecimalValue != null : !BIG_DECIMAL_VALUE_EDEFAULT
					.equals(bigDecimalValue);
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
		result.append(" (floatValue: "); //$NON-NLS-1$
		result.append(floatValue);
		result.append(", floatObjectValue: "); //$NON-NLS-1$
		result.append(floatObjectValue);
		result.append(", doubleValue: "); //$NON-NLS-1$
		result.append(doubleValue);
		result.append(", doubleObjectValue: "); //$NON-NLS-1$
		result.append(doubleObjectValue);
		result.append(", bigDecimalValue: "); //$NON-NLS-1$
		result.append(bigDecimalValue);
		result.append(')');
		return result.toString();
	}

} //DecimalAttributeImpl
