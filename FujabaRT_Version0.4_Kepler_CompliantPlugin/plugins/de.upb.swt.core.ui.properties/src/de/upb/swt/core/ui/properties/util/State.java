package de.upb.swt.core.ui.properties.util;

public final class State {
	public static enum Type {
		NONE, INFO, WARNING, ERROR;
	}

	public static final State NONE = new State(Type.NONE, null);

	private final Type type;

	private final String message;

	private State(Type type, String message) {
		this.type = type;
		this.message = message;
	}

	public static State error(String message) {
		return new State(Type.ERROR, message);
	}

	public static State info(String message) {
		return new State(Type.INFO, message);
	}

	public static State warning(String message) {
		return new State(Type.WARNING, message);
	}

	public String getMessage() {
		return message;
	}

	public Type getType() {
		return type;
	}

	public boolean isValid() {
		return !Type.ERROR.equals(type);
	}
}
