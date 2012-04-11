package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

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
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationUtils;

/**
 * Handle resource set synchronization requests. These requests are sent after
 * establishing a connection to this synchronizer adapter. First, the contents
 * of this resource set are serialized but not sent immediately. Then, the
 * serialized contents of the other synchronizer adapter's resource set are
 * received and the serialized contents of this resource are sent (cf. step 1).
 * The received contents are deserialized and inserted into this resource set.
 * 
 * Note that the two resource sets may not contain resources with the same URIs.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SyncInitialResourceSetContentsIndication extends SynchronizerIndicationWithResponse
{

	private Map<String, String>			serializedResources;
	private Map<String, Set<String>>	resourceDependencies;
	private Map<String, String>			eObjectUUIDs;

	public SyncInitialResourceSetContentsIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.SYNC_INITIAL_RESOURCE_SET_CONTENTS, synchronizerAdapter);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Send the currently contained resources of the synchronizerAdapter's
		 * resource set
		 */
		final Map<String, String> serializedResources = new HashMap<String, String>();
		this.serializedResources = serializedResources;

		final Map<String, Set<String>> resourceDependencies = new HashMap<String, Set<String>>();
		this.resourceDependencies = resourceDependencies;

		final Map<String, String> eObjectUUIDs = new HashMap<String, String>();
		this.eObjectUUIDs = eObjectUUIDs;

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

		/*
		 * Receive the serialized resources of the client
		 */
		final Map<String, String> clientSerializedResources = (Map<String, String>) in.readObject(this.getClass().getClassLoader());

		final Map<String, Set<String>> clientResourceDependencies = (Map<String, Set<String>>) in.readObject(this.getClass()
				.getClassLoader());

		final Map<String, String> clientEObjectUUIDs = (Map<String, String>) in.readObject(this.getClass().getClassLoader());

		/*
		 * Deserialize resources. Start with those resources that do not have
		 * any unresolved dependencies.
		 */
		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				SyncInitialResourceSetContentsIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				Set<String> deserializedResources = new HashSet<String>();

				while (!clientResourceDependencies.isEmpty())
				{
					Iterator<Entry<String, Set<String>>> iterator = clientResourceDependencies.entrySet().iterator();

					boolean change = false;

					while (iterator.hasNext())
					{
						Entry<String, Set<String>> entry = iterator.next();

						if (entry.getValue().isEmpty() || deserializedResources.containsAll(entry.getValue()))
						{
							URI resourceURI = URI.createURI(entry.getKey());

							if (SyncInitialResourceSetContentsIndication.this.getSynchronizerAdapter().getResourceSet()
									.getResource(resourceURI, false) != null)
							{
								throw new UnsupportedOperationException("Resource " + resourceURI
										+ " exists on client and server. Merging them is currently not possible.");
							}

							Resource resource = SyncInitialResourceSetContentsIndication.this.getSynchronizerAdapter().getResourceSet()
									.createResource(resourceURI);

							ByteArrayInputStream inputStream = new ByteArrayInputStream(HexUtil.hexToBytes(clientSerializedResources
									.get(entry.getKey())));

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
				for (Entry<String, String> entry : clientEObjectUUIDs.entrySet())
				{
					EObject eObject = SyncInitialResourceSetContentsIndication.this.getSynchronizerAdapter().getResourceSet()
							.getEObject(URI.createURI(entry.getValue()), false);

					assert eObject != null;

					SyncInitialResourceSetContentsIndication.this.getSynchronizerAdapter().getEObjectUUIDManager()
							.registerEObject(eObject, entry.getKey());
				}

				SyncInitialResourceSetContentsIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(this.serializedResources);

		out.writeObject(this.resourceDependencies);

		out.writeObject(this.eObjectUUIDs);
	}

}
