package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.RequestWithConfirmation;
import org.eclipse.net4j.signal.SignalProtocol;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;

public abstract class SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement extends EObject, RESULT> extends
		RequestWithConfirmation<RESULT>
{

	private final SDDebugClient<StoryDiagramElement, ?>	debugClient;

	public SDDebugProtocolCommandRequestWithConfirmation(SignalProtocol<?> protocol, Enum<?> literal,
			SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, literal);

		assert debugClient != null;

		this.debugClient = debugClient;
	}

	protected SDDebugClient<StoryDiagramElement, ?> getDebugClient()
	{
		return this.debugClient;
	}

}
