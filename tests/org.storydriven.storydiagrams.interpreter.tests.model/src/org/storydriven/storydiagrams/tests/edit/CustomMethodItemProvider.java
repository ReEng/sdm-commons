package org.storydriven.storydiagrams.tests.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.tests.Type;
import org.storydriven.storydiagrams.tests.Typed;

public class CustomMethodItemProvider extends MethodItemProvider {
	public CustomMethodItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public String getText(Object object) {
		StringBuilder builder = new StringBuilder();

		builder.append(((Typed) object).getName());
		builder.append(' ');
		builder.append(':');
		builder.append(' ');
		Type type = ((Typed) object).getType();
		if (type != null) {
			builder.append(type.getName());
		} else {
			builder.append(type);
		}

		return builder.toString();
	}

	@Override
	public Object getImage(Object object) {
		return getImage("method.png"); //$NON-NLS-1$
	}
}
