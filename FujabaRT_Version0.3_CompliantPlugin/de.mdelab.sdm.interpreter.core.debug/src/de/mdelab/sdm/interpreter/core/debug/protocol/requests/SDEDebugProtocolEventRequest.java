package de.mdelab.sdm.interpreter.core.debug.protocol.requests;

import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.signal.SignalProtocol;

public abstract class SDEDebugProtocolEventRequest extends Request
{
	public SDEDebugProtocolEventRequest(SignalProtocol<?> protocol, Enum<?> literal)
	{
		super(protocol, literal);
	}

}
