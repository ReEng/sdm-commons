/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Matching</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternMatchingImpl#isSuccessful
 * <em>Successful</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StoryPatternMatchingImpl<StoryPatternType> extends StoryPatternExecutionImpl<StoryPatternType> implements
		StoryPatternMatching<StoryPatternType>
{
	/**
	 * The default value of the '{@link #isSuccessful() <em>Successful</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSuccessful()
	 * @generated
	 * @ordered
	 */
	protected static final boolean	SUCCESSFUL_EDEFAULT	= false;

	/**
	 * The cached value of the '{@link #isSuccessful() <em>Successful</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSuccessful()
	 * @generated
	 * @ordered
	 */
	protected boolean				successful			= StoryPatternMatchingImpl.SUCCESSFUL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternMatchingImpl()
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
		return ExecutionTracePackage.Literals.STORY_PATTERN_MATCHING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSuccessful()
	{
		return this.successful;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSuccessful(final boolean newSuccessful)
	{
		final boolean oldSuccessful = this.successful;
		this.successful = newSuccessful;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.STORY_PATTERN_MATCHING__SUCCESSFUL,
					oldSuccessful, this.successful));
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
			case ExecutionTracePackage.STORY_PATTERN_MATCHING__SUCCESSFUL:
				return this.isSuccessful();
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
			case ExecutionTracePackage.STORY_PATTERN_MATCHING__SUCCESSFUL:
				this.setSuccessful((Boolean) newValue);
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
			case ExecutionTracePackage.STORY_PATTERN_MATCHING__SUCCESSFUL:
				this.setSuccessful(StoryPatternMatchingImpl.SUCCESSFUL_EDEFAULT);
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
			case ExecutionTracePackage.STORY_PATTERN_MATCHING__SUCCESSFUL:
				return this.successful != StoryPatternMatchingImpl.SUCCESSFUL_EDEFAULT;
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
		result.append(" (successful: ");
		result.append(this.successful);
		result.append(')');
		return result.toString();
	}

} // StoryPatternMatchingImpl
