package org.storydriven.storydiagrams.diagram.interpreter.providers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.diagram.interpreter.util.Texts;

import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.upb.swt.core.ui.providers.ComposedAdapterFactoryLabelProvider;

public class ResultLabelProvider extends ComposedAdapterFactoryLabelProvider {
	private Variable<?> variable;

	public void setResult(Variable<?> variable) {
		this.variable = variable;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof EAttribute && variable != null && !element.equals(variable.getValue())) {
			StringBuilder builder = new StringBuilder();

			builder.append(Texts.get(element));
			builder.append(' ');
			builder.append('=');
			builder.append(' ');

			if (variable != null) {
				if (variable.getValue() instanceof EObject) {
					builder.append(((EObject) variable.getValue()).eGet((EAttribute) element, true));
				} else {
					builder.append(variable.getValue());
				}
			} else {
				builder.append('?');
			}

			return builder.toString();
		}

		if (element instanceof EObject) {
			return Texts.get(element).toString();
		}

		if (variable != null) {
			StringBuilder builder = new StringBuilder();

			builder.append(Texts.get(variable.getClassifier()));
			builder.append(' ');
			builder.append('=');
			builder.append(' ');
			builder.append(variable.getValue());

			return builder.toString();
		}

		return String.valueOf(variable);
	}
}
