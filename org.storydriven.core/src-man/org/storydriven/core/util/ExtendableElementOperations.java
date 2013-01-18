package org.storydriven.core.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;

/**
 * A static utility class that provides operations related to '<em><b>Extendable Element</b></em>' model objects.
 */
public class ExtendableElementOperations {
	public static Extension getExtension(ExtendableElement extendableElement, EClass type) {
		EList<Extension> extensions = extendableElement.getExtensions();
		for (Extension extension : extensions) {
			if (type.isInstance(extension)) {
				return extension;
			}
		}
		return null;
	}

	public static Extension provideExtension(ExtendableElement extendableElement, EClass type) {
		Extension extension = extendableElement.getExtension(type);
		if (extension == null) {
			extension = (Extension) type.getEPackage().getEFactoryInstance().create(type);
			extendableElement.getExtensions().add(extension);
		}
		return extension;
	}

	public static EAnnotation getAnnotation(ExtendableElement extendableElement, String source) {
		EList<EAnnotation> annotations = extendableElement.getAnnotations();
		if (source == null) {
			for (EAnnotation annotation : annotations) {
				if (annotation.getSource() == null) {
					return annotation;
				}
			}
		} else {
			for (EAnnotation annotation : annotations) {
				if (source.equals(annotation.getSource())) {
					return annotation;
				}
			}
		}
		return null;
	}

	public static EAnnotation provideAnnotation(ExtendableElement extendableElement, String source) {
		EAnnotation annotation = extendableElement.getAnnotation(source);
		if (annotation == null) {
			annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource(source);
			extendableElement.getAnnotations().add(annotation);
		}
		return annotation;
	}
}
