package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.ActivityCallNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.JunctionNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ModifyingStoryNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StartNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StatementNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StopNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StructuredNodeCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends
		StorydiagramsBaseItemSemanticEditPolicy {

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
		if (StorydiagramsElementTypes.StartNode_2001 == req.getElementType()) {
			return getGEFWrapper(new StartNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.StopNode_2002 == req.getElementType()) {
			return getGEFWrapper(new StopNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.JunctionNode_2003 == req.getElementType()) {
			return getGEFWrapper(new JunctionNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.StatementNode_2004 == req
				.getElementType()) {
			return getGEFWrapper(new StatementNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.StructuredNode_2005 == req
				.getElementType()) {
			return getGEFWrapper(new StructuredNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.ModifyingStoryNode_2006 == req
				.getElementType()) {
			return getGEFWrapper(new ModifyingStoryNodeCreateCommand(req));
		}
		if (StorydiagramsElementTypes.ActivityCallNode_2007 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityCallNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
