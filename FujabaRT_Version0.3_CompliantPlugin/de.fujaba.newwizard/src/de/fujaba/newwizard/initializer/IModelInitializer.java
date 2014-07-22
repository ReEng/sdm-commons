package de.fujaba.newwizard.initializer;

import de.fujaba.modelinstance.RootNode;

/**
 * Interface that can be overridden to initialize a Fujaba Model after the
 * newwizard created it.
 * 
 * @author bingo
 * 
 */
public interface IModelInitializer {

	/**
	 * Initializes the RootNode (e.g. adds categories to it).
	 * 
	 * @param rootNode
	 *            The RootNode to initialize.
	 */
	void initialize(RootNode rootNode);
}
