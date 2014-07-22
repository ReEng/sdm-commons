package de.mdelab.resourceSetSynchronizer;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ResourceSetSynchronizerPlugin implements BundleActivator
{
	private static ResourceSetSynchronizerPlugin	plugin;

	@Override
	public void start(BundleContext context) throws Exception
	{
		plugin = this;

		URL confURL = this.getClass().getResource("log4j.properties");
		PropertyConfigurator.configure(confURL);
	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
	}

	public static ResourceSetSynchronizerPlugin getDefault()
	{
		assert plugin != null;

		return plugin;
	}
}
