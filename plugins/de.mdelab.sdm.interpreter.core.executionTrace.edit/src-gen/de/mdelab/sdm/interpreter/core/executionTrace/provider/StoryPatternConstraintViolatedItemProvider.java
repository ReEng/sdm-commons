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

import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated;

/**
 * This is the item provider adapter for a
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StoryPatternConstraintViolatedItemProvider extends StoryPatternConstraintEvaluationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		ITableItemLabelProvider, ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternConstraintViolatedItemProvider(final AdapterFactory adapterFactory)
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
	 * This returns StoryPatternConstraintViolated.gif. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object)
	{
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/StoryPatternConstraintViolated"));
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
		String label = this.getString("_UI_StoryPatternConstraintViolated_type") + " ";
		final StoryPatternConstraintViolated<?, ?> storyPatternConstraintViolated = (StoryPatternConstraintViolated<?, ?>) object;

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (storyPatternConstraintViolated.getConstraint() != null)
		{
			if (storyPatternConstraintViolated.getConstraint() instanceof EObject)
			{
				label += ((IItemLabelProvider) factory.adapt(storyPatternConstraintViolated.getConstraint(), IItemLabelProvider.class))
						.getText(storyPatternConstraintViolated.getConstraint());
			}
			else
			{
				label += storyPatternConstraintViolated.getConstraint().toString();
			}
		}
		else
		{
			label += "[null]";
		}

		label += " on ";

		if (storyPatternConstraintViolated.getStoryPattern() != null)
		{
			if (storyPatternConstraintViolated.getStoryPattern() instanceof EObject)
			{
				label += ((IItemLabelProvider) factory.adapt(storyPatternConstraintViolated.getStoryPattern(), IItemLabelProvider.class))
						.getText(storyPatternConstraintViolated.getStoryPattern());
			}
			else
			{
				label += storyPatternConstraintViolated.getStoryPattern().toString();
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
