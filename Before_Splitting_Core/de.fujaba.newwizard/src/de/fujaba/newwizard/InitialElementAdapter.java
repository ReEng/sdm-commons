package de.fujaba.newwizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

// Copied from CanonicalEditPolicy$CanonicalElementAdapter.
public class InitialElementAdapter extends EObjectAdapter {
	private String _hint;
	
	/**
	 * constructor
	 * @param element
	 * @param hint
	 */
	public InitialElementAdapter( EObject element, String hint ) {
		super(element);
		_hint = hint;
	}
	
	/** Adds <code>String.class</tt> adaptablity. */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) { 
		if ( adapter.equals(String.class) ) {
			return _hint;
		}
		return super.getAdapter(adapter);
	}
}