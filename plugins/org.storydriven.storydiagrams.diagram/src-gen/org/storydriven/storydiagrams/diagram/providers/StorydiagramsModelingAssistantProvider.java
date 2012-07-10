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
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.FlowFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeStoryNodePatternCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeStoryNodePatternCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.part.Messages;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;

/**
 * @generated
 */
public class StorydiagramsModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ActivityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(StorydiagramsElementTypes.ActivityCallNode_2009);
			types.add(StorydiagramsElementTypes.StatementNode_2010);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2011);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2012);
			types.add(StorydiagramsElementTypes.InitialNode_2013);
			types.add(StorydiagramsElementTypes.JunctionNode_2014);
			types.add(StorydiagramsElementTypes.ActivityFinalNode_2015);
			types.add(StorydiagramsElementTypes.FlowFinalNode_2016);
			return types;
		}
		if (editPart instanceof StoryPatternEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.Constraint_3024);
			return types;
		}
		if (editPart instanceof ObjectVariableEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(StorydiagramsElementTypes.Constraint_3022);
			types.add(StorydiagramsElementTypes.AttributeAssignment_3021);
			return types;
		}
		if (editPart instanceof CollectionVariableEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(StorydiagramsElementTypes.Constraint_3022);
			types.add(StorydiagramsElementTypes.AttributeAssignment_3021);
			return types;
		}
		if (editPart instanceof MatchingPatternEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.Constraint_3024);
			return types;
		}
		if (editPart instanceof ModifyingStoryNodeStoryNodePatternCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.StoryPattern_3019);
			return types;
		}
		if (editPart instanceof StoryPatternStoryPatternContentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(StorydiagramsElementTypes.ObjectVariable_3020);
			types.add(StorydiagramsElementTypes.CollectionVariable_3023);
			return types;
		}
		if (editPart instanceof MatchingStoryNodeStoryNodePatternCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(StorydiagramsElementTypes.MatchingPattern_3025);
			return types;
		}
		if (editPart instanceof MatchingPatternStoryPatternContentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(StorydiagramsElementTypes.ObjectVariable_3020);
			types.add(StorydiagramsElementTypes.CollectionVariable_3023);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MatchingStoryNodeEditPart) {
			return ((MatchingStoryNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CollectionVariableEditPart) {
			return ((CollectionVariableEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			return ((MatchingStoryNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CollectionVariableEditPart) {
			return ((CollectionVariableEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MatchingStoryNodeEditPart) {
			return ((MatchingStoryNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CollectionVariableEditPart) {
			return ((CollectionVariableEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			return ((MatchingStoryNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CollectionVariableEditPart) {
			return ((CollectionVariableEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ActivityCallNodeEditPart) {
			return ((ActivityCallNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StatementNodeEditPart) {
			return ((StatementNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModifyingStoryNodeEditPart) {
			return ((ModifyingStoryNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MatchingStoryNodeEditPart) {
			return ((MatchingStoryNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JunctionNodeEditPart) {
			return ((JunctionNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ObjectVariableEditPart) {
			return ((ObjectVariableEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CollectionVariableEditPart) {
			return ((CollectionVariableEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(StorydiagramsDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
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
