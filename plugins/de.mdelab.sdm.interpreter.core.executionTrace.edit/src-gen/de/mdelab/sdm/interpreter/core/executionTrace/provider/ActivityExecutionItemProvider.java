/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
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
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTraceFactory;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;

/**
 * This is the item provider adapter for a
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActivityExecutionItemProvider extends ExecutionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider,
		ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityExecutionItemProvider(final AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object)
	{
		if (this.itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			this.addActivityPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(final Object object)
	{
		this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory)
				.getRootAdapterFactory(), this.getResourceLocator(), this.getString("_UI_ActivityExecution_activity_feature"), this
				.getString("_UI_PropertyDescriptor_description", "_UI_ActivityExecution_activity_feature", "_UI_ActivityExecution_type"),
				ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__ACTIVITY, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object)
	{
		if (this.childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			this.childrenFeatures.add(ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES);
			this.childrenFeatures.add(ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES);
		}
		return this.childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(final Object object, final Object child)
	{
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ActivityExecution.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object)
	{
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ActivityExecution"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(final Object object)
	{
		final ActivityExecution<?> activityExecution = (ActivityExecution<?>) object;
		String label = this.getString("_UI_ActivityExecution_type");

		label += " " + activityExecution.getExecutionTimeMsec() + " msec - ";

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (activityExecution.getActivity() instanceof EObject)
		{
			label += ((IItemLabelProvider) factory.adapt(activityExecution.getActivity(), IItemLabelProvider.class))
					.getText(activityExecution.getActivity());
		}
		else
		{
			label += activityExecution.getActivity().toString();
		}

		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification)
	{
		this.updateChildren(notification);

		switch (notification.getFeatureID(ActivityExecution.class))
		{
			case ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
			case ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(this.createChildParameter(ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES,
				ExecutionTraceFactory.eINSTANCE.create(ExecutionTracePackage.Literals.MAP_ENTRY)));

		newChildDescriptors.add(this.createChildParameter(ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES,
				ExecutionTraceFactory.eINSTANCE.create(ExecutionTracePackage.Literals.MAP_ENTRY)));
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(final Object owner, final Object feature, final Object child, final Collection<?> selection)
	{
		final Object childFeature = feature;
		final Object childObject = child;

		final boolean qualify = childFeature == ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES
				|| childFeature == ExecutionTracePackage.Literals.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES;

		if (qualify)
		{
			return this.getString("_UI_CreateChild_text2", new Object[]
			{
					this.getTypeText(childObject), this.getFeatureText(childFeature), this.getTypeText(owner)
			});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}
}
