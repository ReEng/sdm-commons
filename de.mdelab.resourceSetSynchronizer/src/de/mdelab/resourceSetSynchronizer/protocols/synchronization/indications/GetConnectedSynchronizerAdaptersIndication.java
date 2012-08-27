package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

public class GetConnectedSynchronizerAdaptersIndication extends SynchronizerIndicationWithResponse
{

	public GetConnectedSynchronizerAdaptersIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.GET_CONNECTED_SYNCHRONIZER_ADAPTERS, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		// Do nothing
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		Map<String, String> map = new HashMap<String, String>(this.getSynchronizerAdapter().getRemoteAdapterAddresses());

		map.remove(this.getRemoteAdapterUUID());

		out.writeObject(map);
	}

}
