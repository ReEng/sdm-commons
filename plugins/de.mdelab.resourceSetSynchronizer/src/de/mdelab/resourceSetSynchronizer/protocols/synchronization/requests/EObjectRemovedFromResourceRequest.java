package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notification that a root EObject was removed from a resource.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class EObjectRemovedFromResourceRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject	eObject;
	private final Resource	resource;

	public EObjectRemovedFromResourceRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, Resource resource,
			EObject eObject)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.EOBJECT_REMOVED_FROM_RESOURCE, synchronizerAdapter);

		assert eObject != null;
		assert resource != null;

		this.eObject = eObject;
		this.resource = resource;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		LOGGER.debug("EObject '" + this.eObject + "' (UUID: "
				+ this.getSynchronizerAdapter().getEObjectUUIDManager().getUuid(this.eObject) + ") removed from resource '"
				+ this.resource.getURI());

		/*
		 * Send resource URI
		 */
		out.writeObject(this.resource.getURI().toString());

		/*
		 * Send EObject UUID
		 */
		out.writeObject(this.getSynchronizerAdapter().getEObjectUUIDManager().getUuid(this.eObject));

		/*
		 * Unregister the EObject and all its contained elements
		 */
		this.getSynchronizerAdapter().getEObjectUUIDManager().unregisterEObjectWithContents(this.eObject);
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
