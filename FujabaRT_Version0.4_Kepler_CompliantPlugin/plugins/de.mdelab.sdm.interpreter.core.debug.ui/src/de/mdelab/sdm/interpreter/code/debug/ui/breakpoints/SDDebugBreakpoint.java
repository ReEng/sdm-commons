package de.mdelab.sdm.interpreter.code.debug.ui.breakpoints;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.Breakpoint;
import org.eclipse.debug.core.model.IBreakpoint;

public abstract class SDDebugBreakpoint extends Breakpoint
{
	public static final String	ELEMENT_UUID		= "elementUUID";
	public static final String	ELEMENT_NAME		= "elementName";
	public static final String	ELEMENT_URI			= "elementURI";
	public static final String	EXPRESSION			= "expression";
	public static final String	EXPRESSION_LANGUAGE	= "expressionLanguage";

	public SDDebugBreakpoint()
	{

	}

	public SDDebugBreakpoint(final String elementUUID, final String elementName, final String uri, final String expression, final String expressionLanguage) throws DebugException
	{
		assert elementUUID != null;

		assert expression != null && expressionLanguage != null || expression == null && expressionLanguage == null;

		IWorkspaceRunnable runnable = new IWorkspaceRunnable()
		{
			@Override
			public void run(IProgressMonitor monitor) throws CoreException
			{
				IMarker marker = ResourcesPlugin.getWorkspace().getRoot().createMarker(SDDebugBreakpoint.this.getBreakpointMarkerID());

				SDDebugBreakpoint.this.setMarker(marker);
				SDDebugBreakpoint.this.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				SDDebugBreakpoint.this.setAttribute(ELEMENT_UUID, elementUUID);
				SDDebugBreakpoint.this.setAttribute(ELEMENT_NAME, elementName);
				SDDebugBreakpoint.this.setAttribute(ELEMENT_URI, uri);
				SDDebugBreakpoint.this.setAttribute(EXPRESSION, expression);
				SDDebugBreakpoint.this.setAttribute(EXPRESSION_LANGUAGE, expressionLanguage);
				SDDebugBreakpoint.this.setAttribute(IBreakpoint.ID, SDDebugBreakpoint.this.getModelIdentifier());
				SDDebugBreakpoint.this.setAttribute(IMarker.MESSAGE, "Element Breakpoint: " + elementUUID);

			}
		};

		this.run(this.getMarkerRule(ResourcesPlugin.getWorkspace().getRoot()), runnable);
	}

	@Override
	public abstract String getModelIdentifier();

	protected abstract String getBreakpointMarkerID();

	public String getElementUUID()
	{
		return this.getMarker().getAttribute(ELEMENT_UUID, null);
	}

	public void setElementUUID(String elementUUID) throws CoreException
	{
		this.setAttribute(ELEMENT_UUID, elementUUID);
	}
	
	public String getElementName()
	{
		return this.getMarker().getAttribute(ELEMENT_NAME, null);
	}

	public void setElementName(String elementName) throws CoreException
	{
		this.setAttribute(ELEMENT_NAME, elementName);
	}
	
	public String getElementURI()
	{
		return this.getMarker().getAttribute(ELEMENT_URI, null);
	}

	public void setElementURI(String uri) throws CoreException
	{
		this.setAttribute(ELEMENT_URI, uri);
	}


	public String getExpressionLanguage()
	{
		return this.getMarker().getAttribute(EXPRESSION_LANGUAGE, null);
	}

	public void setExpressionLanguage(String expressionLanguage) throws CoreException
	{
		this.setAttribute(EXPRESSION_LANGUAGE, expressionLanguage);
	}

	public String getExpression()
	{
		return this.getMarker().getAttribute(EXPRESSION, null);
	}

	public void setExpression(String expression) throws CoreException
	{
		this.setAttribute(EXPRESSION, expression);
	}

	private String	breakpointUUID;

	public String getBreakpointUUID()
	{
		return this.breakpointUUID;
	}

	public void setBreakpointUUID(String breakpointUUID)
	{
		this.breakpointUUID = breakpointUUID;
	}
}
