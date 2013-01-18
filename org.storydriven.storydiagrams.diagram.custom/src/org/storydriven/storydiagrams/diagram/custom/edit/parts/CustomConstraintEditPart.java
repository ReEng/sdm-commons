package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.patterns.Constraint;

public class CustomConstraintEditPart extends ConstraintEditPart {
	public CustomConstraintEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateLabel();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateLabel();
	}

	private void updateLabel() {
		Constraint constraint = (Constraint) ((View) getModel()).getElement();
		setLabelText(TextUtil.getText(constraint));
	}
}
