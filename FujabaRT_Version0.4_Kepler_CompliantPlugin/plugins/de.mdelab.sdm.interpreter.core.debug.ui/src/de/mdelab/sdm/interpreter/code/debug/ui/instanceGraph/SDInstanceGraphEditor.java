package de.mdelab.sdm.interpreter.code.debug.ui.instanceGraph;

import java.util.EventObject;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.IEditorPart;

public abstract class SDInstanceGraphEditor extends EcoreEditor
{
	private ResourceSet		debuggerResourceSet;
	private Set<Resource>	changeableResources;

	public SDInstanceGraphEditor()
	{
		super();

		this.debuggerResourceSet = new ResourceSetImpl();
	}

	@Override
	protected void initializeEditingDomain()
	{
		if (this.debuggerResourceSet == null)
		{
			return;
		}

		/*
		 * Create a transactional editing domain using the factory.
		 */
		this.editingDomain = this.createEditingDomain(this.debuggerResourceSet);

		/*
		 * Add additional adapter factories to the editing domain's adapter
		 * factory. These factories allow modifying the instance graph if
		 * dynamic objects are used.
		 */
		this.adapterFactory = (ComposedAdapterFactory) this.editingDomain.getAdapterFactory();

		this.adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		this.adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		this.adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		/*
		 * Add a listener to set the most recent command's affected objects to
		 * be the selection of the viewer with focus.
		 */

		this.editingDomain.getCommandStack().addCommandStackListener(new CommandStackListener()
		{
			@Override
			public void commandStackChanged(final EventObject event)
			{
				if (!SDInstanceGraphEditor.this.getContainer().isDisposed())
				{
					SDInstanceGraphEditor.this.getContainer().getDisplay().asyncExec(new Runnable()
					{
						@Override
						public void run()
						{
							SDInstanceGraphEditor.this.firePropertyChange(IEditorPart.PROP_DIRTY);

							// Try to select the affected objects.
							//
							final Command mostRecentCommand = ((CommandStack) event.getSource()).getMostRecentCommand();
							if (mostRecentCommand != null)
							{
								SDInstanceGraphEditor.this.setSelectionToViewer(mostRecentCommand.getAffectedObjects());
							}
							// if (SDInstanceGraphEditor.this.propertySheetPage
							// != null
							// &&
							// !SDInstanceGraphEditor.this.propertySheetPage.getControl().isDisposed())
							// {
							// SDInstanceGraphEditor.this.propertySheetPage.refresh();
							// }
						}
					});
				}
			}
		});

		/*
		 * Attach an editing domain provider adapter. This adapter is required
		 * so that the EMF tree editor encapsulates modification operations in
		 * commands.
		 */
		this.debuggerResourceSet.eAdapters().add(new SDEditingDomainProviderAdapter(this.editingDomain));
	}

	protected abstract AdapterFactoryEditingDomain createEditingDomain(ResourceSet debuggerResourceSet2);

	@Override
	public void createModel()
	{
		if (this.getEditorInput() instanceof SDInstanceGraphResourceSetEditorInput)
		{
			this.debuggerResourceSet = ((SDInstanceGraphResourceSetEditorInput) this.getEditorInput()).getResourceSet();

			assert this.debuggerResourceSet != null;

			/*
			 * Reinitialize the editing domain
			 */
			this.initializeEditingDomain();
		}

		super.createModel();
	}

	@Override
	public void createModelGen()
	{
		// Do nothing
	}

	@Override
	public String getTitle()
	{
		return "Story Diagram Debugger Instance Graph";
	}

	@Override
	public String getTitleToolTip()
	{
		return this.getTitle();
	}

	@Override
	public boolean isDirty()
	{
		return false;
	}

	@Override
	public boolean isSaveAsAllowed()
	{
		return false;
	}

	@Override
	public boolean isSaveOnCloseNeeded()
	{
		return false;
	}

	public void setReadOnly(final boolean readOnly)
	{
		/*
		 * Display.getDefault().syncExec(new Runnable()
		 */
		if (readOnly)
		{
			this.changeableResources = new HashSet<Resource>();

			/*
			 * Save all changeable resources and set them to readonly
			 */
			for (final Entry<Resource, Boolean> entry : this.editingDomain.getResourceToReadOnlyMap().entrySet())
			{
				if (!entry.getValue())
				{
					this.changeableResources.add(entry.getKey());

					entry.setValue(false);
				}
			}
		}
		else
		{
			if (this.changeableResources != null)
			{
				for (final Resource r : this.changeableResources)
				{
					this.editingDomain.getResourceToReadOnlyMap().put(r, false);
				}

				this.changeableResources = null;
			}
		}
	}
}
