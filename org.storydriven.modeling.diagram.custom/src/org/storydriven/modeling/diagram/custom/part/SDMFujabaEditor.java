package org.storydriven.modeling.diagram.custom.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin;
import org.storydriven.modeling.diagram.part.SDMDiagramUpdater;
import org.storydriven.modeling.diagram.part.SDMNodeDescriptor;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

import de.fujaba.newwizard.IFujabaEditor;
import de.fujaba.newwizard.InitialElementAdapter;


public class SDMFujabaEditor implements IFujabaEditor {


	@Override
	public ExtendableElement createDiagramElement() {
		return ActivitiesFactory.eINSTANCE.createActivity();
	}

	public CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram, Collection<EObject> elements) {
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
					getPreferencesHint());
			viewDescriptors.add(descriptor);
		}
		return new CreateViewRequest(viewDescriptors);
	}

	@Override
	public boolean isValidDiagramElement(EObject diagramElement) {
		IAdaptable adapter = new EObjectAdapter(diagramElement);
		IOperation operation = new CreateDiagramViewOperation(
				adapter,
				ActivityEditPart.MODEL_ID,
				getPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}


	@Override
	public boolean isValidTopLevelNodeElement(EObject diagramElement,
			EObject topLevelNodeElement) {
		Diagram diagram = ViewService
				.createDiagram(
						diagramElement,
						ActivityEditPart.MODEL_ID,
						getPreferencesHint());
		IAdaptable adapter = new EObjectAdapter(topLevelNodeElement);
		IOperation operation = new CreateNodeViewOperation(adapter, diagram,
				null, 0, false, getPreferencesHint());
		return ViewService.getInstance().provides(operation);
	}

	@Override
	public PreferencesHint getPreferencesHint() {
		return SDMDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

}
