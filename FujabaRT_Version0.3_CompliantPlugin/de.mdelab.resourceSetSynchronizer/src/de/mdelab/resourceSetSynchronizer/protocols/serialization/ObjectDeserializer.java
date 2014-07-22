package de.mdelab.resourceSetSynchronizer.protocols.serialization;

import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.signal.SignalProtocol;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.resourceSetSynchronizer.protocols.synchronization.requests.GetEObjectRequest;

/**
 * The ObjectDeserializer deserializes SerializedObjects. It needs to access to
 * a synchronizer adapter (more specifically it EObjectUUIDManager) to get the
 * EObjects belonging to UUIDs and to register new EObjects. Furthermore, it
 * needs to know the UUID of a remote synchronizer adapter. EObjects for unknown
 * UUIDs are requested from that adapter. This can happen if an EObject is
 * deserialized that has references to other yet unknown EObjects. These EObject
 * are resolved by sending an appropriate GetEObjectRequest to the remote
 * synchronizer adapter.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectDeserializer
{
	private final SynchronizerAdapter	synchronizerAdapter;
	private final String				remoteAdapterUUID;

	public ObjectDeserializer(SynchronizerAdapter synchronizerAdapter, String remoteAdapterUUID)
	{
		assert synchronizerAdapter != null;
		assert remoteAdapterUUID != null;
		assert !"".equals(remoteAdapterUUID);

		this.synchronizerAdapter = synchronizerAdapter;
		this.remoteAdapterUUID = remoteAdapterUUID;
	}

	/**
	 * Deserialize the specified object.
	 * 
	 * @param serializedObject
	 * @return
	 */
	public Object deserializeObject(SerializedObject serializedObject)
	{
		if (serializedObject instanceof SerializedPrimitive)
		{
			return this.deserializePrimitive((SerializedPrimitive) serializedObject);
		}
		else if (serializedObject instanceof AbstractSerializedEObject)
		{
			return this.deserializeEObject((AbstractSerializedEObject) serializedObject);
		}
		else
		{
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * Deserialize the specified primitive.
	 * 
	 * @param serializedPrimitive
	 * @return
	 */
	public Object deserializePrimitive(SerializedPrimitive serializedPrimitive)
	{
		EDataType eDataType = (EDataType) this.getEObjectForUUID(serializedPrimitive.getClassifierUUID());

		return eDataType.getEPackage().getEFactoryInstance().createFromString(eDataType, serializedPrimitive.getSerializedPrimitive());
	}

	/**
	 * Deserialize the specified EObject. If it is a proxy, it is automatically
	 * resolved by querying the remote synchronizer adapter.
	 * 
	 * @param abstractSerializedEObject
	 * @return
	 */
	public EObject deserializeEObject(AbstractSerializedEObject abstractSerializedEObject)
	{
		if (abstractSerializedEObject instanceof ProxyEObject)
		{
			return this.getEObjectForUUID(((ProxyEObject) abstractSerializedEObject).getEObjectUUID());
		}
		else if (abstractSerializedEObject instanceof PackageRegistryProxyEObject)
		{
			return this.deserializePackageRegistryProxyEObject((PackageRegistryProxyEObject) abstractSerializedEObject);
		}
		else if (abstractSerializedEObject instanceof SerializedEObject)
		{
			SerializedEObject serializedEObject = (SerializedEObject) abstractSerializedEObject;

			/*
			 * Get the EClass
			 */
			EClass eClass = (EClass) this.getEObjectForUUID(serializedEObject.getClassifierUUID());

			assert eClass != null;
			assert eClass.getEPackage() != null;

			/*
			 * Check if this EObject already exists
			 */
			EObject eObject = this.synchronizerAdapter.getEObjectUUIDManager().getEObject(serializedEObject.getEObjectUUID());

			if (eObject == null)
			{
				eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
				this.synchronizerAdapter.getEObjectUUIDManager().registerEObject(eObject, serializedEObject.getEObjectUUID());

				assert eObject.eClass() == eClass;

				/*
				 * Set the eObject's features
				 */
				for (Entry<String, List<SerializedObject>> entry : serializedEObject.getFeatureValues().entrySet())
				{
					EStructuralFeature feature = eObject.eClass().getEStructuralFeature(entry.getKey());

					assert feature != null;
					assert feature.isChangeable();

					List<SerializedObject> serializedObjects = entry.getValue();

					/*
					 * Deserialize the feature's values
					 */
					if (!feature.isMany())
					{
						assert serializedObjects.size() <= 1;

						if (!serializedObjects.isEmpty())
						{
							eObject.eSet(feature, this.deserializeObject(serializedObjects.get(0)));
						}
					}
					else
					{
						@SuppressWarnings("unchecked")
						EList<Object> featureValues = (EList<Object>) eObject.eGet(feature);

						/*
						 * Clear all existing values
						 */
						featureValues.clear();

						for (SerializedObject serializedObject : serializedObjects)
						{
							featureValues.add(this.deserializeObject(serializedObject));
						}
					}
				}
			}

			return eObject;
		}
		else
		{
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * Deserialize PackageRegistryProxies using the local package registry.
	 * 
	 * @param registryProxyEObject
	 * @return
	 */
	protected EObject deserializePackageRegistryProxyEObject(PackageRegistryProxyEObject registryProxyEObject)
	{
		URI eObjectURI = URI.createURI(registryProxyEObject.getEObjectURI());

		EObject eObject = this.synchronizerAdapter.getResourceSet().getEObject(eObjectURI, false);

		assert eObject != null;

		this.synchronizerAdapter.getEObjectUUIDManager().registerEObject(eObject, registryProxyEObject.getEObjectUUID());

		return eObject;
	}

	/**
	 * Returns the EObject with the specified UUID. If the EObject does not
	 * exist in this synchronizer adapter's resource set, it is fetched from the
	 * other side.
	 * 
	 * @param eObjectUUID
	 * @return
	 */
	public EObject getEObjectForUUID(String eObjectUUID)
	{
		EObject eObject = this.synchronizerAdapter.getEObjectUUIDManager().getEObject(eObjectUUID);

		if (eObject == null)
		{
			try
			{
				SignalProtocol<?> protocol = this.synchronizerAdapter.getProtocol(this.remoteAdapterUUID);

				assert protocol.isClient();

				eObject = new GetEObjectRequest(protocol, this.synchronizerAdapter, eObjectUUID).send();
			}
			catch (Exception e)
			{
				throw new RuntimeException(e);
			}
		}

		return eObject;
	}
}
