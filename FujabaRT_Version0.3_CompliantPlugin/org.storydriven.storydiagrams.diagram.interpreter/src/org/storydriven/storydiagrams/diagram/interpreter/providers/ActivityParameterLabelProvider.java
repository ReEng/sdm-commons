package org.storydriven.storydiagrams.diagram.interpreter.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ActivityParameterLabelProvider extends LabelProvider implements ITableLabelProvider {
	private AdapterFactoryLabelProvider aflp;

	public ActivityParameterLabelProvider() {
		Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		AdapterFactory adapterFactory = new ComposedAdapterFactory(registry);
		aflp = new AdapterFactoryLabelProvider(adapterFactory);
	}

	@Override
	public void dispose() {
		aflp.dispose();
		super.dispose();
	}

	@Override
	public Image getColumnImage(Object element, int index) {
		if (index == 0) {
			return DiagramImages.getImage(DiagramImages.EPARAMETER_IN);
		} else if (index == 1) {
			if (element instanceof Variable<?>) {
				return aflp.getImage(((Variable<?>) element).getValue());
			}
		}

		return null;
	}

	@Override
	public String getColumnText(Object element, int index) {
		if (element instanceof Variable<?>) {
			Variable<?> variable = (Variable<?>) element;

			if (index == 0) {
				StringBuilder builder = new StringBuilder();

				builder.append(variable.getName());
				builder.append(' ');
				builder.append(':');
				builder.append(' ');
				if (variable.getClassifier() instanceof EClassifier) {
					EcoreTextUtil.append(builder, (EClassifier) variable.getClassifier());
				}

				return builder.toString();
			} else if (index == 1) {
				return aflp.getText(variable.getValue());
			}
		}
		return getText(element);
	}
}
