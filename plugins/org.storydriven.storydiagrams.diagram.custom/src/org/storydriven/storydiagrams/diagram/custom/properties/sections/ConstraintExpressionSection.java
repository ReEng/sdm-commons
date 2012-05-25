package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class ConstraintExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		if (getElement().getConstraintExpression() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand(getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().setConstraintExpression(expression);
				}
			};
			execute(command);
		}
		return getElement().getConstraintExpression();
	}

	@Override
	protected EClassifier getContextClassifier() {
		AbstractVariable variable = getElement().getObjectVariable();
		if (variable instanceof ObjectVariable) {
			return ((ObjectVariable) variable).getClassifier();
		}
		return super.getContextClassifier();
	}

	@Override
	protected Constraint getElement() {
		return (Constraint) super.getElement();
	}
}
