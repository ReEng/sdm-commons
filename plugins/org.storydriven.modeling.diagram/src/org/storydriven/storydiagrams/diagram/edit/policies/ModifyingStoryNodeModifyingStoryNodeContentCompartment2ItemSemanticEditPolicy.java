package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.StoryPatternCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ModifyingStoryNodeModifyingStoryNodeContentCompartment2ItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModifyingStoryNodeModifyingStoryNodeContentCompartment2ItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.ModifyingStoryNode_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.StoryPattern_3008 == req.getElementType()) {
			return getGEFWrapper(new StoryPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
