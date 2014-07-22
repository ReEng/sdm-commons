package org.storydriven.core.ui.ocl.editor;

import de.upb.swt.core.ui.runtime.AbstractActivator;
import de.upb.swt.core.ui.runtime.IActivator;

public class Activator extends AbstractActivator {

	private static IActivator instance;

	public static IActivator get() {
		return instance;
	}

	@Override
	protected void dispose() {
		Activator.instance = null;
	}

	@Override
	protected void initialize() {
		Activator.instance = this;

		addImage(OCLImages.ASSOCIATION_CLASS);
		addImage(OCLImages.SIGNAL);
		addImage(OCLImages.STATE);
		addImage(OCLImages.VARIABLE);
	}
}
