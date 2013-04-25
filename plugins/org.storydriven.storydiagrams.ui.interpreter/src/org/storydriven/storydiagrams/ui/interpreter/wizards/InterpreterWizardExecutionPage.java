package org.storydriven.storydiagrams.ui.interpreter.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.console.TextConsoleViewer;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.ui.interpreter.util.InterpreterConsole;
import org.storydriven.storydiagrams.ui.interpreter.util.InterpreterConsole.StreamType;
import org.storydriven.storydiagrams.ui.interpreter.util.InterpreterRunnable;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class InterpreterWizardExecutionPage extends WizardPage {
	private InterpreterConsole console;

	private TextConsoleViewer viewer;
	private Map<String, Variable<EClassifier>> results;
	private Object throwable;

	protected InterpreterWizardExecutionPage() {
		super(InterpreterWizardExecutionPage.class.getCanonicalName());

		console = new InterpreterConsole();

		setTitle("Interpreting...");
		setDescription("Analyze the notifications of the interpreting activity.");
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);

		if (visible) {
			InterpreterConfiguration configuration = getWizard().getConfiguration();

			// clear
			console.clearConsole();
			results = null;
			throwable = null;

			// prepare resource set
			ResourceSet resourceSet = getWorkingResourceSet();

			// load activity
			Resource activityResource = resourceSet.getResource(configuration.getActivityUri().trimFragment(), true);
			Activity activity = (Activity) activityResource.getEObject(configuration.getActivityUri().fragment());
			console.append(StreamType.INFO, "Loaded activity " + configuration.getActivityUri());

			// load resources
			for (URI uri : configuration.getResourceUris()) {
				resourceSet.getResource(uri, true);
				console.append(StreamType.INFO, "Loaded resource " + uri);
			}

			// prepare parameters
			List<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();
			for (URI parameterUri : configuration.getParameters().keySet()) {
				Resource resource = resourceSet.getResource(parameterUri.trimFragment(), true);
				EParameter parameter = (EParameter) resource.getEObject(parameterUri.fragment());

				Object value = configuration.getParameters().get(parameterUri);
				if (value != null) {
					if (parameter.getEType() instanceof EClass) {
						Resource valueResource = resourceSet.getResource(((URI) value).trimFragment(), true);
						value = valueResource.getEObject(((URI) value).fragment());
					} else {
						String stringValue = (String) value;
						value = EcoreUtil.createFromString((EDataType) parameter.getEType(), stringValue);
					}
				}

				parameters.add(new Variable<EClassifier>(parameter.getName(), parameter.getEType(), value));
			}

			try {
				InterpreterRunnable runnable = new InterpreterRunnable(activity, parameters, console);
				getContainer().run(true, true, runnable);
				results = runnable.getResults();
			} catch (InvocationTargetException e) {
				throwable = e.getCause();
				if (e.getCause() == null) {
					throwable = e;
				}
				e.printStackTrace();
			} catch (InterruptedException e) {
				throwable = e.getCause();
				if (e.getCause() == null) {
					throwable = e;
				}
				e.printStackTrace();
			}
			if (throwable != null) {
				console.wrap();
				console.append(StreamType.FAILURE, "An exception occurred during the interpretation!");
			}
		}
	}

	private ResourceSet getWorkingResourceSet() {
		return getWizard().getWorkingResourceSet();
	}

	@Override
	public InterpreteActivityWizard getWizard() {
		return (InterpreteActivityWizard) super.getWizard();
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayoutFactory.fillDefaults().applyTo(composite);

		viewer = new TextConsoleViewer(composite, console);
		viewer.addTextListener(new ITextListener() {
			@Override
			public void textChanged(TextEvent event) {
				int index = viewer.getDocument().getLength() - 1;
				viewer.setTopIndex(index);
			}
		});
		GridDataFactory.fillDefaults().grab(true, true).applyTo(viewer.getControl());
		viewer.setEditable(false);

		setControl(composite);
	}
}
