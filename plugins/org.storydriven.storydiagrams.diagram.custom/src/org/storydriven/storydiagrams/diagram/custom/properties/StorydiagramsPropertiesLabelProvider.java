package org.storydriven.storydiagrams.diagram.custom.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.patterns.ContainerVariable;
import org.storydriven.storydiagrams.patterns.ContainmentRelation;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectSetVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;

public class StorydiagramsPropertiesLabelProvider extends LabelProvider {
	private AdapterFactoryLabelProvider aflp;

	public StorydiagramsPropertiesLabelProvider() {
		Registry reg = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		AdapterFactory af = new ComposedAdapterFactory(reg);

		aflp = new AdapterFactoryLabelProvider(af);
	}

	@Override
	public void dispose() {
		aflp.dispose();
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) element;
			if (selection.size() == 1) {
				return getText(selection.getFirstElement());
			}
		}
		if (element instanceof EditPart) {
			return getText(((EditPart) element).getModel());
		}
		if (element instanceof View) {
			return getText(((View) element).getElement());
		}

		return aflp.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) element;
			if (selection.size() == 1) {
				return getImage(selection.getFirstElement());
			}
		}
		if (element instanceof EditPart) {
			return getImage(((EditPart) element).getModel());
		}
		if (element instanceof View) {
			return getImage(((View) element).getElement());
		}

		if (element instanceof Activity) {
			return DiagramImages.getImage(DiagramImages.ACTIVITY);
		}
		if (element instanceof ActivityEdge) {
			return DiagramImages.getImage(DiagramImages.ACTIVITY_EDGE);
		}
		if (element instanceof ActivityCallNode) {
			return DiagramImages.getImage(DiagramImages.ACTIVITY_CALL_NODE);
		}
		if (element instanceof ModifyingStoryNode) {
			if (((ModifyingStoryNode) element).isForEach()) {
				return DiagramImages.getImage(DiagramImages.MODIFYING_STORY_NODE__LOOP);
			}
			return DiagramImages.getImage(DiagramImages.MODIFYING_STORY_NODE);
		}
		if (element instanceof MatchingStoryNode) {
			if (((MatchingStoryNode) element).isForEach()) {
				return DiagramImages.getImage(DiagramImages.MATCHING_STORY_NODE__LOOP);
			}
			return DiagramImages.getImage(DiagramImages.MATCHING_STORY_NODE);
		}
		if (element instanceof StatementNode) {
			return DiagramImages.getImage(DiagramImages.STATEMENT_NODE);
		}
		if (element instanceof StructuredNode) {
			return DiagramImages.getImage(DiagramImages.STRUCTURED_NODE);
		}
		if (element instanceof StartNode) {
			return DiagramImages.getImage(DiagramImages.START_NODE);
		}
		if (element instanceof JunctionNode) {
			return DiagramImages.getImage(DiagramImages.JUNCTION_NODE);
		}
		if (element instanceof StopNode) {
			if (((StopNode) element).isFlowStopOnly()) {
				return DiagramImages.getImage(DiagramImages.STOP_NODE__FLOW);
			}
			return DiagramImages.getImage(DiagramImages.STOP_NODE);
		}

		// patterns
		if (element instanceof ObjectVariable) {
			if (element instanceof ObjectSetVariable) {
				return DiagramImages.getImage(DiagramImages.OBJECT_SET_VARIABLE);
			}
			if (element instanceof ContainerVariable) {
				return DiagramImages.getImage(DiagramImages.CONTAINER_VARIABLE);
			}
			return DiagramImages.getImage(DiagramImages.OBJECT_VARIABLE);
		}
		if (element instanceof PrimitiveVariable) {
			return DiagramImages.getImage(DiagramImages.PRIMITIVE_VARIABLE);
		}
		if (element instanceof LinkVariable) {
			return DiagramImages.getImage(DiagramImages.LINK_VARIABLE);
		}
		if (element instanceof Path) {
			return DiagramImages.getImage(DiagramImages.PATH);
		}
		if (element instanceof ContainmentRelation) {
			return DiagramImages.getImage(DiagramImages.CONTAINMENT_RELATION);
		}

		return aflp.getImage(element);
	}
}
