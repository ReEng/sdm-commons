package de.mdelab.sdm.interpreter.core.debug.protocol;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.util.factory.ProductCreationException;
import org.eclipse.spi.net4j.ServerProtocolFactory;

import de.mdelab.sdm.interpreter.core.debug.SDDebugger;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.ConnectClientCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.GetExecutionStackCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.RemoveBreakpointIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.ResumeCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.SetVariableCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.StepBackOverIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.StepIntoCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.StepOutCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.StepOverCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.SuspendCommandIndication;
import de.mdelab.sdm.interpreter.core.debug.protocol.indications.TerminateCommandIndication;

public abstract class SDDebugProtocolCommandIndicationFactory<StoryDiagramElement extends EObject> extends ServerProtocolFactory
{

	public static final String									SDE_DEBUG_PROTOCOL	= "de.mdelab.sdm.interpreter.sde.debug.protocol";

	private final SDDebugger<StoryDiagramElement, ?, ?, ?, ?>	debugger;

	public SDDebugProtocolCommandIndicationFactory(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debugger)
	{
		super(SDE_DEBUG_PROTOCOL);

		assert debugger != null;

		this.debugger = debugger;
	}

	public SDDebugger<StoryDiagramElement, ?, ?, ?, ?> getDebugger()
	{
		return this.debugger;
	}

	@Override
	public Object create(String description) throws ProductCreationException
	{
		return new SignalProtocol<Object>(SDE_DEBUG_PROTOCOL)
		{
			@Override
			protected SignalReactor createSignalReactor(short signalID)
			{
				switch (SDDebugProtocolCommandMessagesEnum.values()[signalID])
				{
					case CONNECT_CLIENT:
						return SDDebugProtocolCommandIndicationFactory.this.createConnectClientCommandIndication(this);

					case RESUME:
						return SDDebugProtocolCommandIndicationFactory.this.createResumeCommandIndication(this);

					case SUSPEND:
						return SDDebugProtocolCommandIndicationFactory.this.createSuspendCommandIndication(this);

					case TERMINATE:
						return SDDebugProtocolCommandIndicationFactory.this.createTerminateCommandIndication(this);

					case STEP_INTO:
						return SDDebugProtocolCommandIndicationFactory.this.createStepIntoCommandIndication(this);

					case STEP_OVER:
						return SDDebugProtocolCommandIndicationFactory.this.createStepOverCommandIndication(this);

					case STEP_OUT:
						return SDDebugProtocolCommandIndicationFactory.this.createStepOutCommandIndication(this);

					case SET_BREAKPOINT:
						return SDDebugProtocolCommandIndicationFactory.this.createSetBreakpointCommandIndication(this);

					case GET_EXECUTION_STACK:
						return SDDebugProtocolCommandIndicationFactory.this.createGetExecutionStackCommandIndication(this);

					case SET_VARIABLE:
						return SDDebugProtocolCommandIndicationFactory.this.createSetVariableCommandIndication(this);

					case REMOVE_BREAKPOINT:
						return SDDebugProtocolCommandIndicationFactory.this.createRemoveBreakpointIndication(this);

					case STEP_BACK_OVER:
						return SDDebugProtocolCommandIndicationFactory.this.createStepBackOverIndication(this);

					default:
						// return super.createSignalReactor(signalID);
						throw new UnsupportedOperationException();
				}
			}
		};
	}

	protected ConnectClientCommandIndication<StoryDiagramElement> createConnectClientCommandIndication(SignalProtocol<?> protocol)
	{
		return new ConnectClientCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected ResumeCommandIndication<StoryDiagramElement> createResumeCommandIndication(SignalProtocol<?> protocol)
	{
		return new ResumeCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected SuspendCommandIndication<StoryDiagramElement> createSuspendCommandIndication(SignalProtocol<?> protocol)
	{
		return new SuspendCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected TerminateCommandIndication<StoryDiagramElement> createTerminateCommandIndication(SignalProtocol<?> protocol)
	{
		return new TerminateCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected StepIntoCommandIndication<StoryDiagramElement> createStepIntoCommandIndication(SignalProtocol<?> protocol)
	{
		return new StepIntoCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected StepOverCommandIndication<StoryDiagramElement> createStepOverCommandIndication(SignalProtocol<?> protocol)
	{
		return new StepOverCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected StepOutCommandIndication<StoryDiagramElement> createStepOutCommandIndication(SignalProtocol<?> protocol)
	{
		return new StepOutCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected abstract SignalReactor createSetBreakpointCommandIndication(SignalProtocol<?> protocol);

	protected GetExecutionStackCommandIndication<StoryDiagramElement> createGetExecutionStackCommandIndication(SignalProtocol<?> protocol)
	{
		return new GetExecutionStackCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected SetVariableCommandIndication<StoryDiagramElement> createSetVariableCommandIndication(SignalProtocol<?> protocol)
	{
		return new SetVariableCommandIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected RemoveBreakpointIndication<StoryDiagramElement> createRemoveBreakpointIndication(SignalProtocol<?> protocol)
	{
		return new RemoveBreakpointIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}

	protected StepBackOverIndication<StoryDiagramElement> createStepBackOverIndication(SignalProtocol<?> protocol)
	{
		return new StepBackOverIndication<StoryDiagramElement>(protocol, this.getDebugger());
	}
}
