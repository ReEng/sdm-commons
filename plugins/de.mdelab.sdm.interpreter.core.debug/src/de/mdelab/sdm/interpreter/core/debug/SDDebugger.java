package de.mdelab.sdm.interpreter.core.debug;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.lifecycle.ILifecycleEvent;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.spi.net4j.ServerProtocolFactory;

import de.mdelab.resourceSetSynchronizer.EObjectUuidCalculator;
import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;
import de.mdelab.sdm.interpreter.core.AbortInterpretationException;
import de.mdelab.sdm.interpreter.core.SDMInterpreter;
import de.mdelab.sdm.interpreter.core.debug.breakpoints.Breakpoint;
import de.mdelab.sdm.interpreter.core.debug.breakpoints.StepBreakpoint;
import de.mdelab.sdm.interpreter.core.debug.breakpoints.StepIntoBreakpoint;
import de.mdelab.sdm.interpreter.core.debug.breakpoints.StepOutBreakpoint;
import de.mdelab.sdm.interpreter.core.debug.breakpoints.StepOverBreakpoint;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandIndicationFactory;
import de.mdelab.sdm.interpreter.core.debug.protocol.requests.ExecutionFinishedEventRequest;
import de.mdelab.sdm.interpreter.core.debug.protocol.requests.ExecutionResumedEventRequest;
import de.mdelab.sdm.interpreter.core.debug.protocol.requests.ExecutionSuspendedEventRequest;
import de.mdelab.sdm.interpreter.core.debug.protocol.requests.ExecutionTerminatedEventRequest;
import de.mdelab.sdm.interpreter.core.facade.EForEachSemantics;
import de.mdelab.sdm.interpreter.core.notifications.ActivityExecutionStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.ActivityNodeExecutionStartedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InstanceLinkDestroyedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InstanceObjectCreatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.InterpreterNotification;
import de.mdelab.sdm.interpreter.core.notifications.NotificationReceiver;
import de.mdelab.sdm.interpreter.core.notifications.NotificationTypeEnum;
import de.mdelab.sdm.interpreter.core.notifications.VariableCreatedNotification;
import de.mdelab.sdm.interpreter.core.notifications.VariableDeletedNotification;
import de.mdelab.sdm.interpreter.core.notifications.VariableValueChangedNotification;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public abstract class SDDebugger<StoryDiagramElement extends EObject, Activity extends EObject, ActivityNode, StoryPattern, Expression>
		implements NotificationReceiver<EClassifier>
{
	private EDebuggerState																								debuggerState;

	private final IManagedContainer																						debugProtocolContainer;

	private final int																									debugServerPort;

	private final int																									resourceSetSynchronizerPort;

	private final SignalProtocol<Object>																				debugProtocol;

	private final Map<String, Collection<Breakpoint<StoryDiagramElement>>>												breakpoints;

	private final Stack<StackFrame<StoryDiagramElement>>																executionStack;

	private final Stack<ChangeHistoryEntry>																				changeHistory;

	private ResourceSet																									debuggerResourceSet;

	public static final URI																								DEBUGGER_RESOURCE_URI	= URI.createURI("de.mdelab.sdm.interpreter.sde.debug.resource");

	/*
	 * The debugger resource contains all objects that are not contained in any
	 * other resource.
	 */
	private Resource																									debuggerResource;

	private ChangeRecorder																								changeRecorder;

	private SynchronizerAdapter																							synchronizerAdapter;

	private SDMInterpreter<Activity, ActivityNode, ?, StoryPattern, ?, ?, EClassifier, EStructuralFeature, Expression>	interpreter;

	private boolean																										processNotifications;

	private AbortInterpretationException																				abortException;

	@SuppressWarnings("unchecked")
	public SDDebugger(
			SDMInterpreter<Activity, ActivityNode, ?, StoryPattern, ?, ?, EClassifier, EStructuralFeature, Expression> interpreter,
			int debugServerPort)
	{
		assert interpreter != null;

		this.interpreter = interpreter;
		interpreter.getNotificationEmitter().addNotificationReceiver(this);

		this.processNotifications = true;

		this.debugServerPort = debugServerPort;
		this.resourceSetSynchronizerPort = debugServerPort + 1;

		this.debuggerState = EDebuggerState.SUSPENDED;

		this.breakpoints = new ConcurrentHashMap<String, Collection<Breakpoint<StoryDiagramElement>>>();

		this.executionStack = new Stack<StackFrame<StoryDiagramElement>>();
		this.executionStack.push(new StackFrame<StoryDiagramElement>());

		this.changeHistory = new Stack<ChangeHistoryEntry>();

		/*
		 * Open debug server
		 */
		this.debugProtocolContainer = ContainerUtil.createContainer();

		Net4jUtil.prepareContainer(this.debugProtocolContainer);
		TCPUtil.prepareContainer(this.debugProtocolContainer);
		this.debugProtocolContainer.registerFactory(this.createDebugProtocolCommandIndicationFactory());

		LifecycleUtil.activate(this.debugProtocolContainer);

		TCPUtil.getAcceptor(this.debugProtocolContainer, "0.0.0.0:" + this.debugServerPort);

		this.debugProtocol = (SignalProtocol<Object>) this.debugProtocolContainer.getFactory(ServerProtocolFactory.PRODUCT_GROUP,
				SDDebugProtocolCommandIndicationFactory.SDE_DEBUG_PROTOCOL).create(null);

		/*
		 * Attach listener to the debug protocol to be notified when the
		 * connection is closed
		 */
		this.debugProtocol.addListener(new IListener()
		{
			@Override
			public void notifyEvent(IEvent event)
			{
				if (event instanceof ILifecycleEvent)
				{
					if (((ILifecycleEvent) event).getKind() == ILifecycleEvent.Kind.DEACTIVATED)
					{
						try
						{
							/*
							 * TODO Avoid this hack!
							 * 
							 * Start a new thread that calls disconnect after
							 * one second. This is necessary to avoid calling
							 * disconnect from within this event handler.
							 */
							new Thread()
							{
								@Override
								public void run()
								{
									try
									{
										Thread.sleep(1000);

										SDDebugger.this.terminate();

										SDDebugger.this.disconnect();
									}
									catch (Exception e)
									{
										e.printStackTrace();
									}
								};
							}.start();
						}
						catch (Exception e)
						{
							e.printStackTrace();
							throw new RuntimeException(e);
						}
					}
				}
			}
		});
	}

	protected abstract SDDebugProtocolCommandIndicationFactory<StoryDiagramElement> createDebugProtocolCommandIndicationFactory();

	protected void initialize(Activity activity,
			SDMInterpreter<Activity, ActivityNode, ?, StoryPattern, ?, ?, EClassifier, EStructuralFeature, Expression> interpreter)
	{
		assert activity.eResource() != null;
		assert activity.eResource().getResourceSet() != null;

		assert interpreter != null;

		this.interpreter = interpreter;

		/*
		 * Get the resource set of the activity
		 */
		this.debuggerResourceSet = activity.eResource().getResourceSet();

		/*
		 * Check if the debugger resource already exists
		 */
		this.debuggerResource = this.debuggerResourceSet.getResource(SDDebugger.DEBUGGER_RESOURCE_URI, false);

		if (this.debuggerResource != null)
		{
			/*
			 * Clear the existing debugger resource
			 */
			this.debuggerResource.getContents().clear();
		}
		else
		{
			/*
			 * create a new debugger resource
			 */
			this.debuggerResource = this.debuggerResourceSet.createResource(SDDebugger.DEBUGGER_RESOURCE_URI);
		}

		/*
		 * Attach the resource set synchronizer to the resource set
		 */
		this.synchronizerAdapter = new SynchronizerAdapter(this.debuggerResourceSet, this.resourceSetSynchronizerPort);
		this.synchronizerAdapter.getEObjectUUIDManager().setEObjectUuidCalculator(this.getStoryDiagramElementUuidCalculator());

		/*
		 * Attach the change recorder to the debugger resource set
		 */
		this.changeRecorder = new ChangeRecorder(this.debuggerResourceSet);

	}

	protected abstract EObjectUuidCalculator getStoryDiagramElementUuidCalculator();

	private synchronized void disconnect() throws Exception
	{
		if (this.debugProtocolContainer.isActive())
		{
			System.out.println("Shutting down server...");

			this.abort(null);

			this.debugProtocolContainer.deactivate();

			this.synchronizerAdapter.shutdown();

			System.out.println("Server shut down.");

			assert !this.debugProtocolContainer.isActive();
			assert !this.debugProtocol.isActive();
		}
	}

	// @Override
	// public Map<String, Variable<EClassifier>> executeActivity(Activity
	// activity, List<Variable<EClassifier>> parameters)
	// throws SDMException
	// {
	//
	// assert activity.eResource() != null;
	// assert activity.eResource().getResourceSet() != null;
	//
	// /*
	// * Get the resource set of the activity
	// */
	// this.debuggerResourceSet = activity.eResource().getResourceSet();
	//
	// /*
	// * Check if the debugger resource already exists
	// */
	// this.debuggerResource =
	// this.debuggerResourceSet.getResource(SDEDebugger.DEBUGGER_RESOURCE_URI,
	// false);
	//
	// if (this.debuggerResource != null)
	// {
	// /*
	// * Clear the existing debugger resource
	// */
	// this.debuggerResource.getContents().clear();
	// }
	// else
	// {
	// /*
	// * create a new debugger resource
	// */
	// this.debuggerResource =
	// this.debuggerResourceSet.createResource(SDEDebugger.DEBUGGER_RESOURCE_URI);
	// }
	//
	// /*
	// * Check that each EObject parameter is contained in the debugger
	// * resource set or in no resource at all.
	// */
	// if (parameters != null)
	// {
	// for (Variable<EClassifier> param : parameters)
	// {
	// assert param.getValue() == null || !(param.getValue() instanceof EObject)
	// || ((EObject) param.getValue()).eResource() == null
	// || ((EObject) param.getValue()).eResource().getResourceSet() ==
	// this.debuggerResourceSet;
	// }
	// }
	//
	// /*
	// * Attach the resource set synchronizer to the resource set
	// */
	// this.synchronizerAdapter = new
	// SynchronizerAdapter(this.debuggerResourceSet,
	// this.resourceSetSynchronizerPort);
	// this.synchronizerAdapter.getEObjectUUIDManager().seteObjectUuidCalculator(new
	// StoryDiagramElementUuidCalculator());
	//
	// /*
	// * Attach the change recorder to the debugger resource set
	// */
	// this.changeRecorder = new ChangeRecorder(this.debuggerResourceSet);
	//
	// try
	// {
	// /*
	// * Suspend the interpreter
	// */
	// synchronized (this)
	// {
	// this.wait();
	// }
	//
	// /*
	// * Execute activity
	// */
	// Map<String, Variable<EClassifier>> map = super.executeActivity(activity,
	// parameters);
	//
	// this.debuggerState = EDebuggerState.TERMINATED;
	//
	// if (this.debugProtocol.isActive())
	// {
	// new ExecutionFinishedEventRequest(this.debugProtocol).sendAsync();
	// }
	//
	// return map;
	// }
	// catch (DebuggerTerminationException e)
	// {
	// this.debuggerState = EDebuggerState.TERMINATED;
	// return null;
	// }
	// catch (Exception e)
	// {
	// e.printStackTrace();
	// throw new RuntimeException(e);
	// }
	// }

	public void addBreakpoint(Breakpoint<StoryDiagramElement> breakpoint)
	{
		Collection<Breakpoint<StoryDiagramElement>> bp = this.breakpoints.get(breakpoint.getElementUUID());

		if (bp == null)
		{
			bp = new ConcurrentLinkedQueue<Breakpoint<StoryDiagramElement>>();
			this.breakpoints.put(breakpoint.getElementUUID(), bp);
		}

		bp.add(breakpoint);
	}

	public void removeBreakpoint(String breakpointUUID)
	{
		assert breakpointUUID != null;

		/*
		 * Search for the breakpoint with this UUID
		 */
		for (Iterator<Collection<Breakpoint<StoryDiagramElement>>> it1 = this.getBreakpoints().values().iterator(); it1.hasNext();)
		{
			Collection<Breakpoint<StoryDiagramElement>> breakpoints = it1.next();

			for (Iterator<Breakpoint<StoryDiagramElement>> it = breakpoints.iterator(); it.hasNext();)
			{
				if (it.next().getBreakpointUUID().equals(breakpointUUID))
				{
					it.remove();
				}
			}

			if (breakpoints.isEmpty())
			{
				it1.remove();
			}
		}
	}

	public void suspendOnBreakpoints(StoryDiagramElement currentlyExecutedElement,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		assert currentlyExecutedElement != null;
		assert variablesScope != null;

		synchronized (this)
		{
			if (this.abortException != null)
			{
				try
				{
					System.out.println("ABORTING INTERPRETER...");

					throw this.abortException;
				}
				finally
				{
					this.abortException = null;
				}
			}

			/*
			 * Check each breakpoint of the currently executed element
			 */
			Collection<Breakpoint<StoryDiagramElement>> bp = this.breakpoints.get(this.getStoryDiagramElementUuidCalculator()
					.calculateUuid(currentlyExecutedElement));

			Breakpoint<StoryDiagramElement> breakpoint = null;

			if (bp != null
					&& (breakpoint = this.evaluateBreakpoints(currentlyExecutedElement, variablesScope, bp)) != null
					|| this.breakpoints.get(Breakpoint.ANY_ELEMENT_UUID) != null
					&& (breakpoint = this.evaluateBreakpoints(currentlyExecutedElement, variablesScope,
							this.breakpoints.get(Breakpoint.ANY_ELEMENT_UUID))) != null)
			{
				this.debuggerState = EDebuggerState.SUSPENDED;

				System.out.println("SUSPENDING INTERPRETER...");

				try
				{
					if (breakpoint instanceof StepBreakpoint)
					{
						new ExecutionSuspendedEventRequest(this.debugProtocol, null).sendAsync();
					}
					else
					{
						new ExecutionSuspendedEventRequest(this.debugProtocol, breakpoint.getBreakpointUUID()).sendAsync();
					}

					this.wait();
				}
				catch (Exception e)
				{
					e.printStackTrace();
					throw new RuntimeException(e);
				}

				System.out.println("RESUMING INTERPRETER...");

				if (this.abortException != null)
				{
					try
					{
						System.out.println("ABORTING INTERPRETER...");

						throw this.abortException;
					}
					finally
					{
						this.abortException = null;
					}
				}
			}
		}
	}

	protected Breakpoint<StoryDiagramElement> evaluateBreakpoints(StoryDiagramElement currentlyExecutedElement,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope, Collection<Breakpoint<StoryDiagramElement>> breakpoints)
	{
		Iterator<Breakpoint<StoryDiagramElement>> it = breakpoints.iterator();

		while (it.hasNext())
		{
			Breakpoint<StoryDiagramElement> breakpoint = it.next();

			if (breakpoint.evaluate(currentlyExecutedElement, variablesScope))
			{
				if (breakpoint instanceof StepBreakpoint)
				{
					it.remove();
				}

				return breakpoint;
			}
		}

		return null;
	}

	/**
	 * Resumes the debugger thread.
	 * 
	 * @throws Exception
	 */
	public void resume() throws Exception
	{
		if (this.debuggerState != EDebuggerState.RUNNING)
		{
			synchronized (this)
			{
				this.debuggerState = EDebuggerState.RUNNING;

				this.notify();
			}

			new ExecutionResumedEventRequest(this.debugProtocol).sendAsync();
		}
	}

	public void stepInto() throws Exception
	{
		if (this.getDebuggerState() == EDebuggerState.SUSPENDED)
		{
			this.addBreakpoint(new StepIntoBreakpoint<StoryDiagramElement>(this));
			this.resume();
		}
	}

	public void stepOver() throws Exception
	{
		if (this.getDebuggerState() == EDebuggerState.SUSPENDED)
		{
			this.addBreakpoint(new StepOverBreakpoint<StoryDiagramElement>(this));
			this.resume();
		}
	}

	public void stepOut() throws Exception
	{
		if (this.getDebuggerState() == EDebuggerState.SUSPENDED)
		{
			this.addBreakpoint(new StepOutBreakpoint<StoryDiagramElement>(this));
			this.resume();
		}
	}

	@SuppressWarnings("unchecked")
	public void stepBackOver() throws Exception
	{
		if (this.getDebuggerState() == EDebuggerState.SUSPENDED && this.getChangeHistory().size() > 2)
		{
			this.setProcessNotifications(false);

			/*
			 * Stop recording changes and revert the last change
			 */
			this.changeRecorder.endRecording().apply();

			/*
			 * Revert all changes until the topmost notification is starting
			 * activity node execution.
			 */
			int currentStackSize = this.getExecutionStack().size();

			do
			{
				/*
				 * Pop the last change description
				 */
				this.revertLastChangeHistoryEntry();

			}
			while (!this.getChangeHistory().isEmpty()
					&& (this.getChangeHistory().peek().getInterpreterNotification().getNotificationType() != NotificationTypeEnum.ACTIVITY_NODE_EXECUTION_STARTED || currentStackSize < this
							.getExecutionStack().size()));

			/*
			 * Also revert the starting of the activity node and set this
			 * activity node as the next executed node.
			 */
			ChangeHistoryEntry changeEntry = this.revertLastChangeHistoryEntry();

			assert changeEntry.getInterpreterNotification().getNotifier() instanceof SDMInterpreter;

			/*
			 * Set the next node to be executed by the interpreter.
			 */
			((SDMInterpreter<?, ActivityNode, ?, ?, ?, ?, ?, ?, ?>) changeEntry.getInterpreterNotification().getNotifier())
					.setNextNode(((ActivityNodeExecutionStartedNotification<ActivityNode, ?>) changeEntry.getInterpreterNotification())
							.getActivityNode());

			this.addBreakpoint(new StepIntoBreakpoint<StoryDiagramElement>(this));

			this.changeRecorder.beginRecording(Collections.singleton(this.debuggerResourceSet));

			this.setProcessNotifications(true);

			this.abort((SDMInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?>) changeEntry.getInterpreterNotification().getNotifier());
		}
	}

	@SuppressWarnings("unchecked")
	protected ChangeHistoryEntry revertLastChangeHistoryEntry()
	{
		ChangeHistoryEntry changeEntry = this.getChangeHistory().pop();

		System.out.println("Reverting execution of '" + changeEntry.getInterpreterNotification() + "...'");

		/*
		 * Undo changes on the instance model
		 */
		changeEntry.getChangeDescription().apply();

		/*
		 * If the last change was one of the following (finishing the execution
		 * of something), push a new stack frame onto the execution stack.
		 */
		switch (changeEntry.getInterpreterNotification().getNotificationType())
		{
			case ACTIVITY_EXECUTION_FINISHED:
			case ACTIVITY_NODE_EXECUTION_FINISHED:
			case EVALUATED_EXPRESSION:
			case STORY_PATTERN_INITIALIZATION_FINISHED:
			case STORY_PATTERN_MATCHING_SUCCESSFUL:
			case STORY_PATTERN_MATCHING_FAILED:
			case STORY_PATTERN_APPLICATION_FINISHED:
				this.getExecutionStack().push(new StackFrame<StoryDiagramElement>());
				break;
		}

		/*
		 * If the previous change was starting the execution of something, pop
		 * the topmost element of the execution stack.
		 */
		switch (this.getChangeHistory().peek().getInterpreterNotification().getNotificationType())
		{
			case ACTIVITY_EXECUTION_STARTED:
			case ACTIVITY_NODE_EXECUTION_STARTED:
			case EVALUATING_EXPRESSION:
			case STORY_PATTERN_INITIALIZATION_STARTED:
			case STORY_PATTERN_MATCHING_STARTED:
			case STORY_PATTERN_APPLICATION_STARTED:
				this.getExecutionStack().pop();
				break;
		}

		/*
		 * Find the last change in the change history that was connected to a
		 * story diagram element. Modify the execution stack accordingly.
		 */
		ChangeHistoryEntry previousChange = null;

		for (int i = this.changeHistory.size() - 1; i >= 0; i--)
		{
			previousChange = this.changeHistory.get(i);

			if (previousChange.getInterpreterNotification().getMainStoryDiagramElement() != null)
			{
				StackFrame<StoryDiagramElement> stackFrame = this.getExecutionStack().peek();

				stackFrame.setStoryDiagramElement((StoryDiagramElement) previousChange.getInterpreterNotification()
						.getMainStoryDiagramElement());
				stackFrame.setVariablesScope(previousChange.getInterpreterNotification().getVariablesScope());
				stackFrame.setLastNotification(previousChange.getInterpreterNotification());
				break;
			}
		}

		/*
		 * Revert changes of variable scopes.
		 */
		switch (changeEntry.getInterpreterNotification().getNotificationType())
		{
			case VARIABLE_CREATED:
				changeEntry
						.getInterpreterNotification()
						.getVariablesScope()
						.deleteVariable(
								((VariableCreatedNotification<EClassifier>) changeEntry.getInterpreterNotification()).getVariable()
										.getName());
				break;

			case VARIABLE_DELETED:
				Variable<EClassifier> variable = ((VariableDeletedNotification<EClassifier>) changeEntry.getInterpreterNotification())
						.getVariable();
				changeEntry.getInterpreterNotification().getVariablesScope()
						.createVariable(variable.getName(), variable.getClassifier(), variable.getValue());
				break;

			case VARIABLE_VALUE_CHANGED:
				VariableValueChangedNotification<EClassifier> n = (VariableValueChangedNotification<EClassifier>) changeEntry
						.getInterpreterNotification();
				changeEntry.getInterpreterNotification().getVariablesScope()
						.changeVariableValue(n.getVariable().getName(), n.getOldValue());
				break;
		}

		/*
		 * Revert changes of the interpreter's internal state, especially
		 * pattern matchers for for-each nodes
		 */
		switch (changeEntry.getInterpreterNotification().getNotificationType())
		{
			case STORY_PATTERN_INITIALIZATION_STARTED:

				assert this.changeHistory.peek().getInterpreterNotification() instanceof ActivityNodeExecutionStartedNotification<?, ?>;

				if (this.interpreter
						.getFacadeFactory()
						.getStoryNodeFacade()
						.getForEachSemantics(
								((ActivityNodeExecutionStartedNotification<ActivityNode, EClassifier>) this.changeHistory.peek()
										.getInterpreterNotification()).getActivityNode()) == EForEachSemantics.FRESH_MATCH)
				{
					assert this.changeHistory.peek().getInterpreterNotification().getNotifier() instanceof SDMInterpreter;

					((SDMInterpreter<Activity, ActivityNode, ?, StoryPattern, ?, ?, EClassifier, EStructuralFeature, Expression>) this.changeHistory
							.peek().getInterpreterNotification().getNotifier()).getStoryPatternMatchers().remove(
							changeEntry.getInterpreterNotification().getNotifier());
				}
		}

		return changeEntry;
	}

	/**
	 * Suspends the debugger by creating a step into breakpoint. This implies
	 * that the debugger is not immediately suspended but when breakpoints are
	 * checked next time.
	 * 
	 * @throws Exception
	 */
	public void suspend() throws Exception
	{
		if (this.getDebuggerState() == EDebuggerState.RUNNING)
		{
			this.addBreakpoint(new StepIntoBreakpoint<StoryDiagramElement>(this));
		}
	}

	public EDebuggerState getDebuggerState()
	{
		return this.debuggerState;
	}

	/**
	 * Terminates the debugger.
	 * 
	 * @throws Exception
	 */
	public void terminate() throws Exception
	{
		if (this.debuggerState != EDebuggerState.TERMINATED)
		{
			this.abort(null);

			if (this.debugProtocol.isActive())
			{
				new ExecutionTerminatedEventRequest(this.debugProtocol).sendAsync();
			}
		}
	}

	public void connectToDebugClient(String clientAddress, int clientServerPort) throws InterruptedException
	{
		/*
		 * Open connection to client
		 */
		IConnector connector = TCPUtil.getConnector(this.debugProtocolContainer, clientAddress + ":" + clientServerPort);
		this.debugProtocol.open(connector);
	}

	public Stack<StackFrame<StoryDiagramElement>> getExecutionStack()
	{
		return this.executionStack;
	}

	public Stack<ChangeHistoryEntry> getChangeHistory()
	{
		return this.changeHistory;
	}

	protected void addChangeHistoryEntry(InterpreterNotification<EClassifier> interpreterNotification)
	{
		ChangeDescription changeDescription = this.changeRecorder.endRecording();

		this.getChangeHistory().push(new ChangeHistoryEntry(changeDescription, interpreterNotification));

		this.changeRecorder.beginRecording(Collections.singleton(this.debuggerResourceSet));
	}

	public SynchronizerAdapter getSynchronizerAdapter()
	{
		return this.synchronizerAdapter;
	}

	public int getResourceSetSynchronizerPort()
	{
		return this.resourceSetSynchronizerPort;
	}

	public ResourceSet getDebuggerResourceSet()
	{
		return this.debuggerResourceSet;
	}

	public Resource getDebuggerResource()
	{
		return this.debuggerResource;
	}

	public Map<String, Collection<Breakpoint<StoryDiagramElement>>> getBreakpoints()
	{
		return this.breakpoints;
	}

	public SDMInterpreter<Activity, ActivityNode, ?, StoryPattern, ?, ?, EClassifier, EStructuralFeature, Expression> getInterpreter()
	{
		return this.interpreter;
	}

	public void setProcessNotifications(boolean processNotifications)
	{
		this.processNotifications = processNotifications;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(InterpreterNotification<EClassifier> notification)
	{
		if (this.processNotifications)
		{
			/*
			 * Initialize and suspend the interpreter if the execution of the
			 * root activity has just started (i.e. the execution stack contains
			 * only one element).
			 */
			if (this.getExecutionStack().size() == 1
					&& notification.getNotificationType() == NotificationTypeEnum.ACTIVITY_EXECUTION_STARTED)
			{
				assert notification.getNotifier() instanceof SDMInterpreter;

				this.initialize(
						((ActivityExecutionStartedNotification<Activity, ?>) notification).getActivity(),
						(SDMInterpreter<Activity, ActivityNode, ?, StoryPattern, ?, ?, EClassifier, EStructuralFeature, Expression>) notification
								.getNotifier());

				synchronized (this)
				{
					try
					{
						this.wait();
					}
					catch (Exception e)
					{
						e.printStackTrace();
						throw new RuntimeException(e);
					}
				}
			}

			/*
			 * add a new stack frame if the last notification of the current top
			 * stack frame is one of the following types
			 */
			InterpreterNotification<EClassifier> lastNotification = this.getExecutionStack().peek().getLastNotification();

			if (lastNotification != null)
			{
				switch (lastNotification.getNotificationType())
				{
					case ACTIVITY_EXECUTION_STARTED:
					case ACTIVITY_NODE_EXECUTION_STARTED:
					case EVALUATING_EXPRESSION:
					case STORY_PATTERN_INITIALIZATION_STARTED:
					case STORY_PATTERN_MATCHING_STARTED:
					case STORY_PATTERN_APPLICATION_STARTED:
						this.getExecutionStack().push(new StackFrame<StoryDiagramElement>());
				}
			}

			/*
			 * add entry to change history
			 */
			this.addChangeHistoryEntry(notification);

			/*
			 * remove the top stack frame if the current notification is of the
			 * following types
			 */
			switch (notification.getNotificationType())
			{
				case ACTIVITY_EXECUTION_FINISHED:
				case ACTIVITY_NODE_EXECUTION_FINISHED:
				case EVALUATED_EXPRESSION:
				case STORY_PATTERN_INITIALIZATION_FINISHED:
				case STORY_PATTERN_MATCHING_SUCCESSFUL:
				case STORY_PATTERN_MATCHING_FAILED:
				case STORY_PATTERN_APPLICATION_FINISHED:
					this.getExecutionStack().pop();
			}

			/*
			 * modify the top stack frame if the notification is connected to a
			 * story diagram element.
			 */
			if (notification.getMainStoryDiagramElement() != null)
			{
				StackFrame<StoryDiagramElement> frame = this.getExecutionStack().peek();
				frame.setStoryDiagramElement((StoryDiagramElement) notification.getMainStoryDiagramElement());
				frame.setVariablesScope(notification.getVariablesScope());
				frame.setLastNotification(notification);
			}

			switch (notification.getNotificationType())
			{

			/*
			 * Add created objects to the debugger resource
			 */
				case INSTANCE_OBJECT_CREATED:

					InstanceObjectCreatedNotification<?, ?> icn = (InstanceObjectCreatedNotification<?, ?>) notification;

					if (icn.getInstanceObject() instanceof EObject && ((EObject) icn.getInstanceObject()).eContainer() == null)
					{
						this.getDebuggerResource().getContents().add((EObject) icn.getInstanceObject());
					}

					break;

				/*
				 * add objects to the debugger resource if instance links are
				 * deleted and the connected objects have no container.
				 */
				case INSTANCE_LINK_DESTROYED:

					InstanceLinkDestroyedNotification<?, ?, ?> ildn = (InstanceLinkDestroyedNotification<?, ?, ?>) notification;

					if (ildn.getSourceObject() instanceof EObject && ((EObject) ildn.getSourceObject()).eContainer() == null)
					{
						this.getDebuggerResource().getContents().add((EObject) ildn.getSourceObject());
					}

					if (ildn.getTargetObject() instanceof EObject && ((EObject) ildn.getTargetObject()).eContainer() == null)
					{
						this.getDebuggerResource().getContents().add((EObject) ildn.getTargetObject());
					}

					break;
			}

			/*
			 * If the stack size is 1 and the execution of an activity has
			 * finished, emit an appropriate debug event.
			 */
			if (this.getExecutionStack().size() == 1
					&& notification.getNotificationType() == NotificationTypeEnum.ACTIVITY_EXECUTION_FINISHED)
			{
				try
				{
					if (this.debugProtocol.isActive())
					{
						new ExecutionFinishedEventRequest(this.debugProtocol).sendAsync();
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
			/*
			 * Check if the conditions of break points are satisfied and suspend
			 * if necessary.
			 */
			else if (notification.getMainStoryDiagramElement() != null)
			{
				this.suspendOnBreakpoints((StoryDiagramElement) notification.getMainStoryDiagramElement(), notification.getVariablesScope());
			}
		}
	}

	public void abort(SDMInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?> targetInterpreter) throws Exception
	{
		if (this.getDebuggerState() != EDebuggerState.TERMINATED)
		{
			synchronized (this)
			{
				System.out.println("---TERMINATING");

				this.debuggerState = EDebuggerState.TERMINATED;

				this.abortException = new AbortInterpretationException(targetInterpreter);

				this.notify();
			}
		}
	}
}
