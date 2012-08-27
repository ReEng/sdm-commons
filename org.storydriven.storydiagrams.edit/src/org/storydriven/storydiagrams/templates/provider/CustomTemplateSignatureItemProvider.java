package org.storydriven.storydiagrams.templates.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomTemplateSignatureItemProvider extends TemplateSignatureItemProvider {
	public CustomTemplateSignatureItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("templates/TemplateSignature.png"); //$NON-NLS-1$
	}
}
