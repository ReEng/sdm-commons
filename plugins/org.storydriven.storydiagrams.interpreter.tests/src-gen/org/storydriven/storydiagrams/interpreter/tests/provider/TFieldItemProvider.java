/**
 */
package org.storydriven.storydiagrams.interpreter.tests.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TField} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TFieldItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TFieldItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addInheritancePropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addNativePropertyDescriptor(object);
			addStrictfpPropertyDescriptor(object);
			addSynchronizedPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addContainingTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TNamed_name_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TNamed_name_feature", "_UI_TNamed_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TNAMED__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TModifyable_visibility_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_TModifyable_visibility_feature", "_UI_TModifyable_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TestsPackage.Literals.TMODIFYABLE__VISIBILITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Inheritance feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInheritancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TModifyable_inheritance_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_TModifyable_inheritance_feature", "_UI_TModifyable_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TestsPackage.Literals.TMODIFYABLE__INHERITANCE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Static feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TModifyable_static_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_TModifyable_static_feature", "_UI_TModifyable_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TestsPackage.Literals.TMODIFYABLE__STATIC, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Transient feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TTyped_transient_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TTyped_transient_feature", "_UI_TTyped_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TTYPED__TRANSIENT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Native feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TTyped_native_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TTyped_native_feature", "_UI_TTyped_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TTYPED__NATIVE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Strictfp feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStrictfpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TTyped_strictfp_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TTyped_strictfp_feature", "_UI_TTyped_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TTYPED__STRICTFP, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Synchronized feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSynchronizedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TTyped_synchronized_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TTyped_synchronized_feature", "_UI_TTyped_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TTYPED__SYNCHRONIZED, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TTyped_type_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TTyped_type_feature", "_UI_TTyped_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TTYPED__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Containing Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addContainingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TField_containingType_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_TField_containingType_feature", "_UI_TField_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TestsPackage.Literals.TFIELD__CONTAINING_TYPE, true, false, true, null, null, null));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TField) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TField_type") : //$NON-NLS-1$
				getString("_UI_TField_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TField.class)) {
		case TestsPackage.TFIELD__NAME:
		case TestsPackage.TFIELD__VISIBILITY:
		case TestsPackage.TFIELD__INHERITANCE:
		case TestsPackage.TFIELD__STATIC:
		case TestsPackage.TFIELD__TRANSIENT:
		case TestsPackage.TFIELD__NATIVE:
		case TestsPackage.TFIELD__STRICTFP:
		case TestsPackage.TFIELD__SYNCHRONIZED:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TestsEditPlugin.INSTANCE;
	}

}
