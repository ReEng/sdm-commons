package org.storydriven.storydiagrams.ui.interpreter.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogSettings;

public class InterpreterConfiguration {
	/**
	 * The maximal number of configuration that should be saved. The oldest used will potentially be overwritten.
	 */
	private static final int SETTINGS_COUNT_ACTIVITIES = 10;

	private static final String SETTINGS_PREFIX_CONFIGURATION = "configuration."; //$NON-NLS-1$

	private static final String SETTINGS_NAME_ACTIVITY = "activity"; //$NON-NLS-1$
	private static final String SETTINGS_NAME_RESOURCES = "resources"; //$NON-NLS-1$
	private static final String SETTINGS_NAME_PARAMETERS = "parameters"; //$NON-NLS-1$

	private URI activity;

	private final List<URI> resources;
	private final Map<URI, String> parameters;

	public InterpreterConfiguration() {
		resources = new ArrayList<URI>();
		parameters = new LinkedHashMap<URI, String>();
	}

	public void toSettings(IDialogSettings settings) {
		if (getActivityUri() == null) {
			return;
		}

		// TODO: adapt to multiple last cfgs
		// activity
		settings.put(SETTINGS_NAME_ACTIVITY, getActivityUri().toString());

		// resources
		Collection<URI> resourceUris = getResourceUris();
		String[] resources = new String[resourceUris.size()];
		int i = 0;
		for (URI resourceUri : resourceUris) {
			resources[i] = resourceUri.toString();
			i++;
		}
		settings.put(SETTINGS_NAME_RESOURCES, resources);

		// parameters
		IDialogSettings parameterSettings = settings.getSection(SETTINGS_NAME_PARAMETERS);
		if (parameterSettings == null) {
			parameterSettings = settings.addNewSection(SETTINGS_NAME_PARAMETERS);
		}

		Map<URI, String> parameters = getParameters();
		int parameterIndex = 0;
		for (URI key : parameters.keySet()) {
			String value = parameters.get(key);

			String[] values = new String[] { key.toString(), value };
			parameterSettings.put(String.valueOf(parameterIndex), values);
			parameterIndex++;
		}
	}

	public URI getActivityUri() {
		return activity;
	}

	public List<URI> getResourceUris() {
		return resources;
	}

	public Map<URI, String> getParameters() {
		return parameters;
	}

	public static final InterpreterConfiguration fromSettings(IDialogSettings settings, URI activityUri) {

		// go through all possible sections
		for (int i = 0; i < SETTINGS_COUNT_ACTIVITIES; i++) {
			// get settings or break
			IDialogSettings cfgSettings = settings.getSection(SETTINGS_PREFIX_CONFIGURATION + i);
			if (cfgSettings != null) {
				// step over other activities
				String activityString = cfgSettings.get(SETTINGS_NAME_ACTIVITY);
				if (activityString != null && activityString.equals(activityUri.toString())) {
					// TODO: adapt to multiple last cfgs
					InterpreterConfiguration configuration = new InterpreterConfiguration();

					// activity
					configuration.setActivityUri(activityUri);

					// load resources
					Collection<URI> resourceUris = new ArrayList<URI>();
					String[] resourceStrings = settings.getArray(SETTINGS_NAME_RESOURCES);
					for (String resourceString : resourceStrings) {
						resourceUris.add(URI.createURI(resourceString));
					}

					// parameters
					Map<URI, Object> parameters = new LinkedHashMap<URI, Object>();
					IDialogSettings parametersSection = settings.getSection(SETTINGS_NAME_PARAMETERS);
					if (parametersSection != null) {
						int parameterIndex = 0;
						String[] value = parametersSection.getArray(String.valueOf(parameterIndex));
						while (value != null) {
							parameters.put(URI.createURI(value[0]), URI.createURI(value[1]));
							value = parametersSection.getArray(String.valueOf(parameterIndex++));
						}
					}

					return configuration;
				}
			}
		}

		return new InterpreterConfiguration();
	}

	public Object getParameterValue(URI parameter) {
		return parameters.get(parameter);
	}

	public void setActivityUri(URI activityUri) {
		this.activity = activityUri;
	}

	public void setParameter(URI parameter, String value) {
		parameters.put(parameter, value);
	}
}
