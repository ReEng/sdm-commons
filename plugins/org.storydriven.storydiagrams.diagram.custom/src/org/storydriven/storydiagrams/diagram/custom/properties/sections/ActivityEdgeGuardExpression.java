package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;

public class ActivityEdgeGuardExpression extends AbstractExpressionSection {

	@Override
	protected Expression getExpression() {
		if (EdgeGuard.BOOL.equals(getElement().getGuard())) {
			if (getElement().getGuardExpression() == null) {
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
		return null;
	}

	@Override
	protected void postUpdate() {
		// TODO: ugly
		Expression expression = getElement().getGuardExpression();

		getElement().setGuardExpression(null);
		getElement().setGuardExpression(expression);
	}

	@Override
	protected ActivityEdge getElement() {
		return (ActivityEdge) super.getElement();
	}

	@Override
	protected void notifyChanged(Notification msg) {
		if (msg.getFeature() != null && msg.getFeature().equals(ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD)) {
			refresh();
		}
	}

	@Override
	protected EClassifier getContextClassifier() {
		return EcorePackage.Literals.EBOOLEAN;
	}
}
