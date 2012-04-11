package de.mdelab.sdm.interpreter.core.debug.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.SDDebugger;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class RemoveBreakpointIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandIndicationWithResponse<StoryDiagramElement>
{

	private Exception	exception;

	public RemoveBreakpointIndication(SignalProtocol<?> protocol, SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.REMOVE_BREAKPOINT, debuggingInterpreter);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		try
		{
			/*
			 * read breakpoint UUID
			 */
			String breakpointUUID = in.readString();

			this.getDebugger().removeBreakpoint(breakpointUUID);
		}
		catch (Exception ex)
		{
			this.exception = ex;
		}
	}

	@Override
	protected void responding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(this.exception);
	}

}
