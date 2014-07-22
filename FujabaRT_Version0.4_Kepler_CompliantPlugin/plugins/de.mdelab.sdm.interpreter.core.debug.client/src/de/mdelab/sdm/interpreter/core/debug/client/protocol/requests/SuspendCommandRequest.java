package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class SuspendCommandRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, Exception>
{

	public SuspendCommandRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.SUSPEND, debugClient);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

	@Override
	protected Exception confirming(ExtendedDataInputStream in) throws Exception
	{
		return (Exception) in.readObject(this.getClass().getClassLoader());
	}

}
