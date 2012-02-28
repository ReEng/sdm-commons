package org.fujaba.commons.console;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.internal.ProcessConsole;

public abstract class AbstractProcessConsoleJob extends Job implements IControllableReportListener {
	public static final String PREFIX_INFO = "INFO";
	public static final String PREFIX_DEBUG = "DEBUG";
	public static final String PREFIX_WARNING = "WARNING";
	public static final String PREFIX_ERROR = "ERROR";

	private final ProcessConsole console;

	private ReportLevel reportLevel;

	private final String description;

	private final ImageDescriptor image;

	/**
	 * Creates a new console process with the given attributes and connects a
	 * new console to it.
	 * 
	 * @param category
	 *            The category of the process.
	 * @param name
	 *            The name of the process.
	 * @param description
	 *            The description of the process.
	 */
	public AbstractProcessConsoleJob(String category, String name, String description) {
		this(category, name, description, ReportLevel.INFO);
	}

	/**
	 * Creates a new console process with the given attributes and connects a
	 * new console to it.
	 * 
	 * @param category
	 *            The category of the process.
	 * @param name
	 *            The name of the process.
	 * @param description
	 *            The description of the process.
	 * @param reportLevel
	 *            The level of report messages.
	 */
	public AbstractProcessConsoleJob(String category, String name, String description, ReportLevel reportLevel) {
		this(category, name, description, FujabaCommonsImages.getDescriptor(FujabaCommonsImages.IMG_CONSOLE_DEFAULT),
				reportLevel);
	}

	/**
	 * Creates a new console process with the given attributes and connects a
	 * new console to it.
	 * 
	 * @param category
	 *            The category of the process.
	 * @param name
	 *            The name of the process.
	 * @param description
	 *            The description of the process.
	 * @param image
	 *            An image descriptor for the process.
	 */
	public AbstractProcessConsoleJob(String category, String name, String description, ImageDescriptor image) {
		this(category, name, description, image, ReportLevel.INFO);
	}

	/**
	 * Creates a new console process with the given attributes and connects a
	 * new console to it.
	 * 
	 * @param category
	 *            The category of the process.
	 * @param name
	 *            The name of the process.
	 * @param description
	 *            The description of the process.
	 * @param image
	 *            An image descriptor for the process.
	 * @param reportLevel
	 *            The level of report messages.
	 */
	public AbstractProcessConsoleJob(String category, String name, String description, ImageDescriptor image,
			ReportLevel reportLevel) {
		super(name);
		setUser(true);

		this.reportLevel = reportLevel;

		this.description = category + "_" + name + "_" + description;
		this.image = image;

		console = (ProcessConsole) ProcessConsoleFactory.createConsole(this);
	}

	@Override
	public final IStatus run(IProgressMonitor monitor) {
		// let the console start
		console.fireNewState(ProcessConsoleState.RUNNING);

		// start the process
		IStatus result = start(monitor);

		// check for null
		if (result == null) {
			result = Status.CANCEL_STATUS;
		}

		// let the console finish
		if (result.getSeverity() == Status.OK) {
			console.fireNewState(ProcessConsoleState.FINISHED);
			monitor.done();
			return result;
		}

		// process has been terminated
		console.fireNewState(ProcessConsoleState.ABORTED);
		monitor.done();
		return result;
	}

	/**
	 * Within this method the job is being processed. When possible, you should
	 * check the state of the process regularly. For this, check
	 * {@link #isPaused()} and {@link #isAborted()} at adequate time.
	 * 
	 * @param monitor
	 *            The monitor to be used for reporting progress and responding
	 *            to cancellation. The monitor is never <code>null</code>.
	 * @return Returns the resulting status of the run.
	 */
	public abstract IStatus start(IProgressMonitor monitor);

	@Override
	public final IStatus error(String message, Object... args) {
		console.error(String.format(message, args));
		return Status.CANCEL_STATUS;
	}

	@Override
	public final void warn(String message, Object... args) {
		console.warn(String.format(message, args));
	}

	@Override
	public final void append(String message, Object... args) {
		console.info(null, String.format(message, args));
	}

	@Override
	public final void task(String message, Object... args) {
		if (ReportLevel.TASK.compareTo(reportLevel) <= 0) {
			console.info("TASK", String.format(message, args) + "...");
		}
	}

	@Override
	public final void info(String message, Object... args) {
		if (ReportLevel.INFO.compareTo(reportLevel) <= 0) {
			console.info(String.format(message, args));
		}
	}

	@Override
	public final void debug(String message, Object... args) {
		if (ReportLevel.DEBUG.compareTo(reportLevel) <= 0) {
			console.debug(String.format(message, args));
		}
	}

	/**
	 * Checks whether this process has already been aborted.
	 * 
	 * @return Returns <code>true</code> when aborted, otherwise
	 *         <code>false</code>.
	 */
	public final boolean isAborted() {
		return console.getProcessState().equals(ProcessConsoleState.ABORTED);
	}

	/**
	 * Checks whether this process is paused at the moment.
	 * 
	 * @return Returns <code>true</code> when paused, otherwise
	 *         <code>false</code>.
	 */
	public final boolean isPaused() {
		return console.getProcessState().equals(ProcessConsoleState.PAUSED);
	}

	@Override
	protected final void canceling() {
		console.fireNewState(ProcessConsoleState.ABORTED);
	}

	public final IProcessConsole getConsole() {
		return console;
	}

	public ImageDescriptor getImage() {
		return image;
	}

	public String getDescription() {
		return description;
	}
}
