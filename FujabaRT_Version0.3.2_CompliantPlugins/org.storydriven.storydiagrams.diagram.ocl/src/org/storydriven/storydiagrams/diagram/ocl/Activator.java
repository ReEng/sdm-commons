package org.storydriven.storydiagrams.diagram.ocl;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	public final static String ID = "org.storydriven.storydiagrams.diagram.ocl"; //$NON-NLS-1$

	private static Activator instance;

	/**
	 * Logs an error message.
	 * 
	 * @param message The error message.
	 */
	public void logError(String message) {
		logError(message, null);
	}

	/**
	 * Logs an error message with its related exception.
	 * 
	 * @param message The error message.
	 * @param exception The actual exception or null can be passed.
	 */
	public void logError(String message, Throwable exception) {
		if (message == null && exception != null) {
			message = exception.getMessage();
		}

		log(IStatus.ERROR, message, exception);
	}

	/**
	 * Logs an information message.
	 * 
	 * @param message The information message.
	 */
	public void logInfo(String message) {
		logInfo(message, null);
	}

	/**
	 * Logs an information message with its related exception.
	 * 
	 * @param message The information message.
	 * @param exception The actual exception or <code>null</code> can be passed.
	 */
	public void logInfo(String message, Throwable exception) {
		if (message == null && exception != null) {
			message = exception.getMessage();
		}

		log(IStatus.INFO, message, exception);
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

		addImages();
	}

	private void addImages() {
		addImage(OCLImages.ASSOCIATION_CLASS);
		addImage(OCLImages.SIGNAL);
		addImage(OCLImages.STATE);
		addImage(OCLImages.VARIABLE);
	}

	private void addImage(String path) {
		ImageDescriptor desc = imageDescriptorFromPlugin(getID(), path);
		if (desc != null) {
			getImageRegistry().put(path, desc);
		} else {
			logWarning("The image under '" + path + "' could not be cached. It probably does not exist.");
		}
	}

	/**
	 * Logs a warning message.
	 * 
	 * @param message The warning message.
	 */
	public void logWarning(String message) {
		logWarning(message, null);
	}

	/**
	 * Logs a warning message with its related exception.
	 * 
	 * @param message The warning message.
	 * @param exception The actual exception or <code>null</code> can be passed.
	 */
	public void logWarning(String message, Throwable exception) {
		if (message == null && exception != null) {
			message = exception.getMessage();
		}

		log(IStatus.WARNING, message, exception);
	}

	private void log(int severity, String message, Throwable throwable) {
		getLog().log(new Status(severity, getID(), message, throwable));
	}

	protected String getID() {
		return ID;
	}

	public static Activator getInstance() {
		return instance;
	}

	public Image getImage(String key) {
		if (getImageRegistry().get(key) == null) {
			return ImageDescriptor.getMissingImageDescriptor().createImage();
		} else {
			return getImageRegistry().get(key);
		}
	}

	public ImageDescriptor getImageDescriptor(String key) {
		if (getImageRegistry().getDescriptor(key) == null) {
			return ImageDescriptor.getMissingImageDescriptor();
		} else {
			return getImageRegistry().getDescriptor(key);
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}
}
