package org.storydriven.storydiagrams.diagram.custom.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

public final class BoundUtil {
	private BoundUtil() {
		// hide constructor
	}

	public static Map<String, EClassifier> getBoundObjects(EObject element) {
		Map<String, EClassifier> map = new LinkedHashMap<String, EClassifier>();

		// collect from activity node
		if (element instanceof ActivityNode) {
			collect(map, (ActivityNode) element);
		}

		// collect from activity edge
		if (element instanceof ActivityEdge) {
			collect(map, (ActivityEdge) element);
		}

		// collect from activity
		Activity activity = ActivityUtil.getActivity(element);
		if (activity != null) {
			collect(map, (Activity) activity);
		}

		return map;
	}

	private static void collect(Map<String, EClassifier> map, ActivityNode node) {
		// collect from story node
		if (node instanceof StoryNode) {
			collect(map, ((StoryNode) node).getStoryPattern());
		}

		// collect antecedents
		for (ActivityEdge incoming : node.getIncomings()) {
			collect(map, incoming);
		}
	}

	private static void collect(Map<String, EClassifier> map, StoryPattern pattern) {
		// collect all elements from contained patterns
		for (StoryPattern childPattern : pattern.getContainedPatterns()) {
			collect(map, childPattern);
		}

		// only collect when pattern could have been matched
		if (!BindingSemantics.NEGATIVE.equals(pattern.getBindingSemantics())) {
			// collect object variables
			for (AbstractVariable variable : pattern.getVariables()) {
				// only collect unbound elements
				if (!BindingState.BOUND.equals(variable.getBindingState())) {
					if (variable instanceof ObjectVariable) {
						// only collect when variable could have been matched
						if (!BindingSemantics.NEGATIVE.equals(((ObjectVariable) variable).getBindingSemantics())) {
							collect(map, variable);
						}
					} else {
						collect(map, variable);
					}
				}
			}
		}
	}

	private static void collect(Map<String, EClassifier> map, AbstractVariable variable) {
		collect(map, variable.getName(), variable.getType());
	}

	private static void collect(Map<String, EClassifier> map, Activity activity) {
		// collect input parameters
		for (EParameter parameter : activity.getInParameters()) {
			collect(map, parameter.getName(), parameter.getEType());
		}
	}

	private static void collect(Map<String, EClassifier> map, String name, EClassifier classifier) {
		if (!map.containsKey(name)) {
			map.put(name, classifier);
		} else {
			System.out.println("\talready bound something for key '" + name + "'!");
		}
	}

	private static void collect(Map<String, EClassifier> map, ActivityEdge incoming) {
		collect(map, incoming.getSource());
	}
}
