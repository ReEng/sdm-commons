package org.storydriven.storydiagrams.ui.interpreter.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

public final class EPackageUtil {
	private EPackageUtil() {
		// hide constructor
	}

	public static Collection<EPackage> getEPackages() {
		Collection<EPackage> ePackages = new LinkedHashSet<EPackage>();

		Registry registry = EPackage.Registry.INSTANCE;

		// workaround to include packages that dynamically add other packages when loaded
		Collection<? extends String> keys = registry.keySet();
		Collection<String> set = new HashSet<String>(keys);
		load(set);
		while (keys.size() != set.size()) {
			set = Collections.unmodifiableCollection(keys);
			load(set);
			// System.out.println("had to run again...");
		}

		// collect packages
		for (String key : set) {
			EPackage ePackage = registry.getEPackage(key);
			if (ePackage != null) {
				ePackages.add(ePackage);
			}
		}

		return ePackages;
	}

	private static void load(Collection<String> keys) {
		Registry registry = EPackage.Registry.INSTANCE;

		for (String key : keys) {
			registry.getEPackage(key);
		}
	}
}
