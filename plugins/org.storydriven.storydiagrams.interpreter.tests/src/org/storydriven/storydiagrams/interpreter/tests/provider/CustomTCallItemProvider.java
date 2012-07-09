package org.storydriven.storydiagrams.interpreter.tests.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.interpreter.tests.util.ImageUtil;
import org.storydriven.storydiagrams.interpreter.tests.util.TextUtil;

public class CustomTCallItemProvider extends TMethodCallStatementItemProvider {
	public CustomTCallItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public String getText(Object element) {
		return TextUtil.getText(element);
	}

	@Override
	public Object getImage(Object element) {
		return ImageUtil.getImage(element);
	}
}
