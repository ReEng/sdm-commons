package de.mdelab.resourceSetSynchronizer.protocols.synchronization;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This class contains several static helper methods needed for the
 * synchronization protocol.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SynchronizationUtils
{
	/**
	 * Compute the set of resources the specified resource requires, i.e. those
	 * resource to which the specified resource holds references.
	 * 
	 * @param resource
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Set<Resource> computeRequiredResources(Resource resource)
	{
		/*
		 * Examine all EObjects in the resource.
		 */
		TreeIterator<EObject> it = resource.getAllContents();

		Set<Resource> requiredResources = new HashSet<Resource>();

		while (it.hasNext())
		{
			EObject eObject = it.next();

			/*
			 * Examine all references of the eObject
			 */
			for (EReference ref : eObject.eClass().getEAllReferences())
			{
				if (!ref.isMany())
				{
					EObject referencedEObject = (EObject) eObject.eGet(ref);

					if (referencedEObject != null)
					{
						Resource referencedResource = referencedEObject.eResource();

						/*
						 * Check if the referenced resource is a different
						 * resource a not contained in the package registry.
						 */
						if (referencedResource != null && referencedResource != resource
								&& !isContainedInPackageRegistry(referencedResource))
						{
							requiredResources.add(referencedResource);
						}
					}
				}
				else
				{
					for (EObject referencedEObject : (EList<EObject>) eObject.eGet(ref))
					{
						if (referencedEObject.eResource() != resource)
						{
							Resource referencedResource = referencedEObject.eResource();

							/*
							 * Check if the referenced resource is a different
							 * resource a not contained in the package registry.
							 */
							if (referencedResource != null && referencedResource != resource
									&& !isContainedInPackageRegistry(referencedResource))
							{
								requiredResources.add(referencedResource);
							}
						}
					}
				}
			}

			/*
			 * Check if the eObject's EClass is contained in a different
			 * resource that is not contained in the package registry.
			 */
			EClass eClass = eObject.eClass();

			Resource referencedResource = eClass.eResource();

			if (referencedResource != null && referencedResource != resource && !isContainedInPackageRegistry(referencedResource))
			{
				requiredResources.add(referencedResource);
			}
		}

		return requiredResources;
	}

	/**
	 * Check if the specified resource is contained in the EMF package registry.
	 * 
	 * @param resource
	 * @return
	 */
	private static boolean isContainedInPackageRegistry(Resource resource)
	{
		assert resource != null;

		if (resource.getResourceSet() == null)
		{
			return Registry.INSTANCE.containsKey(resource.getURI().toString());
		}
		else
		{

			return resource.getResourceSet().getPackageRegistry().containsKey(resource.getURI().toString());
		}
	}
}
