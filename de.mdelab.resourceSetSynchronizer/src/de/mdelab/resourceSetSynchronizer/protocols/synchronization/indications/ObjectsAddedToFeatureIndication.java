package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.ISynchronizerCommand;
import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerIndicationWithResponse;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.ObjectDeserializer;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.SerializedObject;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notifications that multiple objects were added to a multi-valued
 * feature.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectsAddedToFeatureIndication extends SynchronizerIndicationWithResponse
{

	public ObjectsAddedToFeatureIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECTS_ADDED_TO_FEATURE, synchronizerAdapter);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Receive EObject UUID
		 */
		String eObjectUUID = (String) in.readObject(this.getClass().getClassLoader());

		final EObject eObject = this.getSynchronizerAdapter().getEObjectUUIDManager().getEObject(eObjectUUID);

		assert eObject != null;

		/*
		 * Receive feature name
		 */
		String featureName = (String) in.readObject(this.getClass().getClassLoader());

		final EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);

		assert feature.isMany();
		assert feature.isChangeable();

		/*
		 * Deserialize feature values
		 */
		final List<SerializedObject> serializedObjects = (List<SerializedObject>) in.readObject(this.getClass().getClassLoader());

		final ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

		/*
		 * Receive position
		 */
		final int position = (Integer) in.readObject(this.getClass().getClassLoader());

		/*
		 * Add feature values
		 */
		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				ObjectsAddedToFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				List<Object> featureValues = new ArrayList<Object>();

				for (SerializedObject serializedObject : serializedObjects)
				{
					Object value = deserializer.deserializeObject(serializedObject);

					featureValues.add(value);
				}

				((EList<Object>) eObject.eGet(feature)).addAll(position, featureValues);

				ObjectsAddedToFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
