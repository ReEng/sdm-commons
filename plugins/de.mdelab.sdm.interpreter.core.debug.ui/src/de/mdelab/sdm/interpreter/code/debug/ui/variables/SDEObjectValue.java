package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public class SDEObjectValue<StoryDiagramElement extends EObject> extends SDValue<StoryDiagramElement>
{
	private final EObject	eObject;
	private final EClass	eClass;

	public SDEObjectValue(SDDebugTarget<StoryDiagramElement, ?> target, EClass eClass, EObject eObject)
	{
		super(target);

		assert eClass != null;

		this.eClass = eClass;
		this.eObject = eObject;
	}

	@Override
	public String getReferenceTypeName() throws DebugException
	{
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public String getValueString() throws DebugException
	{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.eClass.getName());

		stringBuilder.append(" (");

		if (this.eObject == null)
		{
			stringBuilder.append("null");
		}
		else
		{
			stringBuilder.append(this.eObject.toString());
		}

		stringBuilder.append(")");

		return stringBuilder.toString();
	}

	@Override
	public IVariable[] getVariables() throws DebugException
	{
		List<SDVariable<StoryDiagramElement>> variables = new LinkedList<SDVariable<StoryDiagramElement>>();

		for (EStructuralFeature feature : this.eClass.getEAllStructuralFeatures())
		{
			if (feature.eClass() == EcorePackage.Literals.EATTRIBUTE)
			{
				if (!feature.isMany())
				{
					Object o = this.eObject.eGet(feature);

					variables.add(new SDPrimitiveFeatureVariable<StoryDiagramElement>(this.getSDDebugTarget(), feature.getName(),
							this.eObject, feature, (EDataType) feature.getEType(), o));
				}
				else
				{
					variables
							.add(new SDListVariable<StoryDiagramElement>(this.getSDDebugTarget(), feature.getName(), this.eObject, feature));
				}
			}
			else if (feature.eClass() == EcorePackage.Literals.EREFERENCE)
			{
				if (!feature.isMany())
				{
					EObject e = (EObject) this.eObject.eGet(feature);

					variables.add(new SDEObjectFeatureVariable<StoryDiagramElement>(this.getSDDebugTarget(), feature.getName(),
							this.eObject, feature, (EClass) feature.getEType(), e));
				}
				else
				{
					variables
							.add(new SDListVariable<StoryDiagramElement>(this.getSDDebugTarget(), feature.getName(), this.eObject, feature));
				}
			}
			else
			{
				throw new UnsupportedOperationException();
			}
		}

		return variables.toArray(new IVariable[variables.size()]);
	}

	@Override
	public boolean hasVariables() throws DebugException
	{
		return this.eObject != null && !this.eClass.getEStructuralFeatures().isEmpty();
	}

}
