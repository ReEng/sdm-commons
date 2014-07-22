package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.HexUtil;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.ISynchronizerCommand;
import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notifications that a resource has been added to another resource set.
 * Deserialize the resource and add it to this synchronizer adapter's resource
 * set.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ResourceAddedIndication extends SynchronizerIndicationWithResponse
{

	public ResourceAddedIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.RESOURCE_ADDED, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Get the resource's URI
		 */
		final URI resourceURI = URI.createURI((String) in.readObject(this.getClass().getClassLoader()));

		final ByteArrayInputStream inputStream = new ByteArrayInputStream(HexUtil.hexToBytes((String) in.readObject(this.getClass()
				.getClassLoader())));

		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				ResourceAddedIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				if (ResourceAddedIndication.this.getSynchronizerAdapter().getResourceSet().getResource(resourceURI, false) != null)
				{
					throw new UnsupportedOperationException("Resource " + resourceURI
							+ " exists on client and server. Merging them is currently not possible.");
				}

				Resource resource = ResourceAddedIndication.this.getSynchronizerAdapter().getResourceSet().createResource(resourceURI);

				/*
				 * Deserialize the resource's contents
				 */

				try
				{
					resource.load(inputStream, null);
				}
				catch (IOException e)
				{
					throw new RuntimeException("Could not deserialize resource '" + resourceURI.toString() + "'.", e);
				}

				ResourceAddedIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});

		/*
		 * Restore EObject UUIDs
		 */
		@SuppressWarnings("unchecked")
		Map<String, String> eObjectUUIDs = (Map<String, String>) in.readObject(this.getClass().getClassLoader());

		for (Entry<String, String> entry : eObjectUUIDs.entrySet())
		{
			EObject eObject = this.getSynchronizerAdapter().getResourceSet().getEObject(URI.createURI(entry.getValue()), false);

			assert eObject != null;

			this.getSynchronizerAdapter().getEObjectUUIDManager().registerEObject(eObject, entry.getKey());
		}
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
