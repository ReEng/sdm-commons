package de.mdelab.resourceSetSynchronizer.protocols.serialization;

/**
 * Represents an EObject in the EMF package registry, usually a classifier. It
 * contains the EObject's URI and UUID.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class PackageRegistryProxyEObject extends AbstractSerializedEObject
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6017493211735918424L;

	private final String		eObjectURI;

	private final String		eObjectUUID;

	public PackageRegistryProxyEObject(String eObjectURI, String eObjectUUID)
	{
		super();
		this.eObjectURI = eObjectURI;
		this.eObjectUUID = eObjectUUID;
	}

	public String getEObjectURI()
	{
		return this.eObjectURI;
	}

	public String getEObjectUUID()
	{
		return this.eObjectUUID;
	}

}
