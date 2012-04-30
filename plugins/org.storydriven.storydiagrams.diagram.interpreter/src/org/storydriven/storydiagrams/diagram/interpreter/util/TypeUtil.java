package org.storydriven.storydiagrams.diagram.interpreter.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EParameter;

public final class TypeUtil {
	public static enum Type {
		BOOLEAN, BYTE, CHAR, DOUBLE, ENUM, FLOAT, INTEGER, LONG, SHORT, STRING, UNKNOWN;
	}

	private TypeUtil() {
		// hide constructor
	}

	public static String[] getEnumItems(Object element) {
		Collection<String> result = new ArrayList<String>();
		for (EEnumLiteral literal : getLiterals(element)) {
			result.add(literal.getName());
		}
		return result.toArray(new String[result.size()]);
	}

	public static EEnumLiteral getFirstLiteral(Object element) {
		return getLiterals(element).get(0);
	}

	public static int getIndex(Object element, Object value) {
		int index = 0;
		for (EEnumLiteral literal : getLiterals(element)) {
			if (literal.equals(value)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static EEnumLiteral getLiteral(Object element, Integer value) {
		return getLiterals(element).get(value);
	}

	private static List<EEnumLiteral> getLiterals(Object element) {
		EEnum eEnum = (EEnum) ((EParameter) element).getEType();
		return eEnum.getELiterals();
	}

	public static Type getType(Object element) {
		EClassifier eClassifier = ((EParameter) element).getEType();

		if (boolean.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Boolean.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.BOOLEAN;
		}
		if (byte.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Byte.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.BYTE;
		}
		if (short.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Short.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.SHORT;
		}
		if (char.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Character.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.CHAR;
		}
		if (int.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Integer.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.INTEGER;
		}
		if (float.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Float.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.FLOAT;
		}
		if (long.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Long.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.LONG;
		}
		if (double.class.isAssignableFrom(eClassifier.getInstanceClass())
				|| Double.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.DOUBLE;
		}
		if (String.class.isAssignableFrom(eClassifier.getInstanceClass())) {
			return Type.STRING;
		}
		if (eClassifier instanceof EEnum) {
			return Type.ENUM;
		}

		return Type.UNKNOWN;
	}
}
