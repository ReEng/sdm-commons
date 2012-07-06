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
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
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
	public static final IElementType ActivityCallNode_2009 = getElementType("org.storydriven.storydiagrams.diagram.ActivityCallNode_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StatementNode_2010 = getElementType("org.storydriven.storydiagrams.diagram.StatementNode_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ModifyingStoryNode_2011 = getElementType("org.storydriven.storydiagrams.diagram.ModifyingStoryNode_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MatchingStoryNode_2012 = getElementType("org.storydriven.storydiagrams.diagram.MatchingStoryNode_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2013 = getElementType("org.storydriven.storydiagrams.diagram.InitialNode_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType JunctionNode_2014 = getElementType("org.storydriven.storydiagrams.diagram.JunctionNode_2014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_2015 = getElementType("org.storydriven.storydiagrams.diagram.ActivityFinalNode_2015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StoryPattern_3019 = getElementType("org.storydriven.storydiagrams.diagram.StoryPattern_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ObjectVariable_3020 = getElementType("org.storydriven.storydiagrams.diagram.ObjectVariable_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AttributeAssignment_3021 = getElementType("org.storydriven.storydiagrams.diagram.AttributeAssignment_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_3022 = getElementType("org.storydriven.storydiagrams.diagram.Constraint_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CollectionVariable_3023 = getElementType("org.storydriven.storydiagrams.diagram.CollectionVariable_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_3024 = getElementType("org.storydriven.storydiagrams.diagram.Constraint_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MatchingPattern_3025 = getElementType("org.storydriven.storydiagrams.diagram.MatchingPattern_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityEdge_4005 = getElementType("org.storydriven.storydiagrams.diagram.ActivityEdge_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LinkVariable_4006 = getElementType("org.storydriven.storydiagrams.diagram.LinkVariable_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InclusionLink_4007 = getElementType("org.storydriven.storydiagrams.diagram.InclusionLink_4007"); //$NON-NLS-1$

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
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return StorydiagramsDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
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

			elements.put(Activity_1000,
					ActivitiesPackage.eINSTANCE.getActivity());

			elements.put(ActivityCallNode_2009,
					ActivitiesPackage.eINSTANCE.getActivityCallNode());

			elements.put(StatementNode_2010,
					ActivitiesPackage.eINSTANCE.getStatementNode());

			elements.put(ModifyingStoryNode_2011,
					ActivitiesPackage.eINSTANCE.getModifyingStoryNode());

			elements.put(MatchingStoryNode_2012,
					ActivitiesPackage.eINSTANCE.getMatchingStoryNode());

			elements.put(InitialNode_2013,
					ActivitiesPackage.eINSTANCE.getInitialNode());

			elements.put(JunctionNode_2014,
					ActivitiesPackage.eINSTANCE.getJunctionNode());

			elements.put(ActivityFinalNode_2015,
					ActivitiesPackage.eINSTANCE.getActivityFinalNode());

			elements.put(StoryPattern_3019,
					PatternsPackage.eINSTANCE.getStoryPattern());

			elements.put(ObjectVariable_3020,
					PatternsPackage.eINSTANCE.getObjectVariable());

			elements.put(AttributeAssignment_3021,
					PatternsPackage.eINSTANCE.getAttributeAssignment());

			elements.put(Constraint_3022,
					PatternsPackage.eINSTANCE.getConstraint());

			elements.put(CollectionVariable_3023,
					PatternsPackage.eINSTANCE.getCollectionVariable());

			elements.put(Constraint_3024,
					PatternsPackage.eINSTANCE.getConstraint());

			elements.put(MatchingPattern_3025,
					PatternsPackage.eINSTANCE.getMatchingPattern());

			elements.put(ActivityEdge_4005,
					ActivitiesPackage.eINSTANCE.getActivityEdge());

			elements.put(LinkVariable_4006,
					PatternsPackage.eINSTANCE.getLinkVariable());

			elements.put(InclusionLink_4007,
					PatternsPackage.eINSTANCE.getInclusionLink());
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
			KNOWN_ELEMENT_TYPES.add(ActivityCallNode_2009);
			KNOWN_ELEMENT_TYPES.add(StatementNode_2010);
			KNOWN_ELEMENT_TYPES.add(ModifyingStoryNode_2011);
			KNOWN_ELEMENT_TYPES.add(MatchingStoryNode_2012);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2013);
			KNOWN_ELEMENT_TYPES.add(JunctionNode_2014);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_2015);
			KNOWN_ELEMENT_TYPES.add(StoryPattern_3019);
			KNOWN_ELEMENT_TYPES.add(ObjectVariable_3020);
			KNOWN_ELEMENT_TYPES.add(AttributeAssignment_3021);
			KNOWN_ELEMENT_TYPES.add(Constraint_3022);
			KNOWN_ELEMENT_TYPES.add(CollectionVariable_3023);
			KNOWN_ELEMENT_TYPES.add(Constraint_3024);
			KNOWN_ELEMENT_TYPES.add(MatchingPattern_3025);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4005);
			KNOWN_ELEMENT_TYPES.add(LinkVariable_4006);
			KNOWN_ELEMENT_TYPES.add(InclusionLink_4007);
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
			return ActivityCallNode_2009;
		case StatementNodeEditPart.VISUAL_ID:
			return StatementNode_2010;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return ModifyingStoryNode_2011;
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return MatchingStoryNode_2012;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2013;
		case JunctionNodeEditPart.VISUAL_ID:
			return JunctionNode_2014;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNode_2015;
		case StoryPatternEditPart.VISUAL_ID:
			return StoryPattern_3019;
		case ObjectVariableEditPart.VISUAL_ID:
			return ObjectVariable_3020;
		case AttributeAssignmentEditPart.VISUAL_ID:
			return AttributeAssignment_3021;
		case ConstraintEditPart.VISUAL_ID:
			return Constraint_3022;
		case CollectionVariableEditPart.VISUAL_ID:
			return CollectionVariable_3023;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint_3024;
		case MatchingPatternEditPart.VISUAL_ID:
			return MatchingPattern_3025;
		case ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4005;
		case LinkVariableEditPart.VISUAL_ID:
			return LinkVariable_4006;
		case InclusionLinkEditPart.VISUAL_ID:
			return InclusionLink_4007;
		}
		return null;
	}

}
