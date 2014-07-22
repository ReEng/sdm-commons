/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.provider;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceLinkModificationItemProvider extends ExecutionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider,
		ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceLinkModificationItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addStoryPatternLinkPropertyDescriptor(object);
			addSourceStoryPatternObjectPropertyDescriptor(object);
			addTargetStoryPatternObjectPropertyDescriptor(object);
			addSourceInstanceObjectPropertyDescriptor(object);
			addTargetInstanceObjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Story Pattern Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoryPatternLinkPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InstanceLinkModification_storyPatternLink_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InstanceLinkModification_storyPatternLink_feature",
						"_UI_InstanceLinkModification_type"),
				ExecutionTracePackage.Literals.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Source Story Pattern Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceStoryPatternObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_InstanceLinkModification_sourceStoryPatternObject_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InstanceLinkModification_sourceStoryPatternObject_feature",
								"_UI_InstanceLinkModification_type"),
						ExecutionTracePackage.Literals.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Target Story Pattern Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetStoryPatternObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_InstanceLinkModification_targetStoryPatternObject_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InstanceLinkModification_targetStoryPatternObject_feature",
								"_UI_InstanceLinkModification_type"),
						ExecutionTracePackage.Literals.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Source Instance Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceInstanceObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InstanceLinkModification_sourceInstanceObject_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InstanceLinkModification_sourceInstanceObject_feature",
						"_UI_InstanceLinkModification_type"),
				ExecutionTracePackage.Literals.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Instance Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetInstanceObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InstanceLinkModification_targetInstanceObject_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InstanceLinkModification_targetInstanceObject_feature",
						"_UI_InstanceLinkModification_type"),
				ExecutionTracePackage.Literals.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		InstanceLinkModification<?, ?> instanceLinkModification = (InstanceLinkModification<?, ?>) object;
		return getString("_UI_InstanceLinkModification_type") + " " + instanceLinkModification.getExecutionStartedTimeStamp();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(InstanceLinkModification.class))
		{
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
			case ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
