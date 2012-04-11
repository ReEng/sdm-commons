package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
 * Handle notification that multiple objects were removed from a multi-valued
 * feature. If the objects were EObject and now are not contained anywhere,
 * their UUID mappings are deleted in the EObjectUUIDManager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectsRemovedFromFeatureIndication extends SynchronizerIndicationWithResponse
{

	public ObjectsRemovedFromFeatureIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECTS_REMOVED_FROM_FEATURE, synchronizerAdapter);
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

		/*
		 * Remove elements
		 */
		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				ObjectsRemovedFromFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				List<Object> featureValues = new ArrayList<Object>();

				for (SerializedObject serializedObject : serializedObjects)
				{
					ObjectDeserializer deserializer = new ObjectDeserializer(ObjectsRemovedFromFeatureIndication.this
							.getSynchronizerAdapter(), ObjectsRemovedFromFeatureIndication.this.getRemoteAdapterUUID());

					Object value = deserializer.deserializeObject(serializedObject);

					featureValues.add(value);
				}

				((EList<Object>) eObject.eGet(feature)).removeAll(featureValues);

				/*
				 * Unregister the EObject and all its contained elements
				 */
				if (feature instanceof EReference)
				{
					for (Object value : featureValues)
					{
						if (((EObject) value).eContainer() == null)
						{
							EObject valueEObject = (EObject) value;

							ObjectsRemovedFromFeatureIndication.this.getSynchronizerAdapter().getEObjectUUIDManager()
									.unregisterEObjectWithContents(valueEObject);
						}
					}
				}
				ObjectsRemovedFromFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});

	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
