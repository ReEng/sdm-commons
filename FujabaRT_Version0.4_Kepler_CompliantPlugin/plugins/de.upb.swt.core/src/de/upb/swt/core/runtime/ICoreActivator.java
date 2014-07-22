package de.upb.swt.core.runtime;

import org.eclipse.core.runtime.IStatus;
import org.osgi.framework.BundleActivator;

/**
 * <p>
 * Eases getting the plug-in identifier, name and other {@link org.osgi.framework.BundleActivator bundle} specific
 * things as well as an easy access to the Eclipse plug-in specific logging feature.
 * </p>
 * 
 * @author Aljoscha Hark <aljoschability@gmail.com>
 */
public interface ICoreActivator extends BundleActivator {
	/**
	 * Delivers the symbolic name/ID of this plug-in.
	 * 
	 * @return Returns the symbolic name of the plug-in.
	 */
	String getID();

	/**
	 * Wraps the given parameters into an {@link org.eclipse.core.runtime.IStatus status} message and logs it for this
	 * plug-in.
	 * 
	 * @param severity The severity of the log entry - see {@link org.eclipse.core.runtime.IStatus}.
	 * @param text The text to log.
	 * @param cause The exception to log (optional).
	 */
	void log(int severity, String text, Throwable cause);

	/**
	 * Logs the status message to the log.
	 * 
	 * @param status The status message to log.
	 */
	void log(IStatus status);

	/**
	 * Logs the given text as information entry in the {@link org.eclipse.core.runtime.ILog status log} for this
	 * plug-in.
	 * 
	 * @param text The text to log.
	 */
	void info(String text);

	/**
	 * Logs the given text as warning entry in the {@link org.eclipse.core.runtime.ILog status log} for this plug-in.
	 * 
	 * @param text The text to log.
	 */
	void warn(String text);

	/**
	 * Logs the given exception as warning in the {@link org.eclipse.core.runtime.ILog status log} for this plug-in
	 * trying to resolve a usable message.
	 * 
	 * @param cause The exception to be logged.
	 */
	void warn(Throwable cause);

	/**
	 * Logs the given text and exception as warning in the {@link org.eclipse.core.runtime.ILog status log} for this
	 * plug-in.
	 * 
	 * @param text The text to logged.
	 * @param cause The exception to be logged.
	 */
	void warn(String text, Throwable cause);

	/**
	 * Logs the given text as error in the {@link org.eclipse.core.runtime.ILog status log} for this plug-in.
	 * 
	 * @param text The text to log.
	 */
	void error(String text);

	/**
	 * Logs the exception as error in the {@link org.eclipse.core.runtime.ILog status log} for this plug-in trying to
	 * resolve a usable message.
	 * 
	 * @param cause The exception to be logged.
	 */
	void error(Throwable cause);

	/**
	 * Logs the given text and the exception as error in the {@link org.eclipse.core.runtime.ILog status log} for this
	 * plug-in.
	 * 
	 * @param text The text to be logged.
	 * @param cause The exception be to logged.
	 */
	void error(String text, Throwable cause);
}
