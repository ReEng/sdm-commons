package org.storydriven.storydiagrams.ui.interpreter.wizards;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSetSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffResourceSet;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchResourceSet;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.ui.editor.ModelCompareEditorInput;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.storydriven.storydiagrams.ui.interpreter.compare.InterpreterCompareInput;

public class InterpreterWizardResultPage extends WizardPage {
	protected ModelCompareEditorInput editorInput;
	private Composite container;

	protected InterpreterWizardResultPage() {
		super(InterpreterWizardResultPage.class.getCanonicalName());

		setTitle("Results");
		setDescription("description");
		// TODO: image
		setImageDescriptor(null);
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			try {
				// TODO: configure comparison
				Map<String, Object> options = new HashMap<String, Object>();
				options.put(MatchOptions.OPTION_IGNORE_XMI_ID, new Boolean(true));

				ResourceSet rightModel = getWizard().getOriginalResourceSet();
				ResourceSet leftModel = getWizard().getWorkingResourceSet();

				MatchResourceSet matchModel = MatchService.doResourceSetMatch(leftModel, rightModel, options);
				DiffResourceSet diffModel = DiffService.doDiff(matchModel);

				ComparisonResourceSetSnapshot snapshot = DiffFactory.eINSTANCE.createComparisonResourceSetSnapshot();
				snapshot.setMatchResourceSet(matchModel);
				snapshot.setDiffResourceSet(diffModel);

				// create the viewer
				editorInput = new InterpreterCompareInput(snapshot);

				// configure
				editorInput.setTitle("Comparison");

				editorInput.getCompareConfiguration().setLeftLabel("Interpreted");
				editorInput.getCompareConfiguration().setLeftEditable(false);

				editorInput.getCompareConfiguration().setRightLabel("Original");
				editorInput.getCompareConfiguration().setRightEditable(false);

				// do the diff
				getContainer().run(true, false, editorInput);

				Control contents = editorInput.createContents(container);
				GridDataFactory.fillDefaults().grab(true, true).applyTo(contents);
				container.layout();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		super.setVisible(visible);
	}

	@Override
	public InterpreteActivityWizard getWizard() {
		return (InterpreteActivityWizard) super.getWizard();
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(container);
		GridLayoutFactory.fillDefaults().applyTo(container);

		setControl(container);
	}
}
