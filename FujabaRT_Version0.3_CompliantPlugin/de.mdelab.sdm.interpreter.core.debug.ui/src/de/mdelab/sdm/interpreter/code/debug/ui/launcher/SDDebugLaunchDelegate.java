package de.mdelab.sdm.interpreter.code.debug.ui.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugUiConstants;

/**
 * 
 * @author Patrick Rein
 * 
 */
public abstract class SDDebugLaunchDelegate<StoryDiagramElement extends EObject, Activity> implements ILaunchConfigurationDelegate
{

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException
	{
		if (ILaunchManager.RUN_MODE.equals(mode) || ILaunchManager.DEBUG_MODE.equals(mode))
		{
			String serverAddress = configuration.getAttribute(SDDebugUiConstants.ATTR_SERVER_ADDRESS, "");
			String serverPortString = configuration.getAttribute(SDDebugUiConstants.ATTR_SERVER_PORT, "");

			int serverPortNumber = this.getServerDefaultPort();

			if (!serverPortString.equals(""))
			{
				serverPortNumber = Integer.parseInt(serverPortString);
			}

			SDDebugTarget<StoryDiagramElement, Activity> debugTarget = this.createSDDebugTarget(launch, serverAddress, serverPortNumber);
			launch.addDebugTarget(debugTarget);
		}
		else
		{
			throw new CoreException(null);
		}
	}

	protected abstract SDDebugTarget<StoryDiagramElement, Activity> createSDDebugTarget(ILaunch launch, String serverAddress,
			int serverPortNumber) throws CoreException;

	protected abstract int getServerDefaultPort();
}
