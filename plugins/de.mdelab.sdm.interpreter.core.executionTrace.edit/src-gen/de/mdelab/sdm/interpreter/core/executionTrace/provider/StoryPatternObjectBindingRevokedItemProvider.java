/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked;

/**
 * This is the item provider adapter for a
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StoryPatternObjectBindingRevokedItemProvider extends StoryPatternObjectExecutionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		ITableItemLabelProvider, ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternObjectBindingRevokedItemProvider(final AdapterFactory adapterFactory)
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

			this.addPreviousValuePropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Previous Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPreviousValuePropertyDescriptor(final Object object)
	{
		this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory)
				.getRootAdapterFactory(), this.getResourceLocator(), this
				.getString("_UI_StoryPatternObjectBindingRevoked_previousValue_feature"), this.getString(
				"_UI_PropertyDescriptor_description", "_UI_StoryPatternObjectBindingRevoked_previousValue_feature",
				"_UI_StoryPatternObjectBindingRevoked_type"),
				ExecutionTracePackage.Literals.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns StoryPatternObjectBindingRevoked.gif. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object)
	{
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/StoryPatternObjectBindingRevoked"));
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
		String label = this.getString("_UI_StoryPatternObjectBindingRevoked_type");
		final StoryPatternObjectBindingRevoked<?> storyPatternObjectBindingRevoked = (StoryPatternObjectBindingRevoked<?>) object;

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (storyPatternObjectBindingRevoked.getStoryPatternObject() != null)
		{
			if (storyPatternObjectBindingRevoked.getStoryPatternObject() instanceof EObject)
			{
				label += " "
						+ ((IItemLabelProvider) factory.adapt(storyPatternObjectBindingRevoked.getStoryPatternObject(),
								IItemLabelProvider.class)).getText(storyPatternObjectBindingRevoked.getStoryPatternObject());
			}
			else
			{
				label += " " + storyPatternObjectBindingRevoked.getStoryPatternObject().toString();
			}
		}
		else
		{
			label += " [null]";
		}

		label += " ==> ";

		if (storyPatternObjectBindingRevoked.getPreviousValue() != null)
		{
			label += storyPatternObjectBindingRevoked.getPreviousValue();
		}
		else
		{
			label += "[null]";
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

		switch (notification.getFeatureID(StoryPatternObjectBindingRevoked.class))
		{
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
