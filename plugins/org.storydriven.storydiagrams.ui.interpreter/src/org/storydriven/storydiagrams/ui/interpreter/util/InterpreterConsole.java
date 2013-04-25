package org.storydriven.storydiagrams.ui.interpreter.util;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class InterpreterConsole extends MessageConsole {

	public enum StreamType {
		DEBUG, FAILURE, INFO, SUCCESS;
	}

	private MessageConsoleStream debugStream;
	private MessageConsoleStream failureStream;
	private MessageConsoleStream infoStream;
	private MessageConsoleStream successStream;

	public InterpreterConsole() {
		super("Interpreter Console", null, false);

		infoStream = newMessageStream();
		infoStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 0, 0, 0));
		successStream = newMessageStream();
		successStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 30, 200, 30));
		failureStream = newMessageStream();
		failureStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 200, 30, 30));
		debugStream = newMessageStream();
		debugStream.setColor(new Color(PlatformUI.getWorkbench().getDisplay(), 160, 160, 160));
	}

	public void append(StreamType type, String message) {
		String printed = message + "\n";
		switch (type) {
		case INFO:
			infoStream.print(printed);
			break;
		case SUCCESS:
			successStream.print(printed);
			break;
		case FAILURE:
			failureStream.print(printed);
			break;
		case DEBUG:
			debugStream.print(printed);
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

	public void wrap() {
		debugStream.print("\n"); //$NON-NLS-1$
	}
}
