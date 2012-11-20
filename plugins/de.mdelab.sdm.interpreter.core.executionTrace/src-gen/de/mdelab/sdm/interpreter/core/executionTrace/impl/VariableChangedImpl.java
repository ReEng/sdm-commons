/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableChanged;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Changed</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.VariableChangedImpl#getOldValue
 * <em>Old Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VariableChangedImpl<ClassifierType> extends VariableModificationImpl<ClassifierType> implements
		VariableChanged<ClassifierType>
{
	/**
	 * The default value of the '{@link #getOldValue() <em>Old Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected static final String	OLD_VALUE_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getOldValue() <em>Old Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected String				oldValue			= VariableChangedImpl.OLD_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableChangedImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutionTracePackage.Literals.VARIABLE_CHANGED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getOldValue()
	{
		return this.oldValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOldValue(final String newOldValue)
	{
		final String oldOldValue = this.oldValue;
		this.oldValue = newOldValue;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.VARIABLE_CHANGED__OLD_VALUE, oldOldValue,
					this.oldValue));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.VARIABLE_CHANGED__OLD_VALUE:
				return this.getOldValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.VARIABLE_CHANGED__OLD_VALUE:
				this.setOldValue((String) newValue);
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
	public void eUnset(final int featureID)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.VARIABLE_CHANGED__OLD_VALUE:
				this.setOldValue(VariableChangedImpl.OLD_VALUE_EDEFAULT);
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
	public boolean eIsSet(final int featureID)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.VARIABLE_CHANGED__OLD_VALUE:
				return VariableChangedImpl.OLD_VALUE_EDEFAULT == null ? this.oldValue != null : !VariableChangedImpl.OLD_VALUE_EDEFAULT
						.equals(this.oldValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (this.eIsProxy())
		{
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (oldValue: ");
		result.append(this.oldValue);
		result.append(')');
		return result.toString();
	}

} // VariableChangedImpl
