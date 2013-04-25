package org.storydriven.storydiagrams.ui.interpreter;

import de.upb.swt.core.ui.runtime.AbstractActivator;
import de.upb.swt.core.ui.runtime.IActivator;
import de.upb.swt.core.util.DebugOutputStream;

public class Activator extends AbstractActivator {
	public static final String IMAGE_RESOURCE_WORKSPACE = "icons/resource_workspace.png"; //$NON-NLS-1$
	public static final String IMAGE_EPACKAGE = "icons/epackage.png"; //$NON-NLS-1$

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

		DebugOutputStream.activate();

		// TODO: add images?
		addImage(IMAGE_RESOURCE_WORKSPACE);
		addImage(IMAGE_EPACKAGE);
	}
}
