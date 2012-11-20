/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ActivityExecutionImpl#getActivity
 * <em>Activity</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ActivityExecutionImpl#getInParameterValues
 * <em>In Parameter Values</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ActivityExecutionImpl#getOutParameterValues
 * <em>Out Parameter Values</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActivityExecutionImpl<ActivityType> extends ExecutionImpl implements ActivityExecution<ActivityType>
{
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected ActivityType			activity;

	/**
	 * The cached value of the '{@link #getInParameterValues()
	 * <em>In Parameter Values</em>}' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String>	inParameterValues;

	/**
	 * The cached value of the '{@link #getOutParameterValues()
	 * <em>Out Parameter Values</em>}' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String>	outParameterValues;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActivityExecutionImpl()
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
		return ExecutionTracePackage.Literals.ACTIVITY_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ActivityType getActivity()
	{
		if ((this.activity != null) && ((EObject) this.activity).eIsProxy())
		{
			final InternalEObject oldActivity = (InternalEObject) this.activity;
			this.activity = (ActivityType) this.eResolveProxy(oldActivity);
			if (this.activity != oldActivity)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY,
							oldActivity, this.activity));
				}
			}
		}
		return this.activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityType basicGetActivity()
	{
		return this.activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setActivity(final ActivityType newActivity)
	{
		final ActivityType oldActivity = this.activity;
		this.activity = newActivity;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY, oldActivity,
					this.activity));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EMap<String, String> getInParameterValues()
	{
		if (this.inParameterValues == null)
		{
			this.inParameterValues = new EcoreEMap<String, String>(ExecutionTracePackage.Literals.MAP_ENTRY, MapEntryImpl.class, this,
					ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES);
		}
		return this.inParameterValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EMap<String, String> getOutParameterValues()
	{
		if (this.outParameterValues == null)
		{
			this.outParameterValues = new EcoreEMap<String, String>(ExecutionTracePackage.Literals.MAP_ENTRY, MapEntryImpl.class, this,
					ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES);
		}
		return this.outParameterValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				return ((InternalEList<?>) this.getInParameterValues()).basicRemove(otherEnd, msgs);
			case ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				return ((InternalEList<?>) this.getOutParameterValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				if (resolve)
				{
					return this.getActivity();
				}
				return this.basicGetActivity();
			case ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				if (coreType)
				{
					return this.getInParameterValues();
				}
				else
				{
					return this.getInParameterValues().map();
				}
			case ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				if (coreType)
				{
					return this.getOutParameterValues();
				}
				else
				{
					return this.getOutParameterValues().map();
				}
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
			case ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				this.setActivity((ActivityType) newValue);
				return;
			case ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				((EStructuralFeature.Setting) this.getInParameterValues()).set(newValue);
				return;
			case ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				((EStructuralFeature.Setting) this.getOutParameterValues()).set(newValue);
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
			case ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				this.setActivity((ActivityType) null);
				return;
			case ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				this.getInParameterValues().clear();
				return;
			case ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				this.getOutParameterValues().clear();
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
			case ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				return this.activity != null;
			case ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				return (this.inParameterValues != null) && !this.inParameterValues.isEmpty();
			case ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				return (this.outParameterValues != null) && !this.outParameterValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ActivityExecutionImpl
