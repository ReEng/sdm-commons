package de.upb.swt.core.ui.properties;

import org.eclipse.swt.graphics.Color;

public class PropertiesColors {
	public static final String ERROR = PropertiesColors.class.getCanonicalName() + ".ERROR"; //$NON-NLS-1$
	public static final String WARNING = PropertiesColors.class.getCanonicalName() + ".WARNING"; //$NON-NLS-1$

	public static Color get(String key) {
		return Activator.get().getColor(key);
	}
}
