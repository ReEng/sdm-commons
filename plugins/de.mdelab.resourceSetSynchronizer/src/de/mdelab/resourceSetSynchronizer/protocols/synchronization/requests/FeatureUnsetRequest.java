package de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.SynchronizerRequestWithConfirmation;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Notification that a feature has been unset.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class FeatureUnsetRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	private final EObject				eObject;
	private final EStructuralFeature	feature;

	public FeatureUnsetRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, EObject eObject,
			EStructuralFeature feature)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.FEATURE_UNSET, synchronizerAdapter);

		assert eObject != null;
		assert feature != null;

		Object object = eObject.eGet(feature);

		assert object == null || object instanceof List<?> && ((List<?>) object).isEmpty() || object.equals(feature.getDefaultValue());

		this.eObject = eObject;
		this.feature = feature;
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
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Boolean) in.readObject();
	}

}
