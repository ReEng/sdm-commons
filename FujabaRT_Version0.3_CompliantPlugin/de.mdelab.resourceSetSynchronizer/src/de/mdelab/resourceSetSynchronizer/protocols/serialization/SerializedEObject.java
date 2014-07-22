package de.mdelab.resourceSetSynchronizer.protocols.serialization;

import java.util.List;
import java.util.Map;

/**
 * SerializedEObject contains the serialized form of an EObject. It contains the
 * EObject's UUID, the UUID of its classifier, and a map with the serialized
 * values of all its features as SerializedObjects.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SerializedEObject extends AbstractSerializedEObject
{
	/**
	 * 
	 */
	private static final long							serialVersionUID	= 543072133408062980L;

	private final String								eObjectUUID;

	private final String								classifierUUID;

	private final Map<String, List<SerializedObject>>	featureValues;

	public SerializedEObject(String eObjectUUID, String classifierUUID, Map<String, List<SerializedObject>> featureValues)
	{
		this.eObjectUUID = eObjectUUID;
		this.classifierUUID = classifierUUID;
		this.featureValues = featureValues;
	}

	public String getEObjectUUID()
	{
		return this.eObjectUUID;
	}

	public String getClassifierUUID()
	{
		return this.classifierUUID;
	}

	public Map<String, List<SerializedObject>> getFeatureValues()
	{
		return this.featureValues;
	}
}
