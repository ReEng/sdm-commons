package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public class StringTableLabelProvider extends LabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int index) {
		return DiagramImages.getImage(DiagramImages.EPACKAGE);
	}

	@Override
	public String getColumnText(Object element, int index) {
		return String.valueOf(element);
	}
}
