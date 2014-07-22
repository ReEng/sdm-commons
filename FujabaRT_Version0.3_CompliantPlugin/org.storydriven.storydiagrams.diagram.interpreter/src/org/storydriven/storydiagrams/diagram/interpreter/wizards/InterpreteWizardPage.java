package org.storydriven.storydiagrams.diagram.interpreter.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.console.TextConsoleViewer;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.interpreter.util.InterpreterConsole;
import org.storydriven.storydiagrams.diagram.interpreter.util.InterpreterConsole.StreamType;
import org.storydriven.storydiagrams.diagram.interpreter.util.InterpreterRunnable;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class InterpreteWizardPage extends WizardPage {
	private InterpreterConsole console;
	private TextConsoleViewer viewer;

	protected InterpreteWizardPage() {
		super(InterpreteWizardPage.class.getName());

		console = new InterpreterConsole();

		setTitle("Interpreting...");
		setDescription("Analyze the notifications of the interpreting activity.");
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);

		if (visible) {
			Activity activity = getWizard().getActivity();
			List<Variable<EClassifier>> parameters = ((SelectInputWizardPage) getPreviousPage()).getParameters();

			getWizard().setResults(null);
			console.clearConsole();
			getWizard().setException(null);

			if (getWizard().getResource() != null) {
				getWizard().getResource().setTrackingModification(true);
			}

			Throwable throwable = null;
			try {
				InterpreterRunnable runnable = new InterpreterRunnable(activity, parameters, console);
				getContainer().run(true, true, runnable);
				getWizard().setResults(runnable.getResults());
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
				getWizard().setException(throwable);
				console.wrap();
				console.append(StreamType.FAILURE, "An exception occurred during the interpretation!");
			}
		}
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
