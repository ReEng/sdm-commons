package de.upb.swt.core.ui.properties;

import org.eclipse.swt.graphics.RGB;

import de.upb.swt.core.ui.runtime.AbstractActivator;
import de.upb.swt.core.ui.runtime.IActivator;

public class Activator extends AbstractActivator {
	private static IActivator instance;

	public static IActivator get() {
		return instance;
	}

	@Override
	protected void initialize() {
		instance = this;

		addColor(PropertiesColors.ERROR, new RGB(192, 144, 144));
		addColor(PropertiesColors.WARNING, new RGB(241, 240, 186));
	}

	@Override
	protected void dispose() {
		instance = null;
	}
}
