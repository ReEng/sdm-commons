package de.mdelab.resourceSetSynchronizer;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceFilter
{
	public boolean synchronizeResource(Resource resource);
}
