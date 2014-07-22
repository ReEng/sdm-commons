package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugElement;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public abstract class SDValue<StoryDiagramElement extends EObject> extends SDDebugElement<StoryDiagramElement> implements IValue
{

	public SDValue(SDDebugTarget<StoryDiagramElement, ?> target)
	{
		super(target);
	}

	@Override
	public boolean isAllocated() throws DebugException
	{
		return true;
	}

}
