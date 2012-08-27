package de.mdelab.sdm.interpreter.code.debug.ui.stepCommands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.commands.IDebugCommandRequest;
import org.eclipse.debug.internal.core.commands.StepCommand;

public class StepBackOverCommand extends StepCommand implements IStepBackOverHandler
{

	@Override
	protected Object getEnabledStateJobFamily(IDebugCommandRequest request)
	{
		return IStepBackOverHandler.class;
	}

	@Override
	protected boolean isSteppable(Object target) throws CoreException
	{
		return ((IStepBack) target).canStepBackOver();
	}

	@Override
	protected void step(Object target) throws CoreException
	{
		((IStepBack) target).stepBackOver();

	}

}
