package de.mdelab.sdm.interpreter.code.debug.ui;

import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.ui.ISourcePresentation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorInput;

public abstract class SDDebugSourceLocator<StoryDiagramElement extends EObject> extends SDDebugElement<StoryDiagramElement> implements
		ISourceLocator, ISourcePresentation
{

	public SDDebugSourceLocator(SDDebugTarget<StoryDiagramElement, ?> target)
	{
		super(target);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getSourceElement(IStackFrame stackFrame)
	{
		assert stackFrame instanceof SDDebugUiStackFrame;

		return ((SDDebugUiStackFrame<StoryDiagramElement>) stackFrame).getStackFrame().getStoryDiagramElement();
	}

	@Override
	public abstract IEditorInput getEditorInput(Object element);

	@Override
	public abstract String getEditorId(IEditorInput input, Object element);
}
