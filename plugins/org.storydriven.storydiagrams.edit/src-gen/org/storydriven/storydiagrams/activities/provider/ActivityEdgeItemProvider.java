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
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.provider.ExtendableElementItemProvider;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import org.storydriven.storydiagrams.provider.StorydiagramsEditPlugin;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.activities.ActivityEdge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityEdgeItemProvider extends ExtendableElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addGuardPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityEdge_target_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ActivityEdge_target_feature",
						"_UI_ActivityEdge_type"),
				ActivitiesPackage.Literals.ACTIVITY_EDGE__TARGET, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityEdge_source_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ActivityEdge_source_feature",
						"_UI_ActivityEdge_type"),
				ActivitiesPackage.Literals.ACTIVITY_EDGE__SOURCE, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityEdge_guard_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ActivityEdge_guard_feature",
						"_UI_ActivityEdge_type"),
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
					.add(ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION);
			childrenFeatures
					.add(ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXCEPTION);
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
		EdgeGuard labelValue = ((ActivityEdge) object).getGuard();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ActivityEdge_type")
				: getString("_UI_ActivityEdge_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityEdge.class)) {
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION:
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTION:
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

		newChildDescriptors.add(createChildParameter(
				CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add(createChildParameter(
				CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				ActivitiesExpressionsFactory.eINSTANCE
						.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
						CallsExpressionsFactory.eINSTANCE
								.createMethodCallExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				CallsExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE
						.createAttributeValueExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE
						.createObjectVariableExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE
						.createCollectionSizeExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE
						.createPrimitiveVariableExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXPRESSION,
				CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add(createChildParameter(
				ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD_EXCEPTION,
				ActivitiesFactory.eINSTANCE.createExceptionVariable()));
	}

}
