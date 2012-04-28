package org.storydriven.storydiagrams.diagram.custom;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public final class DiagramImages {
	// controls
	public static final String CONTROL_ADD = "icons/controls/add.png"; //$NON-NLS-1$
	public static final String CONTROL_REMOVE = "icons/controls/remove.png"; //$NON-NLS-1$
	public static final String CONTROL_CONFIGURE = "icons/controls/configure.png"; //$NON-NLS-1$
	public static final String CONTROL_SHORTCUT = "icons/controls/shortcut.png"; //$NON-NLS-1$
	public static final String CONTROL_UP = "icons/controls/up.png"; //$NON-NLS-1$
	public static final String CONTROL_DOWN = "icons/controls/down.png"; //$NON-NLS-1$
	public static final String CONTROL_SEARCH = "icons/controls/search.png"; //$NON-NLS-1$
	public static final String CONTROL_WARNING = "icons/controls/warning.png"; //$NON-NLS-1$

	// ecore package
	public static final String EANNOTATION = "icons/elements/ecore/EAnnotation.png"; //$NON-NLS-1$
	public static final String EATTRIBUTE = "icons/elements/ecore/EAttribute.png"; //$NON-NLS-1$
	public static final String ECLASS = "icons/elements/ecore/EClass.png"; //$NON-NLS-1$
	public static final String EDATA_TYPE = "icons/elements/ecore/EDataType.png"; //$NON-NLS-1$
	public static final String EENUM = "icons/elements/ecore/EEnum.png"; //$NON-NLS-1$
	public static final String EENUM_LITERAL = "icons/elements/ecore/EEnumLiteral.png"; //$NON-NLS-1$
	public static final String EFACTORY = "icons/elements/ecore/EFactory.png"; //$NON-NLS-1$
	public static final String EOPERATION = "icons/elements/ecore/EOperation.png"; //$NON-NLS-1$
	public static final String EPACKAGE = "icons/elements/ecore/EPackage.png"; //$NON-NLS-1$
	public static final String EPACKAGE_LINKED = "icons/elements/ecore/EPackage_linked.png"; //$NON-NLS-1$
	public static final String EPACKAGE_PLUGIN = "icons/elements/ecore/EPackage_plugin.png"; //$NON-NLS-1$
	public static final String EPACKAGE_WORKSPACE = "icons/elements/ecore/EPackage_workspace.png"; //$NON-NLS-1$
	public static final String EPARAMETER_IN = "icons/elements/ecore/EParameter_in.png"; //$NON-NLS-1$
	public static final String EPARAMETER_IN_REF = "icons/elements/ecore/EParameter_in_referenced.png"; //$NON-NLS-1$
	public static final String EPARAMETER_OUT = "icons/elements/ecore/EParameter_out.png"; //$NON-NLS-1$
	public static final String EPARAMETER_OUT_REF = "icons/elements/ecore/EParameter_out_referenced.png"; //$NON-NLS-1$
	public static final String EREFERENCE = "icons/elements/ecore/EReference.png"; //$NON-NLS-1$
	public static final String ESTRING_TO_STRING_MAP_ENTRY = "icons/elements/ecore/EStringToStringMapEntry.png"; //$NON-NLS-1$

	// activities package
	public static final String ACTIVITY = "icons/elements/activities/Activity.png"; //$NON-NLS-1$
	public static final String ACTIVITY_CALL_NODE = "icons/elements/activities/ActivityCallNode.png"; //$NON-NLS-1$
	public static final String ACTIVITY_EDGE = "icons/elements/activities/ActivityEdge.png"; //$NON-NLS-1$
	public static final String EXCEPTION_VARIABLE = "icons/elements/activities/ExceptionVariable.png"; //$NON-NLS-1$
	public static final String JUNCTION_NODE = "icons/elements/activities/JunctionNode.png"; //$NON-NLS-1$
	public static final String JUNCTION_NODE__DECISION = "icons/elements/activities/JunctionNode_decision.png"; //$NON-NLS-1$
	public static final String JUNCTION_NODE__MERGE = "icons/elements/activities/JunctionNode_merge.png"; //$NON-NLS-1$
	public static final String MATCHING_STORY_NODE = "icons/elements/activities/MatchingStoryNode.png"; //$NON-NLS-1$
	public static final String MATCHING_STORY_NODE__LOOP = "icons/elements/activities/MatchingStoryNode_loop.png"; //$NON-NLS-1$
	public static final String MODIFYING_STORY_NODE = "icons/elements/activities/ModifyingStoryNode.png"; //$NON-NLS-1$
	public static final String MODIFYING_STORY_NODE__LOOP = "icons/elements/activities/ModifyingStoryNode_loop.png"; //$NON-NLS-1$
	public static final String OPERATION_EXTENSION = "icons/elements/activities/OperationExtension.png"; //$NON-NLS-1$
	public static final String START_NODE = "icons/elements/activities/StartNode.png"; //$NON-NLS-1$
	public static final String STATEMENT_NODE = "icons/elements/activities/StatementNode.png"; //$NON-NLS-1$
	public static final String STOP_NODE = "icons/elements/activities/StopNode.png"; //$NON-NLS-1$
	public static final String STOP_NODE__FLOW = "icons/elements/activities/StopNode_flow.png"; //$NON-NLS-1$
	public static final String STRUCTURED_NODE = "icons/elements/activities/StructuredNode.png"; //$NON-NLS-1$

	// patterns package
	public static final String ATTRIBUTE_ASSIGNMENT = "icons/elements/patterns/AttributeAssignment.png"; //$NON-NLS-1$
	public static final String CONSTRAINT = "icons/elements/patterns/Constraint.png"; //$NON-NLS-1$
	public static final String CONTAINER_VARIABLE = "icons/elements/patterns/ContainerVariable.png"; //$NON-NLS-1$
	public static final String CONTAINMENT_RELATION = "icons/elements/patterns/ContainmentRelation.png"; //$NON-NLS-1$
	public static final String LINK_CONSTRAINT = "icons/elements/patterns/LinkConstraint.png"; //$NON-NLS-1$
	public static final String LINK_VARIABLE = "icons/elements/patterns/LinkVariable.png"; //$NON-NLS-1$
	public static final String MATCHING_PATTERN = "icons/elements/patterns/MatchingPattern.png"; //$NON-NLS-1$
	public static final String OBJECT_SET_VARIABLE = "icons/elements/patterns/ObjectSetVariable.png"; //$NON-NLS-1$
	public static final String OBJECT_VARIABLE = "icons/elements/patterns/ObjectVariable.png"; //$NON-NLS-1$
	public static final String PATH = "icons/elements/patterns/Path.png"; //$NON-NLS-1$
	public static final String PRIMITIVE_VARIABLE = "icons/elements/patterns/PrimitiveVariable.png"; //$NON-NLS-1$

	// banners
	public static final String BANNER_ADD_EPACKAGE_URI = "icons/banners/add_epackage_uri.png"; //$NON-NLS-1$
	public static final String BANNER_ADD_EPACKAGE_WORKSPACE = "icons/banners/add_epackage_workspace.png"; //$NON-NLS-1$
	public static final String BANNER_CONFIGURE_PARAMETER_IN = "icons/banners/configure_in_parameter.png"; //$NON-NLS-1$
	public static final String BANNER_CONFIGURE_PARAMETER_OUT = "icons/banners/configure_out_parameter.png"; //$NON-NLS-1$
	public static final String BANNER_LOAD_RESOURCE = "icons/banners/load_resource_workspace.png"; //$NON-NLS-1$
	public static final String BANNER_SELECT_ECLASS = "icons/banners/select_eclass.png"; //$NON-NLS-1$
	public static final String BANNER_SELECT_EDATATYPE = "icons/banners/select_edatatype.png"; //$NON-NLS-1$
	public static final String BANNER_SELECT_PRECONDITION = "icons/banners/select_precondition.png"; //$NON-NLS-1$

	public static Image getImage(String key) {
		return Activator.getInstance().getImage(key);
	}

	public static ImageDescriptor getImageDescriptor(String key) {
		return Activator.getInstance().getImageDescriptor(key);
	}
}
