package org.storydriven.storydiagrams.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.commands.InclusionLinkCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.InclusionLinkReorientCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.LinkVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.LinkVariableReorientCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.MaybeLinkCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.MaybeLinkReorientCommand;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MaybeLinkEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class CollectionVariableItemSemanticEditPolicy extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.CollectionVariable_3002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (StorydiagramsVisualIDRegistry.getVisualID(incomingLink) == LinkVariableEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (StorydiagramsVisualIDRegistry.getVisualID(incomingLink) == InclusionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (StorydiagramsVisualIDRegistry.getVisualID(incomingLink) == MaybeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (StorydiagramsVisualIDRegistry.getVisualID(outgoingLink) == LinkVariableEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (StorydiagramsVisualIDRegistry.getVisualID(outgoingLink) == InclusionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (StorydiagramsVisualIDRegistry.getVisualID(outgoingLink) == MaybeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (StorydiagramsVisualIDRegistry.getVisualID(node)) {
			case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (StorydiagramsVisualIDRegistry.getVisualID(cnode)) {
					case ConstraintEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
								.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (StorydiagramsVisualIDRegistry.getVisualID(cnode)) {
					case AttributeAssignmentEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
								.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (StorydiagramsElementTypes.LinkVariable_4002 == req.getElementType()) {
			return getGEFWrapper(new LinkVariableCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (StorydiagramsElementTypes.InclusionLink_4003 == req.getElementType()) {
			return getGEFWrapper(new InclusionLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (StorydiagramsElementTypes.MaybeLink_4004 == req.getElementType()) {
			return getGEFWrapper(new MaybeLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (StorydiagramsElementTypes.LinkVariable_4002 == req.getElementType()) {
			return getGEFWrapper(new LinkVariableCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (StorydiagramsElementTypes.InclusionLink_4003 == req.getElementType()) {
			return getGEFWrapper(new InclusionLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (StorydiagramsElementTypes.MaybeLink_4004 == req.getElementType()) {
			return getGEFWrapper(new MaybeLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case LinkVariableEditPart.VISUAL_ID:
			return getGEFWrapper(new LinkVariableReorientCommand(req));
		case InclusionLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new InclusionLinkReorientCommand(req));
		case MaybeLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new MaybeLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
