package de.mdelab.sdm.interpreter.core.debug.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.IndicationWithResponse;
import org.eclipse.net4j.signal.SignalProtocol;

import de.mdelab.sdm.interpreter.core.debug.SDDebugger;

public abstract class SDDebugProtocolCommandIndicationWithResponse<StoryDiagramElement extends EObject> extends IndicationWithResponse
{

	private final SDDebugger<StoryDiagramElement, ?, ?, ?, ?>	debugger;

	public SDDebugProtocolCommandIndicationWithResponse(SignalProtocol<?> protocol, Enum<?> literal,
			SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debugger)
	{
		super(protocol, literal);

		assert debugger != null;

		this.debugger = debugger;
	}

	protected SDDebugger<StoryDiagramElement, ?, ?, ?, ?> getDebugger()
	{
		return this.debugger;
	}
}
