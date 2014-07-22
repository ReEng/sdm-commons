package de.mdelab.sdm.interpreter.code.debug.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.emf.ecore.EObject;

public abstract class SDDebugElement<StoryDiagramElement extends EObject> extends DebugElement
{
	private final SDDebugTarget<StoryDiagramElement, ?>	sdDebugTarget;

	public SDDebugElement(SDDebugTarget<StoryDiagramElement, ?> target)
	{
		super(target);

		this.sdDebugTarget = target;
	}

	@Override
	public String getModelIdentifier()
	{
		return SDDebugUiConstants.DEBUG_MODEL_IDENTIFIER;
	}

	protected void abort(String message, Throwable e) throws DebugException
	{
		throw new DebugException(new Status(IStatus.ERROR, SDDebugUiPlugin.PLUGIN_ID, DebugPlugin.INTERNAL_ERROR, message, e));
	}

	public SDDebugTarget<StoryDiagramElement, ?> getSDDebugTarget()
	{
		return this.sdDebugTarget;
	}
}
