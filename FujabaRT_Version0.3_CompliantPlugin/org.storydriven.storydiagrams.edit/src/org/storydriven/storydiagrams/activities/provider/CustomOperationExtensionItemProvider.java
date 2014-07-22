package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomOperationExtensionItemProvider extends OperationExtensionItemProvider {
	public CustomOperationExtensionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/OperationExtension.png"); //$NON-NLS-1$
	}
}
