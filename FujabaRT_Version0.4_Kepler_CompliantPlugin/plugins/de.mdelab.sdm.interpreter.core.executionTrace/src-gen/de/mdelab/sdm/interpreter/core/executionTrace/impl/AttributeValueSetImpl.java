/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Attribute Value Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.AttributeValueSetImpl#getStoryPatternObject
 * <em>Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.AttributeValueSetImpl#getFeature
 * <em>Feature</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.AttributeValueSetImpl#getInstanceObject
 * <em>Instance Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.AttributeValueSetImpl#getNewValue
 * <em>New Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AttributeValueSetImpl<StoryPatternObjectType, FeatureType> extends ExecutionImpl implements
		AttributeValueSet<StoryPatternObjectType, FeatureType>
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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureType				feature;

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
	protected String					instanceObject				= AttributeValueSetImpl.INSTANCE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewValue() <em>New Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final String		NEW_VALUE_EDEFAULT			= null;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected String					newValue					= AttributeValueSetImpl.NEW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AttributeValueSetImpl()
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
		return ExecutionTracePackage.Literals.ATTRIBUTE_VALUE_SET;
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
							ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT, oldStoryPatternObject, this.storyPatternObject));
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
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT,
					oldStoryPatternObject, this.storyPatternObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public FeatureType getFeature()
	{
		if ((this.feature != null) && ((EObject) this.feature).eIsProxy())
		{
			final InternalEObject oldFeature = (InternalEObject) this.feature;
			this.feature = (FeatureType) this.eResolveProxy(oldFeature);
			if (this.feature != oldFeature)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE,
							oldFeature, this.feature));
				}
			}
		}
		return this.feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureType basicGetFeature()
	{
		return this.feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFeature(final FeatureType newFeature)
	{
		final FeatureType oldFeature = this.feature;
		this.feature = newFeature;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE, oldFeature,
					this.feature));
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
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT,
					oldInstanceObject, this.instanceObject));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getNewValue()
	{
		return this.newValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNewValue(final String newNewValue)
	{
		final String oldNewValue = this.newValue;
		this.newValue = newNewValue;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE, oldNewValue,
					this.newValue));
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
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				if (resolve)
				{
					return this.getStoryPatternObject();
				}
				return this.basicGetStoryPatternObject();
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				if (resolve)
				{
					return this.getFeature();
				}
				return this.basicGetFeature();
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				return this.getInstanceObject();
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				return this.getNewValue();
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
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				this.setStoryPatternObject((StoryPatternObjectType) newValue);
				return;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				this.setFeature((FeatureType) newValue);
				return;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				this.setInstanceObject((String) newValue);
				return;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				this.setNewValue((String) newValue);
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
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				this.setStoryPatternObject((StoryPatternObjectType) null);
				return;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				this.setFeature((FeatureType) null);
				return;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				this.setInstanceObject(AttributeValueSetImpl.INSTANCE_OBJECT_EDEFAULT);
				return;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				this.setNewValue(AttributeValueSetImpl.NEW_VALUE_EDEFAULT);
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
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				return this.storyPatternObject != null;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				return this.feature != null;
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				return AttributeValueSetImpl.INSTANCE_OBJECT_EDEFAULT == null ? this.instanceObject != null
						: !AttributeValueSetImpl.INSTANCE_OBJECT_EDEFAULT.equals(this.instanceObject);
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				return AttributeValueSetImpl.NEW_VALUE_EDEFAULT == null ? this.newValue != null : !AttributeValueSetImpl.NEW_VALUE_EDEFAULT
						.equals(this.newValue);
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
		result.append(", newValue: ");
		result.append(this.newValue);
		result.append(')');
		return result.toString();
	}

} // AttributeValueSetImpl
