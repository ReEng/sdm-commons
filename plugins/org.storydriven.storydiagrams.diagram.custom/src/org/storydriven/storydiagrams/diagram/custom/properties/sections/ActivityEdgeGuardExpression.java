package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;

public class ActivityEdgeGuardExpression extends AbstractExpressionSection {

	@Override
	protected Expression getExpression() {
		if (EdgeGuard.BOOL.equals(getElement().getGuard()) && getElement().getGuardExpression() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand(getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().setGuardExpression(expression);
				}
			};
			execute(command);
		}
		return getElement().getGuardExpression();
	}

	@Override
	protected ActivityEdge getElement() {
		return (ActivityEdge) super.getElement();
	}

	@Override
	protected EClassifier getContextClassifier() {
		return EcorePackage.Literals.EBOOLEAN;
	}
}
