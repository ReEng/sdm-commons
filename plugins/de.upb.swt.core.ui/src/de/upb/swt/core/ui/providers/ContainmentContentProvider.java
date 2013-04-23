package de.upb.swt.core.ui.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class ContainmentContentProvider extends ArrayContentProvider implements ITreeContentProvider {
	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public Object[] getChildren(Object element) {
		return getElements(element);
	}

	@Override
	public Object[] getElements(Object element) {
		if (element instanceof ResourceSet) {
			return super.getElements(((ResourceSet) element).getResources());
		}
		if (element instanceof Resource) {
			return super.getElements(((Resource) element).getContents());
		}
		if (element instanceof EObject) {
			return super.getElements(((EObject) element).eContents());
		}
		return super.getElements(element);
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			EObject container = ((EObject) element).eContainer();
			if (container != null) {
				return container;
			} else {
				return ((EObject) element).eResource();
			}
		}
		return null;
	}
}
