package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import java.util.Map;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

public class GetConnectedSynchronizerAdaptersRequest extends SynchronizerRequestWithConfirmation<Map<String, String>>
{
	public GetConnectedSynchronizerAdaptersRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.GET_CONNECTED_SYNCHRONIZER_ADAPTERS, synchronizerAdapter);
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Map<String, String> doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Map<String, String>) in.readObject();
	}

}
