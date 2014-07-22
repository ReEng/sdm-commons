package de.mdelab.sdm.interpreter.core.debug.protocol.requests;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionResumedEventRequest extends SDEDebugProtocolEventRequest
{

	public ExecutionResumedEventRequest(SignalProtocol<?> protocol)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_RESUMED);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

}
