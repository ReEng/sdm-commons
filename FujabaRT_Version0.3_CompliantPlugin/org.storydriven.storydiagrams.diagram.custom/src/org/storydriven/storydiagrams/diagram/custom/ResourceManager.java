package org.storydriven.storydiagrams.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.storydriven.core.NamedElement;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;

public class ResourceManager {
	public static final String SOURCE_TYPES = "http://www.storydriven.org/storydiagrams/types"; //$NON-NLS-1$

	private static final Comparator<EClassifier> COMPARATOR_ECORE = new Comparator<EClassifier>() {
		@Override
		public int compare(EClassifier a, EClassifier b) {
			String nameA = String.valueOf(a.getName());
			String nameB = String.valueOf(b.getName());
			return nameA.compareTo(nameB);
		}
	};
	private static final Comparator<NamedElement> COMPARATOR_STORIES = new Comparator<NamedElement>() {
		@Override
		public int compare(NamedElement a, NamedElement b) {
			String nameA = String.valueOf(a.getName());
			String nameB = String.valueOf(b.getName());
			return nameA.compareTo(nameB);
		}
	};

	private static final Map<Activity, ResourceManager> instances = new LinkedHashMap<Activity, ResourceManager>();

	private final Collection<EPackage> ePackages;
	private final List<EClass> eClasses;
	private final List<EDataType> eDataTypes;
	private final List<Activity> activities;

	private Activity activity;

	private Adapter resourceSetAdapter;

	private ResourceManager(Activity activity) {
		this.activity = activity;

		ePackages = new HashSet<EPackage>();
		eClasses = new ArrayList<EClass>();
		eDataTypes = new ArrayList<EDataType>();
		activities = new ArrayList<Activity>();

		// add resource set listener
		registerListeners();

		recollect();
	}

	private void registerListeners() {
		resourceSetAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				recollect();
			}
		};
		activity.eResource().getResourceSet().eAdapters().add(resourceSetAdapter);
		activity.eAdapters().add(resourceSetAdapter);
		EAnnotation annotation = activity.getAnnotation(SOURCE_TYPES);
		if (annotation != null) {
			annotation.eAdapters().add(resourceSetAdapter);
		}
	}

	public void recollect() {
		recollectActivities();
		recollectEcore();
	}

	private void recollectActivities() {
		activities.clear();

		// search for activities
		EClassifier type = ActivitiesPackage.Literals.ACTIVITY;
		if (activity != null && activity.eResource() != null && activity.eResource().getResourceSet() != null) {
			ResourceSet resourceSet = activity.eResource().getResourceSet();
			for (Resource resource : resourceSet.getResources()) {
				for (EObject element : getReachableObjectsOfType(resource, type)) {
					if (element instanceof Activity && !activities.contains(element)) {
						activities.add((Activity) element);
					}
				}
			}

			Collections.sort(activities, COMPARATOR_STORIES);
		}
	}

	private static Collection<EObject> getReachableObjectsOfType(Resource resource, EClassifier type) {
		Deque<EObject> queue = new LinkedList<EObject>();
		Collection<EObject> visited = new HashSet<EObject>();
		Collection<EObject> result = new ArrayList<EObject>();

		// iterate over resource set
		TreeIterator<?> i = EcoreUtil.getAllContents(resource, true);
		while (i.hasNext()) {
			Object object = i.next();
			if (object instanceof EObject) {
				collectReachableObjectsOfType(visited, queue, result, (EObject) object, type);
				i.prune();
			}
		}

		while (!queue.isEmpty()) {
			EObject element = queue.removeFirst();
			collectReachableObjectsOfType(visited, queue, result, element, type);
		}

		return result;
	}

	private static void collectReachableObjectsOfType(Collection<EObject> visited, Deque<EObject> queue,
			Collection<EObject> result, EObject element, EClassifier type) {
		if (visited.add(element)) {
			if (type.isInstance(element)) {
				result.add(element);
			}

			// avoid pulling all EcorePackage's meta data
			if (!EcorePackage.Literals.EOBJECT.equals(element)) {
				EClass eClass = element.eClass();
				for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
					if (!feature.isDerived()) {
						if (feature instanceof EReference) {
							EReference reference = (EReference) feature;
							if (reference.isMany()) {
								for (Object object : (Collection<?>) element.eGet(reference)) {
									queue.add((EObject) object);
								}
							} else {
								EObject object = (EObject) element.eGet(reference);

								// avoid pulling all EcorePackage's meta data
								if (object != null
										&& (!EcorePackage.eINSTANCE.equals(object)
												|| !EcorePackage.Literals.ECLASSIFIER__EPACKAGE.equals(feature) || element instanceof EClass)) {
									queue.addLast(object);
								}
							}
						} else if (FeatureMapUtil.isFeatureMap(feature)) {
							for (FeatureMap.Entry entry : (FeatureMap) element.eGet(feature)) {
								if (entry.getEStructuralFeature() instanceof EReference && entry.getValue() != null) {
									queue.addLast((EObject) entry.getValue());
								}
							}
						}
					}
				}
			}
		}
	}

	private void recollectEcore() {
		ePackages.clear();
		eClasses.clear();
		eDataTypes.clear();

		EAnnotation annotation = activity.getAnnotation(SOURCE_TYPES);
		if (annotation != null) {
			// collect directly referenced packages
			for (EObject reference : annotation.getReferences()) {
				if (reference instanceof EPackage) {
					ePackages.add((EPackage) reference);
				}
			}

			// collect nsUris
			for (String nsUri : annotation.getDetails().keySet()) {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri);
				if (ePackage != null) {
					ePackages.add(ePackage);
				} else {
					String message = String.format("The EPackage with the nsURI '%1s' could not be found!", nsUri);
					Activator.getInstance().logWarning(message);
				}
			}
		}

		// search
		for (EPackage ePackage : ePackages) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EDataType) {
					eDataTypes.add((EDataType) eClassifier);
				} else if (eClassifier instanceof EClass) {
					eClasses.add((EClass) eClassifier);
				}
			}
		}

		Collections.sort(eClasses, COMPARATOR_ECORE);
		Collections.sort(eDataTypes, COMPARATOR_ECORE);
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public List<EClass> getEClasses() {
		return eClasses;
	}

	public List<EDataType> getEDataTypes() {
		return eDataTypes;
	}

	public static ResourceManager get(Activity activity) {
		ResourceManager manager = instances.get(activity);
		if (manager == null) {
			manager = new ResourceManager(activity);
			instances.put(activity, manager);
		}
		return manager;
	}

	public static void dispose(Activity activity) {
		ResourceManager manager = instances.get(activity);
		if (manager != null) {
			manager.dispose();
		}

		instances.remove(activity);
	}

	public Collection<EPackage> getAllEPackages() {
		return ePackages;
	}

	private void dispose() {
		activity.eResource().getResourceSet().eAdapters().remove(resourceSetAdapter);
		activity.eAdapters().remove(resourceSetAdapter);
		EAnnotation annotation = activity.getAnnotation(SOURCE_TYPES);
		if (annotation != null) {
			annotation.eAdapters().remove(resourceSetAdapter);
		}
		activity.eResource().getResourceSet().eAdapters().remove(resourceSetAdapter);
	}

	public static boolean isReferencing(EObject element, EPackage ePackage) {
		if (element instanceof ObjectVariable) {
			return isReferencing(((ObjectVariable) element).getClassifier(), ePackage);
		}
		if (element instanceof PrimitiveVariable) {
			return isReferencing(((PrimitiveVariable) element).getClassifier(), ePackage);
		}
		if (element instanceof LinkVariable) {
			return isReferencing(((LinkVariable) element).getSourceEnd(), ePackage)
					|| isReferencing(((LinkVariable) element).getTargetEnd(), ePackage);
		}

		if (element instanceof EParameter) {
			return isReferencing(((EParameter) element).getEType(), ePackage);
		}

		if (element instanceof EReference) {
			return isReferencing(((EReference) element).getEContainingClass(), ePackage);
		}

		if (element instanceof EClassifier) {
			return isReferencing(((EClassifier) element).getEPackage(), ePackage);
		}

		if (element instanceof EPackage) {
			return ePackage.equals(element);
		}

		return false;
	}
}
