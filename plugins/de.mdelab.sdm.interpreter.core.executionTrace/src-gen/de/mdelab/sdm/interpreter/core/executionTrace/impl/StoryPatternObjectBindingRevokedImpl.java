/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Binding Revoked</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternObjectBindingRevokedImpl#getPreviousValue
 * <em>Previous Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StoryPatternObjectBindingRevokedImpl<StoryPatternObjectType> extends StoryPatternObjectExecutionImpl<StoryPatternObjectType>
		implements StoryPatternObjectBindingRevoked<StoryPatternObjectType>
{
	/**
	 * The default value of the '{@link #getPreviousValue()
	 * <em>Previous Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPreviousValue()
	 * @generated
	 * @ordered
	 */
	protected static final String	PREVIOUS_VALUE_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getPreviousValue()
	 * <em>Previous Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPreviousValue()
	 * @generated
	 * @ordered
	 */
	protected String				previousValue			= StoryPatternObjectBindingRevokedImpl.PREVIOUS_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternObjectBindingRevokedImpl()
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
		return ExecutionTracePackage.Literals.STORY_PATTERN_OBJECT_BINDING_REVOKED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPreviousValue()
	{
		return this.previousValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPreviousValue(final String newPreviousValue)
	{
		final String oldPreviousValue = this.previousValue;
		this.previousValue = newPreviousValue;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE, oldPreviousValue, this.previousValue));
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				return this.getPreviousValue();
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				this.setPreviousValue((String) newValue);
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				this.setPreviousValue(StoryPatternObjectBindingRevokedImpl.PREVIOUS_VALUE_EDEFAULT);
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				return StoryPatternObjectBindingRevokedImpl.PREVIOUS_VALUE_EDEFAULT == null ? this.previousValue != null
						: !StoryPatternObjectBindingRevokedImpl.PREVIOUS_VALUE_EDEFAULT.equals(this.previousValue);
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
		result.append(" (previousValue: ");
		result.append(this.previousValue);
		result.append(')');
		return result.toString();
	}

} // StoryPatternObjectBindingRevokedImpl
