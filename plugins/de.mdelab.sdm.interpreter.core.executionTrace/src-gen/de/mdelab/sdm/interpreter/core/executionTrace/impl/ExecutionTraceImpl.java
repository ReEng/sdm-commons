/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.mdelab.sdm.interpreter.core.executionTrace.Execution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Execution Trace</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionTraceImpl#getExecutions
 * <em>Executions</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionTraceImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionTraceImpl#getTotalExecutionTime
 * <em>Total Execution Time</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionTraceImpl#getTotalExecutionTimeMsec
 * <em>Total Execution Time Msec</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExecutionTraceImpl extends EObjectImpl implements ExecutionTrace
{
	/**
	 * The cached value of the '{@link #getExecutions() <em>Executions</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution>		executions;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String	DESCRIPTION_EDEFAULT				= null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String				description							= ExecutionTraceImpl.DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalExecutionTime()
	 * <em>Total Execution Time</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTotalExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long		TOTAL_EXECUTION_TIME_EDEFAULT		= 0L;

	/**
	 * The default value of the '{@link #getTotalExecutionTimeMsec()
	 * <em>Total Execution Time Msec</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTotalExecutionTimeMsec()
	 * @generated
	 * @ordered
	 */
	protected static final long		TOTAL_EXECUTION_TIME_MSEC_EDEFAULT	= 0L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecutionTraceImpl()
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
		return ExecutionTracePackage.Literals.EXECUTION_TRACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Execution> getExecutions()
	{
		if (this.executions == null)
		{
			this.executions = new EObjectContainmentEList<Execution>(Execution.class, this,
					ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS);
		}
		return this.executions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDescription()
	{
		return this.description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDescription(final String newDescription)
	{
		final String oldDescription = this.description;
		this.description = newDescription;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION, oldDescription,
					this.description));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getTotalExecutionTime()
	{
		long sum = 0;

		for (final Execution execution : this.getExecutions())
		{
			sum += execution.getExecutionTime();
		}

		return sum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getTotalExecutionTimeMsec()
	{
		return TimeUnit.NANOSECONDS.toMillis(this.getTotalExecutionTime());
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
			case ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS:
				return ((InternalEList<?>) this.getExecutions()).basicRemove(otherEnd, msgs);
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
			case ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS:
				return this.getExecutions();
			case ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION:
				return this.getDescription();
			case ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME:
				return this.getTotalExecutionTime();
			case ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC:
				return this.getTotalExecutionTimeMsec();
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
			case ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS:
				this.getExecutions().clear();
				this.getExecutions().addAll((Collection<? extends Execution>) newValue);
				return;
			case ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION:
				this.setDescription((String) newValue);
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
			case ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS:
				this.getExecutions().clear();
				return;
			case ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION:
				this.setDescription(ExecutionTraceImpl.DESCRIPTION_EDEFAULT);
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
			case ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS:
				return (this.executions != null) && !this.executions.isEmpty();
			case ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION:
				return ExecutionTraceImpl.DESCRIPTION_EDEFAULT == null ? this.description != null
						: !ExecutionTraceImpl.DESCRIPTION_EDEFAULT.equals(this.description);
			case ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME:
				return this.getTotalExecutionTime() != ExecutionTraceImpl.TOTAL_EXECUTION_TIME_EDEFAULT;
			case ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC:
				return this.getTotalExecutionTimeMsec() != ExecutionTraceImpl.TOTAL_EXECUTION_TIME_MSEC_EDEFAULT;
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
		result.append(" (description: ");
		result.append(this.description);
		result.append(')');
		return result.toString();
	}

} // ExecutionTraceImpl
