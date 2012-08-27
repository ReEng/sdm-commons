package de.mdelab.sdm.interpreter.code.debug.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public abstract class SDDebugTabGroup extends AbstractLaunchConfigurationTabGroup
{

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode)
	{
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[]
		{
				this.createSDebugMainTab(), new CommonTab()
		};
		this.setTabs(tabs);
	}

	protected abstract SDDebugMainTab createSDebugMainTab();
}
