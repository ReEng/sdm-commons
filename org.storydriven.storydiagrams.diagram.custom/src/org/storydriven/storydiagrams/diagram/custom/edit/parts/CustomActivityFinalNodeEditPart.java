package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.FlowFinalNode;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;

public class CustomActivityFinalNodeEditPart extends ActivityFinalNodeEditPart {

	public CustomActivityFinalNodeEditPart(View view) {
		super(view);
	}

	@Override
	public void refresh() {
		super.refresh();
		updateFigure();
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
	}

	private void updateFigure() {
		ActivityFinalNode element = (ActivityFinalNode) ((View) getModel()).getElement();
		Ellipse primaryEllipse = (Ellipse) getPrimaryShape().getChildren().get(0);
		if (element instanceof FlowFinalNode) {

			primaryEllipse.removeAll();
			primaryEllipse.setLayoutManager(new StackLayout());

			PolylineShape flowFinalNodeSlash0 = new PolylineShape();
			flowFinalNodeSlash0.addPoint(new Point(getMapMode().DPtoLP(4), getMapMode().DPtoLP(4)));
			flowFinalNodeSlash0.addPoint(new Point(getMapMode().DPtoLP(19), getMapMode().DPtoLP(19)));
			flowFinalNodeSlash0.setLineWidth(1);
			flowFinalNodeSlash0.setForegroundColor(ColorConstants.black);

			primaryEllipse.add(flowFinalNodeSlash0);

			PolylineShape flowFinalNodeBackSlash0 = new PolylineShape();
			flowFinalNodeBackSlash0.addPoint(new Point(getMapMode().DPtoLP(4), getMapMode().DPtoLP(19)));
			flowFinalNodeBackSlash0.addPoint(new Point(getMapMode().DPtoLP(19), getMapMode().DPtoLP(4)));
			flowFinalNodeBackSlash0.setLineWidth(1);
			flowFinalNodeBackSlash0.setForegroundColor(ColorConstants.black);

			primaryEllipse.add(flowFinalNodeBackSlash0);
		} else {
			primaryEllipse.removeAll();

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			primaryEllipse.setLayoutManager(layoutThis);

			Ellipse ActivityFinalNodeInnerEllipse0 = new Ellipse();
			ActivityFinalNodeInnerEllipse0.setBackgroundColor(ColorConstants.black);
			ActivityFinalNodeInnerEllipse0.setPreferredSize(new Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(
					15)));
			ActivityFinalNodeInnerEllipse0.setMaximumSize(new Dimension(getMapMode().DPtoLP(15), getMapMode()
					.DPtoLP(15)));
			ActivityFinalNodeInnerEllipse0.setMinimumSize(new Dimension(getMapMode().DPtoLP(15), getMapMode()
					.DPtoLP(15)));

			GridData constraintActivityFinalNodeInnerEllipse0 = new GridData();
			constraintActivityFinalNodeInnerEllipse0.verticalAlignment = GridData.CENTER;
			constraintActivityFinalNodeInnerEllipse0.horizontalAlignment = GridData.CENTER;
			constraintActivityFinalNodeInnerEllipse0.horizontalIndent = 0;
			constraintActivityFinalNodeInnerEllipse0.horizontalSpan = 1;
			constraintActivityFinalNodeInnerEllipse0.verticalSpan = 1;
			constraintActivityFinalNodeInnerEllipse0.grabExcessHorizontalSpace = true;
			constraintActivityFinalNodeInnerEllipse0.grabExcessVerticalSpace = true;

			primaryEllipse.add(ActivityFinalNodeInnerEllipse0, constraintActivityFinalNodeInnerEllipse0);
		}

		getPrimaryShape().getActivityFinalNodeLabel().setText(TextUtil.getText(element));
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicyEx();
	}

}
