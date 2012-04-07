package org.storydriven.storydiagrams.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeStatementNodeCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeStatementNodeCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternCompartementEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.storydiagrams.diagram.part.Messages;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

/**
 * @generated
 */
public class StorydiagramsNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public StorydiagramsNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<StorydiagramsNavigatorItem> result = new ArrayList<StorydiagramsNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof StorydiagramsNavigatorGroup) {
			StorydiagramsNavigatorGroup group = (StorydiagramsNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof StorydiagramsNavigatorItem) {
			StorydiagramsNavigatorItem navigatorItem = (StorydiagramsNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {

		case StoryPatternEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StoryPatternStoryPatternCompartementEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(ObjectVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StoryPatternStoryPatternCompartementEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(PrimitiveVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ModifyingStoryNode2EditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ModifyingStoryNode_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ModifyingStoryNode_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StoryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StartNode2EditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StartNode_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StartNode_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityEdgeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			StorydiagramsNavigatorGroup target = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ActivityEdge_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup source = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ActivityEdge_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StartNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StopNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(JunctionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityCallNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(JunctionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StartNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StopNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StartNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StopNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(JunctionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityCallNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(JunctionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StartNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StopNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StopNode2EditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StopNode_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StopNode_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StartNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StartNode_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StartNode_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case JunctionNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_JunctionNode_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_JunctionNode_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StructuredNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StructuredNode_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StructuredNode_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(JunctionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StartNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StopNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StatementNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StructuredNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StructuredNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StatementNode2EditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StatementNode_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StatementNode_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNodeStatementNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(TextualExpressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityCallNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ActivityCallNode_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ActivityCallNode_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StopNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StopNode_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StopNode_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ModifyingStoryNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ModifyingStoryNode_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ModifyingStoryNode_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StoryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ObjectVariableEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ObjectVariable_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_ObjectVariable_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(AttributeAssignmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(LinkVariableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(LinkVariableEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PrimitiveVariableEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_PrimitiveVariable_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(LinkVariableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case StatementNodeEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StatementNode_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StatementNode_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNodeStatementNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(TextualExpressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			StorydiagramsNavigatorGroup links = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_Activity_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StartNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StopNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(JunctionNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StatementNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityCallNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(LinkVariableEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case JunctionNode2EditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_JunctionNode_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_JunctionNode_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StructuredNode2EditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Node sv = (Node) view;
			StorydiagramsNavigatorGroup incominglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StructuredNode_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup outgoinglinks = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_StructuredNode_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(JunctionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StartNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StopNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StatementNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StructuredNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(ModifyingStoryNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					StorydiagramsVisualIDRegistry
							.getType(StructuredNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LinkVariableEditPart.VISUAL_ID: {
			LinkedList<StorydiagramsAbstractNavigatorItem> result = new LinkedList<StorydiagramsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			StorydiagramsNavigatorGroup target = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_LinkVariable_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			StorydiagramsNavigatorGroup source = new StorydiagramsNavigatorGroup(
					Messages.NavigatorGroupName_LinkVariable_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ObjectVariableEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(PrimitiveVariableEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					StorydiagramsVisualIDRegistry
							.getType(ObjectVariableEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityEditPart.MODEL_ID.equals(StorydiagramsVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<StorydiagramsNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<StorydiagramsNavigatorItem> result = new ArrayList<StorydiagramsNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new StorydiagramsNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof StorydiagramsAbstractNavigatorItem) {
			StorydiagramsAbstractNavigatorItem abstractNavigatorItem = (StorydiagramsAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
