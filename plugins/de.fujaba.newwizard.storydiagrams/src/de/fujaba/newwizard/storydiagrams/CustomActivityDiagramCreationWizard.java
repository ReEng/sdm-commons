package de.fujaba.newwizard.storydiagrams;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditor;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;

import de.fujaba.newwizard.diagrams.AbstractFujabaDiagramNewWizard;

/**
 * A CreationWizard for Activity diagrams. It implements the abstract creation
 * wizard from the de.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomActivityDiagramCreationWizard extends AbstractFujabaDiagramNewWizard {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(StorydiagramsDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewActivitiesWizard.gif")); //$NON-NLS-1$
	}

	@Override
	public String getEditorId() {
		return StorydiagramsDiagramEditor.ID;
	}

	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return StorydiagramsDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory();
	}

}
