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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.activities.StatementNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementNodeItemProvider extends ActivityNodeItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementNodeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
					.add(ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * This returns StatementNode.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"elements/activities/StatementNode.png"));
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
		String label = ((StatementNode) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_StatementNode_type")
				: getString("_UI_StatementNode_type") + " " + label;
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

		switch (notification.getFeatureID(StatementNode.class)) {
		case ActivitiesPackage.STATEMENT_NODE__STATEMENT_EXPRESSION:
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
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						ActivitiesExpressionsFactory.eINSTANCE
								.createExceptionVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CallsExpressionsFactory.eINSTANCE
								.createMethodCallExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CallsExpressionsFactory.eINSTANCE
								.createParameterExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createAttributeValueExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createObjectVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createCollectionSizeExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						PatternsExpressionsFactory.eINSTANCE
								.createPrimitiveVariableExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createUnaryExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createComparisonExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createLogicalExpression()));

		newChildDescriptors
				.add(createChildParameter(
						ActivitiesPackage.Literals.STATEMENT_NODE__STATEMENT_EXPRESSION,
						CommonExpressionsFactory.eINSTANCE
								.createLiteralExpression()));
	}

}
