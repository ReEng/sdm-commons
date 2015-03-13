/**
 */
package org.storydriven.storydiagrams.interpreter.tests.provider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.storydiagrams.interpreter.tests.TEnum;
import org.storydriven.storydiagrams.interpreter.tests.TestsFactory;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TEnum} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TEnumItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TEnumItemProvider(AdapterFactory adapterFactory) {
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
			addContainingPackagePropertyDescriptor(object);
			addContainingTypePropertyDescriptor(object);
			addExtendedInterfacesPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Containing Package feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addContainingPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TType_containingPackage_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_TType_containingPackage_feature", "_UI_TType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TestsPackage.Literals.TTYPE__CONTAINING_PACKAGE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Containing Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addContainingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TType_containingType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TType_containingType_feature", "_UI_TType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TestsPackage.Literals.TTYPE__CONTAINING_TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Extended Interfaces feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addExtendedInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TType_extendedInterfaces_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_TType_extendedInterfaces_feature", "_UI_TType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TestsPackage.Literals.TTYPE__EXTENDED_INTERFACES, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TestsPackage.Literals.TTYPE__TYPES);
			childrenFeatures.add(TestsPackage.Literals.TTYPE__FIELDS);
			childrenFeatures.add(TestsPackage.Literals.TTYPE__METHODS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
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
		String label = ((TEnum) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TEnum_type") : //$NON-NLS-1$
				getString("_UI_TEnum_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(TEnum.class)) {
		case TestsPackage.TENUM__NAME:
		case TestsPackage.TENUM__VISIBILITY:
		case TestsPackage.TENUM__INHERITANCE:
		case TestsPackage.TENUM__STATIC:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TestsPackage.TENUM__TYPES:
		case TestsPackage.TENUM__FIELDS:
		case TestsPackage.TENUM__METHODS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(TestsPackage.Literals.TTYPE__TYPES,
				TestsFactory.eINSTANCE.createTInterface()));

		newChildDescriptors.add(createChildParameter(TestsPackage.Literals.TTYPE__TYPES,
				TestsFactory.eINSTANCE.createTClass()));

		newChildDescriptors.add(createChildParameter(TestsPackage.Literals.TTYPE__TYPES,
				TestsFactory.eINSTANCE.createTEnum()));

		newChildDescriptors.add(createChildParameter(TestsPackage.Literals.TTYPE__FIELDS,
				TestsFactory.eINSTANCE.createTField()));

		newChildDescriptors.add(createChildParameter(TestsPackage.Literals.TTYPE__METHODS,
				TestsFactory.eINSTANCE.createTMethod()));
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
