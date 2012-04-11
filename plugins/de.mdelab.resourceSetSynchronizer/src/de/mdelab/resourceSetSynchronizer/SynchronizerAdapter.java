package de.mdelab.resourceSetSynchronizer;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.tcp.ITCPAcceptor;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.spi.net4j.ServerProtocolFactory;

import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolFactory;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.DisconnectClientRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.EObjectAddedToResourceRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.EObjectRemovedFromResourceRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.FeatureSetRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.FeatureUnsetRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.GetConnectedSynchronizerAdaptersRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.ObjectAddedToFeatureRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.ObjectRemovedFromFeatureRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.ObjectsAddedToFeatureRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.ObjectsRemovedFromFeatureRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.RegisterClientRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.ResourceAddedRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.ResourceUriChangedRequest;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.SyncInitialResourceSetContentsRequest;

/**
 * The SynchronizerAdapter can be attached to a resource set and connect to
 * other SynchronizerAdapters via TCP to keep all resource sets synchronized.
 * All changes made in one resource set are propagated to the others. Note, that
 * the SynchronizerAdapters do not care about concurrent modifications. The user
 * has to take care that a resource set is not modified by more than one thread
 * at the same time. Modifications of the resource set due to received changes
 * from other SynchronizerAdapters are executed asynchronously.
 * 
 * Note further that currently only two connected SynchronizerAdapters have been
 * tested. In addition, it is currently not possible to "merge" resources, i.e.
 * when two resource sets are connected by synchronizer adapters, they may not
 * contain resources with the same URIs.
 * 
 * For communication, the SynchronizerAdapter relies on NET4J. Each
 * SynchronzierAdapter opens a server to receive change events.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SynchronizerAdapter extends EContentAdapter
{
	private final Logger							logger	= Logger.getLogger(SynchronizerAdapter.class);

	/*
	 * The resource set of this synchronizer adapter.
	 */
	private ResourceSet								resourceSet;

	/*
	 * The EObjectUUIDManager manages the UUID of all EObjects in this resource
	 * set.
	 */
	private final EObjectUuidManager				eObjectUUIDManager;

	/*
	 * The UUID of this SynchronizerAdapter.
	 */
	private final String							adapterUUID;

	/*
	 * Maps UUIDs of connected adapters to protocols. These protocols are needed
	 * to send events to other SynchronizerAdapters.
	 */
	private final Map<String, SignalProtocol<?>>	protocols;

	/*
	 * Maps UUIDs of connected adapters to their addresses and ports (value is
	 * "[address]:[port]").
	 */
	private final Map<String, String>				remoteAdapterAddresses;

	/*
	 * The server port of this synchronizer adapter
	 */
	private final int								serverPort;

	/*
	 * The NET4J container of the synchronization protocol.
	 */
	private final IManagedContainer					synchronizationProtocolContainer;

	private final ITCPAcceptor						acceptor;

	/*
	 * Resource filters decide, whether a resource will be synchronized or not.
	 */
	private final Set<IResourceFilter>				resourceFilters;

	/*
	 * The command executor can be used to execute modifications on the resource
	 * set in a transaction.
	 */
	private ISynchronizerCommandExecutor			commandExecutor;

	private boolean									forwardNotifications;

	public SynchronizerAdapter(ResourceSet resourceSet, int serverPort)
	{
		this(resourceSet, serverPort, new SynchronizerCommandExecutor());
	}

	/**
	 * Create a new SynchronizerAdapter and attach it to the provided
	 * resourceSet. The SynchronizerAdapter will listen on the specified port
	 * for incoming message.
	 * 
	 * @param resourceSet
	 *            The resourceSet to which the adapter will be attached.
	 * @param serverPort
	 *            The port on which the adapter will listen for incoming
	 *            messages.
	 */
	public SynchronizerAdapter(ResourceSet resourceSet, int serverPort, ISynchronizerCommandExecutor commandExecutor)
	{
		assert resourceSet != null;
		assert serverPort > 1024;
		assert commandExecutor != null;

		/*
		 * Set up data structures
		 */
		this.adapterUUID = UUID.randomUUID().toString();

		this.logger.info("SynchronizerAdapter(resourceSet," + serverPort + ", commandExecutor)");

		this.resourceSet = resourceSet;
		this.serverPort = serverPort;

		this.forwardNotifications = true;

		this.protocols = new ConcurrentHashMap<String, SignalProtocol<?>>();
		this.remoteAdapterAddresses = new ConcurrentHashMap<String, String>();

		this.eObjectUUIDManager = new EObjectUuidManager();

		this.resourceFilters = new HashSet<IResourceFilter>();

		this.commandExecutor = commandExecutor;

		/*
		 * Open the server
		 */
		this.synchronizationProtocolContainer = ContainerUtil.createContainer();

		Net4jUtil.prepareContainer(this.synchronizationProtocolContainer);
		TCPUtil.prepareContainer(this.synchronizationProtocolContainer);
		this.synchronizationProtocolContainer.registerFactory(new SynchronizationProtocolFactory(this));

		LifecycleUtil.activate(this.synchronizationProtocolContainer);

		this.acceptor = TCPUtil.getAcceptor(this.synchronizationProtocolContainer, "0.0.0.0:" + serverPort);

		/*
		 * Resolve all references in this resource set
		 */
		EcoreUtil.resolveAll(resourceSet);

		/*
		 * Attach to resource set
		 */
		resourceSet.eAdapters().add(this);
	}

	public void addResourceFilter(IResourceFilter resourceFilter)
	{
		this.resourceFilters.add(resourceFilter);
	}

	public Set<IResourceFilter> getResourceFilters()
	{
		return this.resourceFilters;
	}

	public void removeResourceFilter(IResourceFilter resourceFilter)
	{
		this.resourceFilters.remove(resourceFilter);
	}

	@Override
	protected void finalize() throws Throwable
	{
		this.shutdown();
	}

	/**
	 * Create a new synchronization protocol object.
	 * 
	 * @return A new synchronization protocol object.
	 */
	@SuppressWarnings("unchecked")
	private SignalProtocol<Object> createSynchronizationProtocol()
	{
		return (SignalProtocol<Object>) this.synchronizationProtocolContainer.getFactory(ServerProtocolFactory.PRODUCT_GROUP,
				SynchronizationProtocolFactory.SYNCHRONIZATION_PROTOCOL).create(null);
	}

	/**
	 * Connect this synchronizer adapter to the designated target synchronizer
	 * adapter to synchronize both resources.
	 * 
	 * 
	 * @param address
	 *            The hostname or IP address of the remote synchronizer adapter.
	 * @param port
	 *            The port of the remote synchronizer adapter.
	 * @throws Exception
	 */
	public void connect(String address, int port) throws Exception
	{
		assert address != null;
		assert !"".equals(address);

		assert port > 1024;

		this.logger.info("connect(" + address + ", " + port + ")");

		final SignalProtocol<Object> synchronizationProtocol = this.registerAtServer(address + ":" + port);

		/*
		 * Synchronize the resource set's contents.
		 */
		new SyncInitialResourceSetContentsRequest(synchronizationProtocol, this).send();

		/*
		 * Connect to all other synchronizer adapters of this group
		 */
		Map<String, String> synchronizerAdapters = new GetConnectedSynchronizerAdaptersRequest(synchronizationProtocol, this).send();

		for (Entry<String, String> entry : synchronizerAdapters.entrySet())
		{
			this.registerAtServer(entry.getValue());
		}
	}

	private SignalProtocol<Object> registerAtServer(String remoteAddress) throws Exception
	{
		this.logger.info("registerAtServer(" + remoteAddress + ")");

		/*
		 * Get the synchronization protocol
		 */
		final SignalProtocol<Object> synchronizationProtocol = this.createSynchronizationProtocol();

		IConnector connector = TCPUtil.getConnector(this.synchronizationProtocolContainer, remoteAddress);
		synchronizationProtocol.open(connector);

		/*
		 * Send registration request
		 */
		final String remoteAdapterUUID = new RegisterClientRequest(synchronizationProtocol, this, this.getServerPort()).send();

		assert !this.protocols.containsKey(remoteAdapterUUID);
		assert !this.remoteAdapterAddresses.containsKey(remoteAdapterUUID);

		assert synchronizationProtocol.isClient();
		this.protocols.put(remoteAdapterUUID, synchronizationProtocol);
		this.remoteAdapterAddresses.put(remoteAdapterUUID, remoteAddress);

		return synchronizationProtocol;
	}

	/**
	 * Shutdown the server of this synchronizer and remove it from its resource
	 * set.
	 * 
	 * @throws Exception
	 */
	public synchronized void shutdown() throws Exception
	{
		if (this.resourceSet != null)
		{
			this.logger.info("shutdown()");

			this.getResourceSet().eAdapters().remove(this);
			this.resourceSet = null;

			for (SignalProtocol<?> protocol : this.protocols.values())
			{
				new DisconnectClientRequest(protocol, this).send();
			}

			this.protocols.clear();
			this.remoteAdapterAddresses.clear();

			LifecycleUtil.deactivateNoisy(this.acceptor);
			LifecycleUtil.deactivateNoisy(this.synchronizationProtocolContainer);

			assert !this.synchronizationProtocolContainer.isActive();
		}
	}

	/**
	 * Return the resourceSet of this adapter.
	 * 
	 * @return the resourceSet of this adapter.
	 */
	public ResourceSet getResourceSet()
	{
		return this.resourceSet;
	}

	/**
	 * Return the adapter's EObjectUUIDManager.
	 * 
	 * @return the adapter's EObjectUUIDManager.
	 */
	public EObjectUuidManager getEObjectUUIDManager()
	{
		return this.eObjectUUIDManager;
	}

	/**
	 * Registers the specified client synchronizer adapter with this
	 * synchronizer adapter and opens a connection to the other adapter's server
	 * port.
	 * 
	 * This method is only supposed to be called by a RegisterClientIndication.
	 * 
	 * @param remoteAdapterUUID
	 *            The UUID of the remote adapter.
	 * @param remoteAddress
	 *            The remote adapter's hostname or IP address.
	 * @param remotePort
	 *            The remote adapter's server port.
	 */
	public void registerClient(String remoteAdapterUUID, String remoteAddress, int remotePort)
	{
		assert remoteAdapterUUID != null;
		assert !"".equals(remoteAdapterUUID);

		assert remoteAddress != null;
		assert !"".equals(remoteAddress);

		this.logger.info("registerClient(" + remoteAdapterUUID + ", " + remoteAddress + ", " + remotePort + ")");

		SignalProtocol<Object> protocol = this.createSynchronizationProtocol();

		IConnector connector = TCPUtil.getConnector(this.synchronizationProtocolContainer, remoteAddress + ":" + remotePort);
		protocol.open(connector);

		assert protocol.isClient();
		this.protocols.put(remoteAdapterUUID, protocol);
		this.remoteAdapterAddresses.put(remoteAdapterUUID, remoteAddress + ":" + remotePort);
	}

	/**
	 * Return this adapter's UUID.
	 * 
	 * @return this adapter's UUID.
	 */
	public String getAdapterUUID()
	{
		return this.adapterUUID;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(Notification notification)
	{
		try
		{
			super.notifyChanged(notification);

			/*
			 * Skip notifications if ignoreNotifications is set (in case this
			 * adapter received a change event from another synchronizer adapter
			 * and the change is currently applied) or if the change does not
			 * change anything.
			 */
			if (!notification.isTouch() && this.isForwardNotifications() && this.synchronizeNotification(notification))
			{
				this.logger.info("notifyChanged(" + notification + ")");

				/*
				 * Inform all connected adapters
				 */
				for (Entry<String, SignalProtocol<?>> entry : this.protocols.entrySet())
				{
					this.logger.debug("forwarding notification to '" + entry.getKey() + "'...");

					if (notification.getNotifier() instanceof ResourceSet)
					{
						/*
						 * Handle notifications from the resource set.
						 */
						assert notification.getFeatureID(null) == ResourceSet.RESOURCE_SET__RESOURCES;

						switch (notification.getEventType())
						{
							case Notification.ADD:
							{
								/*
								 * A resource has been added.
								 */
								assert notification.getNewValue() instanceof Resource;

								new ResourceAddedRequest(entry.getValue(), this, (Resource) notification.getNewValue()).send();

								EcoreUtil.resolveAll(this.getResourceSet());

								break;
							}

							case Notification.REMOVE:
							{
								/*
								 * A resource has been removed.
								 */
								assert notification.getOldValue() instanceof Resource;

								System.out.println("Resource has been removed: " + ((Resource) notification.getNewValue()).getURI());

								throw new UnsupportedOperationException();
							}

							default:
							{
								/*
								 * Other kinds of changes are not supported.
								 */
								throw new UnsupportedOperationException();
							}
						}
					}
					else if (notification.getNotifier() instanceof Resource)
					{
						/*
						 * Handle notifications from resources
						 */
						switch (notification.getFeatureID(null))
						{
							case Resource.RESOURCE__CONTENTS:
							{
								/*
								 * Handle changes of the resource's contents.
								 */
								switch (notification.getEventType())
								{
									case Notification.ADD:
										new EObjectAddedToResourceRequest(entry.getValue(), this, (EObject) notification.getNewValue(),
												notification.getPosition()).send();

										break;
									case Notification.ADD_MANY:
										System.out.println("Objects were added to resource "
												+ ((Resource) notification.getNotifier()).getURI() + ": " + notification.getNewValue());

										throw new UnsupportedOperationException();

									case Notification.REMOVE:
										new EObjectRemovedFromResourceRequest(entry.getValue(), this,
												(Resource) notification.getNotifier(), (EObject) notification.getOldValue()).send();

										break;

									case Notification.REMOVE_MANY:
										System.out.println("Objects were removed from resource "
												+ ((Resource) notification.getNotifier()).getURI() + ": " + notification.getOldValue());

										throw new UnsupportedOperationException();

									default:
										throw new UnsupportedOperationException();
								}

								break;
							}

							case Resource.RESOURCE__URI:
							{
								/*
								 * Handle changes of the resource's URI.
								 */
								assert notification.getEventType() == Notification.SET;

								new ResourceUriChangedRequest(entry.getValue(), this, (URI) notification.getOldValue(),
										(URI) notification.getNewValue()).send();
								break;
							}
						}
					}
					else if (notification.getNotifier() instanceof EObject)
					{
						/*
						 * Handle notifications from EObjects
						 */
						assert notification.getFeature() != null;
						assert notification.getFeature() instanceof EStructuralFeature;

						switch (notification.getEventType())
						{
							case Notification.ADD:
							{
								new ObjectAddedToFeatureRequest(entry.getValue(), this, (EObject) notification.getNotifier(),
										(EStructuralFeature) notification.getFeature(), notification.getNewValue(),
										notification.getPosition()).send();

								break;
							}

							case Notification.ADD_MANY:
							{
								new ObjectsAddedToFeatureRequest(entry.getValue(), this, (EObject) notification.getNotifier(),
										(EStructuralFeature) notification.getFeature(), (List<Object>) notification.getNewValue(),
										notification.getPosition()).send();

								break;
							}

							case Notification.REMOVE:
							{
								new ObjectRemovedFromFeatureRequest(entry.getValue(), this, (EObject) notification.getNotifier(),
										(EStructuralFeature) notification.getFeature(), notification.getOldValue()).send();

								break;
							}

							case Notification.REMOVE_MANY:
							{
								new ObjectsRemovedFromFeatureRequest(entry.getValue(), this, (EObject) notification.getNotifier(),
										(EStructuralFeature) notification.getFeature(), (List<Object>) notification.getOldValue()).send();

								break;
							}

							case Notification.SET:
							{
								new FeatureSetRequest(entry.getValue(), this, (EObject) notification.getNotifier(),
										(EStructuralFeature) notification.getFeature(), notification.getNewValue(),
										notification.getOldValue()).send();

								break;
							}

							case Notification.UNSET:
							{
								new FeatureUnsetRequest(entry.getValue(), this, (EObject) notification.getNotifier(),
										(EStructuralFeature) notification.getFeature()).send();

								break;
							}

							default:
							{
								throw new UnsupportedOperationException();
							}
						}
					}
				}

			}
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	private boolean synchronizeNotification(Notification notification)
	{
		/*
		 * Ask all filters whether the notification should be synchronized.
		 */
		Resource resource = null;

		if (notification.getNotifier() instanceof ResourceSet)
		{
			assert notification.getFeatureID(null) == ResourceSet.RESOURCE_SET__RESOURCES;

			switch (notification.getEventType())
			{
				case Notification.ADD:
					resource = (Resource) notification.getNewValue();
					break;

				case Notification.REMOVE:
					resource = (Resource) notification.getOldValue();
					break;

				default:
					throw new UnsupportedOperationException();
			}
		}
		else if (notification.getNotifier() instanceof Resource)
		{
			resource = (Resource) notification.getNotifier();
		}
		else if (notification.getNotifier() instanceof EObject)
		{
			resource = ((EObject) notification.getNotifier()).eResource();
		}
		else
		{
			throw new UnsupportedOperationException();
		}

		if (resource == null)
		{
			return false;
		}
		else
		{
			return this.isSynchronizeResource(resource);
		}
	}

	public boolean isSynchronizeResource(Resource resource)
	{
		assert resource != null;

		for (IResourceFilter filter : this.resourceFilters)
		{
			if (!filter.synchronizeResource(resource))
			{
				return false;
			}
		}

		return true;
	}

	/**
	 * Return the protocol that connects to the specified adapter.
	 * 
	 * @param remoteAdapterUUID
	 *            The UUID of the other adapter.
	 * @return The protocol object that connects to the specified adapter.
	 */
	public SignalProtocol<?> getProtocol(String remoteAdapterUUID)
	{
		assert this.protocols.containsKey(remoteAdapterUUID);

		return this.protocols.get(remoteAdapterUUID);
	}

	/**
	 * Return the port of this adapter's server.
	 * 
	 * @return the port of this adapter's server.
	 */
	public int getServerPort()
	{
		return this.serverPort;
	}

	public Map<String, String> getRemoteAdapterAddresses()
	{
		return this.remoteAdapterAddresses;
	}

	public void disconnect(String remoteAdapterUUID)
	{
		this.logger.info("disconnect(" + remoteAdapterUUID + ")");

		SignalProtocol<?> protocol = this.protocols.remove(remoteAdapterUUID);

		assert protocol != null;

		LifecycleUtil.deactivateNoisy(protocol);

		this.remoteAdapterAddresses.remove(remoteAdapterUUID);
	}

	public ISynchronizerCommandExecutor getCommandExecutor()
	{
		return this.commandExecutor;
	}

	public void setCommandExecutor(ISynchronizerCommandExecutor commandExecutor)
	{
		if (commandExecutor == null)
		{
			commandExecutor = new SynchronizerCommandExecutor();
		}
		else
		{
			this.commandExecutor = commandExecutor;
		}
	}

	public synchronized boolean isForwardNotifications()
	{
		return this.forwardNotifications;
	}

	public synchronized void setForwardNotifications(boolean forwardNotifications)
	{
		this.forwardNotifications = forwardNotifications;
	}

}
