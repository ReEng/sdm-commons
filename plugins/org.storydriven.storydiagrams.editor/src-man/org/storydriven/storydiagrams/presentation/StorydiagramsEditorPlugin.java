package org.storydriven.storydiagrams.presentation;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.storydriven.core.provider.CoreEditPlugin;
import org.storydriven.storydiagrams.provider.StorydiagramsEditPlugin;

/**
 * This is the central singleton for the Storydiagrams editor plugin.
 */
public final class StorydiagramsEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 */
	public static final StorydiagramsEditorPlugin INSTANCE = new StorydiagramsEditorPlugin();

	/**
	 * Keep track of the singleton.
	 */
	private static Implementation plugin;

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			plugin = this;
		}
	}

	/**
	 * Create the instance.
	 */
	public StorydiagramsEditorPlugin() {
		super(new ResourceLocator[] { CoreEditPlugin.INSTANCE, StorydiagramsEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
}
