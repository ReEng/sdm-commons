package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.ObjectSerializer;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.SerializedObject;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notification that an object was added to a multi-valued feature.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectAddedToFeatureRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject				eObject;
	private final EStructuralFeature	feature;
	private final Object				featureValue;
	private final int					position;

	public ObjectAddedToFeatureRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject,
			EStructuralFeature feature, Object featureValue, int position)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECT_ADDED_TO_FEATURE, synchronizerAdapter);

		assert eObject != null;
		assert feature != null;
		assert featureValue != null;

		this.eObject = eObject;
		this.feature = feature;
		this.featureValue = featureValue;
		this.position = position;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send EObject UUID
		 */
		out.writeObject(this.getSynchronizerAdapter().getEObjectUUIDManager().getUuid(this.eObject));

		/*
		 * Send feature name
		 */
		out.writeObject(this.feature.getName());

		/*
		 * Serialize feature value
		 */
		ObjectSerializer serializer = new ObjectSerializer(this.getSynchronizerAdapter());

		SerializedObject serializedObject = serializer.serializeObject(this.featureValue, this.feature.getEType());

		out.writeObject(serializedObject);

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
