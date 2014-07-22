package de.mdelab.sdm.interpreter.code.debug.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.client.stack.DebugClientStackFrame;

public abstract class SDDebugThread<StoryDiagramElement extends EObject, Activity> extends SDDebugElement<StoryDiagramElement> implements
		IThread
{

	private final SDDebugClient<StoryDiagramElement, Activity>	debugClient;

	private boolean												terminated;

	private boolean												suspended;

	private SDDebugUiStackFrame<StoryDiagramElement>[]			stackFrames;

	public SDDebugThread(SDDebugTarget<StoryDiagramElement, Activity> target, SDDebugClient<StoryDiagramElement, Activity> debugClient)
	{
		super(target);

		assert debugClient != null;

		this.debugClient = debugClient;

		this.terminated = false;

		this.suspended = false;

	}

	@Override
	public boolean canResume()
	{
		return !this.terminated && this.suspended;
	}

	@Override
	public boolean canSuspend()
	{
		return !this.terminated && !this.suspended;
	}

	@Override
	public boolean isSuspended()
	{
		return this.suspended;
	}

	@Override
	public void resume() throws DebugException
	{
		this.suspended = false;

		try
		{
			this.debugClient.resume();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not resume debugger.", e));
		}
	}

	@Override
	public void suspend() throws DebugException
	{
		this.suspended = true;

		try
		{
			this.debugClient.suspend();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not suspend debugger.", e));
		}
	}

	@Override
	public boolean canStepInto()
	{
		return this.isSuspended();
	}

	@Override
	public boolean canStepOver()
	{
		return this.isSuspended();
	}

	@Override
	public boolean canStepReturn()
	{
		return this.isSuspended();
	}

	@Override
	public boolean isStepping()
	{
		return !this.isSuspended() && !this.isTerminated();
	}

	@Override
	public void stepInto() throws DebugException
	{
		try
		{
			this.debugClient.stepInto();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not step into.", e));
		}
	}

	@Override
	public void stepOver() throws DebugException
	{
		try
		{
			this.debugClient.stepOver();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not step over.", e));
		}
	}

	@Override
	public void stepReturn() throws DebugException
	{
		try
		{
			this.debugClient.stepOut();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not step out.", e));
		}
	}

	public void stepBackOver() throws DebugException
	{
		try
		{
			this.debugClient.stepBackOver();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not step back over.", e));
		}
	}

	@Override
	public boolean canTerminate()
	{
		return !this.terminated;
	}

	@Override
	public boolean isTerminated()
	{
		return this.terminated;
	}

	@Override
	public void terminate() throws DebugException
	{
		/*
		 * This is necessary to avoid sending multiple terminate requests to the
		 * debugger
		 */
		this.terminated = true;
		this.suspended = false;

		try
		{
			this.debugClient.terminate();

			this.debugClient.disconnect();
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Could not terminate the debugger.", e));
		}
	}

	@Override
	public IStackFrame[] getStackFrames() throws DebugException
	{
		if (this.stackFrames == null)
		{
			this.updateStackFrames();
		}

		return this.stackFrames;
	}

	@SuppressWarnings("unchecked")
	public void updateStackFrames() throws DebugException
	{
		try
		{
			Stack<DebugClientStackFrame<StoryDiagramElement>> stack = this.debugClient.getExecutionStack();

			List<SDDebugUiStackFrame<StoryDiagramElement>> stackFrames = new LinkedList<SDDebugUiStackFrame<StoryDiagramElement>>();

			for (DebugClientStackFrame<StoryDiagramElement> stackFrame : stack)
			{
				stackFrames.add(0, this.createSDDebugUiStackFrame((SDDebugTarget<StoryDiagramElement, Activity>) this.getSDDebugTarget(),
						this, stackFrame));
			}

			this.stackFrames = stackFrames.toArray(new SDDebugUiStackFrame[stackFrames.size()]);
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Error while querying execution stack.", e));
		}
	}

	protected abstract SDDebugUiStackFrame<StoryDiagramElement> createSDDebugUiStackFrame(
			SDDebugTarget<StoryDiagramElement, Activity> sdDebugTarget, SDDebugThread<StoryDiagramElement, Activity> sdDebugThread,
			DebugClientStackFrame<StoryDiagramElement> stackFrame);

	@Override
	public boolean hasStackFrames() throws DebugException
	{
		return !this.isTerminated();
	}

	@Override
	public int getPriority() throws DebugException
	{
		return 0;
	}

	@Override
	public IStackFrame getTopStackFrame() throws DebugException
	{
		try
		{
			return this.getStackFrames()[0];
		}
		catch (Exception e)
		{
			throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, "Error while querying execution stack.", e));
		}

	}

	@Override
	public String getName() throws DebugException
	{
		return SDDebugUiConstants.SD_INTERPRETER_THREAD_NAME;
	}

	@Override
	public IBreakpoint[] getBreakpoints()
	{
		if (!this.isSuspended())
		{
			throw new UnsupportedOperationException();
		}
		else
		{
			return null;
		}
	}

	public void setSuspended(boolean suspended)
	{
		this.suspended = suspended;
	}

	public void setTerminated()
	{
		this.terminated = true;
	}

}
