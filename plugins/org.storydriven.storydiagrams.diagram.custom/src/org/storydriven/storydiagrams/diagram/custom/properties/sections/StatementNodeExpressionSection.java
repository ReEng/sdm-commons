package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;

public class StatementNodeExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		if (getElement().getStatementExpression() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().setStatementExpression(expression);
				}
			};
			execute(command);
		}
		return getElement().getStatementExpression();
	}

	@Override
	protected StatementNode getElement() {
		return (StatementNode) super.getElement();
	}

	@Override
	protected void postUpdate() {
		Expression expression = getElement().getStatementExpression();

		// TODO: ugly
		getElement().setStatementExpression(null);
		getElement().setStatementExpression(expression);
	}
}
