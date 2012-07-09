/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.templates.provider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.provider.ExtendableElementItemProvider;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import org.storydriven.storydiagrams.provider.StorydiagramsEditPlugin;
import org.storydriven.storydiagrams.templates.TemplateBinding;
import org.storydriven.storydiagrams.templates.TemplatesFactory;
import org.storydriven.storydiagrams.templates.TemplatesPackage;

/**
 * This is the item provider adapter for a {@link org.storydriven.storydiagrams.templates.TemplateBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateBindingItemProvider extends ExtendableElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBindingItemProvider(AdapterFactory adapterFactory) {
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

			addBoundParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bound Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateBinding_boundParameter_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TemplateBinding_boundParameter_feature",
						"_UI_TemplateBinding_type"), TemplatesPackage.Literals.TEMPLATE_BINDING__BOUND_PARAMETER, true,
				false, true, null, null, null));
	}

	/**
	 * This returns TemplateBinding.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("elements/templates/TemplateBinding.png"));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION);
			childrenFeatures.add(TemplatesPackage.Literals.TEMPLATE_BINDING__PROPERTY_BINDING);
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
		return getString("_UI_TemplateBinding_type");
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

		switch (notification.getFeatureID(TemplateBinding.class)) {
		case TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION:
		case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
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

		newChildDescriptors.add(createChildParameter(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add(createChildParameter(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ActivitiesExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				CallsExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				CallsExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE.createCollectionSizeExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				PatternsExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__BINDING_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBinaryLogicExpression()));

		newChildDescriptors.add(createChildParameter(TemplatesPackage.Literals.TEMPLATE_BINDING__PROPERTY_BINDING,
				TemplatesFactory.eINSTANCE.createPropertyBinding()));
	}

}
