package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.AbstractSerializedEObject;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.ObjectSerializer;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notify another synchronization adapter that a root EObject has been added to
 * a resource.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class EObjectAddedToResourceRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject	eObject;
	private final int		position;

	public EObjectAddedToResourceRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject, int position)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.EOBJECT_ADDED_TO_RESOURCE, synchronizerAdapter);

		this.eObject = eObject;
		this.position = position;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send resource URI
		 */
		out.writeObject(this.eObject.eResource().getURI().toString());

		/*
		 * Serialize EObject
		 */
		ObjectSerializer serializer = new ObjectSerializer(this.getSynchronizerAdapter());

		AbstractSerializedEObject serializedEObject = serializer.serializeEObject(this.eObject);

		/*
		 * Send serialized EObject
		 */
		out.writeObject(serializedEObject);

		/*
		 * Send EObject UUID
		 */
		out.writeObject(this.getSynchronizerAdapter().getEObjectUUIDManager().getUuid(this.eObject));

		/*
		 * Send position
		 */
		out.writeObject(this.position);
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
