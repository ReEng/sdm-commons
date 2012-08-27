package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.ActivityCallNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ActivityFinalNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.FlowFinalNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.InitialNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.JunctionNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.MatchingStoryNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ModifyingStoryNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StatementNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.Activity_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.ActivityCallNode_2001 == req.getElementType()) {
			return getGEFWrapper(new ActivityCallNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.StatementNode_2002 == req.getElementType()) {
			return getGEFWrapper(new StatementNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.ModifyingStoryNode_2003 == req.getElementType()) {
			return getGEFWrapper(new ModifyingStoryNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.MatchingStoryNode_2004 == req.getElementType()) {
			return getGEFWrapper(new MatchingStoryNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.InitialNode_2005 == req.getElementType()) {
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.JunctionNode_2006 == req.getElementType()) {
			return getGEFWrapper(new JunctionNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.FlowFinalNode_2007 == req.getElementType()) {
			return getGEFWrapper(new FlowFinalNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.ActivityFinalNode_2008 == req.getElementType()) {
			return getGEFWrapper(new ActivityFinalNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
