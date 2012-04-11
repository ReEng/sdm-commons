package de.mdelab.sdm.interpreter.core.debug.protocol;

/**
 * Enumeration of all command messages sent from the debug client to the debug
 * server.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum SDDebugProtocolCommandMessagesEnum
{
	/**
	 * Connect the client to the debug server.
	 */
	CONNECT_CLIENT,

	/**
	 * Resume story diagram execution.
	 */
	RESUME,

	/**
	 * Terminate story diagram execution.
	 */
	TERMINATE,

	/**
	 * Suspend story diagram execution.
	 */
	SUSPEND,

	/**
	 * Perform a single execution step.
	 */
	STEP_INTO,

	/**
	 * Resume story diagram execution until the size of the execution stack is
	 * the same again.
	 */
	STEP_OVER,

	/**
	 * Resume story diagram execution until the size of the execution stack has
	 * decreased by one.
	 */
	STEP_OUT,

	/**
	 * Set a breakpoint
	 */
	SET_BREAKPOINT,

	/**
	 * Remove a breakpoint.
	 */
	REMOVE_BREAKPOINT,

	/**
	 * Return the current execution stack
	 */
	GET_EXECUTION_STACK,

	/**
	 * Set the value of a variable.
	 */
	SET_VARIABLE,
	STEP_BACK_OVER

}
