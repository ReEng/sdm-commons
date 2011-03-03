package org.storydriven.modeling.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeNameEditPart;
import org.storydriven.modeling.diagram.parsers.MessageFormatParser;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

/**
 * @generated
 */
public class SDMParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser statementNodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStatementNodeName_5001Parser() {
		if (statementNodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			statementNodeName_5001Parser = parser;
		}
		return statementNodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredNodeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredNodeName_5004Parser() {
		if (structuredNodeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			structuredNodeName_5004Parser = parser;
		}
		return structuredNodeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchingStoryNodeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getMatchingStoryNodeName_5006Parser() {
		if (matchingStoryNodeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			matchingStoryNodeName_5006Parser = parser;
		}
		return matchingStoryNodeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser modifyingStoryNodeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getModifyingStoryNodeName_5007Parser() {
		if (modifyingStoryNodeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			modifyingStoryNodeName_5007Parser = parser;
		}
		return modifyingStoryNodeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser statementNodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getStatementNodeName_5002Parser() {
		if (statementNodeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			statementNodeName_5002Parser = parser;
		}
		return statementNodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredNodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredNodeName_5003Parser() {
		if (structuredNodeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			structuredNodeName_5003Parser = parser;
		}
		return structuredNodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectVariableName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getObjectVariableName_5005Parser() {
		if (objectVariableName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectVariableName_5005Parser = parser;
		}
		return objectVariableName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StatementNodeNameEditPart.VISUAL_ID:
			return getStatementNodeName_5001Parser();
		case StructuredNodeNameEditPart.VISUAL_ID:
			return getStructuredNodeName_5004Parser();
		case MatchingStoryNodeNameEditPart.VISUAL_ID:
			return getMatchingStoryNodeName_5006Parser();
		case ModifyingStoryNodeNameEditPart.VISUAL_ID:
			return getModifyingStoryNodeName_5007Parser();
		case StatementNodeName2EditPart.VISUAL_ID:
			return getStatementNodeName_5002Parser();
		case StructuredNodeName2EditPart.VISUAL_ID:
			return getStructuredNodeName_5003Parser();
		case ObjectVariableNameEditPart.VISUAL_ID:
			return getObjectVariableName_5005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SDMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SDMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SDMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
