package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.HexUtil;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.ISynchronizerCommand;
import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationUtils;

/**
 * Synchronize the contents of two resource sets. This is request is sent after
 * establishing a connection to another synchronizer adapter. First, the
 * contents of this resource set are serialized and sent to the other
 * synchronizer adapter. After that, the serialized contents of the other
 * adapter are deserialized and inserted into this resource set.
 * 
 * Note that the two resource sets may not contain resources with the same URIs.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SyncInitialResourceSetContentsRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	public SyncInitialResourceSetContentsRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.SYNC_INITIAL_RESOURCE_SET_CONTENTS, synchronizerAdapter);
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send the currently contained resources of the synchronizerAdapter's
		 * resource set
		 */
		Map<String, String> serializedResources = new HashMap<String, String>();

		Map<String, Set<String>> resourceDependencies = new HashMap<String, Set<String>>();

		Map<String, String> eObjectUUIDs = new HashMap<String, String>();

		for (Resource resource : this.getSynchronizerAdapter().getResourceSet().getResources())
		{
			if (!this.getSynchronizerAdapter().isSynchronizeResource(resource))
			{
				continue;
			}

			/*
			 * Get required resources
			 */
			Set<String> requiredResources = new HashSet<String>();

			for (Resource requiredResource : SynchronizationUtils.computeRequiredResources(resource))
			{
				requiredResources.add(requiredResource.getURI().toString());
			}

			resourceDependencies.put(resource.getURI().toString(), requiredResources);

			/*
			 * Serialize the resource
			 */
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_SCHEMA_LOCATION, true);

			resource.save(byteArrayOutputStream, options);

			serializedResources.put(resource.getURI().toString(), HexUtil.bytesToHex(byteArrayOutputStream.toByteArray()));

			/*
			 * Get UUIDs for all EObjects
			 */
			Iterator<EObject> it = resource.getAllContents();

			while (it.hasNext())
			{
				EObject eObject = it.next();

				eObjectUUIDs.put(this.getSynchronizerAdapter().getEObjectUUIDManager().getUuid(eObject), EcoreUtil.getURI(eObject)
						.toString());
			}
		}

		out.writeObject(serializedResources);

		out.writeObject(resourceDependencies);

		out.writeObject(eObjectUUIDs);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Receive the serialized resources from the server
		 */
		final Map<String, String> serializedResources = (Map<String, String>) in.readObject(this.getClass().getClassLoader());

		final Map<String, Set<String>> resourceDependencies = (Map<String, Set<String>>) in.readObject(this.getClass().getClassLoader());

		final Map<String, String> eObjectUUIDs = (Map<String, String>) in.readObject(this.getClass().getClassLoader());

		/*
		 * Deserialize resources. Start with those resources that do not have
		 * any unresolved dependencies.
		 */
		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				SyncInitialResourceSetContentsRequest.this.getSynchronizerAdapter().setForwardNotifications(false);

				Set<String> deserializedResources = new HashSet<String>();

				while (!resourceDependencies.isEmpty())
				{
					Iterator<Entry<String, Set<String>>> iterator = resourceDependencies.entrySet().iterator();

					boolean change = false;

					while (iterator.hasNext())
					{
						Entry<String, Set<String>> entry = iterator.next();

						if (entry.getValue().isEmpty() || deserializedResources.containsAll(entry.getValue()))
						{
							URI resourceURI = URI.createURI(entry.getKey());

							if (SyncInitialResourceSetContentsRequest.this.getSynchronizerAdapter().getResourceSet()
									.getResource(resourceURI, false) != null)
							{
								throw new UnsupportedOperationException("Resource " + resourceURI
										+ " exists on client and server. Merging them is currently not possible.");
							}

							Resource resource = SyncInitialResourceSetContentsRequest.this.getSynchronizerAdapter().getResourceSet()
									.createResource(resourceURI);

							ByteArrayInputStream inputStream = new ByteArrayInputStream(HexUtil.hexToBytes(serializedResources.get(entry
									.getKey())));

							try
							{
								resource.load(inputStream, null);
							}
							catch (IOException e)
							{
								throw new RuntimeException("Could not deserialize resource '" + resourceURI + "'.", e);
							}

							iterator.remove();

							change = true;

							deserializedResources.add(entry.getKey());
						}
					}

					if (!change)
					{
						throw new RuntimeException("Could not deserialize all resources due to unresolved dependencies.");
					}
				}

				/*
				 * Restore EObject UUIDs
				 */
				for (Entry<String, String> entry : eObjectUUIDs.entrySet())
				{
					EObject eObject = SyncInitialResourceSetContentsRequest.this.getSynchronizerAdapter().getResourceSet()
							.getEObject(URI.createURI(entry.getValue()), false);

					assert eObject != null;

					SyncInitialResourceSetContentsRequest.this.getSynchronizerAdapter().getEObjectUUIDManager()
							.registerEObject(eObject, entry.getKey());
				}

				SyncInitialResourceSetContentsRequest.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});

		return true;
	}
}
