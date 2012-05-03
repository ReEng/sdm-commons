package org.storydriven.storydiagrams.diagram.custom.util;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.TypedElement;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

public final class BoundUtil {
	private BoundUtil() {
		// hide constructor
	}

	public static void collect(ActivityEdge incoming) {
		Map<String, EClassifier> map = new LinkedHashMap<String, EClassifier>();
		collect(map, incoming.getSource());
	}

	public static Map<String, EClassifier> getBoundObjects(EObject element) {
		if (element instanceof ActivityNode) {
			return getBoundObjects((ActivityNode) element);
		}
		if (element instanceof ActivityEdge) {
			return getBoundObjects((ActivityEdge) element);
		}
		return Collections.emptyMap();
	}

	public static Map<String, EClassifier> getBoundObjects(ActivityNode node) {
		Map<String, EClassifier> map = new LinkedHashMap<String, EClassifier>();

		for (ActivityEdge incoming : node.getIncomings()) {
			collect(map, incoming);
		}

		return map;
	}

	private static void collect(Map<String, EClassifier> map, ActivityEdge incoming) {
		collect(map, incoming.getSource());
	}

	private static void collect(Map<String, EClassifier> map, ActivityNode node) {
		if (node instanceof StoryNode) {
			collect(map, ((StoryNode) node).getStoryPattern());
		}
	}

	private static void collect(Map<String, EClassifier> map, StoryPattern pattern) {
		// collect all elements from contained patterns
		for (StoryPattern childPattern : pattern.getContainedPatterns()) {
			collect(map, childPattern);
		}

		// collect object variables
		for (AbstractVariable variable : pattern.getVariables()) {
			collect(map, variable);
		}
	}

	private static void collect(Map<String, EClassifier> map, AbstractVariable variable) {
		if (variable instanceof TypedElement) {
			if (map.containsKey(variable.getName())) {
				System.out.println("the variable name exists already: " + variable.getName());
			} else {
				map.put(variable.getName(), variable.getType());
			}
		}
	}
}
