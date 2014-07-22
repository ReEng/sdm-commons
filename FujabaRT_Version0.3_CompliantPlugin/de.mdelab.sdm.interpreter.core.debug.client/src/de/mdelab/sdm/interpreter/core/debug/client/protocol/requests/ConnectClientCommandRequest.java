package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class ConnectClientCommandRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, Integer>
{

	private final int	clientServerPort;

	public ConnectClientCommandRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient, int clientServerPort)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.CONNECT_CLIENT, debugClient);

		this.clientServerPort = clientServerPort;
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send server port of the client
		 */
		out.writeObject(this.clientServerPort);
	}

	@Override
	protected Integer confirming(ExtendedDataInputStream in) throws Exception
	{
		return (Integer) in.readObject();
	}

}
