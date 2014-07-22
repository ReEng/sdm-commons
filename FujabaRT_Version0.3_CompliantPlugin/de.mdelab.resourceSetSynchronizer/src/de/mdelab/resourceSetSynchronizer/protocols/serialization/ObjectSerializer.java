package de.mdelab.resourceSetSynchronizer.protocols.serialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;

/**
 * Create SerializedObjects for objects and EObjects. This class is used to
 * serialized objects before sending them to another synchronizer adapter. The
 * ObjectSerializer needs access to a synchronizer adapter (more specifically to
 * its EObjectUUIDManager) to get the UUIDs of EObject to serialize.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectSerializer
{
	private final SynchronizerAdapter	synchronizerAdapter;

	public ObjectSerializer(SynchronizerAdapter synchronizerAdapter)
	{
		assert synchronizerAdapter != null;

		this.synchronizerAdapter = synchronizerAdapter;
	}

	/**
	 * Serialize the specified object. For non-EObjects, the classifier must be
	 * specified.
	 * 
	 * @param object
	 * @param eClassifier
	 * @return
	 */
	public SerializedObject serializeObject(Object object, EClassifier eClassifier)
	{
		assert object != null;

		if (object instanceof EObject)
		{
			return this.serializeEObject((EObject) object);
		}
		else
		{
			assert eClassifier != null;
			return this.serializePrimitive(object, (EDataType) eClassifier);
		}
	}

	/**
	 * Serialize the specified object. or non-EObjects, the classifier must be
	 * specified. If it is an EObject, only ProxyEObjects or
	 * PackageRegistryProxyEObjects are created.
	 * 
	 * @param object
	 * @param eClassifier
	 * @return
	 */
	public SerializedObject serializeObjectAsProxy(Object object, EClassifier eClassifier)
	{
		assert object != null;
		assert eClassifier != null;

		if (object instanceof EObject)
		{
			AbstractSerializedEObject serializedEObject = this.createPackageRegistryProxyEObject((EObject) object);

			if (serializedEObject == null)
			{
				serializedEObject = this.createProxyEObject((EObject) object);
			}

			return serializedEObject;
		}
		else
		{
			return this.serializePrimitive(object, (EDataType) eClassifier);
		}
	}

	/**
	 * Serialize the specified EObject. If the EObject is contained in the EMF
	 * package registry, a PackageRegistryProxy is returned, otherwise a
	 * SerializedEObject is created, which holds the EObject's feature values a
	 * SerializedObjects. References to other EObjects are serialized as
	 * proxies.
	 * 
	 * @param eObject
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public AbstractSerializedEObject serializeEObject(EObject eObject)
	{
		assert eObject != null;

		/*
		 * Check if a package registry proxy can be created.
		 */
		AbstractSerializedEObject serializedEObject = this.createPackageRegistryProxyEObject(eObject);

		if (serializedEObject == null)
		{
			String eObjectUUID = this.synchronizerAdapter.getEObjectUUIDManager().getUuid(eObject);
			String classifierUUID = this.synchronizerAdapter.getEObjectUUIDManager().getUuid(eObject.eClass());

			Map<String, List<SerializedObject>> featureValues = new HashMap<String, List<SerializedObject>>();

			for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures())
			{
				/*
				 * Only serialize changeable, non-derived, non-transient, and
				 * set features.
				 */
				if (feature.isChangeable() && !feature.isDerived() && !feature.isTransient() && eObject.eIsSet(feature))
				{
					List<SerializedObject> list = new ArrayList<SerializedObject>();

					if (!feature.isMany())
					{
						Object object = eObject.eGet(feature);

						if (object != null)
						{
							SerializedObject serializedObject = this.serializeObjectAsProxy(object, feature.getEType());

							list.add(serializedObject);
						}
					}
					else
					{
						for (Object object : (EList<Object>) eObject.eGet(feature))
						{
							SerializedObject serializedObject = this.serializeObjectAsProxy(object, feature.getEType());

							list.add(serializedObject);
						}
					}

					featureValues.put(feature.getName(), list);
				}
			}

			serializedEObject = new SerializedEObject(eObjectUUID, classifierUUID, featureValues);
		}

		return serializedEObject;
	}

	/**
	 * Serialize a primitive (i.e. non-EObject) value. The eDataType must be
	 * serializable, i.e. the appropriate EFactory must be able to convert this
	 * value into a string and vice versa.
	 * 
	 * @param value
	 * @param eDataType
	 * @return
	 */
	public SerializedPrimitive serializePrimitive(Object value, EDataType eDataType)
	{
		String serializedValue = eDataType.getEPackage().getEFactoryInstance().convertToString(eDataType, value);
		String classifierUUID = this.synchronizerAdapter.getEObjectUUIDManager().getUuid(eDataType);

		return new SerializedPrimitive(serializedValue, classifierUUID);
	}

	/**
	 * Create a PackageRegistryProxyEObject for the specified EObject if
	 * possible. If the EObject is not accessible via the EMF package registry,
	 * null is returned.
	 * 
	 * @param eObject
	 * @return
	 */
	private PackageRegistryProxyEObject createPackageRegistryProxyEObject(EObject eObject)
	{
		assert eObject != null;

		/*
		 * Check whether the package registry contains a package with the URI of
		 * the eObject's resource.
		 */
		if (eObject.eResource() != null
				&& this.synchronizerAdapter.getResourceSet().getPackageRegistry().containsKey(eObject.eResource().getURI().toString()))
		{
			return new PackageRegistryProxyEObject(EcoreUtil.getURI(eObject).toString(), this.synchronizerAdapter.getEObjectUUIDManager()
					.getUuid(eObject));
		}
		else
		{
			return null;
		}
	}

	/**
	 * Create a ProxyEObject for the specified EObject, which contains only the
	 * EObject's UUID.
	 * 
	 * @param eObject
	 * @return
	 */
	private ProxyEObject createProxyEObject(EObject eObject)
	{
		return new ProxyEObject(this.synchronizerAdapter.getEObjectUUIDManager().getUuid(eObject));
	}
}
