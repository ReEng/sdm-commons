package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.storydriven.storydiagrams.diagram.custom.EllipseDecoration;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationEditPart;
import org.storydriven.storydiagrams.patterns.ContainmentRelation;

public class CustomContainmentRelationEditPart extends ContainmentRelationEditPart {
	public CustomContainmentRelationEditPart(View view) {
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

	private void updateFigure() {
		ContainmentRelation link = (ContainmentRelation) ((View) getModel()).getElement();
		Color color = SdmUtility.getColor(link);

		getPrimaryShape().setSourceDecoration(createSourceDecoration(color));
		getPrimaryShape().setForegroundColor(color);
	}

	private RotatableDecoration createSourceDecoration(Color color) {
		EllipseDecoration dfe = new EllipseDecoration(getMapMode());
		dfe.setForegroundColor(color);
		dfe.setBackgroundColor(color);
		return dfe;
	}
}
