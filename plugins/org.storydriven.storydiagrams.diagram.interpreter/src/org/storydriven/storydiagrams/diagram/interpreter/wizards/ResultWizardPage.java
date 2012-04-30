package org.storydriven.storydiagrams.diagram.interpreter.wizards;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.interpreter.providers.ResultContentProvider;
import org.storydriven.storydiagrams.diagram.interpreter.providers.ResultLabelProvider;

import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ResultWizardPage extends WizardPage {
	private Composite resourceChangedComposite;
	private TreeViewer resultViewer;
	private Button saveResourceButton;

	protected ResultWizardPage() {
		super(ResultWizardPage.class.getName());

		setTitle("Interpreter Results");
		setDescription("The activity has been interpreted.");
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);

		if (visible) {
			setPageComplete(false);

			Map<String, Variable<EClassifier>> results = getWizard().getResults();
			Variable<EClassifier> result = results.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME);

			if (result.getValue() instanceof EObject) {
				((ResultLabelProvider) resultViewer.getLabelProvider()).setObject((EObject) result.getValue());
				resultViewer.setInput(result.getValue());
			}
			resourceChangedComposite.setVisible(getWizard().getResource().isModified());

			setPageComplete(true);
		}
	}

	@Override
	public InterpreteActivityWizard getWizard() {
		return (InterpreteActivityWizard) super.getWizard();
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(composite);

		// results
		Label resultLabel = new Label(composite, SWT.LEAD | SWT.WRAP);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(resultLabel);
		resultLabel.setText("The following represents the result of the interpretation.");

		resultViewer = new TreeViewer(composite, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(resultViewer.getControl());
		resultViewer.setAutoExpandLevel(AbstractTreeViewer.ALL_LEVELS);
		resultViewer.setLabelProvider(new ResultLabelProvider());
		resultViewer.setContentProvider(new ResultContentProvider());

		// resource changed
		resourceChangedComposite = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(resourceChangedComposite);

		Label resourceChangedImageLabel = new Label(resourceChangedComposite, SWT.LEAD);
		GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BEGINNING).applyTo(resourceChangedImageLabel);
		resourceChangedImageLabel.setImage(DiagramImages.getImage(DiagramImages.CONTROL_WARNING));

		Label resourceChangedLabel = new Label(resourceChangedComposite, SWT.LEAD);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(resourceChangedLabel);
		resourceChangedLabel.setText("The host graph resource has been modified during the interpretation.");

		saveResourceButton = new Button(resourceChangedComposite, SWT.CHECK);
		GridDataFactory.fillDefaults().span(2, 1).applyTo(saveResourceButton);
		saveResourceButton.setSelection(true);
		saveResourceButton.setText("Save the changed resource");

		saveResourceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getWizard().setSaveResource(saveResourceButton.getSelection());
			}
		});

		setPageComplete(false);
		setControl(composite);
	}
}
