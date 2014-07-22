package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.HexUtil;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notification that a resource has been added to the resource set. Send the
 * serialized resource.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ResourceAddedRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final Resource	resource;

	public ResourceAddedRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, Resource resource)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.RESOURCE_ADDED, synchronizerAdapter);

		assert resource != null;

		this.resource = resource;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send the resource's URI
		 */
		out.writeObject(this.resource.getURI().toString());

		/*
		 * Serialize the resource
		 */
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		this.resource.save(byteArrayOutputStream, null);

		out.writeObject(HexUtil.bytesToHex(byteArrayOutputStream.toByteArray()));

		/*
		 * Get UUIDs for all EObjects
		 */
		Map<String, String> eObjectUUIDs = new HashMap<String, String>();

		Iterator<EObject> it = this.resource.getAllContents();

		while (it.hasNext())
		{
			EObject eObject = it.next();

			eObjectUUIDs.put(this.getSynchronizerAdapter().getEObjectUUIDManager().getUuid(eObject), EcoreUtil.getURI(eObject).toString());
		}

		out.writeObject(eObjectUUIDs);
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
