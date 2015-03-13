package de.mdelab.sdm.interpreter.code.debug.ui;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.mdelab.resourceSetSynchronizer.ISynchronizerCommand;
import de.mdelab.resourceSetSynchronizer.ISynchronizerCommandExecutor;
import de.mdelab.sdm.interpreter.code.debug.ui.breakpoints.SDDebugBreakpoint;
import de.mdelab.sdm.interpreter.code.debug.ui.instanceGraph.SDInstanceGraphEditor;
import de.mdelab.sdm.interpreter.code.debug.ui.stepCommands.IStepBack;
import de.mdelab.sdm.interpreter.code.debug.ui.stepCommands.StepCommandAdapterFactory;
import de.mdelab.sdm.interpreter.code.debug.ui.storyDiagramEditor.SDEditorManager;
import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.client.stack.DebugClientStackFrame;

public abstract class SDDebugTarget<StoryDiagramElement extends EObject, Activity> extends SDDebugElement<StoryDiagramElement> implements
		IDebugTarget
{
	// private final Logger logger = Logger.getLogger(this.getClass());

	private final ILaunch											launch;
	private final SDDebugEventListenerJob<StoryDiagramElement>		debugEventListenerJob;

	private final SDDebugThread<StoryDiagramElement, Activity>		debugThread;
	private final SDDebugThread<StoryDiagramElement, Activity>[]	debugThreads;
	private final SDDebugProcess<StoryDiagramElement>				debugProcess;

	private final SDDebugClient<StoryDiagramElement, Activity>		debugClient;

	private SDInstanceGraphEditor									instanceGraphEditor;

	private final SDEditorManager<StoryDiagramElement>				storyDiagramEditorManager;

	@SuppressWarnings("unchecked")
	public SDDebugTarget(ILaunch launch, String debugServerAdress, int debugServerPort) throws CoreException
	{
		super(null);

		assert launch != null;
		assert debugServerAdress != null;
		assert !"".equals(debugServerAdress);

		this.launch = launch;

		IAdapterManager adapterManager = Platform.getAdapterManager();
		StepCommandAdapterFactory adapterFactory = new StepCommandAdapterFactory();
		adapterManager.registerAdapters(adapterFactory, IStepBack.class);

		/*
		 * Create a new debug client and connect to the debug server
		 */
		this.debugClient = this.createSDDebugClient();

		try
		{
			this.debugClient.connect(debugServerAdress, debugServerPort);

			this.fireCreationEvent();
		}
		catch (Exception e)
		{
			this.abort("Could not connect to debug server '" + debugServerAdress + ":" + debugServerPort + "'.", e);
		}

		this.configureDebugClient(this.debugClient);

		/*
		 * Add a source locator to the launch object
		 */
		launch.setSourceLocator(this.createSDDebugSourceLocator());

		/*
		 * Open instance graph editor
		 */
		this.openInstanceGraphEditor();

		this.debugClient.getSynchronizerAdapter().setCommandExecutor(new ISynchronizerCommandExecutor()
		{

			@Override
			public void executeCommand(final ISynchronizerCommand command)
			{
				SDDebugTarget.this.getInstanceGraphEditor().getEditingDomain().getCommandStack().execute(new AbstractCommand()
				{

					@Override
					public void execute()
					{
						command.execute();
					}

					@Override
					public void redo()
					{
						this.execute();
					}

					@Override
					public boolean canUndo()
					{
						return false;
					}

					@Override
					protected boolean prepare()
					{
						return true;
					}
				});
			}
		});

		/*
		 * Submit breakpoints to the debugger
		 */
		DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);

		IBreakpoint breakpoints[] = DebugPlugin.getDefault().getBreakpointManager()
				.getBreakpoints(SDDebugUiConstants.DEBUG_MODEL_IDENTIFIER);

		for (IBreakpoint breakpoint : breakpoints)
		{
			assert breakpoint instanceof SDDebugBreakpoint;

			this.addBreakpoint((SDDebugBreakpoint) breakpoint);
		}

		/*
		 * start debug process
		 */
		this.debugProcess = new SDDebugProcess<StoryDiagramElement>(this);

		/*
		 * Create debug client thread.
		 */
		this.debugThread = this.createSDDebugThread(this.debugClient);
		this.debugThreads = new SDDebugThread[]
		{
			this.debugThread
		};

		/*
		 * Start event listener job
		 */
		this.debugEventListenerJob = new SDDebugEventListenerJob<StoryDiagramElement>(this, this.debugClient);
		this.debugEventListenerJob.schedule();

		/*
		 * Register as breakpoint listener
		 */
		DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);

		/*
		 * Create story diagram manager
		 */
		this.storyDiagramEditorManager = this.createSDEditorManager();

		/*
		 * Send resume command to the client
		 */
		this.debugThread.stepInto();
	}

	protected abstract void configureDebugClient(SDDebugClient<StoryDiagramElement, Activity> debugClient);

	protected abstract SDEditorManager<StoryDiagramElement> createSDEditorManager();

	protected abstract ISourceLocator createSDDebugSourceLocator();

	protected abstract SDDebugClient<StoryDiagramElement, Activity> createSDDebugClient();

	protected abstract SDDebugThread<StoryDiagramElement, Activity> createSDDebugThread(
			SDDebugClient<StoryDiagramElement, Activity> debugClient);

	private void addBreakpoint(SDDebugBreakpoint debugBreakpoint)
	{
		try
		{
			if (debugBreakpoint.isEnabled() && this.debugClient.isConnected())
			{
				String breakpointUUID = this.debugClient.setBreakpoint(debugBreakpoint.getElementUUID(),
						debugBreakpoint.getExpressionLanguage(), debugBreakpoint.getExpression());

				debugBreakpoint.setBreakpointUUID(breakpointUUID);
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("Could not send breakpoint for element '" + debugBreakpoint.getElementUUID() + "'.", e);
		}
	}

	private void removeBreakpoint(SDDebugBreakpoint debugBreakpoint)
	{
		try
		{
			if (this.debugClient.isConnected())
			{
				this.debugClient.removeBreakpoint(debugBreakpoint.getBreakpointUUID());
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("Could not remove breakpoint on element '" + debugBreakpoint.getElementUUID() + "'.", e);
		}
	}

	public SDEditorManager<StoryDiagramElement> getStoryDiagramEditorManager()
	{
		return this.storyDiagramEditorManager;
	}

	public SDDebugClient<StoryDiagramElement, Activity> getDebugClient()
	{
		return this.debugClient;
	}

	@Override
	public boolean canTerminate()
	{
		return this.debugThread.canTerminate();
	}

	@Override
	public boolean isTerminated()
	{
		return this.debugThread.isTerminated();
	}

	@Override
	public void terminate() throws DebugException
	{
		this.closeInstanceGraphEditor();

		this.storyDiagramEditorManager.closeAllStoryDiagramEditors();

		if (!this.debugThread.isTerminated())
		{
			this.debugThread.terminate();
		}

		this.debugThread.setTerminated();

		DebugPlugin.getDefault().getBreakpointManager().removeBreakpointListener(this);
	}

	@Override
	public boolean canResume()
	{
		return this.debugThread.canResume();
	}

	@Override
	public boolean canSuspend()
	{
		return this.debugThread.canSuspend();
	}

	@Override
	public boolean isSuspended()
	{
		return this.debugThread.isSuspended();
	}

	@Override
	public void resume() throws DebugException
	{
		this.debugThread.resume();
	}

	@Override
	public void suspend() throws DebugException
	{
		this.debugThread.suspend();
	}

	@Override
	public void breakpointAdded(IBreakpoint breakpoint)
	{
		assert breakpoint instanceof SDDebugBreakpoint;

		this.addBreakpoint((SDDebugBreakpoint) breakpoint);
	}

	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta)
	{
		assert breakpoint instanceof SDDebugBreakpoint;

		this.removeBreakpoint((SDDebugBreakpoint) breakpoint);
	}

	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta)
	{
		assert breakpoint instanceof SDDebugBreakpoint;

		this.removeBreakpoint((SDDebugBreakpoint) breakpoint);

		this.addBreakpoint((SDDebugBreakpoint) breakpoint);
	}

	@Override
	public boolean canDisconnect()
	{
		return false;
	}

	@Override
	public void disconnect() throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isDisconnected()
	{
		return false;
	}

	@Override
	public boolean supportsStorageRetrieval()
	{
		return false;
	}

	@Override
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public IProcess getProcess()
	{
		return this.debugProcess;
	}

	@Override
	public IThread[] getThreads() throws DebugException
	{
		return this.debugThreads;
	}

	@Override
	public boolean hasThreads() throws DebugException
	{
		return true;
	}

	@Override
	public String getName() throws DebugException
	{
		return SDDebugUiConstants.SD_DEBUG_TARGET_NAME;
	}

	@Override
	public boolean supportsBreakpoint(IBreakpoint breakpoint)
	{
		return breakpoint.getModelIdentifier().equals(SDDebugUiConstants.DEBUG_MODEL_IDENTIFIER);
	}

	@Override
	public IDebugTarget getDebugTarget()
	{
		return this;
	}

	@Override
	public ILaunch getLaunch()
	{
		return this.launch;
	}

	@Override
	public void fireResumeEvent(int detail)
	{
		this.debugThread.setSuspended(false);

		this.instanceGraphEditor.setReadOnly(true);

		super.fireResumeEvent(detail);
	}

	@Override
	public void fireSuspendEvent(int detail)
	{
		this.debugThread.setSuspended(true);

		this.instanceGraphEditor.setReadOnly(false);

		/*
		 * Open the story diagram that contains the current element.
		 */
		try
		{
			this.debugThread.updateStackFrames();

			DebugClientStackFrame<StoryDiagramElement> stackFrame = this.debugClient.getExecutionStack().peek();
			this.storyDiagramEditorManager.highlightStoryDiagramElement(stackFrame.getStoryDiagramElement(),
					stackFrame.getLastNotificationType());
		}
		catch (Exception e)
		{
			throw new RuntimeException("Could not highlight current story diagram element.", e);
		}

		super.fireSuspendEvent(detail);
	}

	@Override
	public void fireTerminateEvent()
	{
		super.fireTerminateEvent();

		try
		{
			this.terminate();
		}
		catch (DebugException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public void fireChangeEvent(int detail)
	{
		super.fireChangeEvent(detail);
	}

	protected abstract void openInstanceGraphEditor();

	protected abstract void closeInstanceGraphEditor();

	protected abstract SDInstanceGraphEditor createSDInstanceGraphEditor();

	public SDInstanceGraphEditor getInstanceGraphEditor()
	{
		return this.instanceGraphEditor;
	}

	public void setInstanceGraphEditor(SDInstanceGraphEditor instanceGraphEditor)
	{
		this.instanceGraphEditor = instanceGraphEditor;
	}

	public EditingDomain getDebuggerEditingDomain()
	{
		return this.instanceGraphEditor.getEditingDomain();
	}
}
