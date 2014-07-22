/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.provider;

import de.mdelab.sdm.interpreter.core.executionTrace.Execution;
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
 * This is the item provider adapter for a {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider,
		ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionItemProvider(AdapterFactory adapterFactory)
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

			addExecutionStartedTimeStampPropertyDescriptor(object);
			addExecutionFinishedTimeStampPropertyDescriptor(object);
			addExecutionTimePropertyDescriptor(object);
			addExecutionTimeMsecPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Execution Started Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionStartedTimeStampPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Execution_executionStartedTimeStamp_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionStartedTimeStamp_feature", "_UI_Execution_type"),
				ExecutionTracePackage.Literals.EXECUTION__EXECUTION_STARTED_TIME_STAMP, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Execution Finished Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionFinishedTimeStampPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Execution_executionFinishedTimeStamp_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionFinishedTimeStamp_feature", "_UI_Execution_type"),
				ExecutionTracePackage.Literals.EXECUTION__EXECUTION_FINISHED_TIME_STAMP, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Execution Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionTimePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Execution_executionTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionTime_feature", "_UI_Execution_type"),
				ExecutionTracePackage.Literals.EXECUTION__EXECUTION_TIME, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Execution Time Msec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionTimeMsecPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Execution_executionTimeMsec_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionTimeMsec_feature", "_UI_Execution_type"),
				ExecutionTracePackage.Literals.EXECUTION__EXECUTION_TIME_MSEC, false, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		Execution execution = (Execution) object;
		return getString("_UI_Execution_type") + " " + execution.getExecutionStartedTimeStamp();
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

		switch (notification.getFeatureID(Execution.class))
		{
			case ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
			case ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
			case ExecutionTracePackage.EXECUTION__EXECUTION_TIME:
			case ExecutionTracePackage.EXECUTION__EXECUTION_TIME_MSEC:
			case ExecutionTracePackage.EXECUTION__CONTAINER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExecutionTracePackage.EXECUTION__ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createActivityNodeExecution()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createActivityEdgeTraversal()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternInitialization()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternMatching()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternApplication()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectBound()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectNotBound()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectBindingRevoked()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createTraversingLink()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createLinkCheckSuccessful()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createLinkCheckFailed()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createExpressionEvaluation()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createInstanceObjectCreation()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createInstanceObjectDeletion()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createInstanceLinkCreation()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createInstanceLinkDeletion()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createAttributeValueSet()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createVariableCreated()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createVariableDeleted()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createVariableChanged()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectConstraintHolds()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternObjectConstraintViolated()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
				ExecutionTraceFactory.eINSTANCE.createStoryPatternConstraintHolds()));

		newChildDescriptors.add(createChildParameter(ExecutionTracePackage.Literals.EXECUTION__ELEMENTS,
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
