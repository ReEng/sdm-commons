package de.mdelab.resourceSetSynchronizer.protocols.serialization;

/**
 * Represents a serialized primitive (i.e. a non-EObject). Contains the
 * primitive as a string and the UUID of the primitive's classifier. The
 * primitive is serialized using the appropriate EFactory to convert it to a
 * string.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SerializedPrimitive extends SerializedObject
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 8158377843652310436L;

	private final String		serializedPrimitive;

	private final String		classifierUUID;

	public SerializedPrimitive(String serializedPrimitive, String classifierUUID)
	{
		this.serializedPrimitive = serializedPrimitive;
		this.classifierUUID = classifierUUID;
	}

	public String getSerializedPrimitive()
	{
		return this.serializedPrimitive;
	}

	public String getClassifierUUID()
	{
		return this.classifierUUID;
	}

}
