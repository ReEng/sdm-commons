package org.storydriven.storydiagrams.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.commands.ContainmentRelationCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ContainmentRelationReorientCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.LinkVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.LinkVariableReorientCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.PathCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.PathReorientCommand;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PathEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ObjectSetVariableItemSemanticEditPolicy extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectSetVariableItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.ObjectSetVariable_3014);
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
			if (StorydiagramsVisualIDRegistry.getVisualID(incomingLink) == PathEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (StorydiagramsVisualIDRegistry.getVisualID(incomingLink) == ContainmentRelationEditPart.VISUAL_ID) {
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
			if (StorydiagramsVisualIDRegistry.getVisualID(outgoingLink) == PathEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (StorydiagramsVisualIDRegistry.getVisualID(outgoingLink) == ContainmentRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
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
		if (StorydiagramsElementTypes.Path_4003 == req.getElementType()) {
			return getGEFWrapper(new PathCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (StorydiagramsElementTypes.ContainmentRelation_4004 == req.getElementType()) {
			return getGEFWrapper(new ContainmentRelationCreateCommand(req, req.getSource(), req.getTarget()));
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
		if (StorydiagramsElementTypes.Path_4003 == req.getElementType()) {
			return getGEFWrapper(new PathCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (StorydiagramsElementTypes.ContainmentRelation_4004 == req.getElementType()) {
			return getGEFWrapper(new ContainmentRelationCreateCommand(req, req.getSource(), req.getTarget()));
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
		case PathEditPart.VISUAL_ID:
			return getGEFWrapper(new PathReorientCommand(req));
		case ContainmentRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new ContainmentRelationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
