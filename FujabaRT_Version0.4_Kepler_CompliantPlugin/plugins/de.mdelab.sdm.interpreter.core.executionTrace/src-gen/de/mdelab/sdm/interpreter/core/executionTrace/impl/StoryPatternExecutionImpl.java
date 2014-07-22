/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternExecutionImpl#getStoryPattern
 * <em>Story Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StoryPatternExecutionImpl<StoryPatternType> extends ExecutionImpl implements StoryPatternExecution<StoryPatternType>
{
	/**
	 * The cached value of the '{@link #getStoryPattern()
	 * <em>Story Pattern</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternType	storyPattern;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternExecutionImpl()
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
		return ExecutionTracePackage.Literals.STORY_PATTERN_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternType getStoryPattern()
	{
		if ((this.storyPattern != null) && ((EObject) this.storyPattern).eIsProxy())
		{
			final InternalEObject oldStoryPattern = (InternalEObject) this.storyPattern;
			this.storyPattern = (StoryPatternType) this.eResolveProxy(oldStoryPattern);
			if (this.storyPattern != oldStoryPattern)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN, oldStoryPattern, this.storyPattern));
				}
			}
		}
		return this.storyPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternType basicGetStoryPattern()
	{
		return this.storyPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStoryPattern(final StoryPatternType newStoryPattern)
	{
		final StoryPatternType oldStoryPattern = this.storyPattern;
		this.storyPattern = newStoryPattern;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN,
					oldStoryPattern, this.storyPattern));
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
			case ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				if (resolve)
				{
					return this.getStoryPattern();
				}
				return this.basicGetStoryPattern();
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
			case ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				this.setStoryPattern((StoryPatternType) newValue);
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
			case ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				this.setStoryPattern((StoryPatternType) null);
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
			case ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				return this.storyPattern != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryPatternExecutionImpl
