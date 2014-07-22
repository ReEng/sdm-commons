package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import java.util.ArrayList;
import java.util.List;

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
 * Notification that multiple objects were added to a multi-valued feature.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectsAddedToFeatureRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject				eObject;
	private final EStructuralFeature	feature;
	private final List<Object>			featureValues;
	private final int					position;

	public ObjectsAddedToFeatureRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject,
			EStructuralFeature feature, List<Object> featureValues, int position)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECTS_ADDED_TO_FEATURE, synchronizerAdapter);

		assert eObject != null;
		assert feature != null;
		assert featureValues != null;

		this.eObject = eObject;
		this.feature = feature;
		this.featureValues = featureValues;
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
		 * Serialize feature values
		 */
		List<SerializedObject> serializedObjects = new ArrayList<SerializedObject>();

		ObjectSerializer serializer = new ObjectSerializer(this.getSynchronizerAdapter());

		for (Object object : this.featureValues)
		{
			SerializedObject serializedObject = serializer.serializeObject(object, this.feature.getEType());

			serializedObjects.add(serializedObject);
		}

		out.writeObject(serializedObjects);

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
