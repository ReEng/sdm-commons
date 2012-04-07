package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.TextualExpressionCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StatementNodeStatementNodeCompartmentItemSemanticEditPolicy extends
		StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatementNodeStatementNodeCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.StatementNode_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.TextualExpression_3015 == req
				.getElementType()) {
			return getGEFWrapper(new TextualExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
