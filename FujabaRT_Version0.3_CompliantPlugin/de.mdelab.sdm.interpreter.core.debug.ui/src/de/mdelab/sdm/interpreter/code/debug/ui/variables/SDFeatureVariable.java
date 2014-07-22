package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public abstract class SDFeatureVariable<StoryDiagramElement extends EObject> extends SDVariable<StoryDiagramElement>
{

	private final EStructuralFeature	containingFeature;
	private final EObject				containingEObject;

	public SDFeatureVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName, EObject containingEObject,
			EStructuralFeature containingFeature)
	{
		super(target, variableName);

		assert containingEObject != null;
		assert containingFeature != null;

		this.containingEObject = containingEObject;
		this.containingFeature = containingFeature;
	}

	public EObject getContainingEObject()
	{
		return this.containingEObject;
	}

	public EStructuralFeature getContainingFeature()
	{
		return this.containingFeature;
	}
}
