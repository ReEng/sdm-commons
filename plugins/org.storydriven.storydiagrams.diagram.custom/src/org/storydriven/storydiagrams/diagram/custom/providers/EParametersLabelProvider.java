package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;

public class EParametersLabelProvider extends LabelProvider implements ITableLabelProvider {
	private final boolean isOutgoing;

	public EParametersLabelProvider(boolean isOutgoing) {
		this.isOutgoing = isOutgoing;
	}

	public EParametersLabelProvider() {
		this(false);
	}

	@Override
	public Image getColumnImage(Object element, int index) {
		if (element instanceof EParameter) {
			EParameter eParameter = (EParameter) element;

			if (eParameter.eContainer() instanceof Activity) {
				Activity activity = (Activity) eParameter.eContainer();
				if (isOutgoing && activity.getInParameters().contains(eParameter)) {
					return DiagramImages.getImage(DiagramImages.EPARAMETER_OUT_REF);
				} else if (!isOutgoing && activity.getOutParameters().contains(eParameter)) {
					return DiagramImages.getImage(DiagramImages.EPARAMETER_IN_REF);
				}
			}

			if (isOutgoing) {
				return DiagramImages.getImage(DiagramImages.EPARAMETER_OUT);
			} else {
				return DiagramImages.getImage(DiagramImages.EPARAMETER_IN);
			}
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int index) {
		if (element instanceof EParameter) {
			EParameter eParameter = (EParameter) element;

			StringBuilder builder = new StringBuilder();

			builder.append(eParameter.getName());

			builder.append(' ');
			builder.append(':');
			builder.append(' ');

			return EcoreTextUtil.append(builder, eParameter.getEType()).toString();
		}
		return getText(element);
	}
}
