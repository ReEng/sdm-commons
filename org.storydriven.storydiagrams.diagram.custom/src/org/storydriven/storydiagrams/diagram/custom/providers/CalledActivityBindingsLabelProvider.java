package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;

public class CalledActivityBindingsLabelProvider extends LabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int index) {
		if (index == 0 && element instanceof EParameter) {
			if (((EObject) element).eContainer() instanceof Activity) {
				Activity activity = (Activity) ((EObject) element).eContainer();
				if (activity.getInParameters().contains(element)) {
					if (activity.getOutParameters().contains(element)) {
						return DiagramImages.getImage(DiagramImages.EPARAMETER_IN_REF);
					} else {
						return DiagramImages.getImage(DiagramImages.EPARAMETER_IN);
					}
				} else {
					if (activity.getOutParameters().contains(element)) {
						return DiagramImages.getImage(DiagramImages.EPARAMETER_OUT_REF);
					} else {
						return DiagramImages.getImage(DiagramImages.EPARAMETER_OUT);
					}
				}
			}
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int index) {
		if (element instanceof EParameter) {
			if (index == 0) {
				// name
				StringBuilder builder = new StringBuilder();

				builder.append(((EParameter) element).getName());
				builder.append(' ');
				builder.append(':');
				builder.append(' ');
				EcoreTextUtil.append(builder, ((EParameter) element).getEType());

				return builder.toString();
			} else if (index == 1) {
				// binding
				// ParameterBinding binding = getBinding((EParameter) element);
				return "null";// String.valueOf(null);
			}
		}
		return getText(element);
	}
}
