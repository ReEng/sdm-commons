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
import de.mdelab.resourceSetSynchronizer.protocols.serialization.SerializedPrimitive;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notification that the feature of an EObject has been set to a new value.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class FeatureSetRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject				eObject;
	private final EStructuralFeature	feature;
	private final Object				value;
	private final Object				oldValue;

	public FeatureSetRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject,
			EStructuralFeature feature, Object value, Object oldValue)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.FEATURE_SET, synchronizerAdapter);

		assert eObject != null;
		assert feature != null;

		this.eObject = eObject;
		this.feature = feature;
		this.value = value;
		this.oldValue = oldValue;
	}

	@SuppressWarnings("unchecked")
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
		if (this.value == null)
		{
			out.writeObject(new SerializedPrimitive(null, null));
		}
		else
		{
			ObjectSerializer serializer = new ObjectSerializer(this.getSynchronizerAdapter());

			if (!this.feature.isMany())
			{
				SerializedObject serializedObject = serializer.serializeObject(this.value, this.feature.getEType());

				out.writeObject(serializedObject);
			}
			else
			{
				assert this.value instanceof List<?>;

				List<SerializedObject> serializedObjects = new ArrayList<SerializedObject>();

				for (Object object : (List<Object>) this.value)
				{
					SerializedObject serializedObject = serializer.serializeObject(object, this.feature.getEType());

					serializedObjects.add(serializedObject);
				}

				out.writeObject(serializedObjects);
			}
		}

		/*
		 * Unregister EObjects
		 */
		if (this.feature instanceof EReference)
		{
			if (this.oldValue != null)
			{
				if (this.oldValue instanceof EObject)
				{
					EObject valueEObject = (EObject) this.oldValue;

					if (valueEObject.eContainer() == null)
					{
						this.getSynchronizerAdapter().getEObjectUUIDManager().unregisterEObjectWithContents(valueEObject);
					}
				}
				else if (this.oldValue instanceof List<?>)
				{
					for (Object object : (List<Object>) this.oldValue)
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
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
