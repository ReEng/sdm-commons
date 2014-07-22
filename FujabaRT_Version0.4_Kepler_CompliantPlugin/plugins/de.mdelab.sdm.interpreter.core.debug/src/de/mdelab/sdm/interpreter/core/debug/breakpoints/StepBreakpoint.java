package de.mdelab.sdm.interpreter.core.debug.breakpoints;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.debug.SDDebugger;

public abstract class StepBreakpoint<StoryDiagramElement extends EObject> extends Breakpoint<StoryDiagramElement>
{

	public StepBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(debuggingInterpreter, Breakpoint.ANY_ELEMENT_UUID);
	}

}
