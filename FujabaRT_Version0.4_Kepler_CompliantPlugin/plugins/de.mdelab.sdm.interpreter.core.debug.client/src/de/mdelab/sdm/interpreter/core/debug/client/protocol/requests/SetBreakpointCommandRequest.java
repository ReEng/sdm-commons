package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class SetBreakpointCommandRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, String>
{

	private final String	elementUUID;
	private final String	expression;
	private final String	expressionLanguage;

	public SetBreakpointCommandRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient, String elementUUID,
			String expressionLanguage, String expression)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.SET_BREAKPOINT, debugClient);

		this.elementUUID = elementUUID;
		this.expression = expression;
		this.expressionLanguage = expressionLanguage;
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send element UUID
		 */
		out.writeObject(this.elementUUID);

		/*
		 * Send expression language
		 */
		out.writeObject(this.expressionLanguage);

		/*
		 * Send expression string
		 */
		out.writeObject(this.expression);
	}

	@Override
	protected String confirming(ExtendedDataInputStream in) throws Exception
	{
		return in.readString();
	}
}
