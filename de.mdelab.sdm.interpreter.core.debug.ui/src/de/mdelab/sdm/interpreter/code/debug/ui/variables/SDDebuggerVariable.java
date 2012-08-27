package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugUiStackFrame;

public abstract class SDDebuggerVariable<StoryDiagramElement extends EObject> extends SDVariable<StoryDiagramElement>
{

	private final SDDebugUiStackFrame<StoryDiagramElement>	stackFrame;

	public SDDebuggerVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName,
			SDDebugUiStackFrame<StoryDiagramElement> stackFrame)
	{
		super(target, variableName);

		assert stackFrame != null;

		this.stackFrame = stackFrame;
	}

	public SDDebugUiStackFrame<StoryDiagramElement> getStackFrame()
	{
		return this.stackFrame;
	}

}
