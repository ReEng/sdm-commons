package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.fujaba.commons.figures.ISpecialCharachterConstants;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeActivityCallNodeCompartmentEditPart;

public class CustomActivityCallNodeActivityCallNodeCompartmentEditPart extends
		ActivityCallNodeActivityCallNodeCompartmentEditPart {
	static final Color THIS_FOR = new Color(null, 0, 0, 0);
	public CustomActivityCallNodeActivityCallNodeCompartmentEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		WrappingLabel fFigureCalledActivityNameLabel = new WrappingLabel();
		fFigureCalledActivityNameLabel.setForegroundColor(THIS_FOR);
		fFigureCalledActivityNameLabel.setText(ISpecialCharachterConstants.FRENCH_QUOTE_LEFT + "   Called Activity:    " + ISpecialCharachterConstants.FRENCH_QUOTE_RIGHT);
		if (((ActivityCallNode) this.getPrimaryView().getElement()).getCalledActivities().size()>0)
		{
			fFigureCalledActivityNameLabel.setText(ISpecialCharachterConstants.FRENCH_QUOTE_LEFT + "   Called Activity: " + ((ActivityCallNode) this.getPrimaryView().getElement()).getCalledActivities().get(0).getName() + "   " + ISpecialCharachterConstants.FRENCH_QUOTE_RIGHT);
		}
		fFigureCalledActivityNameLabel.setAlignment(PositionConstants.CENTER);

		result.add(fFigureCalledActivityNameLabel);
		result.setTitleVisibility(false);
		return result;
	}
}
