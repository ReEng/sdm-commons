package de.mdelab.sdm.interpreter.core.debug.client.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.Indication;
import org.eclipse.net4j.signal.SignalProtocol;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;

public abstract class SDDebugProtocolEventIndication<StoryDiagramElement extends EObject> extends Indication
{
	private final SDDebugClient<StoryDiagramElement, ?>	debugClient;

	public SDDebugProtocolEventIndication(SignalProtocol<?> protocol, Enum<?> literal, SDDebugClient<StoryDiagramElement, ?> debugClient)
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
