/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectModification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Object Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceObjectModificationImpl#getStoryPatternObject
 * <em>Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceObjectModificationImpl#getInstanceObject
 * <em>Instance Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class InstanceObjectModificationImpl<StoryPatternObjectType> extends ExecutionImpl implements
		InstanceObjectModification<StoryPatternObjectType>
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
	 * The default value of the '{@link #getInstanceObject()
	 * <em>Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		INSTANCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getInstanceObject()
	 * <em>Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected String					instanceObject				= InstanceObjectModificationImpl.INSTANCE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceObjectModificationImpl()
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
		return ExecutionTracePackage.Literals.INSTANCE_OBJECT_MODIFICATION;
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
							ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT, oldStoryPatternObject,
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
					ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT, oldStoryPatternObject,
					this.storyPatternObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getInstanceObject()
	{
		return this.instanceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInstanceObject(final String newInstanceObject)
	{
		final String oldInstanceObject = this.instanceObject;
		this.instanceObject = newInstanceObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT,
					oldInstanceObject, this.instanceObject));
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
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getStoryPatternObject();
				}
				return this.basicGetStoryPatternObject();
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				return this.getInstanceObject();
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
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				this.setStoryPatternObject((StoryPatternObjectType) newValue);
				return;
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				this.setInstanceObject((String) newValue);
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
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				this.setStoryPatternObject((StoryPatternObjectType) null);
				return;
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				this.setInstanceObject(InstanceObjectModificationImpl.INSTANCE_OBJECT_EDEFAULT);
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
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				return this.storyPatternObject != null;
			case ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				return InstanceObjectModificationImpl.INSTANCE_OBJECT_EDEFAULT == null ? this.instanceObject != null
						: !InstanceObjectModificationImpl.INSTANCE_OBJECT_EDEFAULT.equals(this.instanceObject);
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
		result.append(" (instanceObject: ");
		result.append(this.instanceObject);
		result.append(')');
		return result.toString();
	}

} // InstanceObjectModificationImpl
