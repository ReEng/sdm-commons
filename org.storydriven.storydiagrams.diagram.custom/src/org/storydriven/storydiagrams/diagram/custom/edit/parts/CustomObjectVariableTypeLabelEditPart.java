package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableTypeLabelEditPart;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class CustomObjectVariableTypeLabelEditPart extends ObjectVariableTypeLabelEditPart {
	public CustomObjectVariableTypeLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		updateFigure();
		super.handleNotificationEvent(event);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	protected void updateFigure() {
		SdmUtility.adaptColor(getFigure(),
				((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());

		ObjectVariable ov = (ObjectVariable) ((View) getModel()).getElement();

		String text = "";

		String eClassName = "[null]";
		if (ov.getClassifier() != null) {
			eClassName = ov.getClassifier().getName();
		}

		text = " : " + eClassName;

		if (ov.getBindingState() == BindingState.BOUND) {
			setForegroundColor(new Color(null, 160, 160, 160));
			((WrappingLabel) this.getFigure()).setOpaque(false);
		} else if (ov.getBindingState() == BindingState.MAYBE_BOUND) {
			setBackgroundColor(new Color(null, 200, 200, 200));
			((WrappingLabel) this.getFigure()).setOpaque(true);
		} else if (ov.getBindingState() == BindingState.UNBOUND) {
			((WrappingLabel) this.getFigure()).setOpaque(false);
			/*
			 * Leave the color as is, so it is green in case of created
			 * objects, red for destroyed objects, and black otherwise.
			 */
		}

		if (text.length() > 50) {
			text = text.substring(0, 50);
			text += "...";
		}

		setLabelText(text);

		((WrappingLabel) getFigure()).setTextUnderline(true);
	}
}
