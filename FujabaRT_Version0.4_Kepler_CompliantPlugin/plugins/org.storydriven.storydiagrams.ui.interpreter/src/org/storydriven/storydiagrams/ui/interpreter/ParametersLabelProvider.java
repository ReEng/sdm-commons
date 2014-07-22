package org.storydriven.storydiagrams.ui.interpreter;

import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ParametersLabelProvider extends LabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int index) {
		return getImage(element);
	}

	@Override
	public String getColumnText(Object element, int index) {
		switch (index) {
		case 0:
			return ((EParameter) element).getName();
		case 1:
			return "val";
		default:
			return getText(element);
		}
	}
}
