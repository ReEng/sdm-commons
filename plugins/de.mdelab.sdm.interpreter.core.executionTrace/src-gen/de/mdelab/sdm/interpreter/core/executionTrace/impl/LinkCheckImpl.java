/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Link Check</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.LinkCheckImpl#getTargetObject
 * <em>Target Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class LinkCheckImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		StoryPatternLinkExecutionImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		LinkCheck<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * The default value of the '{@link #getTargetObject()
	 * <em>Target Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetObject()
	 * @generated
	 * @ordered
	 */
	protected static final String	TARGET_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getTargetObject()
	 * <em>Target Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetObject()
	 * @generated
	 * @ordered
	 */
	protected String				targetObject			= LinkCheckImpl.TARGET_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LinkCheckImpl()
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
		return ExecutionTracePackage.Literals.LINK_CHECK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTargetObject()
	{
		return this.targetObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTargetObject(final String newTargetObject)
	{
		final String oldTargetObject = this.targetObject;
		this.targetObject = newTargetObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.LINK_CHECK__TARGET_OBJECT, oldTargetObject,
					this.targetObject));
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
			case ExecutionTracePackage.LINK_CHECK__TARGET_OBJECT:
				return this.getTargetObject();
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
			case ExecutionTracePackage.LINK_CHECK__TARGET_OBJECT:
				this.setTargetObject((String) newValue);
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
			case ExecutionTracePackage.LINK_CHECK__TARGET_OBJECT:
				this.setTargetObject(LinkCheckImpl.TARGET_OBJECT_EDEFAULT);
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
			case ExecutionTracePackage.LINK_CHECK__TARGET_OBJECT:
				return LinkCheckImpl.TARGET_OBJECT_EDEFAULT == null ? this.targetObject != null : !LinkCheckImpl.TARGET_OBJECT_EDEFAULT
						.equals(this.targetObject);
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
		result.append(" (targetObject: ");
		result.append(this.targetObject);
		result.append(')');
		return result.toString();
	}

} // LinkCheckImpl
