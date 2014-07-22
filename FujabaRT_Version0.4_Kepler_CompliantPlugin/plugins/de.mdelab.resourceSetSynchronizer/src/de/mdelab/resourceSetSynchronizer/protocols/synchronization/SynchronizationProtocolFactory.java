package de.mdelab.resourceSetSynchronizer.protocols.synchronization;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.factory.ProductCreationException;
import org.eclipse.spi.net4j.ServerProtocolFactory;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.DisconnectClientIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.EObjectAddedToResourceIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.EObjectRemovedFromResourceIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.FeatureSetIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.FeatureUnsetIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.GetConnectedSynchronizerAdaptersIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.GetEObjectIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.ObjectAddedToFeatureIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.ObjectRemovedFromFeatureIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.ObjectsAddedToFeatureIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.ObjectsRemovedFromFeatureIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.RegisterClientIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.ResourceAddedIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.ResourceUriChangedIndication;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications.SyncInitialResourceSetContentsIndication;

/**
 * The protocol factory of the synchronization protocol. Creates appropriate
 * indications for requests.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SynchronizationProtocolFactory extends ServerProtocolFactory
{
	public static final String			SYNCHRONIZATION_PROTOCOL	= "de.mdelab.resourceSetSynchronizer.synchronizationProtocol";

	private final SynchronizerAdapter	synchronizerAdapter;

	public SynchronizationProtocolFactory(SynchronizerAdapter serverAdapter)
	{
		super(SYNCHRONIZATION_PROTOCOL);

		assert serverAdapter != null;

		this.synchronizerAdapter = serverAdapter;
	}

	@Override
	public Object create(String description) throws ProductCreationException
	{
		return new SignalProtocol<Object>(SYNCHRONIZATION_PROTOCOL)
		{
			@Override
			protected SignalReactor createSignalReactor(short signalID)
			{
				switch (SynchronizationProtocolMessagesEnum.values()[signalID])
				{
					case REGISTER_CLIENT:
						return new RegisterClientIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case DISCONNECT_CLIENT:
						return new DisconnectClientIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case SYNC_INITIAL_RESOURCE_SET_CONTENTS:
						return new SyncInitialResourceSetContentsIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case RESOURCE_ADDED:
						return new ResourceAddedIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case RESOURCE_URI_CHANGED:
						return new ResourceUriChangedIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case EOBJECT_ADDED_TO_RESOURCE:
						return new EObjectAddedToResourceIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case EOBJECT_REMOVED_FROM_RESOURCE:
						return new EObjectRemovedFromResourceIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case GET_EOBJECT:
						return new GetEObjectIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case OBJECT_ADDED_TO_FEATURE:
						return new ObjectAddedToFeatureIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case OBJECTS_ADDED_TO_FEATURE:
						return new ObjectsAddedToFeatureIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case OBJECT_REMOVED_FROM_FEATURE:
						return new ObjectRemovedFromFeatureIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case OBJECTS_REMOVED_FROM_FEATURE:
						return new ObjectsRemovedFromFeatureIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case FEATURE_SET:
						return new FeatureSetIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case FEATURE_UNSET:
						return new FeatureUnsetIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					case GET_CONNECTED_SYNCHRONIZER_ADAPTERS:
						return new GetConnectedSynchronizerAdaptersIndication(this, SynchronizationProtocolFactory.this.synchronizerAdapter);

					default:
						return super.createSignalReactor(signalID);
				}
			}
		};
	}
}
