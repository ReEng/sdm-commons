package de.fujaba.newwizard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;
import de.fujaba.newwizard.diagrams.DiagramInformation;
import de.fujaba.newwizard.diagrams.IDiagramInformation;
import de.fujaba.newwizard.initializer.IModelInitializer;

/**
 * The activator class controls the plug-in life cycle
 */
public class FujabaNewwizardPlugin extends AbstractUIPlugin {
	
	private List<IModelInitializer> modelInitializers;

	// The plug-in ID
	public static final String ID = "de.uni_paderborn.fujaba.muml.modelwizard"; //$NON-NLS-1$

	public static final String FUJABA_MODEL_EXTENSION = "fujaba";

	public static final String DIAGRAM_INFORMATION_EXTENSION_POINT_ID = "de.fujaba.newwizard.diagraminformation";
	public static final String MODEL_INITIALIZER_EXTENSION_POINT_ID = "de.fujaba.newwizard.modelinitializer";

	private Map<String, IDiagramInformation> editorIdToDiagramInformation;

	// The shared instance
	private static FujabaNewwizardPlugin plugin;

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
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		// Force reading the extension point
		getDiagramInformationMap();
		getModelInitializers();
	}

	private Collection<IModelInitializer> getModelInitializers() {
		if (modelInitializers == null) {
			modelInitializers = new ArrayList<IModelInitializer>();
			IConfigurationElement[] config = RegistryFactory.getRegistry()
					.getConfigurationElementsFor(
							MODEL_INITIALIZER_EXTENSION_POINT_ID);
			for (IConfigurationElement element : config) {
				Object object = null;
				try {
					object = element.createExecutableExtension("initializer");
					if (object instanceof IModelInitializer) {
						modelInitializers.add((IModelInitializer) object);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			
				
			}
		}
		return modelInitializers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		// linkConstraints = null;
		// initializers = null;
		plugin = null;
		super.stop(context);
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

	public IDiagramInformation getDiagramInformation(String editorId) {
		return getDiagramInformationMap().get(editorId);
	}

	/**
	 * Gets (and lazily creates) the diagram information map (EditorId ->
	 * IDiagramInformation), by reading the extension point
	 * de.fujaba.newwizard.diagraminformation.
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
				.getConfigurationElementsFor(
						DIAGRAM_INFORMATION_EXTENSION_POINT_ID);

		for (IConfigurationElement element : config) {

			// Fill DiagramInformation datastructure
			IDiagramInformation diagramInformation = new DiagramInformation(
					element);

			// Read editorId
			String editorId = diagramInformation.getEditorId();

			// Put this entry into the map
			if (editorId != null) {
				map.put(editorId, diagramInformation);
			}
		}
		return map;
	}

	public void createModel(IFile newFile,
			TransactionalEditingDomain editingDomain) {
		DiagramEditorUtil.setCharset(newFile);
		ResourceSet resourceSet = editingDomain.getResourceSet();
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		affectedFiles.add(newFile);
		URI diagramModelURI = URI.createPlatformResourceURI(newFile
				.getFullPath().toString(), true);

		final Resource modelResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Initializing diagram contents", affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				RootNode rootNode = ModelinstanceFactory.eINSTANCE
						.createRootNode();

				// Let extensions initialize the model
				initializeModel(rootNode);

				modelResource.getContents().add(rootNode);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			modelResource.save(DiagramEditorUtil.getSaveOptions());

		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model", e); //$NON-NLS-1$
		} catch (IOException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		}
	}

	private void initializeModel(final RootNode rootNode) {
		for (final IModelInitializer initializer : getModelInitializers()) {
			SafeRunner.run(new ISafeRunnable() {

				@Override
				public void handleException(Throwable exception) {
					// TODO Log exception
				}

				@Override
				public void run() throws Exception {
					initializer.initialize(rootNode);
				}
				
			});
		}
	}

}
