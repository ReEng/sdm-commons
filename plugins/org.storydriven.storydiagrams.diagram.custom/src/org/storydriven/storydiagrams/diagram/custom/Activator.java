package org.storydriven.storydiagrams.diagram.custom;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	public final static String ID = "org.storydriven.storydiagrams.diagram.custom"; //$NON-NLS-1$

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
		// controls
		addImage(DiagramImages.CONTROL_ADD);
		addImage(DiagramImages.CONTROL_REMOVE);
		addImage(DiagramImages.CONTROL_CONFIGURE);
		addImage(DiagramImages.CONTROL_SHORTCUT);
		addImage(DiagramImages.CONTROL_UP);
		addImage(DiagramImages.CONTROL_DOWN);
		addImage(DiagramImages.CONTROL_SEARCH);

		// ecore package
		addImage(DiagramImages.EANNOTATION);
		addImage(DiagramImages.EATTRIBUTE);
		addImage(DiagramImages.ECLASS);
		addImage(DiagramImages.EDATA_TYPE);
		addImage(DiagramImages.EENUM);
		addImage(DiagramImages.EENUM_LITERAL);
		addImage(DiagramImages.EOPERATION);
		addImage(DiagramImages.EPACKAGE);
		addImage(DiagramImages.EPACKAGE_LINKED);
		addImage(DiagramImages.EPACKAGE_PLUGIN);
		addImage(DiagramImages.EPACKAGE_WORKSPACE);
		addImage(DiagramImages.EPARAMETER_IN);
		addImage(DiagramImages.EPARAMETER_IN_REF);
		addImage(DiagramImages.EPARAMETER_OUT);
		addImage(DiagramImages.EPARAMETER_OUT_REF);
		addImage(DiagramImages.EREFERENCE);
		addImage(DiagramImages.ESTRING_TO_STRING_MAP_ENTRY);

		// activities package
		addImage(DiagramImages.ACTIVITY);
		addImage(DiagramImages.ACTIVITY_CALL_NODE);
		addImage(DiagramImages.ACTIVITY_EDGE);
		addImage(DiagramImages.EXCEPTION_VARIABLE);
		addImage(DiagramImages.JUNCTION_NODE);
		addImage(DiagramImages.JUNCTION_NODE__DECISION);
		addImage(DiagramImages.JUNCTION_NODE__MERGE);
		addImage(DiagramImages.MATCHING_STORY_NODE);
		addImage(DiagramImages.MATCHING_STORY_NODE__LOOP);
		addImage(DiagramImages.MODIFYING_STORY_NODE);
		addImage(DiagramImages.MODIFYING_STORY_NODE__LOOP);
		addImage(DiagramImages.OPERATION_EXTENSION);
		addImage(DiagramImages.START_NODE);
		addImage(DiagramImages.STATEMENT_NODE);
		addImage(DiagramImages.STOP_NODE);
		addImage(DiagramImages.STOP_NODE__FLOW);
		addImage(DiagramImages.STRUCTURED_NODE);

		// patterns package
		addImage(DiagramImages.ATTRIBUTE_ASSIGNMENT);
		addImage(DiagramImages.CONSTRAINT);
		addImage(DiagramImages.CONTAINER_VARIABLE);
		addImage(DiagramImages.CONTAINMENT_RELATION);
		addImage(DiagramImages.LINK_CONSTRAINT);
		addImage(DiagramImages.LINK_VARIABLE);
		addImage(DiagramImages.MATCHING_PATTERN);
		addImage(DiagramImages.OBJECT_SET_VARIABLE);
		addImage(DiagramImages.OBJECT_VARIABLE);
		addImage(DiagramImages.PATH);
		addImage(DiagramImages.PRIMITIVE_VARIABLE);

		// banners
		addImage(DiagramImages.BANNER_SELECT_ECLASS);
		addImage(DiagramImages.BANNER_SELECT_EDATATYPE);
		addImage(DiagramImages.BANNER_ADD_EPACKAGE_URI);
		addImage(DiagramImages.BANNER_ADD_EPACKAGE_WORKSPACE);
		addImage(DiagramImages.BANNER_CONFIGURE_PARAMETER_IN);
		addImage(DiagramImages.BANNER_CONFIGURE_PARAMETER_OUT);
		addImage(DiagramImages.BANNER_LOAD_RESOURCE);
		addImage(DiagramImages.BANNER_SELECT_ECLASS);
		addImage(DiagramImages.BANNER_SELECT_EDATATYPE);
		addImage(DiagramImages.BANNER_SELECT_PRECONDITION);
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
