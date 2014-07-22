package de.mdelab.resourceSetSynchronizer;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

public class EObjectUuidCalculator
{
	public String calculateUuid(EObject eObject)
	{
		return UUID.randomUUID().toString();
	}
}
