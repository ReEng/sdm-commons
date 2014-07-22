package de.mdelab.sdm.interpreter.core.debug.protocol.requests;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionTerminatedEventRequest extends SDEDebugProtocolEventRequest
{

	public ExecutionTerminatedEventRequest(SignalProtocol<?> protocol)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_TERMINATED);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

}
