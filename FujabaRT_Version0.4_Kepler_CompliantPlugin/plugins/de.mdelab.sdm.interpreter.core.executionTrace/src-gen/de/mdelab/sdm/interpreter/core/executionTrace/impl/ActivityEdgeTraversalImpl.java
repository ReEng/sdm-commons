/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Edge Traversal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ActivityEdgeTraversalImpl#getActivityEdge
 * <em>Activity Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActivityEdgeTraversalImpl<ActivityEdgeType> extends ExecutionImpl implements ActivityEdgeTraversal<ActivityEdgeType>
{
	/**
	 * The cached value of the '{@link #getActivityEdge()
	 * <em>Activity Edge</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getActivityEdge()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdgeType	activityEdge;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActivityEdgeTraversalImpl()
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
		return ExecutionTracePackage.Literals.ACTIVITY_EDGE_TRAVERSAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ActivityEdgeType getActivityEdge()
	{
		if ((this.activityEdge != null) && ((EObject) this.activityEdge).eIsProxy())
		{
			final InternalEObject oldActivityEdge = (InternalEObject) this.activityEdge;
			this.activityEdge = (ActivityEdgeType) this.eResolveProxy(oldActivityEdge);
			if (this.activityEdge != oldActivityEdge)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE, oldActivityEdge, this.activityEdge));
				}
			}
		}
		return this.activityEdge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityEdgeType basicGetActivityEdge()
	{
		return this.activityEdge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setActivityEdge(final ActivityEdgeType newActivityEdge)
	{
		final ActivityEdgeType oldActivityEdge = this.activityEdge;
		this.activityEdge = newActivityEdge;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE,
					oldActivityEdge, this.activityEdge));
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
			case ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				if (resolve)
				{
					return this.getActivityEdge();
				}
				return this.basicGetActivityEdge();
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
			case ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				this.setActivityEdge((ActivityEdgeType) newValue);
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
			case ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				this.setActivityEdge((ActivityEdgeType) null);
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
			case ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				return this.activityEdge != null;
		}
		return super.eIsSet(featureID);
	}

} // ActivityEdgeTraversalImpl
