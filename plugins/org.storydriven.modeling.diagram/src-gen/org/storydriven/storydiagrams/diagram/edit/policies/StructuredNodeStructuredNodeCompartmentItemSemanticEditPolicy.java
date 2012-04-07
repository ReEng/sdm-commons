package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.JunctionNode2CreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ModifyingStoryNode2CreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StartNode2CreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StatementNode2CreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StopNode2CreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.StructuredNode2CreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StructuredNodeStructuredNodeCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredNodeStructuredNodeCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.StructuredNode_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.JunctionNode_3001 == req.getElementType()) {
			return getGEFWrapper(new JunctionNode2CreateCommand(req));
		}
		if (StorydiagramsElementTypes.StartNode_3002 == req.getElementType()) {
			return getGEFWrapper(new StartNode2CreateCommand(req));
		}
		if (StorydiagramsElementTypes.StopNode_3004 == req.getElementType()) {
			return getGEFWrapper(new StopNode2CreateCommand(req));
		}
		if (StorydiagramsElementTypes.StatementNode_3003 == req
				.getElementType()) {
			return getGEFWrapper(new StatementNode2CreateCommand(req));
		}
		if (StorydiagramsElementTypes.StructuredNode_3005 == req
				.getElementType()) {
			return getGEFWrapper(new StructuredNode2CreateCommand(req));
		}
		if (StorydiagramsElementTypes.ModifyingStoryNode_3011 == req
				.getElementType()) {
			return getGEFWrapper(new ModifyingStoryNode2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
