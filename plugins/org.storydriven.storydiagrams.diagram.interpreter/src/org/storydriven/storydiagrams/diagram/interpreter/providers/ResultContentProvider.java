package org.storydriven.storydiagrams.diagram.interpreter.providers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class ResultContentProvider extends ArrayContentProvider implements ITreeContentProvider {
	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof EClass) {
			return super.getElements(((EClass) element).getEAllAttributes());
		}
		return new Object[0];
	}

	@Override
	public Object[] getElements(Object element) {
		if (element instanceof EObject) {
			return new Object[] { ((EObject) element).eClass() };
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EAttribute) {
			return ((EAttribute) element).getEContainingClass();
		}
		return null;
	}
}
