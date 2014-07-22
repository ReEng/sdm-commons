package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

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
 * Notification that an object was removed from a multi-valued feature. If the
 * object is an EObject and now is not contained anywhere, its UUID mapping is
 * deleted in the EObjectUUIDManager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectRemovedFromFeatureRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject				eObject;
	private final EStructuralFeature	feature;
	private final Object				featureValue;

	public ObjectRemovedFromFeatureRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject,
			EStructuralFeature feature, Object featureValue)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECT_REMOVED_FROM_FEATURE, synchronizerAdapter);

		assert eObject != null;
		assert feature != null;
		assert featureValue != null;

		this.eObject = eObject;
		this.feature = feature;
		this.featureValue = featureValue;
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
		 * Unregister the EObject and all its contained elements
		 */
		if (this.feature instanceof EReference)
		{
			if (((EObject) this.featureValue).eContainer() == null)
			{
				EObject valueEObject = (EObject) this.featureValue;

				this.getSynchronizerAdapter().getEObjectUUIDManager().unregisterEObjectWithContents(valueEObject);
			}
		}
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
