package de.mdelab.resourceSetSynchronizer.protocols.synchronization.indications;

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
import de.mdelab.resourceSetSynchronizer.protocols.serialization.SerializedPrimitive;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notifications that an EObject's feature has been set.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class FeatureSetIndication extends SynchronizerIndicationWithResponse
{

	public FeatureSetIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.FEATURE_SET, synchronizerAdapter);
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

		Object oldValue = eObject.eGet(feature);

		/*
		 * Receive serialized value
		 */
		if (!feature.isMany())
		{
			final SerializedObject serializedObject = (SerializedObject) in.readObject(this.getClass().getClassLoader());

			if (serializedObject instanceof SerializedPrimitive
					&& ((SerializedPrimitive) serializedObject).getSerializedPrimitive() == null)
			{
				this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
				{
					@Override
					public void execute()
					{
						FeatureSetIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

						eObject.eSet(feature, null);

						FeatureSetIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
					}
				});
			}
			else
			{
				final ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

				this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
				{
					@Override
					public void execute()
					{
						FeatureSetIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

						Object value = deserializer.deserializeObject(serializedObject);

						assert value != null;

						eObject.eSet(feature, value);

						FeatureSetIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
					}
				});
			}
		}
		else
		{
			final ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

			List<SerializedObject> serializedObjects = (List<SerializedObject>) in.readObject(this.getClass().getClassLoader());

			((EList<Object>) eObject.eGet(feature)).clear();

			for (final SerializedObject serializedObject : serializedObjects)
			{
				this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
				{
					@Override
					public void execute()
					{
						FeatureSetIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

						Object value = deserializer.deserializeObject(serializedObject);

						assert value != null;

						((EList<Object>) eObject.eGet(feature)).add(value);

						FeatureSetIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
					}
				});
			}
		}

		/*
		 * Unregister EObjects
		 */
		if (feature instanceof EReference)
		{
			if (oldValue != null)
			{
				if (oldValue instanceof EObject)
				{
					EObject valueEObject = (EObject) oldValue;

					if (valueEObject.eContainer() == null)
					{
						this.getSynchronizerAdapter().getEObjectUUIDManager().unregisterEObjectWithContents(valueEObject);
					}
				}
				else if (oldValue instanceof List<?>)
				{
					for (Object object : (List<Object>) oldValue)
					{
						EObject valueEObject = (EObject) object;

						if (valueEObject.eContainer() == null)
						{
							this.getSynchronizerAdapter().getEObjectUUIDManager().unregisterEObjectWithContents(valueEObject);
						}
					}
				}
			}
		}
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
