package de.upb.swt.core.runtime;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * <p>
 * The base implementation of an {@link ICoreActivator core activator} class. This class should be used as parent class
 * for an bundle activator class which is only dependent on the <code>org.eclipse.core</code> feature.
 * </p>
 * 
 * @see ICoreActivator
 */
public abstract class AbstractCoreActivator implements ICoreActivator {
	private BundleContext bundleContext;

	@Override
	public void error(String text) {
		error(text, null);
	}

	@Override
	public void error(Throwable cause) {
		error(null, cause);
	}

	@Override
	public void error(String text, Throwable cause) {
		log(IStatus.ERROR, text, cause);
	}

	@Override
	public void info(String text) {
		log(IStatus.INFO, text, null);
	}

	@Override
	public void warn(String text) {
		warn(text, null);
	}

	@Override
	public void warn(Throwable cause) {
		warn(null, cause);
	}

	@Override
	public void warn(String text, Throwable cause) {
		log(IStatus.WARNING, text, cause);
	}

	@Override
	public void log(int severity, String text, Throwable cause) {
		log(new Status(severity, getID(), text, cause));
	}

	@Override
	public void log(IStatus status) {
		if (isStarted()) {
			Platform.getLog(getBundle()).log(status);
		}

		// TODO: log message in another way
	}

	@Override
	public String getID() {
		if (isStarted()) {
			return getBundle().getSymbolicName();
		}
		return null;
	}

	/**
	 * Delivers the bundle. Will be only available when the bundle has been {@link #start(BundleContext) started}.
	 * 
	 * @return Returns bundle when already available or <code>null</code>.
	 */
	protected Bundle getBundle() {
		if (isStarted()) {
			return bundleContext.getBundle();
		}
		return null;
	}

	private boolean isStarted() {
		return bundleContext != null;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		bundleContext = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		bundleContext = null;
	}
}
