package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.patterns.Constraint;

public class CustomConstraint2EditPart extends Constraint2EditPart {
	public CustomConstraint2EditPart(View view) {
		super(view);
		System.out.println("CustomConstraint2EditPart");
		if (view.getElement() instanceof Constraint) {
			System.out.println(view.getElement().eContainer());
		}
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
