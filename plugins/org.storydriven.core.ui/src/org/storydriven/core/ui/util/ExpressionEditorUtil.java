package org.storydriven.core.ui.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.storydriven.core.ui.IExpressionEditor;

public class ExpressionEditorUtil {
	private static Map<String, IExpressionEditor> editors;

	public static IExpressionEditor getEditor(String language, String version) {
		return getEditors().get(getKey(language, version));
	}

	private static String getKey(String language, String version) {
		return language + version;
	}

	private static Map<String, IExpressionEditor> getEditors() {
		if (editors == null) {
			editors = new HashMap<String, IExpressionEditor>();

			// read them
			IConfigurationElement[] configurationElements = Platform
					.getExtensionRegistry().getConfigurationElementsFor(
							IExpressionEditor.ID_EXTENSION);

			for (IConfigurationElement ce : configurationElements) {
				String language = ce
						.getAttribute(IExpressionEditor.ID_ATTRIBUTE_LANGUAGE);
				String version = ce
						.getAttribute(IExpressionEditor.ID_ATTRIBUTE_VERSION);

				try {
					IExpressionEditor editor = (IExpressionEditor) ce
							.createExecutableExtension(IExpressionEditor.ID_ATTRIBUTE_CLASS);
					editors.put(getKey(language, version), editor);
				} catch (CoreException e) {
					// show error message
					e.printStackTrace();
				}
			}
		}
		return editors;
	}
}
