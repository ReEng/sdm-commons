package org.storydriven.modeling.diagram.custom.part;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.fujaba.newwizard.diagrams.AbstractFujabaDiagramNewWizard;

/**
 * A CreationWizard for Activity diagrams. It implements the abstract creation
 * wizard from the de.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomActivityDiagramCreationWizard extends AbstractFujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewActivitiesWizard.gif")); //$NON-NLS-1$
	}

	@Override
	public String getEditorId() {
		return org.storydriven.modeling.diagram.part.SDMDiagramEditor.ID;
	}

}
