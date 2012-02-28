package org.fujaba.commons.console.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.fujaba.commons.console.AbstractProcessConsoleJob;
import org.fujaba.commons.console.IProcessConsole;
import org.fujaba.commons.console.IProcessConsoleListener;
import org.fujaba.commons.console.ProcessConsoleFactory;
import org.fujaba.commons.console.ProcessConsoleState;

public class ProcessConsole extends MessageConsole implements IProcessConsole, IProcessConsoleListener {
	private static final String CONSOLE_TYPE = "FujabaProcessConsole"; //$NON-NLS-1$
	private static final String TXT_ZERO = "0"; //$NON-NLS-1$
	private static final String TXT_EMPTY = " "; //$NON-NLS-1$

	private static SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("HH:mm:ss,SSS");

	private static String getName(ProcessConsole console) {
		// create it
		StringBuilder name = new StringBuilder();

		// append state
		switch (console.getProcessState()) {
		case IDLING:
			name.append("<idling>");
			break;
		case PAUSED:
			name.append("<paused>");
			break;
		case FINISHED:
			name.append("<finished>");
			break;
		case ABORTED:
			name.append("<aborted>");
			break;
		default:
			break;
		}

		name.append(console.getDescription());

		if (console.started > 0) {
			// get date
			Date started = new Date(console.started);

			name.append(TXT_EMPTY);
			name.append("("); //$NON-NLS-1$
			name.append(DateFormat.getDateTimeInstance().format(started));
			name.append(")"); //$NON-NLS-1$
		}

		return name.toString();
	}

	private static String getSeconds(long millis) {
		long ms = millis % 1000;
		long s = (millis / 1000) % 60;
		long m = (millis / (1000 * 60)) % 60;
		long h = millis / (1000 * 3600);

		StringBuilder durance = new StringBuilder();

		if (h < 10) {
			durance.append(TXT_ZERO);
		}
		durance.append(h);
		durance.append(":");
		if (m < 10) {
			durance.append(TXT_ZERO);
		}
		durance.append(m);
		durance.append(":");
		if (s < 10) {
			durance.append(TXT_ZERO);
		}
		durance.append(s);
		durance.append(",");
		if (ms < 100) {
			durance.append(TXT_ZERO);
		}
		if (ms < 10) {
			durance.append(TXT_ZERO);
		}
		durance.append(ms);

		return durance.toString();
	}

	private static void print(MessageConsoleStream stream, String prefix, String message) {
		long time = System.currentTimeMillis();

		StringBuilder text = new StringBuilder();

		text.append(DATE_FORMATTER.format(new Date(time)));

		if (prefix != null) {
			text.append(TXT_EMPTY);
			text.append("["); //$NON-NLS-1$
			text.append(prefix);
			text.append("]"); //$NON-NLS-1$
		}

		text.append(TXT_EMPTY);
		text.append(message);

		stream.println(text.toString());
	}

	private final AbstractProcessConsoleJob job;

	private final Collection<IProcessConsoleListener> listeners;

	private final MessageConsoleStream infoStream;
	private final MessageConsoleStream debugStream;
	private final MessageConsoleStream warningStream;
	private final MessageConsoleStream errorStream;

	private ProcessConsoleState state;

	private int warned;

	private long started;
	private long paused;
	private long pauseDurance;

	public ProcessConsole(AbstractProcessConsoleJob job) {
		super(job.getDescription(), CONSOLE_TYPE, job.getImage(), true);

		this.job = job;

		// initialize streams
		infoStream = newMessageStream();
		infoStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 0, 0, 0));
		debugStream = newMessageStream();
		debugStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 120, 120, 120));
		warningStream = newMessageStream();
		warningStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 225, 150, 80));
		errorStream = newMessageStream();
		errorStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 200, 30, 30));

		listeners = new ArrayList<IProcessConsoleListener>();
		addListener(this);

		// set initial state
		fireNewState(ProcessConsoleState.IDLING);
	}

	@Override
	public boolean addListener(IProcessConsoleListener listener) {
		return listeners.add(listener);
	}

	public void fireNewState(ProcessConsoleState state) {
		for (IProcessConsoleListener listener : listeners) {
			listener.newState(state);
		}
	}

	@Override
	protected void dispose() {
		listeners.clear();

		super.dispose();
	}

	public String getDescription() {
		return job.getDescription();
	}

	public ProcessConsoleState getProcessState() {
		return state;
	}

	public boolean canRemove() {
		// only running or paused
		switch (getProcessState()) {
		case PAUSED:
		case RUNNING:
			return false;

		default:
			return true;
		}
	}

	@Override
	public void newState(ProcessConsoleState state) {
		// get current time
		long current = System.currentTimeMillis();

		// check state
		switch (state) {
		case IDLING:
			print(infoStream, null, "The process has been created.");
			break;

		case PAUSED:
			paused = current;
			print(infoStream, null, "The process has been paused.");
			break;

		case RUNNING:
			if (paused > 0) {
				pauseDurance += (current - paused);
				paused = 0;
				print(infoStream, null, "The process has been resumed.");
			} else if (started == 0) {
				ProcessConsoleFactory.showConsole(this);
				started = current;
				print(infoStream, null, "The process has been started.");
			}

			break;

		case FINISHED:
			if (warned > 0) {
				if (pauseDurance > 0) {
					String message = "The process has been finished after %1$s (plus %2$s paused) with warnings (%3$s)!";
					String running = getSeconds((current - started) - pauseDurance);
					String paused = getSeconds(pauseDurance);

					print(warningStream, null, String.format(message, running, paused, warned));
				} else {
					String message = "The process has been finished after %1$s with warnings (%2$s)!";
					String running = getSeconds(current - started);

					print(warningStream, null, String.format(message, running, warned));
				}
			} else {
				if (pauseDurance > 0) {
					String message = "The process has been finished after %1$s (plus %2$s paused).";
					String running = getSeconds((current - started) - pauseDurance);
					String paused = getSeconds(pauseDurance);

					print(infoStream, null, String.format(message, running, paused));
				} else {
					String message = "The process has been finished after %1$s.";
					String running = getSeconds(current - started);

					print(infoStream, null, String.format(message, running));
				}
			}

			break;

		case ABORTED:
			if (warned > 0) {
				if (pauseDurance > 0) {
					String message = "The process has been aborted after %1$s (plus %2$s paused) with warnings (%3$s)!";
					String running = getSeconds((current - started) - pauseDurance);
					String paused = getSeconds(pauseDurance);

					print(warningStream, null, String.format(message, running, paused, warned));
				} else {
					String message = "The process has been aborted after %1$s with warnings (%2$s)!";
					String running = getSeconds(current - started);

					print(warningStream, null, String.format(message, running, warned));
				}
			} else {
				if (pauseDurance > 0) {
					String message = "The process has been aborted after %1$s (plus %2$s paused)!";
					String running = getSeconds((current - started) - pauseDurance);
					String paused = getSeconds(pauseDurance);

					print(warningStream, null, String.format(message, running, paused));
				} else {
					String message = "The process has been aborted after %1$s!";
					String running = getSeconds(current - started);

					print(warningStream, null, String.format(message, running));
				}
			}

			break;
		}

		// set the new state
		this.state = state;
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				setName(getName(ProcessConsole.this));
			}
		});
	}

	@Override
	public boolean removeListener(IProcessConsoleListener listener) {
		return listeners.remove(listener);
	}

	public void debug(String message) {
		debug(AbstractProcessConsoleJob.PREFIX_DEBUG, message);
	}

	public void debug(String prefix, String message) {
		print(debugStream, prefix, message);
	}

	public void info(String message) {
		info(AbstractProcessConsoleJob.PREFIX_INFO, message);
	}

	public void info(String prefix, String message) {
		print(infoStream, prefix, message);
	}

	public void warn(String message) {
		warn(message, null);
	}

	public void warn(String message, Throwable throwable) {
		print(warningStream, AbstractProcessConsoleJob.PREFIX_WARNING, message);
		if (throwable != null) {
			String detail = throwable.getMessage();
			print(warningStream, null, detail);
		}
		warned++;
	}

	public void error(String message) {
		error(message, null);
	}

	public void error(String message, Throwable throwable) {
		print(errorStream, AbstractProcessConsoleJob.PREFIX_ERROR, message);
		if (throwable != null) {
			String detail = throwable.getMessage();
			print(errorStream, null, detail);
		}
	}
}
