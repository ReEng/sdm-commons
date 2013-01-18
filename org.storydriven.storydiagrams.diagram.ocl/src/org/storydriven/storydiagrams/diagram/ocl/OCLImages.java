package org.storydriven.storydiagrams.diagram.ocl;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public final class OCLImages {
	public static final String SIGNAL = "icons/kind/signal.png"; //$NON-NLS-1$
	public static final String STATE = "icons/kind/state.png"; //$NON-NLS-1$
	public static final String ASSOCIATION_CLASS = "icons/kind/association_class.png"; //$NON-NLS-1$
	public static final String VARIABLE = "icons/kind/variable.png"; //$NON-NLS-1$

	private OCLImages() {
		// hide constructor
	}

	public static Image getImage(String key) {
		return Activator.getInstance().getImage(key);
	}

	public static ImageDescriptor getImageDescriptor(String key) {
		return Activator.getInstance().getImageDescriptor(key);
	}
}
