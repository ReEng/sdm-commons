package de.mdelab.sdm.interpreter.core.debug.client.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;

import de.mdelab.sdm.interpreter.core.debug.client.ExecutionFinishedEvent;
import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionFinishedEventIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolEventIndication<StoryDiagramElement>
{

	public ExecutionFinishedEventIndication(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_FINISHED, debugClient);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		this.getDebugClient().getDebugEventQueue().put(new ExecutionFinishedEvent());
	}

}
