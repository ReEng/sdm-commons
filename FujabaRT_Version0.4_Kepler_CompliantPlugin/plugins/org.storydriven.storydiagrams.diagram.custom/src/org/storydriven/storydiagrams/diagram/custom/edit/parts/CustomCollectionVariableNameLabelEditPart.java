package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableNameLabelEditPart;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class CustomCollectionVariableNameLabelEditPart extends CollectionVariableNameLabelEditPart {
	public CustomCollectionVariableNameLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() instanceof CollectionVariable) {
			SdmUtility.adaptColor(getFigure(),
					((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());
			setLabelText(getText((CollectionVariable) ((View) getModel()).getElement()));
		}

		super.handleNotificationEvent(event);
	}

	private String getText(CollectionVariable element) {
		StringBuilder builder = new StringBuilder();

		builder.append(element.getName());

		if (BindingState.MAYBE_BOUND.equals(element.getBindingState())) {
			builder.append('?');
		}

		if (!BindingState.BOUND.equals(element.getBindingState())) {
			builder.append(' ');
			builder.append(':');
			builder.append(' ');
			if (element.getClassifier() != null) {
				builder.append(element.getClassifier().getName());
			} else {
				builder.append(element.getClassifier());
			}
		}

		return builder.toString();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		SdmUtility.adaptColor(getFigure(),
				((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());

		((WrappingLabel) getFigure()).setTextUnderline(true);
	}
}
