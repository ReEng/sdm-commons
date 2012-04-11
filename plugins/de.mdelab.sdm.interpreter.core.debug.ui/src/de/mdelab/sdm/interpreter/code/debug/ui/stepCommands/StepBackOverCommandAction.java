package de.mdelab.sdm.interpreter.code.debug.ui.stepCommands;

import org.eclipse.debug.ui.actions.DebugCommandAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugUiPlugin;

public class StepBackOverCommandAction extends DebugCommandAction
{
	public static final String	ACTION_DEFINITION_ID	= "de.mdelab.sdm.interpreter.debug.core.ui.stepCommands.StepBackOverAction";

	private final ImageDescriptor	enabledDescriptor, disabledDescriptor;

	public StepBackOverCommandAction()
	{
		this.setActionDefinitionId(ACTION_DEFINITION_ID);
		Bundle bundle = SDDebugUiPlugin.getDefault().getBundle();
		this.enabledDescriptor = ImageDescriptor.createFromURL(bundle.getEntry("icons/enabled/stepover_back.gif"));
		this.disabledDescriptor = ImageDescriptor.createFromURL(bundle.getEntry("icons/disabled/stepover_back.gif"));
	}

	@Override
	protected Class getCommandType()
	{
		return IStepBackOverHandler.class;
	}

	@Override
	public ImageDescriptor getDisabledImageDescriptor()
	{
		return this.disabledDescriptor;
	}

	@Override
	public String getHelpContextId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDescriptor getHoverImageDescriptor()
	{
		return this.enabledDescriptor;
	}

	@Override
	public String getId()
	{
		return ACTION_DEFINITION_ID;
	}

	@Override
	public ImageDescriptor getImageDescriptor()
	{
		return this.enabledDescriptor;
	}

	@Override
	public String getText()
	{
		return "Step Back Over";
	}

	@Override
	public String getToolTipText()
	{
		return null;
	}

}
