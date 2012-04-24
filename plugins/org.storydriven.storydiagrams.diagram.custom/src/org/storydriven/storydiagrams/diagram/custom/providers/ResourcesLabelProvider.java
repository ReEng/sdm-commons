package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public class ResourcesLabelProvider extends LabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int index) {
		return getImage(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof EPackage) {
			return DiagramImages.getImage(DiagramImages.EPACKAGE);
		}
		if (element instanceof EDataType) {
			if (element instanceof EEnum) {
				return DiagramImages.getImage(DiagramImages.EENUM);
			}
			return DiagramImages.getImage(DiagramImages.EDATA_TYPE);
		}
		if (element instanceof EClass) {
			return DiagramImages.getImage(DiagramImages.ECLASS);
		}
		return super.getImage(element);
	}

	@Override
	public String getColumnText(Object element, int index) {
		return getText(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof EPackage) {
			return ((EPackage) element).getNsURI();
		}
		if (element instanceof EClassifier) {
			return ((EClassifier) element).getName();
		}
		return super.getText(element);
	}
}
