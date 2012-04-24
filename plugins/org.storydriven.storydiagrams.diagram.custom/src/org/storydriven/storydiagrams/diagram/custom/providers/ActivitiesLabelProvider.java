package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

public class ActivitiesLabelProvider extends LabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int index) {
		if (index == 0) {
			return DiagramImages.getImage(DiagramImages.ACTIVITY);
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int index) {
		if (element instanceof Activity) {
			return TextUtil.getText((Activity) element);
		}
		return getText(element);
	}
}
