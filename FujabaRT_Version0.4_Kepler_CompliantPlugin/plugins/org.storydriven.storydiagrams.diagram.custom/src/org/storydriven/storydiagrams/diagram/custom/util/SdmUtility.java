package org.storydriven.storydiagrams.diagram.custom.util;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.InclusionLink;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class SdmUtility {
	private static final String EMPTY = ""; //$NON-NLS-1$
	public static final String STEREOTYPE_PREFIX = "\u00ab"; //$NON-NLS-1$
	public static final String STEREOTYPE_SUFFIX = "\u00bb"; //$NON-NLS-1$

	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	private SdmUtility() {
		// hide constructor
	}

	public static Color getColor(AbstractLinkVariable link) {
		switch (link.getBindingOperator()) {
		case CHECK_ONLY:
			return DiagramColorRegistry.getInstance().getColor(RGB_CHECK);
		case CREATE:
			return DiagramColorRegistry.getInstance().getColor(RGB_CREATE);
		case DESTROY:
			return DiagramColorRegistry.getInstance().getColor(RGB_DESTROY);
		default:
			return null;
		}
	}

	public static String getOperatorText(AbstractLinkVariable link) {
		switch (link.getBindingOperator()) {
		case CHECK_ONLY:
			return EMPTY;
		case CREATE:
			if (link instanceof InclusionLink) {
				return STEREOTYPE_PREFIX + "add" + STEREOTYPE_SUFFIX;
			}
			return STEREOTYPE_PREFIX + "create" + STEREOTYPE_SUFFIX;
		case DESTROY:
			if (link instanceof InclusionLink) {
				return STEREOTYPE_PREFIX + "remove" + STEREOTYPE_SUFFIX;
			}
			return STEREOTYPE_PREFIX + "destroy" + STEREOTYPE_SUFFIX;
		default:
			return null;
		}
	}

	public static void adaptColor(IFigure figure, BindingOperator spMod) {
		switch (spMod) {
		case CREATE:
			figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_CREATE));
			break;
		case DESTROY:
			figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_DESTROY));
			break;
		case CHECK_ONLY:
			figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_CHECK));
			break;
		default:
			figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_CHECK));
			break;
		}
	}

	public static String adaptObjectVariableModifierText(IGraphicalEditPart editPart) {
		ObjectVariable ov = (ObjectVariable) ((View) editPart.getModel()).getElement();

		switch (ov.getBindingOperator()) {
		case CREATE: {
			return STEREOTYPE_PREFIX + "create" + STEREOTYPE_SUFFIX;
		}
		case DESTROY: {
			return STEREOTYPE_PREFIX + "destroy" + STEREOTYPE_SUFFIX;
		}
		default: {
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

	public static Color getColor(AttributeAssignment element) {
		return DiagramColorRegistry.getInstance().getColor(RGB_CREATE);
	}
}
