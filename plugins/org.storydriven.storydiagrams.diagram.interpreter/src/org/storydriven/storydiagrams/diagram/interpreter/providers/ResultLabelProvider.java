package org.storydriven.storydiagrams.diagram.interpreter.providers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.diagram.custom.providers.ComposedAdapterFactoryLabelProvider;
import org.storydriven.storydiagrams.diagram.interpreter.util.Texts;

public class ResultLabelProvider extends LabelProvider {
	private ComposedAdapterFactoryLabelProvider adlp;
	private EObject object;

	public ResultLabelProvider() {
		adlp = new ComposedAdapterFactoryLabelProvider();
	}

	@Override
	public void dispose() {
		adlp.dispose();
		super.dispose();
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof EClass) {
			return adlp.getImage(object);
		}
		return adlp.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof EClass) {
			return Texts.get(element);
		}

		if (element instanceof EAttribute) {
			StringBuilder builder = new StringBuilder();

			builder.append(Texts.get(element));
			builder.append(' ');
			builder.append('=');
			builder.append(' ');
			builder.append(adlp.getText(object.eGet((EAttribute) element)));

			return builder.toString();
		}
		return adlp.getText(element);
	}

	public void setObject(EObject object) {
		this.object = object;
	}
}
