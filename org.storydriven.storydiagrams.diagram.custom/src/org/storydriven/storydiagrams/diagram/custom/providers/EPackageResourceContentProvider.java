package org.storydriven.storydiagrams.diagram.custom.providers;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;

public class EPackageResourceContentProvider extends BaseWorkbenchContentProvider {
	private ResourceSet resourceSet;

	public EPackageResourceContentProvider(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof IFile) {
			String pathName = ((IFile) element).getFullPath().toString();
			URI uri = URI.createPlatformResourceURI(pathName, true);
			try {
				Resource resource = resourceSet.getResource(uri, true);

				// search for an ePackage
				TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
				while (it.hasNext()) {
					Object object = (Object) it.next();
					if (object instanceof EPackage) {
						// there are ePackages
						Collection<EObject> contents = resource.getContents();
						return contents.toArray(new Object[contents.size()]);
					}
				}
			} catch (RuntimeException e) {
				System.err.println(e);
			}
		}
		if (element instanceof EObject) {
			Collection<EObject> contents = ((EObject) element).eContents();
			return contents.toArray(new Object[contents.size()]);
		}
		return super.getChildren(element);
	}
}
