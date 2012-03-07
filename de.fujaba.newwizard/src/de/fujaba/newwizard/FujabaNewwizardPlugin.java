package de.fujaba.newwizard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.fujaba.newwizard.diagrams.DiagramInformation;
import de.fujaba.newwizard.diagrams.IDiagramInformation;

/**
 * The activator class controls the plug-in life cycle
 */
public class FujabaNewwizardPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String ID = "de.uni_paderborn.fujaba.muml.modelwizard"; //$NON-NLS-1$

	public static final String FUJABA_MODEL_EXTENSION = "fujaba";

	public static final String EXTENSION_POINT_ID = "de.fujaba.newwizard.diagraminformation";

	private Map<String, IDiagramInformation> editorIdToDiagramInformation;

	// The shared instance
	private static FujabaNewwizardPlugin plugin;

	/**
	 * @generated
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * The constructor
	 */
	public FujabaNewwizardPlugin() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		adapterFactory = createAdapterFactory();

		// Force reading the extension point
		getDiagramInformationMap();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		// linkConstraints = null;
		// initializers = null;
		plugin = null;
		super.stop(context);
	}

	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static FujabaNewwizardPlugin getDefault() {
		return plugin;
	}

	public void logError(String error) {
		logError(error, null);
	}

	public void logError(String error, Throwable throwable) {
		if (error == null && throwable != null) {
			error = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.ERROR, FujabaNewwizardPlugin.ID, IStatus.OK,
						error, throwable));
		debug(error, throwable);
	}

	public void logInfo(String message) {
		logInfo(message, null);
	}

	public void logInfo(String message, Throwable throwable) {
		if (message == null && throwable != null) {
			message = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.INFO, FujabaNewwizardPlugin.ID, IStatus.OK,
						message, throwable));
		debug(message, throwable);
	}

	private void debug(String message, Throwable throwable) {
		if (!isDebugging()) {
			return;
		}
		if (message != null) {
			System.err.println(message);
		}
		if (throwable != null) {
			throwable.printStackTrace();
		}
	}

	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(item));
		}
		return null;
	}

	public IDiagramInformation getDiagramInformation(String editorId) {
		return getDiagramInformationMap().get(editorId);
	}

	/**
	 * Gets (and lazily creates) the diagram information map (EditorId ->
	 * IDiagramInformation), by reading the extension point de.fujaba.newwizard.diagraminformation.
	 * 
	 * @return The map; never null.
	 */
	public Map<String, IDiagramInformation> getDiagramInformationMap() {
		if (editorIdToDiagramInformation == null) {
			// Create the map, in case it does not exist yet.
			editorIdToDiagramInformation = doCreateDiagramInformationMap();
		}
		return editorIdToDiagramInformation;
	}

	private Map<String, IDiagramInformation> doCreateDiagramInformationMap() {
		Map<String, IDiagramInformation> map = new HashMap<String, IDiagramInformation>();
		IConfigurationElement[] config = RegistryFactory.getRegistry()
				.getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement editorElements : config) {
			// Read editorId
			String editorId = editorElements.getAttribute("editorId");
			if (editorId == null) {
				continue;
			}

			// Read Diagram Information from extension Point
			IConfigurationElement information = null;
			if ("editor".equals(editorElements.getName())) {
				IConfigurationElement[] informationElements = editorElements
						.getChildren("information");
				// The lower bound is one, but we want to be safe
				if (informationElements.length > 0) {
					information = informationElements[0];
				}
			}
			if (information == null) {
				continue;
			}

			// Fill DiagramInformation datastructure
			IDiagramInformation diagramInformation = new DiagramInformation(
					information);

			// Put this entry into the map
			map.put(editorId, diagramInformation);
		}
		return map;
	}
}
