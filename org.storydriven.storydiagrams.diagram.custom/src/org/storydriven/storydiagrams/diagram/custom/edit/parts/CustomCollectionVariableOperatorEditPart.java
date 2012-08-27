package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableOperatorEditPart;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class CustomCollectionVariableOperatorEditPart extends ObjectVariableOperatorEditPart {
	public CustomCollectionVariableOperatorEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);

		if (event.getNotifier() instanceof ObjectVariable) {
			adjustColorAndModifierLabel();
		}
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		adjustColorAndModifierLabel();
	}

	protected void adjustColorAndModifierLabel() {
		SdmUtility.adaptColor(getFigure(),
				((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());

		setLabelText(SdmUtility.adaptObjectVariableModifierText(this));
	}
}
