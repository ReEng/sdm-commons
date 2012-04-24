package org.storydriven.storydiagrams.diagram.custom.providers;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;

public class ActivitiesContentProvider extends ArrayContentProvider implements ITreeContentProvider {
	@Override
	public Object[] getElements(Object element) {
		return getChildren(element);
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof Activity) {
			EAnnotation annotation = ((Activity) element).getAnnotation(ResourceManager.SOURCE_TYPES);
			return getChildren(annotation);
		}
		if (element instanceof EAnnotation) {
			Collection<EPackage> children = new HashSet<EPackage>();

			// collect registered ePackages
			EMap<String, String> nsUris = ((EAnnotation) element).getDetails();
			for (String nsUri : nsUris.keySet()) {
				String value = nsUris.get(nsUri);
				if (Boolean.valueOf(value)) {
					EPackage registered = EPackage.Registry.INSTANCE.getEPackage(nsUri);
					if (registered != null) {
						children.add(registered);
					}
				}
			}

			// collect referenced ePackages
			for (EObject reference : ((EAnnotation) element).getReferences()) {
				if (reference instanceof EPackage) {
					children.add((EPackage) reference);
				}
			}

			return children.toArray(new EPackage[children.size()]);
		}
		if (element instanceof EPackage) {
			Collection<EClassifier> children = ((EPackage) element).getEClassifiers();

			return children.toArray(new EClassifier[children.size()]);
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EClassifier) {
			return ((EClassifier) element).getEPackage();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return element instanceof EPackage;
	}
}
