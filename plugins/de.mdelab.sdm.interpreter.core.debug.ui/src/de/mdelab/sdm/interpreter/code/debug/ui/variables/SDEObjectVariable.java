package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugUiStackFrame;

public class SDEObjectVariable<StoryDiagramElement extends EObject> extends SDDebuggerVariable<StoryDiagramElement>
{

	private final EObject	eObject;
	private final EClass	eClass;

	public SDEObjectVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName,
			SDDebugUiStackFrame<StoryDiagramElement> stackFrame, EClass eClass, EObject eObject)
	{
		super(target, variableName, stackFrame);

		assert eClass != null;

		this.eClass = eClass;
		this.eObject = eObject;

		/*
		 * If the variable's value is not null, use the specific eClass of the
		 * eObject. The separately provided eClass may be more general.
		 */
		if (eObject != null)
		{
			eClass = eObject.eClass();
		}
	}

	@Override
	public IValue getValue() throws DebugException
	{
		return new SDEObjectValue<StoryDiagramElement>(this.getSDDebugTarget(), this.eClass, this.eObject);
	}

	@Override
	public boolean hasValueChanged() throws DebugException
	{
		return false;
	}

	@Override
	public void setValue(String expression) throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void setValue(IValue value) throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean supportsValueModification()
	{
		return false;
	}

	@Override
	public boolean verifyValue(String expression) throws DebugException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean verifyValue(IValue value) throws DebugException
	{
		throw new UnsupportedOperationException();
	}

}
