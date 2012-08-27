package de.mdelab.sdm.interpreter.core.debug.protocol.requests;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionSuspendedEventRequest extends SDEDebugProtocolEventRequest
{

	private final String	breakpointUUID;

	public ExecutionSuspendedEventRequest(SignalProtocol<?> protocol, String breakpointUUID)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_SUSPENDED);

		this.breakpointUUID = breakpointUUID;
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send the UUID of the breakpoint, which caused the suspension.
		 */
		out.writeString(this.breakpointUUID);
	}

}
