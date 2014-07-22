package de.mdelab.sdm.interpreter.code.debug.ui.instanceGraph;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

public class SDEditingDomainProviderAdapter extends AdapterImpl implements IEditingDomainProvider
{
	private final EditingDomain	editingDomain;

	public SDEditingDomainProviderAdapter(EditingDomain editingDomain)
	{
		assert editingDomain != null;

		this.editingDomain = editingDomain;
	}

	@Override
	public EditingDomain getEditingDomain()
	{
		return this.editingDomain;
	}

	@Override
	public boolean isAdapterForType(Object type)
	{
		return type == IEditingDomainProvider.class;
	}
}
