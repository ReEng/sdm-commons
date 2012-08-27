package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugElement;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public abstract class SDVariable<StoryDiagramElement extends EObject> extends SDDebugElement<StoryDiagramElement> implements IVariable
{

	private final String	variableName;

	public SDVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName)
	{
		super(target);

		assert variableName != null;
		assert !"".equals(variableName);

		this.variableName = variableName;
	}

	@Override
	public String getReferenceTypeName() throws DebugException
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() throws DebugException
	{
		return this.variableName;
	}
}
