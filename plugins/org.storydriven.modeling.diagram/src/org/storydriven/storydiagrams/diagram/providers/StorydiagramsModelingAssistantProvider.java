package org.storydriven.storydiagrams.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternCompartementEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.part.Messages;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;

/**
 * @generated
 */
public class StorydiagramsModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ActivityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(StorydiagramsElementTypes.StartNode_2001);
			types.add(StorydiagramsElementTypes.StopNode_2002);
			types.add(StorydiagramsElementTypes.JunctionNode_2003);
			types.add(StorydiagramsElementTypes.StatementNode_2004);
			types.add(StorydiagramsElementTypes.StructuredNode_2005);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2006);
			types.add(StorydiagramsElementTypes.ActivityCallNode_2007);
			return types;
		}
		if (editPart instanceof StatementNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.TextualExpression_3001);
			return types;
		}
		if (editPart instanceof StatementNode2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.TextualExpression_3001);
			return types;
		}
		if (editPart instanceof ObjectVariableEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.AttributeAssignment_3010);
			return types;
		}
		if (editPart instanceof StructuredNodeStructuredNodeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(StorydiagramsElementTypes.JunctionNode_3002);
			types.add(StorydiagramsElementTypes.StartNode_3003);
			types.add(StorydiagramsElementTypes.StopNode_3004);
			types.add(StorydiagramsElementTypes.StatementNode_3005);
			types.add(StorydiagramsElementTypes.StructuredNode_3006);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
			return types;
		}
		if (editPart instanceof StructuredNodeStructuredNodeCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(StorydiagramsElementTypes.JunctionNode_3002);
			types.add(StorydiagramsElementTypes.StartNode_3003);
			types.add(StorydiagramsElementTypes.StopNode_3004);
			types.add(StorydiagramsElementTypes.StatementNode_3005);
			types.add(StorydiagramsElementTypes.StructuredNode_3006);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
			return types;
		}
		if (editPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.StoryPattern_3008);
			return types;
		}
		if (editPart instanceof StoryPatternStoryPatternCompartementEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(StorydiagramsElementTypes.ObjectVariable_3009);
			types.add(StorydiagramsElementTypes.PrimitiveVariable_3011);
			return types;
		}
		if (editPart instanceof ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.StoryPattern_3008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PrimitiveVariableEditPart) {
			return ((PrimitiveVariableEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PrimitiveVariableEditPart) {
			return ((PrimitiveVariableEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartNodeEditPart) {
			return ((StartNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StopNodeEditPart) {
			return ((StopNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredNodeEditPart) {
			return ((StructuredNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JunctionNode2EditPart) {
			return ((JunctionNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StartNode2EditPart) {
			return ((StartNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StopNode2EditPart) {
			return ((StopNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatementNode2EditPart) {
			return ((StatementNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredNode2EditPart) {
			return ((StructuredNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModifyingStoryNode2EditPart) {
			return ((ModifyingStoryNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				StorydiagramsDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.StorydiagramsModelingAssistantProviderMessage);
		dialog.setTitle(Messages.StorydiagramsModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
