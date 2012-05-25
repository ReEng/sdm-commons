package org.storydriven.storydiagrams.diagram.custom.util;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

public class EcoreTextUtil {
	public static String getQualifiedText(EClassifier eClassifier) {
		StringBuilder builder = new StringBuilder();

		append(builder, eClassifier);

		String instanceTypeName = eClassifier.getInstanceClassName();
		if (instanceTypeName != null) {
			builder.append(' ');
			builder.append('[');
			int index = instanceTypeName.lastIndexOf('$');
			if (index != -1) {
				builder.append(instanceTypeName);
			} else {
				index = instanceTypeName.lastIndexOf('.');
				if (index != -1) {
					builder.append(instanceTypeName.substring(0, index));
				} else {
					builder.append(instanceTypeName);
				}
			}
			builder.append(']');
		}

		return builder.toString();
	}

	public static String getText(EAttribute eAttribute) {
		return append(new StringBuilder(), eAttribute).toString();
	}

	private static StringBuilder append(StringBuilder builder, EAttribute attribute) {
		builder.append(attribute.getName());
		EClassifier eType = attribute.getEType();
		if (eType != null) {
			builder.append(' ');
			builder.append(':');
			builder.append(' ');
			append(builder, eType);
		}
		return builder;
	}

	public static String getText(EClassifier eClassifier) {
		return append(new StringBuilder(), eClassifier).toString();
	}

	public static String getText(EReference eReference) {
		return append(new StringBuilder(), eReference).toString();
	}

	private static StringBuilder append(StringBuilder builder, EReference eReference) {
		builder.append(eReference.getName());
		EClassifier eType = eReference.getEType();
		if (eType != null) {
			builder.append(' ');
			builder.append(':');
			builder.append(' ');
			append(builder, eType);
		}
		return builder;
	}

	public static String getText(EOperation eOperation) {
		return append(new StringBuilder(), eOperation).toString();
	}

	public static StringBuilder append(StringBuilder builder, EOperation eOperation) {
		EClass eContainingClass = eOperation.getEContainingClass();
		if (eContainingClass != null) {
			append(builder, eContainingClass);
			builder.append(':');
			builder.append(':');
		}

		builder.append(eOperation.getName());

		EClassifier eType = eOperation.getEType();
		if (eType != null) {
			builder.append(':');
			builder.append(' ');
			builder.append(eType.getName());
			builder.append(':');
			builder.append(' ');
			append(builder, eType);
		}
		return builder;
	}

	public static String getText(EParameter element) {
		if (element == null) {
			return String.valueOf(element);
		}

		StringBuilder builder = new StringBuilder();

		builder.append(element.getName());

		builder.append(' ');
		builder.append(':');
		builder.append(' ');

		append(builder, element.getEType());

		return builder.toString();
	}

	public static StringBuilder append(StringBuilder builder, EClassifier eClassifier) {
		if (eClassifier != null) {
			// append name
			builder.append(eClassifier.getName());

			// append type parameters
			List<ETypeParameter> typeParameters = eClassifier.getETypeParameters();
			if (!typeParameters.isEmpty()) {
				builder.append('<');
				for (int index = 0; index < typeParameters.size(); index++) {
					builder.append(typeParameters.get(index).getName());
					if (index < typeParameters.size() - 1) {
						builder.append(',');
						builder.append(' ');
					}
				}
				builder.append('>');
			}
		} else {
			builder.append(eClassifier);
		}

		return builder;
	}

	public static String getText(EPackage ePackage) {
		return append(new StringBuilder(), ePackage).toString();
	}

	private static StringBuilder append(StringBuilder builder, EPackage ePackage) {
		EPackage superPackage = ePackage.getESuperPackage();
		if (superPackage != null) {
			append(builder, superPackage);
			builder.append('.');
		}
		builder.append(ePackage.getName());

		return builder;
	}
}
