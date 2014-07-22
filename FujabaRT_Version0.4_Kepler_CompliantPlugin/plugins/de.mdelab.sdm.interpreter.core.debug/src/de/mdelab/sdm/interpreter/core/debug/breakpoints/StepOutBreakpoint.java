package de.mdelab.sdm.interpreter.core.debug.breakpoints;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.debug.SDDebugger;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StepOutBreakpoint<StoryDiagramElement extends EObject> extends StepBreakpoint<StoryDiagramElement>
{
	private final int	targetStackSize;

	public StepOutBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(debuggingInterpreter);

		this.targetStackSize = Math.max(0, debuggingInterpreter.getExecutionStack().size() - 1);
	}

	@Override
	public boolean evaluate(StoryDiagramElement currentlyExecutedElement, VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		if (this.getDebugger().getExecutionStack().size() == this.targetStackSize)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
