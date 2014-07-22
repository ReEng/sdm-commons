package de.mdelab.sdm.interpreter.core.debug.client.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;

import de.mdelab.sdm.interpreter.core.debug.client.ExecutionSuspendedEvent;
import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionSuspendedEventIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolEventIndication<StoryDiagramElement>
{

	public ExecutionSuspendedEventIndication(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_SUSPENDED, debugClient);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Receive breakpoint UUID
		 */
		String breakpointUUID = in.readString();

		this.getDebugClient().getDebugEventQueue().put(new ExecutionSuspendedEvent(breakpointUUID));
	}
}
