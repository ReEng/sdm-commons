package de.fujaba.newwizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

// Copied from CanonicalEditPolicy$CanonicalElementAdapter.
public class InitialElementAdapter extends EObjectAdapter {
	private String hint;

	public InitialElementAdapter( EObject element, String hint ) {
		super(element);
		this.hint = hint;
	}
	
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) { 
		if ( adapter.equals(String.class) ) {
			return hint;
		}
		return super.getAdapter(adapter);
	}
}