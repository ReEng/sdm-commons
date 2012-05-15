package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class CustomObjectVariableEditPart extends ObjectVariableEditPart {
	public CustomObjectVariableEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof ObjectVariable) {
			updateFigure();
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	private void updateFigure() {
		ObjectVariable ov = (ObjectVariable) ((View) getModel()).getElement();

		int style = Graphics.LINE_SOLID;
		if (BindingSemantics.OPTIONAL.equals(ov.getBindingSemantics())) {
			style = Graphics.LINE_DASH;
		}

		Collection<RectangleFigure> figures = new HashSet<RectangleFigure>();
		collect(figures, getPrimaryShape());
		for (RectangleFigure figure : figures) {
			figure.setLineStyle(style);
		}
	}

	private static void collect(Collection<RectangleFigure> figures, RectangleFigure figure) {
		figures.add(figure);

		for (Object child : figure.getChildren()) {
			if (child instanceof RectangleFigure) {
				collect(figures, (RectangleFigure) child);
			}
		}
	}
}
