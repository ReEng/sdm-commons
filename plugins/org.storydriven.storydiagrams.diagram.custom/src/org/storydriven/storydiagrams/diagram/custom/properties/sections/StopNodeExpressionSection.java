package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.transaction.RecordingCommand;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;

public class StopNodeExpressionSection extends AbstractExpressionSection {

	@Override
	protected Expression getExpression() {
		if (getElement().getReturnValue() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand(getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().getReturnValues().add(expression);
				}
			};
			execute(command);
		}
		return getElement().getReturnValue();
	}

	@Override
	protected StopNode getElement() {
		return (StopNode) super.getElement();
	}
}
