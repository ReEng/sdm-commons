/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternObjectExecutionImpl#getStoryPatternObject
 * <em>Story Pattern Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StoryPatternObjectExecutionImpl<StoryPatternObjectType> extends ExecutionImpl implements
		StoryPatternObjectExecution<StoryPatternObjectType>
{
	/**
	 * The cached value of the '{@link #getStoryPatternObject()
	 * <em>Story Pattern Object</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	storyPatternObject;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternObjectExecutionImpl()
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
		return ExecutionTracePackage.Literals.STORY_PATTERN_OBJECT_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getStoryPatternObject()
	{
		if ((this.storyPatternObject != null) && ((EObject) this.storyPatternObject).eIsProxy())
		{
			final InternalEObject oldStoryPatternObject = (InternalEObject) this.storyPatternObject;
			this.storyPatternObject = (StoryPatternObjectType) this.eResolveProxy(oldStoryPatternObject);
			if (this.storyPatternObject != oldStoryPatternObject)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT, oldStoryPatternObject,
							this.storyPatternObject));
				}
			}
		}
		return this.storyPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternObjectType basicGetStoryPatternObject()
	{
		return this.storyPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStoryPatternObject(final StoryPatternObjectType newStoryPatternObject)
	{
		final StoryPatternObjectType oldStoryPatternObject = this.storyPatternObject;
		this.storyPatternObject = newStoryPatternObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT, oldStoryPatternObject,
					this.storyPatternObject));
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getStoryPatternObject();
				}
				return this.basicGetStoryPatternObject();
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				this.setStoryPatternObject((StoryPatternObjectType) newValue);
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				this.setStoryPatternObject((StoryPatternObjectType) null);
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
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				return this.storyPatternObject != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryPatternObjectExecutionImpl
