package de.upb.swt.core.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class CoreImages {
	public static final String CONTROL_START = "icons/control/start.png"; //$NON-NLS-1$
	public static final String CONTROL_SUSPEND = "icons/control/suspend.png"; //$NON-NLS-1$
	public static final String CONTROL_RESUME = "icons/control/resume.png"; //$NON-NLS-1$
	public static final String CONTROL_STOP = "icons/control/stop.png"; //$NON-NLS-1$
	public static final String CONTROL_REFRESH = "icons/control/refresh.png"; //$NON-NLS-1$

	public static final String STATE_INFORMATION = "icons/state/information.png"; //$NON-NLS-1$
	public static final String STATE_QUESTION = "icons/state/question.png"; //$NON-NLS-1$
	public static final String STATE_WARNING = "icons/state/warning.png"; //$NON-NLS-1$
	public static final String STATE_ERROR = "icons/state/error.png"; //$NON-NLS-1$

	public static final String FIND = "icons/find.png"; //$NON-NLS-1$

	public static final String ADD = "icons/add.png"; //$NON-NLS-1$
	public static final String REMOVE = "icons/remove.png"; //$NON-NLS-1$

	public static final String UP = "icons/up.png"; //$NON-NLS-1$
	public static final String DOWN = "icons/down.png"; //$NON-NLS-1$

	public static final String COLLAPSE = "icons/collapse.png"; //$NON-NLS-1$
	public static final String COLLAPSEALL = "icons/collapseall.png"; //$NON-NLS-1$

	public static final String EXPAND = "icons/expand.png"; //$NON-NLS-1$
	public static final String EXPANDALL = "icons/expandall.png"; //$NON-NLS-1$

	public static Image get(String key) {
		return Activator.get().getImage(key);
	}

	public static ImageDescriptor getDescriptor(String key) {
		return Activator.get().getImageDescriptor(key);
	}
}
