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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.mdelab.sdm.interpreter.core.executionTrace.Execution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionImpl#getExecutionStartedTimeStamp
 * <em>Execution Started Time Stamp</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionImpl#getExecutionFinishedTimeStamp
 * <em>Execution Finished Time Stamp</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionImpl#getExecutionTime
 * <em>Execution Time</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionImpl#getExecutionTimeMsec
 * <em>Execution Time Msec</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionImpl#getElements
 * <em>Elements</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionImpl#getContainer
 * <em>Container</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ExecutionImpl extends EObjectImpl implements Execution
{
	/**
	 * The default value of the '{@link #getExecutionStartedTimeStamp()
	 * <em>Execution Started Time Stamp</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExecutionStartedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_STARTED_TIME_STAMP_EDEFAULT	= 0L;

	/**
	 * The cached value of the '{@link #getExecutionStartedTimeStamp()
	 * <em>Execution Started Time Stamp</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExecutionStartedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected long				executionStartedTimeStamp				= ExecutionImpl.EXECUTION_STARTED_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionFinishedTimeStamp()
	 * <em>Execution Finished Time Stamp</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExecutionFinishedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_FINISHED_TIME_STAMP_EDEFAULT	= 0L;

	/**
	 * The cached value of the '{@link #getExecutionFinishedTimeStamp()
	 * <em>Execution Finished Time Stamp</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExecutionFinishedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected long				executionFinishedTimeStamp				= ExecutionImpl.EXECUTION_FINISHED_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionTime()
	 * <em>Execution Time</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_TIME_EDEFAULT					= 0L;

	/**
	 * The default value of the '{@link #getExecutionTimeMsec()
	 * <em>Execution Time Msec</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExecutionTimeMsec()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_TIME_MSEC_EDEFAULT			= 0L;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution>	elements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecutionImpl()
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
		return ExecutionTracePackage.Literals.EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public long getExecutionStartedTimeStamp()
	{
		return this.executionStartedTimeStamp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExecutionStartedTimeStamp(final long newExecutionStartedTimeStamp)
	{
		final long oldExecutionStartedTimeStamp = this.executionStartedTimeStamp;
		this.executionStartedTimeStamp = newExecutionStartedTimeStamp;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP,
					oldExecutionStartedTimeStamp, this.executionStartedTimeStamp));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public long getExecutionFinishedTimeStamp()
	{
		return this.executionFinishedTimeStamp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExecutionFinishedTimeStamp(final long newExecutionFinishedTimeStamp)
	{
		final long oldExecutionFinishedTimeStamp = this.executionFinishedTimeStamp;
		this.executionFinishedTimeStamp = newExecutionFinishedTimeStamp;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP,
					oldExecutionFinishedTimeStamp, this.executionFinishedTimeStamp));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getExecutionTime()
	{
		return this.getExecutionFinishedTimeStamp() - this.getExecutionStartedTimeStamp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getExecutionTimeMsec()
	{
		return TimeUnit.NANOSECONDS.toMillis(this.getExecutionTime());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Execution> getElements()
	{
		if (this.elements == null)
		{
			this.elements = new EObjectContainmentWithInverseEList<Execution>(Execution.class, this,
					ExecutionTracePackage.EXECUTION__ELEMENTS, ExecutionTracePackage.EXECUTION__CONTAINER);
		}
		return this.elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Execution getContainer()
	{
		if (this.eContainerFeatureID() != ExecutionTracePackage.EXECUTION__CONTAINER)
		{
			return null;
		}
		return (Execution) this.eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainer(final Execution newContainer, NotificationChain msgs)
	{
		msgs = this.eBasicSetContainer((InternalEObject) newContainer, ExecutionTracePackage.EXECUTION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setContainer(final Execution newContainer)
	{
		if ((newContainer != this.eInternalContainer())
				|| ((this.eContainerFeatureID() != ExecutionTracePackage.EXECUTION__CONTAINER) && (newContainer != null)))
		{
			if (EcoreUtil.isAncestor(this, newContainer))
			{
				throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
			}
			NotificationChain msgs = null;
			if (this.eInternalContainer() != null)
			{
				msgs = this.eBasicRemoveFromContainer(msgs);
			}
			if (newContainer != null)
			{
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, ExecutionTracePackage.EXECUTION__ELEMENTS, Execution.class, msgs);
			}
			msgs = this.basicSetContainer(newContainer, msgs);
			if (msgs != null)
			{
				msgs.dispatch();
			}
		}
		else if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.EXECUTION__CONTAINER, newContainer,
					newContainer));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getElements()).basicAdd(otherEnd, msgs);
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				if (this.eInternalContainer() != null)
				{
					msgs = this.eBasicRemoveFromContainer(msgs);
				}
				return this.basicSetContainer((Execution) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
				return ((InternalEList<?>) this.getElements()).basicRemove(otherEnd, msgs);
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				return this.basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs)
	{
		switch (this.eContainerFeatureID())
		{
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				return this.eInternalContainer().eInverseRemove(this, ExecutionTracePackage.EXECUTION__ELEMENTS, Execution.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				return this.getExecutionStartedTimeStamp();
			case ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				return this.getExecutionFinishedTimeStamp();
			case ExecutionTracePackage.EXECUTION__EXECUTION_TIME:
				return this.getExecutionTime();
			case ExecutionTracePackage.EXECUTION__EXECUTION_TIME_MSEC:
				return this.getExecutionTimeMsec();
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
				return this.getElements();
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				return this.getContainer();
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
			case ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				this.setExecutionStartedTimeStamp((Long) newValue);
				return;
			case ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				this.setExecutionFinishedTimeStamp((Long) newValue);
				return;
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
				this.getElements().clear();
				this.getElements().addAll((Collection<? extends Execution>) newValue);
				return;
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				this.setContainer((Execution) newValue);
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
			case ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				this.setExecutionStartedTimeStamp(ExecutionImpl.EXECUTION_STARTED_TIME_STAMP_EDEFAULT);
				return;
			case ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				this.setExecutionFinishedTimeStamp(ExecutionImpl.EXECUTION_FINISHED_TIME_STAMP_EDEFAULT);
				return;
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
				this.getElements().clear();
				return;
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				this.setContainer((Execution) null);
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
			case ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				return this.executionStartedTimeStamp != ExecutionImpl.EXECUTION_STARTED_TIME_STAMP_EDEFAULT;
			case ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				return this.executionFinishedTimeStamp != ExecutionImpl.EXECUTION_FINISHED_TIME_STAMP_EDEFAULT;
			case ExecutionTracePackage.EXECUTION__EXECUTION_TIME:
				return this.getExecutionTime() != ExecutionImpl.EXECUTION_TIME_EDEFAULT;
			case ExecutionTracePackage.EXECUTION__EXECUTION_TIME_MSEC:
				return this.getExecutionTimeMsec() != ExecutionImpl.EXECUTION_TIME_MSEC_EDEFAULT;
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
				return (this.elements != null) && !this.elements.isEmpty();
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				return this.getContainer() != null;
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
		result.append(" (executionStartedTimeStamp: ");
		result.append(this.executionStartedTimeStamp);
		result.append(", executionFinishedTimeStamp: ");
		result.append(this.executionFinishedTimeStamp);
		result.append(')');
		return result.toString();
	}

} // ExecutionImpl
