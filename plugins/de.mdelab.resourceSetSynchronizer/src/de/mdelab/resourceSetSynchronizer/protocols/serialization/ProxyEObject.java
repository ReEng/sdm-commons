package de.mdelab.resourceSetSynchronizer.protocols.serialization;

/**
 * Represents an EObject but does not contains any information about it except
 * its UUID. If the EObject with this UUID is not already know, it must be
 * fetched separately.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ProxyEObject extends AbstractSerializedEObject
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 4738912565327657709L;

	private final String		eObjectUUID;

	public ProxyEObject(String eObjectUUID)
	{
		this.eObjectUUID = eObjectUUID;
	}

	public String getEObjectUUID()
	{
		return this.eObjectUUID;
	}

}
