package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public class ResourcesLabelProvider extends LabelProvider {
	@Override
	public Image getImage(Object element) {
		if (element instanceof EPackage) {
			EPackage registeredEPackage = EPackage.Registry.INSTANCE.getEPackage(((EPackage) element).getNsURI());
			if (element.equals(registeredEPackage)) {
				return DiagramImages.getImage(DiagramImages.EPACKAGE);
			}
			return DiagramImages.getImage(DiagramImages.EPACKAGE_WORKSPACE);
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
	public String getText(Object element) {
		if (element instanceof EPackage) {
			EPackage registeredEPackage = EPackage.Registry.INSTANCE.getEPackage(((EPackage) element).getNsURI());
			if (element.equals(registeredEPackage)) {
				return ((EPackage) element).getNsURI();
			}

			URI uri = ((EPackage) element).eResource().getURI();

			StringBuilder builder = new StringBuilder();

			builder.append(((EPackage) element).getNsURI());
			builder.append(' ');
			builder.append('(');
			builder.append(uri.toPlatformString(true));
			builder.append(')');

			return builder.toString();
		}
		if (element instanceof EClassifier) {
			return ((EClassifier) element).getName();
		}
		return super.getText(element);
	}
}
