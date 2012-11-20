/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Map Entry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.MapEntryImpl#getTypedKey
 * <em>Key</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.MapEntryImpl#getTypedValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MapEntryImpl<KeyType, ValueType> extends EObjectImpl implements BasicEMap.Entry<KeyType, ValueType>
{
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected KeyType	key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected ValueType	value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MapEntryImpl()
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
		return ExecutionTracePackage.Literals.MAP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public KeyType getTypedKey()
	{
		return this.key;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypedKey(final KeyType newKey)
	{
		final KeyType oldKey = this.key;
		this.key = newKey;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.MAP_ENTRY__KEY, oldKey, this.key));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueType getTypedValue()
	{
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypedValue(final ValueType newValue)
	{
		final ValueType oldValue = this.value;
		this.value = newValue;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.MAP_ENTRY__VALUE, oldValue, this.value));
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
			case ExecutionTracePackage.MAP_ENTRY__KEY:
				return this.getTypedKey();
			case ExecutionTracePackage.MAP_ENTRY__VALUE:
				return this.getTypedValue();
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
	public void eSet(final int featureID, final Object newValue)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.MAP_ENTRY__KEY:
				this.setTypedKey((KeyType) newValue);
				return;
			case ExecutionTracePackage.MAP_ENTRY__VALUE:
				this.setTypedValue((ValueType) newValue);
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
			case ExecutionTracePackage.MAP_ENTRY__KEY:
				this.setTypedKey((KeyType) null);
				return;
			case ExecutionTracePackage.MAP_ENTRY__VALUE:
				this.setTypedValue((ValueType) null);
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
			case ExecutionTracePackage.MAP_ENTRY__KEY:
				return this.key != null;
			case ExecutionTracePackage.MAP_ENTRY__VALUE:
				return this.value != null;
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
		result.append(" (key: ");
		result.append(this.key);
		result.append(", value: ");
		result.append(this.value);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected int	hash	= -1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getHash()
	{
		if (this.hash == -1)
		{
			final Object theKey = this.getKey();
			this.hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return this.hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHash(final int hash)
	{
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public KeyType getKey()
	{
		return this.getTypedKey();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKey(final KeyType key)
	{
		this.setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ValueType getValue()
	{
		return this.getTypedValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ValueType setValue(final ValueType value)
	{
		final ValueType oldValue = this.getValue();
		this.setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<KeyType, ValueType> getEMap()
	{
		final EObject container = this.eContainer();
		return container == null ? null : (EMap<KeyType, ValueType>) container.eGet(this.eContainmentFeature());
	}

} // MapEntryImpl
