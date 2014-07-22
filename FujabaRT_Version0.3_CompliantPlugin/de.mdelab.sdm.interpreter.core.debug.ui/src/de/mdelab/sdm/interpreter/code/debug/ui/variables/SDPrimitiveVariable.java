package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugUiStackFrame;

public class SDPrimitiveVariable<StoryDiagramElement extends EObject> extends SDDebuggerVariable<StoryDiagramElement>
{

	private final EDataType	type;
	private Object			value;
	private final String	variableName;

	public SDPrimitiveVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName,
			SDDebugUiStackFrame<StoryDiagramElement> stackFrame, EDataType type, Object value)
	{
		super(target, variableName, stackFrame);

		assert type != null;

		this.type = type;
		this.value = value;
		this.variableName = variableName;
	}

	@Override
	public IValue getValue() throws DebugException
	{
		return new SDPrimitiveValue<StoryDiagramElement>(this.getSDDebugTarget(), this.type, this.value);
	}

	@Override
	public boolean hasValueChanged() throws DebugException
	{
		// TODO
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setValue(String expression) throws DebugException
	{
		/*
		 * Parse the value
		 */
		Object newValue = this.type.getEPackage().getEFactoryInstance().createFromString(this.type, expression);

		/*
		 * Set the value
		 */
		this.value = newValue;

		try
		{
			((SDDebugTarget<StoryDiagramElement, ?>) this.getDebugTarget()).getDebugClient().setVariable(
					this.getStackFrame().getStackFrame(), this.variableName, newValue);
		}
		catch (Exception e)
		{
			this.abort("Could not set variable '" + this.variableName + "'.", e);
		}

		this.fireChangeEvent(org.eclipse.debug.core.DebugEvent.CONTENT);
	}

	@Override
	public void setValue(IValue value) throws DebugException
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean supportsValueModification()
	{
		return this.type.isSerializable();
	}

	@Override
	public boolean verifyValue(String expression) throws DebugException
	{
		/*
		 * Try to parse the value
		 */
		try
		{
			this.type.getEPackage().getEFactoryInstance().createFromString(this.type, expression);

			return true;
		}
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public boolean verifyValue(IValue value) throws DebugException
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
