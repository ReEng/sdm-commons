package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.LinkVariable;

public class CustomLinkVariableEditPart extends LinkVariableEditPart {
	private PolygonDecoration cross;

	public CustomLinkVariableEditPart(View view) {
		super(view);

		// prepare cross
		PointList pl = new PointList();
		pl.addPoint(-2, -2);
		pl.addPoint(0, 0);
		pl.addPoint(2, -2);
		pl.addPoint(0, 0);
		pl.addPoint(2, 2);
		pl.addPoint(0, 0);
		pl.addPoint(-2, 2);
		pl.addPoint(0, 0);

		cross = new PolygonDecoration();
		cross.setTemplate(pl);
		cross.setScale(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1));
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
		LinkVariable link = (LinkVariable) ((View) getModel()).getElement();
		Color color = SdmUtility.getColor(link);

		// target arrow
		RotatableDecoration targetDecoration = null;
		if (link.getSourceEnd() == null && link.getTargetEnd() != null) {
			targetDecoration = createTargetDecoration(color);
		}
		getPrimaryShape().setTargetDecoration(targetDecoration);

		// containment diamond
		RotatableDecoration sourceDecoration = null;
		if (link.getTargetEnd() != null && link.getTargetEnd().isContainment()) {
			sourceDecoration = createSourceDecoration(color);
		}
		getPrimaryShape().setSourceDecoration(sourceDecoration);

		// color
		getPrimaryShape().setForegroundColor(color);

		// line style
		if (BindingSemantics.OPTIONAL.equals(link.getBindingSemantics())) {
			getPrimaryShape().setLineStyle(SWT.LINE_DASH);
		} else {
			getPrimaryShape().setLineStyle(SWT.LINE_SOLID);
		}

		if (BindingSemantics.NEGATIVE.equals(link.getBindingSemantics())) {
			// getPrimaryShape().add(cross);
		} else if (getPrimaryShape().getChildren().contains(cross)) {
			// getPrimaryShape().remove(cross);
		}

	}

	private RotatableDecoration createTargetDecoration(Color color) {
		PolylineDecoration df = new PolylineDecoration();
		df.setForegroundColor(color);
		return df;
	}

	private RotatableDecoration createSourceDecoration(Color color) {
		PolygonDecoration df = new PolygonDecoration();
		df.setForegroundColor(color);
		df.setFill(true);
		PointList pl = new PointList();
		pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
		pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
		pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
		pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
		df.setTemplate(pl);
		df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
		return df;
	}
}
