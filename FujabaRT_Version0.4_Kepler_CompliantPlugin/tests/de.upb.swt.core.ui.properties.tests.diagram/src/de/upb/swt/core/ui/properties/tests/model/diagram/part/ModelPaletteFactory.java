package de.upb.swt.core.ui.properties.tests.model.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.upb.swt.core.ui.properties.tests.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModel1Group());
	}

	/**
	 * Creates "model" palette tool group
	 * @generated
	 */
	private PaletteContainer createModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Model1Group_title);
		paletteContainer.setId("createModel1Group"); //$NON-NLS-1$
		paletteContainer.add(createType1CreationTool());
		paletteContainer.add(createReference2CreationTool());
		paletteContainer.add(createBooleanAttribute3CreationTool());
		paletteContainer.add(createEnumAttribute4CreationTool());
		paletteContainer.add(createIntegerAttribute5CreationTool());
		paletteContainer.add(createDecimalAttribute6CreationTool());
		paletteContainer.add(createStringAttribute7CreationTool());
		paletteContainer.add(createDataTypeAttribute8CreationTool());
		paletteContainer.add(createTypeAttribute9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Type1CreationTool_title, Messages.Type1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Type_2001));
		entry.setId("createType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Type_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReference2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Reference2CreationTool_title,
				Messages.Reference2CreationTool_desc, Collections.singletonList(ModelElementTypes.Reference_4001));
		entry.setId("createReference2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Reference_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBooleanAttribute3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.BooleanAttribute3CreationTool_title,
				Messages.BooleanAttribute3CreationTool_desc,
				Collections.singletonList(ModelElementTypes.BooleanAttribute_3001));
		entry.setId("createBooleanAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.BooleanAttribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.EnumAttribute4CreationTool_title,
				Messages.EnumAttribute4CreationTool_desc, null, null) {
		};
		entry.setId("createEnumAttribute4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIntegerAttribute5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.IntegerAttribute5CreationTool_title,
				Messages.IntegerAttribute5CreationTool_desc, null, null) {
		};
		entry.setId("createIntegerAttribute5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecimalAttribute6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.DecimalAttribute6CreationTool_title,
				Messages.DecimalAttribute6CreationTool_desc, null, null) {
		};
		entry.setId("createDecimalAttribute6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStringAttribute7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.StringAttribute7CreationTool_title,
				Messages.StringAttribute7CreationTool_desc, null, null) {
		};
		entry.setId("createStringAttribute7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataTypeAttribute8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.DataTypeAttribute8CreationTool_title,
				Messages.DataTypeAttribute8CreationTool_desc, null, null) {
		};
		entry.setId("createDataTypeAttribute8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeAttribute9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TypeAttribute9CreationTool_title,
				Messages.TypeAttribute9CreationTool_desc, null, null) {
		};
		entry.setId("createTypeAttribute9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
