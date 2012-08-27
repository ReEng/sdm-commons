package de.mdelab.sdm.interpreter.code.debug.ui.stepCommands;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.debug.core.model.IStep;

public class StepCommandAdapterFactory implements IAdapterFactory
{

	@Override
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType)
	{
		assert adaptableObject != null;
		assert adapterType != null;

		if (adaptableObject instanceof IStep)
		{
			if (adapterType == IStepBackOverHandler.class)
			{
				return new StepBackOverCommand();
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList()
	{
		return new Class[]
		{
			IStepBackOverHandler.class
		};
	}

}
