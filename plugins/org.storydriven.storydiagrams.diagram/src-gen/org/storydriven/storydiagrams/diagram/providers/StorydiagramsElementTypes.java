package org.storydriven.storydiagrams.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.FlowFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MaybeLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * @generated
 */
public class StorydiagramsElementTypes {

	/**
	 * @generated
	 */
	private StorydiagramsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Activity_1000 = getElementType("org.storydriven.storydiagrams.diagram.Activity_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityCallNode_2001 = getElementType("org.storydriven.storydiagrams.diagram.ActivityCallNode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StatementNode_2002 = getElementType("org.storydriven.storydiagrams.diagram.StatementNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModifyingStoryNode_2003 = getElementType("org.storydriven.storydiagrams.diagram.ModifyingStoryNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchingStoryNode_2004 = getElementType("org.storydriven.storydiagrams.diagram.MatchingStoryNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2005 = getElementType("org.storydriven.storydiagrams.diagram.InitialNode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_2006 = getElementType("org.storydriven.storydiagrams.diagram.JunctionNode_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FlowFinalNode_2007 = getElementType("org.storydriven.storydiagrams.diagram.FlowFinalNode_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_2008 = getElementType("org.storydriven.storydiagrams.diagram.ActivityFinalNode_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StoryPattern_3001 = getElementType("org.storydriven.storydiagrams.diagram.StoryPattern_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CollectionVariable_3002 = getElementType("org.storydriven.storydiagrams.diagram.CollectionVariable_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeAssignment_3003 = getElementType("org.storydriven.storydiagrams.diagram.AttributeAssignment_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_3004 = getElementType("org.storydriven.storydiagrams.diagram.Constraint_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectVariable_3005 = getElementType("org.storydriven.storydiagrams.diagram.ObjectVariable_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_3006 = getElementType("org.storydriven.storydiagrams.diagram.Constraint_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchingPattern_3007 = getElementType("org.storydriven.storydiagrams.diagram.MatchingPattern_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4001 = getElementType("org.storydriven.storydiagrams.diagram.ActivityEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkVariable_4002 = getElementType("org.storydriven.storydiagrams.diagram.LinkVariable_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InclusionLink_4003 = getElementType("org.storydriven.storydiagrams.diagram.InclusionLink_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MaybeLink_4004 = getElementType("org.storydriven.storydiagrams.diagram.MaybeLink_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return StorydiagramsDiagramEditorPlugin.getInstance().getItemImageDescriptor(
						eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Activity_1000, ActivitiesPackage.eINSTANCE.getActivity());

			elements.put(ActivityCallNode_2001, ActivitiesPackage.eINSTANCE.getActivityCallNode());

			elements.put(StatementNode_2002, ActivitiesPackage.eINSTANCE.getStatementNode());

			elements.put(ModifyingStoryNode_2003, ActivitiesPackage.eINSTANCE.getModifyingStoryNode());

			elements.put(MatchingStoryNode_2004, ActivitiesPackage.eINSTANCE.getMatchingStoryNode());

			elements.put(InitialNode_2005, ActivitiesPackage.eINSTANCE.getInitialNode());

			elements.put(JunctionNode_2006, ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(FlowFinalNode_2007, ActivitiesPackage.eINSTANCE.getFlowFinalNode());

			elements.put(ActivityFinalNode_2008, ActivitiesPackage.eINSTANCE.getActivityFinalNode());

			elements.put(StoryPattern_3001, PatternsPackage.eINSTANCE.getStoryPattern());

			elements.put(CollectionVariable_3002, PatternsPackage.eINSTANCE.getCollectionVariable());

			elements.put(AttributeAssignment_3003, PatternsPackage.eINSTANCE.getAttributeAssignment());

			elements.put(Constraint_3004, PatternsPackage.eINSTANCE.getConstraint());

			elements.put(ObjectVariable_3005, PatternsPackage.eINSTANCE.getObjectVariable());

			elements.put(Constraint_3006, PatternsPackage.eINSTANCE.getConstraint());

			elements.put(MatchingPattern_3007, PatternsPackage.eINSTANCE.getMatchingPattern());

			elements.put(ActivityEdge_4001, ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(LinkVariable_4002, PatternsPackage.eINSTANCE.getLinkVariable());

			elements.put(InclusionLink_4003, PatternsPackage.eINSTANCE.getInclusionLink());

			elements.put(MaybeLink_4004, PatternsPackage.eINSTANCE.getMaybeLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Activity_1000);
			KNOWN_ELEMENT_TYPES.add(ActivityCallNode_2001);
			KNOWN_ELEMENT_TYPES.add(StatementNode_2002);
			KNOWN_ELEMENT_TYPES.add(ModifyingStoryNode_2003);
			KNOWN_ELEMENT_TYPES.add(MatchingStoryNode_2004);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2005);
			KNOWN_ELEMENT_TYPES.add(JunctionNode_2006);
			KNOWN_ELEMENT_TYPES.add(FlowFinalNode_2007);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_2008);
			KNOWN_ELEMENT_TYPES.add(StoryPattern_3001);
			KNOWN_ELEMENT_TYPES.add(CollectionVariable_3002);
			KNOWN_ELEMENT_TYPES.add(AttributeAssignment_3003);
			KNOWN_ELEMENT_TYPES.add(Constraint_3004);
			KNOWN_ELEMENT_TYPES.add(ObjectVariable_3005);
			KNOWN_ELEMENT_TYPES.add(Constraint_3006);
			KNOWN_ELEMENT_TYPES.add(MatchingPattern_3007);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(LinkVariable_4002);
			KNOWN_ELEMENT_TYPES.add(InclusionLink_4003);
			KNOWN_ELEMENT_TYPES.add(MaybeLink_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
			return Activity_1000;
		case ActivityCallNodeEditPart.VISUAL_ID:
			return ActivityCallNode_2001;
		case StatementNodeEditPart.VISUAL_ID:
			return StatementNode_2002;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return ModifyingStoryNode_2003;
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return MatchingStoryNode_2004;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2005;
		case JunctionNodeEditPart.VISUAL_ID:
			return JunctionNode_2006;
		case FlowFinalNodeEditPart.VISUAL_ID:
			return FlowFinalNode_2007;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNode_2008;
		case StoryPatternEditPart.VISUAL_ID:
			return StoryPattern_3001;
		case CollectionVariableEditPart.VISUAL_ID:
			return CollectionVariable_3002;
		case AttributeAssignmentEditPart.VISUAL_ID:
			return AttributeAssignment_3003;
		case ConstraintEditPart.VISUAL_ID:
			return Constraint_3004;
		case ObjectVariableEditPart.VISUAL_ID:
			return ObjectVariable_3005;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint_3006;
		case MatchingPatternEditPart.VISUAL_ID:
			return MatchingPattern_3007;
		case ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4001;
		case LinkVariableEditPart.VISUAL_ID:
			return LinkVariable_4002;
		case InclusionLinkEditPart.VISUAL_ID:
			return InclusionLink_4003;
		case MaybeLinkEditPart.VISUAL_ID:
			return MaybeLink_4004;
		}
		return null;
	}

}
