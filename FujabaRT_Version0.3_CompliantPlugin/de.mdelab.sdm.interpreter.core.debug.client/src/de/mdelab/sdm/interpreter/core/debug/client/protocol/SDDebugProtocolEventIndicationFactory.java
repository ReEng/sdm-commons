package de.mdelab.sdm.interpreter.core.debug.client.protocol;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.factory.ProductCreationException;
import org.eclipse.spi.net4j.ServerProtocolFactory;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.indications.ExecutionFinishedEventIndication;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.indications.ExecutionResumedEventIndication;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.indications.ExecutionSuspendedEventIndication;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.indications.ExecutionTerminatedEventIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandIndicationFactory;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class SDDebugProtocolEventIndicationFactory<StoryDiagramElement extends EObject> extends ServerProtocolFactory
{
	private final SDDebugClient<StoryDiagramElement, ?>	debugClient;

	public SDDebugProtocolEventIndicationFactory(SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(SDDebugProtocolCommandIndicationFactory.SDE_DEBUG_PROTOCOL);

		assert debugClient != null;

		this.debugClient = debugClient;
	}

	@Override
	public Object create(String description) throws ProductCreationException
	{
		return new SignalProtocol<Object>(SDDebugProtocolCommandIndicationFactory.SDE_DEBUG_PROTOCOL)
		{
			@Override
			protected SignalReactor createSignalReactor(short signalID)
			{
				switch (SDDebugProtocolEventMessagesEnum.values()[signalID])
				{
					case EXECUTION_FINISHED:
						return new ExecutionFinishedEventIndication<StoryDiagramElement>(this,
								SDDebugProtocolEventIndicationFactory.this.debugClient);

					case EXECUTION_TERMINATED:
						return new ExecutionTerminatedEventIndication<StoryDiagramElement>(this,
								SDDebugProtocolEventIndicationFactory.this.debugClient);

					case EXECUTION_RESUMED:
						return new ExecutionResumedEventIndication<StoryDiagramElement>(this,
								SDDebugProtocolEventIndicationFactory.this.debugClient);

					case EXECUTION_SUSPENDED:
						return new ExecutionSuspendedEventIndication<StoryDiagramElement>(this,
								SDDebugProtocolEventIndicationFactory.this.debugClient);

					default:
						// return super.createSignalReactor(signalID);
						throw new UnsupportedOperationException();
				}
			}
		};
	}

}
