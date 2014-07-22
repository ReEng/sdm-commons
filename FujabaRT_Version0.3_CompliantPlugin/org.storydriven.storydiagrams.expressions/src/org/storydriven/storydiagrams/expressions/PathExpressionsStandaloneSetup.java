
package org.storydriven.storydiagrams.expressions;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PathExpressionsStandaloneSetup extends PathExpressionsStandaloneSetupGenerated{

	public static void doSetup() {
		new PathExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

