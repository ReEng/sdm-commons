package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public class SDListValue<StoryDiagramElement extends EObject> extends SDValue<StoryDiagramElement>
{

	private final IVariable[]	variables;

	public SDListValue(SDDebugTarget<StoryDiagramElement, ?> target, IVariable[] variables)
	{
		super(target);

		assert variables != null;

		this.variables = variables;
	}

	@Override
	public String getReferenceTypeName() throws DebugException
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getValueString() throws DebugException
	{
		return "size: " + this.variables.length;
	}

	@Override
	public IVariable[] getVariables() throws DebugException
	{
		return this.variables;
	}

	@Override
	public boolean hasVariables() throws DebugException
	{
		return this.variables.length > 0;
	}

}
