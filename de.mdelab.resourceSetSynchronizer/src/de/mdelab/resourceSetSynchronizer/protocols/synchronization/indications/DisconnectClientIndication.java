package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

public class DisconnectClientIndication extends SynchronizerIndicationWithResponse
{

	public DisconnectClientIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.DISCONNECT_CLIENT, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		String adapterUUID = in.readString();

		this.getSynchronizerAdapter().disconnect(adapterUUID);
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeBoolean(true);
	}

}
