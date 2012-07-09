/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.provider;

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
import org.storydriven.storydiagrams.activities.util.ActivitiesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesItemProviderAdapterFactory extends ActivitiesAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.ExceptionVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionVariableItemProvider exceptionVariableItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.ActivityEdge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeItemProvider activityEdgeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.OperationExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationExtensionItemProvider operationExtensionItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.MatchingStoryNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingStoryNodeItemProvider matchingStoryNodeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.StructuredNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredNodeItemProvider structuredNodeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.JunctionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunctionNodeItemProvider junctionNodeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.StatementNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementNodeItemProvider statementNodeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.ActivityCallNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityCallNodeItemProvider activityCallNodeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.ModifyingStoryNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyingStoryNodeItemProvider modifyingStoryNodeItemProvider;

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
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
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
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
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.ExceptionVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExceptionVariableAdapter() {
		if (exceptionVariableItemProvider == null) {
			exceptionVariableItemProvider = new ExceptionVariableItemProvider(this);
		}

		return exceptionVariableItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityEdgeAdapter() {
		if (activityEdgeItemProvider == null) {
			activityEdgeItemProvider = new ActivityEdgeItemProvider(this);
		}

		return activityEdgeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.OperationExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationExtensionAdapter() {
		if (operationExtensionItemProvider == null) {
			operationExtensionItemProvider = new OperationExtensionItemProvider(this);
		}

		return operationExtensionItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.MatchingStoryNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchingStoryNodeAdapter() {
		if (matchingStoryNodeItemProvider == null) {
			matchingStoryNodeItemProvider = new MatchingStoryNodeItemProvider(this);
		}

		return matchingStoryNodeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.StructuredNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredNodeAdapter() {
		if (structuredNodeItemProvider == null) {
			structuredNodeItemProvider = new StructuredNodeItemProvider(this);
		}

		return structuredNodeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.JunctionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJunctionNodeAdapter() {
		if (junctionNodeItemProvider == null) {
			junctionNodeItemProvider = new JunctionNodeItemProvider(this);
		}

		return junctionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.InitialNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialNodeItemProvider initialNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.InitialNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialNodeAdapter() {
		if (initialNodeItemProvider == null) {
			initialNodeItemProvider = new InitialNodeItemProvider(this);
		}

		return initialNodeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.StatementNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementNodeAdapter() {
		if (statementNodeItemProvider == null) {
			statementNodeItemProvider = new StatementNodeItemProvider(this);
		}

		return statementNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.ActivityFinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityFinalNodeItemProvider activityFinalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.ActivityFinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityFinalNodeAdapter() {
		if (activityFinalNodeItemProvider == null) {
			activityFinalNodeItemProvider = new ActivityFinalNodeItemProvider(this);
		}

		return activityFinalNodeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.ActivityCallNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityCallNodeAdapter() {
		if (activityCallNodeItemProvider == null) {
			activityCallNodeItemProvider = new ActivityCallNodeItemProvider(this);
		}

		return activityCallNodeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.ModifyingStoryNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyingStoryNodeAdapter() {
		if (modifyingStoryNodeItemProvider == null) {
			modifyingStoryNodeItemProvider = new ModifyingStoryNodeItemProvider(this);
		}

		return modifyingStoryNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.activities.FlowFinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowFinalNodeItemProvider flowFinalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.activities.FlowFinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowFinalNodeAdapter() {
		if (flowFinalNodeItemProvider == null) {
			flowFinalNodeItemProvider = new FlowFinalNodeItemProvider(this);
		}

		return flowFinalNodeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
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
		if (exceptionVariableItemProvider != null)
			exceptionVariableItemProvider.dispose();
		if (activityEdgeItemProvider != null)
			activityEdgeItemProvider.dispose();
		if (activityItemProvider != null)
			activityItemProvider.dispose();
		if (operationExtensionItemProvider != null)
			operationExtensionItemProvider.dispose();
		if (matchingStoryNodeItemProvider != null)
			matchingStoryNodeItemProvider.dispose();
		if (structuredNodeItemProvider != null)
			structuredNodeItemProvider.dispose();
		if (junctionNodeItemProvider != null)
			junctionNodeItemProvider.dispose();
		if (initialNodeItemProvider != null)
			initialNodeItemProvider.dispose();
		if (statementNodeItemProvider != null)
			statementNodeItemProvider.dispose();
		if (activityFinalNodeItemProvider != null)
			activityFinalNodeItemProvider.dispose();
		if (activityCallNodeItemProvider != null)
			activityCallNodeItemProvider.dispose();
		if (modifyingStoryNodeItemProvider != null)
			modifyingStoryNodeItemProvider.dispose();
		if (flowFinalNodeItemProvider != null)
			flowFinalNodeItemProvider.dispose();
	}

}
