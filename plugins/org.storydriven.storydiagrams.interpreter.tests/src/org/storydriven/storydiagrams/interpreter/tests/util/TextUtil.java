package org.storydriven.storydiagrams.interpreter.tests.util;

import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TMethod;
import org.storydriven.storydiagrams.interpreter.tests.TNamed;
import org.storydriven.storydiagrams.interpreter.tests.TPackage;
import org.storydriven.storydiagrams.interpreter.tests.TParameter;
import org.storydriven.storydiagrams.interpreter.tests.TType;

public final class TextUtil {
	private TextUtil() {
		// hide constructor
	}

	public static String getText(Object element) {
		StringBuilder builder = new StringBuilder();

		if (element instanceof TPackage) {
			return append(builder, (TPackage) element).toString();
		}

		if (element instanceof TMethod) {
			return append(builder, (TMethod) element).toString();
		}

		if (element instanceof TField) {
			return append(builder, (TField) element).toString();
		}

		if (element instanceof TNamed) {
			return ((TNamed) element).getName();
		}

		return String.valueOf(element);
	}

	private static StringBuilder append(StringBuilder builder, TPackage element) {
		if (element.getContainingPackage() != null) {
			append(builder, element.getContainingPackage());
			builder.append('.');
		}
		builder.append(element.getName());
		return builder;
	}

	private static StringBuilder append(StringBuilder builder, TMethod element) {
		builder.append(element.getName());

		builder.append('(');
		for (TParameter parameter : element.getParameters()) {
			append(builder, parameter.getType());
		}
		builder.append(')');

		builder.append(' ');
		builder.append(':');
		builder.append(' ');

		append(builder, element.getType());

		return builder;
	}

	private static StringBuilder append(StringBuilder builder, TField element) {
		builder.append(element.getName());

		builder.append(' ');
		builder.append(':');
		builder.append(' ');

		append(builder, element.getType());
		return builder;
	}

	private static StringBuilder append(StringBuilder builder, TType element) {
		if (element == null) {
			return builder.append("void"); //$NON-NLS-1$
		}
		return builder.append(element.getName());
	}
}
