package org.storydriven.storydiagrams.interpreter.tests.util;

import org.storydriven.storydiagrams.interpreter.tests.TClass;
import org.storydriven.storydiagrams.interpreter.tests.TEnum;
import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TInterface;
import org.storydriven.storydiagrams.interpreter.tests.TMethod;
import org.storydriven.storydiagrams.interpreter.tests.TModel;
import org.storydriven.storydiagrams.interpreter.tests.TModifyable;
import org.storydriven.storydiagrams.interpreter.tests.TPackage;
import org.storydriven.storydiagrams.interpreter.tests.TParameter;
import org.storydriven.storydiagrams.interpreter.tests.TType;
import org.storydriven.storydiagrams.interpreter.tests.TTyped;
import org.storydriven.storydiagrams.interpreter.tests.provider.TestsEditPlugin;

public final class ImageUtil {
	private ImageUtil() {
		// hide constructor
	}

	public static Object getImage(Object element) {
		String key = "unknown.png"; //$NON-NLS-1$

		if (element instanceof TModel) {
			key = "model.png"; //$NON-NLS-1$
		} else if (element instanceof TPackage) {
			if (((TPackage) element).getTypes().isEmpty()) {
				key = "package_empty.png"; //$NON-NLS-1$
			} else {
				key = "package.png"; //$NON-NLS-1$
			}
		} else if (element instanceof TType) {
			String prefix = null;
			if (element instanceof TClass) {
				prefix = "class"; //$NON-NLS-1$
			} else if (element instanceof TInterface) {
				prefix = "interface"; //$NON-NLS-1$
			} else if (element instanceof TEnum) {
				prefix = "enum"; //$NON-NLS-1$
			}
			key = append(prefix, (TType) element);
		} else if (element instanceof TTyped) {
			if (element instanceof TField) {
				key = append("field", (TField) element); //$NON-NLS-1$
			} else if (element instanceof TMethod) {
				key = append("method", (TMethod) element); //$NON-NLS-1$
			} else if (element instanceof TParameter) {
				key = "parameter.png"; //$NON-NLS-1$
			}
		}

		return TestsEditPlugin.INSTANCE.getImage(key);
	}

	private static String append(String prefix, TModifyable modifier) {
		if (modifier != null) {
			switch (modifier.getVisibility()) {
			case PUBLIC:
				return prefix + "_public.png"; //$NON-NLS-1$
			case DEFAULT:
				return prefix + "_default.png"; //$NON-NLS-1$
			case PROTECTED:
				return prefix + "_protected.png"; //$NON-NLS-1$
			case PRIVATE:
				return prefix + "_private.png"; //$NON-NLS-1$
			default:
				return prefix + "_public.png"; //$NON-NLS-1$
			}
		} else {
			return prefix + "_public.png"; //$NON-NLS-1$
		}
	}
}
