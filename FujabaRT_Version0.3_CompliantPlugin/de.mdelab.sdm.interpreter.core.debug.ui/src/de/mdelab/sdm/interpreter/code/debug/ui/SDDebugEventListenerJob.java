package de.mdelab.sdm.interpreter.code.debug.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.debug.client.DebugEvent;
import de.mdelab.sdm.interpreter.core.debug.client.ExecutionFinishedEvent;
import de.mdelab.sdm.interpreter.core.debug.client.ExecutionResumedEvent;
import de.mdelab.sdm.interpreter.core.debug.client.ExecutionSuspendedEvent;
import de.mdelab.sdm.interpreter.core.debug.client.ExecutionTerminatedEvent;
import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;

public class SDDebugEventListenerJob<StoryDiagramElement extends EObject> extends Job
{
	private final SDDebugTarget<StoryDiagramElement, ?>	debugTarget;
	private final SDDebugClient<StoryDiagramElement, ?>	debugClient;

	public SDDebugEventListenerJob(SDDebugTarget<StoryDiagramElement, ?> debugTarget, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super("Story Diagram Debug Event Listener");
		this.setSystem(true);

		assert debugTarget != null;
		assert debugClient != null;

		this.debugTarget = debugTarget;
		this.debugClient = debugClient;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor)
	{
		while (!this.debugTarget.isTerminated())
		{
			try
			{
				DebugEvent debugEvent = this.debugClient.waitForDebugEvent(null);

				if (debugEvent instanceof ExecutionResumedEvent)
				{
					this.debugTarget.fireResumeEvent(org.eclipse.debug.core.DebugEvent.UNSPECIFIED);
				}
				else if (debugEvent instanceof ExecutionSuspendedEvent)
				{
					if (((ExecutionSuspendedEvent) debugEvent).getBreakpointUUID() != null)
					{
						this.debugTarget.fireSuspendEvent(org.eclipse.debug.core.DebugEvent.BREAKPOINT);
					}
					else
					{
						this.debugTarget.fireSuspendEvent(org.eclipse.debug.core.DebugEvent.UNSPECIFIED);
					}
				}
				else if (debugEvent instanceof ExecutionFinishedEvent)
				{
					this.debugTarget.fireTerminateEvent();
				}
				else if (debugEvent instanceof ExecutionTerminatedEvent)
				{
					this.debugTarget.fireTerminateEvent();
				}
				else
				{
					throw new UnsupportedOperationException();
				}

			}
			catch (InterruptedException e)
			{
				throw new UnsupportedOperationException();
			}
		}

		return Status.OK_STATUS;
	}
}
