package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public class SDPrimitiveValue<StoryDiagramElement extends EObject> extends SDValue<StoryDiagramElement>
{

	private final Object	value;

	// private final EDataType type;

	public SDPrimitiveValue(SDDebugTarget<StoryDiagramElement, ?> target, EDataType type, Object value)
	{
		super(target);

		// assert type != null;

		this.value = value;
		// this.type = type;
	}

	@Override
	public String getReferenceTypeName() throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String getValueString() throws DebugException
	{
		return this.value.toString();
	}

	@Override
	public IVariable[] getVariables() throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasVariables() throws DebugException
	{
		return false;
	}
}
