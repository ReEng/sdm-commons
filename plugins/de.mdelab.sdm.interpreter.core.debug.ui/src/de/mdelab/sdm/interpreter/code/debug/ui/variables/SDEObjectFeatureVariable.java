package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public class SDEObjectFeatureVariable<StoryDiagramElement extends EObject> extends SDFeatureVariable<StoryDiagramElement>
{

	private final EClass	eClass;
	private final EObject	eObject;

	public SDEObjectFeatureVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName, EObject containingEObject,
			EStructuralFeature containingFeature, EClass eClass, EObject eObject)
	{
		super(target, variableName, containingEObject, containingFeature);

		assert eClass != null;

		this.eClass = eClass;
		this.eObject = eObject;
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
