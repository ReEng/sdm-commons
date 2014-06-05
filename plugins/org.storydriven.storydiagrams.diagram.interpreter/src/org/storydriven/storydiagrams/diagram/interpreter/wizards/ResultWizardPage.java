package org.storydriven.storydiagrams.diagram.interpreter.wizards;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
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
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.interpreter.providers.ResultContentProvider;
import org.storydriven.storydiagrams.diagram.interpreter.providers.ResultLabelProvider;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class ResultWizardPage extends WizardPage {
	private Composite resultComposite;
	private Composite exceptionComposite;
	private Composite resourceChangedComposite;

	private TreeViewer resultViewer;
	private Text exceptionText;
	private Button saveResourceButton;

	private ResultLabelProvider labelProvider;

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

			resourceChangedComposite.setVisible(false);
			saveResourceButton.setSelection(false);
			getWizard().setSaveResource(false);

			resultViewer.setInput(null);
			resultComposite.setVisible(false);

			exceptionText.setText(""); //$NON-NLS-1$
			exceptionComposite.setVisible(false);

			Map<String, Variable<EClassifier>> results = getWizard().getResults();
			if (results != null) {
				Variable<EClassifier> result = results.get("resultValue");

				labelProvider.setResult(result);
				resultComposite.setVisible(true);
				resultViewer.setInput(result);

				if (getWizard().getResource() != null) {
					resourceChangedComposite.setVisible(getWizard().getResource().isModified());
					saveResourceButton.setSelection(true);
					getWizard().setSaveResource(true);
				}

				setPageComplete(true);
			}

			Throwable throwable = getWizard().getThrowable();
			if (throwable != null) {
				exceptionComposite.setVisible(true);
				exceptionText.setText(String.valueOf(throwable));
			}
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

		resultComposite = new Composite(composite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(resultComposite);
		GridLayoutFactory.fillDefaults().applyTo(resultComposite);

		Label resultLabel = new Label(resultComposite, SWT.LEAD | SWT.WRAP);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(resultLabel);
		resultLabel.setText("The following represents the result of the interpretation.");

		resultViewer = new TreeViewer(resultComposite, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(resultViewer.getControl());
		resultViewer.setAutoExpandLevel(AbstractTreeViewer.ALL_LEVELS);
		labelProvider = new ResultLabelProvider();
		resultViewer.setLabelProvider(labelProvider);
		resultViewer.setContentProvider(new ResultContentProvider());

		// exceptions
		exceptionComposite = new Composite(composite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(exceptionComposite);
		GridLayoutFactory.fillDefaults().applyTo(exceptionComposite);

		Label exceptionLabel = new Label(exceptionComposite, SWT.LEAD | SWT.WRAP);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(exceptionLabel);
		exceptionLabel.setText("The following exception occurred during the interpretation.");

		exceptionText = new Text(exceptionComposite, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(exceptionText);
		exceptionText.setEditable(false);

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
