package de.upb.swt.core.ui;

import de.upb.swt.core.ui.runtime.AbstractActivator;
import de.upb.swt.core.ui.runtime.IActivator;

public class Activator extends AbstractActivator {
	private static IActivator instance;

	public static IActivator get() {
		return instance;
	}

	@Override
	protected void dispose() {
		instance = null;
	}

	@Override
	protected void initialize() {
		instance = this;

		// add images
		addImage(CoreImages.CONTROL_START);
		addImage(CoreImages.CONTROL_SUSPEND);
		addImage(CoreImages.CONTROL_RESUME);
		addImage(CoreImages.CONTROL_STOP);
		addImage(CoreImages.CONTROL_REFRESH);

		addImage(CoreImages.STATE_INFORMATION);
		addImage(CoreImages.STATE_QUESTION);
		addImage(CoreImages.STATE_WARNING);
		addImage(CoreImages.STATE_ERROR);

		addImage(CoreImages.FIND);

		addImage(CoreImages.ADD);
		addImage(CoreImages.REMOVE);

		addImage(CoreImages.UP);
		addImage(CoreImages.DOWN);

		addImage(CoreImages.COLLAPSE);
		addImage(CoreImages.COLLAPSEALL);

		addImage(CoreImages.EXPAND);
		addImage(CoreImages.EXPANDALL);
	}
}
