package de.mdelab.sdm.interpreter.core.debug.breakpoints;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.debug.SDDebugger;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StepIntoBreakpoint<StoryDiagramElement extends EObject> extends StepBreakpoint<StoryDiagramElement>
{

	public StepIntoBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(debuggingInterpreter);
	}

	@Override
	public boolean evaluate(StoryDiagramElement currentlyExecutedElement, VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		return true;
	}

}
