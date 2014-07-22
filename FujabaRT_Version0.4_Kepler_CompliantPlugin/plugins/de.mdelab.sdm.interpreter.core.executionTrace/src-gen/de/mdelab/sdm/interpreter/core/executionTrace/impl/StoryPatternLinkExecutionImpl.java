/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Link Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternLinkExecutionImpl#getStoryPatternLink
 * <em>Story Pattern Link</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternLinkExecutionImpl#getSourceStoryPatternObject
 * <em>Source Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternLinkExecutionImpl#getTargetStoryPatternObject
 * <em>Target Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternLinkExecutionImpl#getSourceObject
 * <em>Source Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StoryPatternLinkExecutionImpl<StoryPatternLinkType, StoryPatternObjectType> extends ExecutionImpl implements
		StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * The cached value of the '{@link #getStoryPatternLink()
	 * <em>Story Pattern Link</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStoryPatternLink()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternLinkType		storyPatternLink;

	/**
	 * The cached value of the '{@link #getSourceStoryPatternObject()
	 * <em>Source Story Pattern Object</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	sourceStoryPatternObject;

	/**
	 * The cached value of the '{@link #getTargetStoryPatternObject()
	 * <em>Target Story Pattern Object</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTargetStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	targetStoryPatternObject;

	/**
	 * The default value of the '{@link #getSourceObject()
	 * <em>Source Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		SOURCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getSourceObject()
	 * <em>Source Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected String					sourceObject			= StoryPatternLinkExecutionImpl.SOURCE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternLinkExecutionImpl()
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
		return ExecutionTracePackage.Literals.STORY_PATTERN_LINK_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternLinkType getStoryPatternLink()
	{
		if ((this.storyPatternLink != null) && ((EObject) this.storyPatternLink).eIsProxy())
		{
			final InternalEObject oldStoryPatternLink = (InternalEObject) this.storyPatternLink;
			this.storyPatternLink = (StoryPatternLinkType) this.eResolveProxy(oldStoryPatternLink);
			if (this.storyPatternLink != oldStoryPatternLink)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK, oldStoryPatternLink,
							this.storyPatternLink));
				}
			}
		}
		return this.storyPatternLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternLinkType basicGetStoryPatternLink()
	{
		return this.storyPatternLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStoryPatternLink(final StoryPatternLinkType newStoryPatternLink)
	{
		final StoryPatternLinkType oldStoryPatternLink = this.storyPatternLink;
		this.storyPatternLink = newStoryPatternLink;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK, oldStoryPatternLink, this.storyPatternLink));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getSourceStoryPatternObject()
	{
		if ((this.sourceStoryPatternObject != null) && ((EObject) this.sourceStoryPatternObject).eIsProxy())
		{
			final InternalEObject oldSourceStoryPatternObject = (InternalEObject) this.sourceStoryPatternObject;
			this.sourceStoryPatternObject = (StoryPatternObjectType) this.eResolveProxy(oldSourceStoryPatternObject);
			if (this.sourceStoryPatternObject != oldSourceStoryPatternObject)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject,
							this.sourceStoryPatternObject));
				}
			}
		}
		return this.sourceStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternObjectType basicGetSourceStoryPatternObject()
	{
		return this.sourceStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSourceStoryPatternObject(final StoryPatternObjectType newSourceStoryPatternObject)
	{
		final StoryPatternObjectType oldSourceStoryPatternObject = this.sourceStoryPatternObject;
		this.sourceStoryPatternObject = newSourceStoryPatternObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject,
					this.sourceStoryPatternObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getTargetStoryPatternObject()
	{
		if ((this.targetStoryPatternObject != null) && ((EObject) this.targetStoryPatternObject).eIsProxy())
		{
			final InternalEObject oldTargetStoryPatternObject = (InternalEObject) this.targetStoryPatternObject;
			this.targetStoryPatternObject = (StoryPatternObjectType) this.eResolveProxy(oldTargetStoryPatternObject);
			if (this.targetStoryPatternObject != oldTargetStoryPatternObject)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject,
							this.targetStoryPatternObject));
				}
			}
		}
		return this.targetStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternObjectType basicGetTargetStoryPatternObject()
	{
		return this.targetStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTargetStoryPatternObject(final StoryPatternObjectType newTargetStoryPatternObject)
	{
		final StoryPatternObjectType oldTargetStoryPatternObject = this.targetStoryPatternObject;
		this.targetStoryPatternObject = newTargetStoryPatternObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject,
					this.targetStoryPatternObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSourceObject()
	{
		return this.sourceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSourceObject(final String newSourceObject)
	{
		final String oldSourceObject = this.sourceObject;
		this.sourceObject = newSourceObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT,
					oldSourceObject, this.sourceObject));
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
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				if (resolve)
				{
					return this.getStoryPatternLink();
				}
				return this.basicGetStoryPatternLink();
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getSourceStoryPatternObject();
				}
				return this.basicGetSourceStoryPatternObject();
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getTargetStoryPatternObject();
				}
				return this.basicGetTargetStoryPatternObject();
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				return this.getSourceObject();
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
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				this.setStoryPatternLink((StoryPatternLinkType) newValue);
				return;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				this.setSourceStoryPatternObject((StoryPatternObjectType) newValue);
				return;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				this.setTargetStoryPatternObject((StoryPatternObjectType) newValue);
				return;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				this.setSourceObject((String) newValue);
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
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				this.setStoryPatternLink((StoryPatternLinkType) null);
				return;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				this.setSourceStoryPatternObject((StoryPatternObjectType) null);
				return;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				this.setTargetStoryPatternObject((StoryPatternObjectType) null);
				return;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				this.setSourceObject(StoryPatternLinkExecutionImpl.SOURCE_OBJECT_EDEFAULT);
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
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				return this.storyPatternLink != null;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				return this.sourceStoryPatternObject != null;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				return this.targetStoryPatternObject != null;
			case ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				return StoryPatternLinkExecutionImpl.SOURCE_OBJECT_EDEFAULT == null ? this.sourceObject != null
						: !StoryPatternLinkExecutionImpl.SOURCE_OBJECT_EDEFAULT.equals(this.sourceObject);
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
		result.append(" (sourceObject: ");
		result.append(this.sourceObject);
		result.append(')');
		return result.toString();
	}

} // StoryPatternLinkExecutionImpl
