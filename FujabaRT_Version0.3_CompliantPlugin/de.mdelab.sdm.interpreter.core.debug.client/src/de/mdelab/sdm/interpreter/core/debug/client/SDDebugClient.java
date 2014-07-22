package de.mdelab.sdm.interpreter.core.debug.client;

import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.tcp.ITCPAcceptor;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.spi.net4j.ServerProtocolFactory;

import de.mdelab.resourceSetSynchronizer.EObjectUuidCalculator;
import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.SDDebugProtocolEventIndicationFactory;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.ConnectClientCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.GetExecutionStackCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.RemoveBreakpointRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.ResumeCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.SetBreakpointCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.SetVariableCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.StepBackOverRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.StepIntoCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.StepOutCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.StepOverCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.SuspendCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.protocol.requests.TerminateCommandRequest;
import de.mdelab.sdm.interpreter.core.debug.client.stack.DebugClientStackFrame;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandIndicationFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationTypeEnum;

public abstract class SDDebugClient<StoryDiagramElement extends EObject, Activity>
{
	private final int					debugClientPort;

	private IManagedContainer			debugProtocolContainer;

	private SignalProtocol<Object>		debugProtocol;

	private BlockingQueue<DebugEvent>	debugEventQueue;

	private ITCPAcceptor				acceptor;

	private ResourceSetImpl				debuggerResourceSet;

	private SynchronizerAdapter			synchronizerAdapter;

	private int							synchronizerAdapterPort;

	public SDDebugClient(int debugClientPort)
	{
		this.debugClientPort = debugClientPort;
	}

	@SuppressWarnings("unchecked")
	public synchronized void connect(String debugServerAddress, int debugServerPort) throws Exception
	{
		assert this.debugProtocolContainer == null;

		assert debugServerAddress != null;
		assert !"".equals(debugServerAddress);

		this.debugEventQueue = new LinkedBlockingQueue<DebugEvent>();

		/*
		 * Open debug client server to receive events from the debugger.
		 */
		this.debugProtocolContainer = ContainerUtil.createContainer();

		Net4jUtil.prepareContainer(this.debugProtocolContainer);
		TCPUtil.prepareContainer(this.debugProtocolContainer);
		this.debugProtocolContainer.registerFactory(new SDDebugProtocolEventIndicationFactory<StoryDiagramElement>(this));

		LifecycleUtil.activate(this.debugProtocolContainer);

		this.acceptor = TCPUtil.getAcceptor(this.debugProtocolContainer, "0.0.0.0:" + this.debugClientPort);

		/*
		 * Create debug protocol
		 */
		this.debugProtocol = (SignalProtocol<Object>) this.debugProtocolContainer.getFactory(ServerProtocolFactory.PRODUCT_GROUP,
				SDDebugProtocolCommandIndicationFactory.SDE_DEBUG_PROTOCOL).create(null);

		/*
		 * Open connection to debug server
		 */
		IConnector connector = TCPUtil.getConnector(this.debugProtocolContainer, debugServerAddress + ":" + debugServerPort);
		this.debugProtocol.open(connector);

		/*
		 * Send connect message
		 */
		int resourceSetSynchronizerPort = new ConnectClientCommandRequest<StoryDiagramElement>(this.debugProtocol, this,
				this.debugClientPort).send();

		/*
		 * Create a resource set
		 */
		this.debuggerResourceSet = new ResourceSetImpl();

		this.synchronizerAdapterPort = this.debugClientPort + 1;

		this.synchronizerAdapter = new SynchronizerAdapter(this.debuggerResourceSet, this.synchronizerAdapterPort);
		this.synchronizerAdapter.getEObjectUUIDManager().setEObjectUuidCalculator(this.getStoryDiagramElementUuidCalculator());

		this.synchronizerAdapter.connect(debugServerAddress, resourceSetSynchronizerPort);
	}

	protected abstract EObjectUuidCalculator getStoryDiagramElementUuidCalculator();

	public int getSynchronizerAdapterPort()
	{
		return this.synchronizerAdapterPort;
	}

	public synchronized void disconnect()
	{
		if (this.debugProtocol != null && this.debugProtocol.isActive())
		{
			System.out.println("SDEDebugClient.disconnect()");

			System.out.println("Shutting down client.");

			LifecycleUtil.deactivateNoisy(this.acceptor);
			LifecycleUtil.deactivateNoisy(this.debugProtocolContainer);

			try
			{
				this.synchronizerAdapter.shutdown();
			}
			catch (Exception e)
			{
				throw new RuntimeException("Could not shutdown synchronizer adapter.", e);
			}

			System.out.println("Client shut down.");

			assert !this.debugProtocol.isActive();
			assert !this.debugProtocolContainer.isActive();
		}
	}

	public BlockingQueue<DebugEvent> getDebugEventQueue()
	{
		return this.debugEventQueue;
	}

	/**
	 * Sends a resume command to the debugger.
	 * 
	 * @throws Exception
	 */
	public void resume() throws Exception
	{
		Exception ex = new ResumeCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	/**
	 * Sends a suspend command to the debugger
	 * 
	 * @throws Exception
	 */
	public void suspend() throws Exception
	{
		Exception ex = new SuspendCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	/**
	 * Sends a terminate command to the debugger.
	 * 
	 * @throws Exception
	 */
	public void terminate() throws Exception
	{
		Exception ex = new TerminateCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	/**
	 * Sends a step into command to the debugger.
	 * 
	 * @throws Exception
	 */
	public void stepInto() throws Exception
	{
		Exception ex = new StepIntoCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	/**
	 * Sends a step over command to the debugger.
	 * 
	 * @throws Exception
	 */
	public void stepOver() throws Exception
	{
		Exception ex = new StepOverCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	/**
	 * Sends a step out command to the debugger.
	 * 
	 * @throws Exception
	 */
	public void stepOut() throws Exception
	{
		Exception ex = new StepOutCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	public void stepBackOver() throws Exception
	{
		Exception ex = new StepBackOverRequest<StoryDiagramElement>(this.debugProtocol, this).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	public String setBreakpoint(String elementUUID) throws Exception
	{
		return this.setBreakpoint(elementUUID, null, null);
	}

	public String setBreakpoint(String elementUUID, String expressionLanguage, String expression) throws Exception
	{
		System.out.println("SDEDebugClient.setBreakpoint()");

		return new SetBreakpointCommandRequest<StoryDiagramElement>(this.debugProtocol, this, elementUUID, expressionLanguage, expression)
				.send();
	}

	/**
	 * Waits for the next debug event of the specified type, or simply the next
	 * debug event if evenType is null.
	 * 
	 * @param eventType
	 * @return
	 * @throws InterruptedException
	 */
	public DebugEvent waitForDebugEvent(Class<? extends DebugEvent> eventType) throws InterruptedException
	{
		DebugEvent debugEvent;

		do
		{
			debugEvent = this.getDebugEventQueue().take();
			System.out.println("DEBUG CLIENT: Received event: " + debugEvent);
		}
		while (eventType != null && !eventType.isInstance(debugEvent) && !(debugEvent instanceof ExecutionFinishedEvent)
				&& !(debugEvent instanceof ExecutionTerminatedEvent));

		return debugEvent;
	}

	public ResourceSet getDebuggerResourceSet()
	{
		return this.debuggerResourceSet;
	}

	public SynchronizerAdapter getSynchronizerAdapter()
	{
		return this.synchronizerAdapter;
	}

	public Stack<DebugClientStackFrame<StoryDiagramElement>> getExecutionStack() throws Exception
	{
		return new GetExecutionStackCommandRequest<StoryDiagramElement>(this.debugProtocol, this).send();
	}

	public void setVariable(DebugClientStackFrame<StoryDiagramElement> stackFrame, String variableName, Object newValue) throws Exception
	{
		Exception ex = new SetVariableCommandRequest<StoryDiagramElement>(this.debugProtocol, this, variableName, stackFrame, newValue)
				.send();

		if (ex != null)
		{
			throw ex;
		}
	}

	public void removeBreakpoint(String breakpointUUID) throws Exception
	{
		Exception ex = new RemoveBreakpointRequest<StoryDiagramElement>(this.debugProtocol, this, breakpointUUID).send();

		if (ex != null)
		{
			throw ex;
		}
	}

	@SuppressWarnings("unchecked")
	public Activity getExecutedActivity() throws Exception
	{
		Stack<DebugClientStackFrame<StoryDiagramElement>> stack = this.getExecutionStack();

		for (int i = stack.size() - 1; i >= 0; i--)
		{
			DebugClientStackFrame<StoryDiagramElement> stackFrame = stack.get(i);

			if (stackFrame.getLastNotificationType() == NotificationTypeEnum.ACTIVITY_EXECUTION_STARTED
					|| stackFrame.getLastNotificationType() == NotificationTypeEnum.ACTIVITY_EXECUTION_FINISHED)
			{
				return (Activity) stackFrame.getStoryDiagramElement();
			}
		}

		return null;
	}

	public StoryDiagramElement getCurrentStoryDiagramElement() throws Exception
	{
		return this.getExecutionStack().peek().getStoryDiagramElement();
	}

	public boolean isConnected()
	{
		return this.debugProtocol != null && this.debugProtocol.isActive();
	}

}
