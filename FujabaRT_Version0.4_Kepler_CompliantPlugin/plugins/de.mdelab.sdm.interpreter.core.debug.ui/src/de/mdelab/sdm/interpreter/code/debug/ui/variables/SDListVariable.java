package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public class SDListVariable<StoryDiagramElement extends EObject> extends SDFeatureVariable<StoryDiagramElement>
{

	public SDListVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName, EObject containingEObject,
			EStructuralFeature containingFeature)
	{
		super(target, variableName, containingEObject, containingFeature);
	}

	@Override
	public IValue getValue() throws DebugException
	{
		List<SDVariable<StoryDiagramElement>> variables = new LinkedList<SDVariable<StoryDiagramElement>>();

		@SuppressWarnings("unchecked")
		List<EObject> featureValues = (List<EObject>) this.getContainingEObject().eGet(this.getContainingFeature());

		for (int i = 0; i < featureValues.size(); i++)
		{
			if (this.getContainingFeature().eClass() == EcorePackage.Literals.EREFERENCE)
			{
				EObject e = featureValues.get(i);
				variables.add(new SDEObjectFeatureVariable<StoryDiagramElement>(this.getSDDebugTarget(), "[" + i + "]", this
						.getContainingEObject(), this.getContainingFeature(), e.eClass(), e));
			}
			else if (this.getContainingFeature().eClass() == EcorePackage.Literals.EATTRIBUTE)
			{
				Object o = featureValues.get(i);

				variables.add(new SDPrimitiveFeatureVariable<StoryDiagramElement>(this.getSDDebugTarget(), "[" + i + "]", this
						.getContainingEObject(), this.getContainingFeature(), (EDataType) this.getContainingFeature().getEType(), o));
			}
			else
			{
				throw new UnsupportedOperationException();
			}
		}

		return new SDListValue<StoryDiagramElement>(this.getSDDebugTarget(), variables.toArray(new IVariable[variables.size()]));

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
