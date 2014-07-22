package de.mdelab.sdm.interpreter.code.debug.ui.stepCommands;

import org.eclipse.debug.core.DebugException;

public interface IStepBack
{
	public boolean canStepBackOver();

	public boolean isStepping();

	public void stepBackOver() throws DebugException;
}
