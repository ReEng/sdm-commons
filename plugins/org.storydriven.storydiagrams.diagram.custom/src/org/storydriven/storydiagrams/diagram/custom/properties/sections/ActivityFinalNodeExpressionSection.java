package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;

public class ActivityFinalNodeExpressionSection extends AbstractExpressionSection {

	@Override
	protected Expression getExpression() {
		if (getElement().getReturnValue() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("3.0");

			RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
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
	protected EClassifier getContextClassifier() {
		Activity activity = ActivityUtil.getActivity(getElement());

		if (activity != null && activity.getOutParameters().size() == 1) {
			return activity.getOutParameters().get(0).getEType();
		}

		return super.getContextClassifier();
	}

	@Override
	protected void postUpdate() {
		Expression expression = getElement().getReturnValue();

		// TODO: ugly
		getElement().getReturnValues().remove(expression);
		getElement().getReturnValues().add(expression);
	}

	@Override
	protected ActivityFinalNode getElement() {
		return (ActivityFinalNode) super.getElement();
	}
}
