package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notification that the URI of a resource has been changed.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ResourceUriChangedRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final URI	oldUri;
	private final URI	newUri;

	public ResourceUriChangedRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, URI oldUri, URI newUri)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.RESOURCE_URI_CHANGED, synchronizerAdapter);

		assert oldUri != null;
		assert newUri != null;

		this.oldUri = oldUri;
		this.newUri = newUri;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send old URI
		 */
		out.writeObject(this.oldUri.toString());

		/*
		 * Send new URI
		 */
		out.writeObject(this.newUri.toString());
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
