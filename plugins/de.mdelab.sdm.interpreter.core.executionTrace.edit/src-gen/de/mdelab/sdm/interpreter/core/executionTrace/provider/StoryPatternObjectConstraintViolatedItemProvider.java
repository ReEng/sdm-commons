/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.EMFEditPlugin;
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

import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated;

/**
 * This is the item provider adapter for a
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StoryPatternObjectConstraintViolatedItemProvider extends StoryPatternObjectConstraintEvaluationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		ITableItemLabelProvider, ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternObjectConstraintViolatedItemProvider(final AdapterFactory adapterFactory)
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

		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This returns StoryPatternObjectConstraintViolated.gif. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object)
	{
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/StoryPatternObjectConstraintViolated"));
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
		String label = this.getString("_UI_StoryPatternObjectConstraintViolated_type") + " ";
		final StoryPatternObjectConstraintViolated<?, ?> storyPatternObjectConstraintViolated = (StoryPatternObjectConstraintViolated<?, ?>) object;

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (storyPatternObjectConstraintViolated.getConstraint() != null)
		{
			if (storyPatternObjectConstraintViolated.getConstraint() instanceof EObject)
			{
				label += ((IItemLabelProvider) factory
						.adapt(storyPatternObjectConstraintViolated.getConstraint(), IItemLabelProvider.class))
						.getText(storyPatternObjectConstraintViolated.getConstraint());
			}
			else
			{
				label += storyPatternObjectConstraintViolated.getConstraint().toString();
			}
		}
		else
		{
			label += "[null]";
		}

		label += " on ";

		if (storyPatternObjectConstraintViolated.getStoryPatternObject() != null)
		{
			if (storyPatternObjectConstraintViolated.getStoryPatternObject() instanceof EObject)
			{
				label += ((IItemLabelProvider) factory.adapt(storyPatternObjectConstraintViolated.getStoryPatternObject(),
						IItemLabelProvider.class)).getText(storyPatternObjectConstraintViolated.getStoryPatternObject());
			}
			else
			{
				label += storyPatternObjectConstraintViolated.getStoryPatternObject().toString();
			}
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
