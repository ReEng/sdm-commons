/*
 * generated by Xtext
 */
package org.storydriven.storydiagrams.expressions.common.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ExpressionsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.storydriven.storydiagrams.expressions.common.ui.internal.ExpressionsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.storydriven.storydiagrams.expressions.common.ui.internal.ExpressionsActivator.getInstance().getInjector("org.storydriven.storydiagrams.expressions.common.Expressions");
	}
	
}
