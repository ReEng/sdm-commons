package org.storydriven.storydiagrams.diagram.interpreter.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class ResourceContentProvider extends ArrayContentProvider implements ITreeContentProvider {
	@Override
	public Object[] getElements(Object element) {
		return getChildren(element);
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof Resource) {
			return super.getElements(((Resource) element).getContents());
		}
		if (element instanceof EObject) {
			return super.getElements(((EObject) element).eContents());
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			if (((EObject) element).eContainer() != null) {
				return ((EObject) element).eContainer();
			} else {
				return ((EObject) element).eResource();
			}
		}
		return null;
	}
}
