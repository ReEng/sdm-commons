package de.mdelab.sdm.interpreter.code.debug.ui;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.emf.ecore.EObject;

public class SDDebugProcess<StoryDiagramElement extends EObject> extends SDDebugElement<StoryDiagramElement> implements IProcess
{

	public SDDebugProcess(SDDebugTarget<StoryDiagramElement, ?> target)
	{
		super(target);
	}

	@Override
	public boolean canTerminate()
	{
		return false;
	}

	@Override
	public boolean isTerminated()
	{
		return false;
	}

	@Override
	public void terminate() throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String getLabel()
	{
		return SDDebugUiConstants.SD_DEBUG_TARGET_NAME;
	}

	@Override
	public IStreamsProxy getStreamsProxy()
	{
		return null;
	}

	@Override
	public void setAttribute(String key, String value)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getAttribute(String key)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int getExitValue() throws DebugException
	{
		return 0;
	}

}
