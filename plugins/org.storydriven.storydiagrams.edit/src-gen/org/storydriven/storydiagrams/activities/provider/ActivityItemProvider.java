/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.calls.provider.CallableItemProvider;
import org.storydriven.storydiagrams.provider.StorydiagramsEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.activities.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends CallableItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_NamedElement_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
						"_UI_NamedElement_type"), CorePackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_precondition_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Activity_precondition_feature",
						"_UI_Activity_type"), ActivitiesPackage.Literals.ACTIVITY__PRECONDITION, true, false, true,
				null, null, null));
	}

	/**
	 * This returns Activity.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("elements/activities/Activity.png"));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StorydiagramsEditPlugin.INSTANCE;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_EDGE);
			childrenFeatures.add(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE);
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Activity_type") : getString("_UI_Activity_type")
				+ " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Activity.class)) {
		case ActivitiesPackage.ACTIVITY__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_EDGE,
				ActivitiesFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createMatchingStoryNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createStructuredNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createJunctionNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createStartNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createStatementNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createStopNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createActivityCallNode()));

		newChildDescriptors.add(createChildParameter(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				ActivitiesFactory.eINSTANCE.createModifyingStoryNode()));
	}

}
