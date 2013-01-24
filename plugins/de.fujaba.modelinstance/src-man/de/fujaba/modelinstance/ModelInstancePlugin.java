package de.fujaba.modelinstance;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.fujaba.modelinstance.categories.ModelElementCategoryRegistry;

public class ModelInstancePlugin implements BundleActivator {

	private static ModelInstancePlugin instance;
	private static BundleContext context;
	private ModelElementCategoryRegistry modelElementCategoryRegistry;
	
	private String versionInformation;
	
	static BundleContext getContext() {
		return context;
	}

	public static ModelInstancePlugin getInstance() {
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ModelInstancePlugin.instance = this;
		ModelInstancePlugin.context = bundleContext;
		
		modelElementCategoryRegistry = new ModelElementCategoryRegistry(true);
		versionInformation = buildVersionInformation();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ModelInstancePlugin.instance = null;
		ModelInstancePlugin.context = null;
		modelElementCategoryRegistry = null;
		versionInformation = null;
	}
	

	public ModelElementCategoryRegistry getModelElementCategoryRegistry() {
		return modelElementCategoryRegistry;
	}
	

	public static String getVersionInformation() {
		return instance.versionInformation;
	}

	
	
	private String buildVersionInformation() {
		StringBuilder builder = new StringBuilder();
		IConfigurationElement[] topElements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
						"de.fujaba.modelinstance.version");

		for (IConfigurationElement artefact : topElements) {
			String name = artefact.getAttribute("name");
			String version = artefact.getAttribute("version");
			builder.append(name);
			builder.append(" version ");
			builder.append(version);
			for (IConfigurationElement change : artefact.getChildren()) {
//				String committer = trim(change.getAttribute("committer"), "LastChangedBy:");
//				String date = trim(change.getAttribute("date"), "LastChangedDate:");
				String revision = trim(change.getAttribute("revision"), "LastChangedRevision:");
				builder.append(" (");
				builder.append('r');
				builder.append(revision);
				builder.append(')');
			}
		}

		return builder.toString();
	}

	private String trim(String str, String keyword) {
		if (str.charAt(0) == '$') {
			str = str.substring(1);
		}
		if (str.charAt(str.length()-1) =='$') {
			str = str.substring(0, str.length() - 2);
		}
		str = str.trim();
		if (str.startsWith(keyword)) {
			str = str.substring(keyword.length());
		}
		return str.trim();
	}

}
