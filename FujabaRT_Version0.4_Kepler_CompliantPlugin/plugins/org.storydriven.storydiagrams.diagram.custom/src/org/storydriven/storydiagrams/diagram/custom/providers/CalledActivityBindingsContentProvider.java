package org.storydriven.storydiagrams.diagram.custom.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.storydriven.storydiagrams.activities.Activity;

public class CalledActivityBindingsContentProvider extends ArrayContentProvider {
	@Override
	public Object[] getElements(Object element) {
		if (element instanceof Activity) {
			Collection<EObject> bindings = new ArrayList<EObject>();

			bindings.addAll(((Activity) element).getInParameters());
			bindings.addAll(((Activity) element).getOutParameters());

			return bindings.toArray(new Object[bindings.size()]);
		}
		return new Object[0];
	}
}
