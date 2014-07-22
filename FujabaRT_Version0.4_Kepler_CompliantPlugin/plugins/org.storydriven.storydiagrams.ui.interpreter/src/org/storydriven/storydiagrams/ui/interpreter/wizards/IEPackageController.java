package org.storydriven.storydiagrams.ui.interpreter.wizards;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IEPackageController {
	Collection<EPackage> getAllEPackages();

	Collection<Object> getAddedResources();

	AdapterFactory getAdapterFactory();

	ResourceSet getResourceSet();

	Map<EParameter, Object> getBindings();
}
