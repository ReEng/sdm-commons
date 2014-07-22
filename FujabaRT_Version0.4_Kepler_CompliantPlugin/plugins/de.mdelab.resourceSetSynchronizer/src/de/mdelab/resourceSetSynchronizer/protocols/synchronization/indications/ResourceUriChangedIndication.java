package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.ISynchronizerCommand;
import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notifications that a resource's URI has been changed. Change the URI
 * of the corresponding resource in this resource set accordingly.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ResourceUriChangedIndication extends SynchronizerIndicationWithResponse
{

	public ResourceUriChangedIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.RESOURCE_URI_CHANGED, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Read old URI
		 */
		URI oldUri = URI.createURI((String) in.readObject());

		/*
		 * Read new URI
		 */
		final URI newUri = URI.createURI((String) in.readObject());

		/*
		 * Get resource and set URI
		 */
		final Resource resource = this.getSynchronizerAdapter().getResourceSet().getResource(oldUri, false);

		assert resource != null;

		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				ResourceUriChangedIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				resource.setURI(newUri);

				ResourceUriChangedIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
