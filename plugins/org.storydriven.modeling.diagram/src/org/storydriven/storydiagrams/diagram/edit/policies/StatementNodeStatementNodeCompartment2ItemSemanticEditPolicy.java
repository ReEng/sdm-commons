package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.TextualExpressionCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StatementNodeStatementNodeCompartment2ItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatementNodeStatementNodeCompartment2ItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.StatementNode_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.TextualExpression_3001 == req
				.getElementType()) {
			return getGEFWrapper(new TextualExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
