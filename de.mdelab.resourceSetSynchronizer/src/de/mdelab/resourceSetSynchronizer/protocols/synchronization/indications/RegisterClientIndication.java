package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle client registrations. Register the client synchronizer adapter at this
 * synchronizer adapter, which establishes a connection to the client's server
 * port.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class RegisterClientIndication extends SynchronizerIndicationWithResponse
{
	public RegisterClientIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.REGISTER_CLIENT, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		int remotePort = (Integer) in.readObject();
		String remoteAddress = ((ITCPConnector) this.getProtocol().getChannel().getMultiplexer()).getHost();

		/*
		 * Start new synchronization acceptor
		 */
		this.getSynchronizerAdapter().registerClient(this.getRemoteAdapterUUID(), remoteAddress, remotePort);
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

}
