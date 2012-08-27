package de.mdelab.sdm.interpreter.core.debug;

/**
 * The possible states of the debugger.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum EDebuggerState
{
	/**
	 * The debugger is actively executing a story diagram.
	 */
	RUNNING,

	/**
	 * The debugger is executing a story diagram but is suspended at the moment.
	 */
	SUSPENDED,

	/**
	 * The debugger has finished executing a story diagram.
	 */
	TERMINATED
}
