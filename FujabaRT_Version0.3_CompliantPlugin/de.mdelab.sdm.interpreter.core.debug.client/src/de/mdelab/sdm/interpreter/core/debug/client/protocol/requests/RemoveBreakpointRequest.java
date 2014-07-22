package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class RemoveBreakpointRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, Exception>
{
	private final String	breakpointUUID;

	public RemoveBreakpointRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient, String breakpointUUID)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.REMOVE_BREAKPOINT, debugClient);

		assert breakpointUUID != null;
		assert !"".equals(breakpointUUID);

		this.breakpointUUID = breakpointUUID;
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send the breakpoint's UUID
		 */
		out.writeString(this.breakpointUUID);
	}

	@Override
	protected Exception confirming(ExtendedDataInputStream in) throws Exception
	{
		return (Exception) in.readObject(this.getClass().getClassLoader());
	}

}
