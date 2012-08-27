package de.mdelab.sdm.interpreter.code.debug.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

import de.mdelab.sdm.interpreter.code.debug.ui.stepCommands.IStepBack;
import de.mdelab.sdm.interpreter.code.debug.ui.variables.SDDebuggerVariable;
import de.mdelab.sdm.interpreter.code.debug.ui.variables.SDEObjectVariable;
import de.mdelab.sdm.interpreter.code.debug.ui.variables.SDVariable;
import de.mdelab.sdm.interpreter.core.debug.client.stack.DebugClientStackFrame;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public abstract class SDDebugUiStackFrame<StoryDiagramElement extends EObject> extends SDDebugElement<StoryDiagramElement> implements
		IStackFrame, IStepBack
{

	private final SDDebugThread<StoryDiagramElement, ?>			debugThread;
	private final DebugClientStackFrame<StoryDiagramElement>	stackFrame;

	public SDDebugUiStackFrame(SDDebugTarget<StoryDiagramElement, ?> target, SDDebugThread<StoryDiagramElement, ?> debugThread,
			DebugClientStackFrame<StoryDiagramElement> stackFrame)
	{
		super(target);

		assert debugThread != null;
		assert stackFrame != null;

		this.debugThread = debugThread;
		this.stackFrame = stackFrame;
	}

	@Override
	public boolean canStepInto()
	{
		return this.debugThread.canStepInto();
	}

	@Override
	public boolean canStepOver()
	{
		return this.debugThread.canStepOver();
	}

	@Override
	public boolean canStepReturn()
	{
		return this.debugThread.canStepReturn();
	}

	@Override
	public boolean isStepping()
	{
		return this.debugThread.isStepping();
	}

	@Override
	public void stepInto() throws DebugException
	{
		// TODO
		this.debugThread.stepInto();
	}

	@Override
	public void stepOver() throws DebugException
	{
		// TODO
		this.debugThread.stepOver();
	}

	@Override
	public void stepReturn() throws DebugException
	{
		// TODO
		this.debugThread.stepReturn();
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
		this.debugThread.terminate();
	}

	@Override
	public IThread getThread()
	{
		return this.debugThread;
	}

	@Override
	public IVariable[] getVariables() throws DebugException
	{
		List<SDDebuggerVariable<StoryDiagramElement>> variables = new LinkedList<SDDebuggerVariable<StoryDiagramElement>>();

		for (Variable<EClassifier> variable : this.stackFrame.getVariables().values())
		{
			if (variable.getClassifier().eClass() == EcorePackage.Literals.ECLASS)
			{
				variables.add(new SDEObjectVariable<StoryDiagramElement>(this.getSDDebugTarget(), variable.getName(), this,
						(EClass) variable.getClassifier(), (EObject) variable.getValue()));
			}
		}

		return variables.toArray(new SDVariable[variables.size()]);
	}

	@Override
	public boolean hasVariables() throws DebugException
	{
		return true;
	}

	@Override
	public int getLineNumber() throws DebugException
	{
		return -1;
	}

	@Override
	public int getCharStart() throws DebugException
	{
		return -1;
	}

	@Override
	public int getCharEnd() throws DebugException
	{
		return -1;
	}

	@Override
	public abstract String getName() throws DebugException;

	@Override
	public IRegisterGroup[] getRegisterGroups() throws DebugException
	{
		return new IRegisterGroup[] {};
	}

	@Override
	public boolean hasRegisterGroups() throws DebugException
	{
		return false;
	}

	public DebugClientStackFrame<StoryDiagramElement> getStackFrame()
	{
		return this.stackFrame;
	}

	@Override
	public boolean canStepBackOver()
	{
		// TODO
		return this.isSuspended() && !this.isTerminated();
	}

	@Override
	public void stepBackOver() throws DebugException
	{
		// TODO
		this.debugThread.stepBackOver();
	}
}
