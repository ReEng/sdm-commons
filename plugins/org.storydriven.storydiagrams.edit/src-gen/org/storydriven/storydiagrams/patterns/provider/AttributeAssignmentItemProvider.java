/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.provider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import org.storydriven.storydiagrams.provider.StorydiagramsEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.patterns.AttributeAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeAssignmentItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentItemProvider(AdapterFactory adapterFactory) {
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

			addAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AttributeAssignment_attribute_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AttributeAssignment_attribute_feature",
						"_UI_AttributeAssignment_type"),
				PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE, true,
				false, true, null, null, null));
	}

	/**
	 * This returns AttributeAssignment.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"elements/patterns/AttributeAssignment.png"));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION);
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
		return getString("_UI_AttributeAssignment_type");
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

		switch (notification.getFeatureID(AttributeAssignment.class)) {
		case PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ActivitiesExpressionsFactory.eINSTANCE
								.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						CallsExpressionsFactory.eINSTANCE
								.createMethodCallExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						CallsExpressionsFactory.eINSTANCE
								.createParameterExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createAttributeValueExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createObjectVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createCollectionSizeExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createPrimitiveVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(
						PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
						ExpressionsFactory.eINSTANCE
								.createBinaryLogicExpression()));
	}

}
