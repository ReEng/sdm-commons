package org.storydriven.storydiagrams.diagram.providers;

import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_ModifyingStoryNode_2007(ModifyingStoryNode instance) {
		try {
			StoryPattern newInstance_0_0 = PatternsFactory.eINSTANCE.createStoryPattern();
			instance.setOwnedRule(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_MatchingStoryNode_2008(MatchingStoryNode instance) {
		try {
			MatchingPattern newInstance_0_0 = PatternsFactory.eINSTANCE.createMatchingPattern();
			instance.setOwnedPattern(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ModifyingStoryNode_3007(ModifyingStoryNode instance) {
		try {
			StoryPattern newInstance_0_0 = PatternsFactory.eINSTANCE.createStoryPattern();
			instance.setOwnedRule(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = StorydiagramsDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			StorydiagramsDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
