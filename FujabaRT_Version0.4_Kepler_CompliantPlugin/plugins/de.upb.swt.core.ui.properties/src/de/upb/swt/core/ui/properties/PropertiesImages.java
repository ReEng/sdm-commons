package de.upb.swt.core.ui.properties;

import org.eclipse.swt.graphics.Image;

public class PropertiesImages {
	public static final String CONTROL_SEARCH = "icons/controls/search.png"; //$NON-NLS-1$

	public static Image getImage(String key) {
		return Activator.get().getImage(key);
	}
}
