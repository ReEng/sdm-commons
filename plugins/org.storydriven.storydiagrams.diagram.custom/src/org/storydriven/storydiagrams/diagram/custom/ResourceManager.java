package org.storydriven.storydiagrams.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.NamedElement;
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

	private static Map<Activity, ResourceManager> instances = new HashMap<Activity, ResourceManager>();

	private final Collection<EPackage> ePackages;
	private final List<EClass> eClasses;
	private final List<EDataType> eDataTypes;
	private final List<Activity> activities;

	private Activity activity;

	private Adapter resourceSetAdapter;

	public ResourceManager(Activity activity) {
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
				if (msg.getNewValue() instanceof Resource || msg.getOldValue() instanceof Resource) {
					// resource has been loaded
					recollectActivities();
				} else if (msg.getNewValue() instanceof Entry<?, ?> || msg.getOldValue() instanceof Entry<?, ?>) {
					// entry has been added or deleted on annotation
					recollectEcore();
				} else if (msg.getNewValue() instanceof EAnnotation || msg.getOldValue() instanceof EAnnotation) {
					// annotation has been added or deleted
					EAnnotation annotation = activity.getAnnotation(SOURCE_TYPES);
					if (annotation != null) {
						annotation.eAdapters().add(resourceSetAdapter);
					}
					recollectEcore();
				}
			}
		};
		activity.eResource().getResourceSet().eAdapters().add(resourceSetAdapter);
		activity.eAdapters().add(resourceSetAdapter);
		EAnnotation annotation = activity.getAnnotation(SOURCE_TYPES);
		if (annotation != null) {
			annotation.eAdapters().add(resourceSetAdapter);
		}
	}

	private void recollect() {
		recollectActivities();
		recollectEcore();
	}

	private void recollectActivities() {
		activities.clear();

		// search for activities
		ResourceSet resourceSet = activity.eResource().getResourceSet();
		TreeIterator<Object> it = EcoreUtil.getAllContents(resourceSet, true);
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if (object instanceof Activity) {
				activities.add((Activity) object);
			}
		}

		Collections.sort(activities, COMPARATOR_STORIES);

		// TODO
		System.out.println("Activities: " + activities.size());
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

		// TODO
		System.out.println("EPackages: " + ePackages.size());
		System.out.println("EClasses: " + eClasses.size());
		System.out.println("EDataTypes: " + eDataTypes.size());
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
		activity.eResource().getResourceSet().eAdapters().add(resourceSetAdapter);
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

		if (element instanceof EReference) {
			isReferencing(((EReference) element).getEContainingClass(), ePackage);
		}

		if (element instanceof EClassifier) {
			return ePackage.equals(((EClassifier) element).getEPackage());
		}

		return false;
	}
}
