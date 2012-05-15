package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeActivityCallNodeCompartmentEditPart;

public class CustomActivityCallNodeActivityCallNodeCompartmentEditPart extends
		ActivityCallNodeActivityCallNodeCompartmentEditPart {
	public CustomActivityCallNodeActivityCallNodeCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		WrappingLabel fFigureCalledActivityNameLabel = new WrappingLabel();
		fFigureCalledActivityNameLabel.setForegroundColor(ColorConstants.black);
		fFigureCalledActivityNameLabel.setText(SdmUtility.STEREOTYPE_PREFIX + "   Called Activity:    "
				+ SdmUtility.STEREOTYPE_SUFFIX);
		if (((ActivityCallNode) this.getPrimaryView().getElement()).getCalledActivities().size() > 0) {
			fFigureCalledActivityNameLabel.setText(SdmUtility.STEREOTYPE_PREFIX + "   Called Activity: "
					+ ((ActivityCallNode) this.getPrimaryView().getElement()).getCalledActivities().get(0).getName()
					+ "   " + SdmUtility.STEREOTYPE_SUFFIX);
		}
		fFigureCalledActivityNameLabel.setAlignment(PositionConstants.CENTER);

		result.add(fFigureCalledActivityNameLabel);
		result.setTitleVisibility(false);
		return result;
	}
}
