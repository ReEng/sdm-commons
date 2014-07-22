package de.mdelab.resourceSetSynchronizer.protocols.synchronization;

/**
 * Enumeration of all messages of the synchronization protocol.
 * 
 * @author Stephan Hildebrandt.
 * 
 */
public enum SynchronizationProtocolMessagesEnum
{
	/*
	 * Synchronize the resource sets contents after connecting two synchronizer
	 * adapters.
	 */
	SYNC_INITIAL_RESOURCE_SET_CONTENTS,

	/*
	 * A resource was added to the resource set.
	 */
	RESOURCE_ADDED,

	/*
	 * An EObject was added to a resource as a root object.
	 */
	EOBJECT_ADDED_TO_RESOURCE,

	/*
	 * An EObject was removed from the resource's root objects.
	 */
	EOBJECT_REMOVED_FROM_RESOURCE,

	/*
	 * Request an EObject for a UUID.
	 */
	GET_EOBJECT,

	/*
	 * Register a synchronizer adapter with another adapter.
	 */
	REGISTER_CLIENT,

	/*
	 * An object was added to a multi-valued feature.
	 */
	OBJECT_ADDED_TO_FEATURE,

	/*
	 * Multiple objects were added to a multi-valued feature.
	 */
	OBJECTS_ADDED_TO_FEATURE,

	/*
	 * An object was removed from a multi-valued feature.
	 */
	OBJECT_REMOVED_FROM_FEATURE,

	/*
	 * Multiple objects were removed from a multi-valued feature.
	 */
	OBJECTS_REMOVED_FROM_FEATURE,

	/*
	 * The value of a feature was set.
	 */
	FEATURE_SET,

	/*
	 * A feature was unset.
	 */
	FEATURE_UNSET,

	/*
	 * The URI of a resource was changed.
	 */
	RESOURCE_URI_CHANGED,
	DISCONNECT_CLIENT,
	GET_CONNECTED_SYNCHRONIZER_ADAPTERS
}
