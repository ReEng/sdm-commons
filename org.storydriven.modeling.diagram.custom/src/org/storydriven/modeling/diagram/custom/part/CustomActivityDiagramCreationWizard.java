package org.storydriven.modeling.diagram.custom.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.diagram.part.SDMDiagramUpdater;
import org.storydriven.modeling.diagram.part.SDMNodeDescriptor;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

import de.fujaba.newwizard.InitialElementAdapter;
import de.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;

/**
 * A CreationWizard for Activity diagrams. It implements the abstract creation
 * wizard from the de.fujaba.newwizard plugin.
 * 
 * @author bingo
 * 
 */
public class CustomActivityDiagramCreationWizard extends FujabaDiagramNewWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewActivitiesWizard.gif")); //$NON-NLS-1$
	}

	@Override
	protected String getDiagramFileExtension() {
		return "sdm_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelId() {
		return org.storydriven.modeling.diagram.edit.parts.ActivityEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getEditorId() {
		return org.storydriven.modeling.diagram.part.SDMDiagramEditor.ID;
	}

	@Override
	protected String getModelElementCategoryKey() {
		return "org.storydriven.modeling.activities";
	}

	@Override
	protected ExtendableElement createDiagramElement() {
		return ActivitiesFactory.eINSTANCE.createActivity();
	}

	protected boolean isModelElementCategoryDiagramElement() {
		return false;
	}

	protected CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram, Collection<EObject> elements) {
		List<SDMNodeDescriptor> childDescriptors = SDMDiagramUpdater
				.getActivity_1000SemanticChildren(diagram);

		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());

		for (SDMNodeDescriptor next : childDescriptors) {
			if (!elements.contains(next.getModelElement())) {
				continue;
			}
			String hint = SDMVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new InitialElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, true,
					getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}
		return new CreateViewRequest(viewDescriptors);
	}

}
