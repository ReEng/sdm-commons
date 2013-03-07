/**
 */
package de.upb.swt.core.ui.properties.tests.model.provider;

import de.upb.swt.core.ui.properties.tests.model.IntegerAttribute;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.upb.swt.core.ui.properties.tests.model.IntegerAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerAttributeItemProvider extends AttributeItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addByteValuePropertyDescriptor(object);
			addByteObjectValuePropertyDescriptor(object);
			addShortValuePropertyDescriptor(object);
			addShortObjectValuePropertyDescriptor(object);
			addIntValuePropertyDescriptor(object);
			addIntegerObjectValuePropertyDescriptor(object);
			addLongValuePropertyDescriptor(object);
			addLongObjectValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Byte Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addByteValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_byteValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_byteValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__BYTE_VALUE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Byte Object Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addByteObjectValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_byteObjectValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_byteObjectValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Short Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_shortValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_shortValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__SHORT_VALUE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Short Object Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortObjectValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_shortObjectValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_shortObjectValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Int Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_intValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_intValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__INT_VALUE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Integer Object Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegerObjectValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_integerObjectValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_integerObjectValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Long Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_longValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_longValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__LONG_VALUE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Long Object Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongObjectValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IntegerAttribute_longObjectValue_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_IntegerAttribute_longObjectValue_feature", "_UI_IntegerAttribute_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModelPackage.Literals.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IntegerAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IntegerAttribute")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IntegerAttribute) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_IntegerAttribute_type") : //$NON-NLS-1$
				getString("_UI_IntegerAttribute_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(IntegerAttribute.class)) {
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__BYTE_OBJECT_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__SHORT_OBJECT_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__INT_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__INTEGER_OBJECT_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_VALUE:
		case ModelPackage.INTEGER_ATTRIBUTE__LONG_OBJECT_VALUE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
