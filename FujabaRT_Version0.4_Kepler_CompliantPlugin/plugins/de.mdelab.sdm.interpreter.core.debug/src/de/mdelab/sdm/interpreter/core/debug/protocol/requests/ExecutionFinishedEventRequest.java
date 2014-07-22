package de.mdelab.sdm.interpreter.core.debug.protocol.requests;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionFinishedEventRequest extends SDEDebugProtocolEventRequest
{

	public ExecutionFinishedEventRequest(SignalProtocol<?> protocol)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_FINISHED);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

}
