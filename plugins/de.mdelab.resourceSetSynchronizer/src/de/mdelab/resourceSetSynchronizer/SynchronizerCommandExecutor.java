package de.mdelab.resourceSetSynchronizer;

public class SynchronizerCommandExecutor implements ISynchronizerCommandExecutor
{

	@Override
	public void executeCommand(ISynchronizerCommand command)
	{
		command.execute();
	}

}
