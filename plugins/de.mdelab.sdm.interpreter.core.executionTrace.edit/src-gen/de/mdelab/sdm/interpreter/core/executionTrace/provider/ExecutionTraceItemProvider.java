/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.provider;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTraceFactory;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionTraceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider,
		ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTraceItemProvider(AdapterFactory adapterFactory)
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

			addDescriptionPropertyDescriptor(object);
			addTotalExecutionTimePropertyDescriptor(object);
			addTotalExecutionTimeMsecPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_ExecutionTrace_description_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTrace_description_feature", "_UI_ExecutionTrace_type"),
				ExecutionTracePackage.Literals.EXECUTION_TRACE__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Total Execution Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalExecutionTimePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ExecutionTrace_totalExecutionTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTrace_totalExecutionTime_feature",
								"_UI_ExecutionTrace_type"), ExecutionTracePackage.Literals.EXECUTION_TRACE__TOTAL_EXECUTION_TIME, true,
						false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Total Execution Time Msec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalExecutionTimeMsecPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ExecutionTrace_totalExecutionTimeMsec_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTrace_totalExecutionTimeMsec_feature",
						"_UI_ExecutionTrace_type"), ExecutionTracePackage.Literals.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC, false,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object)
	{
		return hasChildren(object, true);
	}

	/**
	 * This returns ExecutionTrace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExecutionTrace"));
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
		String label = ((ExecutionTrace) object).getDescription();
		return label == null || label.length() == 0 ? getString("_UI_ExecutionTrace_type") : getString("_UI_ExecutionTrace_type") + " "
				+ label;
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

		switch (notification.getFeatureID(ExecutionTrace.class))
		{
			case ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION:
			case ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME:
			case ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createActivityNodeExecution()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createActivityEdgeTraversal()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternInitialization()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternMatching()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternApplication()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectBound()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectNotBound()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectBindingRevoked()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createTraversingLink()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createLinkCheckSuccessful()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createLinkCheckFailed()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createExpressionEvaluation()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createInstanceObjectCreation()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createInstanceObjectDeletion()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createInstanceLinkCreation()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createInstanceLinkDeletion()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createAttributeValueSet()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createVariableCreated()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createVariableDeleted()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createVariableChanged()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectConstraintHolds()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectConstraintViolated()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternConstraintHolds()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION_TRACE__EXECUTIONS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternConstraintViolated()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
