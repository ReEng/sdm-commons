/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Node Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ActivityNodeExecutionImpl#getActivityNode
 * <em>Activity Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActivityNodeExecutionImpl<ActivityNodeType> extends ExecutionImpl implements ActivityNodeExecution<ActivityNodeType>
{
	/**
	 * The cached value of the '{@link #getActivityNode()
	 * <em>Activity Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getActivityNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNodeType	activityNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActivityNodeExecutionImpl()
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
		return ExecutionTracePackage.Literals.ACTIVITY_NODE_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ActivityNodeType getActivityNode()
	{
		if ((this.activityNode != null) && ((EObject) this.activityNode).eIsProxy())
		{
			final InternalEObject oldActivityNode = (InternalEObject) this.activityNode;
			this.activityNode = (ActivityNodeType) this.eResolveProxy(oldActivityNode);
			if (this.activityNode != oldActivityNode)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE, oldActivityNode, this.activityNode));
				}
			}
		}
		return this.activityNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityNodeType basicGetActivityNode()
	{
		return this.activityNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setActivityNode(final ActivityNodeType newActivityNode)
	{
		final ActivityNodeType oldActivityNode = this.activityNode;
		this.activityNode = newActivityNode;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE,
					oldActivityNode, this.activityNode));
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
			case ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				if (resolve)
				{
					return this.getActivityNode();
				}
				return this.basicGetActivityNode();
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
			case ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				this.setActivityNode((ActivityNodeType) newValue);
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
			case ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				this.setActivityNode((ActivityNodeType) null);
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
			case ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				return this.activityNode != null;
		}
		return super.eIsSet(featureID);
	}

} // ActivityNodeExecutionImpl
