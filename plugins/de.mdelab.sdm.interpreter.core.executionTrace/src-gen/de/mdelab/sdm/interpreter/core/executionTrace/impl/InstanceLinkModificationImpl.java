/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Link Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceLinkModificationImpl#getStoryPatternLink
 * <em>Story Pattern Link</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceLinkModificationImpl#getSourceStoryPatternObject
 * <em>Source Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceLinkModificationImpl#getTargetStoryPatternObject
 * <em>Target Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceLinkModificationImpl#getSourceInstanceObject
 * <em>Source Instance Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.InstanceLinkModificationImpl#getTargetInstanceObject
 * <em>Target Instance Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class InstanceLinkModificationImpl<StoryPatternLinkType, StoryPatternObjectType> extends ExecutionImpl implements
		InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType>
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
	 * The default value of the '{@link #getSourceInstanceObject()
	 * <em>Source Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		SOURCE_INSTANCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getSourceInstanceObject()
	 * <em>Source Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected String					sourceInstanceObject			= InstanceLinkModificationImpl.SOURCE_INSTANCE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetInstanceObject()
	 * <em>Target Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		TARGET_INSTANCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getTargetInstanceObject()
	 * <em>Target Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected String					targetInstanceObject			= InstanceLinkModificationImpl.TARGET_INSTANCE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceLinkModificationImpl()
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
		return ExecutionTracePackage.Literals.INSTANCE_LINK_MODIFICATION;
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
							ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK, oldStoryPatternLink,
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
					ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK, oldStoryPatternLink, this.storyPatternLink));
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
							ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject,
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
					ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject,
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
							ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject,
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
					ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject,
					this.targetStoryPatternObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSourceInstanceObject()
	{
		return this.sourceInstanceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSourceInstanceObject(final String newSourceInstanceObject)
	{
		final String oldSourceInstanceObject = this.sourceInstanceObject;
		this.sourceInstanceObject = newSourceInstanceObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT, oldSourceInstanceObject,
					this.sourceInstanceObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTargetInstanceObject()
	{
		return this.targetInstanceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTargetInstanceObject(final String newTargetInstanceObject)
	{
		final String oldTargetInstanceObject = this.targetInstanceObject;
		this.targetInstanceObject = newTargetInstanceObject;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT, oldTargetInstanceObject,
					this.targetInstanceObject));
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
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				if (resolve)
				{
					return this.getStoryPatternLink();
				}
				return this.basicGetStoryPatternLink();
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getSourceStoryPatternObject();
				}
				return this.basicGetSourceStoryPatternObject();
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getTargetStoryPatternObject();
				}
				return this.basicGetTargetStoryPatternObject();
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				return this.getSourceInstanceObject();
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				return this.getTargetInstanceObject();
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
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				this.setStoryPatternLink((StoryPatternLinkType) newValue);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				this.setSourceStoryPatternObject((StoryPatternObjectType) newValue);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				this.setTargetStoryPatternObject((StoryPatternObjectType) newValue);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				this.setSourceInstanceObject((String) newValue);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				this.setTargetInstanceObject((String) newValue);
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
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				this.setStoryPatternLink((StoryPatternLinkType) null);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				this.setSourceStoryPatternObject((StoryPatternObjectType) null);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				this.setTargetStoryPatternObject((StoryPatternObjectType) null);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				this.setSourceInstanceObject(InstanceLinkModificationImpl.SOURCE_INSTANCE_OBJECT_EDEFAULT);
				return;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				this.setTargetInstanceObject(InstanceLinkModificationImpl.TARGET_INSTANCE_OBJECT_EDEFAULT);
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
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				return this.storyPatternLink != null;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				return this.sourceStoryPatternObject != null;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				return this.targetStoryPatternObject != null;
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				return InstanceLinkModificationImpl.SOURCE_INSTANCE_OBJECT_EDEFAULT == null ? this.sourceInstanceObject != null
						: !InstanceLinkModificationImpl.SOURCE_INSTANCE_OBJECT_EDEFAULT.equals(this.sourceInstanceObject);
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				return InstanceLinkModificationImpl.TARGET_INSTANCE_OBJECT_EDEFAULT == null ? this.targetInstanceObject != null
						: !InstanceLinkModificationImpl.TARGET_INSTANCE_OBJECT_EDEFAULT.equals(this.targetInstanceObject);
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
		result.append(" (sourceInstanceObject: ");
		result.append(this.sourceInstanceObject);
		result.append(", targetInstanceObject: ");
		result.append(this.targetInstanceObject);
		result.append(')');
		return result.toString();
	}

} // InstanceLinkModificationImpl
