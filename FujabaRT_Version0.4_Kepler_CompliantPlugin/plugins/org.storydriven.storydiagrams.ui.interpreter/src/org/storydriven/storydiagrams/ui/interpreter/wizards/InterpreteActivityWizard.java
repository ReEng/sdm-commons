package org.storydriven.storydiagrams.ui.interpreter.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.storydriven.storydiagrams.ui.interpreter.Activator;

public class InterpreteActivityWizard extends Wizard {
	// settings

	private InterpreterConfiguration configuration;

	private InterpreterWizardInputPage inputPage;
	private InterpreterWizardExecutionPage executionPage;
	private InterpreterWizardResultPage resultPage;

	private ResourceSet originalResourceSet;
	private ResourceSet workingResourceSet;

	private IFile file;

	public InterpreteActivityWizard(IFile file, URI activityUri) {
		this.file = file;

		// resolve settings
		String settingsKey = InterpreteActivityWizard.class.getCanonicalName();
		IDialogSettings pluginDialogSettings = Activator.get().getDialogSettings();
		IDialogSettings wizardDialogSettings = pluginDialogSettings.getSection(settingsKey);
		if (wizardDialogSettings == null) {
			wizardDialogSettings = pluginDialogSettings.addNewSection(settingsKey);
		}
		setDialogSettings(wizardDialogSettings);

		setWindowTitle("Interprete Activity");
		// TODO: add wizard banner image
		// setDefaultPageImageDescriptor(null);

		// create interpreter configuration
		if (activityUri == null) {
			configuration = new InterpreterConfiguration();
		} else {
			configuration = InterpreterConfiguration.fromSettings(wizardDialogSettings, activityUri);
		}
	}

	public ResourceSet getOriginalResourceSet() {
		if (originalResourceSet == null) {
			originalResourceSet = new ResourceSetImpl();

			// copy from working resource set
			for (Resource resource : getWorkingResourceSet().getResources()) {
				originalResourceSet.getResource(resource.getURI(), true);
			}
		}
		return originalResourceSet;
	}

	public ResourceSet getWorkingResourceSet() {
		if (workingResourceSet == null) {
			workingResourceSet = new ResourceSetImpl();
		}
		return workingResourceSet;
	}

	@Override
	public boolean performCancel() {
		configuration.toSettings(getDialogSettings());

		return super.performCancel();
	}

	@Override
	public boolean performFinish() {
		configuration.toSettings(getDialogSettings());

		return true;
	}

	@Override
	public void addPages() {
		inputPage = new InterpreterWizardInputPage(file);
		executionPage = new InterpreterWizardExecutionPage();
		resultPage = new InterpreterWizardResultPage();

		addPage(inputPage);
		addPage(executionPage);
		addPage(resultPage);
	}

	public InterpreterConfiguration getConfiguration() {
		return configuration;
	}
}
