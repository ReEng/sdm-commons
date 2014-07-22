package de.mdelab.sdm.interpreter.core.debug.protocol;

/**
 * Enumeration of all debug event messages sent from the debug server to the
 * debug client.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum SDDebugProtocolEventMessagesEnum
{
	/**
	 * The story diagram execution has finished normally.
	 */
	EXECUTION_FINISHED,

	/**
	 * The story diagram execution was terminated.
	 */
	EXECUTION_TERMINATED,

	/**
	 * The story diagram execution was resumed.
	 */
	EXECUTION_RESUMED,

	/**
	 * The story diagram execution was suspended.
	 */
	EXECUTION_SUSPENDED
}
