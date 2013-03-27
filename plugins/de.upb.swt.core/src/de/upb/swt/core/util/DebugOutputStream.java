package de.upb.swt.core.util;

import java.io.PrintStream;
import java.text.MessageFormat;

public class DebugOutputStream extends PrintStream {
	private static final DebugOutputStream INSTANCE = new DebugOutputStream();

	private DebugOutputStream() {
		super(System.out);
	}

	@Override
	public void println(Object x) {
		showLocation();
		super.println(x);
	}

	@Override
	public void println(String x) {
		showLocation();
		super.println(x);
	}

	private void showLocation() {
		StackTraceElement element = Thread.currentThread().getStackTrace()[3];
		super.print(MessageFormat.format("({0}:{1, number,#}) : ", element.getFileName(), element.getLineNumber()));
	}

	public static void activate() {
		System.setOut(INSTANCE);
	}

	public static void deactivate() {
		System.setOut(System.out);
	}
}
