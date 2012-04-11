package de.mdelab.resourceSetSynchronizer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

/**
 * The EObjectUUIDManager manages the UUIDs of EObjects.
 * 
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class EObjectUuidManager
{
	private final Logger				logger	= Logger.getLogger(EObjectUuidManager.class);

	/*
	 * Maps UUIDs to EObjects
	 */
	private final Map<String, EObject>	uuid2eObjectMap;

	/*
	 * Maps EObjects to UUIDs
	 */
	private final Map<EObject, String>	eObject2uuidMap;

	private EObjectUuidCalculator		eObjectUuidCalculator;

	/**
	 * Create a new EObjectUUIDManager and initialize it.
	 */
	public EObjectUuidManager()
	{
		this.uuid2eObjectMap = new ConcurrentHashMap<String, EObject>();
		this.eObject2uuidMap = new ConcurrentHashMap<EObject, String>();

		this.setEObjectUuidCalculator(new EObjectUuidCalculator());
	}

	/**
	 * Return the EObject with the specified UUID or null if this UUID is
	 * unknown.
	 * 
	 * @param uuid
	 * @return
	 */
	public EObject getEObject(String uuid)
	{
		assert uuid != null;
		assert !"".equals(uuid);

		return this.uuid2eObjectMap.get(uuid);
	}

	/**
	 * Register an EObject with the specified UUID.
	 * 
	 * @param eObject
	 * @param uuid
	 */
	public void registerEObject(EObject eObject, String uuid)
	{
		if (this.eObject2uuidMap.containsKey(eObject))
		{
			this.logger.info("EObjectUuidManager.registerEObject(" + eObject + ", " + uuid + "), mapping exists already");
		}
		else
		{
			this.logger.info("EObjectUuidManager.registerEObject(" + eObject + ", " + uuid + ")");
		}

		this.uuid2eObjectMap.put(uuid, eObject);
		this.eObject2uuidMap.put(eObject, uuid);
	}

	/**
	 * Get the UUID of the specified EObject. If this EObject does not have a
	 * UUID, yet, a new UUID is assigned.
	 * 
	 * @param eObject
	 * @return
	 */
	public String getUuid(EObject eObject)
	{
		assert eObject != null;

		String uuid = this.eObject2uuidMap.get(eObject);

		if (uuid == null)
		{
			uuid = this.getEObjectUuidCalculator().calculateUuid(eObject);

			assert uuid != null;

			this.registerEObject(eObject, uuid);
		}

		return uuid;
	}

	/**
	 * Delete the UUID information of the specified EObject and all its
	 * contained EObjects.
	 * 
	 * @param eObject
	 */
	public void unregisterEObjectWithContents(EObject eObject)
	{
		// TODO EObjects need to be deleted from the maps so the garbage
		// collector can dispose of them.

		// /*
		// * Unregister the EObject and all its contained elements
		// */
		// this.unregisterEObject(eObject);
		//
		// for (TreeIterator<EObject> it = eObject.eAllContents();
		// it.hasNext();)
		// {
		// this.unregisterEObject(it.next());
		// }
	}

	/**
	 * Delete the UUID information of the specified EObject, but not its
	 * contained EObjects.
	 * 
	 * @param eObject
	 */
	public void unregisterEObject(EObject eObject)
	{
		// TODO EObjects need to be deleted from the maps so the garbage
		// collector can dispose of them.

		// String uuid = this.eObject2uuidMap.remove(eObject);
		//
		// this.logger.info("unregisterEObject(" + eObject + "), uuid: " +
		// uuid);
		//
		// if (uuid != null)
		// {
		// this.uuid2eObjectMap.remove(uuid);
		// }
	}

	public EObjectUuidCalculator getEObjectUuidCalculator()
	{
		return this.eObjectUuidCalculator;
	}

	public void setEObjectUuidCalculator(EObjectUuidCalculator eObjectUuidCalculator)
	{
		assert eObjectUuidCalculator != null;

		this.eObjectUuidCalculator = eObjectUuidCalculator;
	}

	public Map<EObject, String> internalGeteObject2uuidMap()
	{
		return this.eObject2uuidMap;
	}

	public Map<String, EObject> internalGetUuid2eObjectMap()
	{
		return this.uuid2eObjectMap;
	}
}
