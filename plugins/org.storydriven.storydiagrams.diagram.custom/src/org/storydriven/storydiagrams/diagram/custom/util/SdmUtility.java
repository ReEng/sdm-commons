package org.storydriven.storydiagrams.diagram.custom.util;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.fujaba.commons.figures.ISpecialCharachterConstants;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.SdmDiagramConstants;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.ObjectVariable;


public class SdmUtility {

	public static void adaptColor(IFigure figure, BindingOperator spMod)
	{

		switch (spMod)
		{
			case CREATE:
			{
				figure.setForegroundColor(SdmDiagramConstants.OPERATOR_CREATE_COLOR);
				break;
			}
			case DESTROY:
			{
				figure.setForegroundColor(SdmDiagramConstants.OPERATOR_DESTROY_COLOR);
				break;
			}
			case CHECK_ONLY:
			{
				figure.setForegroundColor(SdmDiagramConstants.OPERATOR_NONE_COLOR);
				break;
			}
			default:
			{
				figure.setForegroundColor(SdmDiagramConstants.OPERATOR_NONE_COLOR);
				break;
			}
		}
	}

	public static String adaptObjectVariableModifierText(IGraphicalEditPart editPart)
	{
		ObjectVariable ov = (ObjectVariable) ((View) editPart.getModel()).getElement();

		switch (ov.getBindingOperator())
		{
			case CREATE:
			{
				return ISpecialCharachterConstants.FRENCH_QUOTE_LEFT + "create" + ISpecialCharachterConstants.FRENCH_QUOTE_RIGHT;
			}
			case DESTROY:
			{
				return ISpecialCharachterConstants.FRENCH_QUOTE_LEFT + "destroy" + ISpecialCharachterConstants.FRENCH_QUOTE_RIGHT;
			}
			default:
			{
				return "";
			}
		}

	}

	public static EdgeGuard String2Guard(String text) {
		return EdgeGuard.valueOf(text.replaceAll(" ", "_").toUpperCase());
	}

	public static String Guard2String(EdgeGuard guard) {
		return guard.toString().toLowerCase().replaceAll("_", " ");
	}
	
}
