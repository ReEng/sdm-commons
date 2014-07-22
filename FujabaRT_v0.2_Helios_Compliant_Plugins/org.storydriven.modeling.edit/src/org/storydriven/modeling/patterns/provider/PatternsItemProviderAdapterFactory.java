/**
 * <copyright> </copyright> $Id$
 */
package org.storydriven.modeling.patterns.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.storydriven.modeling.patterns.util.PatternsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsItemProviderAdapterFactory extends PatternsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.ObjectVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectVariableItemProvider objectVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.ObjectVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectVariableAdapter() {
		if (objectVariableItemProvider == null) {
			objectVariableItemProvider = new ObjectVariableItemProvider(this);
		}

		return objectVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.AttributeAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeAssignmentItemProvider attributeAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.AttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAssignmentAdapter() {
		if (attributeAssignmentItemProvider == null) {
			attributeAssignmentItemProvider = new AttributeAssignmentItemProvider(
					this);
		}

		return attributeAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.LinkConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkConstraintItemProvider linkConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.LinkConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkConstraintAdapter() {
		if (linkConstraintItemProvider == null) {
			linkConstraintItemProvider = new LinkConstraintItemProvider(this);
		}

		return linkConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.ObjectSetVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSetVariableItemProvider objectSetVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.ObjectSetVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectSetVariableAdapter() {
		if (objectSetVariableItemProvider == null) {
			objectSetVariableItemProvider = new ObjectSetVariableItemProvider(
					this);
		}

		return objectSetVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.PrimitiveVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveVariableItemProvider primitiveVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.PrimitiveVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveVariableAdapter() {
		if (primitiveVariableItemProvider == null) {
			primitiveVariableItemProvider = new PrimitiveVariableItemProvider(
					this);
		}

		return primitiveVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.Path} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathItemProvider pathItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.Path}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathAdapter() {
		if (pathItemProvider == null) {
			pathItemProvider = new PathItemProvider(this);
		}

		return pathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.LinkVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkVariableItemProvider linkVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.LinkVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkVariableAdapter() {
		if (linkVariableItemProvider == null) {
			linkVariableItemProvider = new LinkVariableItemProvider(this);
		}

		return linkVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.ContainmentRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentRelationItemProvider containmentRelationItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.ContainmentRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainmentRelationAdapter() {
		if (containmentRelationItemProvider == null) {
			containmentRelationItemProvider = new ContainmentRelationItemProvider(
					this);
		}

		return containmentRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.MatchingPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingPatternItemProvider matchingPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.MatchingPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchingPatternAdapter() {
		if (matchingPatternItemProvider == null) {
			matchingPatternItemProvider = new MatchingPatternItemProvider(this);
		}

		return matchingPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.ContainerVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerVariableItemProvider containerVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.ContainerVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerVariableAdapter() {
		if (containerVariableItemProvider == null) {
			containerVariableItemProvider = new ContainerVariableItemProvider(
					this);
		}

		return containerVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.modeling.patterns.StoryPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternItemProvider storyPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.modeling.patterns.StoryPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoryPatternAdapter() {
		if (storyPatternItemProvider == null) {
			storyPatternItemProvider = new StoryPatternItemProvider(this);
		}

		return storyPatternItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (objectVariableItemProvider != null)
			objectVariableItemProvider.dispose();
		if (constraintItemProvider != null)
			constraintItemProvider.dispose();
		if (linkConstraintItemProvider != null)
			linkConstraintItemProvider.dispose();
		if (attributeAssignmentItemProvider != null)
			attributeAssignmentItemProvider.dispose();
		if (objectSetVariableItemProvider != null)
			objectSetVariableItemProvider.dispose();
		if (primitiveVariableItemProvider != null)
			primitiveVariableItemProvider.dispose();
		if (pathItemProvider != null)
			pathItemProvider.dispose();
		if (linkVariableItemProvider != null)
			linkVariableItemProvider.dispose();
		if (containmentRelationItemProvider != null)
			containmentRelationItemProvider.dispose();
		if (matchingPatternItemProvider != null)
			matchingPatternItemProvider.dispose();
		if (containerVariableItemProvider != null)
			containerVariableItemProvider.dispose();
		if (storyPatternItemProvider != null)
			storyPatternItemProvider.dispose();
	}

}
