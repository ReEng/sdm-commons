package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.ObjectVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.PrimitiveVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class MatchingPatternStoryPatternCompartementItemSemanticEditPolicy extends
		StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchingPatternStoryPatternCompartementItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.MatchingPattern_3012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.ObjectVariable_3009 == req.getElementType()) {
			return getGEFWrapper(new ObjectVariableCreateCommand(req));
		}
		if (StorydiagramsElementTypes.PrimitiveVariable_3011 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
