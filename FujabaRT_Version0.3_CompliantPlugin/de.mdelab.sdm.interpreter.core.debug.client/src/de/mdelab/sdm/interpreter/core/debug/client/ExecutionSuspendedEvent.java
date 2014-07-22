package de.mdelab.sdm.interpreter.core.debug.client;


public class ExecutionSuspendedEvent extends DebugEvent
{
	private final String	breakpointUUID;

	public ExecutionSuspendedEvent(String breakpointUUID)
	{
		this.breakpointUUID = breakpointUUID;
	}

	public String getBreakpointUUID()
	{
		return this.breakpointUUID;
	}

}
