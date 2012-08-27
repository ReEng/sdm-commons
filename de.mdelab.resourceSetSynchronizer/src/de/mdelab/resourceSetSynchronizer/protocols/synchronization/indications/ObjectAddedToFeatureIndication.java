package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

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
 * Handle notifications that an object was added to a multi-valued feature.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectAddedToFeatureIndication extends SynchronizerIndicationWithResponse
{

	public ObjectAddedToFeatureIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECT_ADDED_TO_FEATURE, synchronizerAdapter);
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
		 * Deserialize feature value
		 */
		final SerializedObject serializedObject = (SerializedObject) in.readObject(this.getClass().getClassLoader());

		final ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

		/*
		 * Receive position
		 */
		final int position = (Integer) in.readObject(this.getClass().getClassLoader());

		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				ObjectAddedToFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				Object value = deserializer.deserializeObject(serializedObject);

				EList<Object> list = (EList<Object>) eObject.eGet(feature);

				int index = list.indexOf(value);

				if (index >= 0)
				{
					if (index != position)
					{
						list.move(position, index);
					}
				}
				else
				{
					list.add(position, value);
				}

				ObjectAddedToFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
