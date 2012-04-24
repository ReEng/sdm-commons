package org.storydriven.storydiagrams.diagram.custom.providers;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.storydriven.storydiagrams.activities.Activity;

public class CalledActivitiesContentProvider extends ArrayContentProvider implements ITreeContentProvider {
	@Override
	public Object[] getElements(Object element) {
		if (element instanceof Collection<?>) {
			Collection<Object> result = new HashSet<Object>();
			for (Object activity : (Collection<?>) element) {
				if (activity instanceof Activity) {
					result.add(((Activity) activity).eResource());
				}
			}
			return result.toArray(new Object[result.size()]);
		}
		return super.getElements(element);
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof Resource) {
			Collection<EObject> contents = ((Resource) element).getContents();
			return contents.toArray(new Object[contents.size()]);
		}
		if (element instanceof EObject) {
			Collection<EObject> contents = ((EObject) element).eContents();
			return contents.toArray(new Object[contents.size()]);
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			return ((EObject) element).eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return element instanceof Resource || element instanceof EObject;
	}

}
