package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
 * Notification that multiple objects were removed from a multi-valued feature.
 * If the objects are EObjects and now are not contained anywhere, their UUID
 * mappings are deleted in the EObjectUUIDManager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectsRemovedFromFeatureRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject				eObject;
	private final EStructuralFeature	feature;
	private final List<Object>			featureValues;

	public ObjectsRemovedFromFeatureRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject,
			EStructuralFeature feature, List<Object> featureValues)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECTS_REMOVED_FROM_FEATURE, synchronizerAdapter);

		assert eObject != null;
		assert feature != null;
		assert featureValues != null;

		this.eObject = eObject;
		this.feature = feature;
		this.featureValues = featureValues;
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
		List<SerializedObject> serializedFeatureValues = new ArrayList<SerializedObject>();

		for (Object featureValue : this.featureValues)
		{
			ObjectSerializer serializer = new ObjectSerializer(this.getSynchronizerAdapter());

			SerializedObject serializedObject = serializer.serializeObject(featureValue, this.feature.getEType());

			serializedFeatureValues.add(serializedObject);
		}

		out.writeObject(serializedFeatureValues);

		/*
		 * Unregister the EObject and all its contained elements
		 */
		if (this.feature instanceof EReference)
		{
			for (Object featureValue : this.featureValues)
			{
				if (((EObject) featureValue).eContainer() == null)
				{
					EObject valueEObject = (EObject) featureValue;

					this.getSynchronizerAdapter().getEObjectUUIDManager().unregisterEObjectWithContents(valueEObject);
				}
			}
		}
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
