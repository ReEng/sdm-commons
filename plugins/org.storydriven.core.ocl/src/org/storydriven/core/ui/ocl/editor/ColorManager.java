package org.storydriven.core.ui.ocl.editor;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorManager {
	public static final RGB DEFAULT = new RGB(0, 0, 0);
	public static final RGB COMMENT = new RGB(100, 100, 100);

	public static final RGB KEYWORD = new RGB(127, 0, 85);
	public static final RGB KNOWN_VARIABLE = new RGB(0, 0, 192);
	public static final RGB LITERAL = new RGB(42, 0, 255);

	public static final RGB COLLECTION_TUPLE = new RGB(64, 0, 64);

	public static final RGB OUTPUT_ERROR = new RGB(192, 0, 0);
	public static final RGB OUTPUT_RESULTS = new RGB(0, 0, 192);

	private final Map<RGB, Color> colors;

	public ColorManager() {
		colors = new LinkedHashMap<RGB, Color>();
	}

	public void dispose() {
		for (Color color : colors.values()) {
			color.dispose();
		}

		colors.clear();
	}

	public Color getColor(RGB rgb) {
		Color result = colors.get(rgb);

		if (result == null) {
			result = new Color(Display.getCurrent(), rgb);
			colors.put(rgb, result);
		}

		return result;
	}
}
