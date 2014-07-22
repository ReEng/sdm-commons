package de.mdelab.sdm.interpreter.code.debug.ui.instanceGraph;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class SDInstanceGraphResourceSetEditorInput implements IEditorInput
{
	private final ResourceSet	resourceSet;

	public SDInstanceGraphResourceSetEditorInput(ResourceSet resourceSet)
	{
		assert resourceSet != null;

		this.resourceSet = resourceSet;
	}

	public ResourceSet getResourceSet()
	{
		return this.resourceSet;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
	{
		return null;
	}

	@Override
	public boolean exists()
	{
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor()
	{
		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName()
	{
		return "Story Diagram Debugger Instance Graph";
	}

	@Override
	public IPersistableElement getPersistable()
	{
		return null;
	}

	@Override
	public String getToolTipText()
	{
		return this.getName();
	}
}
